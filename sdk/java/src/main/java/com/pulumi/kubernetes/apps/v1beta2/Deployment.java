// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta2;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.apps.v1beta2.DeploymentArgs;
import com.pulumi.kubernetes.apps.v1beta2.outputs.DeploymentSpec;
import com.pulumi.kubernetes.apps.v1beta2.outputs.DeploymentStatus;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Deployment enables declarative updates for Pods and ReplicaSets.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The Deployment has begun to be updated by the Deployment controller. If the current
 *    generation of the Deployment is &gt; 1, then this means that the current generation must
 *    be different from the generation reported by the last outputs.
 * 2. There exists a ReplicaSet whose revision is equal to the current revision of the
 *    Deployment.
 * 3. The Deployment&#39;s &#39;.status.conditions&#39; has a status of type &#39;Available&#39; whose &#39;status&#39;
 *    member is set to &#39;True&#39;.
 * 4. If the Deployment has generation &gt; 1, then &#39;.status.conditions&#39; has a status of type
 *    &#39;Progressing&#39;, whose &#39;status&#39; member is set to &#39;True&#39;, and whose &#39;reason&#39; is
 *    &#39;NewReplicaSetAvailable&#39;. For generation &lt;= 1, this status field does not exist,
 *    because it doesn&#39;t do a rollout (i.e., it simply creates the Deployment and
 *    corresponding ReplicaSet), and therefore there is no rollout to mark as &#39;Progressing&#39;.
 * 
 * If the Deployment has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the &#39;customTimeouts&#39; option on the resource.
 * 
 * @deprecated
 * apps/v1beta2/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters.
 * 
 */
@Deprecated /* apps/v1beta2/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta2:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
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
     * Standard object metadata.
     * 
     */
    @Export(name="metadata", refs={ObjectMeta.class}, tree="[0]")
    private Output<ObjectMeta> metadata;

    /**
     * @return Standard object metadata.
     * 
     */
    public Output<ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Specification of the desired behavior of the Deployment.
     * 
     */
    @Export(name="spec", refs={DeploymentSpec.class}, tree="[0]")
    private Output<DeploymentSpec> spec;

    /**
     * @return Specification of the desired behavior of the Deployment.
     * 
     */
    public Output<DeploymentSpec> spec() {
        return this.spec;
    }
    /**
     * Most recently observed status of the Deployment.
     * 
     */
    @Export(name="status", refs={DeploymentStatus.class}, tree="[0]")
    private Output</* @Nullable */ DeploymentStatus> status;

    /**
     * @return Most recently observed status of the Deployment.
     * 
     */
    public Output<Optional<DeploymentStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, @Nullable DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, @Nullable DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:Deployment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:Deployment", name, null, makeResourceOptions(options, id));
    }

    private static DeploymentArgs makeArgs(@Nullable DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? DeploymentArgs.builder() : DeploymentArgs.builder(args);
        return builder
            .apiVersion("apps/v1beta2")
            .kind("Deployment")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:apps/v1:Deployment").build()),
                Output.of(Alias.builder().type("kubernetes:apps/v1beta1:Deployment").build()),
                Output.of(Alias.builder().type("kubernetes:extensions/v1beta1:Deployment").build())
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
    public static Deployment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}
