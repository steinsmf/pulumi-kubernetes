// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/utilities"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = utilities.GetEnvOrDefault

// If present, the name of the kubeconfig cluster to use.
func GetCluster(ctx *pulumi.Context) string {
	return config.Get(ctx, "kubernetes:cluster")
}

// If present, this value will control the provider's replacement behavior. In particular, the provider will _only_ be replaced when `clusterIdentifier` changes; all other changes to provider configuration will be treated as updates.
//
// Kubernetes does not yet offer an API for cluster identification, so Pulumi uses heuristics to decide when a provider resource should be replaced or updated. These heuristics can sometimes lead to destructive replace operations when an update would be more appropriate, or vice versa.
//
// Use `clusterIdentifier` for more fine-grained control of the provider resource's lifecycle.
func GetClusterIdentifier(ctx *pulumi.Context) string {
	return config.Get(ctx, "kubernetes:clusterIdentifier")
}

// If present, the name of the kubeconfig context to use.
func GetContext(ctx *pulumi.Context) string {
	return config.Get(ctx, "kubernetes:context")
}

// If present and set to true, the provider will delete resources associated with an unreachable Kubernetes cluster from Pulumi state
func GetDeleteUnreachable(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:deleteUnreachable")
}

// BETA FEATURE - If present and set to true, allow ConfigMaps to be mutated.
// This feature is in developer preview, and is disabled by default.
//
// This config can be specified in the following ways using this precedence:
// 1. This `enableConfigMapMutable` parameter.
// 2. The `PULUMI_K8S_ENABLE_CONFIGMAP_MUTABLE` environment variable.
func GetEnableConfigMapMutable(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:enableConfigMapMutable")
}

// Obsolete. This option has no effect.
//
// Deprecated: This option is deprecated, and will be removed in a future release.
func GetEnableReplaceCRD(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:enableReplaceCRD")
}

// BETA FEATURE - If present and set to true, allow Secrets to be mutated.
// This feature is in developer preview, and is disabled by default.
//
// This config can be specified in the following ways using this precedence:
// 1. This `enableSecretMutable` parameter.
// 2. The `PULUMI_K8S_ENABLE_SECRET_MUTABLE` environment variable.
func GetEnableSecretMutable(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:enableSecretMutable")
}

// If present and set to false, disable Server-Side Apply mode.
// See https://github.com/pulumi/pulumi-kubernetes/issues/2011 for additional details.
func GetEnableServerSideApply(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:enableServerSideApply")
}

// The contents of a kubeconfig file or the path to a kubeconfig file. If this is set, this config will be used instead of $KUBECONFIG.
func GetKubeconfig(ctx *pulumi.Context) string {
	return config.Get(ctx, "kubernetes:kubeconfig")
}

// If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
//
// A namespace can be specified in multiple places, and the precedence is as follows:
// 1. `.metadata.namespace` set on the resource.
// 2. This `namespace` parameter.
// 3. `namespace` set for the active context in the kubeconfig.
func GetNamespace(ctx *pulumi.Context) string {
	return config.Get(ctx, "kubernetes:namespace")
}

// BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
// be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
// to the Pulumi program. This feature is in developer preview, and is disabled by default.
//
// Note that some computed Outputs such as status fields will not be populated
// since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
// and may result in an error if they are referenced by other resources. Also note that any secret values
// used in these resources will be rendered in plaintext to the resulting YAML.
func GetRenderYamlToDirectory(ctx *pulumi.Context) string {
	return config.Get(ctx, "kubernetes:renderYamlToDirectory")
}

// If present and set to true, the provider will skip resources update associated with an unreachable Kubernetes cluster from Pulumi state
func GetSkipUpdateUnreachable(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:skipUpdateUnreachable")
}

// If present and set to true, the provider will use strict configuration mode. Recommended for production stacks. In this mode, the default Kubernetes provider is disabled, and the `kubeconfig` and `context` settings are required for Provider configuration. These settings unambiguously ensure that every Kubernetes resource is associated with a particular cluster.
func GetStrictMode(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:strictMode")
}

// If present and set to true, suppress apiVersion deprecation warnings from the CLI.
//
// This config can be specified in the following ways, using this precedence:
// 1. This `suppressDeprecationWarnings` parameter.
// 2. The `PULUMI_K8S_SUPPRESS_DEPRECATION_WARNINGS` environment variable.
func GetSuppressDeprecationWarnings(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:suppressDeprecationWarnings")
}

// If present and set to true, suppress unsupported Helm hook warnings from the CLI.
//
// This config can be specified in the following ways, using this precedence:
// 1. This `suppressHelmHookWarnings` parameter.
// 2. The `PULUMI_K8S_SUPPRESS_HELM_HOOK_WARNINGS` environment variable.
func GetSuppressHelmHookWarnings(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "kubernetes:suppressHelmHookWarnings")
}
