// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1beta3.outputs.FlowSchemaCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FlowSchemaStatus {
    /**
     * @return `conditions` is a list of the current states of FlowSchema.
     * 
     */
    private @Nullable List<FlowSchemaCondition> conditions;

    private FlowSchemaStatus() {}
    /**
     * @return `conditions` is a list of the current states of FlowSchema.
     * 
     */
    public List<FlowSchemaCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FlowSchemaCondition> conditions;
        public Builder() {}
        public Builder(FlowSchemaStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable List<FlowSchemaCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(FlowSchemaCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public FlowSchemaStatus build() {
            final var o = new FlowSchemaStatus();
            o.conditions = conditions;
            return o;
        }
    }
}
