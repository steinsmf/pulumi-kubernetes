// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha3

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/utilities"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Patch resources are used to modify existing Kubernetes resources by using
// Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
// one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
// Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
// [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
// additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
// ResourceClaim describes a request for access to resources in the cluster, for use by workloads. For example, if a workload needs an accelerator device with specific properties, this is how that request is expressed. The status stanza tracks whether this claim has been satisfied and what specific resources have been allocated.
//
// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
type ResourceClaimPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Spec describes what is being requested and how to configure it. The spec is immutable.
	Spec ResourceClaimSpecPatchPtrOutput `pulumi:"spec"`
	// Status describes whether the claim is ready to use and what has been allocated.
	Status ResourceClaimStatusPatchPtrOutput `pulumi:"status"`
}

// NewResourceClaimPatch registers a new resource with the given unique name, arguments, and options.
func NewResourceClaimPatch(ctx *pulumi.Context,
	name string, args *ResourceClaimPatchArgs, opts ...pulumi.ResourceOption) (*ResourceClaimPatch, error) {
	if args == nil {
		args = &ResourceClaimPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("resource.k8s.io/v1alpha3")
	args.Kind = pulumi.StringPtr("ResourceClaim")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:resource.k8s.io/v1alpha1:ResourceClaimPatch"),
		},
		{
			Type: pulumi.String("kubernetes:resource.k8s.io/v1alpha2:ResourceClaimPatch"),
		},
	})
	opts = append(opts, aliases)
	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource ResourceClaimPatch
	err := ctx.RegisterResource("kubernetes:resource.k8s.io/v1alpha3:ResourceClaimPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceClaimPatch gets an existing ResourceClaimPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceClaimPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceClaimPatchState, opts ...pulumi.ResourceOption) (*ResourceClaimPatch, error) {
	var resource ResourceClaimPatch
	err := ctx.ReadResource("kubernetes:resource.k8s.io/v1alpha3:ResourceClaimPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceClaimPatch resources.
type resourceClaimPatchState struct {
}

type ResourceClaimPatchState struct {
}

func (ResourceClaimPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceClaimPatchState)(nil)).Elem()
}

type resourceClaimPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Spec describes what is being requested and how to configure it. The spec is immutable.
	Spec *ResourceClaimSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a ResourceClaimPatch resource.
type ResourceClaimPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// Spec describes what is being requested and how to configure it. The spec is immutable.
	Spec ResourceClaimSpecPatchPtrInput
}

func (ResourceClaimPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceClaimPatchArgs)(nil)).Elem()
}

type ResourceClaimPatchInput interface {
	pulumi.Input

	ToResourceClaimPatchOutput() ResourceClaimPatchOutput
	ToResourceClaimPatchOutputWithContext(ctx context.Context) ResourceClaimPatchOutput
}

func (*ResourceClaimPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceClaimPatch)(nil)).Elem()
}

func (i *ResourceClaimPatch) ToResourceClaimPatchOutput() ResourceClaimPatchOutput {
	return i.ToResourceClaimPatchOutputWithContext(context.Background())
}

func (i *ResourceClaimPatch) ToResourceClaimPatchOutputWithContext(ctx context.Context) ResourceClaimPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClaimPatchOutput)
}

// ResourceClaimPatchArrayInput is an input type that accepts ResourceClaimPatchArray and ResourceClaimPatchArrayOutput values.
// You can construct a concrete instance of `ResourceClaimPatchArrayInput` via:
//
//	ResourceClaimPatchArray{ ResourceClaimPatchArgs{...} }
type ResourceClaimPatchArrayInput interface {
	pulumi.Input

	ToResourceClaimPatchArrayOutput() ResourceClaimPatchArrayOutput
	ToResourceClaimPatchArrayOutputWithContext(context.Context) ResourceClaimPatchArrayOutput
}

type ResourceClaimPatchArray []ResourceClaimPatchInput

func (ResourceClaimPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceClaimPatch)(nil)).Elem()
}

func (i ResourceClaimPatchArray) ToResourceClaimPatchArrayOutput() ResourceClaimPatchArrayOutput {
	return i.ToResourceClaimPatchArrayOutputWithContext(context.Background())
}

func (i ResourceClaimPatchArray) ToResourceClaimPatchArrayOutputWithContext(ctx context.Context) ResourceClaimPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClaimPatchArrayOutput)
}

