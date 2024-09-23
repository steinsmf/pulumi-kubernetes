// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package helm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/utilities"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = utilities.GetEnvOrDefault

type ReleaseStatus struct {
	// The version number of the application being deployed.
	AppVersion *string `pulumi:"appVersion"`
	// The name of the chart.
	Chart *string `pulumi:"chart"`
	// Name is the name of the release.
	Name *string `pulumi:"name"`
	// Namespace is the kubernetes namespace of the release.
	Namespace *string `pulumi:"namespace"`
	// Version is an int32 which represents the version of the release.
	Revision *int `pulumi:"revision"`
	// Status of the release.
	Status string `pulumi:"status"`
	// A SemVer 2 conformant version string of the chart.
	Version *string `pulumi:"version"`
}

// ReleaseStatusInput is an input type that accepts ReleaseStatusArgs and ReleaseStatusOutput values.
// You can construct a concrete instance of `ReleaseStatusInput` via:
//
//	ReleaseStatusArgs{...}
type ReleaseStatusInput interface {
	pulumi.Input

	ToReleaseStatusOutput() ReleaseStatusOutput
	ToReleaseStatusOutputWithContext(context.Context) ReleaseStatusOutput
}

type ReleaseStatusArgs struct {
	// The version number of the application being deployed.
	AppVersion pulumi.StringPtrInput `pulumi:"appVersion"`
	// The name of the chart.
	Chart pulumi.StringPtrInput `pulumi:"chart"`
	// Name is the name of the release.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Namespace is the kubernetes namespace of the release.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// Version is an int32 which represents the version of the release.
	Revision pulumi.IntPtrInput `pulumi:"revision"`
	// Status of the release.
	Status pulumi.StringInput `pulumi:"status"`
	// A SemVer 2 conformant version string of the chart.
	Version pulumi.StringPtrInput `pulumi:"version"`
}

func (ReleaseStatusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ReleaseStatus)(nil)).Elem()
}

func (i ReleaseStatusArgs) ToReleaseStatusOutput() ReleaseStatusOutput {
	return i.ToReleaseStatusOutputWithContext(context.Background())
}

func (i ReleaseStatusArgs) ToReleaseStatusOutputWithContext(ctx context.Context) ReleaseStatusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReleaseStatusOutput)
}

type ReleaseStatusOutput struct{ *pulumi.OutputState }

func (ReleaseStatusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ReleaseStatus)(nil)).Elem()
}

func (o ReleaseStatusOutput) ToReleaseStatusOutput() ReleaseStatusOutput {
	return o
}

func (o ReleaseStatusOutput) ToReleaseStatusOutputWithContext(ctx context.Context) ReleaseStatusOutput {
	return o
}

// The version number of the application being deployed.
func (o ReleaseStatusOutput) AppVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ReleaseStatus) *string { return v.AppVersion }).(pulumi.StringPtrOutput)
}

// The name of the chart.
func (o ReleaseStatusOutput) Chart() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ReleaseStatus) *string { return v.Chart }).(pulumi.StringPtrOutput)
}

// Name is the name of the release.
func (o ReleaseStatusOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ReleaseStatus) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Namespace is the kubernetes namespace of the release.
func (o ReleaseStatusOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ReleaseStatus) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

// Version is an int32 which represents the version of the release.
func (o ReleaseStatusOutput) Revision() pulumi.IntPtrOutput {
	return o.ApplyT(func(v ReleaseStatus) *int { return v.Revision }).(pulumi.IntPtrOutput)
}

// Status of the release.
func (o ReleaseStatusOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v ReleaseStatus) string { return v.Status }).(pulumi.StringOutput)
}

// A SemVer 2 conformant version string of the chart.
func (o ReleaseStatusOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ReleaseStatus) *string { return v.Version }).(pulumi.StringPtrOutput)
}

