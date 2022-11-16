// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta2

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Patch resources are used to modify existing Kubernetes resources by using
// Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
// one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
// Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
// [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/installation-configuration/#server-side-apply) for
// additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
// PriorityLevelConfiguration represents the configuration of a priority level.
type PriorityLevelConfigurationPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// `spec` is the specification of the desired behavior of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec PriorityLevelConfigurationSpecPatchPtrOutput `pulumi:"spec"`
	// `status` is the current status of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Status PriorityLevelConfigurationStatusPatchPtrOutput `pulumi:"status"`
}

// NewPriorityLevelConfigurationPatch registers a new resource with the given unique name, arguments, and options.
func NewPriorityLevelConfigurationPatch(ctx *pulumi.Context,
	name string, args *PriorityLevelConfigurationPatchArgs, opts ...pulumi.ResourceOption) (*PriorityLevelConfigurationPatch, error) {
	if args == nil {
		args = &PriorityLevelConfigurationPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("flowcontrol.apiserver.k8s.io/v1beta2")
	args.Kind = pulumi.StringPtr("PriorityLevelConfiguration")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:flowcontrol.apiserver.k8s.io/v1alpha1:PriorityLevelConfigurationPatch"),
		},
		{
			Type: pulumi.String("kubernetes:flowcontrol.apiserver.k8s.io/v1beta1:PriorityLevelConfigurationPatch"),
		},
		{
			Type: pulumi.String("kubernetes:flowcontrol.apiserver.k8s.io/v1beta3:PriorityLevelConfigurationPatch"),
		},
	})
	opts = append(opts, aliases)
	var resource PriorityLevelConfigurationPatch
	err := ctx.RegisterResource("kubernetes:flowcontrol.apiserver.k8s.io/v1beta2:PriorityLevelConfigurationPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPriorityLevelConfigurationPatch gets an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPriorityLevelConfigurationPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PriorityLevelConfigurationPatchState, opts ...pulumi.ResourceOption) (*PriorityLevelConfigurationPatch, error) {
	var resource PriorityLevelConfigurationPatch
	err := ctx.ReadResource("kubernetes:flowcontrol.apiserver.k8s.io/v1beta2:PriorityLevelConfigurationPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PriorityLevelConfigurationPatch resources.
type priorityLevelConfigurationPatchState struct {
}

type PriorityLevelConfigurationPatchState struct {
}

func (PriorityLevelConfigurationPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*priorityLevelConfigurationPatchState)(nil)).Elem()
}

type priorityLevelConfigurationPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// `spec` is the specification of the desired behavior of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *PriorityLevelConfigurationSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a PriorityLevelConfigurationPatch resource.
type PriorityLevelConfigurationPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// `spec` is the specification of the desired behavior of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec PriorityLevelConfigurationSpecPatchPtrInput
}

func (PriorityLevelConfigurationPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*priorityLevelConfigurationPatchArgs)(nil)).Elem()
}

type PriorityLevelConfigurationPatchInput interface {
	pulumi.Input

	ToPriorityLevelConfigurationPatchOutput() PriorityLevelConfigurationPatchOutput
	ToPriorityLevelConfigurationPatchOutputWithContext(ctx context.Context) PriorityLevelConfigurationPatchOutput
}

func (*PriorityLevelConfigurationPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**PriorityLevelConfigurationPatch)(nil)).Elem()
}

func (i *PriorityLevelConfigurationPatch) ToPriorityLevelConfigurationPatchOutput() PriorityLevelConfigurationPatchOutput {
	return i.ToPriorityLevelConfigurationPatchOutputWithContext(context.Background())
}

func (i *PriorityLevelConfigurationPatch) ToPriorityLevelConfigurationPatchOutputWithContext(ctx context.Context) PriorityLevelConfigurationPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PriorityLevelConfigurationPatchOutput)
}

// PriorityLevelConfigurationPatchArrayInput is an input type that accepts PriorityLevelConfigurationPatchArray and PriorityLevelConfigurationPatchArrayOutput values.
// You can construct a concrete instance of `PriorityLevelConfigurationPatchArrayInput` via:
//
//	PriorityLevelConfigurationPatchArray{ PriorityLevelConfigurationPatchArgs{...} }
type PriorityLevelConfigurationPatchArrayInput interface {
	pulumi.Input

	ToPriorityLevelConfigurationPatchArrayOutput() PriorityLevelConfigurationPatchArrayOutput
	ToPriorityLevelConfigurationPatchArrayOutputWithContext(context.Context) PriorityLevelConfigurationPatchArrayOutput
}

type PriorityLevelConfigurationPatchArray []PriorityLevelConfigurationPatchInput

func (PriorityLevelConfigurationPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PriorityLevelConfigurationPatch)(nil)).Elem()
}

func (i PriorityLevelConfigurationPatchArray) ToPriorityLevelConfigurationPatchArrayOutput() PriorityLevelConfigurationPatchArrayOutput {
	return i.ToPriorityLevelConfigurationPatchArrayOutputWithContext(context.Background())
}

func (i PriorityLevelConfigurationPatchArray) ToPriorityLevelConfigurationPatchArrayOutputWithContext(ctx context.Context) PriorityLevelConfigurationPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PriorityLevelConfigurationPatchArrayOutput)
}

