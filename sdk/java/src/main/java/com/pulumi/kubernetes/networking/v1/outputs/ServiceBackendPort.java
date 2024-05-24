// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceBackendPort {
    /**
     * @return name is the name of the port on the Service. This is a mutually exclusive setting with &#34;Number&#34;.
     * 
     */
    private @Nullable String name;
    /**
     * @return number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with &#34;Name&#34;.
     * 
     */
    private @Nullable Integer number;

    private ServiceBackendPort() {}
    /**
     * @return name is the name of the port on the Service. This is a mutually exclusive setting with &#34;Number&#34;.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with &#34;Name&#34;.
     * 
     */
    public Optional<Integer> number() {
        return Optional.ofNullable(this.number);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBackendPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable Integer number;
        public Builder() {}
        public Builder(ServiceBackendPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.number = defaults.number;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder number(@Nullable Integer number) {

            this.number = number;
            return this;
        }
        public ServiceBackendPort build() {
            final var _resultValue = new ServiceBackendPort();
            _resultValue.name = name;
            _resultValue.number = number;
            return _resultValue;
        }
    }
}
