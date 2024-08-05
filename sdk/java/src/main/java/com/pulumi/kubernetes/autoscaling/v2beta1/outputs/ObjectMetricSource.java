// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.autoscaling.v2beta1.outputs.CrossVersionObjectReference;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectMetricSource {
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private @Nullable String averageValue;
    /**
     * @return metricName is the name of the metric in question.
     * 
     */
    private String metricName;
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    private @Nullable LabelSelector selector;
    /**
     * @return target is the described Kubernetes object.
     * 
     */
    private CrossVersionObjectReference target;
    /**
     * @return targetValue is the target value of the metric (as a quantity).
     * 
     */
    private String targetValue;

    private ObjectMetricSource() {}
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<String> averageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * @return metricName is the name of the metric in question.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return target is the described Kubernetes object.
     * 
     */
    public CrossVersionObjectReference target() {
        return this.target;
    }
    /**
     * @return targetValue is the target value of the metric (as a quantity).
     * 
     */
    public String targetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String averageValue;
        private String metricName;
        private @Nullable LabelSelector selector;
        private CrossVersionObjectReference target;
        private String targetValue;
        public Builder() {}
        public Builder(ObjectMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageValue = defaults.averageValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.target = defaults.target;
    	      this.targetValue = defaults.targetValue;
        }

        @CustomType.Setter
        public Builder averageValue(@Nullable String averageValue) {

            this.averageValue = averageValue;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            if (metricName == null) {
              throw new MissingRequiredPropertyException("ObjectMetricSource", "metricName");
            }
            this.metricName = metricName;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelector selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder target(CrossVersionObjectReference target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("ObjectMetricSource", "target");
            }
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder targetValue(String targetValue) {
            if (targetValue == null) {
              throw new MissingRequiredPropertyException("ObjectMetricSource", "targetValue");
            }
            this.targetValue = targetValue;
            return this;
        }
        public ObjectMetricSource build() {
            final var _resultValue = new ObjectMetricSource();
            _resultValue.averageValue = averageValue;
            _resultValue.metricName = metricName;
            _resultValue.selector = selector;
            _resultValue.target = target;
            _resultValue.targetValue = targetValue;
            return _resultValue;
        }
    }
}
