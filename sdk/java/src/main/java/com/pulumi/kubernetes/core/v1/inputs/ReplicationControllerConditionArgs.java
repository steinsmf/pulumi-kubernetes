// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ReplicationControllerCondition describes the state of a replication controller at a certain point.
 * 
 */
public final class ReplicationControllerConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationControllerConditionArgs Empty = new ReplicationControllerConditionArgs();

    /**
     * The last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    /**
     * @return The last time the condition transitioned from one status to another.
     * 
     */
    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * A human readable message indicating details about the transition.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A human readable message indicating details about the transition.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The reason for the condition&#39;s last transition.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return The reason for the condition&#39;s last transition.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * Type of replication controller condition.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of replication controller condition.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ReplicationControllerConditionArgs() {}

    private ReplicationControllerConditionArgs(ReplicationControllerConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationControllerConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationControllerConditionArgs $;

        public Builder() {
            $ = new ReplicationControllerConditionArgs();
        }

        public Builder(ReplicationControllerConditionArgs defaults) {
            $ = new ReplicationControllerConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastTransitionTime The last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param lastTransitionTime The last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        /**
         * @param message A human readable message indicating details about the transition.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A human readable message indicating details about the transition.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason The reason for the condition&#39;s last transition.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason The reason for the condition&#39;s last transition.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param status Status of the condition, one of True, False, Unknown.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the condition, one of True, False, Unknown.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type Type of replication controller condition.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of replication controller condition.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ReplicationControllerConditionArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}