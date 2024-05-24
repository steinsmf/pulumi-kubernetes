// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.NodeSelectorTermArgs;
import java.lang.Integer;
import java.util.Objects;


/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it&#39;s a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 * 
 */
public final class PreferredSchedulingTermArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreferredSchedulingTermArgs Empty = new PreferredSchedulingTermArgs();

    /**
     * A node selector term, associated with the corresponding weight.
     * 
     */
    @Import(name="preference", required=true)
    private Output<NodeSelectorTermArgs> preference;

    /**
     * @return A node selector term, associated with the corresponding weight.
     * 
     */
    public Output<NodeSelectorTermArgs> preference() {
        return this.preference;
    }

    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private PreferredSchedulingTermArgs() {}

    private PreferredSchedulingTermArgs(PreferredSchedulingTermArgs $) {
        this.preference = $.preference;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreferredSchedulingTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreferredSchedulingTermArgs $;

        public Builder() {
            $ = new PreferredSchedulingTermArgs();
        }

        public Builder(PreferredSchedulingTermArgs defaults) {
            $ = new PreferredSchedulingTermArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preference A node selector term, associated with the corresponding weight.
         * 
         * @return builder
         * 
         */
        public Builder preference(Output<NodeSelectorTermArgs> preference) {
            $.preference = preference;
            return this;
        }

        /**
         * @param preference A node selector term, associated with the corresponding weight.
         * 
         * @return builder
         * 
         */
        public Builder preference(NodeSelectorTermArgs preference) {
            return preference(Output.of(preference));
        }

        /**
         * @param weight Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public PreferredSchedulingTermArgs build() {
            if ($.preference == null) {
                throw new MissingRequiredPropertyException("PreferredSchedulingTermArgs", "preference");
            }
            if ($.weight == null) {
                throw new MissingRequiredPropertyException("PreferredSchedulingTermArgs", "weight");
            }
            return $;
        }
    }

}
