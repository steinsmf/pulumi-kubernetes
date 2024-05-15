// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v2

import (
	"context"
	"fmt"
	"io"
	"net/http"
	"net/url"
	"os"
	"path/filepath"
	"regexp"
	"sort"
	"strings"

	"github.com/pulumi/pulumi-kubernetes/provider/v4/pkg/clients"
	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes"
	yamlv2 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/yaml/v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"k8s.io/apimachinery/pkg/apis/meta/v1/unstructured"
	"k8s.io/apimachinery/pkg/util/yaml"
	cliutilsobject "sigs.k8s.io/cli-utils/pkg/object"
	cliutilsgraph "sigs.k8s.io/cli-utils/pkg/object/graph"
)

type ParseOptions struct {
	Files []string
	Glob  bool
	YAML  string
}

// Parse parses a set of Kubernetes manifests into Unstructured objects.
// Returns an array of Unstructured objects.
func Parse(ctx context.Context, opts ParseOptions) ([]unstructured.Unstructured, error) {
	var objs []unstructured.Unstructured

	// Load the manifest files.
	yamls := []string{}
	for _, file := range opts.Files {
		// Read the raw YAML file(s) specified in the input file parameter. It might be a URL or a file path.
		var yaml []byte
		u, err := url.Parse(file)
		if err == nil && u.IsAbs() {
			// If the string looks like a URL, in that it begins with a scheme, fetch it over the network.
			resp, err := http.Get(file)
			if err != nil {
				return nil, fmt.Errorf("fetching YAML over network: %w", err)
			}
			defer resp.Body.Close()
			yaml, err = io.ReadAll(resp.Body)
			if err != nil {
				return nil, fmt.Errorf("reading YAML over network: %w", err)
			}
			yamls = append(yamls, string(yaml))
		} else {
			// Otherwise, assume this is a path to a file on disk. If globbing is enabled and a pattern is provided, we might have
			// multiple files -- otherwise just read a singular file and fail if it doesn't exist.
			var files []string
			if opts.Glob && isGlobPattern(file) {
				files, err = filepath.Glob(file)
				if err != nil {
					return nil, fmt.Errorf("expanding glob: %w", err)
				}
				sort.Strings(files)
			} else {
				files = []string{file}
			}
			for _, f := range files {
				yaml, err = os.ReadFile(f)
				if err != nil {
					return nil, fmt.Errorf("reading YAML file from disk: %w", err)
				}
				yamls = append(yamls, string(yaml))
			}
		}
	}

	// Include the manifest string literals.
	yamls = append(yamls, opts.YAML)

	for _, yaml := range yamls {
		// Parse the resulting YAML bytes and turn them into raw Kubernetes objects.
		dec, err := yamlDecode(yaml)
		if err != nil {
			return nil, fmt.Errorf("decoding YAML: %w", err)
		}
		objs = append(objs, dec...)
	}

	return objs, nil
}

// yamlDecode decodes a YAML string into a slice of Unstructured objects.
func yamlDecode(text string) ([]unstructured.Unstructured, error) {
	var resources []unstructured.Unstructured

	dec := yaml.NewYAMLOrJSONDecoder(io.NopCloser(strings.NewReader(text)), 128)
	for {
		var value map[string]any
		if err := dec.Decode(&value); err != nil {
			if err == io.EOF {
				break
			}
			return nil, err
		}
		resource := unstructured.Unstructured{Object: value}

		// Sometimes manifests include empty blocks, so skip these.
		if len(value) == 0 {
			continue
		}
		resources = append(resources, resource)
	}

	return resources, nil
}

