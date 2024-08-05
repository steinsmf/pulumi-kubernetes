// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TokenRequestPatch {
    /**
     * @return Audience is the intended audience of the token in &#34;TokenRequestSpec&#34;. It will default to the audiences of kube apiserver.
     * 
     */
    private @Nullable String audience;
    /**
     * @return ExpirationSeconds is the duration of validity of the token in &#34;TokenRequestSpec&#34;. It has the same default value of &#34;ExpirationSeconds&#34; in &#34;TokenRequestSpec&#34;
     * 
     */
    private @Nullable Integer expirationSeconds;

    private TokenRequestPatch() {}
    /**
     * @return Audience is the intended audience of the token in &#34;TokenRequestSpec&#34;. It will default to the audiences of kube apiserver.
     * 
     */
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * @return ExpirationSeconds is the duration of validity of the token in &#34;TokenRequestSpec&#34;. It has the same default value of &#34;ExpirationSeconds&#34; in &#34;TokenRequestSpec&#34;
     * 
     */
    public Optional<Integer> expirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequestPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String audience;
        private @Nullable Integer expirationSeconds;
        public Builder() {}
        public Builder(TokenRequestPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        @CustomType.Setter
        public Builder audience(@Nullable String audience) {

            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder expirationSeconds(@Nullable Integer expirationSeconds) {

            this.expirationSeconds = expirationSeconds;
            return this;
        }
        public TokenRequestPatch build() {
            final var _resultValue = new TokenRequestPatch();
            _resultValue.audience = audience;
            _resultValue.expirationSeconds = expirationSeconds;
            return _resultValue;
        }
    }
}
