// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// CSINodeList is a collection of CSINode objects.
type CSINodeList struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// items is the list of CSINode
	Items CSINodeTypeArrayOutput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrOutput `pulumi:"metadata"`
}

// NewCSINodeList registers a new resource with the given unique name, arguments, and options.
func NewCSINodeList(ctx *pulumi.Context,
	name string, args *CSINodeListArgs, opts ...pulumi.ResourceOption) (*CSINodeList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Items == nil {
		return nil, errors.New("invalid value for required argument 'Items'")
	}
	args.ApiVersion = pulumi.StringPtr("storage.k8s.io/v1")
	args.Kind = pulumi.StringPtr("CSINodeList")
	var resource CSINodeList
	err := ctx.RegisterResource("kubernetes:storage.k8s.io/v1:CSINodeList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCSINodeList gets an existing CSINodeList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCSINodeList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CSINodeListState, opts ...pulumi.ResourceOption) (*CSINodeList, error) {
	var resource CSINodeList
	err := ctx.ReadResource("kubernetes:storage.k8s.io/v1:CSINodeList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CSINodeList resources.
type csinodeListState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// items is the list of CSINode
	Items []CSINodeType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

type CSINodeListState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// items is the list of CSINode
	Items CSINodeTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrInput
}

func (CSINodeListState) ElementType() reflect.Type {
	return reflect.TypeOf((*csinodeListState)(nil)).Elem()
}

type csinodeListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// items is the list of CSINode
	Items []CSINodeType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// The set of arguments for constructing a CSINodeList resource.
type CSINodeListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// items is the list of CSINode
	Items CSINodeTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrInput
}

func (CSINodeListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*csinodeListArgs)(nil)).Elem()
}

type CSINodeListInput interface {
	pulumi.Input

	ToCSINodeListOutput() CSINodeListOutput
	ToCSINodeListOutputWithContext(ctx context.Context) CSINodeListOutput
}

func (*CSINodeList) ElementType() reflect.Type {
	return reflect.TypeOf((*CSINodeList)(nil))
}

func (i *CSINodeList) ToCSINodeListOutput() CSINodeListOutput {
	return i.ToCSINodeListOutputWithContext(context.Background())
}

func (i *CSINodeList) ToCSINodeListOutputWithContext(ctx context.Context) CSINodeListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CSINodeListOutput)
}

func (i *CSINodeList) ToCSINodeListPtrOutput() CSINodeListPtrOutput {
	return i.ToCSINodeListPtrOutputWithContext(context.Background())
}

func (i *CSINodeList) ToCSINodeListPtrOutputWithContext(ctx context.Context) CSINodeListPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CSINodeListPtrOutput)
}

type CSINodeListPtrInput interface {
	pulumi.Input

	ToCSINodeListPtrOutput() CSINodeListPtrOutput
	ToCSINodeListPtrOutputWithContext(ctx context.Context) CSINodeListPtrOutput
}

type csinodeListPtrType CSINodeListArgs

func (*csinodeListPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CSINodeList)(nil))
}

func (i *csinodeListPtrType) ToCSINodeListPtrOutput() CSINodeListPtrOutput {
	return i.ToCSINodeListPtrOutputWithContext(context.Background())
}

func (i *csinodeListPtrType) ToCSINodeListPtrOutputWithContext(ctx context.Context) CSINodeListPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CSINodeListPtrOutput)
}

// CSINodeListArrayInput is an input type that accepts CSINodeListArray and CSINodeListArrayOutput values.
// You can construct a concrete instance of `CSINodeListArrayInput` via:
//
//          CSINodeListArray{ CSINodeListArgs{...} }
type CSINodeListArrayInput interface {
	pulumi.Input

	ToCSINodeListArrayOutput() CSINodeListArrayOutput
	ToCSINodeListArrayOutputWithContext(context.Context) CSINodeListArrayOutput
}

type CSINodeListArray []CSINodeListInput

func (CSINodeListArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CSINodeList)(nil))
}

