// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package yaml

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ConfigFile creates a set of Kubernetes resources from a Kubernetes YAML file.
//
// ## Example Usage
// ### Local File
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/yaml"
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
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/yaml"
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
// {% /examples %}}
type ConfigFile struct {
	pulumi.ResourceState

	// Resources created by the ConfigFile.
	Resources pulumi.StringPtrOutput `pulumi:"resources"`
}

// NewConfigFile registers a new resource with the given unique name, arguments, and options.
func NewConfigFile(ctx *pulumi.Context,
	name string, args *ConfigFileArgs, opts ...pulumi.ResourceOption) (*ConfigFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.File == nil {
		return nil, errors.New("invalid value for required argument 'File'")
	}
	var resource ConfigFile
	err := ctx.RegisterRemoteComponentResource("kubernetes:yaml:ConfigFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type configFileArgs struct {
	// Path or a URL that uniquely identifies a file.
	File string `pulumi:"file"`
	// An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
	ResourcePrefix *string `pulumi:"resourcePrefix"`
}

// The set of arguments for constructing a ConfigFile resource.
type ConfigFileArgs struct {
	// Path or a URL that uniquely identifies a file.
	File pulumi.StringInput
	// An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
	ResourcePrefix pulumi.StringPtrInput
}

func (ConfigFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*configFileArgs)(nil)).Elem()
}

type ConfigFileInput interface {
	pulumi.Input

	ToConfigFileOutput() ConfigFileOutput
	ToConfigFileOutputWithContext(ctx context.Context) ConfigFileOutput
}

func (*ConfigFile) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigFile)(nil)).Elem()
}

func (i *ConfigFile) ToConfigFileOutput() ConfigFileOutput {
	return i.ToConfigFileOutputWithContext(context.Background())
}

func (i *ConfigFile) ToConfigFileOutputWithContext(ctx context.Context) ConfigFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigFileOutput)
}

// ConfigFileArrayInput is an input type that accepts ConfigFileArray and ConfigFileArrayOutput values.
// You can construct a concrete instance of `ConfigFileArrayInput` via:
//
//	ConfigFileArray{ ConfigFileArgs{...} }
type ConfigFileArrayInput interface {
	pulumi.Input

	ToConfigFileArrayOutput() ConfigFileArrayOutput
	ToConfigFileArrayOutputWithContext(context.Context) ConfigFileArrayOutput
}

type ConfigFileArray []ConfigFileInput

func (ConfigFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigFile)(nil)).Elem()
}

func (i ConfigFileArray) ToConfigFileArrayOutput() ConfigFileArrayOutput {
	return i.ToConfigFileArrayOutputWithContext(context.Background())
}

func (i ConfigFileArray) ToConfigFileArrayOutputWithContext(ctx context.Context) ConfigFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigFileArrayOutput)
}

// ConfigFileMapInput is an input type that accepts ConfigFileMap and ConfigFileMapOutput values.
// You can construct a concrete instance of `ConfigFileMapInput` via:
//
//	ConfigFileMap{ "key": ConfigFileArgs{...} }
type ConfigFileMapInput interface {
	pulumi.Input

	ToConfigFileMapOutput() ConfigFileMapOutput
	ToConfigFileMapOutputWithContext(context.Context) ConfigFileMapOutput
}

type ConfigFileMap map[string]ConfigFileInput

func (ConfigFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigFile)(nil)).Elem()
}

func (i ConfigFileMap) ToConfigFileMapOutput() ConfigFileMapOutput {
	return i.ToConfigFileMapOutputWithContext(context.Background())
}

func (i ConfigFileMap) ToConfigFileMapOutputWithContext(ctx context.Context) ConfigFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigFileMapOutput)
}

type ConfigFileOutput struct{ *pulumi.OutputState }

func (ConfigFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigFile)(nil)).Elem()
}

func (o ConfigFileOutput) ToConfigFileOutput() ConfigFileOutput {
	return o
}

func (o ConfigFileOutput) ToConfigFileOutputWithContext(ctx context.Context) ConfigFileOutput {
	return o
}

// Resources created by the ConfigFile.
func (o ConfigFileOutput) Resources() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConfigFile) pulumi.StringPtrOutput { return v.Resources }).(pulumi.StringPtrOutput)
}

type ConfigFileArrayOutput struct{ *pulumi.OutputState }

func (ConfigFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigFile)(nil)).Elem()
}

func (o ConfigFileArrayOutput) ToConfigFileArrayOutput() ConfigFileArrayOutput {
	return o
}

func (o ConfigFileArrayOutput) ToConfigFileArrayOutputWithContext(ctx context.Context) ConfigFileArrayOutput {
	return o
}

func (o ConfigFileArrayOutput) Index(i pulumi.IntInput) ConfigFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConfigFile {
		return vs[0].([]*ConfigFile)[vs[1].(int)]
	}).(ConfigFileOutput)
}

type ConfigFileMapOutput struct{ *pulumi.OutputState }

func (ConfigFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigFile)(nil)).Elem()
}

func (o ConfigFileMapOutput) ToConfigFileMapOutput() ConfigFileMapOutput {
	return o
}

func (o ConfigFileMapOutput) ToConfigFileMapOutputWithContext(ctx context.Context) ConfigFileMapOutput {
	return o
}

func (o ConfigFileMapOutput) MapIndex(k pulumi.StringInput) ConfigFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConfigFile {
		return vs[0].(map[string]*ConfigFile)[vs[1].(string)]
	}).(ConfigFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigFileInput)(nil)).Elem(), &ConfigFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigFileArrayInput)(nil)).Elem(), ConfigFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigFileMapInput)(nil)).Elem(), ConfigFileMap{})
	pulumi.RegisterOutputType(ConfigFileOutput{})
	pulumi.RegisterOutputType(ConfigFileArrayOutput{})
	pulumi.RegisterOutputType(ConfigFileMapOutput{})
}
