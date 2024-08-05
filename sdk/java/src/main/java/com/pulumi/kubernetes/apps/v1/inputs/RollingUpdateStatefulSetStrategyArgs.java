// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 * 
 */
public final class RollingUpdateStatefulSetStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RollingUpdateStatefulSetStrategyArgs Empty = new RollingUpdateStatefulSetStrategyArgs();

    /**
     * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
     * 
     */
    @Import(name="maxUnavailable")
    private @Nullable Output<Either<Integer,String>> maxUnavailable;

    /**
     * @return The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
     * 
     */
    public Optional<Output<Either<Integer,String>>> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned for updates. During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.
     * 
     */
    @Import(name="partition")
    private @Nullable Output<Integer> partition;

    /**
     * @return Partition indicates the ordinal at which the StatefulSet should be partitioned for updates. During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.
     * 
     */
    public Optional<Output<Integer>> partition() {
        return Optional.ofNullable(this.partition);
    }

    private RollingUpdateStatefulSetStrategyArgs() {}

    private RollingUpdateStatefulSetStrategyArgs(RollingUpdateStatefulSetStrategyArgs $) {
        this.maxUnavailable = $.maxUnavailable;
        this.partition = $.partition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RollingUpdateStatefulSetStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RollingUpdateStatefulSetStrategyArgs $;

        public Builder() {
            $ = new RollingUpdateStatefulSetStrategyArgs();
        }

        public Builder(RollingUpdateStatefulSetStrategyArgs defaults) {
            $ = new RollingUpdateStatefulSetStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(@Nullable Output<Either<Integer,String>> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Either<Integer,String> maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Integer maxUnavailable) {
            return maxUnavailable(Either.ofLeft(maxUnavailable));
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(String maxUnavailable) {
            return maxUnavailable(Either.ofRight(maxUnavailable));
        }

        /**
         * @param partition Partition indicates the ordinal at which the StatefulSet should be partitioned for updates. During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.
         * 
         * @return builder
         * 
         */
        public Builder partition(@Nullable Output<Integer> partition) {
            $.partition = partition;
            return this;
        }

        /**
         * @param partition Partition indicates the ordinal at which the StatefulSet should be partitioned for updates. During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.
         * 
         * @return builder
         * 
         */
        public Builder partition(Integer partition) {
            return partition(Output.of(partition));
        }

        public RollingUpdateStatefulSetStrategyArgs build() {
            return $;
        }
    }

}
