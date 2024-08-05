// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AggregationRule {
    /**
     * @return ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
     * 
     */
    private @Nullable List<LabelSelector> clusterRoleSelectors;

    private AggregationRule() {}
    /**
     * @return ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
     * 
     */
    public List<LabelSelector> clusterRoleSelectors() {
        return this.clusterRoleSelectors == null ? List.of() : this.clusterRoleSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<LabelSelector> clusterRoleSelectors;
        public Builder() {}
        public Builder(AggregationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterRoleSelectors = defaults.clusterRoleSelectors;
        }

        @CustomType.Setter
        public Builder clusterRoleSelectors(@Nullable List<LabelSelector> clusterRoleSelectors) {

            this.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }
        public Builder clusterRoleSelectors(LabelSelector... clusterRoleSelectors) {
            return clusterRoleSelectors(List.of(clusterRoleSelectors));
        }
        public AggregationRule build() {
            final var _resultValue = new AggregationRule();
            _resultValue.clusterRoleSelectors = clusterRoleSelectors;
            return _resultValue;
        }
    }
}
