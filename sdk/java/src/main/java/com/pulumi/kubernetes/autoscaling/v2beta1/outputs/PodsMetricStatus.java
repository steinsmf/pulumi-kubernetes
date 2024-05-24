// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodsMetricStatus {
    /**
     * @return currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private String currentAverageValue;
    /**
     * @return metricName is the name of the metric in question
     * 
     */
    private String metricName;
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    private @Nullable LabelSelector selector;

    private PodsMetricStatus() {}
    /**
     * @return currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public String currentAverageValue() {
        return this.currentAverageValue;
    }
    /**
     * @return metricName is the name of the metric in question
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String currentAverageValue;
        private String metricName;
        private @Nullable LabelSelector selector;
        public Builder() {}
        public Builder(PodsMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder currentAverageValue(String currentAverageValue) {
            if (currentAverageValue == null) {
              throw new MissingRequiredPropertyException("PodsMetricStatus", "currentAverageValue");
            }
            this.currentAverageValue = currentAverageValue;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            if (metricName == null) {
              throw new MissingRequiredPropertyException("PodsMetricStatus", "metricName");
            }
            this.metricName = metricName;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelector selector) {

            this.selector = selector;
            return this;
        }
        public PodsMetricStatus build() {
            final var _resultValue = new PodsMetricStatus();
            _resultValue.currentAverageValue = currentAverageValue;
            _resultValue.metricName = metricName;
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
