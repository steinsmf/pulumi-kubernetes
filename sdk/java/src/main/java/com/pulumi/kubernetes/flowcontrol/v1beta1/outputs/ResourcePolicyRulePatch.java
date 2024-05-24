// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourcePolicyRulePatch {
    /**
     * @return `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    private @Nullable List<String> apiGroups;
    /**
     * @return `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    private @Nullable Boolean clusterScope;
    /**
     * @return `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    private @Nullable List<String> namespaces;
    /**
     * @return `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
     * 
     */
    private @Nullable List<String> resources;
    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    private @Nullable List<String> verbs;

    private ResourcePolicyRulePatch() {}
    /**
     * @return `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    public List<String> apiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    /**
     * @return `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    public Optional<Boolean> clusterScope() {
        return Optional.ofNullable(this.clusterScope);
    }
    /**
     * @return `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    public List<String> namespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    /**
     * @return `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
     * 
     */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    public List<String> verbs() {
        return this.verbs == null ? List.of() : this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyRulePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> apiGroups;
        private @Nullable Boolean clusterScope;
        private @Nullable List<String> namespaces;
        private @Nullable List<String> resources;
        private @Nullable List<String> verbs;
        public Builder() {}
        public Builder(ResourcePolicyRulePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.clusterScope = defaults.clusterScope;
    	      this.namespaces = defaults.namespaces;
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
        public Builder clusterScope(@Nullable Boolean clusterScope) {

            this.clusterScope = clusterScope;
            return this;
        }
        @CustomType.Setter
        public Builder namespaces(@Nullable List<String> namespaces) {

            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
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
        public Builder verbs(@Nullable List<String> verbs) {

            this.verbs = verbs;
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }
        public ResourcePolicyRulePatch build() {
            final var _resultValue = new ResourcePolicyRulePatch();
            _resultValue.apiGroups = apiGroups;
            _resultValue.clusterScope = clusterScope;
            _resultValue.namespaces = namespaces;
            _resultValue.resources = resources;
            _resultValue.verbs = verbs;
            return _resultValue;
        }
    }
}
