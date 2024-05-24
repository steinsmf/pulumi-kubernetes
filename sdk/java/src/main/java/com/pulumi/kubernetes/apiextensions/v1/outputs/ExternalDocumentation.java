// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalDocumentation {
    private @Nullable String description;
    private @Nullable String url;

    private ExternalDocumentation() {}
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDocumentation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String url;
        public Builder() {}
        public Builder(ExternalDocumentation defaults) {
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
        public ExternalDocumentation build() {
            final var _resultValue = new ExternalDocumentation();
            _resultValue.description = description;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
