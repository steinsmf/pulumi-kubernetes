// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.v1beta3.inputs.FlowDistinguisherMethodPatchArgs;
import com.pulumi.kubernetes.flowcontrol.v1beta3.inputs.PolicyRulesWithSubjectsPatchArgs;
import com.pulumi.kubernetes.flowcontrol.v1beta3.inputs.PriorityLevelConfigurationReferencePatchArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * FlowSchemaSpec describes how the FlowSchema&#39;s specification looks like.
 * 
 */
public final class FlowSchemaSpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSchemaSpecPatchArgs Empty = new FlowSchemaSpecPatchArgs();

    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    @Import(name="distinguisherMethod")
    private @Nullable Output<FlowDistinguisherMethodPatchArgs> distinguisherMethod;

    /**
     * @return `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    public Optional<Output<FlowDistinguisherMethodPatchArgs>> distinguisherMethod() {
        return Optional.ofNullable(this.distinguisherMethod);
    }

    /**
     * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     * 
     */
    @Import(name="matchingPrecedence")
    private @Nullable Output<Integer> matchingPrecedence;

    /**
     * @return `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     * 
     */
    public Optional<Output<Integer>> matchingPrecedence() {
        return Optional.ofNullable(this.matchingPrecedence);
    }

    /**
     * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    @Import(name="priorityLevelConfiguration")
    private @Nullable Output<PriorityLevelConfigurationReferencePatchArgs> priorityLevelConfiguration;

    /**
     * @return `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    public Optional<Output<PriorityLevelConfigurationReferencePatchArgs>> priorityLevelConfiguration() {
        return Optional.ofNullable(this.priorityLevelConfiguration);
    }

    /**
     * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<PolicyRulesWithSubjectsPatchArgs>> rules;

    /**
     * @return `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    public Optional<Output<List<PolicyRulesWithSubjectsPatchArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private FlowSchemaSpecPatchArgs() {}

    private FlowSchemaSpecPatchArgs(FlowSchemaSpecPatchArgs $) {
        this.distinguisherMethod = $.distinguisherMethod;
        this.matchingPrecedence = $.matchingPrecedence;
        this.priorityLevelConfiguration = $.priorityLevelConfiguration;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSchemaSpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSchemaSpecPatchArgs $;

        public Builder() {
            $ = new FlowSchemaSpecPatchArgs();
        }

        public Builder(FlowSchemaSpecPatchArgs defaults) {
            $ = new FlowSchemaSpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distinguisherMethod `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
         * 
         * @return builder
         * 
         */
        public Builder distinguisherMethod(@Nullable Output<FlowDistinguisherMethodPatchArgs> distinguisherMethod) {
            $.distinguisherMethod = distinguisherMethod;
            return this;
        }

        /**
         * @param distinguisherMethod `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
         * 
         * @return builder
         * 
         */
        public Builder distinguisherMethod(FlowDistinguisherMethodPatchArgs distinguisherMethod) {
            return distinguisherMethod(Output.of(distinguisherMethod));
        }

        /**
         * @param matchingPrecedence `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
         * 
         * @return builder
         * 
         */
        public Builder matchingPrecedence(@Nullable Output<Integer> matchingPrecedence) {
            $.matchingPrecedence = matchingPrecedence;
            return this;
        }

        /**
         * @param matchingPrecedence `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
         * 
         * @return builder
         * 
         */
        public Builder matchingPrecedence(Integer matchingPrecedence) {
            return matchingPrecedence(Output.of(matchingPrecedence));
        }

        /**
         * @param priorityLevelConfiguration `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
         * 
         * @return builder
         * 
         */
        public Builder priorityLevelConfiguration(@Nullable Output<PriorityLevelConfigurationReferencePatchArgs> priorityLevelConfiguration) {
            $.priorityLevelConfiguration = priorityLevelConfiguration;
            return this;
        }

        /**
         * @param priorityLevelConfiguration `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
         * 
         * @return builder
         * 
         */
        public Builder priorityLevelConfiguration(PriorityLevelConfigurationReferencePatchArgs priorityLevelConfiguration) {
            return priorityLevelConfiguration(Output.of(priorityLevelConfiguration));
        }

        /**
         * @param rules `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<PolicyRulesWithSubjectsPatchArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<PolicyRulesWithSubjectsPatchArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder rules(PolicyRulesWithSubjectsPatchArgs... rules) {
            return rules(List.of(rules));
        }

        public FlowSchemaSpecPatchArgs build() {
            return $;
        }
    }

}
