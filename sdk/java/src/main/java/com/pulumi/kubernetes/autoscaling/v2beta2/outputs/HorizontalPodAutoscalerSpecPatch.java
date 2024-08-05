// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.CrossVersionObjectReferencePatch;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerBehaviorPatch;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricSpecPatch;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerSpecPatch {
    /**
     * @return behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively). If not set, the default HPAScalingRules for scale up and scale down are used.
     * 
     */
    private @Nullable HorizontalPodAutoscalerBehaviorPatch behavior;
    /**
     * @return maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
     * 
     */
    private @Nullable Integer maxReplicas;
    /**
     * @return metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
     * 
     */
    private @Nullable List<MetricSpecPatch> metrics;
    /**
     * @return minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    private @Nullable Integer minReplicas;
    /**
     * @return scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
     * 
     */
    private @Nullable CrossVersionObjectReferencePatch scaleTargetRef;

    private HorizontalPodAutoscalerSpecPatch() {}
    /**
     * @return behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively). If not set, the default HPAScalingRules for scale up and scale down are used.
     * 
     */
    public Optional<HorizontalPodAutoscalerBehaviorPatch> behavior() {
        return Optional.ofNullable(this.behavior);
    }
    /**
     * @return maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
     * 
     */
    public Optional<Integer> maxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }
    /**
     * @return metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
     * 
     */
    public List<MetricSpecPatch> metrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    /**
     * @return minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    public Optional<Integer> minReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    /**
     * @return scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
     * 
     */
    public Optional<CrossVersionObjectReferencePatch> scaleTargetRef() {
        return Optional.ofNullable(this.scaleTargetRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HorizontalPodAutoscalerBehaviorPatch behavior;
        private @Nullable Integer maxReplicas;
        private @Nullable List<MetricSpecPatch> metrics;
        private @Nullable Integer minReplicas;
        private @Nullable CrossVersionObjectReferencePatch scaleTargetRef;
        public Builder() {}
        public Builder(HorizontalPodAutoscalerSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
        }

        @CustomType.Setter
        public Builder behavior(@Nullable HorizontalPodAutoscalerBehaviorPatch behavior) {

            this.behavior = behavior;
            return this;
        }
        @CustomType.Setter
        public Builder maxReplicas(@Nullable Integer maxReplicas) {

            this.maxReplicas = maxReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder metrics(@Nullable List<MetricSpecPatch> metrics) {

            this.metrics = metrics;
            return this;
        }
        public Builder metrics(MetricSpecPatch... metrics) {
            return metrics(List.of(metrics));
        }
        @CustomType.Setter
        public Builder minReplicas(@Nullable Integer minReplicas) {

            this.minReplicas = minReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder scaleTargetRef(@Nullable CrossVersionObjectReferencePatch scaleTargetRef) {

            this.scaleTargetRef = scaleTargetRef;
            return this;
        }
        public HorizontalPodAutoscalerSpecPatch build() {
            final var _resultValue = new HorizontalPodAutoscalerSpecPatch();
            _resultValue.behavior = behavior;
            _resultValue.maxReplicas = maxReplicas;
            _resultValue.metrics = metrics;
            _resultValue.minReplicas = minReplicas;
            _resultValue.scaleTargetRef = scaleTargetRef;
            return _resultValue;
        }
    }
}
