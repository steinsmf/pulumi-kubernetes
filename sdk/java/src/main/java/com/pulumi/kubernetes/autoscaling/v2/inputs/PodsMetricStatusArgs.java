// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.autoscaling.v2.inputs.MetricIdentifierArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.MetricValueStatusArgs;
import java.util.Objects;


/**
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 * 
 */
public final class PodsMetricStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodsMetricStatusArgs Empty = new PodsMetricStatusArgs();

    /**
     * current contains the current value for the given metric
     * 
     */
    @Import(name="current", required=true)
    private Output<MetricValueStatusArgs> current;

    /**
     * @return current contains the current value for the given metric
     * 
     */
    public Output<MetricValueStatusArgs> current() {
        return this.current;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric", required=true)
    private Output<MetricIdentifierArgs> metric;

    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public Output<MetricIdentifierArgs> metric() {
        return this.metric;
    }

    private PodsMetricStatusArgs() {}

    private PodsMetricStatusArgs(PodsMetricStatusArgs $) {
        this.current = $.current;
        this.metric = $.metric;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodsMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodsMetricStatusArgs $;

        public Builder() {
            $ = new PodsMetricStatusArgs();
        }

        public Builder(PodsMetricStatusArgs defaults) {
            $ = new PodsMetricStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param current current contains the current value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder current(Output<MetricValueStatusArgs> current) {
            $.current = current;
            return this;
        }

        /**
         * @param current current contains the current value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder current(MetricValueStatusArgs current) {
            return current(Output.of(current));
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(Output<MetricIdentifierArgs> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(MetricIdentifierArgs metric) {
            return metric(Output.of(metric));
        }

        public PodsMetricStatusArgs build() {
            if ($.current == null) {
                throw new MissingRequiredPropertyException("PodsMetricStatusArgs", "current");
            }
            if ($.metric == null) {
                throw new MissingRequiredPropertyException("PodsMetricStatusArgs", "metric");
            }
            return $;
        }
    }

}
