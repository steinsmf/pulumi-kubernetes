// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v2alpha1

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
// CronJob represents the configuration of a single cron job.
type CronJobPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec CronJobSpecPatchPtrOutput `pulumi:"spec"`
	// Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Status CronJobStatusPatchPtrOutput `pulumi:"status"`
}

// NewCronJobPatch registers a new resource with the given unique name, arguments, and options.
func NewCronJobPatch(ctx *pulumi.Context,
	name string, args *CronJobPatchArgs, opts ...pulumi.ResourceOption) (*CronJobPatch, error) {
	if args == nil {
		args = &CronJobPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("batch/v2alpha1")
	args.Kind = pulumi.StringPtr("CronJob")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:batch/v1:CronJobPatch"),
		},
		{
			Type: pulumi.String("kubernetes:batch/v1beta1:CronJobPatch"),
		},
	})
	opts = append(opts, aliases)
	var resource CronJobPatch
	err := ctx.RegisterResource("kubernetes:batch/v2alpha1:CronJobPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCronJobPatch gets an existing CronJobPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCronJobPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CronJobPatchState, opts ...pulumi.ResourceOption) (*CronJobPatch, error) {
	var resource CronJobPatch
	err := ctx.ReadResource("kubernetes:batch/v2alpha1:CronJobPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CronJobPatch resources.
type cronJobPatchState struct {
}

type CronJobPatchState struct {
}

func (CronJobPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*cronJobPatchState)(nil)).Elem()
}

type cronJobPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *CronJobSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a CronJobPatch resource.
type CronJobPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec CronJobSpecPatchPtrInput
}

func (CronJobPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cronJobPatchArgs)(nil)).Elem()
}

type CronJobPatchInput interface {
	pulumi.Input

	ToCronJobPatchOutput() CronJobPatchOutput
	ToCronJobPatchOutputWithContext(ctx context.Context) CronJobPatchOutput
}

func (*CronJobPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**CronJobPatch)(nil)).Elem()
}

func (i *CronJobPatch) ToCronJobPatchOutput() CronJobPatchOutput {
	return i.ToCronJobPatchOutputWithContext(context.Background())
}

func (i *CronJobPatch) ToCronJobPatchOutputWithContext(ctx context.Context) CronJobPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CronJobPatchOutput)
}

// CronJobPatchArrayInput is an input type that accepts CronJobPatchArray and CronJobPatchArrayOutput values.
// You can construct a concrete instance of `CronJobPatchArrayInput` via:
//
//	CronJobPatchArray{ CronJobPatchArgs{...} }
type CronJobPatchArrayInput interface {
	pulumi.Input

	ToCronJobPatchArrayOutput() CronJobPatchArrayOutput
	ToCronJobPatchArrayOutputWithContext(context.Context) CronJobPatchArrayOutput
}

type CronJobPatchArray []CronJobPatchInput

func (CronJobPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CronJobPatch)(nil)).Elem()
}

func (i CronJobPatchArray) ToCronJobPatchArrayOutput() CronJobPatchArrayOutput {
	return i.ToCronJobPatchArrayOutputWithContext(context.Background())
}

func (i CronJobPatchArray) ToCronJobPatchArrayOutputWithContext(ctx context.Context) CronJobPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CronJobPatchArrayOutput)
}

// CronJobPatchMapInput is an input type that accepts CronJobPatchMap and CronJobPatchMapOutput values.
// You can construct a concrete instance of `CronJobPatchMapInput` via:
//
//	CronJobPatchMap{ "key": CronJobPatchArgs{...} }
type CronJobPatchMapInput interface {
	pulumi.Input

	ToCronJobPatchMapOutput() CronJobPatchMapOutput
	ToCronJobPatchMapOutputWithContext(context.Context) CronJobPatchMapOutput
}

type CronJobPatchMap map[string]CronJobPatchInput

func (CronJobPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CronJobPatch)(nil)).Elem()
}

func (i CronJobPatchMap) ToCronJobPatchMapOutput() CronJobPatchMapOutput {
	return i.ToCronJobPatchMapOutputWithContext(context.Background())
}

func (i CronJobPatchMap) ToCronJobPatchMapOutputWithContext(ctx context.Context) CronJobPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CronJobPatchMapOutput)
}

type CronJobPatchOutput struct{ *pulumi.OutputState }

func (CronJobPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CronJobPatch)(nil)).Elem()
}

func (o CronJobPatchOutput) ToCronJobPatchOutput() CronJobPatchOutput {
	return o
}

func (o CronJobPatchOutput) ToCronJobPatchOutputWithContext(ctx context.Context) CronJobPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o CronJobPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CronJobPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o CronJobPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CronJobPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o CronJobPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *CronJobPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o CronJobPatchOutput) Spec() CronJobSpecPatchPtrOutput {
	return o.ApplyT(func(v *CronJobPatch) CronJobSpecPatchPtrOutput { return v.Spec }).(CronJobSpecPatchPtrOutput)
}

// Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o CronJobPatchOutput) Status() CronJobStatusPatchPtrOutput {
	return o.ApplyT(func(v *CronJobPatch) CronJobStatusPatchPtrOutput { return v.Status }).(CronJobStatusPatchPtrOutput)
}

type CronJobPatchArrayOutput struct{ *pulumi.OutputState }

func (CronJobPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CronJobPatch)(nil)).Elem()
}

func (o CronJobPatchArrayOutput) ToCronJobPatchArrayOutput() CronJobPatchArrayOutput {
	return o
}

func (o CronJobPatchArrayOutput) ToCronJobPatchArrayOutputWithContext(ctx context.Context) CronJobPatchArrayOutput {
	return o
}

func (o CronJobPatchArrayOutput) Index(i pulumi.IntInput) CronJobPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CronJobPatch {
		return vs[0].([]*CronJobPatch)[vs[1].(int)]
	}).(CronJobPatchOutput)
}

type CronJobPatchMapOutput struct{ *pulumi.OutputState }

func (CronJobPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CronJobPatch)(nil)).Elem()
}

func (o CronJobPatchMapOutput) ToCronJobPatchMapOutput() CronJobPatchMapOutput {
	return o
}

func (o CronJobPatchMapOutput) ToCronJobPatchMapOutputWithContext(ctx context.Context) CronJobPatchMapOutput {
	return o
}

func (o CronJobPatchMapOutput) MapIndex(k pulumi.StringInput) CronJobPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CronJobPatch {
		return vs[0].(map[string]*CronJobPatch)[vs[1].(string)]
	}).(CronJobPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CronJobPatchInput)(nil)).Elem(), &CronJobPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*CronJobPatchArrayInput)(nil)).Elem(), CronJobPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CronJobPatchMapInput)(nil)).Elem(), CronJobPatchMap{})
	pulumi.RegisterOutputType(CronJobPatchOutput{})
	pulumi.RegisterOutputType(CronJobPatchArrayOutput{})
	pulumi.RegisterOutputType(CronJobPatchMapOutput{})
}
