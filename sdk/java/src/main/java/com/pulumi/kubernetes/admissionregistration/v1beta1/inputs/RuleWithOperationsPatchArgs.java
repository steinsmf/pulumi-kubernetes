// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
 * 
 */
public final class RuleWithOperationsPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleWithOperationsPatchArgs Empty = new RuleWithOperationsPatchArgs();

    /**
     * APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    @Import(name="apiGroups")
    private @Nullable Output<List<String>> apiGroups;

    /**
     * @return APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    public Optional<Output<List<String>>> apiGroups() {
        return Optional.ofNullable(this.apiGroups);
    }

    /**
     * APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    @Import(name="apiVersions")
    private @Nullable Output<List<String>> apiVersions;

    /**
     * @return APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    public Optional<Output<List<String>>> apiVersions() {
        return Optional.ofNullable(this.apiVersions);
    }

    /**
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<String>> operations;

    /**
     * @return Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    public Optional<Output<List<String>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * Resources is a list of resources this rule applies to.
     * 
     * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/*&#39; means all subresources of pods. &#39;*{@literal /}scale&#39; means all scale subresources. &#39;*{@literal /}*&#39; means all resources and their subresources.
     * 
     * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
     * 
     * Depending on the enclosing object, subresources might not be allowed. Required.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

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
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;*&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;*&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;*&#34;.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;*&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;*&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;*&#34;.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private RuleWithOperationsPatchArgs() {}

    private RuleWithOperationsPatchArgs(RuleWithOperationsPatchArgs $) {
        this.apiGroups = $.apiGroups;
        this.apiVersions = $.apiVersions;
        this.operations = $.operations;
        this.resources = $.resources;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleWithOperationsPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleWithOperationsPatchArgs $;

        public Builder() {
            $ = new RuleWithOperationsPatchArgs();
        }

        public Builder(RuleWithOperationsPatchArgs defaults) {
            $ = new RuleWithOperationsPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiGroups APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(@Nullable Output<List<String>> apiGroups) {
            $.apiGroups = apiGroups;
            return this;
        }

        /**
         * @param apiGroups APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(List<String> apiGroups) {
            return apiGroups(Output.of(apiGroups));
        }

        /**
         * @param apiGroups APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }

        /**
         * @param apiVersions APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiVersions(@Nullable Output<List<String>> apiVersions) {
            $.apiVersions = apiVersions;
            return this;
        }

        /**
         * @param apiVersions APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiVersions(List<String> apiVersions) {
            return apiVersions(Output.of(apiVersions));
        }

        /**
         * @param apiVersions APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }

        /**
         * @param operations Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder operations(@Nullable Output<List<String>> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder operations(List<String> operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param operations Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If &#39;*&#39; is present, the length of the slice must be one. Required.
         * 
         * @return builder
         * 
         */
        public Builder operations(String... operations) {
            return operations(List.of(operations));
        }

        /**
         * @param resources Resources is a list of resources this rule applies to.
         * 
         * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/*&#39; means all subresources of pods. &#39;*{@literal /}scale&#39; means all scale subresources. &#39;*{@literal /}*&#39; means all resources and their subresources.
         * 
         * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
         * 
         * Depending on the enclosing object, subresources might not be allowed. Required.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources Resources is a list of resources this rule applies to.
         * 
         * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/*&#39; means all subresources of pods. &#39;*{@literal /}scale&#39; means all scale subresources. &#39;*{@literal /}*&#39; means all resources and their subresources.
         * 
         * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
         * 
         * Depending on the enclosing object, subresources might not be allowed. Required.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources Resources is a list of resources this rule applies to.
         * 
         * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/*&#39; means all subresources of pods. &#39;*{@literal /}scale&#39; means all scale subresources. &#39;*{@literal /}*&#39; means all resources and their subresources.
         * 
         * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
         * 
         * Depending on the enclosing object, subresources might not be allowed. Required.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param scope scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;*&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;*&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;*&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;*&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;*&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;*&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public RuleWithOperationsPatchArgs build() {
            return $;
        }
    }

}
