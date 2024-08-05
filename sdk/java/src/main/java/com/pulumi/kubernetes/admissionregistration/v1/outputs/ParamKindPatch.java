// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParamKindPatch {
    /**
     * @return APIVersion is the API group version the resources belong to. In format of &#34;group/version&#34;. Required.
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Kind is the API kind the resources belong to. Required.
     * 
     */
    private @Nullable String kind;

    private ParamKindPatch() {}
    /**
     * @return APIVersion is the API group version the resources belong to. In format of &#34;group/version&#34;. Required.
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind is the API kind the resources belong to. Required.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParamKindPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        public Builder() {}
        public Builder(ParamKindPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        public ParamKindPatch build() {
            final var _resultValue = new ParamKindPatch();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            return _resultValue;
        }
    }
}
