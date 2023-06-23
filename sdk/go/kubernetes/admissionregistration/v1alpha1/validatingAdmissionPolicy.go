// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ValidatingAdmissionPolicy describes the definition of an admission validation policy that accepts or rejects an object without changing it.
type ValidatingAdmissionPolicy struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata metav1.ObjectMetaOutput `pulumi:"metadata"`
	// Specification of the desired behavior of the ValidatingAdmissionPolicy.
	Spec ValidatingAdmissionPolicySpecOutput `pulumi:"spec"`
	// The status of the ValidatingAdmissionPolicy, including warnings that are useful to determine if the policy behaves in the expected way. Populated by the system. Read-only.
	Status ValidatingAdmissionPolicyStatusPtrOutput `pulumi:"status"`
}

// NewValidatingAdmissionPolicy registers a new resource with the given unique name, arguments, and options.
func NewValidatingAdmissionPolicy(ctx *pulumi.Context,
	name string, args *ValidatingAdmissionPolicyArgs, opts ...pulumi.ResourceOption) (*ValidatingAdmissionPolicy, error) {
	if args == nil {
		args = &ValidatingAdmissionPolicyArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("admissionregistration.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("ValidatingAdmissionPolicy")
	var resource ValidatingAdmissionPolicy
	err := ctx.RegisterResource("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetValidatingAdmissionPolicy gets an existing ValidatingAdmissionPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetValidatingAdmissionPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ValidatingAdmissionPolicyState, opts ...pulumi.ResourceOption) (*ValidatingAdmissionPolicy, error) {
	var resource ValidatingAdmissionPolicy
	err := ctx.ReadResource("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ValidatingAdmissionPolicy resources.
type validatingAdmissionPolicyState struct {
}

type ValidatingAdmissionPolicyState struct {
}

func (ValidatingAdmissionPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*validatingAdmissionPolicyState)(nil)).Elem()
}

type validatingAdmissionPolicyArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Specification of the desired behavior of the ValidatingAdmissionPolicy.
	Spec *ValidatingAdmissionPolicySpec `pulumi:"spec"`
}

// The set of arguments for constructing a ValidatingAdmissionPolicy resource.
type ValidatingAdmissionPolicyArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata metav1.ObjectMetaPtrInput
	// Specification of the desired behavior of the ValidatingAdmissionPolicy.
	Spec ValidatingAdmissionPolicySpecPtrInput
}

func (ValidatingAdmissionPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*validatingAdmissionPolicyArgs)(nil)).Elem()
}

type ValidatingAdmissionPolicyInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyOutput() ValidatingAdmissionPolicyOutput
	ToValidatingAdmissionPolicyOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyOutput
}

func (*ValidatingAdmissionPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ValidatingAdmissionPolicy)(nil)).Elem()
}

func (i *ValidatingAdmissionPolicy) ToValidatingAdmissionPolicyOutput() ValidatingAdmissionPolicyOutput {
	return i.ToValidatingAdmissionPolicyOutputWithContext(context.Background())
}

func (i *ValidatingAdmissionPolicy) ToValidatingAdmissionPolicyOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyOutput)
}

// ValidatingAdmissionPolicyArrayInput is an input type that accepts ValidatingAdmissionPolicyArray and ValidatingAdmissionPolicyArrayOutput values.
// You can construct a concrete instance of `ValidatingAdmissionPolicyArrayInput` via:
//
//	ValidatingAdmissionPolicyArray{ ValidatingAdmissionPolicyArgs{...} }
type ValidatingAdmissionPolicyArrayInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyArrayOutput() ValidatingAdmissionPolicyArrayOutput
	ToValidatingAdmissionPolicyArrayOutputWithContext(context.Context) ValidatingAdmissionPolicyArrayOutput
}

type ValidatingAdmissionPolicyArray []ValidatingAdmissionPolicyInput

func (ValidatingAdmissionPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValidatingAdmissionPolicy)(nil)).Elem()
}

func (i ValidatingAdmissionPolicyArray) ToValidatingAdmissionPolicyArrayOutput() ValidatingAdmissionPolicyArrayOutput {
	return i.ToValidatingAdmissionPolicyArrayOutputWithContext(context.Background())
}

func (i ValidatingAdmissionPolicyArray) ToValidatingAdmissionPolicyArrayOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyArrayOutput)
}

