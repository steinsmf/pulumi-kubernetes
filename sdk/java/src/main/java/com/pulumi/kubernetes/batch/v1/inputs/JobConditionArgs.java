// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * JobCondition describes current state of a job.
 * 
 */
public final class JobConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobConditionArgs Empty = new JobConditionArgs();

    /**
     * Last time the condition was checked.
     * 
     */
    @Import(name="lastProbeTime")
    private @Nullable Output<String> lastProbeTime;

    /**
     * @return Last time the condition was checked.
     * 
     */
    public Optional<Output<String>> lastProbeTime() {
        return Optional.ofNullable(this.lastProbeTime);
    }

    /**
     * Last time the condition transit from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    /**
     * @return Last time the condition transit from one status to another.
     * 
     */
    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * Human readable message indicating details about last transition.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Human readable message indicating details about last transition.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * (brief) reason for the condition&#39;s last transition.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return (brief) reason for the condition&#39;s last transition.
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
     * Type of job condition, Complete or Failed.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of job condition, Complete or Failed.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private JobConditionArgs() {}

    private JobConditionArgs(JobConditionArgs $) {
        this.lastProbeTime = $.lastProbeTime;
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConditionArgs $;

        public Builder() {
            $ = new JobConditionArgs();
        }

        public Builder(JobConditionArgs defaults) {
            $ = new JobConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastProbeTime Last time the condition was checked.
         * 
         * @return builder
         * 
         */
        public Builder lastProbeTime(@Nullable Output<String> lastProbeTime) {
            $.lastProbeTime = lastProbeTime;
            return this;
        }

        /**
         * @param lastProbeTime Last time the condition was checked.
         * 
         * @return builder
         * 
         */
        public Builder lastProbeTime(String lastProbeTime) {
            return lastProbeTime(Output.of(lastProbeTime));
        }

        /**
         * @param lastTransitionTime Last time the condition transit from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param lastTransitionTime Last time the condition transit from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        /**
         * @param message Human readable message indicating details about last transition.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Human readable message indicating details about last transition.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason (brief) reason for the condition&#39;s last transition.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason (brief) reason for the condition&#39;s last transition.
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
         * @param type Type of job condition, Complete or Failed.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of job condition, Complete or Failed.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public JobConditionArgs build() {
            if ($.status == null) {
                throw new MissingRequiredPropertyException("JobConditionArgs", "status");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("JobConditionArgs", "type");
            }
            return $;
        }
    }

}
