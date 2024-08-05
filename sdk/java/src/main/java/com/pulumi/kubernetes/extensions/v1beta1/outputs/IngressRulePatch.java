// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.extensions.v1beta1.outputs.HTTPIngressRuleValuePatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressRulePatch {
    /**
     * @return Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the &#34;host&#34; part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
     * 	  IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * 	  Currently the port of an Ingress is implicitly :80 for http and
     * 	  :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * 
     */
    private @Nullable String host;
    private @Nullable HTTPIngressRuleValuePatch http;

    private IngressRulePatch() {}
    /**
     * @return Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the &#34;host&#34; part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
     * 	  IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * 	  Currently the port of an Ingress is implicitly :80 for http and
     * 	  :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    public Optional<HTTPIngressRuleValuePatch> http() {
        return Optional.ofNullable(this.http);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressRulePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable HTTPIngressRuleValuePatch http;
        public Builder() {}
        public Builder(IngressRulePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.http = defaults.http;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder http(@Nullable HTTPIngressRuleValuePatch http) {

            this.http = http;
            return this;
        }
        public IngressRulePatch build() {
            final var _resultValue = new IngressRulePatch();
            _resultValue.host = host;
            _resultValue.http = http;
            return _resultValue;
        }
    }
}
