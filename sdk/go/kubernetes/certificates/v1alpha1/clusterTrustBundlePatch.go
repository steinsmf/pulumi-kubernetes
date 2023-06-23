// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

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
// ClusterTrustBundle is a cluster-scoped container for X.509 trust anchors (root certificates).
//
// ClusterTrustBundle objects are considered to be readable by any authenticated user in the cluster, because they can be mounted by pods using the `clusterTrustBundle` projection.  All service accounts have read access to ClusterTrustBundles by default.  Users who only have namespace-level access to a cluster can read ClusterTrustBundles by impersonating a serviceaccount that they have access to.
//
// It can be optionally associated with a particular assigner, in which case it contains one valid set of trust anchors for that signer. Signers may have multiple associated ClusterTrustBundles; each is an independent set of trust anchors for that signer. Admission control is used to enforce that only users with permissions on the signer can create or modify the corresponding bundle.
type ClusterTrustBundlePatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// metadata contains the object metadata.
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// spec contains the signer (if any) and trust anchors.
	Spec ClusterTrustBundleSpecPatchPtrOutput `pulumi:"spec"`
}

// NewClusterTrustBundlePatch registers a new resource with the given unique name, arguments, and options.
func NewClusterTrustBundlePatch(ctx *pulumi.Context,
	name string, args *ClusterTrustBundlePatchArgs, opts ...pulumi.ResourceOption) (*ClusterTrustBundlePatch, error) {
	if args == nil {
		args = &ClusterTrustBundlePatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("certificates.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("ClusterTrustBundle")
	var resource ClusterTrustBundlePatch
	err := ctx.RegisterResource("kubernetes:certificates.k8s.io/v1alpha1:ClusterTrustBundlePatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterTrustBundlePatch gets an existing ClusterTrustBundlePatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterTrustBundlePatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterTrustBundlePatchState, opts ...pulumi.ResourceOption) (*ClusterTrustBundlePatch, error) {
	var resource ClusterTrustBundlePatch
	err := ctx.ReadResource("kubernetes:certificates.k8s.io/v1alpha1:ClusterTrustBundlePatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterTrustBundlePatch resources.
type clusterTrustBundlePatchState struct {
}

type ClusterTrustBundlePatchState struct {
}

func (ClusterTrustBundlePatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterTrustBundlePatchState)(nil)).Elem()
}

type clusterTrustBundlePatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// metadata contains the object metadata.
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// spec contains the signer (if any) and trust anchors.
	Spec *ClusterTrustBundleSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a ClusterTrustBundlePatch resource.
type ClusterTrustBundlePatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// metadata contains the object metadata.
	Metadata metav1.ObjectMetaPatchPtrInput
	// spec contains the signer (if any) and trust anchors.
	Spec ClusterTrustBundleSpecPatchPtrInput
}

func (ClusterTrustBundlePatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterTrustBundlePatchArgs)(nil)).Elem()
}

type ClusterTrustBundlePatchInput interface {
	pulumi.Input

	ToClusterTrustBundlePatchOutput() ClusterTrustBundlePatchOutput
	ToClusterTrustBundlePatchOutputWithContext(ctx context.Context) ClusterTrustBundlePatchOutput
}

func (*ClusterTrustBundlePatch) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterTrustBundlePatch)(nil)).Elem()
}

func (i *ClusterTrustBundlePatch) ToClusterTrustBundlePatchOutput() ClusterTrustBundlePatchOutput {
	return i.ToClusterTrustBundlePatchOutputWithContext(context.Background())
}

func (i *ClusterTrustBundlePatch) ToClusterTrustBundlePatchOutputWithContext(ctx context.Context) ClusterTrustBundlePatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTrustBundlePatchOutput)
}

// ClusterTrustBundlePatchArrayInput is an input type that accepts ClusterTrustBundlePatchArray and ClusterTrustBundlePatchArrayOutput values.
// You can construct a concrete instance of `ClusterTrustBundlePatchArrayInput` via:
//
//	ClusterTrustBundlePatchArray{ ClusterTrustBundlePatchArgs{...} }
type ClusterTrustBundlePatchArrayInput interface {
	pulumi.Input

	ToClusterTrustBundlePatchArrayOutput() ClusterTrustBundlePatchArrayOutput
	ToClusterTrustBundlePatchArrayOutputWithContext(context.Context) ClusterTrustBundlePatchArrayOutput
}

type ClusterTrustBundlePatchArray []ClusterTrustBundlePatchInput

func (ClusterTrustBundlePatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterTrustBundlePatch)(nil)).Elem()
}

func (i ClusterTrustBundlePatchArray) ToClusterTrustBundlePatchArrayOutput() ClusterTrustBundlePatchArrayOutput {
	return i.ToClusterTrustBundlePatchArrayOutputWithContext(context.Background())
}

