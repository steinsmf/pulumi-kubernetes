// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.admissionregistration.v1alpha1.outputs.TypeCheckingPatch;
import com.pulumi.kubernetes.meta.v1.outputs.ConditionPatch;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ValidatingAdmissionPolicyStatusPatch {
    /**
     * @return The conditions represent the latest available observations of a policy&#39;s current state.
     * 
     */
    private @Nullable List<ConditionPatch> conditions;
    /**
     * @return The generation observed by the controller.
     * 
     */
    private @Nullable Integer observedGeneration;
    /**
     * @return The results of type checking for each expression. Presence of this field indicates the completion of the type checking.
     * 
     */
    private @Nullable TypeCheckingPatch typeChecking;

    private ValidatingAdmissionPolicyStatusPatch() {}
    /**
     * @return The conditions represent the latest available observations of a policy&#39;s current state.
     * 
     */
    public List<ConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return The generation observed by the controller.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * @return The results of type checking for each expression. Presence of this field indicates the completion of the type checking.
     * 
     */
    public Optional<TypeCheckingPatch> typeChecking() {
        return Optional.ofNullable(this.typeChecking);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidatingAdmissionPolicyStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConditionPatch> conditions;
        private @Nullable Integer observedGeneration;
        private @Nullable TypeCheckingPatch typeChecking;
        public Builder() {}
        public Builder(ValidatingAdmissionPolicyStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.typeChecking = defaults.typeChecking;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable List<ConditionPatch> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(ConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder observedGeneration(@Nullable Integer observedGeneration) {

            this.observedGeneration = observedGeneration;
            return this;
        }
        @CustomType.Setter
        public Builder typeChecking(@Nullable TypeCheckingPatch typeChecking) {

            this.typeChecking = typeChecking;
            return this;
        }
        public ValidatingAdmissionPolicyStatusPatch build() {
            final var _resultValue = new ValidatingAdmissionPolicyStatusPatch();
            _resultValue.conditions = conditions;
            _resultValue.observedGeneration = observedGeneration;
            _resultValue.typeChecking = typeChecking;
            return _resultValue;
        }
    }
}
