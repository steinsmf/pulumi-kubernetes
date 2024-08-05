// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.admissionregistration.v1alpha1.inputs.ExpressionWarningArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TypeChecking contains results of type checking the expressions in the ValidatingAdmissionPolicy
 * 
 */
public final class TypeCheckingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypeCheckingArgs Empty = new TypeCheckingArgs();

    /**
     * The type checking warnings for each expression.
     * 
     */
    @Import(name="expressionWarnings")
    private @Nullable Output<List<ExpressionWarningArgs>> expressionWarnings;

    /**
     * @return The type checking warnings for each expression.
     * 
     */
    public Optional<Output<List<ExpressionWarningArgs>>> expressionWarnings() {
        return Optional.ofNullable(this.expressionWarnings);
    }

    private TypeCheckingArgs() {}

    private TypeCheckingArgs(TypeCheckingArgs $) {
        this.expressionWarnings = $.expressionWarnings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypeCheckingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypeCheckingArgs $;

        public Builder() {
            $ = new TypeCheckingArgs();
        }

        public Builder(TypeCheckingArgs defaults) {
            $ = new TypeCheckingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressionWarnings The type checking warnings for each expression.
         * 
         * @return builder
         * 
         */
        public Builder expressionWarnings(@Nullable Output<List<ExpressionWarningArgs>> expressionWarnings) {
            $.expressionWarnings = expressionWarnings;
            return this;
        }

        /**
         * @param expressionWarnings The type checking warnings for each expression.
         * 
         * @return builder
         * 
         */
        public Builder expressionWarnings(List<ExpressionWarningArgs> expressionWarnings) {
            return expressionWarnings(Output.of(expressionWarnings));
        }

        /**
         * @param expressionWarnings The type checking warnings for each expression.
         * 
         * @return builder
         * 
         */
        public Builder expressionWarnings(ExpressionWarningArgs... expressionWarnings) {
            return expressionWarnings(List.of(expressionWarnings));
        }

        public TypeCheckingArgs build() {
            return $;
        }
    }

}
