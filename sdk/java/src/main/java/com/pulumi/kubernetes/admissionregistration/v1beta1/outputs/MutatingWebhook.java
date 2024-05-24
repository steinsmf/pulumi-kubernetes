// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.RuleWithOperations;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.WebhookClientConfig;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MutatingWebhook {
    /**
     * @return AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `[&#39;v1beta1&#39;]`.
     * 
     */
    private @Nullable List<String> admissionReviewVersions;
    /**
     * @return ClientConfig defines how to communicate with the hook. Required
     * 
     */
    private WebhookClientConfig clientConfig;
    /**
     * @return FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
     * 
     */
    private @Nullable String failurePolicy;
    /**
     * @return matchPolicy defines how the &#34;rules&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
     * 
     * Defaults to &#34;Exact&#34;
     * 
     */
    private @Nullable String matchPolicy;
    /**
     * @return The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where &#34;imagepolicy&#34; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
     */
    private String name;
    /**
     * @return NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
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
     * If instead you want to only run the webhook on any objects whose namespace is associated with the &#34;environment&#34; of &#34;prod&#34; or &#34;staging&#34;; you will set the selector as follows: &#34;namespaceSelector&#34;: {
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
     * @return ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    private @Nullable LabelSelector objectSelector;
    /**
     * @return reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are &#34;Never&#34; and &#34;IfNeeded&#34;.
     * 
     * Never: the webhook will not be called more than once in a single admission evaluation.
     * 
     * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
     * 
     * Defaults to &#34;Never&#34;.
     * 
     */
    private @Nullable String reinvocationPolicy;
    /**
     * @return Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
     */
    private @Nullable List<RuleWithOperations> rules;
    /**
     * @return SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * 
     */
    private @Nullable String sideEffects;
    /**
     * @return TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * 
     */
    private @Nullable Integer timeoutSeconds;

    private MutatingWebhook() {}
    /**
     * @return AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `[&#39;v1beta1&#39;]`.
     * 
     */
    public List<String> admissionReviewVersions() {
        return this.admissionReviewVersions == null ? List.of() : this.admissionReviewVersions;
    }
    /**
     * @return ClientConfig defines how to communicate with the hook. Required
     * 
     */
    public WebhookClientConfig clientConfig() {
        return this.clientConfig;
    }
    /**
     * @return FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
     * 
     */
    public Optional<String> failurePolicy() {
        return Optional.ofNullable(this.failurePolicy);
    }
    /**
     * @return matchPolicy defines how the &#34;rules&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
     * 
     * Defaults to &#34;Exact&#34;
     * 
     */
    public Optional<String> matchPolicy() {
        return Optional.ofNullable(this.matchPolicy);
    }
    /**
     * @return The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where &#34;imagepolicy&#34; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
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
     * If instead you want to only run the webhook on any objects whose namespace is associated with the &#34;environment&#34; of &#34;prod&#34; or &#34;staging&#34;; you will set the selector as follows: &#34;namespaceSelector&#34;: {
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
     * @return ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    public Optional<LabelSelector> objectSelector() {
        return Optional.ofNullable(this.objectSelector);
    }
    /**
     * @return reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are &#34;Never&#34; and &#34;IfNeeded&#34;.
     * 
     * Never: the webhook will not be called more than once in a single admission evaluation.
     * 
     * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
     * 
     * Defaults to &#34;Never&#34;.
     * 
     */
    public Optional<String> reinvocationPolicy() {
        return Optional.ofNullable(this.reinvocationPolicy);
    }
    /**
     * @return Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
     */
    public List<RuleWithOperations> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * @return SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * 
     */
    public Optional<String> sideEffects() {
        return Optional.ofNullable(this.sideEffects);
    }
    /**
     * @return TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutatingWebhook defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> admissionReviewVersions;
        private WebhookClientConfig clientConfig;
        private @Nullable String failurePolicy;
        private @Nullable String matchPolicy;
        private String name;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable LabelSelector objectSelector;
        private @Nullable String reinvocationPolicy;
        private @Nullable List<RuleWithOperations> rules;
        private @Nullable String sideEffects;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(MutatingWebhook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionReviewVersions = defaults.admissionReviewVersions;
    	      this.clientConfig = defaults.clientConfig;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.matchPolicy = defaults.matchPolicy;
    	      this.name = defaults.name;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.objectSelector = defaults.objectSelector;
    	      this.reinvocationPolicy = defaults.reinvocationPolicy;
    	      this.rules = defaults.rules;
    	      this.sideEffects = defaults.sideEffects;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        @CustomType.Setter
        public Builder admissionReviewVersions(@Nullable List<String> admissionReviewVersions) {

            this.admissionReviewVersions = admissionReviewVersions;
            return this;
        }
        public Builder admissionReviewVersions(String... admissionReviewVersions) {
            return admissionReviewVersions(List.of(admissionReviewVersions));
        }
        @CustomType.Setter
        public Builder clientConfig(WebhookClientConfig clientConfig) {
            if (clientConfig == null) {
              throw new MissingRequiredPropertyException("MutatingWebhook", "clientConfig");
            }
            this.clientConfig = clientConfig;
            return this;
        }
        @CustomType.Setter
        public Builder failurePolicy(@Nullable String failurePolicy) {

            this.failurePolicy = failurePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder matchPolicy(@Nullable String matchPolicy) {

            this.matchPolicy = matchPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("MutatingWebhook", "name");
            }
            this.name = name;
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
        public Builder reinvocationPolicy(@Nullable String reinvocationPolicy) {

            this.reinvocationPolicy = reinvocationPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<RuleWithOperations> rules) {

            this.rules = rules;
            return this;
        }
        public Builder rules(RuleWithOperations... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder sideEffects(@Nullable String sideEffects) {

            this.sideEffects = sideEffects;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public MutatingWebhook build() {
            final var _resultValue = new MutatingWebhook();
            _resultValue.admissionReviewVersions = admissionReviewVersions;
            _resultValue.clientConfig = clientConfig;
            _resultValue.failurePolicy = failurePolicy;
            _resultValue.matchPolicy = matchPolicy;
            _resultValue.name = name;
            _resultValue.namespaceSelector = namespaceSelector;
            _resultValue.objectSelector = objectSelector;
            _resultValue.reinvocationPolicy = reinvocationPolicy;
            _resultValue.rules = rules;
            _resultValue.sideEffects = sideEffects;
            _resultValue.timeoutSeconds = timeoutSeconds;
            return _resultValue;
        }
    }
}
