// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorPatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 * 
 */
public final class AggregationRulePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AggregationRulePatchArgs Empty = new AggregationRulePatchArgs();

    /**
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
     * 
     */
    @Import(name="clusterRoleSelectors")
    private @Nullable Output<List<LabelSelectorPatchArgs>> clusterRoleSelectors;

    /**
     * @return ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
     * 
     */
    public Optional<Output<List<LabelSelectorPatchArgs>>> clusterRoleSelectors() {
        return Optional.ofNullable(this.clusterRoleSelectors);
    }

    private AggregationRulePatchArgs() {}

    private AggregationRulePatchArgs(AggregationRulePatchArgs $) {
        this.clusterRoleSelectors = $.clusterRoleSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AggregationRulePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AggregationRulePatchArgs $;

        public Builder() {
            $ = new AggregationRulePatchArgs();
        }

        public Builder(AggregationRulePatchArgs defaults) {
            $ = new AggregationRulePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterRoleSelectors ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
         * 
         * @return builder
         * 
         */
        public Builder clusterRoleSelectors(@Nullable Output<List<LabelSelectorPatchArgs>> clusterRoleSelectors) {
            $.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }

        /**
         * @param clusterRoleSelectors ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
         * 
         * @return builder
         * 
         */
        public Builder clusterRoleSelectors(List<LabelSelectorPatchArgs> clusterRoleSelectors) {
            return clusterRoleSelectors(Output.of(clusterRoleSelectors));
        }

        /**
         * @param clusterRoleSelectors ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
         * 
         * @return builder
         * 
         */
        public Builder clusterRoleSelectors(LabelSelectorPatchArgs... clusterRoleSelectors) {
            return clusterRoleSelectors(List.of(clusterRoleSelectors));
        }

        public AggregationRulePatchArgs build() {
            return $;
        }
    }

}
