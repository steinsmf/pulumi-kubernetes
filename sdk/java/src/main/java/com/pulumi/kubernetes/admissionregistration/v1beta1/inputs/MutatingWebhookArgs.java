// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.admissionregistration.v1beta1.inputs.RuleWithOperationsArgs;
import com.pulumi.kubernetes.admissionregistration.v1beta1.inputs.WebhookClientConfigArgs;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
 * 
 */
public final class MutatingWebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final MutatingWebhookArgs Empty = new MutatingWebhookArgs();

    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `[&#39;v1beta1&#39;]`.
     * 
     */
    @Import(name="admissionReviewVersions")
    private @Nullable Output<List<String>> admissionReviewVersions;

    /**
     * @return AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `[&#39;v1beta1&#39;]`.
     * 
     */
    public Optional<Output<List<String>>> admissionReviewVersions() {
        return Optional.ofNullable(this.admissionReviewVersions);
    }

    /**
     * ClientConfig defines how to communicate with the hook. Required
     * 
     */
    @Import(name="clientConfig", required=true)
    private Output<WebhookClientConfigArgs> clientConfig;

    /**
     * @return ClientConfig defines how to communicate with the hook. Required
     * 
     */
    public Output<WebhookClientConfigArgs> clientConfig() {
        return this.clientConfig;
    }

    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
     * 
     */
    @Import(name="failurePolicy")
    private @Nullable Output<String> failurePolicy;

    /**
     * @return FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
     * 
     */
    public Optional<Output<String>> failurePolicy() {
        return Optional.ofNullable(this.failurePolicy);
    }

    /**
     * matchPolicy defines how the &#34;rules&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
     * 
     * Defaults to &#34;Exact&#34;
     * 
     */
    @Import(name="matchPolicy")
    private @Nullable Output<String> matchPolicy;

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
    public Optional<Output<String>> matchPolicy() {
        return Optional.ofNullable(this.matchPolicy);
    }

    /**
     * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where &#34;imagepolicy&#34; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where &#34;imagepolicy&#34; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
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
    @Import(name="namespaceSelector")
    private @Nullable Output<LabelSelectorArgs> namespaceSelector;

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
    public Optional<Output<LabelSelectorArgs>> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }

    /**
     * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    @Import(name="objectSelector")
    private @Nullable Output<LabelSelectorArgs> objectSelector;

    /**
     * @return ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    public Optional<Output<LabelSelectorArgs>> objectSelector() {
        return Optional.ofNullable(this.objectSelector);
    }

    /**
     * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are &#34;Never&#34; and &#34;IfNeeded&#34;.
     * 
     * Never: the webhook will not be called more than once in a single admission evaluation.
     * 
     * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
     * 
     * Defaults to &#34;Never&#34;.
     * 
     */
    @Import(name="reinvocationPolicy")
    private @Nullable Output<String> reinvocationPolicy;

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
    public Optional<Output<String>> reinvocationPolicy() {
        return Optional.ofNullable(this.reinvocationPolicy);
    }

    /**
     * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RuleWithOperationsArgs>> rules;

    /**
     * @return Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
     */
    public Optional<Output<List<RuleWithOperationsArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * 
     */
    @Import(name="sideEffects")
    private @Nullable Output<String> sideEffects;

    /**
     * @return SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * 
     */
    public Optional<Output<String>> sideEffects() {
        return Optional.ofNullable(this.sideEffects);
    }

    /**
     * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private MutatingWebhookArgs() {}

    private MutatingWebhookArgs(MutatingWebhookArgs $) {
        this.admissionReviewVersions = $.admissionReviewVersions;
        this.clientConfig = $.clientConfig;
        this.failurePolicy = $.failurePolicy;
        this.matchPolicy = $.matchPolicy;
        this.name = $.name;
        this.namespaceSelector = $.namespaceSelector;
        this.objectSelector = $.objectSelector;
        this.reinvocationPolicy = $.reinvocationPolicy;
        this.rules = $.rules;
        this.sideEffects = $.sideEffects;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MutatingWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MutatingWebhookArgs $;

        public Builder() {
            $ = new MutatingWebhookArgs();
        }

        public Builder(MutatingWebhookArgs defaults) {
            $ = new MutatingWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param admissionReviewVersions AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `[&#39;v1beta1&#39;]`.
         * 
         * @return builder
         * 
         */
        public Builder admissionReviewVersions(@Nullable Output<List<String>> admissionReviewVersions) {
            $.admissionReviewVersions = admissionReviewVersions;
            return this;
        }

        /**
         * @param admissionReviewVersions AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `[&#39;v1beta1&#39;]`.
         * 
         * @return builder
         * 
         */
        public Builder admissionReviewVersions(List<String> admissionReviewVersions) {
            return admissionReviewVersions(Output.of(admissionReviewVersions));
        }

        /**
         * @param admissionReviewVersions AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `[&#39;v1beta1&#39;]`.
         * 
         * @return builder
         * 
         */
        public Builder admissionReviewVersions(String... admissionReviewVersions) {
            return admissionReviewVersions(List.of(admissionReviewVersions));
        }

        /**
         * @param clientConfig ClientConfig defines how to communicate with the hook. Required
         * 
         * @return builder
         * 
         */
        public Builder clientConfig(Output<WebhookClientConfigArgs> clientConfig) {
            $.clientConfig = clientConfig;
            return this;
        }

        /**
         * @param clientConfig ClientConfig defines how to communicate with the hook. Required
         * 
         * @return builder
         * 
         */
        public Builder clientConfig(WebhookClientConfigArgs clientConfig) {
            return clientConfig(Output.of(clientConfig));
        }

        /**
         * @param failurePolicy FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
         * 
         * @return builder
         * 
         */
        public Builder failurePolicy(@Nullable Output<String> failurePolicy) {
            $.failurePolicy = failurePolicy;
            return this;
        }

        /**
         * @param failurePolicy FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
         * 
         * @return builder
         * 
         */
        public Builder failurePolicy(String failurePolicy) {
            return failurePolicy(Output.of(failurePolicy));
        }

        /**
         * @param matchPolicy matchPolicy defines how the &#34;rules&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
         * 
         * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
         * 
         * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
         * 
         * Defaults to &#34;Exact&#34;
         * 
         * @return builder
         * 
         */
        public Builder matchPolicy(@Nullable Output<String> matchPolicy) {
            $.matchPolicy = matchPolicy;
            return this;
        }

        /**
         * @param matchPolicy matchPolicy defines how the &#34;rules&#34; list is used to match incoming requests. Allowed values are &#34;Exact&#34; or &#34;Equivalent&#34;.
         * 
         * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
         * 
         * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and &#34;rules&#34; only included `apiGroups:[&#34;apps&#34;], apiVersions:[&#34;v1&#34;], resources: [&#34;deployments&#34;]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
         * 
         * Defaults to &#34;Exact&#34;
         * 
         * @return builder
         * 
         */
        public Builder matchPolicy(String matchPolicy) {
            return matchPolicy(Output.of(matchPolicy));
        }

        /**
         * @param name The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where &#34;imagepolicy&#34; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where &#34;imagepolicy&#34; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceSelector NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
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
         * @return builder
         * 
         */
        public Builder namespaceSelector(@Nullable Output<LabelSelectorArgs> namespaceSelector) {
            $.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * @param namespaceSelector NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
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
         * @return builder
         * 
         */
        public Builder namespaceSelector(LabelSelectorArgs namespaceSelector) {
            return namespaceSelector(Output.of(namespaceSelector));
        }

        /**
         * @param objectSelector ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
         * 
         * @return builder
         * 
         */
        public Builder objectSelector(@Nullable Output<LabelSelectorArgs> objectSelector) {
            $.objectSelector = objectSelector;
            return this;
        }

        /**
         * @param objectSelector ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
         * 
         * @return builder
         * 
         */
        public Builder objectSelector(LabelSelectorArgs objectSelector) {
            return objectSelector(Output.of(objectSelector));
        }

        /**
         * @param reinvocationPolicy reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are &#34;Never&#34; and &#34;IfNeeded&#34;.
         * 
         * Never: the webhook will not be called more than once in a single admission evaluation.
         * 
         * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
         * 
         * Defaults to &#34;Never&#34;.
         * 
         * @return builder
         * 
         */
        public Builder reinvocationPolicy(@Nullable Output<String> reinvocationPolicy) {
            $.reinvocationPolicy = reinvocationPolicy;
            return this;
        }

        /**
         * @param reinvocationPolicy reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are &#34;Never&#34; and &#34;IfNeeded&#34;.
         * 
         * Never: the webhook will not be called more than once in a single admission evaluation.
         * 
         * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
         * 
         * Defaults to &#34;Never&#34;.
         * 
         * @return builder
         * 
         */
        public Builder reinvocationPolicy(String reinvocationPolicy) {
            return reinvocationPolicy(Output.of(reinvocationPolicy));
        }

        /**
         * @param rules Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RuleWithOperationsArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RuleWithOperationsArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
         * 
         * @return builder
         * 
         */
        public Builder rules(RuleWithOperationsArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param sideEffects SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
         * 
         * @return builder
         * 
         */
        public Builder sideEffects(@Nullable Output<String> sideEffects) {
            $.sideEffects = sideEffects;
            return this;
        }

        /**
         * @param sideEffects SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
         * 
         * @return builder
         * 
         */
        public Builder sideEffects(String sideEffects) {
            return sideEffects(Output.of(sideEffects));
        }

        /**
         * @param timeoutSeconds TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public MutatingWebhookArgs build() {
            if ($.clientConfig == null) {
                throw new MissingRequiredPropertyException("MutatingWebhookArgs", "clientConfig");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("MutatingWebhookArgs", "name");
            }
            return $;
        }
    }

}
