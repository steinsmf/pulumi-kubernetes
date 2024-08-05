// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.ResourceClaimSchedulingStatus;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PodSchedulingContextStatus {
    /**
     * @return ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses &#34;WaitForFirstConsumer&#34; allocation mode.
     * 
     */
    private @Nullable List<ResourceClaimSchedulingStatus> resourceClaims;

    private PodSchedulingContextStatus() {}
    /**
     * @return ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses &#34;WaitForFirstConsumer&#34; allocation mode.
     * 
     */
    public List<ResourceClaimSchedulingStatus> resourceClaims() {
        return this.resourceClaims == null ? List.of() : this.resourceClaims;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSchedulingContextStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ResourceClaimSchedulingStatus> resourceClaims;
        public Builder() {}
        public Builder(PodSchedulingContextStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceClaims = defaults.resourceClaims;
        }

        @CustomType.Setter
        public Builder resourceClaims(@Nullable List<ResourceClaimSchedulingStatus> resourceClaims) {

            this.resourceClaims = resourceClaims;
            return this;
        }
        public Builder resourceClaims(ResourceClaimSchedulingStatus... resourceClaims) {
            return resourceClaims(List.of(resourceClaims));
        }
        public PodSchedulingContextStatus build() {
            final var _resultValue = new PodSchedulingContextStatus();
            _resultValue.resourceClaims = resourceClaims;
            return _resultValue;
        }
    }
}
