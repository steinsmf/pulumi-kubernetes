// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerStatus {
    /**
     * @return currentCPUUtilizationPercentage is the current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
     * 
     */
    private @Nullable Integer currentCPUUtilizationPercentage;
    /**
     * @return currentReplicas is the current number of replicas of pods managed by this autoscaler.
     * 
     */
    private Integer currentReplicas;
    /**
     * @return desiredReplicas is the  desired number of replicas of pods managed by this autoscaler.
     * 
     */
    private Integer desiredReplicas;
    /**
     * @return lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    private @Nullable String lastScaleTime;
    /**
     * @return observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    private @Nullable Integer observedGeneration;

    private HorizontalPodAutoscalerStatus() {}
    /**
     * @return currentCPUUtilizationPercentage is the current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
     * 
     */
    public Optional<Integer> currentCPUUtilizationPercentage() {
        return Optional.ofNullable(this.currentCPUUtilizationPercentage);
    }
    /**
     * @return currentReplicas is the current number of replicas of pods managed by this autoscaler.
     * 
     */
    public Integer currentReplicas() {
        return this.currentReplicas;
    }
    /**
     * @return desiredReplicas is the  desired number of replicas of pods managed by this autoscaler.
     * 
     */
    public Integer desiredReplicas() {
        return this.desiredReplicas;
    }
    /**
     * @return lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    public Optional<String> lastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }
    /**
     * @return observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer currentCPUUtilizationPercentage;
        private Integer currentReplicas;
        private Integer desiredReplicas;
        private @Nullable String lastScaleTime;
        private @Nullable Integer observedGeneration;
        public Builder() {}
        public Builder(HorizontalPodAutoscalerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentCPUUtilizationPercentage = defaults.currentCPUUtilizationPercentage;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        @CustomType.Setter
        public Builder currentCPUUtilizationPercentage(@Nullable Integer currentCPUUtilizationPercentage) {

            this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder currentReplicas(Integer currentReplicas) {
            if (currentReplicas == null) {
              throw new MissingRequiredPropertyException("HorizontalPodAutoscalerStatus", "currentReplicas");
            }
            this.currentReplicas = currentReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder desiredReplicas(Integer desiredReplicas) {
            if (desiredReplicas == null) {
              throw new MissingRequiredPropertyException("HorizontalPodAutoscalerStatus", "desiredReplicas");
            }
            this.desiredReplicas = desiredReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder lastScaleTime(@Nullable String lastScaleTime) {

            this.lastScaleTime = lastScaleTime;
            return this;
        }
        @CustomType.Setter
        public Builder observedGeneration(@Nullable Integer observedGeneration) {

            this.observedGeneration = observedGeneration;
            return this;
        }
        public HorizontalPodAutoscalerStatus build() {
            final var _resultValue = new HorizontalPodAutoscalerStatus();
            _resultValue.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
            _resultValue.currentReplicas = currentReplicas;
            _resultValue.desiredReplicas = desiredReplicas;
            _resultValue.lastScaleTime = lastScaleTime;
            _resultValue.observedGeneration = observedGeneration;
            return _resultValue;
        }
    }
}