func (i ClusterTrustBundlePatchArray) ToClusterTrustBundlePatchArrayOutputWithContext(ctx context.Context) ClusterTrustBundlePatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTrustBundlePatchArrayOutput)
}

// ClusterTrustBundlePatchMapInput is an input type that accepts ClusterTrustBundlePatchMap and ClusterTrustBundlePatchMapOutput values.
// You can construct a concrete instance of `ClusterTrustBundlePatchMapInput` via:
//
//	ClusterTrustBundlePatchMap{ "key": ClusterTrustBundlePatchArgs{...} }
type ClusterTrustBundlePatchMapInput interface {
	pulumi.Input

	ToClusterTrustBundlePatchMapOutput() ClusterTrustBundlePatchMapOutput
	ToClusterTrustBundlePatchMapOutputWithContext(context.Context) ClusterTrustBundlePatchMapOutput
}

type ClusterTrustBundlePatchMap map[string]ClusterTrustBundlePatchInput

func (ClusterTrustBundlePatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterTrustBundlePatch)(nil)).Elem()
}

func (i ClusterTrustBundlePatchMap) ToClusterTrustBundlePatchMapOutput() ClusterTrustBundlePatchMapOutput {
	return i.ToClusterTrustBundlePatchMapOutputWithContext(context.Background())
}

func (i ClusterTrustBundlePatchMap) ToClusterTrustBundlePatchMapOutputWithContext(ctx context.Context) ClusterTrustBundlePatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTrustBundlePatchMapOutput)
}

type ClusterTrustBundlePatchOutput struct{ *pulumi.OutputState }

func (ClusterTrustBundlePatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterTrustBundlePatch)(nil)).Elem()
}

func (o ClusterTrustBundlePatchOutput) ToClusterTrustBundlePatchOutput() ClusterTrustBundlePatchOutput {
	return o
}

func (o ClusterTrustBundlePatchOutput) ToClusterTrustBundlePatchOutputWithContext(ctx context.Context) ClusterTrustBundlePatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ClusterTrustBundlePatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterTrustBundlePatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ClusterTrustBundlePatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterTrustBundlePatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// metadata contains the object metadata.
func (o ClusterTrustBundlePatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *ClusterTrustBundlePatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// spec contains the signer (if any) and trust anchors.
func (o ClusterTrustBundlePatchOutput) Spec() ClusterTrustBundleSpecPatchPtrOutput {
	return o.ApplyT(func(v *ClusterTrustBundlePatch) ClusterTrustBundleSpecPatchPtrOutput { return v.Spec }).(ClusterTrustBundleSpecPatchPtrOutput)
}

type ClusterTrustBundlePatchArrayOutput struct{ *pulumi.OutputState }

func (ClusterTrustBundlePatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterTrustBundlePatch)(nil)).Elem()
}

func (o ClusterTrustBundlePatchArrayOutput) ToClusterTrustBundlePatchArrayOutput() ClusterTrustBundlePatchArrayOutput {
	return o
}

func (o ClusterTrustBundlePatchArrayOutput) ToClusterTrustBundlePatchArrayOutputWithContext(ctx context.Context) ClusterTrustBundlePatchArrayOutput {
	return o
}

func (o ClusterTrustBundlePatchArrayOutput) Index(i pulumi.IntInput) ClusterTrustBundlePatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterTrustBundlePatch {
		return vs[0].([]*ClusterTrustBundlePatch)[vs[1].(int)]
	}).(ClusterTrustBundlePatchOutput)
}

type ClusterTrustBundlePatchMapOutput struct{ *pulumi.OutputState }

func (ClusterTrustBundlePatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterTrustBundlePatch)(nil)).Elem()
}

func (o ClusterTrustBundlePatchMapOutput) ToClusterTrustBundlePatchMapOutput() ClusterTrustBundlePatchMapOutput {
	return o
}

func (o ClusterTrustBundlePatchMapOutput) ToClusterTrustBundlePatchMapOutputWithContext(ctx context.Context) ClusterTrustBundlePatchMapOutput {
	return o
}

func (o ClusterTrustBundlePatchMapOutput) MapIndex(k pulumi.StringInput) ClusterTrustBundlePatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterTrustBundlePatch {
		return vs[0].(map[string]*ClusterTrustBundlePatch)[vs[1].(string)]
	}).(ClusterTrustBundlePatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterTrustBundlePatchInput)(nil)).Elem(), &ClusterTrustBundlePatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterTrustBundlePatchArrayInput)(nil)).Elem(), ClusterTrustBundlePatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterTrustBundlePatchMapInput)(nil)).Elem(), ClusterTrustBundlePatchMap{})
	pulumi.RegisterOutputType(ClusterTrustBundlePatchOutput{})
	pulumi.RegisterOutputType(ClusterTrustBundlePatchArrayOutput{})
	pulumi.RegisterOutputType(ClusterTrustBundlePatchMapOutput{})
}
