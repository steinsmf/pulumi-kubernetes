// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NetworkPolicyPort describes a port to allow traffic on
 * 
 */
public final class NetworkPolicyPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPortArgs Empty = new NetworkPolicyPortArgs();

    /**
     * endPort indicates that the range of ports from port to endPort if set, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
     * 
     */
    @Import(name="endPort")
    private @Nullable Output<Integer> endPort;

    /**
     * @return endPort indicates that the range of ports from port to endPort if set, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
     * 
     */
    public Optional<Output<Integer>> endPort() {
        return Optional.ofNullable(this.endPort);
    }

    /**
     * port represents the port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Either<Integer,String>> port;

    /**
     * @return port represents the port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    public Optional<Output<Either<Integer,String>>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * protocol represents the protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return protocol represents the protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private NetworkPolicyPortArgs() {}

    private NetworkPolicyPortArgs(NetworkPolicyPortArgs $) {
        this.endPort = $.endPort;
        this.port = $.port;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyPortArgs $;

        public Builder() {
            $ = new NetworkPolicyPortArgs();
        }

        public Builder(NetworkPolicyPortArgs defaults) {
            $ = new NetworkPolicyPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endPort endPort indicates that the range of ports from port to endPort if set, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
         * 
         * @return builder
         * 
         */
        public Builder endPort(@Nullable Output<Integer> endPort) {
            $.endPort = endPort;
            return this;
        }

        /**
         * @param endPort endPort indicates that the range of ports from port to endPort if set, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
         * 
         * @return builder
         * 
         */
        public Builder endPort(Integer endPort) {
            return endPort(Output.of(endPort));
        }

        /**
         * @param port port represents the port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Either<Integer,String>> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port port represents the port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
         * 
         * @return builder
         * 
         */
        public Builder port(Either<Integer,String> port) {
            return port(Output.of(port));
        }

        /**
         * @param port port represents the port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Either.ofLeft(port));
        }

        /**
         * @param port port represents the port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Either.ofRight(port));
        }

        /**
         * @param protocol protocol represents the protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol protocol represents the protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public NetworkPolicyPortArgs build() {
            return $;
        }
    }

}
