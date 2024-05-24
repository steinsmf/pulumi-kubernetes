// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.ExpressionWarningPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TypeCheckingPatch {
    /**
     * @return The type checking warnings for each expression.
     * 
     */
    private @Nullable List<ExpressionWarningPatch> expressionWarnings;

    private TypeCheckingPatch() {}
    /**
     * @return The type checking warnings for each expression.
     * 
     */
    public List<ExpressionWarningPatch> expressionWarnings() {
        return this.expressionWarnings == null ? List.of() : this.expressionWarnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeCheckingPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ExpressionWarningPatch> expressionWarnings;
        public Builder() {}
        public Builder(TypeCheckingPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expressionWarnings = defaults.expressionWarnings;
        }

        @CustomType.Setter
        public Builder expressionWarnings(@Nullable List<ExpressionWarningPatch> expressionWarnings) {

            this.expressionWarnings = expressionWarnings;
            return this;
        }
        public Builder expressionWarnings(ExpressionWarningPatch... expressionWarnings) {
            return expressionWarnings(List.of(expressionWarnings));
        }
        public TypeCheckingPatch build() {
            final var _resultValue = new TypeCheckingPatch();
            _resultValue.expressionWarnings = expressionWarnings;
            return _resultValue;
        }
    }
}