func (i CSINodeListArray) ToCSINodeListArrayOutput() CSINodeListArrayOutput {
	return i.ToCSINodeListArrayOutputWithContext(context.Background())
}

func (i CSINodeListArray) ToCSINodeListArrayOutputWithContext(ctx context.Context) CSINodeListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CSINodeListArrayOutput)
}

// CSINodeListMapInput is an input type that accepts CSINodeListMap and CSINodeListMapOutput values.
// You can construct a concrete instance of `CSINodeListMapInput` via:
//
//          CSINodeListMap{ "key": CSINodeListArgs{...} }
type CSINodeListMapInput interface {
	pulumi.Input

	ToCSINodeListMapOutput() CSINodeListMapOutput
	ToCSINodeListMapOutputWithContext(context.Context) CSINodeListMapOutput
}

type CSINodeListMap map[string]CSINodeListInput

func (CSINodeListMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CSINodeList)(nil))
}

func (i CSINodeListMap) ToCSINodeListMapOutput() CSINodeListMapOutput {
	return i.ToCSINodeListMapOutputWithContext(context.Background())
}

func (i CSINodeListMap) ToCSINodeListMapOutputWithContext(ctx context.Context) CSINodeListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CSINodeListMapOutput)
}

type CSINodeListOutput struct {
	*pulumi.OutputState
}

func (CSINodeListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CSINodeList)(nil))
}

func (o CSINodeListOutput) ToCSINodeListOutput() CSINodeListOutput {
	return o
}

func (o CSINodeListOutput) ToCSINodeListOutputWithContext(ctx context.Context) CSINodeListOutput {
	return o
}

func (o CSINodeListOutput) ToCSINodeListPtrOutput() CSINodeListPtrOutput {
	return o.ToCSINodeListPtrOutputWithContext(context.Background())
}

func (o CSINodeListOutput) ToCSINodeListPtrOutputWithContext(ctx context.Context) CSINodeListPtrOutput {
	return o.ApplyT(func(v CSINodeList) *CSINodeList {
		return &v
	}).(CSINodeListPtrOutput)
}

type CSINodeListPtrOutput struct {
	*pulumi.OutputState
}

func (CSINodeListPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CSINodeList)(nil))
}

func (o CSINodeListPtrOutput) ToCSINodeListPtrOutput() CSINodeListPtrOutput {
	return o
}

func (o CSINodeListPtrOutput) ToCSINodeListPtrOutputWithContext(ctx context.Context) CSINodeListPtrOutput {
	return o
}

type CSINodeListArrayOutput struct{ *pulumi.OutputState }

func (CSINodeListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CSINodeList)(nil))
}

func (o CSINodeListArrayOutput) ToCSINodeListArrayOutput() CSINodeListArrayOutput {
	return o
}

func (o CSINodeListArrayOutput) ToCSINodeListArrayOutputWithContext(ctx context.Context) CSINodeListArrayOutput {
	return o
}

func (o CSINodeListArrayOutput) Index(i pulumi.IntInput) CSINodeListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CSINodeList {
		return vs[0].([]CSINodeList)[vs[1].(int)]
	}).(CSINodeListOutput)
}

type CSINodeListMapOutput struct{ *pulumi.OutputState }

func (CSINodeListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CSINodeList)(nil))
}

func (o CSINodeListMapOutput) ToCSINodeListMapOutput() CSINodeListMapOutput {
	return o
}

func (o CSINodeListMapOutput) ToCSINodeListMapOutputWithContext(ctx context.Context) CSINodeListMapOutput {
	return o
}

func (o CSINodeListMapOutput) MapIndex(k pulumi.StringInput) CSINodeListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CSINodeList {
		return vs[0].(map[string]CSINodeList)[vs[1].(string)]
	}).(CSINodeListOutput)
}

func init() {
	pulumi.RegisterOutputType(CSINodeListOutput{})
	pulumi.RegisterOutputType(CSINodeListPtrOutput{})
	pulumi.RegisterOutputType(CSINodeListArrayOutput{})
	pulumi.RegisterOutputType(CSINodeListMapOutput{})
}
