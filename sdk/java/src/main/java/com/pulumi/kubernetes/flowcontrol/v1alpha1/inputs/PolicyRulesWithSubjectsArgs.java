// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.flowcontrol.v1alpha1.inputs.NonResourcePolicyRuleArgs;
import com.pulumi.kubernetes.flowcontrol.v1alpha1.inputs.ResourcePolicyRuleArgs;
import com.pulumi.kubernetes.flowcontrol.v1alpha1.inputs.SubjectArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 * 
 */
public final class PolicyRulesWithSubjectsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyRulesWithSubjectsArgs Empty = new PolicyRulesWithSubjectsArgs();

    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    @Import(name="nonResourceRules")
    private @Nullable Output<List<NonResourcePolicyRuleArgs>> nonResourceRules;

    /**
     * @return `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    public Optional<Output<List<NonResourcePolicyRuleArgs>>> nonResourceRules() {
        return Optional.ofNullable(this.nonResourceRules);
    }

    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    @Import(name="resourceRules")
    private @Nullable Output<List<ResourcePolicyRuleArgs>> resourceRules;

    /**
     * @return `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    public Optional<Output<List<ResourcePolicyRuleArgs>>> resourceRules() {
        return Optional.ofNullable(this.resourceRules);
    }

    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    @Import(name="subjects", required=true)
    private Output<List<SubjectArgs>> subjects;

    /**
     * @return subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    public Output<List<SubjectArgs>> subjects() {
        return this.subjects;
    }

    private PolicyRulesWithSubjectsArgs() {}

    private PolicyRulesWithSubjectsArgs(PolicyRulesWithSubjectsArgs $) {
        this.nonResourceRules = $.nonResourceRules;
        this.resourceRules = $.resourceRules;
        this.subjects = $.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyRulesWithSubjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyRulesWithSubjectsArgs $;

        public Builder() {
            $ = new PolicyRulesWithSubjectsArgs();
        }

        public Builder(PolicyRulesWithSubjectsArgs defaults) {
            $ = new PolicyRulesWithSubjectsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceRules(@Nullable Output<List<NonResourcePolicyRuleArgs>> nonResourceRules) {
            $.nonResourceRules = nonResourceRules;
            return this;
        }

        /**
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceRules(List<NonResourcePolicyRuleArgs> nonResourceRules) {
            return nonResourceRules(Output.of(nonResourceRules));
        }

        /**
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceRules(NonResourcePolicyRuleArgs... nonResourceRules) {
            return nonResourceRules(List.of(nonResourceRules));
        }

        /**
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(@Nullable Output<List<ResourcePolicyRuleArgs>> resourceRules) {
            $.resourceRules = resourceRules;
            return this;
        }

        /**
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(List<ResourcePolicyRuleArgs> resourceRules) {
            return resourceRules(Output.of(resourceRules));
        }

        /**
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(ResourcePolicyRuleArgs... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }

        /**
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * 
         * @return builder
         * 
         */
        public Builder subjects(Output<List<SubjectArgs>> subjects) {
            $.subjects = subjects;
            return this;
        }

        /**
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * 
         * @return builder
         * 
         */
        public Builder subjects(List<SubjectArgs> subjects) {
            return subjects(Output.of(subjects));
        }

        /**
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * 
         * @return builder
         * 
         */
        public Builder subjects(SubjectArgs... subjects) {
            return subjects(List.of(subjects));
        }

        public PolicyRulesWithSubjectsArgs build() {
            if ($.subjects == null) {
                throw new MissingRequiredPropertyException("PolicyRulesWithSubjectsArgs", "subjects");
            }
            return $;
        }
    }

}
