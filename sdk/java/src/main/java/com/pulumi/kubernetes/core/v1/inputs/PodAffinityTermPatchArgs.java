// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorPatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key &lt;topologyKey&gt; matches that of any node on which a pod of the set of pods is running
 * 
 */
public final class PodAffinityTermPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodAffinityTermPatchArgs Empty = new PodAffinityTermPatchArgs();

    /**
     * A label query over a set of resources, in this case pods. If it&#39;s null, this PodAffinityTerm matches with no Pods.
     * 
     */
    @Import(name="labelSelector")
    private @Nullable Output<LabelSelectorPatchArgs> labelSelector;

    /**
     * @return A label query over a set of resources, in this case pods. If it&#39;s null, this PodAffinityTerm matches with no Pods.
     * 
     */
    public Optional<Output<LabelSelectorPatchArgs>> labelSelector() {
        return Optional.ofNullable(this.labelSelector);
    }

    /**
     * MatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key in (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both matchLabelKeys and labelSelector. Also, matchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
     * 
     */
    @Import(name="matchLabelKeys")
    private @Nullable Output<List<String>> matchLabelKeys;

    /**
     * @return MatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key in (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both matchLabelKeys and labelSelector. Also, matchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
     * 
     */
    public Optional<Output<List<String>>> matchLabelKeys() {
        return Optional.ofNullable(this.matchLabelKeys);
    }

    /**
     * MismatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key notin (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both mismatchLabelKeys and labelSelector. Also, mismatchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
     * 
     */
    @Import(name="mismatchLabelKeys")
    private @Nullable Output<List<String>> mismatchLabelKeys;

    /**
     * @return MismatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key notin (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both mismatchLabelKeys and labelSelector. Also, mismatchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
     * 
     */
    public Optional<Output<List<String>>> mismatchLabelKeys() {
        return Optional.ofNullable(this.mismatchLabelKeys);
    }

    /**
     * A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means &#34;this pod&#39;s namespace&#34;. An empty selector ({}) matches all namespaces.
     * 
     */
    @Import(name="namespaceSelector")
    private @Nullable Output<LabelSelectorPatchArgs> namespaceSelector;

    /**
     * @return A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means &#34;this pod&#39;s namespace&#34;. An empty selector ({}) matches all namespaces.
     * 
     */
    public Optional<Output<LabelSelectorPatchArgs>> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }

    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
     * 
     */
    @Import(name="namespaces")
    private @Nullable Output<List<String>> namespaces;

    /**
     * @return namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
     * 
     */
    public Optional<Output<List<String>>> namespaces() {
        return Optional.ofNullable(this.namespaces);
    }

    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * 
     */
    @Import(name="topologyKey")
    private @Nullable Output<String> topologyKey;

    /**
     * @return This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * 
     */
    public Optional<Output<String>> topologyKey() {
        return Optional.ofNullable(this.topologyKey);
    }

    private PodAffinityTermPatchArgs() {}

    private PodAffinityTermPatchArgs(PodAffinityTermPatchArgs $) {
        this.labelSelector = $.labelSelector;
        this.matchLabelKeys = $.matchLabelKeys;
        this.mismatchLabelKeys = $.mismatchLabelKeys;
        this.namespaceSelector = $.namespaceSelector;
        this.namespaces = $.namespaces;
        this.topologyKey = $.topologyKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodAffinityTermPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodAffinityTermPatchArgs $;

        public Builder() {
            $ = new PodAffinityTermPatchArgs();
        }

        public Builder(PodAffinityTermPatchArgs defaults) {
            $ = new PodAffinityTermPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labelSelector A label query over a set of resources, in this case pods. If it&#39;s null, this PodAffinityTerm matches with no Pods.
         * 
         * @return builder
         * 
         */
        public Builder labelSelector(@Nullable Output<LabelSelectorPatchArgs> labelSelector) {
            $.labelSelector = labelSelector;
            return this;
        }

        /**
         * @param labelSelector A label query over a set of resources, in this case pods. If it&#39;s null, this PodAffinityTerm matches with no Pods.
         * 
         * @return builder
         * 
         */
        public Builder labelSelector(LabelSelectorPatchArgs labelSelector) {
            return labelSelector(Output.of(labelSelector));
        }

        /**
         * @param matchLabelKeys MatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key in (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both matchLabelKeys and labelSelector. Also, matchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
         * 
         * @return builder
         * 
         */
        public Builder matchLabelKeys(@Nullable Output<List<String>> matchLabelKeys) {
            $.matchLabelKeys = matchLabelKeys;
            return this;
        }

        /**
         * @param matchLabelKeys MatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key in (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both matchLabelKeys and labelSelector. Also, matchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
         * 
         * @return builder
         * 
         */
        public Builder matchLabelKeys(List<String> matchLabelKeys) {
            return matchLabelKeys(Output.of(matchLabelKeys));
        }

        /**
         * @param matchLabelKeys MatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key in (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both matchLabelKeys and labelSelector. Also, matchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
         * 
         * @return builder
         * 
         */
        public Builder matchLabelKeys(String... matchLabelKeys) {
            return matchLabelKeys(List.of(matchLabelKeys));
        }

        /**
         * @param mismatchLabelKeys MismatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key notin (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both mismatchLabelKeys and labelSelector. Also, mismatchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
         * 
         * @return builder
         * 
         */
        public Builder mismatchLabelKeys(@Nullable Output<List<String>> mismatchLabelKeys) {
            $.mismatchLabelKeys = mismatchLabelKeys;
            return this;
        }

        /**
         * @param mismatchLabelKeys MismatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key notin (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both mismatchLabelKeys and labelSelector. Also, mismatchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
         * 
         * @return builder
         * 
         */
        public Builder mismatchLabelKeys(List<String> mismatchLabelKeys) {
            return mismatchLabelKeys(Output.of(mismatchLabelKeys));
        }

        /**
         * @param mismatchLabelKeys MismatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key notin (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both mismatchLabelKeys and labelSelector. Also, mismatchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
         * 
         * @return builder
         * 
         */
        public Builder mismatchLabelKeys(String... mismatchLabelKeys) {
            return mismatchLabelKeys(List.of(mismatchLabelKeys));
        }

        /**
         * @param namespaceSelector A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means &#34;this pod&#39;s namespace&#34;. An empty selector ({}) matches all namespaces.
         * 
         * @return builder
         * 
         */
        public Builder namespaceSelector(@Nullable Output<LabelSelectorPatchArgs> namespaceSelector) {
            $.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * @param namespaceSelector A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means &#34;this pod&#39;s namespace&#34;. An empty selector ({}) matches all namespaces.
         * 
         * @return builder
         * 
         */
        public Builder namespaceSelector(LabelSelectorPatchArgs namespaceSelector) {
            return namespaceSelector(Output.of(namespaceSelector));
        }

        /**
         * @param namespaces namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(@Nullable Output<List<String>> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        /**
         * @param namespaces namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(List<String> namespaces) {
            return namespaces(Output.of(namespaces));
        }

        /**
         * @param namespaces namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }

        /**
         * @param topologyKey This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder topologyKey(@Nullable Output<String> topologyKey) {
            $.topologyKey = topologyKey;
            return this;
        }

        /**
         * @param topologyKey This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder topologyKey(String topologyKey) {
            return topologyKey(Output.of(topologyKey));
        }

        public PodAffinityTermPatchArgs build() {
            return $;
        }
    }

}
