// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha2

import (
	"context"
	"reflect"

	"errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// PodSchedulingContext objects hold information that is needed to schedule a Pod with ResourceClaims that use "WaitForFirstConsumer" allocation mode.
//
// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
type PodSchedulingContext struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Standard object metadata
	Metadata metav1.ObjectMetaOutput `pulumi:"metadata"`
	// Spec describes where resources for the Pod are needed.
	Spec PodSchedulingContextSpecOutput `pulumi:"spec"`
	// Status describes where resources for the Pod can be allocated.
	Status PodSchedulingContextStatusPtrOutput `pulumi:"status"`
}

// NewPodSchedulingContext registers a new resource with the given unique name, arguments, and options.
func NewPodSchedulingContext(ctx *pulumi.Context,
	name string, args *PodSchedulingContextArgs, opts ...pulumi.ResourceOption) (*PodSchedulingContext, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Spec == nil {
		return nil, errors.New("invalid value for required argument 'Spec'")
	}
	args.ApiVersion = pulumi.StringPtr("resource.k8s.io/v1alpha2")
	args.Kind = pulumi.StringPtr("PodSchedulingContext")
	var resource PodSchedulingContext
	err := ctx.RegisterResource("kubernetes:resource.k8s.io/v1alpha2:PodSchedulingContext", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPodSchedulingContext gets an existing PodSchedulingContext resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPodSchedulingContext(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PodSchedulingContextState, opts ...pulumi.ResourceOption) (*PodSchedulingContext, error) {
	var resource PodSchedulingContext
	err := ctx.ReadResource("kubernetes:resource.k8s.io/v1alpha2:PodSchedulingContext", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PodSchedulingContext resources.
type podSchedulingContextState struct {
}

type PodSchedulingContextState struct {
}

func (PodSchedulingContextState) ElementType() reflect.Type {
	return reflect.TypeOf((*podSchedulingContextState)(nil)).Elem()
}

type podSchedulingContextArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Spec describes where resources for the Pod are needed.
	Spec PodSchedulingContextSpec `pulumi:"spec"`
}

// The set of arguments for constructing a PodSchedulingContext resource.
type PodSchedulingContextArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata
	Metadata metav1.ObjectMetaPtrInput
	// Spec describes where resources for the Pod are needed.
	Spec PodSchedulingContextSpecInput
}

func (PodSchedulingContextArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*podSchedulingContextArgs)(nil)).Elem()
}

type PodSchedulingContextInput interface {
	pulumi.Input

	ToPodSchedulingContextOutput() PodSchedulingContextOutput
	ToPodSchedulingContextOutputWithContext(ctx context.Context) PodSchedulingContextOutput
}

func (*PodSchedulingContext) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSchedulingContext)(nil)).Elem()
}

func (i *PodSchedulingContext) ToPodSchedulingContextOutput() PodSchedulingContextOutput {
	return i.ToPodSchedulingContextOutputWithContext(context.Background())
}

func (i *PodSchedulingContext) ToPodSchedulingContextOutputWithContext(ctx context.Context) PodSchedulingContextOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSchedulingContextOutput)
}

// PodSchedulingContextArrayInput is an input type that accepts PodSchedulingContextArray and PodSchedulingContextArrayOutput values.
// You can construct a concrete instance of `PodSchedulingContextArrayInput` via:
//
//	PodSchedulingContextArray{ PodSchedulingContextArgs{...} }
type PodSchedulingContextArrayInput interface {
	pulumi.Input

	ToPodSchedulingContextArrayOutput() PodSchedulingContextArrayOutput
	ToPodSchedulingContextArrayOutputWithContext(context.Context) PodSchedulingContextArrayOutput
}

type PodSchedulingContextArray []PodSchedulingContextInput

func (PodSchedulingContextArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSchedulingContext)(nil)).Elem()
}

func (i PodSchedulingContextArray) ToPodSchedulingContextArrayOutput() PodSchedulingContextArrayOutput {
	return i.ToPodSchedulingContextArrayOutputWithContext(context.Background())
}

func (i PodSchedulingContextArray) ToPodSchedulingContextArrayOutputWithContext(ctx context.Context) PodSchedulingContextArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSchedulingContextArrayOutput)
}

