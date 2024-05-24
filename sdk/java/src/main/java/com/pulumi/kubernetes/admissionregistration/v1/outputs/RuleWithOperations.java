// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleWithOperations {
    /**
     * @return APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    private @Nullable List<String> apiGroups;
    /**
     * @return APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    private @Nullable List<String> apiVersions;
    /**
     * @return Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    private @Nullable List<String> operations;
    /**
     * @return Resources is a list of resources this rule applies to.
     * 
     * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/*&#39; means all subresources of pods. &#39;*{@literal /}scale&#39; means all scale subresources. &#39;*{@literal /}*&#39; means all resources and their subresources.
     * 
     * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
     * 
     * Depending on the enclosing object, subresources might not be allowed. Required.
     * 
     */
    private @Nullable List<String> resources;
    /**
     * @return scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;*&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;*&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;*&#34;.
     * 
     */
    private @Nullable String scope;

    private RuleWithOperations() {}
    /**
     * @return APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    public List<String> apiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    /**
     * @return APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    public List<String> apiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }
    /**
     * @return Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    public List<String> operations() {
        return this.operations == null ? List.of() : this.operations;
    }
    /**
     * @return Resources is a list of resources this rule applies to.
     * 
     * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/*&#39; means all subresources of pods. &#39;*{@literal /}scale&#39; means all scale subresources. &#39;*{@literal /}*&#39; means all resources and their subresources.
     * 
     * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
     * 
     * Depending on the enclosing object, subresources might not be allowed. Required.
     * 
     */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * @return scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;*&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;*&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;*&#34;.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleWithOperations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> apiGroups;
        private @Nullable List<String> apiVersions;
        private @Nullable List<String> operations;
        private @Nullable List<String> resources;
        private @Nullable String scope;
        public Builder() {}
        public Builder(RuleWithOperations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.apiVersions = defaults.apiVersions;
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
    	      this.scope = defaults.scope;
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
        public Builder apiVersions(@Nullable List<String> apiVersions) {

            this.apiVersions = apiVersions;
            return this;
        }
        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }
        @CustomType.Setter
        public Builder operations(@Nullable List<String> operations) {

            this.operations = operations;
            return this;
        }
        public Builder operations(String... operations) {
            return operations(List.of(operations));
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
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
            return this;
        }
        public RuleWithOperations build() {
            final var _resultValue = new RuleWithOperations();
            _resultValue.apiGroups = apiGroups;
            _resultValue.apiVersions = apiVersions;
            _resultValue.operations = operations;
            _resultValue.resources = resources;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
