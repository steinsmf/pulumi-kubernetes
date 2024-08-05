// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GRPCAction {
    /**
     * @return Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    private Integer port;
    /**
     * @return Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    private @Nullable String service;

    private GRPCAction() {}
    /**
     * @return Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GRPCAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private @Nullable String service;
        public Builder() {}
        public Builder(GRPCAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GRPCAction", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder service(@Nullable String service) {

            this.service = service;
            return this;
        }
        public GRPCAction build() {
            final var _resultValue = new GRPCAction();
            _resultValue.port = port;
            _resultValue.service = service;
            return _resultValue;
        }
    }
}
