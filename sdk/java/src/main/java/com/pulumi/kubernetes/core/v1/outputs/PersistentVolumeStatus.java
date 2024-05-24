// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PersistentVolumeStatus {
    /**
     * @return lastPhaseTransitionTime is the time the phase transitioned from one to another and automatically resets to current time everytime a volume phase transitions. This is a beta field and requires the PersistentVolumeLastPhaseTransitionTime feature to be enabled (enabled by default).
     * 
     */
    private @Nullable String lastPhaseTransitionTime;
    /**
     * @return message is a human-readable message indicating details about why the volume is in this state.
     * 
     */
    private @Nullable String message;
    /**
     * @return phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     */
    private @Nullable String phase;
    /**
     * @return reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    private @Nullable String reason;

    private PersistentVolumeStatus() {}
    /**
     * @return lastPhaseTransitionTime is the time the phase transitioned from one to another and automatically resets to current time everytime a volume phase transitions. This is a beta field and requires the PersistentVolumeLastPhaseTransitionTime feature to be enabled (enabled by default).
     * 
     */
    public Optional<String> lastPhaseTransitionTime() {
        return Optional.ofNullable(this.lastPhaseTransitionTime);
    }
    /**
     * @return message is a human-readable message indicating details about why the volume is in this state.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     */
    public Optional<String> phase() {
        return Optional.ofNullable(this.phase);
    }
    /**
     * @return reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lastPhaseTransitionTime;
        private @Nullable String message;
        private @Nullable String phase;
        private @Nullable String reason;
        public Builder() {}
        public Builder(PersistentVolumeStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPhaseTransitionTime = defaults.lastPhaseTransitionTime;
    	      this.message = defaults.message;
    	      this.phase = defaults.phase;
    	      this.reason = defaults.reason;
        }

        @CustomType.Setter
        public Builder lastPhaseTransitionTime(@Nullable String lastPhaseTransitionTime) {

            this.lastPhaseTransitionTime = lastPhaseTransitionTime;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder phase(@Nullable String phase) {

            this.phase = phase;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {

            this.reason = reason;
            return this;
        }
        public PersistentVolumeStatus build() {
            final var _resultValue = new PersistentVolumeStatus();
            _resultValue.lastPhaseTransitionTime = lastPhaseTransitionTime;
            _resultValue.message = message;
            _resultValue.phase = phase;
            _resultValue.reason = reason;
            return _resultValue;
        }
    }
}
