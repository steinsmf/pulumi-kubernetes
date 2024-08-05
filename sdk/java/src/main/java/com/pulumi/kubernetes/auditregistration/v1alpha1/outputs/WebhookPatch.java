// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.auditregistration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.auditregistration.v1alpha1.outputs.WebhookClientConfigPatch;
import com.pulumi.kubernetes.auditregistration.v1alpha1.outputs.WebhookThrottleConfigPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookPatch {
    /**
     * @return ClientConfig holds the connection parameters for the webhook required
     * 
     */
    private @Nullable WebhookClientConfigPatch clientConfig;
    /**
     * @return Throttle holds the options for throttling the webhook
     * 
     */
    private @Nullable WebhookThrottleConfigPatch throttle;

    private WebhookPatch() {}
    /**
     * @return ClientConfig holds the connection parameters for the webhook required
     * 
     */
    public Optional<WebhookClientConfigPatch> clientConfig() {
        return Optional.ofNullable(this.clientConfig);
    }
    /**
     * @return Throttle holds the options for throttling the webhook
     * 
     */
    public Optional<WebhookThrottleConfigPatch> throttle() {
        return Optional.ofNullable(this.throttle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebhookClientConfigPatch clientConfig;
        private @Nullable WebhookThrottleConfigPatch throttle;
        public Builder() {}
        public Builder(WebhookPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfig = defaults.clientConfig;
    	      this.throttle = defaults.throttle;
        }

        @CustomType.Setter
        public Builder clientConfig(@Nullable WebhookClientConfigPatch clientConfig) {

            this.clientConfig = clientConfig;
            return this;
        }
        @CustomType.Setter
        public Builder throttle(@Nullable WebhookThrottleConfigPatch throttle) {

            this.throttle = throttle;
            return this;
        }
        public WebhookPatch build() {
            final var _resultValue = new WebhookPatch();
            _resultValue.clientConfig = clientConfig;
            _resultValue.throttle = throttle;
            return _resultValue;
        }
    }
}
