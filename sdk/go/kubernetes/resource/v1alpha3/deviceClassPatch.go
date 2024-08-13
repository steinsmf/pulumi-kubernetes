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
// DeviceClass is a vendor- or admin-provided resource that contains device configuration and selectors. It can be referenced in the device requests of a claim to apply these presets. Cluster scoped.
//
// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
type DeviceClassPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Spec defines what can be allocated and how to configure it.
	//
	// This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
	//
	// Changing the spec automatically increments the metadata.generation number.
	Spec DeviceClassSpecPatchPtrOutput `pulumi:"spec"`
}

// NewDeviceClassPatch registers a new resource with the given unique name, arguments, and options.
func NewDeviceClassPatch(ctx *pulumi.Context,
	name string, args *DeviceClassPatchArgs, opts ...pulumi.ResourceOption) (*DeviceClassPatch, error) {
	if args == nil {
		args = &DeviceClassPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("resource.k8s.io/v1alpha3")
	args.Kind = pulumi.StringPtr("DeviceClass")
	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource DeviceClassPatch
	err := ctx.RegisterResource("kubernetes:resource.k8s.io/v1alpha3:DeviceClassPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeviceClassPatch gets an existing DeviceClassPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeviceClassPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceClassPatchState, opts ...pulumi.ResourceOption) (*DeviceClassPatch, error) {
	var resource DeviceClassPatch
	err := ctx.ReadResource("kubernetes:resource.k8s.io/v1alpha3:DeviceClassPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeviceClassPatch resources.
type deviceClassPatchState struct {
}

type DeviceClassPatchState struct {
}

func (DeviceClassPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceClassPatchState)(nil)).Elem()
}

type deviceClassPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Spec defines what can be allocated and how to configure it.
	//
	// This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
	//
	// Changing the spec automatically increments the metadata.generation number.
	Spec *DeviceClassSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a DeviceClassPatch resource.
type DeviceClassPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// Spec defines what can be allocated and how to configure it.
	//
	// This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
	//
	// Changing the spec automatically increments the metadata.generation number.
	Spec DeviceClassSpecPatchPtrInput
}

func (DeviceClassPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceClassPatchArgs)(nil)).Elem()
}

type DeviceClassPatchInput interface {
	pulumi.Input

	ToDeviceClassPatchOutput() DeviceClassPatchOutput
	ToDeviceClassPatchOutputWithContext(ctx context.Context) DeviceClassPatchOutput
}

func (*DeviceClassPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceClassPatch)(nil)).Elem()
}

func (i *DeviceClassPatch) ToDeviceClassPatchOutput() DeviceClassPatchOutput {
	return i.ToDeviceClassPatchOutputWithContext(context.Background())
}

func (i *DeviceClassPatch) ToDeviceClassPatchOutputWithContext(ctx context.Context) DeviceClassPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceClassPatchOutput)
}

// DeviceClassPatchArrayInput is an input type that accepts DeviceClassPatchArray and DeviceClassPatchArrayOutput values.
// You can construct a concrete instance of `DeviceClassPatchArrayInput` via:
//
//	DeviceClassPatchArray{ DeviceClassPatchArgs{...} }
type DeviceClassPatchArrayInput interface {
	pulumi.Input

	ToDeviceClassPatchArrayOutput() DeviceClassPatchArrayOutput
	ToDeviceClassPatchArrayOutputWithContext(context.Context) DeviceClassPatchArrayOutput
}

type DeviceClassPatchArray []DeviceClassPatchInput

func (DeviceClassPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceClassPatch)(nil)).Elem()
}

func (i DeviceClassPatchArray) ToDeviceClassPatchArrayOutput() DeviceClassPatchArrayOutput {
	return i.ToDeviceClassPatchArrayOutputWithContext(context.Background())
}

func (i DeviceClassPatchArray) ToDeviceClassPatchArrayOutputWithContext(ctx context.Context) DeviceClassPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceClassPatchArrayOutput)
}

