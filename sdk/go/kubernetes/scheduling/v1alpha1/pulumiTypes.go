// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
type PriorityClassType struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// description is an arbitrary string that usually provides guidelines on when this priority class should be used.
	Description *string `pulumi:"description"`
	// globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
	GlobalDefault *bool `pulumi:"globalDefault"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
	PreemptionPolicy *string `pulumi:"preemptionPolicy"`
	// The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
	Value int `pulumi:"value"`
}

// PriorityClassTypeInput is an input type that accepts PriorityClassTypeArgs and PriorityClassTypeOutput values.
// You can construct a concrete instance of `PriorityClassTypeInput` via:
//
//	PriorityClassTypeArgs{...}
type PriorityClassTypeInput interface {
	pulumi.Input

	ToPriorityClassTypeOutput() PriorityClassTypeOutput
	ToPriorityClassTypeOutputWithContext(context.Context) PriorityClassTypeOutput
}

// DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
type PriorityClassTypeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput `pulumi:"apiVersion"`
	// description is an arbitrary string that usually provides guidelines on when this priority class should be used.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
	GlobalDefault pulumi.BoolPtrInput `pulumi:"globalDefault"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput `pulumi:"metadata"`
	// PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
	PreemptionPolicy pulumi.StringPtrInput `pulumi:"preemptionPolicy"`
	// The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
	Value pulumi.IntInput `pulumi:"value"`
}

func (PriorityClassTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PriorityClassType)(nil)).Elem()
}

func (i PriorityClassTypeArgs) ToPriorityClassTypeOutput() PriorityClassTypeOutput {
	return i.ToPriorityClassTypeOutputWithContext(context.Background())
}

func (i PriorityClassTypeArgs) ToPriorityClassTypeOutputWithContext(ctx context.Context) PriorityClassTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PriorityClassTypeOutput)
}

// PriorityClassTypeArrayInput is an input type that accepts PriorityClassTypeArray and PriorityClassTypeArrayOutput values.
// You can construct a concrete instance of `PriorityClassTypeArrayInput` via:
//
//	PriorityClassTypeArray{ PriorityClassTypeArgs{...} }
type PriorityClassTypeArrayInput interface {
	pulumi.Input

	ToPriorityClassTypeArrayOutput() PriorityClassTypeArrayOutput
	ToPriorityClassTypeArrayOutputWithContext(context.Context) PriorityClassTypeArrayOutput
}

type PriorityClassTypeArray []PriorityClassTypeInput

func (PriorityClassTypeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PriorityClassType)(nil)).Elem()
}

func (i PriorityClassTypeArray) ToPriorityClassTypeArrayOutput() PriorityClassTypeArrayOutput {
	return i.ToPriorityClassTypeArrayOutputWithContext(context.Background())
}

func (i PriorityClassTypeArray) ToPriorityClassTypeArrayOutputWithContext(ctx context.Context) PriorityClassTypeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PriorityClassTypeArrayOutput)
}

// DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
type PriorityClassTypeOutput struct{ *pulumi.OutputState }

func (PriorityClassTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PriorityClassType)(nil)).Elem()
}

func (o PriorityClassTypeOutput) ToPriorityClassTypeOutput() PriorityClassTypeOutput {
	return o
}

func (o PriorityClassTypeOutput) ToPriorityClassTypeOutputWithContext(ctx context.Context) PriorityClassTypeOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PriorityClassTypeOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassType) *string { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// description is an arbitrary string that usually provides guidelines on when this priority class should be used.
func (o PriorityClassTypeOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassType) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
func (o PriorityClassTypeOutput) GlobalDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v PriorityClassType) *bool { return v.GlobalDefault }).(pulumi.BoolPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PriorityClassTypeOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassType) *string { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o PriorityClassTypeOutput) Metadata() metav1.ObjectMetaPtrOutput {
	return o.ApplyT(func(v PriorityClassType) *metav1.ObjectMeta { return v.Metadata }).(metav1.ObjectMetaPtrOutput)
}

// PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
func (o PriorityClassTypeOutput) PreemptionPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassType) *string { return v.PreemptionPolicy }).(pulumi.StringPtrOutput)
}

// The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
func (o PriorityClassTypeOutput) Value() pulumi.IntOutput {
	return o.ApplyT(func(v PriorityClassType) int { return v.Value }).(pulumi.IntOutput)
}

type PriorityClassTypeArrayOutput struct{ *pulumi.OutputState }

func (PriorityClassTypeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PriorityClassType)(nil)).Elem()
}

func (o PriorityClassTypeArrayOutput) ToPriorityClassTypeArrayOutput() PriorityClassTypeArrayOutput {
	return o
}

func (o PriorityClassTypeArrayOutput) ToPriorityClassTypeArrayOutputWithContext(ctx context.Context) PriorityClassTypeArrayOutput {
	return o
}

func (o PriorityClassTypeArrayOutput) Index(i pulumi.IntInput) PriorityClassTypeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) PriorityClassType {
		return vs[0].([]PriorityClassType)[vs[1].(int)]
	}).(PriorityClassTypeOutput)
}

// PriorityClassList is a collection of priority classes.
type PriorityClassListType struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// items is the list of PriorityClasses
	Items []PriorityClassType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// PriorityClassListTypeInput is an input type that accepts PriorityClassListTypeArgs and PriorityClassListTypeOutput values.
// You can construct a concrete instance of `PriorityClassListTypeInput` via:
//
//	PriorityClassListTypeArgs{...}
type PriorityClassListTypeInput interface {
	pulumi.Input

	ToPriorityClassListTypeOutput() PriorityClassListTypeOutput
	ToPriorityClassListTypeOutputWithContext(context.Context) PriorityClassListTypeOutput
}

