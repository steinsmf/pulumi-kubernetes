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

// EndpointsList is a list of endpoints.
type EndpointsList struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// List of endpoints.
	Items EndpointsTypeArrayOutput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata metav1.ListMetaPtrOutput `pulumi:"metadata"`
}

// NewEndpointsList registers a new resource with the given unique name, arguments, and options.
func NewEndpointsList(ctx *pulumi.Context,
	name string, args *EndpointsListArgs, opts ...pulumi.ResourceOption) (*EndpointsList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Items == nil {
		return nil, errors.New("invalid value for required argument 'Items'")
	}
	args.ApiVersion = pulumi.StringPtr("v1")
	args.Kind = pulumi.StringPtr("EndpointsList")
	var resource EndpointsList
	err := ctx.RegisterResource("kubernetes:core/v1:EndpointsList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEndpointsList gets an existing EndpointsList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEndpointsList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EndpointsListState, opts ...pulumi.ResourceOption) (*EndpointsList, error) {
	var resource EndpointsList
	err := ctx.ReadResource("kubernetes:core/v1:EndpointsList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EndpointsList resources.
type endpointsListState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// List of endpoints.
	Items []EndpointsType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

type EndpointsListState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// List of endpoints.
	Items EndpointsTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata metav1.ListMetaPtrInput
}

func (EndpointsListState) ElementType() reflect.Type {
	return reflect.TypeOf((*endpointsListState)(nil)).Elem()
}

type endpointsListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// List of endpoints.
	Items []EndpointsType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// The set of arguments for constructing a EndpointsList resource.
type EndpointsListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// List of endpoints.
	Items EndpointsTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata metav1.ListMetaPtrInput
}

func (EndpointsListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*endpointsListArgs)(nil)).Elem()
}

type EndpointsListInput interface {
	pulumi.Input

	ToEndpointsListOutput() EndpointsListOutput
	ToEndpointsListOutputWithContext(ctx context.Context) EndpointsListOutput
}

func (*EndpointsList) ElementType() reflect.Type {
	return reflect.TypeOf((*EndpointsList)(nil))
}

func (i *EndpointsList) ToEndpointsListOutput() EndpointsListOutput {
	return i.ToEndpointsListOutputWithContext(context.Background())
}

func (i *EndpointsList) ToEndpointsListOutputWithContext(ctx context.Context) EndpointsListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsListOutput)
}

func (i *EndpointsList) ToEndpointsListPtrOutput() EndpointsListPtrOutput {
	return i.ToEndpointsListPtrOutputWithContext(context.Background())
}

func (i *EndpointsList) ToEndpointsListPtrOutputWithContext(ctx context.Context) EndpointsListPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsListPtrOutput)
}

type EndpointsListPtrInput interface {
	pulumi.Input

	ToEndpointsListPtrOutput() EndpointsListPtrOutput
	ToEndpointsListPtrOutputWithContext(ctx context.Context) EndpointsListPtrOutput
}

type endpointsListPtrType EndpointsListArgs

func (*endpointsListPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EndpointsList)(nil))
}

func (i *endpointsListPtrType) ToEndpointsListPtrOutput() EndpointsListPtrOutput {
	return i.ToEndpointsListPtrOutputWithContext(context.Background())
}

func (i *endpointsListPtrType) ToEndpointsListPtrOutputWithContext(ctx context.Context) EndpointsListPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsListPtrOutput)
}

// EndpointsListArrayInput is an input type that accepts EndpointsListArray and EndpointsListArrayOutput values.
// You can construct a concrete instance of `EndpointsListArrayInput` via:
//
//          EndpointsListArray{ EndpointsListArgs{...} }
type EndpointsListArrayInput interface {
	pulumi.Input

	ToEndpointsListArrayOutput() EndpointsListArrayOutput
	ToEndpointsListArrayOutputWithContext(context.Context) EndpointsListArrayOutput
}

type EndpointsListArray []EndpointsListInput

func (EndpointsListArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*EndpointsList)(nil))
}

