// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetConditionPatch;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulSetStatusPatch {
    /**
     * @return collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    private @Nullable Integer collisionCount;
    /**
     * @return Represents the latest available observations of a statefulset&#39;s current state.
     * 
     */
    private @Nullable List<StatefulSetConditionPatch> conditions;
    /**
     * @return currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    private @Nullable Integer currentReplicas;
    /**
     * @return currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    private @Nullable String currentRevision;
    /**
     * @return observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
     * 
     */
    private @Nullable Integer observedGeneration;
    /**
     * @return readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
     * 
     */
    private @Nullable Integer readyReplicas;
    /**
     * @return replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    private @Nullable Integer replicas;
    /**
     * @return updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    private @Nullable String updateRevision;
    /**
     * @return updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    private @Nullable Integer updatedReplicas;

    private StatefulSetStatusPatch() {}
    /**
     * @return collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    public Optional<Integer> collisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }
    /**
     * @return Represents the latest available observations of a statefulset&#39;s current state.
     * 
     */
    public List<StatefulSetConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    public Optional<Integer> currentReplicas() {
        return Optional.ofNullable(this.currentReplicas);
    }
    /**
     * @return currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    public Optional<String> currentRevision() {
        return Optional.ofNullable(this.currentRevision);
    }
    /**
     * @return observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * @return readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
     * 
     */
    public Optional<Integer> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    /**
     * @return replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * @return updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    public Optional<String> updateRevision() {
        return Optional.ofNullable(this.updateRevision);
    }
    /**
     * @return updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    public Optional<Integer> updatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer collisionCount;
        private @Nullable List<StatefulSetConditionPatch> conditions;
        private @Nullable Integer currentReplicas;
        private @Nullable String currentRevision;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private @Nullable Integer replicas;
        private @Nullable String updateRevision;
        private @Nullable Integer updatedReplicas;
        public Builder() {}
        public Builder(StatefulSetStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.currentRevision = defaults.currentRevision;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.updateRevision = defaults.updateRevision;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        @CustomType.Setter
        public Builder collisionCount(@Nullable Integer collisionCount) {

            this.collisionCount = collisionCount;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<StatefulSetConditionPatch> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(StatefulSetConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder currentReplicas(@Nullable Integer currentReplicas) {

            this.currentReplicas = currentReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder currentRevision(@Nullable String currentRevision) {

            this.currentRevision = currentRevision;
            return this;
        }
        @CustomType.Setter
        public Builder observedGeneration(@Nullable Integer observedGeneration) {

            this.observedGeneration = observedGeneration;
            return this;
        }
        @CustomType.Setter
        public Builder readyReplicas(@Nullable Integer readyReplicas) {

            this.readyReplicas = readyReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder replicas(@Nullable Integer replicas) {

            this.replicas = replicas;
            return this;
        }
        @CustomType.Setter
        public Builder updateRevision(@Nullable String updateRevision) {

            this.updateRevision = updateRevision;
            return this;
        }
        @CustomType.Setter
        public Builder updatedReplicas(@Nullable Integer updatedReplicas) {

            this.updatedReplicas = updatedReplicas;
            return this;
        }
        public StatefulSetStatusPatch build() {
            final var _resultValue = new StatefulSetStatusPatch();
            _resultValue.collisionCount = collisionCount;
            _resultValue.conditions = conditions;
            _resultValue.currentReplicas = currentReplicas;
            _resultValue.currentRevision = currentRevision;
            _resultValue.observedGeneration = observedGeneration;
            _resultValue.readyReplicas = readyReplicas;
            _resultValue.replicas = replicas;
            _resultValue.updateRevision = updateRevision;
            _resultValue.updatedReplicas = updatedReplicas;
            return _resultValue;
        }
    }
}
