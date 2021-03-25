// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBinding, and will no longer be served in v1.22.
type ClusterRoleBinding struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata.
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
	RoleRef RoleRefOutput `pulumi:"roleRef"`
	// Subjects holds references to the objects the role applies to.
	Subjects SubjectArrayOutput `pulumi:"subjects"`
}

// NewClusterRoleBinding registers a new resource with the given unique name, arguments, and options.
func NewClusterRoleBinding(ctx *pulumi.Context,
	name string, args *ClusterRoleBindingArgs, opts ...pulumi.ResourceOption) (*ClusterRoleBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleRef == nil {
		return nil, errors.New("invalid value for required argument 'RoleRef'")
	}
	args.ApiVersion = pulumi.StringPtr("rbac.authorization.k8s.io/v1beta1")
	args.Kind = pulumi.StringPtr("ClusterRoleBinding")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleBinding"),
		},
		{
			Type: pulumi.String("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRoleBinding"),
		},
	})
	opts = append(opts, aliases)
	var resource ClusterRoleBinding
	err := ctx.RegisterResource("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRoleBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterRoleBinding gets an existing ClusterRoleBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterRoleBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterRoleBindingState, opts ...pulumi.ResourceOption) (*ClusterRoleBinding, error) {
	var resource ClusterRoleBinding
	err := ctx.ReadResource("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRoleBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterRoleBinding resources.
type clusterRoleBindingState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata.
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
	RoleRef *RoleRef `pulumi:"roleRef"`
	// Subjects holds references to the objects the role applies to.
	Subjects []Subject `pulumi:"subjects"`
}

type ClusterRoleBindingState struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata.
	Metadata metav1.ObjectMetaPtrInput
	// RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
	RoleRef RoleRefPtrInput
	// Subjects holds references to the objects the role applies to.
	Subjects SubjectArrayInput
}

func (ClusterRoleBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterRoleBindingState)(nil)).Elem()
}

type clusterRoleBindingArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata.
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
	RoleRef RoleRef `pulumi:"roleRef"`
	// Subjects holds references to the objects the role applies to.
	Subjects []Subject `pulumi:"subjects"`
}

// The set of arguments for constructing a ClusterRoleBinding resource.
type ClusterRoleBindingArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata.
	Metadata metav1.ObjectMetaPtrInput
	// RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
	RoleRef RoleRefInput
	// Subjects holds references to the objects the role applies to.
	Subjects SubjectArrayInput
}

func (ClusterRoleBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterRoleBindingArgs)(nil)).Elem()
}

type ClusterRoleBindingInput interface {
	pulumi.Input

	ToClusterRoleBindingOutput() ClusterRoleBindingOutput
	ToClusterRoleBindingOutputWithContext(ctx context.Context) ClusterRoleBindingOutput
}

func (*ClusterRoleBinding) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterRoleBinding)(nil))
}

func (i *ClusterRoleBinding) ToClusterRoleBindingOutput() ClusterRoleBindingOutput {
	return i.ToClusterRoleBindingOutputWithContext(context.Background())
}

func (i *ClusterRoleBinding) ToClusterRoleBindingOutputWithContext(ctx context.Context) ClusterRoleBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleBindingOutput)
}

func (i *ClusterRoleBinding) ToClusterRoleBindingPtrOutput() ClusterRoleBindingPtrOutput {
	return i.ToClusterRoleBindingPtrOutputWithContext(context.Background())
}

func (i *ClusterRoleBinding) ToClusterRoleBindingPtrOutputWithContext(ctx context.Context) ClusterRoleBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleBindingPtrOutput)
}

type ClusterRoleBindingPtrInput interface {
	pulumi.Input

	ToClusterRoleBindingPtrOutput() ClusterRoleBindingPtrOutput
	ToClusterRoleBindingPtrOutputWithContext(ctx context.Context) ClusterRoleBindingPtrOutput
}

type clusterRoleBindingPtrType ClusterRoleBindingArgs

func (*clusterRoleBindingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterRoleBinding)(nil))
}

func (i *clusterRoleBindingPtrType) ToClusterRoleBindingPtrOutput() ClusterRoleBindingPtrOutput {
	return i.ToClusterRoleBindingPtrOutputWithContext(context.Background())
}

func (i *clusterRoleBindingPtrType) ToClusterRoleBindingPtrOutputWithContext(ctx context.Context) ClusterRoleBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleBindingPtrOutput)
}

// ClusterRoleBindingArrayInput is an input type that accepts ClusterRoleBindingArray and ClusterRoleBindingArrayOutput values.
// You can construct a concrete instance of `ClusterRoleBindingArrayInput` via:
//
//          ClusterRoleBindingArray{ ClusterRoleBindingArgs{...} }
type ClusterRoleBindingArrayInput interface {
	pulumi.Input

	ToClusterRoleBindingArrayOutput() ClusterRoleBindingArrayOutput
	ToClusterRoleBindingArrayOutputWithContext(context.Context) ClusterRoleBindingArrayOutput
}

