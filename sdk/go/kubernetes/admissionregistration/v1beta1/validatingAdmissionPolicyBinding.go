// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/utilities"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ValidatingAdmissionPolicyBinding binds the ValidatingAdmissionPolicy with paramerized resources. ValidatingAdmissionPolicyBinding and parameter CRDs together define how cluster administrators configure policies for clusters.
//
// For a given admission request, each binding will cause its policy to be evaluated N times, where N is 1 for policies/bindings that don't use params, otherwise N is the number of parameters selected by the binding.
//
// The CEL expressions of a policy must have a computed CEL cost below the maximum CEL budget. Each evaluation of the policy is given an independent CEL cost budget. Adding/removing policies, bindings, or params can not affect whether a given (policy, binding, param) combination is within its own CEL budget.
type ValidatingAdmissionPolicyBinding struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata metav1.ObjectMetaOutput `pulumi:"metadata"`
	// Specification of the desired behavior of the ValidatingAdmissionPolicyBinding.
	Spec ValidatingAdmissionPolicyBindingSpecOutput `pulumi:"spec"`
}

// NewValidatingAdmissionPolicyBinding registers a new resource with the given unique name, arguments, and options.
func NewValidatingAdmissionPolicyBinding(ctx *pulumi.Context,
	name string, args *ValidatingAdmissionPolicyBindingArgs, opts ...pulumi.ResourceOption) (*ValidatingAdmissionPolicyBinding, error) {
	if args == nil {
		args = &ValidatingAdmissionPolicyBindingArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("admissionregistration.k8s.io/v1beta1")
	args.Kind = pulumi.StringPtr("ValidatingAdmissionPolicyBinding")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:admissionregistration.k8s.io/v1:ValidatingAdmissionPolicyBinding"),
		},
		{
			Type: pulumi.String("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicyBinding"),
		},
	})
	opts = append(opts, aliases)
	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource ValidatingAdmissionPolicyBinding
	err := ctx.RegisterResource("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingAdmissionPolicyBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetValidatingAdmissionPolicyBinding gets an existing ValidatingAdmissionPolicyBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetValidatingAdmissionPolicyBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ValidatingAdmissionPolicyBindingState, opts ...pulumi.ResourceOption) (*ValidatingAdmissionPolicyBinding, error) {
	var resource ValidatingAdmissionPolicyBinding
	err := ctx.ReadResource("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingAdmissionPolicyBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ValidatingAdmissionPolicyBinding resources.
type validatingAdmissionPolicyBindingState struct {
}

type ValidatingAdmissionPolicyBindingState struct {
}

func (ValidatingAdmissionPolicyBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*validatingAdmissionPolicyBindingState)(nil)).Elem()
}

type validatingAdmissionPolicyBindingArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Specification of the desired behavior of the ValidatingAdmissionPolicyBinding.
	Spec *ValidatingAdmissionPolicyBindingSpec `pulumi:"spec"`
}

// The set of arguments for constructing a ValidatingAdmissionPolicyBinding resource.
type ValidatingAdmissionPolicyBindingArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata metav1.ObjectMetaPtrInput
	// Specification of the desired behavior of the ValidatingAdmissionPolicyBinding.
	Spec ValidatingAdmissionPolicyBindingSpecPtrInput
}

func (ValidatingAdmissionPolicyBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*validatingAdmissionPolicyBindingArgs)(nil)).Elem()
}

type ValidatingAdmissionPolicyBindingInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyBindingOutput() ValidatingAdmissionPolicyBindingOutput
	ToValidatingAdmissionPolicyBindingOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingOutput
}

func (*ValidatingAdmissionPolicyBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**ValidatingAdmissionPolicyBinding)(nil)).Elem()
}

func (i *ValidatingAdmissionPolicyBinding) ToValidatingAdmissionPolicyBindingOutput() ValidatingAdmissionPolicyBindingOutput {
	return i.ToValidatingAdmissionPolicyBindingOutputWithContext(context.Background())
}

func (i *ValidatingAdmissionPolicyBinding) ToValidatingAdmissionPolicyBindingOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyBindingOutput)
}

// ValidatingAdmissionPolicyBindingArrayInput is an input type that accepts ValidatingAdmissionPolicyBindingArray and ValidatingAdmissionPolicyBindingArrayOutput values.
// You can construct a concrete instance of `ValidatingAdmissionPolicyBindingArrayInput` via:
//
//	ValidatingAdmissionPolicyBindingArray{ ValidatingAdmissionPolicyBindingArgs{...} }
type ValidatingAdmissionPolicyBindingArrayInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyBindingArrayOutput() ValidatingAdmissionPolicyBindingArrayOutput
	ToValidatingAdmissionPolicyBindingArrayOutputWithContext(context.Context) ValidatingAdmissionPolicyBindingArrayOutput
}

