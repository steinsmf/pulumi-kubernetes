// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PolicyRule {
    /**
     * @return APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    private @Nullable List<String> apiGroups;
    /**
     * @return NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
     * 
     */
    private @Nullable List<String> nonResourceURLs;
    /**
     * @return ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    private @Nullable List<String> resourceNames;
    /**
     * @return Resources is a list of resources this rule applies to.  &#39;*&#39; represents all resources in the specified apiGroups. &#39;*{@literal /}foo&#39; represents the subresource &#39;foo&#39; for all resources in the specified apiGroups.
     * 
     */
    private @Nullable List<String> resources;
    /**
     * @return Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
     * 
     */
    private List<String> verbs;

    private PolicyRule() {}
    /**
     * @return APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    public List<String> apiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    /**
     * @return NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as &#34;pods&#34; or &#34;secrets&#34;) or non-resource URL paths (such as &#34;/api&#34;),  but not both.
     * 
     */
    public List<String> nonResourceURLs() {
        return this.nonResourceURLs == null ? List.of() : this.nonResourceURLs;
    }
    /**
     * @return ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    public List<String> resourceNames() {
        return this.resourceNames == null ? List.of() : this.resourceNames;
    }
    /**
     * @return Resources is a list of resources this rule applies to.  &#39;*&#39; represents all resources in the specified apiGroups. &#39;*{@literal /}foo&#39; represents the subresource &#39;foo&#39; for all resources in the specified apiGroups.
     * 
     */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * @return Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
     * 
     */
    public List<String> verbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> apiGroups;
        private @Nullable List<String> nonResourceURLs;
        private @Nullable List<String> resourceNames;
        private @Nullable List<String> resources;
        private List<String> verbs;
        public Builder() {}
        public Builder(PolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.resourceNames = defaults.resourceNames;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        @CustomType.Setter
        public Builder apiGroups(@Nullable List<String> apiGroups) {

            this.apiGroups = apiGroups;
            return this;
        }
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }
        @CustomType.Setter
        public Builder nonResourceURLs(@Nullable List<String> nonResourceURLs) {

            this.nonResourceURLs = nonResourceURLs;
            return this;
        }
        public Builder nonResourceURLs(String... nonResourceURLs) {
            return nonResourceURLs(List.of(nonResourceURLs));
        }
        @CustomType.Setter
        public Builder resourceNames(@Nullable List<String> resourceNames) {

            this.resourceNames = resourceNames;
            return this;
        }
        public Builder resourceNames(String... resourceNames) {
            return resourceNames(List.of(resourceNames));
        }
        @CustomType.Setter
        public Builder resources(@Nullable List<String> resources) {

            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder verbs(List<String> verbs) {
            if (verbs == null) {
              throw new MissingRequiredPropertyException("PolicyRule", "verbs");
            }
            this.verbs = verbs;
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }
        public PolicyRule build() {
            final var _resultValue = new PolicyRule();
            _resultValue.apiGroups = apiGroups;
            _resultValue.nonResourceURLs = nonResourceURLs;
            _resultValue.resourceNames = resourceNames;
            _resultValue.resources = resources;
            _resultValue.verbs = verbs;
            return _resultValue;
        }
    }
}
