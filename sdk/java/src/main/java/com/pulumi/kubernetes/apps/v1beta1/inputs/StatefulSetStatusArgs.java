// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 * 
 */
public final class StatefulSetStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetStatusArgs Empty = new StatefulSetStatusArgs();

    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    @Import(name="collisionCount")
    private @Nullable Output<Integer> collisionCount;

    /**
     * @return collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    public Optional<Output<Integer>> collisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }

    /**
     * Represents the latest available observations of a statefulset&#39;s current state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<StatefulSetConditionArgs>> conditions;

    /**
     * @return Represents the latest available observations of a statefulset&#39;s current state.
     * 
     */
    public Optional<Output<List<StatefulSetConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    @Import(name="currentReplicas")
    private @Nullable Output<Integer> currentReplicas;

    /**
     * @return currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    public Optional<Output<Integer>> currentReplicas() {
        return Optional.ofNullable(this.currentReplicas);
    }

    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    @Import(name="currentRevision")
    private @Nullable Output<String> currentRevision;

    /**
     * @return currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    public Optional<Output<String>> currentRevision() {
        return Optional.ofNullable(this.currentRevision);
    }

    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    /**
     * @return observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
     * 
     */
    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    /**
     * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
     * 
     */
    @Import(name="readyReplicas")
    private @Nullable Output<Integer> readyReplicas;

    /**
     * @return readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
     * 
     */
    public Optional<Output<Integer>> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }

    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    @Import(name="replicas", required=true)
    private Output<Integer> replicas;

    /**
     * @return replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    public Output<Integer> replicas() {
        return this.replicas;
    }

    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    @Import(name="updateRevision")
    private @Nullable Output<String> updateRevision;

    /**
     * @return updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    public Optional<Output<String>> updateRevision() {
        return Optional.ofNullable(this.updateRevision);
    }

    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    @Import(name="updatedReplicas")
    private @Nullable Output<Integer> updatedReplicas;

    /**
     * @return updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    public Optional<Output<Integer>> updatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    private StatefulSetStatusArgs() {}

    private StatefulSetStatusArgs(StatefulSetStatusArgs $) {
        this.collisionCount = $.collisionCount;
        this.conditions = $.conditions;
        this.currentReplicas = $.currentReplicas;
        this.currentRevision = $.currentRevision;
        this.observedGeneration = $.observedGeneration;
        this.readyReplicas = $.readyReplicas;
        this.replicas = $.replicas;
        this.updateRevision = $.updateRevision;
        this.updatedReplicas = $.updatedReplicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetStatusArgs $;

        public Builder() {
            $ = new StatefulSetStatusArgs();
        }

        public Builder(StatefulSetStatusArgs defaults) {
            $ = new StatefulSetStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collisionCount collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
         * 
         * @return builder
         * 
         */
        public Builder collisionCount(@Nullable Output<Integer> collisionCount) {
            $.collisionCount = collisionCount;
            return this;
        }

        /**
         * @param collisionCount collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
         * 
         * @return builder
         * 
         */
        public Builder collisionCount(Integer collisionCount) {
            return collisionCount(Output.of(collisionCount));
        }

        /**
         * @param conditions Represents the latest available observations of a statefulset&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<StatefulSetConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Represents the latest available observations of a statefulset&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<StatefulSetConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Represents the latest available observations of a statefulset&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(StatefulSetConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param currentReplicas currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
         * 
         * @return builder
         * 
         */
        public Builder currentReplicas(@Nullable Output<Integer> currentReplicas) {
            $.currentReplicas = currentReplicas;
            return this;
        }

        /**
         * @param currentReplicas currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
         * 
         * @return builder
         * 
         */
        public Builder currentReplicas(Integer currentReplicas) {
            return currentReplicas(Output.of(currentReplicas));
        }

        /**
         * @param currentRevision currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
         * 
         * @return builder
         * 
         */
        public Builder currentRevision(@Nullable Output<String> currentRevision) {
            $.currentRevision = currentRevision;
            return this;
        }

        /**
         * @param currentRevision currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
         * 
         * @return builder
         * 
         */
        public Builder currentRevision(String currentRevision) {
            return currentRevision(Output.of(currentRevision));
        }

        /**
         * @param observedGeneration observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * @param observedGeneration observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        /**
         * @param readyReplicas readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
         * 
         * @return builder
         * 
         */
        public Builder readyReplicas(@Nullable Output<Integer> readyReplicas) {
            $.readyReplicas = readyReplicas;
            return this;
        }

        /**
         * @param readyReplicas readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
         * 
         * @return builder
         * 
         */
        public Builder readyReplicas(Integer readyReplicas) {
            return readyReplicas(Output.of(readyReplicas));
        }

        /**
         * @param replicas replicas is the number of Pods created by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas replicas is the number of Pods created by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param updateRevision updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
         * 
         * @return builder
         * 
         */
        public Builder updateRevision(@Nullable Output<String> updateRevision) {
            $.updateRevision = updateRevision;
            return this;
        }

        /**
         * @param updateRevision updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
         * 
         * @return builder
         * 
         */
        public Builder updateRevision(String updateRevision) {
            return updateRevision(Output.of(updateRevision));
        }

        /**
         * @param updatedReplicas updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
         * 
         * @return builder
         * 
         */
        public Builder updatedReplicas(@Nullable Output<Integer> updatedReplicas) {
            $.updatedReplicas = updatedReplicas;
            return this;
        }

        /**
         * @param updatedReplicas updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
         * 
         * @return builder
         * 
         */
        public Builder updatedReplicas(Integer updatedReplicas) {
            return updatedReplicas(Output.of(updatedReplicas));
        }

        public StatefulSetStatusArgs build() {
            if ($.replicas == null) {
                throw new MissingRequiredPropertyException("StatefulSetStatusArgs", "replicas");
            }
            return $;
        }
    }

}
