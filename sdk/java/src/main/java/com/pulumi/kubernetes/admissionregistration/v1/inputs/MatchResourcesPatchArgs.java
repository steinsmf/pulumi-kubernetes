// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.admissionregistration.v1.inputs.NamedRuleWithOperationsPatchArgs;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorPatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
 * 
 */
public final class MatchResourcesPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final MatchResourcesPatchArgs Empty = new MatchResourcesPatchArgs();

    /**
     * ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
     * 
     */
    @Import(name="excludeResourceRules")
    private @Nullable Output<List<NamedRuleWithOperationsPatchArgs>> excludeResourceRules;

    /**
     * @return ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
     * 
     */
    public Optional<Output<List<NamedRuleWithOperationsPatchArgs>>> excludeResourceRules() {
        return Optional.ofNullable(this.excludeResourceRules);
    }

    /**
     * matchPolicy defines how the &#34;MatchResources&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.
     * 
     * Defaults to &#34;Equivalent&#34;
     * 
     */
    @Import(name="matchPolicy")
    private @Nullable Output<String> matchPolicy;

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
    public Optional<Output<String>> matchPolicy() {
        return Optional.ofNullable(this.matchPolicy);
    }

    /**
     * NamespaceSelector decides whether to run the admission control policy on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the policy.
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
    @Import(name="namespaceSelector")
    private @Nullable Output<LabelSelectorPatchArgs> namespaceSelector;

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
    public Optional<Output<LabelSelectorPatchArgs>> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }

    /**
     * ObjectSelector decides whether to run the validation based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    @Import(name="objectSelector")
    private @Nullable Output<LabelSelectorPatchArgs> objectSelector;

    /**
     * @return ObjectSelector decides whether to run the validation based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    public Optional<Output<LabelSelectorPatchArgs>> objectSelector() {
        return Optional.ofNullable(this.objectSelector);
    }

    /**
     * ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
     * 
     */
    @Import(name="resourceRules")
    private @Nullable Output<List<NamedRuleWithOperationsPatchArgs>> resourceRules;

    /**
     * @return ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
     * 
     */
    public Optional<Output<List<NamedRuleWithOperationsPatchArgs>>> resourceRules() {
        return Optional.ofNullable(this.resourceRules);
    }

    private MatchResourcesPatchArgs() {}

    private MatchResourcesPatchArgs(MatchResourcesPatchArgs $) {
        this.excludeResourceRules = $.excludeResourceRules;
        this.matchPolicy = $.matchPolicy;
        this.namespaceSelector = $.namespaceSelector;
        this.objectSelector = $.objectSelector;
        this.resourceRules = $.resourceRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MatchResourcesPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MatchResourcesPatchArgs $;

        public Builder() {
            $ = new MatchResourcesPatchArgs();
        }

        public Builder(MatchResourcesPatchArgs defaults) {
            $ = new MatchResourcesPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeResourceRules ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
         * 
         * @return builder
         * 
         */
        public Builder excludeResourceRules(@Nullable Output<List<NamedRuleWithOperationsPatchArgs>> excludeResourceRules) {
            $.excludeResourceRules = excludeResourceRules;
            return this;
        }

        /**
         * @param excludeResourceRules ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
         * 
         * @return builder
         * 
         */
        public Builder excludeResourceRules(List<NamedRuleWithOperationsPatchArgs> excludeResourceRules) {
            return excludeResourceRules(Output.of(excludeResourceRules));
        }

        /**
         * @param excludeResourceRules ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
         * 
         * @return builder
         * 
         */
        public Builder excludeResourceRules(NamedRuleWithOperationsPatchArgs... excludeResourceRules) {
            return excludeResourceRules(List.of(excludeResourceRules));
        }

        /**
         * @param matchPolicy matchPolicy defines how the &#34;MatchResources&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
         * 
         * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.
         * 
         * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.
         * 
         * Defaults to &#34;Equivalent&#34;
         * 
         * @return builder
         * 
         */
        public Builder matchPolicy(@Nullable Output<String> matchPolicy) {
            $.matchPolicy = matchPolicy;
            return this;
        }

        /**
         * @param matchPolicy matchPolicy defines how the &#34;MatchResources&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
         * 
         * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.
         * 
         * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.
         * 
         * Defaults to &#34;Equivalent&#34;
         * 
         * @return builder
         * 
         */
        public Builder matchPolicy(String matchPolicy) {
            return matchPolicy(Output.of(matchPolicy));
        }

        /**
         * @param namespaceSelector NamespaceSelector decides whether to run the admission control policy on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the policy.
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
         * @return builder
         * 
         */
        public Builder namespaceSelector(@Nullable Output<LabelSelectorPatchArgs> namespaceSelector) {
            $.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * @param namespaceSelector NamespaceSelector decides whether to run the admission control policy on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the policy.
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
         * @return builder
         * 
         */
        public Builder namespaceSelector(LabelSelectorPatchArgs namespaceSelector) {
            return namespaceSelector(Output.of(namespaceSelector));
        }

        /**
         * @param objectSelector ObjectSelector decides whether to run the validation based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
         * 
         * @return builder
         * 
         */
        public Builder objectSelector(@Nullable Output<LabelSelectorPatchArgs> objectSelector) {
            $.objectSelector = objectSelector;
            return this;
        }

        /**
         * @param objectSelector ObjectSelector decides whether to run the validation based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
         * 
         * @return builder
         * 
         */
        public Builder objectSelector(LabelSelectorPatchArgs objectSelector) {
            return objectSelector(Output.of(objectSelector));
        }

        /**
         * @param resourceRules ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(@Nullable Output<List<NamedRuleWithOperationsPatchArgs>> resourceRules) {
            $.resourceRules = resourceRules;
            return this;
        }

        /**
         * @param resourceRules ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(List<NamedRuleWithOperationsPatchArgs> resourceRules) {
            return resourceRules(Output.of(resourceRules));
        }

        /**
         * @param resourceRules ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(NamedRuleWithOperationsPatchArgs... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }

        public MatchResourcesPatchArgs build() {
            return $;
        }
    }

}
