// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta2;

import com.google.gson.JsonElement;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.apps.v1beta2.ControllerRevisionArgs;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
 * 
 * @deprecated
 * apps/v1beta2/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters.
 * 
 */
@Deprecated /* apps/v1beta2/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta2:ControllerRevision")
public class ControllerRevision extends com.pulumi.resources.CustomResource {
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
     * Data is the serialized representation of the state.
     * 
     */
    @Export(name="data", refs={JsonElement.class}, tree="[0]")
    private Output<JsonElement> data;

    /**
     * @return Data is the serialized representation of the state.
     * 
     */
    public Output<JsonElement> data() {
        return this.data;
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
     * Revision indicates the revision of the state represented by Data.
     * 
     */
    @Export(name="revision", refs={Integer.class}, tree="[0]")
    private Output<Integer> revision;

    /**
     * @return Revision indicates the revision of the state represented by Data.
     * 
     */
    public Output<Integer> revision() {
        return this.revision;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ControllerRevision(String name) {
        this(name, ControllerRevisionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ControllerRevision(String name, ControllerRevisionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ControllerRevision(String name, ControllerRevisionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:ControllerRevision", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ControllerRevision(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:ControllerRevision", name, null, makeResourceOptions(options, id));
    }

    private static ControllerRevisionArgs makeArgs(ControllerRevisionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? ControllerRevisionArgs.builder() : ControllerRevisionArgs.builder(args);
        return builder
            .apiVersion("apps/v1beta2")
            .kind("ControllerRevision")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:apps/v1:ControllerRevision").build()),
                Output.of(Alias.builder().type("kubernetes:apps/v1beta1:ControllerRevision").build())
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
    public static ControllerRevision get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ControllerRevision(name, id, options);
    }
}
