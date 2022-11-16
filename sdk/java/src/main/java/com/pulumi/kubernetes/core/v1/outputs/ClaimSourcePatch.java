// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClaimSourcePatch {
    /**
     * @return ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * 
     */
    private @Nullable String resourceClaimName;
    /**
     * @return ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * 
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be &lt;pod name&gt;-&lt;resource name&gt;, where &lt;resource name&gt; is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
     * 
     * An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
     * 
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * 
     */
    private @Nullable String resourceClaimTemplateName;

    private ClaimSourcePatch() {}
    /**
     * @return ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * 
     */
    public Optional<String> resourceClaimName() {
        return Optional.ofNullable(this.resourceClaimName);
    }
    /**
     * @return ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * 
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be &lt;pod name&gt;-&lt;resource name&gt;, where &lt;resource name&gt; is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
     * 
     * An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
     * 
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * 
     */
    public Optional<String> resourceClaimTemplateName() {
        return Optional.ofNullable(this.resourceClaimTemplateName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClaimSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String resourceClaimName;
        private @Nullable String resourceClaimTemplateName;
        public Builder() {}
        public Builder(ClaimSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceClaimName = defaults.resourceClaimName;
    	      this.resourceClaimTemplateName = defaults.resourceClaimTemplateName;
        }

        @CustomType.Setter
        public Builder resourceClaimName(@Nullable String resourceClaimName) {
            this.resourceClaimName = resourceClaimName;
            return this;
        }
        @CustomType.Setter
        public Builder resourceClaimTemplateName(@Nullable String resourceClaimTemplateName) {
            this.resourceClaimTemplateName = resourceClaimTemplateName;
            return this;
        }
        public ClaimSourcePatch build() {
            final var o = new ClaimSourcePatch();
            o.resourceClaimName = resourceClaimName;
            o.resourceClaimTemplateName = resourceClaimTemplateName;
            return o;
        }
    }
}
