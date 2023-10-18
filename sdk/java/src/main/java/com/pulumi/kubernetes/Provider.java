// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.ProviderArgs;
import com.pulumi.kubernetes.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the kubernetes package.
 * 
 */
@ResourceType(type="pulumi:providers:kubernetes")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * If present, the name of the kubeconfig cluster to use.
     * 
     */
    @Export(name="cluster", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cluster;

    /**
     * @return If present, the name of the kubeconfig cluster to use.
     * 
     */
    public Output<Optional<String>> cluster() {
        return Codegen.optional(this.cluster);
    }
    /**
     * If present, the name of the kubeconfig context to use.
     * 
     */
    @Export(name="context", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> context;

    /**
     * @return If present, the name of the kubeconfig context to use.
     * 
     */
    public Output<Optional<String>> context() {
        return Codegen.optional(this.context);
    }
    /**
     * The contents of a kubeconfig file or the path to a kubeconfig file.
     * 
     */
    @Export(name="kubeconfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kubeconfig;

    /**
     * @return The contents of a kubeconfig file or the path to a kubeconfig file.
     * 
     */
    public Output<Optional<String>> kubeconfig() {
        return Codegen.optional(this.kubeconfig);
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
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namespace;

    /**
     * @return If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
     * 
     * A namespace can be specified in multiple places, and the precedence is as follows:
     * 1. `.metadata.namespace` set on the resource.
     * 2. This `namespace` parameter.
     * 3. `namespace` set for the active context in the kubeconfig.
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
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
    @Export(name="renderYamlToDirectory", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> renderYamlToDirectory;

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
    public Output<Optional<String>> renderYamlToDirectory() {
        return Codegen.optional(this.renderYamlToDirectory);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
