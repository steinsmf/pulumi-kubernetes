// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.autoscaling.v2beta2.inputs.HorizontalPodAutoscalerConditionArgs;
import com.pulumi.kubernetes.autoscaling.v2beta2.inputs.MetricStatusArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 * 
 */
public final class HorizontalPodAutoscalerStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerStatusArgs Empty = new HorizontalPodAutoscalerStatusArgs();

    /**
     * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<List<HorizontalPodAutoscalerConditionArgs>> conditions;

    /**
     * @return conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    public Output<List<HorizontalPodAutoscalerConditionArgs>> conditions() {
        return this.conditions;
    }

    /**
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    @Import(name="currentMetrics")
    private @Nullable Output<List<MetricStatusArgs>> currentMetrics;

    /**
     * @return currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    public Optional<Output<List<MetricStatusArgs>>> currentMetrics() {
        return Optional.ofNullable(this.currentMetrics);
    }

    /**
     * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    @Import(name="currentReplicas", required=true)
    private Output<Integer> currentReplicas;

    /**
     * @return currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    public Output<Integer> currentReplicas() {
        return this.currentReplicas;
    }

    /**
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    @Import(name="desiredReplicas", required=true)
    private Output<Integer> desiredReplicas;

    /**
     * @return desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    public Output<Integer> desiredReplicas() {
        return this.desiredReplicas;
    }

    /**
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    @Import(name="lastScaleTime")
    private @Nullable Output<String> lastScaleTime;

    /**
     * @return lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    public Optional<Output<String>> lastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }

    /**
     * observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    /**
     * @return observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    private HorizontalPodAutoscalerStatusArgs() {}

    private HorizontalPodAutoscalerStatusArgs(HorizontalPodAutoscalerStatusArgs $) {
        this.conditions = $.conditions;
        this.currentMetrics = $.currentMetrics;
        this.currentReplicas = $.currentReplicas;
        this.desiredReplicas = $.desiredReplicas;
        this.lastScaleTime = $.lastScaleTime;
        this.observedGeneration = $.observedGeneration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HorizontalPodAutoscalerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HorizontalPodAutoscalerStatusArgs $;

        public Builder() {
            $ = new HorizontalPodAutoscalerStatusArgs();
        }

        public Builder(HorizontalPodAutoscalerStatusArgs defaults) {
            $ = new HorizontalPodAutoscalerStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
         * 
         * @return builder
         * 
         */
        public Builder conditions(Output<List<HorizontalPodAutoscalerConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<HorizontalPodAutoscalerConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
         * 
         * @return builder
         * 
         */
        public Builder conditions(HorizontalPodAutoscalerConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param currentMetrics currentMetrics is the last read state of the metrics used by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder currentMetrics(@Nullable Output<List<MetricStatusArgs>> currentMetrics) {
            $.currentMetrics = currentMetrics;
            return this;
        }

        /**
         * @param currentMetrics currentMetrics is the last read state of the metrics used by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder currentMetrics(List<MetricStatusArgs> currentMetrics) {
            return currentMetrics(Output.of(currentMetrics));
        }

        /**
         * @param currentMetrics currentMetrics is the last read state of the metrics used by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder currentMetrics(MetricStatusArgs... currentMetrics) {
            return currentMetrics(List.of(currentMetrics));
        }

        /**
         * @param currentReplicas currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder currentReplicas(Output<Integer> currentReplicas) {
            $.currentReplicas = currentReplicas;
            return this;
        }

        /**
         * @param currentReplicas currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder currentReplicas(Integer currentReplicas) {
            return currentReplicas(Output.of(currentReplicas));
        }

        /**
         * @param desiredReplicas desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder desiredReplicas(Output<Integer> desiredReplicas) {
            $.desiredReplicas = desiredReplicas;
            return this;
        }

        /**
         * @param desiredReplicas desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder desiredReplicas(Integer desiredReplicas) {
            return desiredReplicas(Output.of(desiredReplicas));
        }

        /**
         * @param lastScaleTime lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
         * 
         * @return builder
         * 
         */
        public Builder lastScaleTime(@Nullable Output<String> lastScaleTime) {
            $.lastScaleTime = lastScaleTime;
            return this;
        }

        /**
         * @param lastScaleTime lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
         * 
         * @return builder
         * 
         */
        public Builder lastScaleTime(String lastScaleTime) {
            return lastScaleTime(Output.of(lastScaleTime));
        }

        /**
         * @param observedGeneration observedGeneration is the most recent generation observed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * @param observedGeneration observedGeneration is the most recent generation observed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public HorizontalPodAutoscalerStatusArgs build() {
            if ($.conditions == null) {
                throw new MissingRequiredPropertyException("HorizontalPodAutoscalerStatusArgs", "conditions");
            }
            if ($.currentReplicas == null) {
                throw new MissingRequiredPropertyException("HorizontalPodAutoscalerStatusArgs", "currentReplicas");
            }
            if ($.desiredReplicas == null) {
                throw new MissingRequiredPropertyException("HorizontalPodAutoscalerStatusArgs", "desiredReplicas");
            }
            return $;
        }
    }

}
