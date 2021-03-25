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

// ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
type ControllerRevision struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Data is the serialized representation of the state.
	Data pulumi.AnyOutput `pulumi:"data"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// Revision indicates the revision of the state represented by Data.
	Revision pulumi.IntOutput `pulumi:"revision"`
}

// NewControllerRevision registers a new resource with the given unique name, arguments, and options.
func NewControllerRevision(ctx *pulumi.Context,
	name string, args *ControllerRevisionArgs, opts ...pulumi.ResourceOption) (*ControllerRevision, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Revision == nil {
		return nil, errors.New("invalid value for required argument 'Revision'")
	}
	args.ApiVersion = pulumi.StringPtr("apps/v1")
	args.Kind = pulumi.StringPtr("ControllerRevision")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:apps/v1beta1:ControllerRevision"),
		},
		{
			Type: pulumi.String("kubernetes:apps/v1beta2:ControllerRevision"),
		},
	})
	opts = append(opts, aliases)
	var resource ControllerRevision
	err := ctx.RegisterResource("kubernetes:apps/v1:ControllerRevision", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetControllerRevision gets an existing ControllerRevision resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetControllerRevision(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ControllerRevisionState, opts ...pulumi.ResourceOption) (*ControllerRevision, error) {
	var resource ControllerRevision
	err := ctx.ReadResource("kubernetes:apps/v1:ControllerRevision", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ControllerRevision resources.
type controllerRevisionState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Data is the serialized representation of the state.
	Data interface{} `pulumi:"data"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Revision indicates the revision of the state represented by Data.
	Revision *int `pulumi:"revision"`
}

type ControllerRevisionState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Data is the serialized representation of the state.
	Data pulumi.Input
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// Revision indicates the revision of the state represented by Data.
	Revision pulumi.IntPtrInput
}

func (ControllerRevisionState) ElementType() reflect.Type {
	return reflect.TypeOf((*controllerRevisionState)(nil)).Elem()
}

type controllerRevisionArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Data is the serialized representation of the state.
	Data interface{} `pulumi:"data"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Revision indicates the revision of the state represented by Data.
	Revision int `pulumi:"revision"`
}

// The set of arguments for constructing a ControllerRevision resource.
type ControllerRevisionArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Data is the serialized representation of the state.
	Data pulumi.Input
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// Revision indicates the revision of the state represented by Data.
	Revision pulumi.IntInput
}

func (ControllerRevisionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*controllerRevisionArgs)(nil)).Elem()
}

type ControllerRevisionInput interface {
	pulumi.Input

	ToControllerRevisionOutput() ControllerRevisionOutput
	ToControllerRevisionOutputWithContext(ctx context.Context) ControllerRevisionOutput
}

func (*ControllerRevision) ElementType() reflect.Type {
	return reflect.TypeOf((*ControllerRevision)(nil))
}

func (i *ControllerRevision) ToControllerRevisionOutput() ControllerRevisionOutput {
	return i.ToControllerRevisionOutputWithContext(context.Background())
}

func (i *ControllerRevision) ToControllerRevisionOutputWithContext(ctx context.Context) ControllerRevisionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControllerRevisionOutput)
}

func (i *ControllerRevision) ToControllerRevisionPtrOutput() ControllerRevisionPtrOutput {
	return i.ToControllerRevisionPtrOutputWithContext(context.Background())
}

func (i *ControllerRevision) ToControllerRevisionPtrOutputWithContext(ctx context.Context) ControllerRevisionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControllerRevisionPtrOutput)
}

type ControllerRevisionPtrInput interface {
	pulumi.Input

	ToControllerRevisionPtrOutput() ControllerRevisionPtrOutput
	ToControllerRevisionPtrOutputWithContext(ctx context.Context) ControllerRevisionPtrOutput
}

type controllerRevisionPtrType ControllerRevisionArgs

func (*controllerRevisionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ControllerRevision)(nil))
}

func (i *controllerRevisionPtrType) ToControllerRevisionPtrOutput() ControllerRevisionPtrOutput {
	return i.ToControllerRevisionPtrOutputWithContext(context.Background())
}

func (i *controllerRevisionPtrType) ToControllerRevisionPtrOutputWithContext(ctx context.Context) ControllerRevisionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControllerRevisionPtrOutput)
}

// ControllerRevisionArrayInput is an input type that accepts ControllerRevisionArray and ControllerRevisionArrayOutput values.
// You can construct a concrete instance of `ControllerRevisionArrayInput` via:
//
//          ControllerRevisionArray{ ControllerRevisionArgs{...} }
type ControllerRevisionArrayInput interface {
	pulumi.Input

	ToControllerRevisionArrayOutput() ControllerRevisionArrayOutput
	ToControllerRevisionArrayOutputWithContext(context.Context) ControllerRevisionArrayOutput
}

type ControllerRevisionArray []ControllerRevisionInput

func (ControllerRevisionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ControllerRevision)(nil))
}

func (i ControllerRevisionArray) ToControllerRevisionArrayOutput() ControllerRevisionArrayOutput {
	return i.ToControllerRevisionArrayOutputWithContext(context.Background())
}

func (i ControllerRevisionArray) ToControllerRevisionArrayOutputWithContext(ctx context.Context) ControllerRevisionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControllerRevisionArrayOutput)
}

// ControllerRevisionMapInput is an input type that accepts ControllerRevisionMap and ControllerRevisionMapOutput values.
// You can construct a concrete instance of `ControllerRevisionMapInput` via:
//
//          ControllerRevisionMap{ "key": ControllerRevisionArgs{...} }
type ControllerRevisionMapInput interface {
	pulumi.Input

	ToControllerRevisionMapOutput() ControllerRevisionMapOutput
	ToControllerRevisionMapOutputWithContext(context.Context) ControllerRevisionMapOutput
}

type ControllerRevisionMap map[string]ControllerRevisionInput

func (ControllerRevisionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ControllerRevision)(nil))
}

func (i ControllerRevisionMap) ToControllerRevisionMapOutput() ControllerRevisionMapOutput {
	return i.ToControllerRevisionMapOutputWithContext(context.Background())
}

func (i ControllerRevisionMap) ToControllerRevisionMapOutputWithContext(ctx context.Context) ControllerRevisionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControllerRevisionMapOutput)
}

type ControllerRevisionOutput struct {
	*pulumi.OutputState
}

func (ControllerRevisionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ControllerRevision)(nil))
}

func (o ControllerRevisionOutput) ToControllerRevisionOutput() ControllerRevisionOutput {
	return o
}

func (o ControllerRevisionOutput) ToControllerRevisionOutputWithContext(ctx context.Context) ControllerRevisionOutput {
	return o
}

func (o ControllerRevisionOutput) ToControllerRevisionPtrOutput() ControllerRevisionPtrOutput {
	return o.ToControllerRevisionPtrOutputWithContext(context.Background())
}

func (o ControllerRevisionOutput) ToControllerRevisionPtrOutputWithContext(ctx context.Context) ControllerRevisionPtrOutput {
	return o.ApplyT(func(v ControllerRevision) *ControllerRevision {
		return &v
	}).(ControllerRevisionPtrOutput)
}

type ControllerRevisionPtrOutput struct {
	*pulumi.OutputState
}

func (ControllerRevisionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ControllerRevision)(nil))
}

func (o ControllerRevisionPtrOutput) ToControllerRevisionPtrOutput() ControllerRevisionPtrOutput {
	return o
}

func (o ControllerRevisionPtrOutput) ToControllerRevisionPtrOutputWithContext(ctx context.Context) ControllerRevisionPtrOutput {
	return o
}

type ControllerRevisionArrayOutput struct{ *pulumi.OutputState }

func (ControllerRevisionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ControllerRevision)(nil))
}

func (o ControllerRevisionArrayOutput) ToControllerRevisionArrayOutput() ControllerRevisionArrayOutput {
	return o
}

func (o ControllerRevisionArrayOutput) ToControllerRevisionArrayOutputWithContext(ctx context.Context) ControllerRevisionArrayOutput {
	return o
}

func (o ControllerRevisionArrayOutput) Index(i pulumi.IntInput) ControllerRevisionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ControllerRevision {
		return vs[0].([]ControllerRevision)[vs[1].(int)]
	}).(ControllerRevisionOutput)
}

type ControllerRevisionMapOutput struct{ *pulumi.OutputState }

func (ControllerRevisionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ControllerRevision)(nil))
}

func (o ControllerRevisionMapOutput) ToControllerRevisionMapOutput() ControllerRevisionMapOutput {
	return o
}

func (o ControllerRevisionMapOutput) ToControllerRevisionMapOutputWithContext(ctx context.Context) ControllerRevisionMapOutput {
	return o
}

func (o ControllerRevisionMapOutput) MapIndex(k pulumi.StringInput) ControllerRevisionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ControllerRevision {
		return vs[0].(map[string]ControllerRevision)[vs[1].(string)]
	}).(ControllerRevisionOutput)
}

func init() {
	pulumi.RegisterOutputType(ControllerRevisionOutput{})
	pulumi.RegisterOutputType(ControllerRevisionPtrOutput{})
	pulumi.RegisterOutputType(ControllerRevisionArrayOutput{})
	pulumi.RegisterOutputType(ControllerRevisionMapOutput{})
}
