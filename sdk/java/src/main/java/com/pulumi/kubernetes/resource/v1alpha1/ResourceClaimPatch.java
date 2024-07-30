// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMetaPatch;
import com.pulumi.kubernetes.resource.v1alpha1.ResourceClaimPatchArgs;
import com.pulumi.kubernetes.resource.v1alpha1.outputs.ResourceClaimSpecPatch;
import com.pulumi.kubernetes.resource.v1alpha1.outputs.ResourceClaimStatusPatch;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Patch resources are used to modify existing Kubernetes resources by using
 * Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
 * one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
 * Conflicts will result in an error by default, but can be forced using the &#34;pulumi.com/patchForce&#34; annotation. See the
 * [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
 * additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
 * ResourceClaim describes which resources are needed by a resource consumer. Its status tracks whether the resource has been allocated and what the resulting attributes are.
 * 
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 * 
 */
@ResourceType(type="kubernetes:resource.k8s.io/v1alpha1:ResourceClaimPatch")
public class ResourceClaimPatch extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<Optional<String>> apiVersion() {
        return Codegen.optional(this.apiVersion);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Standard object metadata
     * 
     */
    @Export(name="metadata", refs={ObjectMetaPatch.class}, tree="[0]")
    private Output</* @Nullable */ ObjectMetaPatch> metadata;

    /**
     * @return Standard object metadata
     * 
     */
    public Output<Optional<ObjectMetaPatch>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Spec describes the desired attributes of a resource that then needs to be allocated. It can only be set once when creating the ResourceClaim.
     * 
     */
    @Export(name="spec", refs={ResourceClaimSpecPatch.class}, tree="[0]")
    private Output</* @Nullable */ ResourceClaimSpecPatch> spec;

    /**
     * @return Spec describes the desired attributes of a resource that then needs to be allocated. It can only be set once when creating the ResourceClaim.
     * 
     */
    public Output<Optional<ResourceClaimSpecPatch>> spec() {
        return Codegen.optional(this.spec);
    }
    /**
     * Status describes whether the resource is available and with which attributes.
     * 
     */
    @Export(name="status", refs={ResourceClaimStatusPatch.class}, tree="[0]")
    private Output</* @Nullable */ ResourceClaimStatusPatch> status;

    /**
     * @return Status describes whether the resource is available and with which attributes.
     * 
     */
    public Output<Optional<ResourceClaimStatusPatch>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceClaimPatch(String name) {
        this(name, ResourceClaimPatchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceClaimPatch(String name, @Nullable ResourceClaimPatchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceClaimPatch(String name, @Nullable ResourceClaimPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:resource.k8s.io/v1alpha1:ResourceClaimPatch", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceClaimPatch(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:resource.k8s.io/v1alpha1:ResourceClaimPatch", name, null, makeResourceOptions(options, id));
    }

    private static ResourceClaimPatchArgs makeArgs(@Nullable ResourceClaimPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? ResourceClaimPatchArgs.builder() : ResourceClaimPatchArgs.builder(args);
        return builder
            .apiVersion("resource.k8s.io/v1alpha1")
            .kind("ResourceClaim")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:resource.k8s.io/v1alpha2:ResourceClaimPatch").build())
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
    public static ResourceClaimPatch get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceClaimPatch(name, id, options);
    }
}
