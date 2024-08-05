// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.ConditionPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServiceCIDRStatusPatch {
    /**
     * @return conditions holds an array of metav1.Condition that describe the state of the ServiceCIDR. Current service state
     * 
     */
    private @Nullable List<ConditionPatch> conditions;

    private ServiceCIDRStatusPatch() {}
    /**
     * @return conditions holds an array of metav1.Condition that describe the state of the ServiceCIDR. Current service state
     * 
     */
    public List<ConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCIDRStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConditionPatch> conditions;
        public Builder() {}
        public Builder(ServiceCIDRStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable List<ConditionPatch> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(ConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        public ServiceCIDRStatusPatch build() {
            final var _resultValue = new ServiceCIDRStatusPatch();
            _resultValue.conditions = conditions;
            return _resultValue;
        }
    }
}
