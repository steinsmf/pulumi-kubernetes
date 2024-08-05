// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 * 
 */
public final class ReplicaSetSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicaSetSpecArgs Empty = new ReplicaSetSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @Import(name="minReadySeconds")
    private @Nullable Output<Integer> minReadySeconds;

    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Optional<Output<Integer>> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }

    /**
     * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    /**
     * @return Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector", required=true)
    private Output<LabelSelectorArgs> selector;

    /**
     * @return Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Output<LabelSelectorArgs> selector() {
        return this.selector;
    }

    /**
     * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    @Import(name="template")
    private @Nullable Output<PodTemplateSpecArgs> template;

    /**
     * @return Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    public Optional<Output<PodTemplateSpecArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    private ReplicaSetSpecArgs() {}

    private ReplicaSetSpecArgs(ReplicaSetSpecArgs $) {
        this.minReadySeconds = $.minReadySeconds;
        this.replicas = $.replicas;
        this.selector = $.selector;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicaSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicaSetSpecArgs $;

        public Builder() {
            $ = new ReplicaSetSpecArgs();
        }

        public Builder(ReplicaSetSpecArgs defaults) {
            $ = new ReplicaSetSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            $.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(Integer minReadySeconds) {
            return minReadySeconds(Output.of(minReadySeconds));
        }

        /**
         * @param replicas Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
         * 
         * @return builder
         * 
         */
        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param selector Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param template Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<PodTemplateSpecArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
         * 
         * @return builder
         * 
         */
        public Builder template(PodTemplateSpecArgs template) {
            return template(Output.of(template));
        }

        public ReplicaSetSpecArgs build() {
            if ($.selector == null) {
                throw new MissingRequiredPropertyException("ReplicaSetSpecArgs", "selector");
            }
            return $;
        }
    }

}