// DeviceClassPatchMapInput is an input type that accepts DeviceClassPatchMap and DeviceClassPatchMapOutput values.
// You can construct a concrete instance of `DeviceClassPatchMapInput` via:
//
//	DeviceClassPatchMap{ "key": DeviceClassPatchArgs{...} }
type DeviceClassPatchMapInput interface {
	pulumi.Input

	ToDeviceClassPatchMapOutput() DeviceClassPatchMapOutput
	ToDeviceClassPatchMapOutputWithContext(context.Context) DeviceClassPatchMapOutput
}

type DeviceClassPatchMap map[string]DeviceClassPatchInput

func (DeviceClassPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceClassPatch)(nil)).Elem()
}

func (i DeviceClassPatchMap) ToDeviceClassPatchMapOutput() DeviceClassPatchMapOutput {
	return i.ToDeviceClassPatchMapOutputWithContext(context.Background())
}

func (i DeviceClassPatchMap) ToDeviceClassPatchMapOutputWithContext(ctx context.Context) DeviceClassPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceClassPatchMapOutput)
}

type DeviceClassPatchOutput struct{ *pulumi.OutputState }

func (DeviceClassPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceClassPatch)(nil)).Elem()
}

func (o DeviceClassPatchOutput) ToDeviceClassPatchOutput() DeviceClassPatchOutput {
	return o
}

func (o DeviceClassPatchOutput) ToDeviceClassPatchOutputWithContext(ctx context.Context) DeviceClassPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o DeviceClassPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeviceClassPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o DeviceClassPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeviceClassPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object metadata
func (o DeviceClassPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *DeviceClassPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Spec defines what can be allocated and how to configure it.
//
// This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
//
// Changing the spec automatically increments the metadata.generation number.
func (o DeviceClassPatchOutput) Spec() DeviceClassSpecPatchPtrOutput {
	return o.ApplyT(func(v *DeviceClassPatch) DeviceClassSpecPatchPtrOutput { return v.Spec }).(DeviceClassSpecPatchPtrOutput)
}

type DeviceClassPatchArrayOutput struct{ *pulumi.OutputState }

func (DeviceClassPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceClassPatch)(nil)).Elem()
}

func (o DeviceClassPatchArrayOutput) ToDeviceClassPatchArrayOutput() DeviceClassPatchArrayOutput {
	return o
}

func (o DeviceClassPatchArrayOutput) ToDeviceClassPatchArrayOutputWithContext(ctx context.Context) DeviceClassPatchArrayOutput {
	return o
}

func (o DeviceClassPatchArrayOutput) Index(i pulumi.IntInput) DeviceClassPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeviceClassPatch {
		return vs[0].([]*DeviceClassPatch)[vs[1].(int)]
	}).(DeviceClassPatchOutput)
}

type DeviceClassPatchMapOutput struct{ *pulumi.OutputState }

func (DeviceClassPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceClassPatch)(nil)).Elem()
}

func (o DeviceClassPatchMapOutput) ToDeviceClassPatchMapOutput() DeviceClassPatchMapOutput {
	return o
}

func (o DeviceClassPatchMapOutput) ToDeviceClassPatchMapOutputWithContext(ctx context.Context) DeviceClassPatchMapOutput {
	return o
}

func (o DeviceClassPatchMapOutput) MapIndex(k pulumi.StringInput) DeviceClassPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeviceClassPatch {
		return vs[0].(map[string]*DeviceClassPatch)[vs[1].(string)]
	}).(DeviceClassPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceClassPatchInput)(nil)).Elem(), &DeviceClassPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceClassPatchArrayInput)(nil)).Elem(), DeviceClassPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceClassPatchMapInput)(nil)).Elem(), DeviceClassPatchMap{})
	pulumi.RegisterOutputType(DeviceClassPatchOutput{})
	pulumi.RegisterOutputType(DeviceClassPatchArrayOutput{})
	pulumi.RegisterOutputType(DeviceClassPatchMapOutput{})
}