// ValidatingAdmissionPolicyMapInput is an input type that accepts ValidatingAdmissionPolicyMap and ValidatingAdmissionPolicyMapOutput values.
// You can construct a concrete instance of `ValidatingAdmissionPolicyMapInput` via:
//
//	ValidatingAdmissionPolicyMap{ "key": ValidatingAdmissionPolicyArgs{...} }
type ValidatingAdmissionPolicyMapInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyMapOutput() ValidatingAdmissionPolicyMapOutput
	ToValidatingAdmissionPolicyMapOutputWithContext(context.Context) ValidatingAdmissionPolicyMapOutput
}

type ValidatingAdmissionPolicyMap map[string]ValidatingAdmissionPolicyInput

func (ValidatingAdmissionPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValidatingAdmissionPolicy)(nil)).Elem()
}

func (i ValidatingAdmissionPolicyMap) ToValidatingAdmissionPolicyMapOutput() ValidatingAdmissionPolicyMapOutput {
	return i.ToValidatingAdmissionPolicyMapOutputWithContext(context.Background())
}

func (i ValidatingAdmissionPolicyMap) ToValidatingAdmissionPolicyMapOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyMapOutput)
}

type ValidatingAdmissionPolicyOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ValidatingAdmissionPolicy)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyOutput) ToValidatingAdmissionPolicyOutput() ValidatingAdmissionPolicyOutput {
	return o
}

func (o ValidatingAdmissionPolicyOutput) ToValidatingAdmissionPolicyOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ValidatingAdmissionPolicyOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicy) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ValidatingAdmissionPolicyOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicy) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
func (o ValidatingAdmissionPolicyOutput) Metadata() metav1.ObjectMetaOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicy) metav1.ObjectMetaOutput { return v.Metadata }).(metav1.ObjectMetaOutput)
}

// Specification of the desired behavior of the ValidatingAdmissionPolicy.
func (o ValidatingAdmissionPolicyOutput) Spec() ValidatingAdmissionPolicySpecOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicy) ValidatingAdmissionPolicySpecOutput { return v.Spec }).(ValidatingAdmissionPolicySpecOutput)
}

// The status of the ValidatingAdmissionPolicy, including warnings that are useful to determine if the policy behaves in the expected way. Populated by the system. Read-only.
func (o ValidatingAdmissionPolicyOutput) Status() ValidatingAdmissionPolicyStatusPtrOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicy) ValidatingAdmissionPolicyStatusPtrOutput { return v.Status }).(ValidatingAdmissionPolicyStatusPtrOutput)
}

type ValidatingAdmissionPolicyArrayOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValidatingAdmissionPolicy)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyArrayOutput) ToValidatingAdmissionPolicyArrayOutput() ValidatingAdmissionPolicyArrayOutput {
	return o
}

func (o ValidatingAdmissionPolicyArrayOutput) ToValidatingAdmissionPolicyArrayOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyArrayOutput {
	return o
}

func (o ValidatingAdmissionPolicyArrayOutput) Index(i pulumi.IntInput) ValidatingAdmissionPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ValidatingAdmissionPolicy {
		return vs[0].([]*ValidatingAdmissionPolicy)[vs[1].(int)]
	}).(ValidatingAdmissionPolicyOutput)
}

type ValidatingAdmissionPolicyMapOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValidatingAdmissionPolicy)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyMapOutput) ToValidatingAdmissionPolicyMapOutput() ValidatingAdmissionPolicyMapOutput {
	return o
}

func (o ValidatingAdmissionPolicyMapOutput) ToValidatingAdmissionPolicyMapOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyMapOutput {
	return o
}

func (o ValidatingAdmissionPolicyMapOutput) MapIndex(k pulumi.StringInput) ValidatingAdmissionPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ValidatingAdmissionPolicy {
		return vs[0].(map[string]*ValidatingAdmissionPolicy)[vs[1].(string)]
	}).(ValidatingAdmissionPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyInput)(nil)).Elem(), &ValidatingAdmissionPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyArrayInput)(nil)).Elem(), ValidatingAdmissionPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyMapInput)(nil)).Elem(), ValidatingAdmissionPolicyMap{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyOutput{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyArrayOutput{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyMapOutput{})
}
