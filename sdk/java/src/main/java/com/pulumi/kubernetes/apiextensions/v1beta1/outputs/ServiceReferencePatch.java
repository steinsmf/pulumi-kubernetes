// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceReferencePatch {
    /**
     * @return name is the name of the service. Required
     * 
     */
    private @Nullable String name;
    /**
     * @return namespace is the namespace of the service. Required
     * 
     */
    private @Nullable String namespace;
    /**
     * @return path is an optional URL path at which the webhook will be contacted.
     * 
     */
    private @Nullable String path;
    /**
     * @return port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
     * 
     */
    private @Nullable Integer port;

    private ServiceReferencePatch() {}
    /**
     * @return name is the name of the service. Required
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return namespace is the namespace of the service. Required
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return path is an optional URL path at which the webhook will be contacted.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceReferencePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable String path;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(ServiceReferencePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
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
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        public ServiceReferencePatch build() {
            final var _resultValue = new ServiceReferencePatch();
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.path = path;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
