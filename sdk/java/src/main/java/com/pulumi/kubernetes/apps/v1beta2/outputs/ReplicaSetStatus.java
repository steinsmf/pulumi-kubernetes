// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.apps.v1beta2.outputs.ReplicaSetCondition;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicaSetStatus {
    /**
     * @return The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    private @Nullable Integer availableReplicas;
    /**
     * @return Represents the latest available observations of a replica set&#39;s current state.
     * 
     */
    private @Nullable List<ReplicaSetCondition> conditions;
    /**
     * @return The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    private @Nullable Integer fullyLabeledReplicas;
    /**
     * @return ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    private @Nullable Integer observedGeneration;
    /**
     * @return The number of ready replicas for this replica set.
     * 
     */
    private @Nullable Integer readyReplicas;
    /**
     * @return Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    private Integer replicas;

    private ReplicaSetStatus() {}
    /**
     * @return The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    public Optional<Integer> availableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }
    /**
     * @return Represents the latest available observations of a replica set&#39;s current state.
     * 
     */
    public List<ReplicaSetCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    public Optional<Integer> fullyLabeledReplicas() {
        return Optional.ofNullable(this.fullyLabeledReplicas);
    }
    /**
     * @return ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * @return The number of ready replicas for this replica set.
     * 
     */
    public Optional<Integer> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    /**
     * @return Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    public Integer replicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer availableReplicas;
        private @Nullable List<ReplicaSetCondition> conditions;
        private @Nullable Integer fullyLabeledReplicas;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private Integer replicas;
        public Builder() {}
        public Builder(ReplicaSetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.conditions = defaults.conditions;
    	      this.fullyLabeledReplicas = defaults.fullyLabeledReplicas;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
        }

        @CustomType.Setter
        public Builder availableReplicas(@Nullable Integer availableReplicas) {

            this.availableReplicas = availableReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<ReplicaSetCondition> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(ReplicaSetCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder fullyLabeledReplicas(@Nullable Integer fullyLabeledReplicas) {

            this.fullyLabeledReplicas = fullyLabeledReplicas;
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
        public Builder replicas(Integer replicas) {
            if (replicas == null) {
              throw new MissingRequiredPropertyException("ReplicaSetStatus", "replicas");
            }
            this.replicas = replicas;
            return this;
        }
        public ReplicaSetStatus build() {
            final var _resultValue = new ReplicaSetStatus();
            _resultValue.availableReplicas = availableReplicas;
            _resultValue.conditions = conditions;
            _resultValue.fullyLabeledReplicas = fullyLabeledReplicas;
            _resultValue.observedGeneration = observedGeneration;
            _resultValue.readyReplicas = readyReplicas;
            _resultValue.replicas = replicas;
            return _resultValue;
        }
    }
}