// PriorityLevelConfigurationPatchMapInput is an input type that accepts PriorityLevelConfigurationPatchMap and PriorityLevelConfigurationPatchMapOutput values.
// You can construct a concrete instance of `PriorityLevelConfigurationPatchMapInput` via:
//
//	PriorityLevelConfigurationPatchMap{ "key": PriorityLevelConfigurationPatchArgs{...} }
type PriorityLevelConfigurationPatchMapInput interface {
	pulumi.Input

	ToPriorityLevelConfigurationPatchMapOutput() PriorityLevelConfigurationPatchMapOutput
	ToPriorityLevelConfigurationPatchMapOutputWithContext(context.Context) PriorityLevelConfigurationPatchMapOutput
}

type PriorityLevelConfigurationPatchMap map[string]PriorityLevelConfigurationPatchInput

func (PriorityLevelConfigurationPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PriorityLevelConfigurationPatch)(nil)).Elem()
}

func (i PriorityLevelConfigurationPatchMap) ToPriorityLevelConfigurationPatchMapOutput() PriorityLevelConfigurationPatchMapOutput {
	return i.ToPriorityLevelConfigurationPatchMapOutputWithContext(context.Background())
}

func (i PriorityLevelConfigurationPatchMap) ToPriorityLevelConfigurationPatchMapOutputWithContext(ctx context.Context) PriorityLevelConfigurationPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PriorityLevelConfigurationPatchMapOutput)
}

type PriorityLevelConfigurationPatchOutput struct{ *pulumi.OutputState }

func (PriorityLevelConfigurationPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PriorityLevelConfigurationPatch)(nil)).Elem()
}

func (o PriorityLevelConfigurationPatchOutput) ToPriorityLevelConfigurationPatchOutput() PriorityLevelConfigurationPatchOutput {
	return o
}

func (o PriorityLevelConfigurationPatchOutput) ToPriorityLevelConfigurationPatchOutputWithContext(ctx context.Context) PriorityLevelConfigurationPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PriorityLevelConfigurationPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PriorityLevelConfigurationPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PriorityLevelConfigurationPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PriorityLevelConfigurationPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o PriorityLevelConfigurationPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *PriorityLevelConfigurationPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// `spec` is the specification of the desired behavior of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o PriorityLevelConfigurationPatchOutput) Spec() PriorityLevelConfigurationSpecPatchPtrOutput {
	return o.ApplyT(func(v *PriorityLevelConfigurationPatch) PriorityLevelConfigurationSpecPatchPtrOutput { return v.Spec }).(PriorityLevelConfigurationSpecPatchPtrOutput)
}

// `status` is the current status of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o PriorityLevelConfigurationPatchOutput) Status() PriorityLevelConfigurationStatusPatchPtrOutput {
	return o.ApplyT(func(v *PriorityLevelConfigurationPatch) PriorityLevelConfigurationStatusPatchPtrOutput {
		return v.Status
	}).(PriorityLevelConfigurationStatusPatchPtrOutput)
}

type PriorityLevelConfigurationPatchArrayOutput struct{ *pulumi.OutputState }

func (PriorityLevelConfigurationPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PriorityLevelConfigurationPatch)(nil)).Elem()
}

func (o PriorityLevelConfigurationPatchArrayOutput) ToPriorityLevelConfigurationPatchArrayOutput() PriorityLevelConfigurationPatchArrayOutput {
	return o
}

func (o PriorityLevelConfigurationPatchArrayOutput) ToPriorityLevelConfigurationPatchArrayOutputWithContext(ctx context.Context) PriorityLevelConfigurationPatchArrayOutput {
	return o
}

func (o PriorityLevelConfigurationPatchArrayOutput) Index(i pulumi.IntInput) PriorityLevelConfigurationPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PriorityLevelConfigurationPatch {
		return vs[0].([]*PriorityLevelConfigurationPatch)[vs[1].(int)]
	}).(PriorityLevelConfigurationPatchOutput)
}

type PriorityLevelConfigurationPatchMapOutput struct{ *pulumi.OutputState }

func (PriorityLevelConfigurationPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PriorityLevelConfigurationPatch)(nil)).Elem()
}

func (o PriorityLevelConfigurationPatchMapOutput) ToPriorityLevelConfigurationPatchMapOutput() PriorityLevelConfigurationPatchMapOutput {
	return o
}

func (o PriorityLevelConfigurationPatchMapOutput) ToPriorityLevelConfigurationPatchMapOutputWithContext(ctx context.Context) PriorityLevelConfigurationPatchMapOutput {
	return o
}

func (o PriorityLevelConfigurationPatchMapOutput) MapIndex(k pulumi.StringInput) PriorityLevelConfigurationPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PriorityLevelConfigurationPatch {
		return vs[0].(map[string]*PriorityLevelConfigurationPatch)[vs[1].(string)]
	}).(PriorityLevelConfigurationPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PriorityLevelConfigurationPatchInput)(nil)).Elem(), &PriorityLevelConfigurationPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*PriorityLevelConfigurationPatchArrayInput)(nil)).Elem(), PriorityLevelConfigurationPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PriorityLevelConfigurationPatchMapInput)(nil)).Elem(), PriorityLevelConfigurationPatchMap{})
	pulumi.RegisterOutputType(PriorityLevelConfigurationPatchOutput{})
	pulumi.RegisterOutputType(PriorityLevelConfigurationPatchArrayOutput{})
	pulumi.RegisterOutputType(PriorityLevelConfigurationPatchMapOutput{})
}
