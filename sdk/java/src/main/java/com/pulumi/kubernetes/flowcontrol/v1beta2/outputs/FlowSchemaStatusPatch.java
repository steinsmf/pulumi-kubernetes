// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1beta2.outputs.FlowSchemaConditionPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FlowSchemaStatusPatch {
    /**
     * @return `conditions` is a list of the current states of FlowSchema.
     * 
     */
    private @Nullable List<FlowSchemaConditionPatch> conditions;

    private FlowSchemaStatusPatch() {}
    /**
     * @return `conditions` is a list of the current states of FlowSchema.
     * 
     */
    public List<FlowSchemaConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FlowSchemaConditionPatch> conditions;
        public Builder() {}
        public Builder(FlowSchemaStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable List<FlowSchemaConditionPatch> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(FlowSchemaConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        public FlowSchemaStatusPatch build() {
            final var _resultValue = new FlowSchemaStatusPatch();
            _resultValue.conditions = conditions;
            return _resultValue;
        }
    }
}