// Specification defining the Helm chart repository to use.
type RepositoryOpts struct {
	// The Repository's CA File
	CaFile *string `pulumi:"caFile"`
	// The repository's cert file
	CertFile *string `pulumi:"certFile"`
	// The repository's cert key file
	KeyFile *string `pulumi:"keyFile"`
	// Password for HTTP basic authentication
	Password *string `pulumi:"password"`
	// Repository where to locate the requested chart. If it's a URL the chart is installed without installing the repository.
	Repo *string `pulumi:"repo"`
	// Username for HTTP basic authentication
	Username *string `pulumi:"username"`
}

// RepositoryOptsInput is an input type that accepts RepositoryOptsArgs and RepositoryOptsOutput values.
// You can construct a concrete instance of `RepositoryOptsInput` via:
//
//	RepositoryOptsArgs{...}
type RepositoryOptsInput interface {
	pulumi.Input

	ToRepositoryOptsOutput() RepositoryOptsOutput
	ToRepositoryOptsOutputWithContext(context.Context) RepositoryOptsOutput
}

// Specification defining the Helm chart repository to use.
type RepositoryOptsArgs struct {
	// The Repository's CA File
	CaFile pulumi.StringPtrInput `pulumi:"caFile"`
	// The repository's cert file
	CertFile pulumi.StringPtrInput `pulumi:"certFile"`
	// The repository's cert key file
	KeyFile pulumi.StringPtrInput `pulumi:"keyFile"`
	// Password for HTTP basic authentication
	Password pulumi.StringPtrInput `pulumi:"password"`
	// Repository where to locate the requested chart. If it's a URL the chart is installed without installing the repository.
	Repo pulumi.StringPtrInput `pulumi:"repo"`
	// Username for HTTP basic authentication
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (RepositoryOptsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*RepositoryOpts)(nil)).Elem()
}

func (i RepositoryOptsArgs) ToRepositoryOptsOutput() RepositoryOptsOutput {
	return i.ToRepositoryOptsOutputWithContext(context.Background())
}

func (i RepositoryOptsArgs) ToRepositoryOptsOutputWithContext(ctx context.Context) RepositoryOptsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryOptsOutput)
}

func (i RepositoryOptsArgs) ToRepositoryOptsPtrOutput() RepositoryOptsPtrOutput {
	return i.ToRepositoryOptsPtrOutputWithContext(context.Background())
}

func (i RepositoryOptsArgs) ToRepositoryOptsPtrOutputWithContext(ctx context.Context) RepositoryOptsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryOptsOutput).ToRepositoryOptsPtrOutputWithContext(ctx)
}

// RepositoryOptsPtrInput is an input type that accepts RepositoryOptsArgs, RepositoryOptsPtr and RepositoryOptsPtrOutput values.
// You can construct a concrete instance of `RepositoryOptsPtrInput` via:
//
//	        RepositoryOptsArgs{...}
//
//	or:
//
//	        nil
type RepositoryOptsPtrInput interface {
	pulumi.Input

	ToRepositoryOptsPtrOutput() RepositoryOptsPtrOutput
	ToRepositoryOptsPtrOutputWithContext(context.Context) RepositoryOptsPtrOutput
}

type repositoryOptsPtrType RepositoryOptsArgs

func RepositoryOptsPtr(v *RepositoryOptsArgs) RepositoryOptsPtrInput {
	return (*repositoryOptsPtrType)(v)
}

func (*repositoryOptsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryOpts)(nil)).Elem()
}

func (i *repositoryOptsPtrType) ToRepositoryOptsPtrOutput() RepositoryOptsPtrOutput {
	return i.ToRepositoryOptsPtrOutputWithContext(context.Background())
}

func (i *repositoryOptsPtrType) ToRepositoryOptsPtrOutputWithContext(ctx context.Context) RepositoryOptsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryOptsPtrOutput)
}

// Specification defining the Helm chart repository to use.
type RepositoryOptsOutput struct{ *pulumi.OutputState }

func (RepositoryOptsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RepositoryOpts)(nil)).Elem()
}

func (o RepositoryOptsOutput) ToRepositoryOptsOutput() RepositoryOptsOutput {
	return o
}

func (o RepositoryOptsOutput) ToRepositoryOptsOutputWithContext(ctx context.Context) RepositoryOptsOutput {
	return o
}

