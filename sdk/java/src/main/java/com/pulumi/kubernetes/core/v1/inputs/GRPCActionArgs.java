// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GRPCActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GRPCActionArgs Empty = new GRPCActionArgs();

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private GRPCActionArgs() {}

    private GRPCActionArgs(GRPCActionArgs $) {
        this.port = $.port;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GRPCActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GRPCActionArgs $;

        public Builder() {
            $ = new GRPCActionArgs();
        }

        public Builder(GRPCActionArgs defaults) {
            $ = new GRPCActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port Port number of the gRPC service. Number must be in the range 1 to 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number of the gRPC service. Number must be in the range 1 to 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param service Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
         * 
         * If this is not specified, the default behavior is defined by gRPC.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
         * 
         * If this is not specified, the default behavior is defined by gRPC.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public GRPCActionArgs build() {
            if ($.port == null) {
                throw new MissingRequiredPropertyException("GRPCActionArgs", "port");
            }
            return $;
        }
    }

}
