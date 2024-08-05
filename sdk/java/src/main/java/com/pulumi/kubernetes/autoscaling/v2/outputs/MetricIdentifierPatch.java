// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelectorPatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricIdentifierPatch {
    /**
     * @return name is the name of the given metric
     * 
     */
    private @Nullable String name;
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    private @Nullable LabelSelectorPatch selector;

    private MetricIdentifierPatch() {}
    /**
     * @return name is the name of the given metric
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelectorPatch> selector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricIdentifierPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable LabelSelectorPatch selector;
        public Builder() {}
        public Builder(MetricIdentifierPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelectorPatch selector) {

            this.selector = selector;
            return this;
        }
        public MetricIdentifierPatch build() {
            final var _resultValue = new MetricIdentifierPatch();
            _resultValue.name = name;
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
