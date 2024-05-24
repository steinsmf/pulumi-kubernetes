// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storagemigration.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the state of a migration at a certain point.
 * 
 */
public final class MigrationConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrationConditionArgs Empty = new MigrationConditionArgs();

    /**
     * The last time this condition was updated.
     * 
     */
    @Import(name="lastUpdateTime")
    private @Nullable Output<String> lastUpdateTime;

    /**
     * @return The last time this condition was updated.
     * 
     */
    public Optional<Output<String>> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
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
     * Type of the condition.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the condition.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private MigrationConditionArgs() {}

    private MigrationConditionArgs(MigrationConditionArgs $) {
        this.lastUpdateTime = $.lastUpdateTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationConditionArgs $;

        public Builder() {
            $ = new MigrationConditionArgs();
        }

        public Builder(MigrationConditionArgs defaults) {
            $ = new MigrationConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastUpdateTime The last time this condition was updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(@Nullable Output<String> lastUpdateTime) {
            $.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * @param lastUpdateTime The last time this condition was updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            return lastUpdateTime(Output.of(lastUpdateTime));
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
         * @param type Type of the condition.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the condition.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MigrationConditionArgs build() {
            if ($.status == null) {
                throw new MissingRequiredPropertyException("MigrationConditionArgs", "status");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("MigrationConditionArgs", "type");
            }
            return $;
        }
    }

}
