// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricIdentifier {
    /**
     * @return name is the name of the given metric
     * 
     */
    private String name;
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    private @Nullable LabelSelector selector;

    private MetricIdentifier() {}
    /**
     * @return name is the name of the given metric
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricIdentifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable LabelSelector selector;
        public Builder() {}
        public Builder(MetricIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("MetricIdentifier", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelector selector) {

            this.selector = selector;
            return this;
        }
        public MetricIdentifier build() {
            final var _resultValue = new MetricIdentifier();
            _resultValue.name = name;
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
