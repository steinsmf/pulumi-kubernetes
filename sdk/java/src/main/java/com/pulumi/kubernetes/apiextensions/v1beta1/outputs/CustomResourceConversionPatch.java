// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.v1beta1.outputs.WebhookClientConfigPatch;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceConversionPatch {
    /**
     * @return conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[&#34;v1beta1&#34;]`.
     * 
     */
    private @Nullable List<String> conversionReviewVersions;
    /**
     * @return strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
     * 
     */
    private @Nullable String strategy;
    /**
     * @return webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
     * 
     */
    private @Nullable WebhookClientConfigPatch webhookClientConfig;

    private CustomResourceConversionPatch() {}
    /**
     * @return conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[&#34;v1beta1&#34;]`.
     * 
     */
    public List<String> conversionReviewVersions() {
        return this.conversionReviewVersions == null ? List.of() : this.conversionReviewVersions;
    }
    /**
     * @return strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }
    /**
     * @return webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
     * 
     */
    public Optional<WebhookClientConfigPatch> webhookClientConfig() {
        return Optional.ofNullable(this.webhookClientConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceConversionPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> conversionReviewVersions;
        private @Nullable String strategy;
        private @Nullable WebhookClientConfigPatch webhookClientConfig;
        public Builder() {}
        public Builder(CustomResourceConversionPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversionReviewVersions = defaults.conversionReviewVersions;
    	      this.strategy = defaults.strategy;
    	      this.webhookClientConfig = defaults.webhookClientConfig;
        }

        @CustomType.Setter
        public Builder conversionReviewVersions(@Nullable List<String> conversionReviewVersions) {

            this.conversionReviewVersions = conversionReviewVersions;
            return this;
        }
        public Builder conversionReviewVersions(String... conversionReviewVersions) {
            return conversionReviewVersions(List.of(conversionReviewVersions));
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        @CustomType.Setter
        public Builder webhookClientConfig(@Nullable WebhookClientConfigPatch webhookClientConfig) {

            this.webhookClientConfig = webhookClientConfig;
            return this;
        }
        public CustomResourceConversionPatch build() {
            final var _resultValue = new CustomResourceConversionPatch();
            _resultValue.conversionReviewVersions = conversionReviewVersions;
            _resultValue.strategy = strategy;
            _resultValue.webhookClientConfig = webhookClientConfig;
            return _resultValue;
        }
    }
}
