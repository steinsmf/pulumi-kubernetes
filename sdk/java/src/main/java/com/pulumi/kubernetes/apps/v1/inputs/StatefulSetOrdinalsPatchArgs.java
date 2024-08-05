// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatefulSetOrdinals describes the policy used for replica ordinal assignment in this StatefulSet.
 * 
 */
public final class StatefulSetOrdinalsPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetOrdinalsPatchArgs Empty = new StatefulSetOrdinalsPatchArgs();

    /**
     * start is the number representing the first replica&#39;s index. It may be used to number replicas from an alternate index (eg: 1-indexed) over the default 0-indexed names, or to orchestrate progressive movement of replicas from one StatefulSet to another. If set, replica indices will be in the range:
     *   [.spec.ordinals.start, .spec.ordinals.start + .spec.replicas).
     * If unset, defaults to 0. Replica indices will be in the range:
     *   [0, .spec.replicas).
     * 
     */
    @Import(name="start")
    private @Nullable Output<Integer> start;

    /**
     * @return start is the number representing the first replica&#39;s index. It may be used to number replicas from an alternate index (eg: 1-indexed) over the default 0-indexed names, or to orchestrate progressive movement of replicas from one StatefulSet to another. If set, replica indices will be in the range:
     *   [.spec.ordinals.start, .spec.ordinals.start + .spec.replicas).
     * If unset, defaults to 0. Replica indices will be in the range:
     *   [0, .spec.replicas).
     * 
     */
    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    private StatefulSetOrdinalsPatchArgs() {}

    private StatefulSetOrdinalsPatchArgs(StatefulSetOrdinalsPatchArgs $) {
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetOrdinalsPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetOrdinalsPatchArgs $;

        public Builder() {
            $ = new StatefulSetOrdinalsPatchArgs();
        }

        public Builder(StatefulSetOrdinalsPatchArgs defaults) {
            $ = new StatefulSetOrdinalsPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param start start is the number representing the first replica&#39;s index. It may be used to number replicas from an alternate index (eg: 1-indexed) over the default 0-indexed names, or to orchestrate progressive movement of replicas from one StatefulSet to another. If set, replica indices will be in the range:
         *   [.spec.ordinals.start, .spec.ordinals.start + .spec.replicas).
         * If unset, defaults to 0. Replica indices will be in the range:
         *   [0, .spec.replicas).
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start start is the number representing the first replica&#39;s index. It may be used to number replicas from an alternate index (eg: 1-indexed) over the default 0-indexed names, or to orchestrate progressive movement of replicas from one StatefulSet to another. If set, replica indices will be in the range:
         *   [.spec.ordinals.start, .spec.ordinals.start + .spec.replicas).
         * If unset, defaults to 0. Replica indices will be in the range:
         *   [0, .spec.replicas).
         * 
         * @return builder
         * 
         */
        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public StatefulSetOrdinalsPatchArgs build() {
            return $;
        }
    }

}
