// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta2

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
// Deployment enables declarative updates for Pods and ReplicaSets.
//
// This resource waits until its status is ready before registering success
// for create/update, and populating output properties from the current state of the resource.
// The following conditions are used to determine whether the resource creation has
// succeeded or failed:
//
//  1. The Deployment has begun to be updated by the Deployment controller. If the current
//     generation of the Deployment is > 1, then this means that the current generation must
//     be different from the generation reported by the last outputs.
//  2. There exists a ReplicaSet whose revision is equal to the current revision of the
//     Deployment.
//  3. The Deployment's '.status.conditions' has a status of type 'Available' whose 'status'
//     member is set to 'True'.
//  4. If the Deployment has generation > 1, then '.status.conditions' has a status of type
//     'Progressing', whose 'status' member is set to 'True', and whose 'reason' is
//     'NewReplicaSetAvailable'. For generation <= 1, this status field does not exist,
//     because it doesn't do a rollout (i.e., it simply creates the Deployment and
//     corresponding ReplicaSet), and therefore there is no rollout to mark as 'Progressing'.
//
// If the Deployment has not reached a Ready state after 10 minutes, it will
// time out and mark the resource update as Failed. You can override the default timeout value
// by setting the 'customTimeouts' option on the resource.
//
// Deprecated: apps/v1beta2/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters.
type DeploymentPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object metadata.
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Specification of the desired behavior of the Deployment.
	Spec DeploymentSpecPatchPtrOutput `pulumi:"spec"`
	// Most recently observed status of the Deployment.
	Status DeploymentStatusPatchPtrOutput `pulumi:"status"`
}

// NewDeploymentPatch registers a new resource with the given unique name, arguments, and options.
func NewDeploymentPatch(ctx *pulumi.Context,
	name string, args *DeploymentPatchArgs, opts ...pulumi.ResourceOption) (*DeploymentPatch, error) {
	if args == nil {
		args = &DeploymentPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("apps/v1beta2")
	args.Kind = pulumi.StringPtr("Deployment")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:apps/v1:DeploymentPatch"),
		},
		{
			Type: pulumi.String("kubernetes:apps/v1beta1:DeploymentPatch"),
		},
		{
			Type: pulumi.String("kubernetes:extensions/v1beta1:DeploymentPatch"),
		},
	})
	opts = append(opts, aliases)
	var resource DeploymentPatch
	err := ctx.RegisterResource("kubernetes:apps/v1beta2:DeploymentPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentPatch gets an existing DeploymentPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentPatchState, opts ...pulumi.ResourceOption) (*DeploymentPatch, error) {
	var resource DeploymentPatch
	err := ctx.ReadResource("kubernetes:apps/v1beta2:DeploymentPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentPatch resources.
type deploymentPatchState struct {
}

type DeploymentPatchState struct {
}

func (DeploymentPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentPatchState)(nil)).Elem()
}

type deploymentPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata.
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Specification of the desired behavior of the Deployment.
	Spec *DeploymentSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a DeploymentPatch resource.
type DeploymentPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata.
	Metadata metav1.ObjectMetaPatchPtrInput
	// Specification of the desired behavior of the Deployment.
	Spec DeploymentSpecPatchPtrInput
}

func (DeploymentPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentPatchArgs)(nil)).Elem()
}

type DeploymentPatchInput interface {
	pulumi.Input

	ToDeploymentPatchOutput() DeploymentPatchOutput
	ToDeploymentPatchOutputWithContext(ctx context.Context) DeploymentPatchOutput
}

func (*DeploymentPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentPatch)(nil)).Elem()
}

func (i *DeploymentPatch) ToDeploymentPatchOutput() DeploymentPatchOutput {
	return i.ToDeploymentPatchOutputWithContext(context.Background())
}

func (i *DeploymentPatch) ToDeploymentPatchOutputWithContext(ctx context.Context) DeploymentPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentPatchOutput)
}

// DeploymentPatchArrayInput is an input type that accepts DeploymentPatchArray and DeploymentPatchArrayOutput values.
// You can construct a concrete instance of `DeploymentPatchArrayInput` via:
//
//	DeploymentPatchArray{ DeploymentPatchArgs{...} }
type DeploymentPatchArrayInput interface {
	pulumi.Input

	ToDeploymentPatchArrayOutput() DeploymentPatchArrayOutput
	ToDeploymentPatchArrayOutputWithContext(context.Context) DeploymentPatchArrayOutput
}

