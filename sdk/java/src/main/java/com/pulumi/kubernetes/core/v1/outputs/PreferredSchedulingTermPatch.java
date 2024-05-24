// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeSelectorTermPatch;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreferredSchedulingTermPatch {
    /**
     * @return A node selector term, associated with the corresponding weight.
     * 
     */
    private @Nullable NodeSelectorTermPatch preference;
    /**
     * @return Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * 
     */
    private @Nullable Integer weight;

    private PreferredSchedulingTermPatch() {}
    /**
     * @return A node selector term, associated with the corresponding weight.
     * 
     */
    public Optional<NodeSelectorTermPatch> preference() {
        return Optional.ofNullable(this.preference);
    }
    /**
     * @return Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferredSchedulingTermPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NodeSelectorTermPatch preference;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(PreferredSchedulingTermPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preference = defaults.preference;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder preference(@Nullable NodeSelectorTermPatch preference) {

            this.preference = preference;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {

            this.weight = weight;
            return this;
        }
        public PreferredSchedulingTermPatch build() {
            final var _resultValue = new PreferredSchedulingTermPatch();
            _resultValue.preference = preference;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
