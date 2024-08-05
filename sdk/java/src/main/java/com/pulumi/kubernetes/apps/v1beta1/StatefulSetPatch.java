// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.apps.v1beta1.StatefulSetPatchArgs;
import com.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetSpecPatch;
import com.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetStatusPatch;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMetaPatch;
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
 * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
 *  - Network: A single stable DNS and hostname.
 *  - Storage: As many VolumeClaims as requested.
 *    The StatefulSet guarantees that a given network identity will always map to the same storage identity.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The value of &#39;spec.replicas&#39; matches &#39;.status.replicas&#39;, &#39;.status.currentReplicas&#39;,
 *    and &#39;.status.readyReplicas&#39;.
 * 2. The value of &#39;.status.updateRevision&#39; matches &#39;.status.currentRevision&#39;.
 * 
 * If the StatefulSet has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the &#39;customTimeouts&#39; option on the resource.
 * 
 * @deprecated
 * apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters.
 * 
 */
@Deprecated /* apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta1:StatefulSetPatch")
public class StatefulSetPatch extends com.pulumi.resources.CustomResource {
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
    @Export(name="metadata", refs={ObjectMetaPatch.class}, tree="[0]")
    private Output</* @Nullable */ ObjectMetaPatch> metadata;

    public Output<Optional<ObjectMetaPatch>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Spec defines the desired identities of pods in this set.
     * 
     */
    @Export(name="spec", refs={StatefulSetSpecPatch.class}, tree="[0]")
    private Output</* @Nullable */ StatefulSetSpecPatch> spec;

    /**
     * @return Spec defines the desired identities of pods in this set.
     * 
     */
    public Output<Optional<StatefulSetSpecPatch>> spec() {
        return Codegen.optional(this.spec);
    }
    /**
     * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
     */
    @Export(name="status", refs={StatefulSetStatusPatch.class}, tree="[0]")
    private Output</* @Nullable */ StatefulSetStatusPatch> status;

    /**
     * @return Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
     */
    public Output<Optional<StatefulSetStatusPatch>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StatefulSetPatch(String name) {
        this(name, StatefulSetPatchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StatefulSetPatch(String name, @Nullable StatefulSetPatchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StatefulSetPatch(String name, @Nullable StatefulSetPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta1:StatefulSetPatch", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private StatefulSetPatch(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta1:StatefulSetPatch", name, null, makeResourceOptions(options, id));
    }

    private static StatefulSetPatchArgs makeArgs(@Nullable StatefulSetPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? StatefulSetPatchArgs.builder() : StatefulSetPatchArgs.builder(args);
        return builder
            .apiVersion("apps/v1beta1")
            .kind("StatefulSet")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:apps/v1:StatefulSetPatch").build()),
                Output.of(Alias.builder().type("kubernetes:apps/v1beta2:StatefulSetPatch").build())
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
    public static StatefulSetPatch get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StatefulSetPatch(name, id, options);
    }
}