type DeploymentPatchArray []DeploymentPatchInput

func (DeploymentPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentPatch)(nil)).Elem()
}

func (i DeploymentPatchArray) ToDeploymentPatchArrayOutput() DeploymentPatchArrayOutput {
	return i.ToDeploymentPatchArrayOutputWithContext(context.Background())
}

func (i DeploymentPatchArray) ToDeploymentPatchArrayOutputWithContext(ctx context.Context) DeploymentPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentPatchArrayOutput)
}

// DeploymentPatchMapInput is an input type that accepts DeploymentPatchMap and DeploymentPatchMapOutput values.
// You can construct a concrete instance of `DeploymentPatchMapInput` via:
//
//	DeploymentPatchMap{ "key": DeploymentPatchArgs{...} }
type DeploymentPatchMapInput interface {
	pulumi.Input

	ToDeploymentPatchMapOutput() DeploymentPatchMapOutput
	ToDeploymentPatchMapOutputWithContext(context.Context) DeploymentPatchMapOutput
}

type DeploymentPatchMap map[string]DeploymentPatchInput

func (DeploymentPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentPatch)(nil)).Elem()
}

func (i DeploymentPatchMap) ToDeploymentPatchMapOutput() DeploymentPatchMapOutput {
	return i.ToDeploymentPatchMapOutputWithContext(context.Background())
}

func (i DeploymentPatchMap) ToDeploymentPatchMapOutputWithContext(ctx context.Context) DeploymentPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentPatchMapOutput)
}

type DeploymentPatchOutput struct{ *pulumi.OutputState }

func (DeploymentPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentPatch)(nil)).Elem()
}

func (o DeploymentPatchOutput) ToDeploymentPatchOutput() DeploymentPatchOutput {
	return o
}

func (o DeploymentPatchOutput) ToDeploymentPatchOutputWithContext(ctx context.Context) DeploymentPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o DeploymentPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o DeploymentPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object metadata.
func (o DeploymentPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *DeploymentPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Specification of the desired behavior of the Deployment.
func (o DeploymentPatchOutput) Spec() DeploymentSpecPatchPtrOutput {
	return o.ApplyT(func(v *DeploymentPatch) DeploymentSpecPatchPtrOutput { return v.Spec }).(DeploymentSpecPatchPtrOutput)
}

// Most recently observed status of the Deployment.
func (o DeploymentPatchOutput) Status() DeploymentStatusPatchPtrOutput {
	return o.ApplyT(func(v *DeploymentPatch) DeploymentStatusPatchPtrOutput { return v.Status }).(DeploymentStatusPatchPtrOutput)
}

type DeploymentPatchArrayOutput struct{ *pulumi.OutputState }

func (DeploymentPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentPatch)(nil)).Elem()
}

func (o DeploymentPatchArrayOutput) ToDeploymentPatchArrayOutput() DeploymentPatchArrayOutput {
	return o
}

func (o DeploymentPatchArrayOutput) ToDeploymentPatchArrayOutputWithContext(ctx context.Context) DeploymentPatchArrayOutput {
	return o
}

func (o DeploymentPatchArrayOutput) Index(i pulumi.IntInput) DeploymentPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeploymentPatch {
		return vs[0].([]*DeploymentPatch)[vs[1].(int)]
	}).(DeploymentPatchOutput)
}

type DeploymentPatchMapOutput struct{ *pulumi.OutputState }

func (DeploymentPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentPatch)(nil)).Elem()
}

func (o DeploymentPatchMapOutput) ToDeploymentPatchMapOutput() DeploymentPatchMapOutput {
	return o
}

func (o DeploymentPatchMapOutput) ToDeploymentPatchMapOutputWithContext(ctx context.Context) DeploymentPatchMapOutput {
	return o
}

func (o DeploymentPatchMapOutput) MapIndex(k pulumi.StringInput) DeploymentPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeploymentPatch {
		return vs[0].(map[string]*DeploymentPatch)[vs[1].(string)]
	}).(DeploymentPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentPatchInput)(nil)).Elem(), &DeploymentPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentPatchArrayInput)(nil)).Elem(), DeploymentPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentPatchMapInput)(nil)).Elem(), DeploymentPatchMap{})
	pulumi.RegisterOutputType(DeploymentPatchOutput{})
	pulumi.RegisterOutputType(DeploymentPatchArrayOutput{})
	pulumi.RegisterOutputType(DeploymentPatchMapOutput{})
}
