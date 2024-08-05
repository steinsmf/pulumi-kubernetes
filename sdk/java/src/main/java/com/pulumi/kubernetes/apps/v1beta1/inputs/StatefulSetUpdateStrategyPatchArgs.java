// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps.v1beta1.inputs.RollingUpdateStatefulSetStrategyPatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 * 
 */
public final class StatefulSetUpdateStrategyPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetUpdateStrategyPatchArgs Empty = new StatefulSetUpdateStrategyPatchArgs();

    /**
     * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    @Import(name="rollingUpdate")
    private @Nullable Output<RollingUpdateStatefulSetStrategyPatchArgs> rollingUpdate;

    /**
     * @return RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    public Optional<Output<RollingUpdateStatefulSetStrategyPatchArgs>> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }

    /**
     * Type indicates the type of the StatefulSetUpdateStrategy.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type indicates the type of the StatefulSetUpdateStrategy.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private StatefulSetUpdateStrategyPatchArgs() {}

    private StatefulSetUpdateStrategyPatchArgs(StatefulSetUpdateStrategyPatchArgs $) {
        this.rollingUpdate = $.rollingUpdate;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetUpdateStrategyPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetUpdateStrategyPatchArgs $;

        public Builder() {
            $ = new StatefulSetUpdateStrategyPatchArgs();
        }

        public Builder(StatefulSetUpdateStrategyPatchArgs defaults) {
            $ = new StatefulSetUpdateStrategyPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rollingUpdate RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(@Nullable Output<RollingUpdateStatefulSetStrategyPatchArgs> rollingUpdate) {
            $.rollingUpdate = rollingUpdate;
            return this;
        }

        /**
         * @param rollingUpdate RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(RollingUpdateStatefulSetStrategyPatchArgs rollingUpdate) {
            return rollingUpdate(Output.of(rollingUpdate));
        }

        /**
         * @param type Type indicates the type of the StatefulSetUpdateStrategy.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type indicates the type of the StatefulSetUpdateStrategy.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StatefulSetUpdateStrategyPatchArgs build() {
            return $;
        }
    }

}