// PodSchedulingContextMapInput is an input type that accepts PodSchedulingContextMap and PodSchedulingContextMapOutput values.
// You can construct a concrete instance of `PodSchedulingContextMapInput` via:
//
//	PodSchedulingContextMap{ "key": PodSchedulingContextArgs{...} }
type PodSchedulingContextMapInput interface {
	pulumi.Input

	ToPodSchedulingContextMapOutput() PodSchedulingContextMapOutput
	ToPodSchedulingContextMapOutputWithContext(context.Context) PodSchedulingContextMapOutput
}

type PodSchedulingContextMap map[string]PodSchedulingContextInput

func (PodSchedulingContextMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSchedulingContext)(nil)).Elem()
}

func (i PodSchedulingContextMap) ToPodSchedulingContextMapOutput() PodSchedulingContextMapOutput {
	return i.ToPodSchedulingContextMapOutputWithContext(context.Background())
}

func (i PodSchedulingContextMap) ToPodSchedulingContextMapOutputWithContext(ctx context.Context) PodSchedulingContextMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSchedulingContextMapOutput)
}

type PodSchedulingContextOutput struct{ *pulumi.OutputState }

func (PodSchedulingContextOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSchedulingContext)(nil)).Elem()
}

func (o PodSchedulingContextOutput) ToPodSchedulingContextOutput() PodSchedulingContextOutput {
	return o
}

func (o PodSchedulingContextOutput) ToPodSchedulingContextOutputWithContext(ctx context.Context) PodSchedulingContextOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PodSchedulingContextOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *PodSchedulingContext) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PodSchedulingContextOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *PodSchedulingContext) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Standard object metadata
func (o PodSchedulingContextOutput) Metadata() metav1.ObjectMetaOutput {
	return o.ApplyT(func(v *PodSchedulingContext) metav1.ObjectMetaOutput { return v.Metadata }).(metav1.ObjectMetaOutput)
}

// Spec describes where resources for the Pod are needed.
func (o PodSchedulingContextOutput) Spec() PodSchedulingContextSpecOutput {
	return o.ApplyT(func(v *PodSchedulingContext) PodSchedulingContextSpecOutput { return v.Spec }).(PodSchedulingContextSpecOutput)
}

// Status describes where resources for the Pod can be allocated.
func (o PodSchedulingContextOutput) Status() PodSchedulingContextStatusPtrOutput {
	return o.ApplyT(func(v *PodSchedulingContext) PodSchedulingContextStatusPtrOutput { return v.Status }).(PodSchedulingContextStatusPtrOutput)
}

type PodSchedulingContextArrayOutput struct{ *pulumi.OutputState }

func (PodSchedulingContextArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSchedulingContext)(nil)).Elem()
}

func (o PodSchedulingContextArrayOutput) ToPodSchedulingContextArrayOutput() PodSchedulingContextArrayOutput {
	return o
}

func (o PodSchedulingContextArrayOutput) ToPodSchedulingContextArrayOutputWithContext(ctx context.Context) PodSchedulingContextArrayOutput {
	return o
}

func (o PodSchedulingContextArrayOutput) Index(i pulumi.IntInput) PodSchedulingContextOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PodSchedulingContext {
		return vs[0].([]*PodSchedulingContext)[vs[1].(int)]
	}).(PodSchedulingContextOutput)
}

type PodSchedulingContextMapOutput struct{ *pulumi.OutputState }

func (PodSchedulingContextMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSchedulingContext)(nil)).Elem()
}

func (o PodSchedulingContextMapOutput) ToPodSchedulingContextMapOutput() PodSchedulingContextMapOutput {
	return o
}

func (o PodSchedulingContextMapOutput) ToPodSchedulingContextMapOutputWithContext(ctx context.Context) PodSchedulingContextMapOutput {
	return o
}

func (o PodSchedulingContextMapOutput) MapIndex(k pulumi.StringInput) PodSchedulingContextOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PodSchedulingContext {
		return vs[0].(map[string]*PodSchedulingContext)[vs[1].(string)]
	}).(PodSchedulingContextOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PodSchedulingContextInput)(nil)).Elem(), &PodSchedulingContext{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSchedulingContextArrayInput)(nil)).Elem(), PodSchedulingContextArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSchedulingContextMapInput)(nil)).Elem(), PodSchedulingContextMap{})
	pulumi.RegisterOutputType(PodSchedulingContextOutput{})
	pulumi.RegisterOutputType(PodSchedulingContextArrayOutput{})
	pulumi.RegisterOutputType(PodSchedulingContextMapOutput{})
}