// ResourceClaimPatchMapInput is an input type that accepts ResourceClaimPatchMap and ResourceClaimPatchMapOutput values.
// You can construct a concrete instance of `ResourceClaimPatchMapInput` via:
//
//	ResourceClaimPatchMap{ "key": ResourceClaimPatchArgs{...} }
type ResourceClaimPatchMapInput interface {
	pulumi.Input

	ToResourceClaimPatchMapOutput() ResourceClaimPatchMapOutput
	ToResourceClaimPatchMapOutputWithContext(context.Context) ResourceClaimPatchMapOutput
}

type ResourceClaimPatchMap map[string]ResourceClaimPatchInput

func (ResourceClaimPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceClaimPatch)(nil)).Elem()
}

func (i ResourceClaimPatchMap) ToResourceClaimPatchMapOutput() ResourceClaimPatchMapOutput {
	return i.ToResourceClaimPatchMapOutputWithContext(context.Background())
}

func (i ResourceClaimPatchMap) ToResourceClaimPatchMapOutputWithContext(ctx context.Context) ResourceClaimPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClaimPatchMapOutput)
}

type ResourceClaimPatchOutput struct{ *pulumi.OutputState }

func (ResourceClaimPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceClaimPatch)(nil)).Elem()
}

func (o ResourceClaimPatchOutput) ToResourceClaimPatchOutput() ResourceClaimPatchOutput {
	return o
}

func (o ResourceClaimPatchOutput) ToResourceClaimPatchOutputWithContext(ctx context.Context) ResourceClaimPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ResourceClaimPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceClaimPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ResourceClaimPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceClaimPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object metadata
func (o ResourceClaimPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *ResourceClaimPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Spec describes what is being requested and how to configure it. The spec is immutable.
func (o ResourceClaimPatchOutput) Spec() ResourceClaimSpecPatchPtrOutput {
	return o.ApplyT(func(v *ResourceClaimPatch) ResourceClaimSpecPatchPtrOutput { return v.Spec }).(ResourceClaimSpecPatchPtrOutput)
}

// Status describes whether the claim is ready to use and what has been allocated.
func (o ResourceClaimPatchOutput) Status() ResourceClaimStatusPatchPtrOutput {
	return o.ApplyT(func(v *ResourceClaimPatch) ResourceClaimStatusPatchPtrOutput { return v.Status }).(ResourceClaimStatusPatchPtrOutput)
}

type ResourceClaimPatchArrayOutput struct{ *pulumi.OutputState }

func (ResourceClaimPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceClaimPatch)(nil)).Elem()
}

func (o ResourceClaimPatchArrayOutput) ToResourceClaimPatchArrayOutput() ResourceClaimPatchArrayOutput {
	return o
}

func (o ResourceClaimPatchArrayOutput) ToResourceClaimPatchArrayOutputWithContext(ctx context.Context) ResourceClaimPatchArrayOutput {
	return o
}

func (o ResourceClaimPatchArrayOutput) Index(i pulumi.IntInput) ResourceClaimPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceClaimPatch {
		return vs[0].([]*ResourceClaimPatch)[vs[1].(int)]
	}).(ResourceClaimPatchOutput)
}

type ResourceClaimPatchMapOutput struct{ *pulumi.OutputState }

func (ResourceClaimPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceClaimPatch)(nil)).Elem()
}

func (o ResourceClaimPatchMapOutput) ToResourceClaimPatchMapOutput() ResourceClaimPatchMapOutput {
	return o
}

func (o ResourceClaimPatchMapOutput) ToResourceClaimPatchMapOutputWithContext(ctx context.Context) ResourceClaimPatchMapOutput {
	return o
}

func (o ResourceClaimPatchMapOutput) MapIndex(k pulumi.StringInput) ResourceClaimPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceClaimPatch {
		return vs[0].(map[string]*ResourceClaimPatch)[vs[1].(string)]
	}).(ResourceClaimPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClaimPatchInput)(nil)).Elem(), &ResourceClaimPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClaimPatchArrayInput)(nil)).Elem(), ResourceClaimPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClaimPatchMapInput)(nil)).Elem(), ResourceClaimPatchMap{})
	pulumi.RegisterOutputType(ResourceClaimPatchOutput{})
	pulumi.RegisterOutputType(ResourceClaimPatchArrayOutput{})
	pulumi.RegisterOutputType(ResourceClaimPatchMapOutput{})
}
