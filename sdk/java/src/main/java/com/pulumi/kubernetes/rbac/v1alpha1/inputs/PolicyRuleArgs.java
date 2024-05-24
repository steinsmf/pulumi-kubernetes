// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 * 
 */
public final class PolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyRuleArgs Empty = new PolicyRuleArgs();

    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    @Import(name="apiGroups")
    private @Nullable Output<List<String>> apiGroups;

    /**
     * @return APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    public Optional<Output<List<String>>> apiGroups() {
        return Optional.ofNullable(this.apiGroups);
    }

    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
     * 
     */
    @Import(name="nonResourceURLs")
    private @Nullable Output<List<String>> nonResourceURLs;

    /**
     * @return NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
     * 
     */
    public Optional<Output<List<String>>> nonResourceURLs() {
        return Optional.ofNullable(this.nonResourceURLs);
    }

    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    @Import(name="resourceNames")
    private @Nullable Output<List<String>> resourceNames;

    /**
     * @return ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    public Optional<Output<List<String>>> resourceNames() {
        return Optional.ofNullable(this.resourceNames);
    }

    /**
     * Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
     * 
     */
    @Import(name="verbs", required=true)
    private Output<List<String>> verbs;

    /**
     * @return Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
     * 
     */
    public Output<List<String>> verbs() {
        return this.verbs;
    }

    private PolicyRuleArgs() {}

    private PolicyRuleArgs(PolicyRuleArgs $) {
        this.apiGroups = $.apiGroups;
        this.nonResourceURLs = $.nonResourceURLs;
        this.resourceNames = $.resourceNames;
        this.resources = $.resources;
        this.verbs = $.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyRuleArgs $;

        public Builder() {
            $ = new PolicyRuleArgs();
        }

        public Builder(PolicyRuleArgs defaults) {
            $ = new PolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiGroups APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(@Nullable Output<List<String>> apiGroups) {
            $.apiGroups = apiGroups;
            return this;
        }

        /**
         * @param apiGroups APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(List<String> apiGroups) {
            return apiGroups(Output.of(apiGroups));
        }

        /**
         * @param apiGroups APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }

        /**
         * @param nonResourceURLs NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceURLs(@Nullable Output<List<String>> nonResourceURLs) {
            $.nonResourceURLs = nonResourceURLs;
            return this;
        }

        /**
         * @param nonResourceURLs NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceURLs(List<String> nonResourceURLs) {
            return nonResourceURLs(Output.of(nonResourceURLs));
        }

        /**
         * @param nonResourceURLs NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceURLs(String... nonResourceURLs) {
            return nonResourceURLs(List.of(nonResourceURLs));
        }

        /**
         * @param resourceNames ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
         * 
         * @return builder
         * 
         */
        public Builder resourceNames(@Nullable Output<List<String>> resourceNames) {
            $.resourceNames = resourceNames;
            return this;
        }

        /**
         * @param resourceNames ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
         * 
         * @return builder
         * 
         */
        public Builder resourceNames(List<String> resourceNames) {
            return resourceNames(Output.of(resourceNames));
        }

        /**
         * @param resourceNames ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
         * 
         * @return builder
         * 
         */
        public Builder resourceNames(String... resourceNames) {
            return resourceNames(List.of(resourceNames));
        }

        /**
         * @param resources Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param verbs Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
         * 
         * @return builder
         * 
         */
        public Builder verbs(Output<List<String>> verbs) {
            $.verbs = verbs;
            return this;
        }

        /**
         * @param verbs Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
         * 
         * @return builder
         * 
         */
        public Builder verbs(List<String> verbs) {
            return verbs(Output.of(verbs));
        }

        /**
         * @param verbs Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
         * 
         * @return builder
         * 
         */
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }

        public PolicyRuleArgs build() {
            if ($.verbs == null) {
                throw new MissingRequiredPropertyException("PolicyRuleArgs", "verbs");
            }
            return $;
        }
    }

}
