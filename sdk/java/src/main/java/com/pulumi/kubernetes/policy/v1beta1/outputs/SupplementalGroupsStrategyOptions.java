// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.policy.v1beta1.outputs.IDRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SupplementalGroupsStrategyOptions {
    /**
     * @return ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    private @Nullable List<IDRange> ranges;
    /**
     * @return rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * 
     */
    private @Nullable String rule;

    private SupplementalGroupsStrategyOptions() {}
    /**
     * @return ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    public List<IDRange> ranges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    /**
     * @return rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * 
     */
    public Optional<String> rule() {
        return Optional.ofNullable(this.rule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SupplementalGroupsStrategyOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<IDRange> ranges;
        private @Nullable String rule;
        public Builder() {}
        public Builder(SupplementalGroupsStrategyOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        @CustomType.Setter
        public Builder ranges(@Nullable List<IDRange> ranges) {

            this.ranges = ranges;
            return this;
        }
        public Builder ranges(IDRange... ranges) {
            return ranges(List.of(ranges));
        }
        @CustomType.Setter
        public Builder rule(@Nullable String rule) {

            this.rule = rule;
            return this;
        }
        public SupplementalGroupsStrategyOptions build() {
            final var _resultValue = new SupplementalGroupsStrategyOptions();
            _resultValue.ranges = ranges;
            _resultValue.rule = rule;
            return _resultValue;
        }
    }
}
