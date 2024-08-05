// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalDocumentationPatch {
    private @Nullable String description;
    private @Nullable String url;

    private ExternalDocumentationPatch() {}
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDocumentationPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String url;
        public Builder() {}
        public Builder(ExternalDocumentationPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public ExternalDocumentationPatch build() {
            final var _resultValue = new ExternalDocumentationPatch();
            _resultValue.description = description;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
