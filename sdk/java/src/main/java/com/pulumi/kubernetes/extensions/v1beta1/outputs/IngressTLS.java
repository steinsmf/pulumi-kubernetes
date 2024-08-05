// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressTLS {
    /**
     * @return Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
     */
    private @Nullable List<String> hosts;
    /**
     * @return SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the &#34;Host&#34; header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
     */
    private @Nullable String secretName;

    private IngressTLS() {}
    /**
     * @return Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
     */
    public List<String> hosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    /**
     * @return SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the &#34;Host&#34; header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
     */
    public Optional<String> secretName() {
        return Optional.ofNullable(this.secretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressTLS defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> hosts;
        private @Nullable String secretName;
        public Builder() {}
        public Builder(IngressTLS defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.secretName = defaults.secretName;
        }

        @CustomType.Setter
        public Builder hosts(@Nullable List<String> hosts) {

            this.hosts = hosts;
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        @CustomType.Setter
        public Builder secretName(@Nullable String secretName) {

            this.secretName = secretName;
            return this;
        }
        public IngressTLS build() {
            final var _resultValue = new IngressTLS();
            _resultValue.hosts = hosts;
            _resultValue.secretName = secretName;
            return _resultValue;
        }
    }
}