// PriorityClassList is a collection of priority classes.
type PriorityClassListTypeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput `pulumi:"apiVersion"`
	// items is the list of PriorityClasses
	Items PriorityClassTypeArrayInput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput `pulumi:"kind"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrInput `pulumi:"metadata"`
}

func (PriorityClassListTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PriorityClassListType)(nil)).Elem()
}

func (i PriorityClassListTypeArgs) ToPriorityClassListTypeOutput() PriorityClassListTypeOutput {
	return i.ToPriorityClassListTypeOutputWithContext(context.Background())
}

func (i PriorityClassListTypeArgs) ToPriorityClassListTypeOutputWithContext(ctx context.Context) PriorityClassListTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PriorityClassListTypeOutput)
}

// PriorityClassList is a collection of priority classes.
type PriorityClassListTypeOutput struct{ *pulumi.OutputState }

func (PriorityClassListTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PriorityClassListType)(nil)).Elem()
}

func (o PriorityClassListTypeOutput) ToPriorityClassListTypeOutput() PriorityClassListTypeOutput {
	return o
}

func (o PriorityClassListTypeOutput) ToPriorityClassListTypeOutputWithContext(ctx context.Context) PriorityClassListTypeOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PriorityClassListTypeOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassListType) *string { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// items is the list of PriorityClasses
func (o PriorityClassListTypeOutput) Items() PriorityClassTypeArrayOutput {
	return o.ApplyT(func(v PriorityClassListType) []PriorityClassType { return v.Items }).(PriorityClassTypeArrayOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PriorityClassListTypeOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassListType) *string { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o PriorityClassListTypeOutput) Metadata() metav1.ListMetaPtrOutput {
	return o.ApplyT(func(v PriorityClassListType) *metav1.ListMeta { return v.Metadata }).(metav1.ListMetaPtrOutput)
}

// DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
type PriorityClassPatchType struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// description is an arbitrary string that usually provides guidelines on when this priority class should be used.
	Description *string `pulumi:"description"`
	// globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
	GlobalDefault *bool `pulumi:"globalDefault"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
	PreemptionPolicy *string `pulumi:"preemptionPolicy"`
	// The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
	Value *int `pulumi:"value"`
}

// PriorityClassPatchTypeInput is an input type that accepts PriorityClassPatchTypeArgs and PriorityClassPatchTypeOutput values.
// You can construct a concrete instance of `PriorityClassPatchTypeInput` via:
//
//	PriorityClassPatchTypeArgs{...}
type PriorityClassPatchTypeInput interface {
	pulumi.Input

	ToPriorityClassPatchTypeOutput() PriorityClassPatchTypeOutput
	ToPriorityClassPatchTypeOutputWithContext(context.Context) PriorityClassPatchTypeOutput
}

// DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
type PriorityClassPatchTypeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput `pulumi:"apiVersion"`
	// description is an arbitrary string that usually provides guidelines on when this priority class should be used.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
	GlobalDefault pulumi.BoolPtrInput `pulumi:"globalDefault"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput `pulumi:"metadata"`
	// PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
	PreemptionPolicy pulumi.StringPtrInput `pulumi:"preemptionPolicy"`
	// The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
	Value pulumi.IntPtrInput `pulumi:"value"`
}

func (PriorityClassPatchTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PriorityClassPatchType)(nil)).Elem()
}

func (i PriorityClassPatchTypeArgs) ToPriorityClassPatchTypeOutput() PriorityClassPatchTypeOutput {
	return i.ToPriorityClassPatchTypeOutputWithContext(context.Background())
}

func (i PriorityClassPatchTypeArgs) ToPriorityClassPatchTypeOutputWithContext(ctx context.Context) PriorityClassPatchTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PriorityClassPatchTypeOutput)
}

// DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
type PriorityClassPatchTypeOutput struct{ *pulumi.OutputState }

func (PriorityClassPatchTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PriorityClassPatchType)(nil)).Elem()
}

func (o PriorityClassPatchTypeOutput) ToPriorityClassPatchTypeOutput() PriorityClassPatchTypeOutput {
	return o
}

func (o PriorityClassPatchTypeOutput) ToPriorityClassPatchTypeOutputWithContext(ctx context.Context) PriorityClassPatchTypeOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PriorityClassPatchTypeOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassPatchType) *string { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// description is an arbitrary string that usually provides guidelines on when this priority class should be used.
func (o PriorityClassPatchTypeOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassPatchType) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
func (o PriorityClassPatchTypeOutput) GlobalDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v PriorityClassPatchType) *bool { return v.GlobalDefault }).(pulumi.BoolPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PriorityClassPatchTypeOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassPatchType) *string { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o PriorityClassPatchTypeOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v PriorityClassPatchType) *metav1.ObjectMetaPatch { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
func (o PriorityClassPatchTypeOutput) PreemptionPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PriorityClassPatchType) *string { return v.PreemptionPolicy }).(pulumi.StringPtrOutput)
}

// The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
func (o PriorityClassPatchTypeOutput) Value() pulumi.IntPtrOutput {
	return o.ApplyT(func(v PriorityClassPatchType) *int { return v.Value }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PriorityClassTypeInput)(nil)).Elem(), PriorityClassTypeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PriorityClassTypeArrayInput)(nil)).Elem(), PriorityClassTypeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PriorityClassListTypeInput)(nil)).Elem(), PriorityClassListTypeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PriorityClassPatchTypeInput)(nil)).Elem(), PriorityClassPatchTypeArgs{})
	pulumi.RegisterOutputType(PriorityClassTypeOutput{})
	pulumi.RegisterOutputType(PriorityClassTypeArrayOutput{})
	pulumi.RegisterOutputType(PriorityClassListTypeOutput{})
	pulumi.RegisterOutputType(PriorityClassPatchTypeOutput{})
}
