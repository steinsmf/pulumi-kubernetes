// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RollingUpdateStatefulSetStrategyPatch {
    /**
     * @return Partition indicates the ordinal at which the StatefulSet should be partitioned.
     * 
     */
    private @Nullable Integer partition;

    private RollingUpdateStatefulSetStrategyPatch() {}
    /**
     * @return Partition indicates the ordinal at which the StatefulSet should be partitioned.
     * 
     */
    public Optional<Integer> partition() {
        return Optional.ofNullable(this.partition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateStatefulSetStrategyPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer partition;
        public Builder() {}
        public Builder(RollingUpdateStatefulSetStrategyPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partition = defaults.partition;
        }

        @CustomType.Setter
        public Builder partition(@Nullable Integer partition) {

            this.partition = partition;
            return this;
        }
        public RollingUpdateStatefulSetStrategyPatch build() {
            final var _resultValue = new RollingUpdateStatefulSetStrategyPatch();
            _resultValue.partition = partition;
            return _resultValue;
        }
    }
}
