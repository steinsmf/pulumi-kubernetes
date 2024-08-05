// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.auditregistration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.auditregistration.v1alpha1.outputs.ServiceReferencePatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookClientConfigPatch {
    /**
     * @return `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook&#39;s server certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    private @Nullable String caBundle;
    /**
     * @return `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
     * 
     * If the webhook is running within the cluster, then you should use `service`.
     * 
     */
    private @Nullable ServiceReferencePatch service;
    /**
     * @return `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
     * 
     * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
     * 
     * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
     * 
     * The scheme must be &#34;https&#34;; the URL must begin with &#34;https://&#34;.
     * 
     * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
     * 
     * Attempting to use a user or basic auth e.g. &#34;user:password{@literal @}&#34; is not allowed. Fragments (&#34;#...&#34;) and query parameters (&#34;?...&#34;) are not allowed, either.
     * 
     */
    private @Nullable String url;

    private WebhookClientConfigPatch() {}
    /**
     * @return `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook&#39;s server certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    public Optional<String> caBundle() {
        return Optional.ofNullable(this.caBundle);
    }
    /**
     * @return `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
     * 
     * If the webhook is running within the cluster, then you should use `service`.
     * 
     */
    public Optional<ServiceReferencePatch> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
     * 
     * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
     * 
     * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
     * 
     * The scheme must be &#34;https&#34;; the URL must begin with &#34;https://&#34;.
     * 
     * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
     * 
     * Attempting to use a user or basic auth e.g. &#34;user:password{@literal @}&#34; is not allowed. Fragments (&#34;#...&#34;) and query parameters (&#34;?...&#34;) are not allowed, either.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookClientConfigPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String caBundle;
        private @Nullable ServiceReferencePatch service;
        private @Nullable String url;
        public Builder() {}
        public Builder(WebhookClientConfigPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundle = defaults.caBundle;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder caBundle(@Nullable String caBundle) {

            this.caBundle = caBundle;
            return this;
        }
        @CustomType.Setter
        public Builder service(@Nullable ServiceReferencePatch service) {

            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public WebhookClientConfigPatch build() {
            final var _resultValue = new WebhookClientConfigPatch();
            _resultValue.caBundle = caBundle;
            _resultValue.service = service;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
