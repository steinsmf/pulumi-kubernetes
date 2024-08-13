// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	"errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/utilities"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ValidatingAdmissionPolicyBindingList is a list of ValidatingAdmissionPolicyBinding.
type ValidatingAdmissionPolicyBindingList struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// List of PolicyBinding.
	Items ValidatingAdmissionPolicyBindingTypeArrayOutput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata metav1.ListMetaOutput `pulumi:"metadata"`
}

// NewValidatingAdmissionPolicyBindingList registers a new resource with the given unique name, arguments, and options.
func NewValidatingAdmissionPolicyBindingList(ctx *pulumi.Context,
	name string, args *ValidatingAdmissionPolicyBindingListArgs, opts ...pulumi.ResourceOption) (*ValidatingAdmissionPolicyBindingList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Items == nil {
		return nil, errors.New("invalid value for required argument 'Items'")
	}
	args.ApiVersion = pulumi.StringPtr("admissionregistration.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("ValidatingAdmissionPolicyBindingList")
	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource ValidatingAdmissionPolicyBindingList
	err := ctx.RegisterResource("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicyBindingList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetValidatingAdmissionPolicyBindingList gets an existing ValidatingAdmissionPolicyBindingList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetValidatingAdmissionPolicyBindingList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ValidatingAdmissionPolicyBindingListState, opts ...pulumi.ResourceOption) (*ValidatingAdmissionPolicyBindingList, error) {
	var resource ValidatingAdmissionPolicyBindingList
	err := ctx.ReadResource("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicyBindingList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ValidatingAdmissionPolicyBindingList resources.
type validatingAdmissionPolicyBindingListState struct {
}

type ValidatingAdmissionPolicyBindingListState struct {
}

func (ValidatingAdmissionPolicyBindingListState) ElementType() reflect.Type {
	return reflect.TypeOf((*validatingAdmissionPolicyBindingListState)(nil)).Elem()
}

type validatingAdmissionPolicyBindingListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// List of PolicyBinding.
	Items []ValidatingAdmissionPolicyBindingType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// The set of arguments for constructing a ValidatingAdmissionPolicyBindingList resource.
type ValidatingAdmissionPolicyBindingListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// List of PolicyBinding.
	Items ValidatingAdmissionPolicyBindingTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata metav1.ListMetaPtrInput
}

func (ValidatingAdmissionPolicyBindingListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*validatingAdmissionPolicyBindingListArgs)(nil)).Elem()
}

type ValidatingAdmissionPolicyBindingListInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyBindingListOutput() ValidatingAdmissionPolicyBindingListOutput
	ToValidatingAdmissionPolicyBindingListOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingListOutput
}

func (*ValidatingAdmissionPolicyBindingList) ElementType() reflect.Type {
	return reflect.TypeOf((**ValidatingAdmissionPolicyBindingList)(nil)).Elem()
}

func (i *ValidatingAdmissionPolicyBindingList) ToValidatingAdmissionPolicyBindingListOutput() ValidatingAdmissionPolicyBindingListOutput {
	return i.ToValidatingAdmissionPolicyBindingListOutputWithContext(context.Background())
}

func (i *ValidatingAdmissionPolicyBindingList) ToValidatingAdmissionPolicyBindingListOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyBindingListOutput)
}

// ValidatingAdmissionPolicyBindingListArrayInput is an input type that accepts ValidatingAdmissionPolicyBindingListArray and ValidatingAdmissionPolicyBindingListArrayOutput values.
// You can construct a concrete instance of `ValidatingAdmissionPolicyBindingListArrayInput` via:
//
//	ValidatingAdmissionPolicyBindingListArray{ ValidatingAdmissionPolicyBindingListArgs{...} }
type ValidatingAdmissionPolicyBindingListArrayInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyBindingListArrayOutput() ValidatingAdmissionPolicyBindingListArrayOutput
	ToValidatingAdmissionPolicyBindingListArrayOutputWithContext(context.Context) ValidatingAdmissionPolicyBindingListArrayOutput
}

type ValidatingAdmissionPolicyBindingListArray []ValidatingAdmissionPolicyBindingListInput

func (ValidatingAdmissionPolicyBindingListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValidatingAdmissionPolicyBindingList)(nil)).Elem()
}

func (i ValidatingAdmissionPolicyBindingListArray) ToValidatingAdmissionPolicyBindingListArrayOutput() ValidatingAdmissionPolicyBindingListArrayOutput {
	return i.ToValidatingAdmissionPolicyBindingListArrayOutputWithContext(context.Background())
}

func (i ValidatingAdmissionPolicyBindingListArray) ToValidatingAdmissionPolicyBindingListArrayOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyBindingListArrayOutput)
}

