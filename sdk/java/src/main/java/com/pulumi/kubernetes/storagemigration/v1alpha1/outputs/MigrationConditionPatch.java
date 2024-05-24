// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storagemigration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrationConditionPatch {
    /**
     * @return The last time this condition was updated.
     * 
     */
    private @Nullable String lastUpdateTime;
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
    private @Nullable String status;
    /**
     * @return Type of the condition.
     * 
     */
    private @Nullable String type;

    private MigrationConditionPatch() {}
    /**
     * @return The last time this condition was updated.
     * 
     */
    public Optional<String> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
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
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Type of the condition.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationConditionPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lastUpdateTime;
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable String status;
        private @Nullable String type;
        public Builder() {}
        public Builder(MigrationConditionPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder lastUpdateTime(@Nullable String lastUpdateTime) {

            this.lastUpdateTime = lastUpdateTime;
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
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public MigrationConditionPatch build() {
            final var _resultValue = new MigrationConditionPatch();
            _resultValue.lastUpdateTime = lastUpdateTime;
            _resultValue.message = message;
            _resultValue.reason = reason;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
