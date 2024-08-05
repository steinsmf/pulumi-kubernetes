// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricIdentifier;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricValueStatus;
import java.util.Objects;

@CustomType
public final class ExternalMetricStatus {
    /**
     * @return current contains the current value for the given metric
     * 
     */
    private MetricValueStatus current;
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    private MetricIdentifier metric;

    private ExternalMetricStatus() {}
    /**
     * @return current contains the current value for the given metric
     * 
     */
    public MetricValueStatus current() {
        return this.current;
    }
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public MetricIdentifier metric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MetricValueStatus current;
        private MetricIdentifier metric;
        public Builder() {}
        public Builder(ExternalMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.metric = defaults.metric;
        }

        @CustomType.Setter
        public Builder current(MetricValueStatus current) {
            if (current == null) {
              throw new MissingRequiredPropertyException("ExternalMetricStatus", "current");
            }
            this.current = current;
            return this;
        }
        @CustomType.Setter
        public Builder metric(MetricIdentifier metric) {
            if (metric == null) {
              throw new MissingRequiredPropertyException("ExternalMetricStatus", "metric");
            }
            this.metric = metric;
            return this;
        }
        public ExternalMetricStatus build() {
            final var _resultValue = new ExternalMetricStatus();
            _resultValue.current = current;
            _resultValue.metric = metric;
            return _resultValue;
        }
    }
}
