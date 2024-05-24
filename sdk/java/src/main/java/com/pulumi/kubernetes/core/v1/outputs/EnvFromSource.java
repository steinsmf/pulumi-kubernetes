// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ConfigMapEnvSource;
import com.pulumi.kubernetes.core.v1.outputs.SecretEnvSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvFromSource {
    /**
     * @return The ConfigMap to select from
     * 
     */
    private @Nullable ConfigMapEnvSource configMapRef;
    /**
     * @return An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return The Secret to select from
     * 
     */
    private @Nullable SecretEnvSource secretRef;

    private EnvFromSource() {}
    /**
     * @return The ConfigMap to select from
     * 
     */
    public Optional<ConfigMapEnvSource> configMapRef() {
        return Optional.ofNullable(this.configMapRef);
    }
    /**
     * @return An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The Secret to select from
     * 
     */
    public Optional<SecretEnvSource> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvFromSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConfigMapEnvSource configMapRef;
        private @Nullable String prefix;
        private @Nullable SecretEnvSource secretRef;
        public Builder() {}
        public Builder(EnvFromSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        @CustomType.Setter
        public Builder configMapRef(@Nullable ConfigMapEnvSource configMapRef) {

            this.configMapRef = configMapRef;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder secretRef(@Nullable SecretEnvSource secretRef) {

            this.secretRef = secretRef;
            return this;
        }
        public EnvFromSource build() {
            final var _resultValue = new EnvFromSource();
            _resultValue.configMapRef = configMapRef;
            _resultValue.prefix = prefix;
            _resultValue.secretRef = secretRef;
            return _resultValue;
        }
    }
}
