// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling.v2.inputs.MetricIdentifierPatchArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.MetricTargetPatchArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
 * 
 */
public final class ExternalMetricSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalMetricSourcePatchArgs Empty = new ExternalMetricSourcePatchArgs();

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric")
    private @Nullable Output<MetricIdentifierPatchArgs> metric;

    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public Optional<Output<MetricIdentifierPatchArgs>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @Import(name="target")
    private @Nullable Output<MetricTargetPatchArgs> target;

    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public Optional<Output<MetricTargetPatchArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    private ExternalMetricSourcePatchArgs() {}

    private ExternalMetricSourcePatchArgs(ExternalMetricSourcePatchArgs $) {
        this.metric = $.metric;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalMetricSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalMetricSourcePatchArgs $;

        public Builder() {
            $ = new ExternalMetricSourcePatchArgs();
        }

        public Builder(ExternalMetricSourcePatchArgs defaults) {
            $ = new ExternalMetricSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<MetricIdentifierPatchArgs> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(MetricIdentifierPatchArgs metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param target target specifies the target value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<MetricTargetPatchArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target target specifies the target value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder target(MetricTargetPatchArgs target) {
            return target(Output.of(target));
        }

        public ExternalMetricSourcePatchArgs build() {
            return $;
        }
    }

}
