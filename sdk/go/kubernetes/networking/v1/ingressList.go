// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// IngressList is a collection of Ingress.
type IngressList struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// items is the list of Ingress.
	Items IngressTypeArrayOutput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaOutput `pulumi:"metadata"`
}

// NewIngressList registers a new resource with the given unique name, arguments, and options.
func NewIngressList(ctx *pulumi.Context,
	name string, args *IngressListArgs, opts ...pulumi.ResourceOption) (*IngressList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Items == nil {
		return nil, errors.New("invalid value for required argument 'Items'")
	}
	args.ApiVersion = pulumi.StringPtr("networking.k8s.io/v1")
	args.Kind = pulumi.StringPtr("IngressList")
	var resource IngressList
	err := ctx.RegisterResource("kubernetes:networking.k8s.io/v1:IngressList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIngressList gets an existing IngressList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIngressList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IngressListState, opts ...pulumi.ResourceOption) (*IngressList, error) {
	var resource IngressList
	err := ctx.ReadResource("kubernetes:networking.k8s.io/v1:IngressList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IngressList resources.
type ingressListState struct {
}

type IngressListState struct {
}

func (IngressListState) ElementType() reflect.Type {
	return reflect.TypeOf((*ingressListState)(nil)).Elem()
}

type ingressListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// items is the list of Ingress.
	Items []IngressType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// The set of arguments for constructing a IngressList resource.
type IngressListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// items is the list of Ingress.
	Items IngressTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrInput
}

func (IngressListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ingressListArgs)(nil)).Elem()
}

type IngressListInput interface {
	pulumi.Input

	ToIngressListOutput() IngressListOutput
	ToIngressListOutputWithContext(ctx context.Context) IngressListOutput
}

func (*IngressList) ElementType() reflect.Type {
	return reflect.TypeOf((**IngressList)(nil)).Elem()
}

func (i *IngressList) ToIngressListOutput() IngressListOutput {
	return i.ToIngressListOutputWithContext(context.Background())
}

func (i *IngressList) ToIngressListOutputWithContext(ctx context.Context) IngressListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressListOutput)
}

// IngressListArrayInput is an input type that accepts IngressListArray and IngressListArrayOutput values.
// You can construct a concrete instance of `IngressListArrayInput` via:
//
//	IngressListArray{ IngressListArgs{...} }
type IngressListArrayInput interface {
	pulumi.Input

	ToIngressListArrayOutput() IngressListArrayOutput
	ToIngressListArrayOutputWithContext(context.Context) IngressListArrayOutput
}

type IngressListArray []IngressListInput

func (IngressListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngressList)(nil)).Elem()
}

func (i IngressListArray) ToIngressListArrayOutput() IngressListArrayOutput {
	return i.ToIngressListArrayOutputWithContext(context.Background())
}

func (i IngressListArray) ToIngressListArrayOutputWithContext(ctx context.Context) IngressListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressListArrayOutput)
}

// IngressListMapInput is an input type that accepts IngressListMap and IngressListMapOutput values.
// You can construct a concrete instance of `IngressListMapInput` via:
//
//	IngressListMap{ "key": IngressListArgs{...} }
type IngressListMapInput interface {
	pulumi.Input

	ToIngressListMapOutput() IngressListMapOutput
	ToIngressListMapOutputWithContext(context.Context) IngressListMapOutput
}

type IngressListMap map[string]IngressListInput

func (IngressListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngressList)(nil)).Elem()
}

func (i IngressListMap) ToIngressListMapOutput() IngressListMapOutput {
	return i.ToIngressListMapOutputWithContext(context.Background())
}

func (i IngressListMap) ToIngressListMapOutputWithContext(ctx context.Context) IngressListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressListMapOutput)
}

type IngressListOutput struct{ *pulumi.OutputState }

func (IngressListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IngressList)(nil)).Elem()
}

func (o IngressListOutput) ToIngressListOutput() IngressListOutput {
	return o
}

func (o IngressListOutput) ToIngressListOutputWithContext(ctx context.Context) IngressListOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o IngressListOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *IngressList) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// items is the list of Ingress.
func (o IngressListOutput) Items() IngressTypeArrayOutput {
	return o.ApplyT(func(v *IngressList) IngressTypeArrayOutput { return v.Items }).(IngressTypeArrayOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o IngressListOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *IngressList) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o IngressListOutput) Metadata() metav1.ListMetaOutput {
	return o.ApplyT(func(v *IngressList) metav1.ListMetaOutput { return v.Metadata }).(metav1.ListMetaOutput)
}

type IngressListArrayOutput struct{ *pulumi.OutputState }

func (IngressListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngressList)(nil)).Elem()
}

func (o IngressListArrayOutput) ToIngressListArrayOutput() IngressListArrayOutput {
	return o
}

func (o IngressListArrayOutput) ToIngressListArrayOutputWithContext(ctx context.Context) IngressListArrayOutput {
	return o
}

func (o IngressListArrayOutput) Index(i pulumi.IntInput) IngressListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IngressList {
		return vs[0].([]*IngressList)[vs[1].(int)]
	}).(IngressListOutput)
}

type IngressListMapOutput struct{ *pulumi.OutputState }

func (IngressListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngressList)(nil)).Elem()
}

func (o IngressListMapOutput) ToIngressListMapOutput() IngressListMapOutput {
	return o
}

func (o IngressListMapOutput) ToIngressListMapOutputWithContext(ctx context.Context) IngressListMapOutput {
	return o
}

func (o IngressListMapOutput) MapIndex(k pulumi.StringInput) IngressListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IngressList {
		return vs[0].(map[string]*IngressList)[vs[1].(string)]
	}).(IngressListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IngressListInput)(nil)).Elem(), &IngressList{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngressListArrayInput)(nil)).Elem(), IngressListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngressListMapInput)(nil)).Elem(), IngressListMap{})
	pulumi.RegisterOutputType(IngressListOutput{})
	pulumi.RegisterOutputType(IngressListArrayOutput{})
	pulumi.RegisterOutputType(IngressListMapOutput{})
}
