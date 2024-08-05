// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicaSetCondition {
    /**
     * @return The last time the condition transitioned from one status to another.
     * 
     */
    private @Nullable String lastTransitionTime;
    /**
     * @return A human readable message indicating details about the transition.
     * 
     */
    private @Nullable String message;
    /**
     * @return The reason for the condition&#39;s last transition.
     * 
     */
    private @Nullable String reason;
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    private String status;
    /**
     * @return Type of replica set condition.
     * 
     */
    private String type;

    private ReplicaSetCondition() {}
    /**
     * @return The last time the condition transitioned from one status to another.
     * 
     */
    public Optional<String> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * @return A human readable message indicating details about the transition.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return The reason for the condition&#39;s last transition.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Type of replica set condition.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;
        public Builder() {}
        public Builder(ReplicaSetCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {

            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {

            this.reason = reason;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("ReplicaSetCondition", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ReplicaSetCondition", "type");
            }
            this.type = type;
            return this;
        }
        public ReplicaSetCondition build() {
            final var _resultValue = new ReplicaSetCondition();
            _resultValue.lastTransitionTime = lastTransitionTime;
            _resultValue.message = message;
            _resultValue.reason = reason;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
