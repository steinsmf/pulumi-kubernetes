// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1alpha1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.storage.v1alpha1.VolumeAttachmentArgs;
import com.pulumi.kubernetes.storage.v1alpha1.outputs.VolumeAttachmentSpec;
import com.pulumi.kubernetes.storage.v1alpha1.outputs.VolumeAttachmentStatus;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
 * 
 * VolumeAttachment objects are non-namespaced.
 * 
 */
@ResourceType(type="kubernetes:storage.k8s.io/v1alpha1:VolumeAttachment")
public class VolumeAttachment extends com.pulumi.resources.CustomResource {
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
     * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", refs={ObjectMeta.class}, tree="[0]")
    private Output<ObjectMeta> metadata;

    /**
     * @return Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output<ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
     * 
     */
    @Export(name="spec", refs={VolumeAttachmentSpec.class}, tree="[0]")
    private Output<VolumeAttachmentSpec> spec;

    /**
     * @return Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
     * 
     */
    public Output<VolumeAttachmentSpec> spec() {
        return this.spec;
    }
    /**
     * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
     * 
     */
    @Export(name="status", refs={VolumeAttachmentStatus.class}, tree="[0]")
    private Output</* @Nullable */ VolumeAttachmentStatus> status;

    /**
     * @return Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
     * 
     */
    public Output<Optional<VolumeAttachmentStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeAttachment(String name) {
        this(name, VolumeAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1alpha1:VolumeAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeAttachment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1alpha1:VolumeAttachment", name, null, makeResourceOptions(options, id));
    }

    private static VolumeAttachmentArgs makeArgs(VolumeAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? VolumeAttachmentArgs.builder() : VolumeAttachmentArgs.builder(args);
        return builder
            .apiVersion("storage.k8s.io/v1alpha1")
            .kind("VolumeAttachment")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:storage.k8s.io/v1:VolumeAttachment").build()),
                Output.of(Alias.builder().type("kubernetes:storage.k8s.io/v1beta1:VolumeAttachment").build())
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
    public static VolumeAttachment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeAttachment(name, id, options);
    }
}
