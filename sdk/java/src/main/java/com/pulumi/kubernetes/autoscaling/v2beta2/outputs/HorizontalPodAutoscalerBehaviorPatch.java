// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.HPAScalingRulesPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerBehaviorPatch {
    /**
     * @return scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     * 
     */
    private @Nullable HPAScalingRulesPatch scaleDown;
    /**
     * @return scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
     */
    private @Nullable HPAScalingRulesPatch scaleUp;

    private HorizontalPodAutoscalerBehaviorPatch() {}
    /**
     * @return scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     * 
     */
    public Optional<HPAScalingRulesPatch> scaleDown() {
        return Optional.ofNullable(this.scaleDown);
    }
    /**
     * @return scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
     */
    public Optional<HPAScalingRulesPatch> scaleUp() {
        return Optional.ofNullable(this.scaleUp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerBehaviorPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HPAScalingRulesPatch scaleDown;
        private @Nullable HPAScalingRulesPatch scaleUp;
        public Builder() {}
        public Builder(HorizontalPodAutoscalerBehaviorPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scaleDown = defaults.scaleDown;
    	      this.scaleUp = defaults.scaleUp;
        }

        @CustomType.Setter
        public Builder scaleDown(@Nullable HPAScalingRulesPatch scaleDown) {

            this.scaleDown = scaleDown;
            return this;
        }
        @CustomType.Setter
        public Builder scaleUp(@Nullable HPAScalingRulesPatch scaleUp) {

            this.scaleUp = scaleUp;
            return this;
        }
        public HorizontalPodAutoscalerBehaviorPatch build() {
            final var _resultValue = new HorizontalPodAutoscalerBehaviorPatch();
            _resultValue.scaleDown = scaleDown;
            _resultValue.scaleUp = scaleUp;
            return _resultValue;
        }
    }
}
