// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricValueStatusPatch {
    /**
     * @return currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    private @Nullable Integer averageUtilization;
    /**
     * @return averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private @Nullable String averageValue;
    /**
     * @return value is the current value of the metric (as a quantity).
     * 
     */
    private @Nullable String value;

    private MetricValueStatusPatch() {}
    /**
     * @return currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    public Optional<Integer> averageUtilization() {
        return Optional.ofNullable(this.averageUtilization);
    }
    /**
     * @return averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<String> averageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * @return value is the current value of the metric (as a quantity).
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricValueStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer averageUtilization;
        private @Nullable String averageValue;
        private @Nullable String value;
        public Builder() {}
        public Builder(MetricValueStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageUtilization = defaults.averageUtilization;
    	      this.averageValue = defaults.averageValue;
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
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public MetricValueStatusPatch build() {
            final var _resultValue = new MetricValueStatusPatch();
            _resultValue.averageUtilization = averageUtilization;
            _resultValue.averageValue = averageValue;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
