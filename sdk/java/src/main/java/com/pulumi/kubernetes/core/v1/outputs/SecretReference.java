// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretReference {
    /**
     * @return name is unique within a namespace to reference a secret resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return namespace defines the space within which the secret name must be unique.
     * 
     */
    private @Nullable String namespace;

    private SecretReference() {}
    /**
     * @return name is unique within a namespace to reference a secret resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return namespace defines the space within which the secret name must be unique.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(SecretReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        public SecretReference build() {
            final var _resultValue = new SecretReference();
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
