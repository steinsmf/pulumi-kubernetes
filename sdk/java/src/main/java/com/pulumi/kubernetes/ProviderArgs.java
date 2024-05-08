// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.inputs.HelmReleaseSettingsArgs;
import com.pulumi.kubernetes.inputs.KubeClientSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * If present, the name of the kubeconfig cluster to use.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return If present, the name of the kubeconfig cluster to use.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * If present, the name of the kubeconfig context to use.
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    /**
     * @return If present, the name of the kubeconfig context to use.
     * 
     */
    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * If present and set to true, the provider will delete resources associated with an unreachable Kubernetes cluster from Pulumi state
     * 
     */
    @Import(name="deleteUnreachable", json=true)
    private @Nullable Output<Boolean> deleteUnreachable;

    /**
     * @return If present and set to true, the provider will delete resources associated with an unreachable Kubernetes cluster from Pulumi state
     * 
     */
    public Optional<Output<Boolean>> deleteUnreachable() {
        return Optional.ofNullable(this.deleteUnreachable);
    }

    /**
     * BETA FEATURE - If present and set to true, allow ConfigMaps to be mutated.
     * This feature is in developer preview, and is disabled by default.
     * 
     * This config can be specified in the following ways using this precedence:
     * 1. This `enableConfigMapMutable` parameter.
     * 2. The `PULUMI_K8S_ENABLE_CONFIGMAP_MUTABLE` environment variable.
     * 
     */
    @Import(name="enableConfigMapMutable", json=true)
    private @Nullable Output<Boolean> enableConfigMapMutable;

    /**
     * @return BETA FEATURE - If present and set to true, allow ConfigMaps to be mutated.
     * This feature is in developer preview, and is disabled by default.
     * 
     * This config can be specified in the following ways using this precedence:
     * 1. This `enableConfigMapMutable` parameter.
     * 2. The `PULUMI_K8S_ENABLE_CONFIGMAP_MUTABLE` environment variable.
     * 
     */
    public Optional<Output<Boolean>> enableConfigMapMutable() {
        return Optional.ofNullable(this.enableConfigMapMutable);
    }

    /**
     * If present and set to false, disable Server-Side Apply mode.
     * See https://github.com/pulumi/pulumi-kubernetes/issues/2011 for additional details.
     * 
     */
    @Import(name="enableServerSideApply", json=true)
    private @Nullable Output<Boolean> enableServerSideApply;

    /**
     * @return If present and set to false, disable Server-Side Apply mode.
     * See https://github.com/pulumi/pulumi-kubernetes/issues/2011 for additional details.
     * 
     */
    public Optional<Output<Boolean>> enableServerSideApply() {
        return Optional.ofNullable(this.enableServerSideApply);
    }

    /**
     * If present and set to false, the provider will surface errors if a create operation would overwrite existing resources in the cluster.
     * 
     */
    @Import(name="enableUpsert", json=true)
    private @Nullable Output<Boolean> enableUpsert;

    /**
     * @return If present and set to false, the provider will surface errors if a create operation would overwrite existing resources in the cluster.
     * 
     */
    public Optional<Output<Boolean>> enableUpsert() {
        return Optional.ofNullable(this.enableUpsert);
    }

    /**
     * Options to configure the Helm Release resource.
     * 
     */
    @Import(name="helmReleaseSettings", json=true)
    private @Nullable Output<HelmReleaseSettingsArgs> helmReleaseSettings;

    /**
     * @return Options to configure the Helm Release resource.
     * 
     */
    public Optional<Output<HelmReleaseSettingsArgs>> helmReleaseSettings() {
        return Optional.ofNullable(this.helmReleaseSettings);
    }

    /**
     * Options for tuning the Kubernetes client used by a Provider.
     * 
     */
    @Import(name="kubeClientSettings", json=true)
    private @Nullable Output<KubeClientSettingsArgs> kubeClientSettings;

    /**
     * @return Options for tuning the Kubernetes client used by a Provider.
     * 
     */
    public Optional<Output<KubeClientSettingsArgs>> kubeClientSettings() {
        return Optional.ofNullable(this.kubeClientSettings);
    }

    /**
     * The contents of a kubeconfig file or the path to a kubeconfig file.
     * 
     */
    @Import(name="kubeconfig")
    private @Nullable Output<String> kubeconfig;

    /**
     * @return The contents of a kubeconfig file or the path to a kubeconfig file.
     * 
     */
    public Optional<Output<String>> kubeconfig() {
        return Optional.ofNullable(this.kubeconfig);
    }

    /**
     * If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
     * 
     * A namespace can be specified in multiple places, and the precedence is as follows:
     * 1. `.metadata.namespace` set on the resource.
     * 2. This `namespace` parameter.
     * 3. `namespace` set for the active context in the kubeconfig.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
     * 
     * A namespace can be specified in multiple places, and the precedence is as follows:
     * 1. `.metadata.namespace` set on the resource.
     * 2. This `namespace` parameter.
     * 3. `namespace` set for the active context in the kubeconfig.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
     * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
     * to the Pulumi program. This feature is in developer preview, and is disabled by default.
     * 
     * Note that some computed Outputs such as status fields will not be populated
     * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
     * and may result in an error if they are referenced by other resources. Also note that any secret values
     * used in these resources will be rendered in plaintext to the resulting YAML.
     * 
     */
    @Import(name="renderYamlToDirectory")
    private @Nullable Output<String> renderYamlToDirectory;

    /**
     * @return BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
     * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
     * to the Pulumi program. This feature is in developer preview, and is disabled by default.
     * 
     * Note that some computed Outputs such as status fields will not be populated
     * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
     * and may result in an error if they are referenced by other resources. Also note that any secret values
     * used in these resources will be rendered in plaintext to the resulting YAML.
     * 
     */
    public Optional<Output<String>> renderYamlToDirectory() {
        return Optional.ofNullable(this.renderYamlToDirectory);
    }

    /**
     * If present and set to true, the provider will skip resources update associated with an unreachable Kubernetes cluster from Pulumi state
     * 
     */
    @Import(name="skipUpdateUnreachable", json=true)
    private @Nullable Output<Boolean> skipUpdateUnreachable;

    /**
     * @return If present and set to true, the provider will skip resources update associated with an unreachable Kubernetes cluster from Pulumi state
     * 
     */
    public Optional<Output<Boolean>> skipUpdateUnreachable() {
        return Optional.ofNullable(this.skipUpdateUnreachable);
    }

    /**
     * If present and set to true, suppress apiVersion deprecation warnings from the CLI.
     * 
     */
    @Import(name="suppressDeprecationWarnings", json=true)
    private @Nullable Output<Boolean> suppressDeprecationWarnings;

    /**
     * @return If present and set to true, suppress apiVersion deprecation warnings from the CLI.
     * 
     */
    public Optional<Output<Boolean>> suppressDeprecationWarnings() {
        return Optional.ofNullable(this.suppressDeprecationWarnings);
    }

    /**
     * If present and set to true, suppress unsupported Helm hook warnings from the CLI.
     * 
     */
    @Import(name="suppressHelmHookWarnings", json=true)
    private @Nullable Output<Boolean> suppressHelmHookWarnings;

    /**
     * @return If present and set to true, suppress unsupported Helm hook warnings from the CLI.
     * 
     */
    public Optional<Output<Boolean>> suppressHelmHookWarnings() {
        return Optional.ofNullable(this.suppressHelmHookWarnings);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.cluster = $.cluster;
        this.context = $.context;
        this.deleteUnreachable = $.deleteUnreachable;
        this.enableConfigMapMutable = $.enableConfigMapMutable;
        this.enableServerSideApply = $.enableServerSideApply;
        this.enableUpsert = $.enableUpsert;
        this.helmReleaseSettings = $.helmReleaseSettings;
        this.kubeClientSettings = $.kubeClientSettings;
        this.kubeconfig = $.kubeconfig;
        this.namespace = $.namespace;
        this.renderYamlToDirectory = $.renderYamlToDirectory;
        this.skipUpdateUnreachable = $.skipUpdateUnreachable;
        this.suppressDeprecationWarnings = $.suppressDeprecationWarnings;
        this.suppressHelmHookWarnings = $.suppressHelmHookWarnings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster If present, the name of the kubeconfig cluster to use.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster If present, the name of the kubeconfig cluster to use.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param context If present, the name of the kubeconfig context to use.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context If present, the name of the kubeconfig context to use.
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param deleteUnreachable If present and set to true, the provider will delete resources associated with an unreachable Kubernetes cluster from Pulumi state
         * 
         * @return builder
         * 
         */
        public Builder deleteUnreachable(@Nullable Output<Boolean> deleteUnreachable) {
            $.deleteUnreachable = deleteUnreachable;
            return this;
        }

        /**
         * @param deleteUnreachable If present and set to true, the provider will delete resources associated with an unreachable Kubernetes cluster from Pulumi state
         * 
         * @return builder
         * 
         */
        public Builder deleteUnreachable(Boolean deleteUnreachable) {
            return deleteUnreachable(Output.of(deleteUnreachable));
        }

        /**
         * @param enableConfigMapMutable BETA FEATURE - If present and set to true, allow ConfigMaps to be mutated.
         * This feature is in developer preview, and is disabled by default.
         * 
         * This config can be specified in the following ways using this precedence:
         * 1. This `enableConfigMapMutable` parameter.
         * 2. The `PULUMI_K8S_ENABLE_CONFIGMAP_MUTABLE` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder enableConfigMapMutable(@Nullable Output<Boolean> enableConfigMapMutable) {
            $.enableConfigMapMutable = enableConfigMapMutable;
            return this;
        }

        /**
         * @param enableConfigMapMutable BETA FEATURE - If present and set to true, allow ConfigMaps to be mutated.
         * This feature is in developer preview, and is disabled by default.
         * 
         * This config can be specified in the following ways using this precedence:
         * 1. This `enableConfigMapMutable` parameter.
         * 2. The `PULUMI_K8S_ENABLE_CONFIGMAP_MUTABLE` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder enableConfigMapMutable(Boolean enableConfigMapMutable) {
            return enableConfigMapMutable(Output.of(enableConfigMapMutable));
        }

        /**
         * @param enableServerSideApply If present and set to false, disable Server-Side Apply mode.
         * See https://github.com/pulumi/pulumi-kubernetes/issues/2011 for additional details.
         * 
         * @return builder
         * 
         */
        public Builder enableServerSideApply(@Nullable Output<Boolean> enableServerSideApply) {
            $.enableServerSideApply = enableServerSideApply;
            return this;
        }

        /**
         * @param enableServerSideApply If present and set to false, disable Server-Side Apply mode.
         * See https://github.com/pulumi/pulumi-kubernetes/issues/2011 for additional details.
         * 
         * @return builder
         * 
         */
        public Builder enableServerSideApply(Boolean enableServerSideApply) {
            return enableServerSideApply(Output.of(enableServerSideApply));
        }

        /**
         * @param enableUpsert If present and set to false, the provider will surface errors if a create operation would overwrite existing resources in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableUpsert(@Nullable Output<Boolean> enableUpsert) {
            $.enableUpsert = enableUpsert;
            return this;
        }

        /**
         * @param enableUpsert If present and set to false, the provider will surface errors if a create operation would overwrite existing resources in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableUpsert(Boolean enableUpsert) {
            return enableUpsert(Output.of(enableUpsert));
        }

        /**
         * @param helmReleaseSettings Options to configure the Helm Release resource.
         * 
         * @return builder
         * 
         */
        public Builder helmReleaseSettings(@Nullable Output<HelmReleaseSettingsArgs> helmReleaseSettings) {
            $.helmReleaseSettings = helmReleaseSettings;
            return this;
        }

        /**
         * @param helmReleaseSettings Options to configure the Helm Release resource.
         * 
         * @return builder
         * 
         */
        public Builder helmReleaseSettings(HelmReleaseSettingsArgs helmReleaseSettings) {
            return helmReleaseSettings(Output.of(helmReleaseSettings));
        }

        /**
         * @param kubeClientSettings Options for tuning the Kubernetes client used by a Provider.
         * 
         * @return builder
         * 
         */
        public Builder kubeClientSettings(@Nullable Output<KubeClientSettingsArgs> kubeClientSettings) {
            $.kubeClientSettings = kubeClientSettings;
            return this;
        }

        /**
         * @param kubeClientSettings Options for tuning the Kubernetes client used by a Provider.
         * 
         * @return builder
         * 
         */
        public Builder kubeClientSettings(KubeClientSettingsArgs kubeClientSettings) {
            return kubeClientSettings(Output.of(kubeClientSettings));
        }

        /**
         * @param kubeconfig The contents of a kubeconfig file or the path to a kubeconfig file.
         * 
         * @return builder
         * 
         */
        public Builder kubeconfig(@Nullable Output<String> kubeconfig) {
            $.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * @param kubeconfig The contents of a kubeconfig file or the path to a kubeconfig file.
         * 
         * @return builder
         * 
         */
        public Builder kubeconfig(String kubeconfig) {
            return kubeconfig(Output.of(kubeconfig));
        }

        /**
         * @param namespace If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
         * 
         * A namespace can be specified in multiple places, and the precedence is as follows:
         * 1. `.metadata.namespace` set on the resource.
         * 2. This `namespace` parameter.
         * 3. `namespace` set for the active context in the kubeconfig.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
         * 
         * A namespace can be specified in multiple places, and the precedence is as follows:
         * 1. `.metadata.namespace` set on the resource.
         * 2. This `namespace` parameter.
         * 3. `namespace` set for the active context in the kubeconfig.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param renderYamlToDirectory BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
         * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
         * to the Pulumi program. This feature is in developer preview, and is disabled by default.
         * 
         * Note that some computed Outputs such as status fields will not be populated
         * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
         * and may result in an error if they are referenced by other resources. Also note that any secret values
         * used in these resources will be rendered in plaintext to the resulting YAML.
         * 
         * @return builder
         * 
         */
        public Builder renderYamlToDirectory(@Nullable Output<String> renderYamlToDirectory) {
            $.renderYamlToDirectory = renderYamlToDirectory;
            return this;
        }

        /**
         * @param renderYamlToDirectory BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
         * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
         * to the Pulumi program. This feature is in developer preview, and is disabled by default.
         * 
         * Note that some computed Outputs such as status fields will not be populated
         * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
         * and may result in an error if they are referenced by other resources. Also note that any secret values
         * used in these resources will be rendered in plaintext to the resulting YAML.
         * 
         * @return builder
         * 
         */
        public Builder renderYamlToDirectory(String renderYamlToDirectory) {
            return renderYamlToDirectory(Output.of(renderYamlToDirectory));
        }

        /**
         * @param skipUpdateUnreachable If present and set to true, the provider will skip resources update associated with an unreachable Kubernetes cluster from Pulumi state
         * 
         * @return builder
         * 
         */
        public Builder skipUpdateUnreachable(@Nullable Output<Boolean> skipUpdateUnreachable) {
            $.skipUpdateUnreachable = skipUpdateUnreachable;
            return this;
        }

        /**
         * @param skipUpdateUnreachable If present and set to true, the provider will skip resources update associated with an unreachable Kubernetes cluster from Pulumi state
         * 
         * @return builder
         * 
         */
        public Builder skipUpdateUnreachable(Boolean skipUpdateUnreachable) {
            return skipUpdateUnreachable(Output.of(skipUpdateUnreachable));
        }

        /**
         * @param suppressDeprecationWarnings If present and set to true, suppress apiVersion deprecation warnings from the CLI.
         * 
         * @return builder
         * 
         */
        public Builder suppressDeprecationWarnings(@Nullable Output<Boolean> suppressDeprecationWarnings) {
            $.suppressDeprecationWarnings = suppressDeprecationWarnings;
            return this;
        }

        /**
         * @param suppressDeprecationWarnings If present and set to true, suppress apiVersion deprecation warnings from the CLI.
         * 
         * @return builder
         * 
         */
        public Builder suppressDeprecationWarnings(Boolean suppressDeprecationWarnings) {
            return suppressDeprecationWarnings(Output.of(suppressDeprecationWarnings));
        }

        /**
         * @param suppressHelmHookWarnings If present and set to true, suppress unsupported Helm hook warnings from the CLI.
         * 
         * @return builder
         * 
         */
        public Builder suppressHelmHookWarnings(@Nullable Output<Boolean> suppressHelmHookWarnings) {
            $.suppressHelmHookWarnings = suppressHelmHookWarnings;
            return this;
        }

        /**
         * @param suppressHelmHookWarnings If present and set to true, suppress unsupported Helm hook warnings from the CLI.
         * 
         * @return builder
         * 
         */
        public Builder suppressHelmHookWarnings(Boolean suppressHelmHookWarnings) {
            return suppressHelmHookWarnings(Output.of(suppressHelmHookWarnings));
        }

        public ProviderArgs build() {
            $.deleteUnreachable = Codegen.booleanProp("deleteUnreachable").output().arg($.deleteUnreachable).env("PULUMI_K8S_DELETE_UNREACHABLE").getNullable();
            $.enableConfigMapMutable = Codegen.booleanProp("enableConfigMapMutable").output().arg($.enableConfigMapMutable).env("PULUMI_K8S_ENABLE_CONFIGMAP_MUTABLE").getNullable();
            $.enableServerSideApply = Codegen.booleanProp("enableServerSideApply").output().arg($.enableServerSideApply).env("PULUMI_K8S_ENABLE_SERVER_SIDE_APPLY").getNullable();
            $.enableUpsert = Codegen.booleanProp("enableUpsert").output().arg($.enableUpsert).env("PULUMI_K8S_ENABLE_UPSERT").getNullable();
            $.kubeconfig = Codegen.stringProp("kubeconfig").output().arg($.kubeconfig).env("KUBECONFIG").getNullable();
            $.skipUpdateUnreachable = Codegen.booleanProp("skipUpdateUnreachable").output().arg($.skipUpdateUnreachable).env("PULUMI_K8S_SKIP_UPDATE_UNREACHABLE").getNullable();
            $.suppressDeprecationWarnings = Codegen.booleanProp("suppressDeprecationWarnings").output().arg($.suppressDeprecationWarnings).env("PULUMI_K8S_SUPPRESS_DEPRECATION_WARNINGS").getNullable();
            $.suppressHelmHookWarnings = Codegen.booleanProp("suppressHelmHookWarnings").output().arg($.suppressHelmHookWarnings).env("PULUMI_K8S_SUPPRESS_HELM_HOOK_WARNINGS").getNullable();
            return $;
        }
    }

}