// ValidatingAdmissionPolicyBindingListMapInput is an input type that accepts ValidatingAdmissionPolicyBindingListMap and ValidatingAdmissionPolicyBindingListMapOutput values.
// You can construct a concrete instance of `ValidatingAdmissionPolicyBindingListMapInput` via:
//
//	ValidatingAdmissionPolicyBindingListMap{ "key": ValidatingAdmissionPolicyBindingListArgs{...} }
type ValidatingAdmissionPolicyBindingListMapInput interface {
	pulumi.Input

	ToValidatingAdmissionPolicyBindingListMapOutput() ValidatingAdmissionPolicyBindingListMapOutput
	ToValidatingAdmissionPolicyBindingListMapOutputWithContext(context.Context) ValidatingAdmissionPolicyBindingListMapOutput
}

type ValidatingAdmissionPolicyBindingListMap map[string]ValidatingAdmissionPolicyBindingListInput

func (ValidatingAdmissionPolicyBindingListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValidatingAdmissionPolicyBindingList)(nil)).Elem()
}

func (i ValidatingAdmissionPolicyBindingListMap) ToValidatingAdmissionPolicyBindingListMapOutput() ValidatingAdmissionPolicyBindingListMapOutput {
	return i.ToValidatingAdmissionPolicyBindingListMapOutputWithContext(context.Background())
}

func (i ValidatingAdmissionPolicyBindingListMap) ToValidatingAdmissionPolicyBindingListMapOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValidatingAdmissionPolicyBindingListMapOutput)
}

type ValidatingAdmissionPolicyBindingListOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyBindingListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ValidatingAdmissionPolicyBindingList)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyBindingListOutput) ToValidatingAdmissionPolicyBindingListOutput() ValidatingAdmissionPolicyBindingListOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingListOutput) ToValidatingAdmissionPolicyBindingListOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingListOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ValidatingAdmissionPolicyBindingListOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBindingList) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// List of PolicyBinding.
func (o ValidatingAdmissionPolicyBindingListOutput) Items() ValidatingAdmissionPolicyBindingTypeArrayOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBindingList) ValidatingAdmissionPolicyBindingTypeArrayOutput {
		return v.Items
	}).(ValidatingAdmissionPolicyBindingTypeArrayOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ValidatingAdmissionPolicyBindingListOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBindingList) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ValidatingAdmissionPolicyBindingListOutput) Metadata() metav1.ListMetaOutput {
	return o.ApplyT(func(v *ValidatingAdmissionPolicyBindingList) metav1.ListMetaOutput { return v.Metadata }).(metav1.ListMetaOutput)
}

type ValidatingAdmissionPolicyBindingListArrayOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyBindingListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValidatingAdmissionPolicyBindingList)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyBindingListArrayOutput) ToValidatingAdmissionPolicyBindingListArrayOutput() ValidatingAdmissionPolicyBindingListArrayOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingListArrayOutput) ToValidatingAdmissionPolicyBindingListArrayOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingListArrayOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingListArrayOutput) Index(i pulumi.IntInput) ValidatingAdmissionPolicyBindingListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ValidatingAdmissionPolicyBindingList {
		return vs[0].([]*ValidatingAdmissionPolicyBindingList)[vs[1].(int)]
	}).(ValidatingAdmissionPolicyBindingListOutput)
}

type ValidatingAdmissionPolicyBindingListMapOutput struct{ *pulumi.OutputState }

func (ValidatingAdmissionPolicyBindingListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValidatingAdmissionPolicyBindingList)(nil)).Elem()
}

func (o ValidatingAdmissionPolicyBindingListMapOutput) ToValidatingAdmissionPolicyBindingListMapOutput() ValidatingAdmissionPolicyBindingListMapOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingListMapOutput) ToValidatingAdmissionPolicyBindingListMapOutputWithContext(ctx context.Context) ValidatingAdmissionPolicyBindingListMapOutput {
	return o
}

func (o ValidatingAdmissionPolicyBindingListMapOutput) MapIndex(k pulumi.StringInput) ValidatingAdmissionPolicyBindingListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ValidatingAdmissionPolicyBindingList {
		return vs[0].(map[string]*ValidatingAdmissionPolicyBindingList)[vs[1].(string)]
	}).(ValidatingAdmissionPolicyBindingListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyBindingListInput)(nil)).Elem(), &ValidatingAdmissionPolicyBindingList{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyBindingListArrayInput)(nil)).Elem(), ValidatingAdmissionPolicyBindingListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValidatingAdmissionPolicyBindingListMapInput)(nil)).Elem(), ValidatingAdmissionPolicyBindingListMap{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyBindingListOutput{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyBindingListArrayOutput{})
	pulumi.RegisterOutputType(ValidatingAdmissionPolicyBindingListMapOutput{})
}
