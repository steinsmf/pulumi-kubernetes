// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.outputs.LimitRangeItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LimitRangeSpec {
    /**
     * @return Limits is the list of LimitRangeItem objects that are enforced.
     * 
     */
    private List<LimitRangeItem> limits;

    private LimitRangeSpec() {}
    /**
     * @return Limits is the list of LimitRangeItem objects that are enforced.
     * 
     */
    public List<LimitRangeItem> limits() {
        return this.limits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitRangeSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<LimitRangeItem> limits;
        public Builder() {}
        public Builder(LimitRangeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
        }

        @CustomType.Setter
        public Builder limits(List<LimitRangeItem> limits) {
            if (limits == null) {
              throw new MissingRequiredPropertyException("LimitRangeSpec", "limits");
            }
            this.limits = limits;
            return this;
        }
        public Builder limits(LimitRangeItem... limits) {
            return limits(List.of(limits));
        }
        public LimitRangeSpec build() {
            final var _resultValue = new LimitRangeSpec();
            _resultValue.limits = limits;
            return _resultValue;
        }
    }
}