type ClusterRoleBindingArray []ClusterRoleBindingInput

func (ClusterRoleBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ClusterRoleBinding)(nil))
}

func (i ClusterRoleBindingArray) ToClusterRoleBindingArrayOutput() ClusterRoleBindingArrayOutput {
	return i.ToClusterRoleBindingArrayOutputWithContext(context.Background())
}

func (i ClusterRoleBindingArray) ToClusterRoleBindingArrayOutputWithContext(ctx context.Context) ClusterRoleBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleBindingArrayOutput)
}

// ClusterRoleBindingMapInput is an input type that accepts ClusterRoleBindingMap and ClusterRoleBindingMapOutput values.
// You can construct a concrete instance of `ClusterRoleBindingMapInput` via:
//
//          ClusterRoleBindingMap{ "key": ClusterRoleBindingArgs{...} }
type ClusterRoleBindingMapInput interface {
	pulumi.Input

	ToClusterRoleBindingMapOutput() ClusterRoleBindingMapOutput
	ToClusterRoleBindingMapOutputWithContext(context.Context) ClusterRoleBindingMapOutput
}

type ClusterRoleBindingMap map[string]ClusterRoleBindingInput

func (ClusterRoleBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ClusterRoleBinding)(nil))
}

func (i ClusterRoleBindingMap) ToClusterRoleBindingMapOutput() ClusterRoleBindingMapOutput {
	return i.ToClusterRoleBindingMapOutputWithContext(context.Background())
}

func (i ClusterRoleBindingMap) ToClusterRoleBindingMapOutputWithContext(ctx context.Context) ClusterRoleBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleBindingMapOutput)
}

type ClusterRoleBindingOutput struct {
	*pulumi.OutputState
}

func (ClusterRoleBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterRoleBinding)(nil))
}

func (o ClusterRoleBindingOutput) ToClusterRoleBindingOutput() ClusterRoleBindingOutput {
	return o
}

func (o ClusterRoleBindingOutput) ToClusterRoleBindingOutputWithContext(ctx context.Context) ClusterRoleBindingOutput {
	return o
}

func (o ClusterRoleBindingOutput) ToClusterRoleBindingPtrOutput() ClusterRoleBindingPtrOutput {
	return o.ToClusterRoleBindingPtrOutputWithContext(context.Background())
}

func (o ClusterRoleBindingOutput) ToClusterRoleBindingPtrOutputWithContext(ctx context.Context) ClusterRoleBindingPtrOutput {
	return o.ApplyT(func(v ClusterRoleBinding) *ClusterRoleBinding {
		return &v
	}).(ClusterRoleBindingPtrOutput)
}

type ClusterRoleBindingPtrOutput struct {
	*pulumi.OutputState
}

func (ClusterRoleBindingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterRoleBinding)(nil))
}

func (o ClusterRoleBindingPtrOutput) ToClusterRoleBindingPtrOutput() ClusterRoleBindingPtrOutput {
	return o
}

func (o ClusterRoleBindingPtrOutput) ToClusterRoleBindingPtrOutputWithContext(ctx context.Context) ClusterRoleBindingPtrOutput {
	return o
}

type ClusterRoleBindingArrayOutput struct{ *pulumi.OutputState }

func (ClusterRoleBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ClusterRoleBinding)(nil))
}

func (o ClusterRoleBindingArrayOutput) ToClusterRoleBindingArrayOutput() ClusterRoleBindingArrayOutput {
	return o
}

func (o ClusterRoleBindingArrayOutput) ToClusterRoleBindingArrayOutputWithContext(ctx context.Context) ClusterRoleBindingArrayOutput {
	return o
}

func (o ClusterRoleBindingArrayOutput) Index(i pulumi.IntInput) ClusterRoleBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ClusterRoleBinding {
		return vs[0].([]ClusterRoleBinding)[vs[1].(int)]
	}).(ClusterRoleBindingOutput)
}

type ClusterRoleBindingMapOutput struct{ *pulumi.OutputState }

func (ClusterRoleBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ClusterRoleBinding)(nil))
}

func (o ClusterRoleBindingMapOutput) ToClusterRoleBindingMapOutput() ClusterRoleBindingMapOutput {
	return o
}

func (o ClusterRoleBindingMapOutput) ToClusterRoleBindingMapOutputWithContext(ctx context.Context) ClusterRoleBindingMapOutput {
	return o
}

func (o ClusterRoleBindingMapOutput) MapIndex(k pulumi.StringInput) ClusterRoleBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ClusterRoleBinding {
		return vs[0].(map[string]ClusterRoleBinding)[vs[1].(string)]
	}).(ClusterRoleBindingOutput)
}

func init() {
	pulumi.RegisterOutputType(ClusterRoleBindingOutput{})
	pulumi.RegisterOutputType(ClusterRoleBindingPtrOutput{})
	pulumi.RegisterOutputType(ClusterRoleBindingArrayOutput{})
	pulumi.RegisterOutputType(ClusterRoleBindingMapOutput{})
}
