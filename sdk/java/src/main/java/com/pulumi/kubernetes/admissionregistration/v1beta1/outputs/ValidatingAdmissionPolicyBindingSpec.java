// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.MatchResources;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.ParamRef;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ValidatingAdmissionPolicyBindingSpec {
    /**
     * @return MatchResources declares what resources match this binding and will be validated by it. Note that this is intersected with the policy&#39;s matchConstraints, so only requests that are matched by the policy can be selected by this. If this is unset, all resources matched by the policy are validated by this binding When resourceRules is unset, it does not constrain resource matching. If a resource is matched by the other fields of this object, it will be validated. Note that this is differs from ValidatingAdmissionPolicy matchConstraints, where resourceRules are required.
     * 
     */
    private @Nullable MatchResources matchResources;
    /**
     * @return paramRef specifies the parameter resource used to configure the admission control policy. It should point to a resource of the type specified in ParamKind of the bound ValidatingAdmissionPolicy. If the policy specifies a ParamKind and the resource referred to by ParamRef does not exist, this binding is considered mis-configured and the FailurePolicy of the ValidatingAdmissionPolicy applied. If the policy does not specify a ParamKind then this field is ignored, and the rules are evaluated without a param.
     * 
     */
    private @Nullable ParamRef paramRef;
    /**
     * @return PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
     * 
     */
    private @Nullable String policyName;
    /**
     * @return validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced. If a validation evaluates to false it is always enforced according to these actions.
     * 
     * Failures defined by the ValidatingAdmissionPolicy&#39;s FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.
     * 
     * validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.
     * 
     * The supported actions values are:
     * 
     * &#34;Deny&#34; specifies that a validation failure results in a denied request.
     * 
     * &#34;Warn&#34; specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.
     * 
     * &#34;Audit&#34; specifies that a validation failure is included in the published audit event for the request. The audit event will contain a `validation.policy.admission.k8s.io/validation_failure` audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: `&#34;validation.policy.admission.k8s.io/validation_failure&#34;: &#34;[{&#34;message&#34;: &#34;Invalid value&#34;, {&#34;policy&#34;: &#34;policy.example.com&#34;, {&#34;binding&#34;: &#34;policybinding.example.com&#34;, {&#34;expressionIndex&#34;: &#34;1&#34;, {&#34;validationActions&#34;: [&#34;Audit&#34;]}]&#34;`
     * 
     * Clients should expect to handle additional values by ignoring any values not recognized.
     * 
     * &#34;Deny&#34; and &#34;Warn&#34; may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.
     * 
     * Required.
     * 
     */
    private @Nullable List<String> validationActions;

    private ValidatingAdmissionPolicyBindingSpec() {}
    /**
     * @return MatchResources declares what resources match this binding and will be validated by it. Note that this is intersected with the policy&#39;s matchConstraints, so only requests that are matched by the policy can be selected by this. If this is unset, all resources matched by the policy are validated by this binding When resourceRules is unset, it does not constrain resource matching. If a resource is matched by the other fields of this object, it will be validated. Note that this is differs from ValidatingAdmissionPolicy matchConstraints, where resourceRules are required.
     * 
     */
    public Optional<MatchResources> matchResources() {
        return Optional.ofNullable(this.matchResources);
    }
    /**
     * @return paramRef specifies the parameter resource used to configure the admission control policy. It should point to a resource of the type specified in ParamKind of the bound ValidatingAdmissionPolicy. If the policy specifies a ParamKind and the resource referred to by ParamRef does not exist, this binding is considered mis-configured and the FailurePolicy of the ValidatingAdmissionPolicy applied. If the policy does not specify a ParamKind then this field is ignored, and the rules are evaluated without a param.
     * 
     */
    public Optional<ParamRef> paramRef() {
        return Optional.ofNullable(this.paramRef);
    }
    /**
     * @return PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
     * 
     */
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }
    /**
     * @return validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced. If a validation evaluates to false it is always enforced according to these actions.
     * 
     * Failures defined by the ValidatingAdmissionPolicy&#39;s FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.
     * 
     * validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.
     * 
     * The supported actions values are:
     * 
     * &#34;Deny&#34; specifies that a validation failure results in a denied request.
     * 
     * &#34;Warn&#34; specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.
     * 
     * &#34;Audit&#34; specifies that a validation failure is included in the published audit event for the request. The audit event will contain a `validation.policy.admission.k8s.io/validation_failure` audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: `&#34;validation.policy.admission.k8s.io/validation_failure&#34;: &#34;[{&#34;message&#34;: &#34;Invalid value&#34;, {&#34;policy&#34;: &#34;policy.example.com&#34;, {&#34;binding&#34;: &#34;policybinding.example.com&#34;, {&#34;expressionIndex&#34;: &#34;1&#34;, {&#34;validationActions&#34;: [&#34;Audit&#34;]}]&#34;`
     * 
     * Clients should expect to handle additional values by ignoring any values not recognized.
     * 
     * &#34;Deny&#34; and &#34;Warn&#34; may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.
     * 
     * Required.
     * 
     */
    public List<String> validationActions() {
        return this.validationActions == null ? List.of() : this.validationActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidatingAdmissionPolicyBindingSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable MatchResources matchResources;
        private @Nullable ParamRef paramRef;
        private @Nullable String policyName;
        private @Nullable List<String> validationActions;
        public Builder() {}
        public Builder(ValidatingAdmissionPolicyBindingSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchResources = defaults.matchResources;
    	      this.paramRef = defaults.paramRef;
    	      this.policyName = defaults.policyName;
    	      this.validationActions = defaults.validationActions;
        }

        @CustomType.Setter
        public Builder matchResources(@Nullable MatchResources matchResources) {

            this.matchResources = matchResources;
            return this;
        }
        @CustomType.Setter
        public Builder paramRef(@Nullable ParamRef paramRef) {

            this.paramRef = paramRef;
            return this;
        }
        @CustomType.Setter
        public Builder policyName(@Nullable String policyName) {

            this.policyName = policyName;
            return this;
        }
        @CustomType.Setter
        public Builder validationActions(@Nullable List<String> validationActions) {

            this.validationActions = validationActions;
            return this;
        }
        public Builder validationActions(String... validationActions) {
            return validationActions(List.of(validationActions));
        }
        public ValidatingAdmissionPolicyBindingSpec build() {
            final var _resultValue = new ValidatingAdmissionPolicyBindingSpec();
            _resultValue.matchResources = matchResources;
            _resultValue.paramRef = paramRef;
            _resultValue.policyName = policyName;
            _resultValue.validationActions = validationActions;
            return _resultValue;
        }
    }
}