type ValidatingAdmissionPolicyBindingArray []ValidatingAdmissionPolicyBindingInput

func (ValidatingAdmissionPolicyBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValidatingAdmissionPolicyBinding)(nil)).Elem()
}

func (i ValidatingAdmissionPolicyBindingArray) ToValidatingAdmissionPolicyBindingArrayOutput() ValidatingAdmissionPolicyBindingArrayOutput {
	return i.ToValidatingAdmissionPolicyBindingArrayOutputWithContext(context.Background())
}

func (i ValidatingAdmissionPolicyBindingArray) ToValidatingAdmissionPolicyBindingArrayOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyBindingArrayOutput)
}

// ValidatingAdmissionPolicyBindingMapInput is an input type that accepts ValidatingAdmissionPolicyBindingMap and ValidatingAdmissionPolicyBindingMapOutput values.
// You can construct a concrete instance of `ValidatingAdmissionPolicyBindingMapInput` via:
//
//	ValidatingAdmissionPolicyBindingMap{ "key": ValidatingAdmissionPolicyBindingArgs{...} }
type ValidatingAdmissionPolicyBindingMapInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyBindingMapOutput() ValidatingAdmissionPolicyBindingMapOutput
	ToValidatingAdmissionPolicyBindingMapOutputWithContext(context.Context) ValidatingAdmissionPolicyBindingMapOutput
}

type ValidatingAdmissionPolicyBindingMap map[string]ValidatingAdmissionPolicyBindingInput

func (ValidatingAdmissionPolicyBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValidatingAdmissionPolicyBinding)(nil)).Elem()
}

func (i ValidatingAdmissionPolicyBindingMap) ToValidatingAdmissionPolicyBindingMapOutput() ValidatingAdmissionPolicyBindingMapOutput {
	return i.ToValidatingAdmissionPolicyBindingMapOutputWithContext(context.Background())
}

func (i ValidatingAdmissionPolicyBindingMap) ToValidatingAdmissionPolicyBindingMapOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyBindingMapOutput)
}

type ValidatingAdmissionPolicyBindingOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ValidatingAdmissionPolicyBinding)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyBindingOutput) ToValidatingAdmissionPolicyBindingOutput() ValidatingAdmissionPolicyBindingOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingOutput) ToValidatingAdmissionPolicyBindingOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ValidatingAdmissionPolicyBindingOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBinding) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ValidatingAdmissionPolicyBindingOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBinding) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
func (o ValidatingAdmissionPolicyBindingOutput) Metadata() metav1.ObjectMetaOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBinding) metav1.ObjectMetaOutput { return v.Metadata }).(metav1.ObjectMetaOutput)
}

// Specification of the desired behavior of the ValidatingAdmissionPolicyBinding.
func (o ValidatingAdmissionPolicyBindingOutput) Spec() ValidatingAdmissionPolicyBindingSpecOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBinding) ValidatingAdmissionPolicyBindingSpecOutput { return v.Spec }).(ValidatingAdmissionPolicyBindingSpecOutput)
}

type ValidatingAdmissionPolicyBindingArrayOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValidatingAdmissionPolicyBinding)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyBindingArrayOutput) ToValidatingAdmissionPolicyBindingArrayOutput() ValidatingAdmissionPolicyBindingArrayOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingArrayOutput) ToValidatingAdmissionPolicyBindingArrayOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingArrayOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingArrayOutput) Index(i pulumi.IntInput) ValidatingAdmissionPolicyBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ValidatingAdmissionPolicyBinding {
		return vs[0].([]*ValidatingAdmissionPolicyBinding)[vs[1].(int)]
	}).(ValidatingAdmissionPolicyBindingOutput)
}

type ValidatingAdmissionPolicyBindingMapOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValidatingAdmissionPolicyBinding)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyBindingMapOutput) ToValidatingAdmissionPolicyBindingMapOutput() ValidatingAdmissionPolicyBindingMapOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingMapOutput) ToValidatingAdmissionPolicyBindingMapOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingMapOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingMapOutput) MapIndex(k pulumi.StringInput) ValidatingAdmissionPolicyBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ValidatingAdmissionPolicyBinding {
		return vs[0].(map[string]*ValidatingAdmissionPolicyBinding)[vs[1].(string)]
	}).(ValidatingAdmissionPolicyBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyBindingInput)(nil)).Elem(), &ValidatingAdmissionPolicyBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyBindingArrayInput)(nil)).Elem(), ValidatingAdmissionPolicyBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyBindingMapInput)(nil)).Elem(), ValidatingAdmissionPolicyBindingMap{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyBindingOutput{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyBindingArrayOutput{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyBindingMapOutput{})
}
