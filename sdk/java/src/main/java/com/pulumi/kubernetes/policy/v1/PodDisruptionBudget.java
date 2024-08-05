// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.policy.v1.PodDisruptionBudgetArgs;
import com.pulumi.kubernetes.policy.v1.outputs.PodDisruptionBudgetSpec;
import com.pulumi.kubernetes.policy.v1.outputs.PodDisruptionBudgetStatus;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
 * 
 */
@ResourceType(type="kubernetes:policy/v1:PodDisruptionBudget")
public class PodDisruptionBudget extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", refs={ObjectMeta.class}, tree="[0]")
    private Output<ObjectMeta> metadata;

    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output<ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Specification of the desired behavior of the PodDisruptionBudget.
     * 
     */
    @Export(name="spec", refs={PodDisruptionBudgetSpec.class}, tree="[0]")
    private Output<PodDisruptionBudgetSpec> spec;

    /**
     * @return Specification of the desired behavior of the PodDisruptionBudget.
     * 
     */
    public Output<PodDisruptionBudgetSpec> spec() {
        return this.spec;
    }
    /**
     * Most recently observed status of the PodDisruptionBudget.
     * 
     */
    @Export(name="status", refs={PodDisruptionBudgetStatus.class}, tree="[0]")
    private Output</* @Nullable */ PodDisruptionBudgetStatus> status;

    /**
     * @return Most recently observed status of the PodDisruptionBudget.
     * 
     */
    public Output<Optional<PodDisruptionBudgetStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PodDisruptionBudget(String name) {
        this(name, PodDisruptionBudgetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PodDisruptionBudget(String name, @Nullable PodDisruptionBudgetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PodDisruptionBudget(String name, @Nullable PodDisruptionBudgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:policy/v1:PodDisruptionBudget", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private PodDisruptionBudget(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:policy/v1:PodDisruptionBudget", name, null, makeResourceOptions(options, id));
    }

    private static PodDisruptionBudgetArgs makeArgs(@Nullable PodDisruptionBudgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? PodDisruptionBudgetArgs.builder() : PodDisruptionBudgetArgs.builder(args);
        return builder
            .apiVersion("policy/v1")
            .kind("PodDisruptionBudget")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:policy/v1beta1:PodDisruptionBudget").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PodDisruptionBudget get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PodDisruptionBudget(name, id, options);
    }
}
