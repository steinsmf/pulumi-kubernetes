// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

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
// LeaseCandidate defines a candidate for a Lease object. Candidates are created such that coordinated leader election will pick the best leader from the list of candidates.
type LeaseCandidatePatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// spec contains the specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec LeaseCandidateSpecPatchPtrOutput `pulumi:"spec"`
}

// NewLeaseCandidatePatch registers a new resource with the given unique name, arguments, and options.
func NewLeaseCandidatePatch(ctx *pulumi.Context,
	name string, args *LeaseCandidatePatchArgs, opts ...pulumi.ResourceOption) (*LeaseCandidatePatch, error) {
	if args == nil {
		args = &LeaseCandidatePatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("coordination.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("LeaseCandidate")
	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource LeaseCandidatePatch
	err := ctx.RegisterResource("kubernetes:coordination.k8s.io/v1alpha1:LeaseCandidatePatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLeaseCandidatePatch gets an existing LeaseCandidatePatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLeaseCandidatePatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LeaseCandidatePatchState, opts ...pulumi.ResourceOption) (*LeaseCandidatePatch, error) {
	var resource LeaseCandidatePatch
	err := ctx.ReadResource("kubernetes:coordination.k8s.io/v1alpha1:LeaseCandidatePatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LeaseCandidatePatch resources.
type leaseCandidatePatchState struct {
}

type LeaseCandidatePatchState struct {
}

func (LeaseCandidatePatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*leaseCandidatePatchState)(nil)).Elem()
}

type leaseCandidatePatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// spec contains the specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *LeaseCandidateSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a LeaseCandidatePatch resource.
type LeaseCandidatePatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// spec contains the specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec LeaseCandidateSpecPatchPtrInput
}

func (LeaseCandidatePatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*leaseCandidatePatchArgs)(nil)).Elem()
}

type LeaseCandidatePatchInput interface {
	pulumi.Input

	ToLeaseCandidatePatchOutput() LeaseCandidatePatchOutput
	ToLeaseCandidatePatchOutputWithContext(ctx context.Context) LeaseCandidatePatchOutput
}

func (*LeaseCandidatePatch) ElementType() reflect.Type {
	return reflect.TypeOf((**LeaseCandidatePatch)(nil)).Elem()
}

func (i *LeaseCandidatePatch) ToLeaseCandidatePatchOutput() LeaseCandidatePatchOutput {
	return i.ToLeaseCandidatePatchOutputWithContext(context.Background())
}

func (i *LeaseCandidatePatch) ToLeaseCandidatePatchOutputWithContext(ctx context.Context) LeaseCandidatePatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LeaseCandidatePatchOutput)
}

// LeaseCandidatePatchArrayInput is an input type that accepts LeaseCandidatePatchArray and LeaseCandidatePatchArrayOutput values.
// You can construct a concrete instance of `LeaseCandidatePatchArrayInput` via:
//
//	LeaseCandidatePatchArray{ LeaseCandidatePatchArgs{...} }
type LeaseCandidatePatchArrayInput interface {
	pulumi.Input

	ToLeaseCandidatePatchArrayOutput() LeaseCandidatePatchArrayOutput
	ToLeaseCandidatePatchArrayOutputWithContext(context.Context) LeaseCandidatePatchArrayOutput
}

type LeaseCandidatePatchArray []LeaseCandidatePatchInput

func (LeaseCandidatePatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LeaseCandidatePatch)(nil)).Elem()
}

func (i LeaseCandidatePatchArray) ToLeaseCandidatePatchArrayOutput() LeaseCandidatePatchArrayOutput {
	return i.ToLeaseCandidatePatchArrayOutputWithContext(context.Background())
}

func (i LeaseCandidatePatchArray) ToLeaseCandidatePatchArrayOutputWithContext(ctx context.Context) LeaseCandidatePatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LeaseCandidatePatchArrayOutput)
}

