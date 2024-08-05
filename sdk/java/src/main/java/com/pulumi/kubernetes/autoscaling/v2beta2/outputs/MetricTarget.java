// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricTarget {
    /**
     * @return averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
     * 
     */
    private @Nullable Integer averageUtilization;
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private @Nullable String averageValue;
    /**
     * @return type represents whether the metric type is Utilization, Value, or AverageValue
     * 
     */
    private String type;
    /**
     * @return value is the target value of the metric (as a quantity).
     * 
     */
    private @Nullable String value;

    private MetricTarget() {}
    /**
     * @return averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
     * 
     */
    public Optional<Integer> averageUtilization() {
        return Optional.ofNullable(this.averageUtilization);
    }
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<String> averageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * @return type represents whether the metric type is Utilization, Value, or AverageValue
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return value is the target value of the metric (as a quantity).
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer averageUtilization;
        private @Nullable String averageValue;
        private String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(MetricTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageUtilization = defaults.averageUtilization;
    	      this.averageValue = defaults.averageValue;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder averageUtilization(@Nullable Integer averageUtilization) {

            this.averageUtilization = averageUtilization;
            return this;
        }
        @CustomType.Setter
        public Builder averageValue(@Nullable String averageValue) {

            this.averageValue = averageValue;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("MetricTarget", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public MetricTarget build() {
            final var _resultValue = new MetricTarget();
            _resultValue.averageUtilization = averageUtilization;
            _resultValue.averageValue = averageValue;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
