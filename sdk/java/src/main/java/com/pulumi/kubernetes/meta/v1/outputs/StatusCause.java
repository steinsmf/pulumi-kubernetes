// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatusCause {
    /**
     * @return The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   &#34;name&#34; - the field &#34;name&#34; on the current resource
     *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
     * 
     */
    private @Nullable String field;
    /**
     * @return A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    private @Nullable String message;
    /**
     * @return A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    private @Nullable String reason;

    private StatusCause() {}
    /**
     * @return The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   &#34;name&#34; - the field &#34;name&#34; on the current resource
     *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }
    /**
     * @return A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCause defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String field;
        private @Nullable String message;
        private @Nullable String reason;
        public Builder() {}
        public Builder(StatusCause defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        @CustomType.Setter
        public Builder field(@Nullable String field) {

            this.field = field;
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
        public StatusCause build() {
            final var _resultValue = new StatusCause();
            _resultValue.field = field;
            _resultValue.message = message;
            _resultValue.reason = reason;
            return _resultValue;
        }
    }
}