// Normalize performs the followng operations on the input objects:
// - canonicalize the kind (core/v1 -> v1)
// - expands any list types into their individual resources
// - applies the default namespace to namespaced resources that do not have a namespace
func Normalize(objs []unstructured.Unstructured, defaultNamespace string, clientSet *clients.DynamicClientSet) ([]unstructured.Unstructured, error) {
	contract.Requiref(clientSet != nil, "clientSet", "expected != nil")

	var err error
	objs, err = expand(objs)
	if err != nil {
		return nil, err
	}

	for _, obj := range objs {
		gvk := obj.GroupVersionKind()

		// Ensure there is a kind and API version.
		if gvk.Kind == "" || gvk.GroupVersion().Empty() {
			return nil, fmt.Errorf("Kubernetes resources require a kind and apiVersion: `%s`", printUnstructured(&obj))
		}

		// Validate that it has the requisite metadata and name properties.
		if obj.GetName() == "" {
			return nil, fmt.Errorf("Kubernetes resources require a .metadata.name: `%s`", printUnstructured(&obj))
		}

		// canonicalize the "core" group for the sake of a depends-on annotation that might reference this object.
		if gvk.Group == "core" {
			gvk.Group = ""
			obj.SetGroupVersionKind(gvk)
		}

		// determine whether the kind is namespaced, which may involve a call to the API server.
		// note that the object list is searched for a matching CRD before resorting to a discovery call.
		isNamespaced, err := clients.IsNamespacedKind(gvk, clientSet, objs...)
		if err != nil {
			return nil, err
		}
		if isNamespaced && obj.GetNamespace() == "" {
			obj.SetNamespace(defaultNamespace)
		}
	}
	return objs, nil
}

func expand(objs []unstructured.Unstructured) ([]unstructured.Unstructured, error) {
	result := make([]unstructured.Unstructured, 0, len(objs))
	for {
		if len(objs) == 0 {
			break
		}
		var obj unstructured.Unstructured
		obj, objs = objs[0], objs[1:]

		// Recursively traverse built-in Kubernetes list types into a single set of "naked" resource
		// definitions that we can register with the Pulumi engine.
		//
		// Kubernetes does not instantiate list types like `v1.List`. When the API server receives
		// a list, it will recursively traverse it and perform the necessary operations on
		// each "instantiable" resource it finds. For example, `kubectl apply` on a
		// `v1.ConfigMapList` will cause the API server to traverse the list, and `apply` each
		// `v1.ConfigMap` it finds.
		//
		// Since Kubernetes does not instantiate list types directly, Pulumi also traverses lists
		// for resource definitions that can be managed by Kubernetes, and registers those with the
		// engine instead.
		if obj.IsList() {
			list, err := obj.ToList()
			if err != nil {
				return nil, fmt.Errorf("YAML object is invalid: `%s`: %w", printUnstructured(&obj), err)
			}
			objs = append(list.Items, objs...)
			continue
		}

		result = append(result, obj)
	}
	return result, nil
}

type PreRegisterFunc func(ctx *pulumi.Context, apiVersion, kind, resourceName string, obj *unstructured.Unstructured,
	resourceOpts []pulumi.ResourceOption) (*unstructured.Unstructured, []pulumi.ResourceOption)

type RegisterOptions struct {
	Objects         []unstructured.Unstructured
	ResourcePrefix  string
	SkipAwait       bool
	ResourceOptions []pulumi.ResourceOption
	PreRegisterF    PreRegisterFunc
}

// Register registers the given Kubernetes objects as resources with the Pulumi engine.
// Returns an array of the resources that were registered.
func Register(ctx *pulumi.Context, opts RegisterOptions) (pulumi.ArrayOutput, error) {
	objs := make(cliutilsobject.UnstructuredSet, 0, len(opts.Objects))
	for _, obj := range opts.Objects {
		obj := obj
		objs = append(objs, &obj)
	}

	// sort the objects using heuristics about Kubernetes object kinds and their dependencies.
	g, err := cliutilsgraph.DependencyGraph(objs)
	if err != nil {
		return pulumi.ArrayOutput{}, err
	}

	// process the resources in topological order, meaning that we first process the resources that have no dependencies,
	// then process the resources that depend on those, and so on.
	sorted, err := g.Sort()
	if err != nil {
		return pulumi.ArrayOutput{}, err
	}
	subsets := cliutilsgraph.HydrateSetList(sorted, objs)

	resources := pulumi.Array{}
	objToResource := map[cliutilsobject.ObjMetadata]pulumi.Resource{}
	for _, subset := range subsets {
		for _, obj := range subset {
			var resourceOptions []pulumi.ResourceOption
			resourceOptions = append(resourceOptions, opts.ResourceOptions...)

			// Depend on the explicit dependencies.
			// The subsets are ordered such that the dependency is guaranteed to be registered before the dependent.
			dependsOn := []pulumi.Resource{}
			dependents := g.Dependencies(cliutilsobject.UnstructuredToObjMetadata(obj))
			for _, dep := range dependents {
				if r, ok := objToResource[dep]; ok {
					dependsOn = append(dependsOn, r)
				}
			}
			if len(dependsOn) > 0 {
				resourceOptions = append(resourceOptions, pulumi.DependsOn(dependsOn))
			}

			// Register the resource with the Pulumi engine.
			// Note that the RPC call is made asynchronously, and is awaited by the resource output.
			r, err := register(ctx, obj, opts, resourceOptions)
			if err != nil {
				return pulumi.ArrayOutput{}, err
			}
			resources = append(resources, pulumi.NewResourceOutput(r))
			objToResource[cliutilsobject.UnstructuredToObjMetadata(obj)] = r
		}
	}
	return resources.ToArrayOutputWithContext(ctx.Context()), nil
}

