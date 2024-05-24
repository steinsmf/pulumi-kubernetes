// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.networking.v1beta1.outputs.IngressBackendPatch;
import com.pulumi.kubernetes.networking.v1beta1.outputs.IngressRulePatch;
import com.pulumi.kubernetes.networking.v1beta1.outputs.IngressTLSPatch;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressSpecPatch {
    /**
     * @return A default backend capable of servicing requests that don&#39;t match any rule. At least one of &#39;backend&#39; or &#39;rules&#39; must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
     * 
     */
    private @Nullable IngressBackendPatch backend;
    /**
     * @return IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * 
     */
    private @Nullable String ingressClassName;
    /**
     * @return A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    private @Nullable List<IngressRulePatch> rules;
    /**
     * @return TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    private @Nullable List<IngressTLSPatch> tls;

    private IngressSpecPatch() {}
    /**
     * @return A default backend capable of servicing requests that don&#39;t match any rule. At least one of &#39;backend&#39; or &#39;rules&#39; must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
     * 
     */
    public Optional<IngressBackendPatch> backend() {
        return Optional.ofNullable(this.backend);
    }
    /**
     * @return IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * 
     */
    public Optional<String> ingressClassName() {
        return Optional.ofNullable(this.ingressClassName);
    }
    /**
     * @return A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    public List<IngressRulePatch> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * @return TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    public List<IngressTLSPatch> tls() {
        return this.tls == null ? List.of() : this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable IngressBackendPatch backend;
        private @Nullable String ingressClassName;
        private @Nullable List<IngressRulePatch> rules;
        private @Nullable List<IngressTLSPatch> tls;
        public Builder() {}
        public Builder(IngressSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.ingressClassName = defaults.ingressClassName;
    	      this.rules = defaults.rules;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder backend(@Nullable IngressBackendPatch backend) {

            this.backend = backend;
            return this;
        }
        @CustomType.Setter
        public Builder ingressClassName(@Nullable String ingressClassName) {

            this.ingressClassName = ingressClassName;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<IngressRulePatch> rules) {

            this.rules = rules;
            return this;
        }
        public Builder rules(IngressRulePatch... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder tls(@Nullable List<IngressTLSPatch> tls) {

            this.tls = tls;
            return this;
        }
        public Builder tls(IngressTLSPatch... tls) {
            return tls(List.of(tls));
        }
        public IngressSpecPatch build() {
            final var _resultValue = new IngressSpecPatch();
            _resultValue.backend = backend;
            _resultValue.ingressClassName = ingressClassName;
            _resultValue.rules = rules;
            _resultValue.tls = tls;
            return _resultValue;
        }
    }
}
