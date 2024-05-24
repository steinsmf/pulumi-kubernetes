// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NamespaceCondition {
    private @Nullable String lastTransitionTime;
    private @Nullable String message;
    private @Nullable String reason;
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    private String status;
    /**
     * @return Type of namespace controller condition.
     * 
     */
    private String type;

    private NamespaceCondition() {}
    public Optional<String> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
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
     * @return Type of namespace controller condition.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceCondition defaults) {
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
        public Builder(NamespaceCondition defaults) {
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
              throw new MissingRequiredPropertyException("NamespaceCondition", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("NamespaceCondition", "type");
            }
            this.type = type;
            return this;
        }
        public NamespaceCondition build() {
            final var _resultValue = new NamespaceCondition();
            _resultValue.lastTransitionTime = lastTransitionTime;
            _resultValue.message = message;
            _resultValue.reason = reason;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
