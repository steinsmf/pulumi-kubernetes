// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/utilities"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ConfigGroup creates a set of Kubernetes resources from Kubernetes YAML text. The YAML text
// may be supplied using any of the following methods:
//
// 1. Using a filename or a list of filenames:
// 2. Using a file pattern or a list of file patterns:
// 3. Using a literal string containing YAML, or a list of such strings:
// 4. Any combination of files, patterns, or YAML strings:
//
// ## Dependency ordering
// Sometimes resources must be applied in a specific order. For example, a namespace resource must be
// created before any namespaced resources, or a Custom Resource Definition (CRD) must be pre-installed.
//
// Pulumi uses heuristics to determine which order to apply and delete objects within the ConfigGroup.  Pulumi also
// waits for each object to be fully reconciled, unless `skipAwait` is enabled.
//
// ### Explicit Dependency Ordering
// Pulumi supports the `config.kubernetes.io/depends-on` annotation to declare an explicit dependency on a given resource.
// The annotation accepts a list of resource references, delimited by commas.
//
// Note that references to resources outside the ConfigGroup aren't supported.
//
// **Resource reference**
//
// A resource reference is a string that uniquely identifies a resource.
//
// It consists of the group, kind, name, and optionally the namespace, delimited by forward slashes.
//
// | Resource Scope   | Format                                         |
// | :--------------- | :--------------------------------------------- |
// | namespace-scoped | `<group>/namespaces/<namespace>/<kind>/<name>` |
// | cluster-scoped   | `<group>/<kind>/<name>`                        |
//
// For resources in the “core” group, the empty string is used instead (for example: `/namespaces/test/Pod/pod-a`).
//
// ### Ordering across ConfigGroups
// The `dependsOn` resource option creates a list of explicit dependencies between Pulumi resources.
// Use it on another resource to make it dependent on the ConfigGroup and to wait for the resources within
// the group to be deployed.
//
// A best practice is to deploy each application using its own ConfigGroup, especially when that application
// installs custom resource definitions.
//
// ## Example Usage
// ### Local File(s)
// ```go
// package main
//
// import (
//
//	yamlv2 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/yaml/v2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := yamlv2.NewConfigGroup(ctx, "example", &yamlv2.ConfigGroupArgs{
//				Files: pulumi.ToStringArray([]string{"manifest.yaml"}),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Local File Pattern
// ```go
// package main
//
// import (
//
//	yamlv2 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/yaml/v2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := yamlv2.NewConfigGroup(ctx, "example", &yamlv2.ConfigGroupArgs{
//				Files: pulumi.ToStringArray([]string{"./manifests/*.yaml"}),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// {{% /example %}}
// ### Literal YAML String
// ```go
// package main
//
// import (
//
//	yamlv2 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/yaml/v2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := yamlv2.NewConfigGroup(ctx, "example", &yamlv2.ConfigGroupArgs{
//				Yaml: pulumi.StringPtr(`
//
// apiVersion: v1
// kind: ConfigMap
// metadata:
//
//	name: my-map
//
// `),
//
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Literal Object
// ```go
// package main
//
// import (
//
//	yamlv2 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/yaml/v2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := yamlv2.NewConfigGroup(ctx, "example", &yamlv2.ConfigGroupArgs{
//				Objs: pulumi.Array{
//					pulumi.Map{
//						"apiVersion": pulumi.String("v1"),
//						"kind":       pulumi.String("ConfigMap"),
//						"metadata": pulumi.Map{
//							"name": pulumi.String("my-map"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// {% /examples %}}
type ConfigGroup struct {
	pulumi.ResourceState

	// Resources created by the ConfigGroup.
	Resources pulumi.ResourceArrayOutput `pulumi:"resources"`
}

// NewConfigGroup registers a new resource with the given unique name, arguments, and options.
func NewConfigGroup(ctx *pulumi.Context,
	name string, args *ConfigGroupArgs, opts ...pulumi.ResourceOption) (*ConfigGroup, error) {
	if args == nil {
		args = &ConfigGroupArgs{}
	}

	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource ConfigGroup
	err := ctx.RegisterRemoteComponentResource("kubernetes:yaml/v2:ConfigGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type configGroupArgs struct {
	// Set of paths and/or URLs to Kubernetes manifest files. Supports glob patterns.
	Files []string `pulumi:"files"`
	// Objects representing Kubernetes resource configurations.
	Objs []interface{} `pulumi:"objs"`
	// A prefix for the auto-generated resource names. Defaults to the name of the ConfigGroup. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
	ResourcePrefix *string `pulumi:"resourcePrefix"`
	// Indicates that child resources should skip the await logic.
	SkipAwait *bool `pulumi:"skipAwait"`
	// A Kubernetes YAML manifest containing Kubernetes resource configuration(s).
	Yaml *string `pulumi:"yaml"`
}

// The set of arguments for constructing a ConfigGroup resource.
type ConfigGroupArgs struct {
	// Set of paths and/or URLs to Kubernetes manifest files. Supports glob patterns.
	Files pulumi.StringArrayInput
	// Objects representing Kubernetes resource configurations.
	Objs pulumi.ArrayInput
	// A prefix for the auto-generated resource names. Defaults to the name of the ConfigGroup. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
	ResourcePrefix pulumi.StringPtrInput
	// Indicates that child resources should skip the await logic.
	SkipAwait pulumi.BoolPtrInput
	// A Kubernetes YAML manifest containing Kubernetes resource configuration(s).
	Yaml pulumi.StringPtrInput
}

func (ConfigGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*configGroupArgs)(nil)).Elem()
}

