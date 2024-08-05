// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * FlowSchemaCondition describes conditions for a FlowSchema.
 * 
 */
public final class FlowSchemaConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSchemaConditionArgs Empty = new FlowSchemaConditionArgs();

    /**
     * `lastTransitionTime` is the last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    /**
     * @return `lastTransitionTime` is the last time the condition transitioned from one status to another.
     * 
     */
    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * `message` is a human-readable message indicating details about last transition.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return `message` is a human-readable message indicating details about last transition.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * `reason` is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return `reason` is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * `status` is the status of the condition. Can be True, False, Unknown. Required.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return `status` is the status of the condition. Can be True, False, Unknown. Required.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * `type` is the type of the condition. Required.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return `type` is the type of the condition. Required.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private FlowSchemaConditionArgs() {}

    private FlowSchemaConditionArgs(FlowSchemaConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSchemaConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSchemaConditionArgs $;

        public Builder() {
            $ = new FlowSchemaConditionArgs();
        }

        public Builder(FlowSchemaConditionArgs defaults) {
            $ = new FlowSchemaConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastTransitionTime `lastTransitionTime` is the last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param lastTransitionTime `lastTransitionTime` is the last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        /**
         * @param message `message` is a human-readable message indicating details about last transition.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message `message` is a human-readable message indicating details about last transition.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason `reason` is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason `reason` is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param status `status` is the status of the condition. Can be True, False, Unknown. Required.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status `status` is the status of the condition. Can be True, False, Unknown. Required.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type `type` is the type of the condition. Required.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type `type` is the type of the condition. Required.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FlowSchemaConditionArgs build() {
            return $;
        }
    }

}
