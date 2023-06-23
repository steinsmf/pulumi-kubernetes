// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Patch resources are used to modify existing Kubernetes resources by using
// Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
// one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
// Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
// [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
// additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
// ReplicaSet ensures that a specified number of pod replicas are running at any given time.
type ReplicaSetPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Spec defines the specification of the desired behavior of the ReplicaSet. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec ReplicaSetSpecPatchPtrOutput `pulumi:"spec"`
	// Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Status ReplicaSetStatusPatchPtrOutput `pulumi:"status"`
}

// NewReplicaSetPatch registers a new resource with the given unique name, arguments, and options.
func NewReplicaSetPatch(ctx *pulumi.Context,
	name string, args *ReplicaSetPatchArgs, opts ...pulumi.ResourceOption) (*ReplicaSetPatch, error) {
	if args == nil {
		args = &ReplicaSetPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("apps/v1")
	args.Kind = pulumi.StringPtr("ReplicaSet")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:apps/v1beta2:ReplicaSetPatch"),
		},
		{
			Type: pulumi.String("kubernetes:extensions/v1beta1:ReplicaSetPatch"),
		},
	})
	opts = append(opts, aliases)
	var resource ReplicaSetPatch
	err := ctx.RegisterResource("kubernetes:apps/v1:ReplicaSetPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReplicaSetPatch gets an existing ReplicaSetPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReplicaSetPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReplicaSetPatchState, opts ...pulumi.ResourceOption) (*ReplicaSetPatch, error) {
	var resource ReplicaSetPatch
	err := ctx.ReadResource("kubernetes:apps/v1:ReplicaSetPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReplicaSetPatch resources.
type replicaSetPatchState struct {
}

type ReplicaSetPatchState struct {
}

func (ReplicaSetPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*replicaSetPatchState)(nil)).Elem()
}

type replicaSetPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Spec defines the specification of the desired behavior of the ReplicaSet. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *ReplicaSetSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a ReplicaSetPatch resource.
type ReplicaSetPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// Spec defines the specification of the desired behavior of the ReplicaSet. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec ReplicaSetSpecPatchPtrInput
}

func (ReplicaSetPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*replicaSetPatchArgs)(nil)).Elem()
}

type ReplicaSetPatchInput interface {
	pulumi.Input

	ToReplicaSetPatchOutput() ReplicaSetPatchOutput
	ToReplicaSetPatchOutputWithContext(ctx context.Context) ReplicaSetPatchOutput
}

func (*ReplicaSetPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**ReplicaSetPatch)(nil)).Elem()
}

func (i *ReplicaSetPatch) ToReplicaSetPatchOutput() ReplicaSetPatchOutput {
	return i.ToReplicaSetPatchOutputWithContext(context.Background())
}

func (i *ReplicaSetPatch) ToReplicaSetPatchOutputWithContext(ctx context.Context) ReplicaSetPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicaSetPatchOutput)
}

// ReplicaSetPatchArrayInput is an input type that accepts ReplicaSetPatchArray and ReplicaSetPatchArrayOutput values.
// You can construct a concrete instance of `ReplicaSetPatchArrayInput` via:
//
//	ReplicaSetPatchArray{ ReplicaSetPatchArgs{...} }
type ReplicaSetPatchArrayInput interface {
	pulumi.Input

	ToReplicaSetPatchArrayOutput() ReplicaSetPatchArrayOutput
	ToReplicaSetPatchArrayOutputWithContext(context.Context) ReplicaSetPatchArrayOutput
}

type ReplicaSetPatchArray []ReplicaSetPatchInput

func (ReplicaSetPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReplicaSetPatch)(nil)).Elem()
}

func (i ReplicaSetPatchArray) ToReplicaSetPatchArrayOutput() ReplicaSetPatchArrayOutput {
	return i.ToReplicaSetPatchArrayOutputWithContext(context.Background())
}

func (i ReplicaSetPatchArray) ToReplicaSetPatchArrayOutputWithContext(ctx context.Context) ReplicaSetPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicaSetPatchArrayOutput)
}

