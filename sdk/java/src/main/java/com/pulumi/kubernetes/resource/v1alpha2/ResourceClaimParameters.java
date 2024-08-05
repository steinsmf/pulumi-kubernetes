// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.resource.v1alpha2.ResourceClaimParametersArgs;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.DriverRequests;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.ResourceClaimParametersReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ResourceClaimParameters defines resource requests for a ResourceClaim in an in-tree format understood by Kubernetes.
 * 
 */
@ResourceType(type="kubernetes:resource.k8s.io/v1alpha2:ResourceClaimParameters")
public class ResourceClaimParameters extends com.pulumi.resources.CustomResource {
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
     * DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.
     * 
     * May be empty, in which case the claim can always be allocated.
     * 
     */
    @Export(name="driverRequests", refs={List.class,DriverRequests.class}, tree="[0,1]")
    private Output<List<DriverRequests>> driverRequests;

    /**
     * @return DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.
     * 
     * May be empty, in which case the claim can always be allocated.
     * 
     */
    public Output<List<DriverRequests>> driverRequests() {
        return this.driverRequests;
    }
    /**
     * If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the claim parameters when the parameter reference of the claim refers to some unknown type.
     * 
     */
    @Export(name="generatedFrom", refs={ResourceClaimParametersReference.class}, tree="[0]")
    private Output<ResourceClaimParametersReference> generatedFrom;

    /**
     * @return If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the claim parameters when the parameter reference of the claim refers to some unknown type.
     * 
     */
    public Output<ResourceClaimParametersReference> generatedFrom() {
        return this.generatedFrom;
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
     * Standard object metadata
     * 
     */
    @Export(name="metadata", refs={ObjectMeta.class}, tree="[0]")
    private Output<ObjectMeta> metadata;

    /**
     * @return Standard object metadata
     * 
     */
    public Output<ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.
     * 
     */
    @Export(name="shareable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> shareable;

    /**
     * @return Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.
     * 
     */
    public Output<Boolean> shareable() {
        return this.shareable;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceClaimParameters(String name) {
        this(name, ResourceClaimParametersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceClaimParameters(String name, @Nullable ResourceClaimParametersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceClaimParameters(String name, @Nullable ResourceClaimParametersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:resource.k8s.io/v1alpha2:ResourceClaimParameters", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceClaimParameters(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:resource.k8s.io/v1alpha2:ResourceClaimParameters", name, null, makeResourceOptions(options, id));
    }

    private static ResourceClaimParametersArgs makeArgs(@Nullable ResourceClaimParametersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? ResourceClaimParametersArgs.builder() : ResourceClaimParametersArgs.builder(args);
        return builder
            .apiVersion("resource.k8s.io/v1alpha2")
            .kind("ResourceClaimParameters")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ResourceClaimParameters get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceClaimParameters(name, id, options);
    }
}
