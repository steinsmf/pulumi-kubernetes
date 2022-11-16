// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps.v1.inputs.StatefulSetOrdinalsPatchArgs;
import com.pulumi.kubernetes.apps.v1.inputs.StatefulSetPersistentVolumeClaimRetentionPolicyPatchArgs;
import com.pulumi.kubernetes.apps.v1.inputs.StatefulSetUpdateStrategyPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecPatchArgs;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorPatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 * 
 */
public final class StatefulSetSpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetSpecPatchArgs Empty = new StatefulSetSpecPatchArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @Import(name="minReadySeconds")
    private @Nullable Output<Integer> minReadySeconds;

    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Optional<Output<Integer>> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }

    /**
     * ordinals controls the numbering of replica indices in a StatefulSet. The default ordinals behavior assigns a &#34;0&#34; index to the first replica and increments the index by one for each additional replica requested. Using the ordinals field requires the StatefulSetStartOrdinal feature gate to be enabled, which is alpha.
     * 
     */
    @Import(name="ordinals")
    private @Nullable Output<StatefulSetOrdinalsPatchArgs> ordinals;

    /**
     * @return ordinals controls the numbering of replica indices in a StatefulSet. The default ordinals behavior assigns a &#34;0&#34; index to the first replica and increments the index by one for each additional replica requested. Using the ordinals field requires the StatefulSetStartOrdinal feature gate to be enabled, which is alpha.
     * 
     */
    public Optional<Output<StatefulSetOrdinalsPatchArgs>> ordinals() {
        return Optional.ofNullable(this.ordinals);
    }

    /**
     * persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
     * 
     */
    @Import(name="persistentVolumeClaimRetentionPolicy")
    private @Nullable Output<StatefulSetPersistentVolumeClaimRetentionPolicyPatchArgs> persistentVolumeClaimRetentionPolicy;

    /**
     * @return persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
     * 
     */
    public Optional<Output<StatefulSetPersistentVolumeClaimRetentionPolicyPatchArgs>> persistentVolumeClaimRetentionPolicy() {
        return Optional.ofNullable(this.persistentVolumeClaimRetentionPolicy);
    }

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     */
    @Import(name="podManagementPolicy")
    private @Nullable Output<String> podManagementPolicy;

    /**
     * @return podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     */
    public Optional<Output<String>> podManagementPolicy() {
        return Optional.ofNullable(this.podManagementPolicy);
    }

    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    /**
     * @return replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
    private @Nullable Output<Integer> revisionHistoryLimit;

    /**
     * @return revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    public Optional<Output<Integer>> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }

    /**
     * selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorPatchArgs> selector;

    /**
     * @return selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Optional<Output<LabelSelectorPatchArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. Each pod will be named with the format &lt;statefulsetname&gt;-&lt;podindex&gt;. For example, a pod in a StatefulSet named &#34;web&#34; with index number &#34;3&#34; would be named &#34;web-3&#34;.
     * 
     */
    @Import(name="template")
    private @Nullable Output<PodTemplateSpecPatchArgs> template;

    /**
     * @return template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. Each pod will be named with the format &lt;statefulsetname&gt;-&lt;podindex&gt;. For example, a pod in a StatefulSet named &#34;web&#34; with index number &#34;3&#34; would be named &#34;web-3&#34;.
     * 
     */
    public Optional<Output<PodTemplateSpecPatchArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    @Import(name="updateStrategy")
    private @Nullable Output<StatefulSetUpdateStrategyPatchArgs> updateStrategy;

    /**
     * @return updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    public Optional<Output<StatefulSetUpdateStrategyPatchArgs>> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    @Import(name="volumeClaimTemplates")
    private @Nullable Output<List<PersistentVolumeClaimPatchArgs>> volumeClaimTemplates;

    /**
     * @return volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    public Optional<Output<List<PersistentVolumeClaimPatchArgs>>> volumeClaimTemplates() {
        return Optional.ofNullable(this.volumeClaimTemplates);
    }

    private StatefulSetSpecPatchArgs() {}

    private StatefulSetSpecPatchArgs(StatefulSetSpecPatchArgs $) {
        this.minReadySeconds = $.minReadySeconds;
        this.ordinals = $.ordinals;
        this.persistentVolumeClaimRetentionPolicy = $.persistentVolumeClaimRetentionPolicy;
        this.podManagementPolicy = $.podManagementPolicy;
        this.replicas = $.replicas;
        this.revisionHistoryLimit = $.revisionHistoryLimit;
        this.selector = $.selector;
        this.serviceName = $.serviceName;
        this.template = $.template;
        this.updateStrategy = $.updateStrategy;
        this.volumeClaimTemplates = $.volumeClaimTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetSpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetSpecPatchArgs $;

        public Builder() {
            $ = new StatefulSetSpecPatchArgs();
        }

        public Builder(StatefulSetSpecPatchArgs defaults) {
            $ = new StatefulSetSpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            $.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(Integer minReadySeconds) {
            return minReadySeconds(Output.of(minReadySeconds));
        }

        /**
         * @param ordinals ordinals controls the numbering of replica indices in a StatefulSet. The default ordinals behavior assigns a &#34;0&#34; index to the first replica and increments the index by one for each additional replica requested. Using the ordinals field requires the StatefulSetStartOrdinal feature gate to be enabled, which is alpha.
         * 
         * @return builder
         * 
         */
        public Builder ordinals(@Nullable Output<StatefulSetOrdinalsPatchArgs> ordinals) {
            $.ordinals = ordinals;
            return this;
        }

        /**
         * @param ordinals ordinals controls the numbering of replica indices in a StatefulSet. The default ordinals behavior assigns a &#34;0&#34; index to the first replica and increments the index by one for each additional replica requested. Using the ordinals field requires the StatefulSetStartOrdinal feature gate to be enabled, which is alpha.
         * 
         * @return builder
         * 
         */
        public Builder ordinals(StatefulSetOrdinalsPatchArgs ordinals) {
            return ordinals(Output.of(ordinals));
        }

        /**
         * @param persistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
         * 
         * @return builder
         * 
         */
        public Builder persistentVolumeClaimRetentionPolicy(@Nullable Output<StatefulSetPersistentVolumeClaimRetentionPolicyPatchArgs> persistentVolumeClaimRetentionPolicy) {
            $.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
            return this;
        }

        /**
         * @param persistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
         * 
         * @return builder
         * 
         */
        public Builder persistentVolumeClaimRetentionPolicy(StatefulSetPersistentVolumeClaimRetentionPolicyPatchArgs persistentVolumeClaimRetentionPolicy) {
            return persistentVolumeClaimRetentionPolicy(Output.of(persistentVolumeClaimRetentionPolicy));
        }

        /**
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * 
         * @return builder
         * 
         */
        public Builder podManagementPolicy(@Nullable Output<String> podManagementPolicy) {
            $.podManagementPolicy = podManagementPolicy;
            return this;
        }

        /**
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * 
         * @return builder
         * 
         */
        public Builder podManagementPolicy(String podManagementPolicy) {
            return podManagementPolicy(Output.of(podManagementPolicy));
        }

        /**
         * @param replicas replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            $.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            return revisionHistoryLimit(Output.of(revisionHistoryLimit));
        }

        /**
         * @param selector selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<LabelSelectorPatchArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorPatchArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. Each pod will be named with the format &lt;statefulsetname&gt;-&lt;podindex&gt;. For example, a pod in a StatefulSet named &#34;web&#34; with index number &#34;3&#34; would be named &#34;web-3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<PodTemplateSpecPatchArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. Each pod will be named with the format &lt;statefulsetname&gt;-&lt;podindex&gt;. For example, a pod in a StatefulSet named &#34;web&#34; with index number &#34;3&#34; would be named &#34;web-3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder template(PodTemplateSpecPatchArgs template) {
            return template(Output.of(template));
        }

        /**
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(@Nullable Output<StatefulSetUpdateStrategyPatchArgs> updateStrategy) {
            $.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(StatefulSetUpdateStrategyPatchArgs updateStrategy) {
            return updateStrategy(Output.of(updateStrategy));
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(@Nullable Output<List<PersistentVolumeClaimPatchArgs>> volumeClaimTemplates) {
            $.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(List<PersistentVolumeClaimPatchArgs> volumeClaimTemplates) {
            return volumeClaimTemplates(Output.of(volumeClaimTemplates));
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(PersistentVolumeClaimPatchArgs... volumeClaimTemplates) {
            return volumeClaimTemplates(List.of(volumeClaimTemplates));
        }

        public StatefulSetSpecPatchArgs build() {
            return $;
        }
    }

}
