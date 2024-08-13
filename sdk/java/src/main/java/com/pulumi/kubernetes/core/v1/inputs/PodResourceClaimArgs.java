// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.ClaimSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PodResourceClaim references exactly one ResourceClaim, either directly or by naming a ResourceClaimTemplate which is then turned into a ResourceClaim for the pod.
 * 
 * It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 * 
 */
public final class PodResourceClaimArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodResourceClaimArgs Empty = new PodResourceClaimArgs();

    /**
     * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * 
     * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
     * 
     */
    @Import(name="resourceClaimName")
    private @Nullable Output<String> resourceClaimName;

    /**
     * @return ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * 
     * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
     * 
     */
    public Optional<Output<String>> resourceClaimName() {
        return Optional.ofNullable(this.resourceClaimName);
    }

    /**
     * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * 
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
     * 
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * 
     * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
     * 
     */
    @Import(name="resourceClaimTemplateName")
    private @Nullable Output<String> resourceClaimTemplateName;

    /**
     * @return ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * 
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
     * 
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * 
     * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
     * 
     */
    public Optional<Output<String>> resourceClaimTemplateName() {
        return Optional.ofNullable(this.resourceClaimTemplateName);
    }

    /**
     * Source describes where to find the ResourceClaim.
     * 
     */
    @Import(name="source")
    private @Nullable Output<ClaimSourceArgs> source;

    /**
     * @return Source describes where to find the ResourceClaim.
     * 
     */
    public Optional<Output<ClaimSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private PodResourceClaimArgs() {}

    private PodResourceClaimArgs(PodResourceClaimArgs $) {
        this.name = $.name;
        this.resourceClaimName = $.resourceClaimName;
        this.resourceClaimTemplateName = $.resourceClaimTemplateName;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodResourceClaimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodResourceClaimArgs $;

        public Builder() {
            $ = new PodResourceClaimArgs();
        }

        public Builder(PodResourceClaimArgs defaults) {
            $ = new PodResourceClaimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceClaimName ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
         * 
         * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
         * 
         * @return builder
         * 
         */
        public Builder resourceClaimName(@Nullable Output<String> resourceClaimName) {
            $.resourceClaimName = resourceClaimName;
            return this;
        }

        /**
         * @param resourceClaimName ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
         * 
         * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
         * 
         * @return builder
         * 
         */
        public Builder resourceClaimName(String resourceClaimName) {
            return resourceClaimName(Output.of(resourceClaimName));
        }

        /**
         * @param resourceClaimTemplateName ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
         * 
         * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
         * 
         * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
         * 
         * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
         * 
         * @return builder
         * 
         */
        public Builder resourceClaimTemplateName(@Nullable Output<String> resourceClaimTemplateName) {
            $.resourceClaimTemplateName = resourceClaimTemplateName;
            return this;
        }

        /**
         * @param resourceClaimTemplateName ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
         * 
         * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.
         * 
         * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
         * 
         * Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
         * 
         * @return builder
         * 
         */
        public Builder resourceClaimTemplateName(String resourceClaimTemplateName) {
            return resourceClaimTemplateName(Output.of(resourceClaimTemplateName));
        }

        /**
         * @param source Source describes where to find the ResourceClaim.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<ClaimSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Source describes where to find the ResourceClaim.
         * 
         * @return builder
         * 
         */
        public Builder source(ClaimSourceArgs source) {
            return source(Output.of(source));
        }

        public PodResourceClaimArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("PodResourceClaimArgs", "name");
            }
            return $;
        }
    }

}
