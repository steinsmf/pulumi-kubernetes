// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.NonResourcePolicyRulePatch;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.ResourcePolicyRulePatch;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.SubjectPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PolicyRulesWithSubjectsPatch {
    /**
     * @return `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    private @Nullable List<NonResourcePolicyRulePatch> nonResourceRules;
    /**
     * @return `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    private @Nullable List<ResourcePolicyRulePatch> resourceRules;
    /**
     * @return subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    private @Nullable List<SubjectPatch> subjects;

    private PolicyRulesWithSubjectsPatch() {}
    /**
     * @return `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    public List<NonResourcePolicyRulePatch> nonResourceRules() {
        return this.nonResourceRules == null ? List.of() : this.nonResourceRules;
    }
    /**
     * @return `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    public List<ResourcePolicyRulePatch> resourceRules() {
        return this.resourceRules == null ? List.of() : this.resourceRules;
    }
    /**
     * @return subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    public List<SubjectPatch> subjects() {
        return this.subjects == null ? List.of() : this.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRulesWithSubjectsPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NonResourcePolicyRulePatch> nonResourceRules;
        private @Nullable List<ResourcePolicyRulePatch> resourceRules;
        private @Nullable List<SubjectPatch> subjects;
        public Builder() {}
        public Builder(PolicyRulesWithSubjectsPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
    	      this.subjects = defaults.subjects;
        }

        @CustomType.Setter
        public Builder nonResourceRules(@Nullable List<NonResourcePolicyRulePatch> nonResourceRules) {

            this.nonResourceRules = nonResourceRules;
            return this;
        }
        public Builder nonResourceRules(NonResourcePolicyRulePatch... nonResourceRules) {
            return nonResourceRules(List.of(nonResourceRules));
        }
        @CustomType.Setter
        public Builder resourceRules(@Nullable List<ResourcePolicyRulePatch> resourceRules) {

            this.resourceRules = resourceRules;
            return this;
        }
        public Builder resourceRules(ResourcePolicyRulePatch... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }
        @CustomType.Setter
        public Builder subjects(@Nullable List<SubjectPatch> subjects) {

            this.subjects = subjects;
            return this;
        }
        public Builder subjects(SubjectPatch... subjects) {
            return subjects(List.of(subjects));
        }
        public PolicyRulesWithSubjectsPatch build() {
            final var _resultValue = new PolicyRulesWithSubjectsPatch();
            _resultValue.nonResourceRules = nonResourceRules;
            _resultValue.resourceRules = resourceRules;
            _resultValue.subjects = subjects;
            return _resultValue;
        }
    }
}
