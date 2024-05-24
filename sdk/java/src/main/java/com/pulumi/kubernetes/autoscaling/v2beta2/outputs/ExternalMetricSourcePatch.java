// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricIdentifierPatch;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricTargetPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalMetricSourcePatch {
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    private @Nullable MetricIdentifierPatch metric;
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    private @Nullable MetricTargetPatch target;

    private ExternalMetricSourcePatch() {}
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public Optional<MetricIdentifierPatch> metric() {
        return Optional.ofNullable(this.metric);
    }
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public Optional<MetricTargetPatch> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable MetricIdentifierPatch metric;
        private @Nullable MetricTargetPatch target;
        public Builder() {}
        public Builder(ExternalMetricSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder metric(@Nullable MetricIdentifierPatch metric) {

            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable MetricTargetPatch target) {

            this.target = target;
            return this;
        }
        public ExternalMetricSourcePatch build() {
            final var _resultValue = new ExternalMetricSourcePatch();
            _resultValue.metric = metric;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
