// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClaimSchedulingStatusPatch {
    /**
     * @return Name matches the pod.spec.resourceClaims[*].Name field.
     * 
     */
    private @Nullable String name;
    /**
     * @return UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for.
     * 
     * The size of this field is limited to 128, the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced.
     * 
     */
    private @Nullable List<String> unsuitableNodes;

    private ResourceClaimSchedulingStatusPatch() {}
    /**
     * @return Name matches the pod.spec.resourceClaims[*].Name field.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for.
     * 
     * The size of this field is limited to 128, the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced.
     * 
     */
    public List<String> unsuitableNodes() {
        return this.unsuitableNodes == null ? List.of() : this.unsuitableNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClaimSchedulingStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<String> unsuitableNodes;
        public Builder() {}
        public Builder(ResourceClaimSchedulingStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.unsuitableNodes = defaults.unsuitableNodes;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder unsuitableNodes(@Nullable List<String> unsuitableNodes) {

            this.unsuitableNodes = unsuitableNodes;
            return this;
        }
        public Builder unsuitableNodes(String... unsuitableNodes) {
            return unsuitableNodes(List.of(unsuitableNodes));
        }
        public ResourceClaimSchedulingStatusPatch build() {
            final var _resultValue = new ResourceClaimSchedulingStatusPatch();
            _resultValue.name = name;
            _resultValue.unsuitableNodes = unsuitableNodes;
            return _resultValue;
        }
    }
}
