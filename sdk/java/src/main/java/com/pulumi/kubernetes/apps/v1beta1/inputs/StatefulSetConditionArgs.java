// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatefulSetCondition describes the state of a statefulset at a certain point.
 * 
 */
public final class StatefulSetConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetConditionArgs Empty = new StatefulSetConditionArgs();

    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    /**
     * @return Last time the condition transitioned from one status to another.
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
     * Type of statefulset condition.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of statefulset condition.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private StatefulSetConditionArgs() {}

    private StatefulSetConditionArgs(StatefulSetConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetConditionArgs $;

        public Builder() {
            $ = new StatefulSetConditionArgs();
        }

        public Builder(StatefulSetConditionArgs defaults) {
            $ = new StatefulSetConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastTransitionTime Last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param lastTransitionTime Last time the condition transitioned from one status to another.
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
         * @param type Type of statefulset condition.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of statefulset condition.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StatefulSetConditionArgs build() {
            if ($.status == null) {
                throw new MissingRequiredPropertyException("StatefulSetConditionArgs", "status");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("StatefulSetConditionArgs", "type");
            }
            return $;
        }
    }

}
