// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressTLS describes the transport layer security associated with an Ingress.
 * 
 */
public final class IngressTLSArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressTLSArgs Empty = new IngressTLSArgs();

    /**
     * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
     */
    @Import(name="hosts")
    private @Nullable Output<List<String>> hosts;

    /**
     * @return Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
     */
    public Optional<Output<List<String>>> hosts() {
        return Optional.ofNullable(this.hosts);
    }

    /**
     * SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the &#34;Host&#34; header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
     */
    @Import(name="secretName")
    private @Nullable Output<String> secretName;

    /**
     * @return SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the &#34;Host&#34; header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
     */
    public Optional<Output<String>> secretName() {
        return Optional.ofNullable(this.secretName);
    }

    private IngressTLSArgs() {}

    private IngressTLSArgs(IngressTLSArgs $) {
        this.hosts = $.hosts;
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressTLSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressTLSArgs $;

        public Builder() {
            $ = new IngressTLSArgs();
        }

        public Builder(IngressTLSArgs defaults) {
            $ = new IngressTLSArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hosts Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
         * 
         * @return builder
         * 
         */
        public Builder hosts(@Nullable Output<List<String>> hosts) {
            $.hosts = hosts;
            return this;
        }

        /**
         * @param hosts Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
         * 
         * @return builder
         * 
         */
        public Builder hosts(List<String> hosts) {
            return hosts(Output.of(hosts));
        }

        /**
         * @param hosts Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
         * 
         * @return builder
         * 
         */
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param secretName SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the &#34;Host&#34; header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
         * 
         * @return builder
         * 
         */
        public Builder secretName(@Nullable Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the &#34;Host&#34; header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public IngressTLSArgs build() {
            return $;
        }
    }

}
