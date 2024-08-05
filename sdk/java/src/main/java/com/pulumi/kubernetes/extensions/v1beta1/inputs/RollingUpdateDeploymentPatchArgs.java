// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Spec to control the desired behavior of rolling update.
 * 
 */
public final class RollingUpdateDeploymentPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RollingUpdateDeploymentPatchArgs Empty = new RollingUpdateDeploymentPatchArgs();

    /**
     * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     * 
     */
    @Import(name="maxSurge")
    private @Nullable Output<Either<Integer,String>> maxSurge;

    /**
     * @return The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     * 
     */
    public Optional<Output<Either<Integer,String>>> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }

    /**
     * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     * 
     */
    @Import(name="maxUnavailable")
    private @Nullable Output<Either<Integer,String>> maxUnavailable;

    /**
     * @return The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     * 
     */
    public Optional<Output<Either<Integer,String>>> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    private RollingUpdateDeploymentPatchArgs() {}

    private RollingUpdateDeploymentPatchArgs(RollingUpdateDeploymentPatchArgs $) {
        this.maxSurge = $.maxSurge;
        this.maxUnavailable = $.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RollingUpdateDeploymentPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RollingUpdateDeploymentPatchArgs $;

        public Builder() {
            $ = new RollingUpdateDeploymentPatchArgs();
        }

        public Builder(RollingUpdateDeploymentPatchArgs defaults) {
            $ = new RollingUpdateDeploymentPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxSurge The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(@Nullable Output<Either<Integer,String>> maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        /**
         * @param maxSurge The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(Either<Integer,String> maxSurge) {
            return maxSurge(Output.of(maxSurge));
        }

        /**
         * @param maxSurge The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(Integer maxSurge) {
            return maxSurge(Either.ofLeft(maxSurge));
        }

        /**
         * @param maxSurge The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(String maxSurge) {
            return maxSurge(Either.ofRight(maxSurge));
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(@Nullable Output<Either<Integer,String>> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Either<Integer,String> maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Integer maxUnavailable) {
            return maxUnavailable(Either.ofLeft(maxUnavailable));
        }

        /**
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(String maxUnavailable) {
            return maxUnavailable(Either.ofRight(maxUnavailable));
        }

        public RollingUpdateDeploymentPatchArgs build() {
            return $;
        }
    }

}
