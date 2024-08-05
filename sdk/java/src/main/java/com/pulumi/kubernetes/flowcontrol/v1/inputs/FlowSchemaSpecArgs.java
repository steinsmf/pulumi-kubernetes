// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.flowcontrol.v1.inputs.FlowDistinguisherMethodArgs;
import com.pulumi.kubernetes.flowcontrol.v1.inputs.PolicyRulesWithSubjectsArgs;
import com.pulumi.kubernetes.flowcontrol.v1.inputs.PriorityLevelConfigurationReferenceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * FlowSchemaSpec describes how the FlowSchema&#39;s specification looks like.
 * 
 */
public final class FlowSchemaSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSchemaSpecArgs Empty = new FlowSchemaSpecArgs();

    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    @Import(name="distinguisherMethod")
    private @Nullable Output<FlowDistinguisherMethodArgs> distinguisherMethod;

    /**
     * @return `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    public Optional<Output<FlowDistinguisherMethodArgs>> distinguisherMethod() {
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
    @Import(name="priorityLevelConfiguration", required=true)
    private Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration;

    /**
     * @return `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    public Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration() {
        return this.priorityLevelConfiguration;
    }

    /**
     * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<PolicyRulesWithSubjectsArgs>> rules;

    /**
     * @return `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    public Optional<Output<List<PolicyRulesWithSubjectsArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private FlowSchemaSpecArgs() {}

    private FlowSchemaSpecArgs(FlowSchemaSpecArgs $) {
        this.distinguisherMethod = $.distinguisherMethod;
        this.matchingPrecedence = $.matchingPrecedence;
        this.priorityLevelConfiguration = $.priorityLevelConfiguration;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSchemaSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSchemaSpecArgs $;

        public Builder() {
            $ = new FlowSchemaSpecArgs();
        }

        public Builder(FlowSchemaSpecArgs defaults) {
            $ = new FlowSchemaSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distinguisherMethod `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
         * 
         * @return builder
         * 
         */
        public Builder distinguisherMethod(@Nullable Output<FlowDistinguisherMethodArgs> distinguisherMethod) {
            $.distinguisherMethod = distinguisherMethod;
            return this;
        }

        /**
         * @param distinguisherMethod `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
         * 
         * @return builder
         * 
         */
        public Builder distinguisherMethod(FlowDistinguisherMethodArgs distinguisherMethod) {
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
        public Builder priorityLevelConfiguration(Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration) {
            $.priorityLevelConfiguration = priorityLevelConfiguration;
            return this;
        }

        /**
         * @param priorityLevelConfiguration `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
         * 
         * @return builder
         * 
         */
        public Builder priorityLevelConfiguration(PriorityLevelConfigurationReferenceArgs priorityLevelConfiguration) {
            return priorityLevelConfiguration(Output.of(priorityLevelConfiguration));
        }

        /**
         * @param rules `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<PolicyRulesWithSubjectsArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<PolicyRulesWithSubjectsArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder rules(PolicyRulesWithSubjectsArgs... rules) {
            return rules(List.of(rules));
        }

        public FlowSchemaSpecArgs build() {
            if ($.priorityLevelConfiguration == null) {
                throw new MissingRequiredPropertyException("FlowSchemaSpecArgs", "priorityLevelConfiguration");
            }
            return $;
        }
    }

}