func (i EndpointsListArray) ToEndpointsListArrayOutput() EndpointsListArrayOutput {
	return i.ToEndpointsListArrayOutputWithContext(context.Background())
}

func (i EndpointsListArray) ToEndpointsListArrayOutputWithContext(ctx context.Context) EndpointsListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsListArrayOutput)
}

// EndpointsListMapInput is an input type that accepts EndpointsListMap and EndpointsListMapOutput values.
// You can construct a concrete instance of `EndpointsListMapInput` via:
//
//          EndpointsListMap{ "key": EndpointsListArgs{...} }
type EndpointsListMapInput interface {
	pulumi.Input

	ToEndpointsListMapOutput() EndpointsListMapOutput
	ToEndpointsListMapOutputWithContext(context.Context) EndpointsListMapOutput
}

type EndpointsListMap map[string]EndpointsListInput

func (EndpointsListMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*EndpointsList)(nil))
}

func (i EndpointsListMap) ToEndpointsListMapOutput() EndpointsListMapOutput {
	return i.ToEndpointsListMapOutputWithContext(context.Background())
}

func (i EndpointsListMap) ToEndpointsListMapOutputWithContext(ctx context.Context) EndpointsListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsListMapOutput)
}

type EndpointsListOutput struct {
	*pulumi.OutputState
}

func (EndpointsListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EndpointsList)(nil))
}

func (o EndpointsListOutput) ToEndpointsListOutput() EndpointsListOutput {
	return o
}

func (o EndpointsListOutput) ToEndpointsListOutputWithContext(ctx context.Context) EndpointsListOutput {
	return o
}

func (o EndpointsListOutput) ToEndpointsListPtrOutput() EndpointsListPtrOutput {
	return o.ToEndpointsListPtrOutputWithContext(context.Background())
}

func (o EndpointsListOutput) ToEndpointsListPtrOutputWithContext(ctx context.Context) EndpointsListPtrOutput {
	return o.ApplyT(func(v EndpointsList) *EndpointsList {
		return &v
	}).(EndpointsListPtrOutput)
}

type EndpointsListPtrOutput struct {
	*pulumi.OutputState
}

func (EndpointsListPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EndpointsList)(nil))
}

func (o EndpointsListPtrOutput) ToEndpointsListPtrOutput() EndpointsListPtrOutput {
	return o
}

func (o EndpointsListPtrOutput) ToEndpointsListPtrOutputWithContext(ctx context.Context) EndpointsListPtrOutput {
	return o
}

type EndpointsListArrayOutput struct{ *pulumi.OutputState }

func (EndpointsListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EndpointsList)(nil))
}

func (o EndpointsListArrayOutput) ToEndpointsListArrayOutput() EndpointsListArrayOutput {
	return o
}

func (o EndpointsListArrayOutput) ToEndpointsListArrayOutputWithContext(ctx context.Context) EndpointsListArrayOutput {
	return o
}

func (o EndpointsListArrayOutput) Index(i pulumi.IntInput) EndpointsListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) EndpointsList {
		return vs[0].([]EndpointsList)[vs[1].(int)]
	}).(EndpointsListOutput)
}

type EndpointsListMapOutput struct{ *pulumi.OutputState }

func (EndpointsListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]EndpointsList)(nil))
}

func (o EndpointsListMapOutput) ToEndpointsListMapOutput() EndpointsListMapOutput {
	return o
}

func (o EndpointsListMapOutput) ToEndpointsListMapOutputWithContext(ctx context.Context) EndpointsListMapOutput {
	return o
}

func (o EndpointsListMapOutput) MapIndex(k pulumi.StringInput) EndpointsListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) EndpointsList {
		return vs[0].(map[string]EndpointsList)[vs[1].(string)]
	}).(EndpointsListOutput)
}

func init() {
	pulumi.RegisterOutputType(EndpointsListOutput{})
	pulumi.RegisterOutputType(EndpointsListPtrOutput{})
	pulumi.RegisterOutputType(EndpointsListArrayOutput{})
	pulumi.RegisterOutputType(EndpointsListMapOutput{})
}