// LeaseCandidatePatchMapInput is an input type that accepts LeaseCandidatePatchMap and LeaseCandidatePatchMapOutput values.
// You can construct a concrete instance of `LeaseCandidatePatchMapInput` via:
//
//	LeaseCandidatePatchMap{ "key": LeaseCandidatePatchArgs{...} }
type LeaseCandidatePatchMapInput interface {
	pulumi.Input

	ToLeaseCandidatePatchMapOutput() LeaseCandidatePatchMapOutput
	ToLeaseCandidatePatchMapOutputWithContext(context.Context) LeaseCandidatePatchMapOutput
}

type LeaseCandidatePatchMap map[string]LeaseCandidatePatchInput

func (LeaseCandidatePatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LeaseCandidatePatch)(nil)).Elem()
}

func (i LeaseCandidatePatchMap) ToLeaseCandidatePatchMapOutput() LeaseCandidatePatchMapOutput {
	return i.ToLeaseCandidatePatchMapOutputWithContext(context.Background())
}

func (i LeaseCandidatePatchMap) ToLeaseCandidatePatchMapOutputWithContext(ctx context.Context) LeaseCandidatePatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LeaseCandidatePatchMapOutput)
}

type LeaseCandidatePatchOutput struct{ *pulumi.OutputState }

func (LeaseCandidatePatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LeaseCandidatePatch)(nil)).Elem()
}

func (o LeaseCandidatePatchOutput) ToLeaseCandidatePatchOutput() LeaseCandidatePatchOutput {
	return o
}

func (o LeaseCandidatePatchOutput) ToLeaseCandidatePatchOutputWithContext(ctx context.Context) LeaseCandidatePatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o LeaseCandidatePatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LeaseCandidatePatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o LeaseCandidatePatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LeaseCandidatePatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o LeaseCandidatePatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *LeaseCandidatePatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// spec contains the specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o LeaseCandidatePatchOutput) Spec() LeaseCandidateSpecPatchPtrOutput {
	return o.ApplyT(func(v *LeaseCandidatePatch) LeaseCandidateSpecPatchPtrOutput { return v.Spec }).(LeaseCandidateSpecPatchPtrOutput)
}

type LeaseCandidatePatchArrayOutput struct{ *pulumi.OutputState }

func (LeaseCandidatePatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LeaseCandidatePatch)(nil)).Elem()
}

func (o LeaseCandidatePatchArrayOutput) ToLeaseCandidatePatchArrayOutput() LeaseCandidatePatchArrayOutput {
	return o
}

func (o LeaseCandidatePatchArrayOutput) ToLeaseCandidatePatchArrayOutputWithContext(ctx context.Context) LeaseCandidatePatchArrayOutput {
	return o
}

func (o LeaseCandidatePatchArrayOutput) Index(i pulumi.IntInput) LeaseCandidatePatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LeaseCandidatePatch {
		return vs[0].([]*LeaseCandidatePatch)[vs[1].(int)]
	}).(LeaseCandidatePatchOutput)
}

type LeaseCandidatePatchMapOutput struct{ *pulumi.OutputState }

func (LeaseCandidatePatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LeaseCandidatePatch)(nil)).Elem()
}

func (o LeaseCandidatePatchMapOutput) ToLeaseCandidatePatchMapOutput() LeaseCandidatePatchMapOutput {
	return o
}

func (o LeaseCandidatePatchMapOutput) ToLeaseCandidatePatchMapOutputWithContext(ctx context.Context) LeaseCandidatePatchMapOutput {
	return o
}

func (o LeaseCandidatePatchMapOutput) MapIndex(k pulumi.StringInput) LeaseCandidatePatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LeaseCandidatePatch {
		return vs[0].(map[string]*LeaseCandidatePatch)[vs[1].(string)]
	}).(LeaseCandidatePatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LeaseCandidatePatchInput)(nil)).Elem(), &LeaseCandidatePatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*LeaseCandidatePatchArrayInput)(nil)).Elem(), LeaseCandidatePatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LeaseCandidatePatchMapInput)(nil)).Elem(), LeaseCandidatePatchMap{})
	pulumi.RegisterOutputType(LeaseCandidatePatchOutput{})
	pulumi.RegisterOutputType(LeaseCandidatePatchArrayOutput{})
	pulumi.RegisterOutputType(LeaseCandidatePatchMapOutput{})
}
