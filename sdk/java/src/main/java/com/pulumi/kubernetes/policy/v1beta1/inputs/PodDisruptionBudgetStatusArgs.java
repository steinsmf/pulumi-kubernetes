// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 * 
 */
public final class PodDisruptionBudgetStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodDisruptionBudgetStatusArgs Empty = new PodDisruptionBudgetStatusArgs();

    /**
     * current number of healthy pods
     * 
     */
    @Import(name="currentHealthy", required=true)
    private Output<Integer> currentHealthy;

    /**
     * @return current number of healthy pods
     * 
     */
    public Output<Integer> currentHealthy() {
        return this.currentHealthy;
    }

    /**
     * minimum desired number of healthy pods
     * 
     */
    @Import(name="desiredHealthy", required=true)
    private Output<Integer> desiredHealthy;

    /**
     * @return minimum desired number of healthy pods
     * 
     */
    public Output<Integer> desiredHealthy() {
        return this.desiredHealthy;
    }

    /**
     * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
     * 
     */
    @Import(name="disruptedPods")
    private @Nullable Output<Map<String,String>> disruptedPods;

    /**
     * @return DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
     * 
     */
    public Optional<Output<Map<String,String>>> disruptedPods() {
        return Optional.ofNullable(this.disruptedPods);
    }

    /**
     * Number of pod disruptions that are currently allowed.
     * 
     */
    @Import(name="disruptionsAllowed", required=true)
    private Output<Integer> disruptionsAllowed;

    /**
     * @return Number of pod disruptions that are currently allowed.
     * 
     */
    public Output<Integer> disruptionsAllowed() {
        return this.disruptionsAllowed;
    }

    /**
     * total number of pods counted by this disruption budget
     * 
     */
    @Import(name="expectedPods", required=true)
    private Output<Integer> expectedPods;

    /**
     * @return total number of pods counted by this disruption budget
     * 
     */
    public Output<Integer> expectedPods() {
        return this.expectedPods;
    }

    /**
     * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB&#39;s object generation.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    /**
     * @return Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB&#39;s object generation.
     * 
     */
    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    private PodDisruptionBudgetStatusArgs() {}

    private PodDisruptionBudgetStatusArgs(PodDisruptionBudgetStatusArgs $) {
        this.currentHealthy = $.currentHealthy;
        this.desiredHealthy = $.desiredHealthy;
        this.disruptedPods = $.disruptedPods;
        this.disruptionsAllowed = $.disruptionsAllowed;
        this.expectedPods = $.expectedPods;
        this.observedGeneration = $.observedGeneration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodDisruptionBudgetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodDisruptionBudgetStatusArgs $;

        public Builder() {
            $ = new PodDisruptionBudgetStatusArgs();
        }

        public Builder(PodDisruptionBudgetStatusArgs defaults) {
            $ = new PodDisruptionBudgetStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentHealthy current number of healthy pods
         * 
         * @return builder
         * 
         */
        public Builder currentHealthy(Output<Integer> currentHealthy) {
            $.currentHealthy = currentHealthy;
            return this;
        }

        /**
         * @param currentHealthy current number of healthy pods
         * 
         * @return builder
         * 
         */
        public Builder currentHealthy(Integer currentHealthy) {
            return currentHealthy(Output.of(currentHealthy));
        }

        /**
         * @param desiredHealthy minimum desired number of healthy pods
         * 
         * @return builder
         * 
         */
        public Builder desiredHealthy(Output<Integer> desiredHealthy) {
            $.desiredHealthy = desiredHealthy;
            return this;
        }

        /**
         * @param desiredHealthy minimum desired number of healthy pods
         * 
         * @return builder
         * 
         */
        public Builder desiredHealthy(Integer desiredHealthy) {
            return desiredHealthy(Output.of(desiredHealthy));
        }

        /**
         * @param disruptedPods DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
         * 
         * @return builder
         * 
         */
        public Builder disruptedPods(@Nullable Output<Map<String,String>> disruptedPods) {
            $.disruptedPods = disruptedPods;
            return this;
        }

        /**
         * @param disruptedPods DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
         * 
         * @return builder
         * 
         */
        public Builder disruptedPods(Map<String,String> disruptedPods) {
            return disruptedPods(Output.of(disruptedPods));
        }

        /**
         * @param disruptionsAllowed Number of pod disruptions that are currently allowed.
         * 
         * @return builder
         * 
         */
        public Builder disruptionsAllowed(Output<Integer> disruptionsAllowed) {
            $.disruptionsAllowed = disruptionsAllowed;
            return this;
        }

        /**
         * @param disruptionsAllowed Number of pod disruptions that are currently allowed.
         * 
         * @return builder
         * 
         */
        public Builder disruptionsAllowed(Integer disruptionsAllowed) {
            return disruptionsAllowed(Output.of(disruptionsAllowed));
        }

        /**
         * @param expectedPods total number of pods counted by this disruption budget
         * 
         * @return builder
         * 
         */
        public Builder expectedPods(Output<Integer> expectedPods) {
            $.expectedPods = expectedPods;
            return this;
        }

        /**
         * @param expectedPods total number of pods counted by this disruption budget
         * 
         * @return builder
         * 
         */
        public Builder expectedPods(Integer expectedPods) {
            return expectedPods(Output.of(expectedPods));
        }

        /**
         * @param observedGeneration Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB&#39;s object generation.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * @param observedGeneration Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB&#39;s object generation.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public PodDisruptionBudgetStatusArgs build() {
            if ($.currentHealthy == null) {
                throw new MissingRequiredPropertyException("PodDisruptionBudgetStatusArgs", "currentHealthy");
            }
            if ($.desiredHealthy == null) {
                throw new MissingRequiredPropertyException("PodDisruptionBudgetStatusArgs", "desiredHealthy");
            }
            if ($.disruptionsAllowed == null) {
                throw new MissingRequiredPropertyException("PodDisruptionBudgetStatusArgs", "disruptionsAllowed");
            }
            if ($.expectedPods == null) {
                throw new MissingRequiredPropertyException("PodDisruptionBudgetStatusArgs", "expectedPods");
            }
            return $;
        }
    }

}
