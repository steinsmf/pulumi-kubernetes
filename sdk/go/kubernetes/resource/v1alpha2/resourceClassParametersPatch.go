// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha2

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
// ResourceClassParameters defines resource requests for a ResourceClass in an in-tree format understood by Kubernetes.
type ResourceClassParametersPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Filters describes additional contraints that must be met when using the class.
	Filters ResourceFilterPatchArrayOutput `pulumi:"filters"`
	// If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
	GeneratedFrom ResourceClassParametersReferencePatchPtrOutput `pulumi:"generatedFrom"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
	VendorParameters VendorParametersPatchArrayOutput `pulumi:"vendorParameters"`
}

// NewResourceClassParametersPatch registers a new resource with the given unique name, arguments, and options.
func NewResourceClassParametersPatch(ctx *pulumi.Context,
	name string, args *ResourceClassParametersPatchArgs, opts ...pulumi.ResourceOption) (*ResourceClassParametersPatch, error) {
	if args == nil {
		args = &ResourceClassParametersPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("resource.k8s.io/v1alpha2")
	args.Kind = pulumi.StringPtr("ResourceClassParameters")
	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource ResourceClassParametersPatch
	err := ctx.RegisterResource("kubernetes:resource.k8s.io/v1alpha2:ResourceClassParametersPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceClassParametersPatch gets an existing ResourceClassParametersPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceClassParametersPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceClassParametersPatchState, opts ...pulumi.ResourceOption) (*ResourceClassParametersPatch, error) {
	var resource ResourceClassParametersPatch
	err := ctx.ReadResource("kubernetes:resource.k8s.io/v1alpha2:ResourceClassParametersPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceClassParametersPatch resources.
type resourceClassParametersPatchState struct {
}

type ResourceClassParametersPatchState struct {
}

func (ResourceClassParametersPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceClassParametersPatchState)(nil)).Elem()
}

type resourceClassParametersPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Filters describes additional contraints that must be met when using the class.
	Filters []ResourceFilterPatch `pulumi:"filters"`
	// If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
	GeneratedFrom *ResourceClassParametersReferencePatch `pulumi:"generatedFrom"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
	VendorParameters []VendorParametersPatch `pulumi:"vendorParameters"`
}

// The set of arguments for constructing a ResourceClassParametersPatch resource.
type ResourceClassParametersPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Filters describes additional contraints that must be met when using the class.
	Filters ResourceFilterPatchArrayInput
	// If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
	GeneratedFrom ResourceClassParametersReferencePatchPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
	VendorParameters VendorParametersPatchArrayInput
}

func (ResourceClassParametersPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceClassParametersPatchArgs)(nil)).Elem()
}

type ResourceClassParametersPatchInput interface {
	pulumi.Input

	ToResourceClassParametersPatchOutput() ResourceClassParametersPatchOutput
	ToResourceClassParametersPatchOutputWithContext(ctx context.Context) ResourceClassParametersPatchOutput
}

func (*ResourceClassParametersPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceClassParametersPatch)(nil)).Elem()
}

func (i *ResourceClassParametersPatch) ToResourceClassParametersPatchOutput() ResourceClassParametersPatchOutput {
	return i.ToResourceClassParametersPatchOutputWithContext(context.Background())
}

func (i *ResourceClassParametersPatch) ToResourceClassParametersPatchOutputWithContext(ctx context.Context) ResourceClassParametersPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClassParametersPatchOutput)
}

// ResourceClassParametersPatchArrayInput is an input type that accepts ResourceClassParametersPatchArray and ResourceClassParametersPatchArrayOutput values.
// You can construct a concrete instance of `ResourceClassParametersPatchArrayInput` via:
//
//	ResourceClassParametersPatchArray{ ResourceClassParametersPatchArgs{...} }
type ResourceClassParametersPatchArrayInput interface {
	pulumi.Input

	ToResourceClassParametersPatchArrayOutput() ResourceClassParametersPatchArrayOutput
	ToResourceClassParametersPatchArrayOutputWithContext(context.Context) ResourceClassParametersPatchArrayOutput
}

type ResourceClassParametersPatchArray []ResourceClassParametersPatchInput

func (ResourceClassParametersPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceClassParametersPatch)(nil)).Elem()
}

func (i ResourceClassParametersPatchArray) ToResourceClassParametersPatchArrayOutput() ResourceClassParametersPatchArrayOutput {
	return i.ToResourceClassParametersPatchArrayOutputWithContext(context.Background())
}

func (i ResourceClassParametersPatchArray) ToResourceClassParametersPatchArrayOutputWithContext(ctx context.Context) ResourceClassParametersPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClassParametersPatchArrayOutput)
}

