// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TokenRequest {
    /**
     * @return audience is the intended audience of the token in &#34;TokenRequestSpec&#34;. It will default to the audiences of kube apiserver.
     * 
     */
    private String audience;
    /**
     * @return expirationSeconds is the duration of validity of the token in &#34;TokenRequestSpec&#34;. It has the same default value of &#34;ExpirationSeconds&#34; in &#34;TokenRequestSpec&#34;.
     * 
     */
    private @Nullable Integer expirationSeconds;

    private TokenRequest() {}
    /**
     * @return audience is the intended audience of the token in &#34;TokenRequestSpec&#34;. It will default to the audiences of kube apiserver.
     * 
     */
    public String audience() {
        return this.audience;
    }
    /**
     * @return expirationSeconds is the duration of validity of the token in &#34;TokenRequestSpec&#34;. It has the same default value of &#34;ExpirationSeconds&#34; in &#34;TokenRequestSpec&#34;.
     * 
     */
    public Optional<Integer> expirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String audience;
        private @Nullable Integer expirationSeconds;
        public Builder() {}
        public Builder(TokenRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        @CustomType.Setter
        public Builder audience(String audience) {
            if (audience == null) {
              throw new MissingRequiredPropertyException("TokenRequest", "audience");
            }
            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder expirationSeconds(@Nullable Integer expirationSeconds) {

            this.expirationSeconds = expirationSeconds;
            return this;
        }
        public TokenRequest build() {
            final var _resultValue = new TokenRequest();
            _resultValue.audience = audience;
            _resultValue.expirationSeconds = expirationSeconds;
            return _resultValue;
        }
    }
}
