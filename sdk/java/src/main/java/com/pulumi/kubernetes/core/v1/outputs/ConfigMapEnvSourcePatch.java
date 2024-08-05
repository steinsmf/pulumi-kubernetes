// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigMapEnvSourcePatch {
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private @Nullable String name;
    /**
     * @return Specify whether the ConfigMap must be defined
     * 
     */
    private @Nullable Boolean optional;

    private ConfigMapEnvSourcePatch() {}
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specify whether the ConfigMap must be defined
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapEnvSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable Boolean optional;
        public Builder() {}
        public Builder(ConfigMapEnvSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        public ConfigMapEnvSourcePatch build() {
            final var _resultValue = new ConfigMapEnvSourcePatch();
            _resultValue.name = name;
            _resultValue.optional = optional;
            return _resultValue;
        }
    }
}