// ReplicaSetPatchMapInput is an input type that accepts ReplicaSetPatchMap and ReplicaSetPatchMapOutput values.
// You can construct a concrete instance of `ReplicaSetPatchMapInput` via:
//
//	ReplicaSetPatchMap{ "key": ReplicaSetPatchArgs{...} }
type ReplicaSetPatchMapInput interface {
	pulumi.Input

	ToReplicaSetPatchMapOutput() ReplicaSetPatchMapOutput
	ToReplicaSetPatchMapOutputWithContext(context.Context) ReplicaSetPatchMapOutput
}

type ReplicaSetPatchMap map[string]ReplicaSetPatchInput

func (ReplicaSetPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReplicaSetPatch)(nil)).Elem()
}

func (i ReplicaSetPatchMap) ToReplicaSetPatchMapOutput() ReplicaSetPatchMapOutput {
	return i.ToReplicaSetPatchMapOutputWithContext(context.Background())
}

func (i ReplicaSetPatchMap) ToReplicaSetPatchMapOutputWithContext(ctx context.Context) ReplicaSetPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicaSetPatchMapOutput)
}

type ReplicaSetPatchOutput struct{ *pulumi.OutputState }

func (ReplicaSetPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReplicaSetPatch)(nil)).Elem()
}

func (o ReplicaSetPatchOutput) ToReplicaSetPatchOutput() ReplicaSetPatchOutput {
	return o
}

func (o ReplicaSetPatchOutput) ToReplicaSetPatchOutputWithContext(ctx context.Context) ReplicaSetPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ReplicaSetPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReplicaSetPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ReplicaSetPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReplicaSetPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o ReplicaSetPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *ReplicaSetPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Spec defines the specification of the desired behavior of the ReplicaSet. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o ReplicaSetPatchOutput) Spec() ReplicaSetSpecPatchPtrOutput {
	return o.ApplyT(func(v *ReplicaSetPatch) ReplicaSetSpecPatchPtrOutput { return v.Spec }).(ReplicaSetSpecPatchPtrOutput)
}

// Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o ReplicaSetPatchOutput) Status() ReplicaSetStatusPatchPtrOutput {
	return o.ApplyT(func(v *ReplicaSetPatch) ReplicaSetStatusPatchPtrOutput { return v.Status }).(ReplicaSetStatusPatchPtrOutput)
}

type ReplicaSetPatchArrayOutput struct{ *pulumi.OutputState }

func (ReplicaSetPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReplicaSetPatch)(nil)).Elem()
}

func (o ReplicaSetPatchArrayOutput) ToReplicaSetPatchArrayOutput() ReplicaSetPatchArrayOutput {
	return o
}

func (o ReplicaSetPatchArrayOutput) ToReplicaSetPatchArrayOutputWithContext(ctx context.Context) ReplicaSetPatchArrayOutput {
	return o
}

func (o ReplicaSetPatchArrayOutput) Index(i pulumi.IntInput) ReplicaSetPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReplicaSetPatch {
		return vs[0].([]*ReplicaSetPatch)[vs[1].(int)]
	}).(ReplicaSetPatchOutput)
}

type ReplicaSetPatchMapOutput struct{ *pulumi.OutputState }

func (ReplicaSetPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReplicaSetPatch)(nil)).Elem()
}

func (o ReplicaSetPatchMapOutput) ToReplicaSetPatchMapOutput() ReplicaSetPatchMapOutput {
	return o
}

func (o ReplicaSetPatchMapOutput) ToReplicaSetPatchMapOutputWithContext(ctx context.Context) ReplicaSetPatchMapOutput {
	return o
}

func (o ReplicaSetPatchMapOutput) MapIndex(k pulumi.StringInput) ReplicaSetPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReplicaSetPatch {
		return vs[0].(map[string]*ReplicaSetPatch)[vs[1].(string)]
	}).(ReplicaSetPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicaSetPatchInput)(nil)).Elem(), &ReplicaSetPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicaSetPatchArrayInput)(nil)).Elem(), ReplicaSetPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicaSetPatchMapInput)(nil)).Elem(), ReplicaSetPatchMap{})
	pulumi.RegisterOutputType(ReplicaSetPatchOutput{})
	pulumi.RegisterOutputType(ReplicaSetPatchArrayOutput{})
	pulumi.RegisterOutputType(ReplicaSetPatchMapOutput{})
}
