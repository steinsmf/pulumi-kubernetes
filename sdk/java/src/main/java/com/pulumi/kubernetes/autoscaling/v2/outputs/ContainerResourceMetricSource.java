// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricTarget;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerResourceMetricSource {
    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    private String container;
    /**
     * @return name is the name of the resource in question.
     * 
     */
    private String name;
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    private MetricTarget target;

    private ContainerResourceMetricSource() {}
    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    public String container() {
        return this.container;
    }
    /**
     * @return name is the name of the resource in question.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public MetricTarget target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String container;
        private String name;
        private MetricTarget target;
        public Builder() {}
        public Builder(ContainerResourceMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder container(String container) {
            if (container == null) {
              throw new MissingRequiredPropertyException("ContainerResourceMetricSource", "container");
            }
            this.container = container;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ContainerResourceMetricSource", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder target(MetricTarget target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("ContainerResourceMetricSource", "target");
            }
            this.target = target;
            return this;
        }
        public ContainerResourceMetricSource build() {
            final var _resultValue = new ContainerResourceMetricSource();
            _resultValue.container = container;
            _resultValue.name = name;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
