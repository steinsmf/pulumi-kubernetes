// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.extensions.v1beta1.outputs.IDRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RunAsUserStrategyOptions {
    /**
     * @return ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    private @Nullable List<IDRange> ranges;
    /**
     * @return rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * 
     */
    private String rule;

    private RunAsUserStrategyOptions() {}
    /**
     * @return ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    public List<IDRange> ranges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    /**
     * @return rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * 
     */
    public String rule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsUserStrategyOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<IDRange> ranges;
        private String rule;
        public Builder() {}
        public Builder(RunAsUserStrategyOptions defaults) {
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
        public Builder rule(String rule) {
            if (rule == null) {
              throw new MissingRequiredPropertyException("RunAsUserStrategyOptions", "rule");
            }
            this.rule = rule;
            return this;
        }
        public RunAsUserStrategyOptions build() {
            final var _resultValue = new RunAsUserStrategyOptions();
            _resultValue.ranges = ranges;
            _resultValue.rule = rule;
            return _resultValue;
        }
    }
}
