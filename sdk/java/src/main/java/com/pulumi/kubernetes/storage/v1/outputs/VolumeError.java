// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeError {
    /**
     * @return message represents the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
     */
    private @Nullable String message;
    /**
     * @return time represents the time the error was encountered.
     * 
     */
    private @Nullable String time;

    private VolumeError() {}
    /**
     * @return message represents the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return time represents the time the error was encountered.
     * 
     */
    public Optional<String> time() {
        return Optional.ofNullable(this.time);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String message;
        private @Nullable String time;
        public Builder() {}
        public Builder(VolumeError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder time(@Nullable String time) {

            this.time = time;
            return this;
        }
        public VolumeError build() {
            final var _resultValue = new VolumeError();
            _resultValue.message = message;
            _resultValue.time = time;
            return _resultValue;
        }
    }
}
