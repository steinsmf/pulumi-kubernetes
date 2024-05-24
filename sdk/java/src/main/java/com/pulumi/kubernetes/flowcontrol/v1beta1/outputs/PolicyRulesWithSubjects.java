// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.flowcontrol.v1beta1.outputs.NonResourcePolicyRule;
import com.pulumi.kubernetes.flowcontrol.v1beta1.outputs.ResourcePolicyRule;
import com.pulumi.kubernetes.flowcontrol.v1beta1.outputs.Subject;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PolicyRulesWithSubjects {
    /**
     * @return `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    private @Nullable List<NonResourcePolicyRule> nonResourceRules;
    /**
     * @return `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    private @Nullable List<ResourcePolicyRule> resourceRules;
    /**
     * @return subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    private List<Subject> subjects;

    private PolicyRulesWithSubjects() {}
    /**
     * @return `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    public List<NonResourcePolicyRule> nonResourceRules() {
        return this.nonResourceRules == null ? List.of() : this.nonResourceRules;
    }
    /**
     * @return `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    public List<ResourcePolicyRule> resourceRules() {
        return this.resourceRules == null ? List.of() : this.resourceRules;
    }
    /**
     * @return subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    public List<Subject> subjects() {
        return this.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRulesWithSubjects defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NonResourcePolicyRule> nonResourceRules;
        private @Nullable List<ResourcePolicyRule> resourceRules;
        private List<Subject> subjects;
        public Builder() {}
        public Builder(PolicyRulesWithSubjects defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
    	      this.subjects = defaults.subjects;
        }

        @CustomType.Setter
        public Builder nonResourceRules(@Nullable List<NonResourcePolicyRule> nonResourceRules) {

            this.nonResourceRules = nonResourceRules;
            return this;
        }
        public Builder nonResourceRules(NonResourcePolicyRule... nonResourceRules) {
            return nonResourceRules(List.of(nonResourceRules));
        }
        @CustomType.Setter
        public Builder resourceRules(@Nullable List<ResourcePolicyRule> resourceRules) {

            this.resourceRules = resourceRules;
            return this;
        }
        public Builder resourceRules(ResourcePolicyRule... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }
        @CustomType.Setter
        public Builder subjects(List<Subject> subjects) {
            if (subjects == null) {
              throw new MissingRequiredPropertyException("PolicyRulesWithSubjects", "subjects");
            }
            this.subjects = subjects;
            return this;
        }
        public Builder subjects(Subject... subjects) {
            return subjects(List.of(subjects));
        }
        public PolicyRulesWithSubjects build() {
            final var _resultValue = new PolicyRulesWithSubjects();
            _resultValue.nonResourceRules = nonResourceRules;
            _resultValue.resourceRules = resourceRules;
            _resultValue.subjects = subjects;
            return _resultValue;
        }
    }
}
