// Copyright 2016-2022, Pulumi Corporation.
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

package yaml

import (
	"fmt"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ConfigFile creates a set of Kubernetes resources from a Kubernetes YAML file.
//
// ## Example Usage
// ### Local File
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/yaml"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//	    pulumi.Run(func(ctx *pulumi.Context) error {
//	        _, err := yaml.NewConfigFile(ctx, "example",
//	            &yaml.ConfigFileArgs{
//	                File: "foo.yaml",
//	            },
//	        )
//	        if err != nil {
//	            return err
//	        }
//
//	        return nil
//	    })
//	}
//
// ```
// ### YAML with Transformations
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/yaml"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//	    pulumi.Run(func(ctx *pulumi.Context) error {
//	        _, err := yaml.NewConfigFile(ctx, "example",
//	            &yaml.ConfigFileArgs{
//	                File: "foo.yaml",
//	                Transformations: []yaml.Transformation{
//	                    // Make every service private to the cluster, i.e., turn all services into ClusterIP
//	                    // instead of LoadBalancer.
//	                    func(state map[string]interface{}, opts ...pulumi.ResourceOption) {
//	                        if state["kind"] == "Service" {
//	                            spec := state["spec"].(map[string]interface{})
//	                            spec["type"] = "ClusterIP"
//	                        }
//	                    },
//
//	                    // Set a resource alias for a previous name.
//	                    func(state map[string]interface{}, opts ...pulumi.ResourceOption) {
//	                        if state["kind"] == "Deployment" {
//	                            aliases := pulumi.Aliases([]pulumi.Alias{
//	                                {
//	                                    Name: pulumi.String("oldName"),
//	                                },
//	                            })
//	                            opts = append(opts, aliases)
//	                        }
//	                    },
//
//	                    // Omit a resource from the Chart by transforming the specified resource definition
//	                    // to an empty List.
//	                    func(state map[string]interface{}, opts ...pulumi.ResourceOption) {
//	                        name := state["metadata"].(map[string]interface{})["name"]
//	                        if state["kind"] == "Pod" && name == "test" {
//	                            state["apiVersion"] = "core/v1"
//	                            state["kind"] = "List"
//	                        }
//	                    },
//	                },
//	            },
//	        )
//	        if err != nil {
//	            return err
//	        }
//
//	        return nil
//	    })
//	}
//
// ```
type ConfigFile struct {
	pulumi.ResourceState

	Resources map[string]pulumi.Resource
}

// The set of arguments for constructing a ConfigFile resource.
type ConfigFileArgs struct {
	// File is a path or URL that uniquely identifies a file.
	File string
	// Transformations is an optional list of transformations to apply to Kubernetes resource definitions
	// before registering with the engine.
	Transformations []Transformation
	// ResourcePrefix is an optional prefix for the auto-generated resource names. For example, a resource named `bar`
	// created with resource prefix of `"foo"` would produce a resource named `"foo-bar"`.
	ResourcePrefix string
	// Skip await logic for all resources in this YAML. Resources will be marked ready as soon as they are created.
	// Warning: This option should not be used if you have resources depending on Outputs from the YAML.
	SkipAwait bool
}

// NewConfigFile registers a new resource with the given unique name, arguments, and options.
func NewConfigFile(ctx *pulumi.Context,
	name string, args *ConfigFileArgs, opts ...pulumi.ResourceOption) (*ConfigFile, error) {

	// Register the resulting resource state.
	configFile := &ConfigFile{
		Resources: map[string]pulumi.Resource{},
	}
	err := ctx.RegisterComponentResource("kubernetes:yaml:ConfigFile", name, configFile, opts...)
	if err != nil {
		return nil, err
	}

	// Now provision all child resources by parsing the YAML file.
	if args != nil {
		transformations := args.Transformations
		if args.SkipAwait {
			transformations = AddSkipAwaitTransformation(transformations)
		}

		// Parse and decode the YAML files.
		parseOpts, err := GetChildOptions(configFile, opts)
		if err != nil {
			return nil, err
		}
		rs, err := parseDecodeYamlFiles(ctx, &ConfigGroupArgs{
			Files:           []string{args.File},
			Transformations: args.Transformations,
			ResourcePrefix:  args.ResourcePrefix,
		}, false, parseOpts...)
		if err != nil {
			return nil, err
		}
		configFile.Resources = rs
	}

	// Finally, register all of the resources found.
	err = ctx.RegisterResourceOutputs(configFile, pulumi.Map{})
	if err != nil {
		return nil, errors.Wrapf(err, "registering child resources")
	}

	return configFile, nil
}

// GetResource returns a resource defined by a built-in Kubernetes group/version/kind, name and namespace.
// For example, GetResource("v1/Pod", "foo", "") would return a Pod called "foo" from the "default" namespace.
func (cf *ConfigFile) GetResource(gvk, name, namespace string) pulumi.Resource {
	id := name
	if len(namespace) > 0 && namespace != "default" {
		id = fmt.Sprintf("%s/%s", namespace, name)
	}
	key := fmt.Sprintf("%s::%s", gvk, id)
	return cf.Resources[key]
}