type ConfigGroupInput interface {
	pulumi.Input

	ToConfigGroupOutput() ConfigGroupOutput
	ToConfigGroupOutputWithContext(ctx context.Context) ConfigGroupOutput
}

func (*ConfigGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigGroup)(nil)).Elem()
}

func (i *ConfigGroup) ToConfigGroupOutput() ConfigGroupOutput {
	return i.ToConfigGroupOutputWithContext(context.Background())
}

func (i *ConfigGroup) ToConfigGroupOutputWithContext(ctx context.Context) ConfigGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigGroupOutput)
}

// ConfigGroupArrayInput is an input type that accepts ConfigGroupArray and ConfigGroupArrayOutput values.
// You can construct a concrete instance of `ConfigGroupArrayInput` via:
//
//	ConfigGroupArray{ ConfigGroupArgs{...} }
type ConfigGroupArrayInput interface {
	pulumi.Input

	ToConfigGroupArrayOutput() ConfigGroupArrayOutput
	ToConfigGroupArrayOutputWithContext(context.Context) ConfigGroupArrayOutput
}

type ConfigGroupArray []ConfigGroupInput

func (ConfigGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigGroup)(nil)).Elem()
}

func (i ConfigGroupArray) ToConfigGroupArrayOutput() ConfigGroupArrayOutput {
	return i.ToConfigGroupArrayOutputWithContext(context.Background())
}

func (i ConfigGroupArray) ToConfigGroupArrayOutputWithContext(ctx context.Context) ConfigGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigGroupArrayOutput)
}

// ConfigGroupMapInput is an input type that accepts ConfigGroupMap and ConfigGroupMapOutput values.
// You can construct a concrete instance of `ConfigGroupMapInput` via:
//
//	ConfigGroupMap{ "key": ConfigGroupArgs{...} }
type ConfigGroupMapInput interface {
	pulumi.Input

	ToConfigGroupMapOutput() ConfigGroupMapOutput
	ToConfigGroupMapOutputWithContext(context.Context) ConfigGroupMapOutput
}

type ConfigGroupMap map[string]ConfigGroupInput

func (ConfigGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigGroup)(nil)).Elem()
}

func (i ConfigGroupMap) ToConfigGroupMapOutput() ConfigGroupMapOutput {
	return i.ToConfigGroupMapOutputWithContext(context.Background())
}

func (i ConfigGroupMap) ToConfigGroupMapOutputWithContext(ctx context.Context) ConfigGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigGroupMapOutput)
}

type ConfigGroupOutput struct{ *pulumi.OutputState }

func (ConfigGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigGroup)(nil)).Elem()
}

func (o ConfigGroupOutput) ToConfigGroupOutput() ConfigGroupOutput {
	return o
}

func (o ConfigGroupOutput) ToConfigGroupOutputWithContext(ctx context.Context) ConfigGroupOutput {
	return o
}

// Resources created by the ConfigGroup.
func (o ConfigGroupOutput) Resources() pulumi.ResourceArrayOutput {
	return o.ApplyT(func(v *ConfigGroup) pulumi.ResourceArrayOutput { return v.Resources }).(pulumi.ResourceArrayOutput)
}

type ConfigGroupArrayOutput struct{ *pulumi.OutputState }

func (ConfigGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigGroup)(nil)).Elem()
}

func (o ConfigGroupArrayOutput) ToConfigGroupArrayOutput() ConfigGroupArrayOutput {
	return o
}

func (o ConfigGroupArrayOutput) ToConfigGroupArrayOutputWithContext(ctx context.Context) ConfigGroupArrayOutput {
	return o
}

func (o ConfigGroupArrayOutput) Index(i pulumi.IntInput) ConfigGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConfigGroup {
		return vs[0].([]*ConfigGroup)[vs[1].(int)]
	}).(ConfigGroupOutput)
}

type ConfigGroupMapOutput struct{ *pulumi.OutputState }

func (ConfigGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigGroup)(nil)).Elem()
}

func (o ConfigGroupMapOutput) ToConfigGroupMapOutput() ConfigGroupMapOutput {
	return o
}

func (o ConfigGroupMapOutput) ToConfigGroupMapOutputWithContext(ctx context.Context) ConfigGroupMapOutput {
	return o
}

func (o ConfigGroupMapOutput) MapIndex(k pulumi.StringInput) ConfigGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConfigGroup {
		return vs[0].(map[string]*ConfigGroup)[vs[1].(string)]
	}).(ConfigGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigGroupInput)(nil)).Elem(), &ConfigGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigGroupArrayInput)(nil)).Elem(), ConfigGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigGroupMapInput)(nil)).Elem(), ConfigGroupMap{})
	pulumi.RegisterOutputType(ConfigGroupOutput{})
	pulumi.RegisterOutputType(ConfigGroupArrayOutput{})
	pulumi.RegisterOutputType(ConfigGroupMapOutput{})
}