// ResourceClassParametersPatchMapInput is an input type that accepts ResourceClassParametersPatchMap and ResourceClassParametersPatchMapOutput values.
// You can construct a concrete instance of `ResourceClassParametersPatchMapInput` via:
//
//	ResourceClassParametersPatchMap{ "key": ResourceClassParametersPatchArgs{...} }
type ResourceClassParametersPatchMapInput interface {
	pulumi.Input

	ToResourceClassParametersPatchMapOutput() ResourceClassParametersPatchMapOutput
	ToResourceClassParametersPatchMapOutputWithContext(context.Context) ResourceClassParametersPatchMapOutput
}

type ResourceClassParametersPatchMap map[string]ResourceClassParametersPatchInput

func (ResourceClassParametersPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceClassParametersPatch)(nil)).Elem()
}

func (i ResourceClassParametersPatchMap) ToResourceClassParametersPatchMapOutput() ResourceClassParametersPatchMapOutput {
	return i.ToResourceClassParametersPatchMapOutputWithContext(context.Background())
}

func (i ResourceClassParametersPatchMap) ToResourceClassParametersPatchMapOutputWithContext(ctx context.Context) ResourceClassParametersPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClassParametersPatchMapOutput)
}

type ResourceClassParametersPatchOutput struct{ *pulumi.OutputState }

func (ResourceClassParametersPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceClassParametersPatch)(nil)).Elem()
}

func (o ResourceClassParametersPatchOutput) ToResourceClassParametersPatchOutput() ResourceClassParametersPatchOutput {
	return o
}

func (o ResourceClassParametersPatchOutput) ToResourceClassParametersPatchOutputWithContext(ctx context.Context) ResourceClassParametersPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ResourceClassParametersPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceClassParametersPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Filters describes additional contraints that must be met when using the class.
func (o ResourceClassParametersPatchOutput) Filters() ResourceFilterPatchArrayOutput {
	return o.ApplyT(func(v *ResourceClassParametersPatch) ResourceFilterPatchArrayOutput { return v.Filters }).(ResourceFilterPatchArrayOutput)
}

// If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
func (o ResourceClassParametersPatchOutput) GeneratedFrom() ResourceClassParametersReferencePatchPtrOutput {
	return o.ApplyT(func(v *ResourceClassParametersPatch) ResourceClassParametersReferencePatchPtrOutput {
		return v.GeneratedFrom
	}).(ResourceClassParametersReferencePatchPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ResourceClassParametersPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceClassParametersPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object metadata
func (o ResourceClassParametersPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *ResourceClassParametersPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
func (o ResourceClassParametersPatchOutput) VendorParameters() VendorParametersPatchArrayOutput {
	return o.ApplyT(func(v *ResourceClassParametersPatch) VendorParametersPatchArrayOutput { return v.VendorParameters }).(VendorParametersPatchArrayOutput)
}

type ResourceClassParametersPatchArrayOutput struct{ *pulumi.OutputState }

func (ResourceClassParametersPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceClassParametersPatch)(nil)).Elem()
}

func (o ResourceClassParametersPatchArrayOutput) ToResourceClassParametersPatchArrayOutput() ResourceClassParametersPatchArrayOutput {
	return o
}

func (o ResourceClassParametersPatchArrayOutput) ToResourceClassParametersPatchArrayOutputWithContext(ctx context.Context) ResourceClassParametersPatchArrayOutput {
	return o
}

func (o ResourceClassParametersPatchArrayOutput) Index(i pulumi.IntInput) ResourceClassParametersPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceClassParametersPatch {
		return vs[0].([]*ResourceClassParametersPatch)[vs[1].(int)]
	}).(ResourceClassParametersPatchOutput)
}

type ResourceClassParametersPatchMapOutput struct{ *pulumi.OutputState }

func (ResourceClassParametersPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceClassParametersPatch)(nil)).Elem()
}

func (o ResourceClassParametersPatchMapOutput) ToResourceClassParametersPatchMapOutput() ResourceClassParametersPatchMapOutput {
	return o
}

func (o ResourceClassParametersPatchMapOutput) ToResourceClassParametersPatchMapOutputWithContext(ctx context.Context) ResourceClassParametersPatchMapOutput {
	return o
}

func (o ResourceClassParametersPatchMapOutput) MapIndex(k pulumi.StringInput) ResourceClassParametersPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceClassParametersPatch {
		return vs[0].(map[string]*ResourceClassParametersPatch)[vs[1].(string)]
	}).(ResourceClassParametersPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClassParametersPatchInput)(nil)).Elem(), &ResourceClassParametersPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClassParametersPatchArrayInput)(nil)).Elem(), ResourceClassParametersPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClassParametersPatchMapInput)(nil)).Elem(), ResourceClassParametersPatchMap{})
	pulumi.RegisterOutputType(ResourceClassParametersPatchOutput{})
	pulumi.RegisterOutputType(ResourceClassParametersPatchArrayOutput{})
	pulumi.RegisterOutputType(ResourceClassParametersPatchMapOutput{})
}