func register(
	ctx *pulumi.Context,
	obj *unstructured.Unstructured,
	opts RegisterOptions,
	resourceOpts []pulumi.ResourceOption,
) (pulumi.CustomResource, error) {

	contract.Requiref(obj != nil, "obj", "expected != nil")

	kind := obj.GetKind()
	apiVersion := obj.GetAPIVersion()
	contract.Requiref(kind != "" && apiVersion != "", "obj", "expected .kind and .apiVersion")
	fullKind := fmt.Sprintf("%s/%s", apiVersion, kind)

	// Manufacture a resource name as appropriate, out of the meta name, namespace, and optional prefix.
	contract.Requiref(obj.GetName() != "", "obj", "expected .metadata.name")
	resourceName := obj.GetName()
	if obj.GetNamespace() != "" {
		resourceName = fmt.Sprintf("%s/%s", obj.GetNamespace(), obj.GetName())
	}
	if opts.ResourcePrefix != "" {
		resourceName = fmt.Sprintf("%s:%s", opts.ResourcePrefix, resourceName)
	}

	// Apply the skipAwait annotation if necessary.
	if opts.SkipAwait {
		if err := unstructured.SetNestedField(obj.Object, "true", "metadata", "annotations", "pulumi.com/skipAwait"); err != nil {
			return nil, fmt.Errorf("YAML object is invalid: `%s`: %w", printUnstructured(obj), err)
		}
	}

	if opts.PreRegisterF != nil {
		obj, resourceOpts = opts.PreRegisterF(ctx, apiVersion, kind, resourceName, obj, resourceOpts)
	}

	// At this point, the object is a pure unstructured object (no inputs or outputs within it).
	// Now it becomes an input to ctx.RegisterResource.

	if fullKind == "v1/Secret" {
		// Always mark these fields as secret to avoid leaking sensitive values from raw YAML.
		for _, key := range []string{"data", "stringData"} {
			if v, ok := obj.Object[key]; ok {
				obj.Object[key] = pulumi.ToSecret(v)
			}
		}
	}

	// Finally allocate a resource of the correct type.
	res, err := yamlv2.RegisterResource(ctx, apiVersion, kind, resourceName, kubernetes.UntypedArgs(obj.Object), resourceOpts...)
	if err != nil {
		return nil, err
	}
	return res, nil
}

func printUnstructured(obj *unstructured.Unstructured) string {
	truncate := func(s string, maxLen int) string {
		runes := []rune(s)
		if len(runes) <= maxLen {
			return s
		}
		return string(runes[0:maxLen-3]) + "..."
	}

	bytes, _ := obj.MarshalJSON()
	return truncate(strings.TrimSpace(string(bytes)), 100)
}

// globPatternRegexp is a regular expression that matches any of the special characters in a glob pattern.
// see: https://pkg.go.dev/path/filepath#Match
var globPatternRegexp = regexp.MustCompile(`(?:^|[^\\])[*?\[]`)

func isGlobPattern(pattern string) bool {
	return globPatternRegexp.Match([]byte(pattern))
}
