// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.Condition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServiceCIDRStatus {
    /**
     * @return conditions holds an array of metav1.Condition that describe the state of the ServiceCIDR. Current service state
     * 
     */
    private @Nullable List<Condition> conditions;

    private ServiceCIDRStatus() {}
    /**
     * @return conditions holds an array of metav1.Condition that describe the state of the ServiceCIDR. Current service state
     * 
     */
    public List<Condition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCIDRStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Condition> conditions;
        public Builder() {}
        public Builder(ServiceCIDRStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable List<Condition> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(Condition... conditions) {
            return conditions(List.of(conditions));
        }
        public ServiceCIDRStatus build() {
            final var _resultValue = new ServiceCIDRStatus();
            _resultValue.conditions = conditions;
            return _resultValue;
        }
    }
}
