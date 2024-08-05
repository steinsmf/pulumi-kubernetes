// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.batch.v1.outputs.PodFailurePolicyRulePatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PodFailurePolicyPatch {
    /**
     * @return A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
     * 
     */
    private @Nullable List<PodFailurePolicyRulePatch> rules;

    private PodFailurePolicyPatch() {}
    /**
     * @return A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
     * 
     */
    public List<PodFailurePolicyRulePatch> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodFailurePolicyPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PodFailurePolicyRulePatch> rules;
        public Builder() {}
        public Builder(PodFailurePolicyPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(@Nullable List<PodFailurePolicyRulePatch> rules) {

            this.rules = rules;
            return this;
        }
        public Builder rules(PodFailurePolicyRulePatch... rules) {
            return rules(List.of(rules));
        }
        public PodFailurePolicyPatch build() {
            final var _resultValue = new PodFailurePolicyPatch();
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
