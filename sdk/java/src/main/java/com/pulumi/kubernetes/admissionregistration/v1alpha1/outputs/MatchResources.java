// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.admissionregistration.v1alpha1.outputs.NamedRuleWithOperations;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MatchResources {
    /**
     * @return ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
     * 
     */
    private @Nullable List<NamedRuleWithOperations> excludeResourceRules;
    /**
     * @return matchPolicy defines how the &#34;MatchResources&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.
     * 
     * Defaults to &#34;Equivalent&#34;
     * 
     */
    private @Nullable String matchPolicy;
    /**
     * @return NamespaceSelector decides whether to run the admission control policy on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the policy.
     * 
     * For example, to run the webhook on any objects whose namespace is not associated with &#34;runlevel&#34; of &#34;0&#34; or &#34;1&#34;;  you will set the selector as follows: &#34;namespaceSelector&#34;: {
     *   &#34;matchExpressions&#34;: [
     *     {
     *       &#34;key&#34;: &#34;runlevel&#34;,
     *       &#34;operator&#34;: &#34;NotIn&#34;,
     *       &#34;values&#34;: [
     *         &#34;0&#34;,
     *         &#34;1&#34;
     *       ]
     *     }
     *   ]
     * }
     * 
     * If instead you want to only run the policy on any objects whose namespace is associated with the &#34;environment&#34; of &#34;prod&#34; or &#34;staging&#34;; you will set the selector as follows: &#34;namespaceSelector&#34;: {
     *   &#34;matchExpressions&#34;: [
     *     {
     *       &#34;key&#34;: &#34;environment&#34;,
     *       &#34;operator&#34;: &#34;In&#34;,
     *       &#34;values&#34;: [
     *         &#34;prod&#34;,
     *         &#34;staging&#34;
     *       ]
     *     }
     *   ]
     * }
     * 
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
     * 
     * Default to the empty LabelSelector, which matches everything.
     * 
     */
    private @Nullable LabelSelector namespaceSelector;
    /**
     * @return ObjectSelector decides whether to run the validation based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    private @Nullable LabelSelector objectSelector;
    /**
     * @return ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
     * 
     */
    private @Nullable List<NamedRuleWithOperations> resourceRules;

    private MatchResources() {}
    /**
     * @return ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
     * 
     */
    public List<NamedRuleWithOperations> excludeResourceRules() {
        return this.excludeResourceRules == null ? List.of() : this.excludeResourceRules;
    }
    /**
     * @return matchPolicy defines how the &#34;MatchResources&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.
     * 
     * Defaults to &#34;Equivalent&#34;
     * 
     */
    public Optional<String> matchPolicy() {
        return Optional.ofNullable(this.matchPolicy);
    }
    /**
     * @return NamespaceSelector decides whether to run the admission control policy on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the policy.
     * 
     * For example, to run the webhook on any objects whose namespace is not associated with &#34;runlevel&#34; of &#34;0&#34; or &#34;1&#34;;  you will set the selector as follows: &#34;namespaceSelector&#34;: {
     *   &#34;matchExpressions&#34;: [
     *     {
     *       &#34;key&#34;: &#34;runlevel&#34;,
     *       &#34;operator&#34;: &#34;NotIn&#34;,
     *       &#34;values&#34;: [
     *         &#34;0&#34;,
     *         &#34;1&#34;
     *       ]
     *     }
     *   ]
     * }
     * 
     * If instead you want to only run the policy on any objects whose namespace is associated with the &#34;environment&#34; of &#34;prod&#34; or &#34;staging&#34;; you will set the selector as follows: &#34;namespaceSelector&#34;: {
     *   &#34;matchExpressions&#34;: [
     *     {
     *       &#34;key&#34;: &#34;environment&#34;,
     *       &#34;operator&#34;: &#34;In&#34;,
     *       &#34;values&#34;: [
     *         &#34;prod&#34;,
     *         &#34;staging&#34;
     *       ]
     *     }
     *   ]
     * }
     * 
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
     * 
     * Default to the empty LabelSelector, which matches everything.
     * 
     */
    public Optional<LabelSelector> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }
    /**
     * @return ObjectSelector decides whether to run the validation based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    public Optional<LabelSelector> objectSelector() {
        return Optional.ofNullable(this.objectSelector);
    }
    /**
     * @return ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
     * 
     */
    public List<NamedRuleWithOperations> resourceRules() {
        return this.resourceRules == null ? List.of() : this.resourceRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchResources defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NamedRuleWithOperations> excludeResourceRules;
        private @Nullable String matchPolicy;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable LabelSelector objectSelector;
        private @Nullable List<NamedRuleWithOperations> resourceRules;
        public Builder() {}
        public Builder(MatchResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeResourceRules = defaults.excludeResourceRules;
    	      this.matchPolicy = defaults.matchPolicy;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.objectSelector = defaults.objectSelector;
    	      this.resourceRules = defaults.resourceRules;
        }

        @CustomType.Setter
        public Builder excludeResourceRules(@Nullable List<NamedRuleWithOperations> excludeResourceRules) {

            this.excludeResourceRules = excludeResourceRules;
            return this;
        }
        public Builder excludeResourceRules(NamedRuleWithOperations... excludeResourceRules) {
            return excludeResourceRules(List.of(excludeResourceRules));
        }
        @CustomType.Setter
        public Builder matchPolicy(@Nullable String matchPolicy) {

            this.matchPolicy = matchPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceSelector(@Nullable LabelSelector namespaceSelector) {

            this.namespaceSelector = namespaceSelector;
            return this;
        }
        @CustomType.Setter
        public Builder objectSelector(@Nullable LabelSelector objectSelector) {

            this.objectSelector = objectSelector;
            return this;
        }
        @CustomType.Setter
        public Builder resourceRules(@Nullable List<NamedRuleWithOperations> resourceRules) {

            this.resourceRules = resourceRules;
            return this;
        }
        public Builder resourceRules(NamedRuleWithOperations... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }
        public MatchResources build() {
            final var _resultValue = new MatchResources();
            _resultValue.excludeResourceRules = excludeResourceRules;
            _resultValue.matchPolicy = matchPolicy;
            _resultValue.namespaceSelector = namespaceSelector;
            _resultValue.objectSelector = objectSelector;
            _resultValue.resourceRules = resourceRules;
            return _resultValue;
        }
    }
}
