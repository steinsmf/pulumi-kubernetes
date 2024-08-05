// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs;
import java.lang.Integer;
import java.util.Objects;


/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 * 
 */
public final class WeightedPodAffinityTermArgs extends com.pulumi.resources.ResourceArgs {

    public static final WeightedPodAffinityTermArgs Empty = new WeightedPodAffinityTermArgs();

    /**
     * Required. A pod affinity term, associated with the corresponding weight.
     * 
     */
    @Import(name="podAffinityTerm", required=true)
    private Output<PodAffinityTermArgs> podAffinityTerm;

    /**
     * @return Required. A pod affinity term, associated with the corresponding weight.
     * 
     */
    public Output<PodAffinityTermArgs> podAffinityTerm() {
        return this.podAffinityTerm;
    }

    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private WeightedPodAffinityTermArgs() {}

    private WeightedPodAffinityTermArgs(WeightedPodAffinityTermArgs $) {
        this.podAffinityTerm = $.podAffinityTerm;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeightedPodAffinityTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeightedPodAffinityTermArgs $;

        public Builder() {
            $ = new WeightedPodAffinityTermArgs();
        }

        public Builder(WeightedPodAffinityTermArgs defaults) {
            $ = new WeightedPodAffinityTermArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param podAffinityTerm Required. A pod affinity term, associated with the corresponding weight.
         * 
         * @return builder
         * 
         */
        public Builder podAffinityTerm(Output<PodAffinityTermArgs> podAffinityTerm) {
            $.podAffinityTerm = podAffinityTerm;
            return this;
        }

        /**
         * @param podAffinityTerm Required. A pod affinity term, associated with the corresponding weight.
         * 
         * @return builder
         * 
         */
        public Builder podAffinityTerm(PodAffinityTermArgs podAffinityTerm) {
            return podAffinityTerm(Output.of(podAffinityTerm));
        }

        /**
         * @param weight weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public WeightedPodAffinityTermArgs build() {
            if ($.podAffinityTerm == null) {
                throw new MissingRequiredPropertyException("WeightedPodAffinityTermArgs", "podAffinityTerm");
            }
            if ($.weight == null) {
                throw new MissingRequiredPropertyException("WeightedPodAffinityTermArgs", "weight");
            }
            return $;
        }
    }

}
