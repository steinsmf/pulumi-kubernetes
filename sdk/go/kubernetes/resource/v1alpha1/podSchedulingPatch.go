// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

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
// PodScheduling objects hold information that is needed to schedule a Pod with ResourceClaims that use "WaitForFirstConsumer" allocation mode.
//
// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
type PodSchedulingPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Spec describes where resources for the Pod are needed.
	Spec PodSchedulingSpecPatchPtrOutput `pulumi:"spec"`
	// Status describes where resources for the Pod can be allocated.
	Status PodSchedulingStatusPatchPtrOutput `pulumi:"status"`
}

// NewPodSchedulingPatch registers a new resource with the given unique name, arguments, and options.
func NewPodSchedulingPatch(ctx *pulumi.Context,
	name string, args *PodSchedulingPatchArgs, opts ...pulumi.ResourceOption) (*PodSchedulingPatch, error) {
	if args == nil {
		args = &PodSchedulingPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("resource.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("PodScheduling")
	var resource PodSchedulingPatch
	err := ctx.RegisterResource("kubernetes:resource.k8s.io/v1alpha1:PodSchedulingPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPodSchedulingPatch gets an existing PodSchedulingPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPodSchedulingPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PodSchedulingPatchState, opts ...pulumi.ResourceOption) (*PodSchedulingPatch, error) {
	var resource PodSchedulingPatch
	err := ctx.ReadResource("kubernetes:resource.k8s.io/v1alpha1:PodSchedulingPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PodSchedulingPatch resources.
type podSchedulingPatchState struct {
}

type PodSchedulingPatchState struct {
}

func (PodSchedulingPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*podSchedulingPatchState)(nil)).Elem()
}

type podSchedulingPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Spec describes where resources for the Pod are needed.
	Spec *PodSchedulingSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a PodSchedulingPatch resource.
type PodSchedulingPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// Spec describes where resources for the Pod are needed.
	Spec PodSchedulingSpecPatchPtrInput
}

func (PodSchedulingPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*podSchedulingPatchArgs)(nil)).Elem()
}

type PodSchedulingPatchInput interface {
	pulumi.Input

	ToPodSchedulingPatchOutput() PodSchedulingPatchOutput
	ToPodSchedulingPatchOutputWithContext(ctx context.Context) PodSchedulingPatchOutput
}

func (*PodSchedulingPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSchedulingPatch)(nil)).Elem()
}

func (i *PodSchedulingPatch) ToPodSchedulingPatchOutput() PodSchedulingPatchOutput {
	return i.ToPodSchedulingPatchOutputWithContext(context.Background())
}

func (i *PodSchedulingPatch) ToPodSchedulingPatchOutputWithContext(ctx context.Context) PodSchedulingPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSchedulingPatchOutput)
}

// PodSchedulingPatchArrayInput is an input type that accepts PodSchedulingPatchArray and PodSchedulingPatchArrayOutput values.
// You can construct a concrete instance of `PodSchedulingPatchArrayInput` via:
//
//	PodSchedulingPatchArray{ PodSchedulingPatchArgs{...} }
type PodSchedulingPatchArrayInput interface {
	pulumi.Input

	ToPodSchedulingPatchArrayOutput() PodSchedulingPatchArrayOutput
	ToPodSchedulingPatchArrayOutputWithContext(context.Context) PodSchedulingPatchArrayOutput
}

type PodSchedulingPatchArray []PodSchedulingPatchInput

func (PodSchedulingPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSchedulingPatch)(nil)).Elem()
}

func (i PodSchedulingPatchArray) ToPodSchedulingPatchArrayOutput() PodSchedulingPatchArrayOutput {
	return i.ToPodSchedulingPatchArrayOutputWithContext(context.Background())
}

func (i PodSchedulingPatchArray) ToPodSchedulingPatchArrayOutputWithContext(ctx context.Context) PodSchedulingPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSchedulingPatchArrayOutput)
}

