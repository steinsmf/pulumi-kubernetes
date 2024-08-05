// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.auditregistration.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * WebhookThrottleConfig holds the configuration for throttling events
 * 
 */
public final class WebhookThrottleConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookThrottleConfigArgs Empty = new WebhookThrottleConfigArgs();

    /**
     * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
     * 
     */
    @Import(name="burst")
    private @Nullable Output<Integer> burst;

    /**
     * @return ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
     * 
     */
    public Optional<Output<Integer>> burst() {
        return Optional.ofNullable(this.burst);
    }

    /**
     * ThrottleQPS maximum number of batches per second default 10 QPS
     * 
     */
    @Import(name="qps")
    private @Nullable Output<Integer> qps;

    /**
     * @return ThrottleQPS maximum number of batches per second default 10 QPS
     * 
     */
    public Optional<Output<Integer>> qps() {
        return Optional.ofNullable(this.qps);
    }

    private WebhookThrottleConfigArgs() {}

    private WebhookThrottleConfigArgs(WebhookThrottleConfigArgs $) {
        this.burst = $.burst;
        this.qps = $.qps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookThrottleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookThrottleConfigArgs $;

        public Builder() {
            $ = new WebhookThrottleConfigArgs();
        }

        public Builder(WebhookThrottleConfigArgs defaults) {
            $ = new WebhookThrottleConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param burst ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
         * 
         * @return builder
         * 
         */
        public Builder burst(@Nullable Output<Integer> burst) {
            $.burst = burst;
            return this;
        }

        /**
         * @param burst ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
         * 
         * @return builder
         * 
         */
        public Builder burst(Integer burst) {
            return burst(Output.of(burst));
        }

        /**
         * @param qps ThrottleQPS maximum number of batches per second default 10 QPS
         * 
         * @return builder
         * 
         */
        public Builder qps(@Nullable Output<Integer> qps) {
            $.qps = qps;
            return this;
        }

        /**
         * @param qps ThrottleQPS maximum number of batches per second default 10 QPS
         * 
         * @return builder
         * 
         */
        public Builder qps(Integer qps) {
            return qps(Output.of(qps));
        }

        public WebhookThrottleConfigArgs build() {
            return $;
        }
    }

}