func (o RepositoryOptsOutput) ToRepositoryOptsPtrOutput() RepositoryOptsPtrOutput {
	return o.ToRepositoryOptsPtrOutputWithContext(context.Background())
}

func (o RepositoryOptsOutput) ToRepositoryOptsPtrOutputWithContext(ctx context.Context) RepositoryOptsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RepositoryOpts) *RepositoryOpts {
		return &v
	}).(RepositoryOptsPtrOutput)
}

// The Repository's CA File
func (o RepositoryOptsOutput) CaFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RepositoryOpts) *string { return v.CaFile }).(pulumi.StringPtrOutput)
}

// The repository's cert file
func (o RepositoryOptsOutput) CertFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RepositoryOpts) *string { return v.CertFile }).(pulumi.StringPtrOutput)
}

// The repository's cert key file
func (o RepositoryOptsOutput) KeyFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RepositoryOpts) *string { return v.KeyFile }).(pulumi.StringPtrOutput)
}

// Password for HTTP basic authentication
func (o RepositoryOptsOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RepositoryOpts) *string { return v.Password }).(pulumi.StringPtrOutput)
}

// Repository where to locate the requested chart. If it's a URL the chart is installed without installing the repository.
func (o RepositoryOptsOutput) Repo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RepositoryOpts) *string { return v.Repo }).(pulumi.StringPtrOutput)
}

// Username for HTTP basic authentication
func (o RepositoryOptsOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RepositoryOpts) *string { return v.Username }).(pulumi.StringPtrOutput)
}

type RepositoryOptsPtrOutput struct{ *pulumi.OutputState }

func (RepositoryOptsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryOpts)(nil)).Elem()
}

func (o RepositoryOptsPtrOutput) ToRepositoryOptsPtrOutput() RepositoryOptsPtrOutput {
	return o
}

func (o RepositoryOptsPtrOutput) ToRepositoryOptsPtrOutputWithContext(ctx context.Context) RepositoryOptsPtrOutput {
	return o
}

func (o RepositoryOptsPtrOutput) Elem() RepositoryOptsOutput {
	return o.ApplyT(func(v *RepositoryOpts) RepositoryOpts {
		if v != nil {
			return *v
		}
		var ret RepositoryOpts
		return ret
	}).(RepositoryOptsOutput)
}

// The Repository's CA File
func (o RepositoryOptsPtrOutput) CaFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryOpts) *string {
		if v == nil {
			return nil
		}
		return v.CaFile
	}).(pulumi.StringPtrOutput)
}

// The repository's cert file
func (o RepositoryOptsPtrOutput) CertFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryOpts) *string {
		if v == nil {
			return nil
		}
		return v.CertFile
	}).(pulumi.StringPtrOutput)
}

// The repository's cert key file
func (o RepositoryOptsPtrOutput) KeyFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryOpts) *string {
		if v == nil {
			return nil
		}
		return v.KeyFile
	}).(pulumi.StringPtrOutput)
}

// Password for HTTP basic authentication
func (o RepositoryOptsPtrOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryOpts) *string {
		if v == nil {
			return nil
		}
		return v.Password
	}).(pulumi.StringPtrOutput)
}

// Repository where to locate the requested chart. If it's a URL the chart is installed without installing the repository.
func (o RepositoryOptsPtrOutput) Repo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryOpts) *string {
		if v == nil {
			return nil
		}
		return v.Repo
	}).(pulumi.StringPtrOutput)
}

// Username for HTTP basic authentication
func (o RepositoryOptsPtrOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepositoryOpts) *string {
		if v == nil {
			return nil
		}
		return v.Username
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReleaseStatusInput)(nil)).Elem(), ReleaseStatusArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryOptsInput)(nil)).Elem(), RepositoryOptsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryOptsPtrInput)(nil)).Elem(), RepositoryOptsArgs{})
	pulumi.RegisterOutputType(ReleaseStatusOutput{})
	pulumi.RegisterOutputType(RepositoryOptsOutput{})
	pulumi.RegisterOutputType(RepositoryOptsPtrOutput{})
}