// PodSchedulingPatchMapInput is an input type that accepts PodSchedulingPatchMap and PodSchedulingPatchMapOutput values.
// You can construct a concrete instance of `PodSchedulingPatchMapInput` via:
//
//	PodSchedulingPatchMap{ "key": PodSchedulingPatchArgs{...} }
type PodSchedulingPatchMapInput interface {
	pulumi.Input

	ToPodSchedulingPatchMapOutput() PodSchedulingPatchMapOutput
	ToPodSchedulingPatchMapOutputWithContext(context.Context) PodSchedulingPatchMapOutput
}

type PodSchedulingPatchMap map[string]PodSchedulingPatchInput

func (PodSchedulingPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSchedulingPatch)(nil)).Elem()
}

func (i PodSchedulingPatchMap) ToPodSchedulingPatchMapOutput() PodSchedulingPatchMapOutput {
	return i.ToPodSchedulingPatchMapOutputWithContext(context.Background())
}

func (i PodSchedulingPatchMap) ToPodSchedulingPatchMapOutputWithContext(ctx context.Context) PodSchedulingPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSchedulingPatchMapOutput)
}

type PodSchedulingPatchOutput struct{ *pulumi.OutputState }

func (PodSchedulingPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSchedulingPatch)(nil)).Elem()
}

func (o PodSchedulingPatchOutput) ToPodSchedulingPatchOutput() PodSchedulingPatchOutput {
	return o
}

func (o PodSchedulingPatchOutput) ToPodSchedulingPatchOutputWithContext(ctx context.Context) PodSchedulingPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PodSchedulingPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PodSchedulingPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PodSchedulingPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PodSchedulingPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object metadata
func (o PodSchedulingPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *PodSchedulingPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Spec describes where resources for the Pod are needed.
func (o PodSchedulingPatchOutput) Spec() PodSchedulingSpecPatchPtrOutput {
	return o.ApplyT(func(v *PodSchedulingPatch) PodSchedulingSpecPatchPtrOutput { return v.Spec }).(PodSchedulingSpecPatchPtrOutput)
}

// Status describes where resources for the Pod can be allocated.
func (o PodSchedulingPatchOutput) Status() PodSchedulingStatusPatchPtrOutput {
	return o.ApplyT(func(v *PodSchedulingPatch) PodSchedulingStatusPatchPtrOutput { return v.Status }).(PodSchedulingStatusPatchPtrOutput)
}

type PodSchedulingPatchArrayOutput struct{ *pulumi.OutputState }

func (PodSchedulingPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSchedulingPatch)(nil)).Elem()
}

func (o PodSchedulingPatchArrayOutput) ToPodSchedulingPatchArrayOutput() PodSchedulingPatchArrayOutput {
	return o
}

func (o PodSchedulingPatchArrayOutput) ToPodSchedulingPatchArrayOutputWithContext(ctx context.Context) PodSchedulingPatchArrayOutput {
	return o
}

func (o PodSchedulingPatchArrayOutput) Index(i pulumi.IntInput) PodSchedulingPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PodSchedulingPatch {
		return vs[0].([]*PodSchedulingPatch)[vs[1].(int)]
	}).(PodSchedulingPatchOutput)
}

type PodSchedulingPatchMapOutput struct{ *pulumi.OutputState }

func (PodSchedulingPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSchedulingPatch)(nil)).Elem()
}

func (o PodSchedulingPatchMapOutput) ToPodSchedulingPatchMapOutput() PodSchedulingPatchMapOutput {
	return o
}

func (o PodSchedulingPatchMapOutput) ToPodSchedulingPatchMapOutputWithContext(ctx context.Context) PodSchedulingPatchMapOutput {
	return o
}

func (o PodSchedulingPatchMapOutput) MapIndex(k pulumi.StringInput) PodSchedulingPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PodSchedulingPatch {
		return vs[0].(map[string]*PodSchedulingPatch)[vs[1].(string)]
	}).(PodSchedulingPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PodSchedulingPatchInput)(nil)).Elem(), &PodSchedulingPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSchedulingPatchArrayInput)(nil)).Elem(), PodSchedulingPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSchedulingPatchMapInput)(nil)).Elem(), PodSchedulingPatchMap{})
	pulumi.RegisterOutputType(PodSchedulingPatchOutput{})
	pulumi.RegisterOutputType(PodSchedulingPatchArrayOutput{})
	pulumi.RegisterOutputType(PodSchedulingPatchMapOutput{})
}
