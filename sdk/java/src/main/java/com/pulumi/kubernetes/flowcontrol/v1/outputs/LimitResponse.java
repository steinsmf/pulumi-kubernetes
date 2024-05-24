// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.QueuingConfiguration;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LimitResponse {
    /**
     * @return `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `&#34;Queue&#34;`.
     * 
     */
    private @Nullable QueuingConfiguration queuing;
    /**
     * @return `type` is &#34;Queue&#34; or &#34;Reject&#34;. &#34;Queue&#34; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. &#34;Reject&#34; means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    private String type;

    private LimitResponse() {}
    /**
     * @return `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `&#34;Queue&#34;`.
     * 
     */
    public Optional<QueuingConfiguration> queuing() {
        return Optional.ofNullable(this.queuing);
    }
    /**
     * @return `type` is &#34;Queue&#34; or &#34;Reject&#34;. &#34;Queue&#34; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. &#34;Reject&#34; means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable QueuingConfiguration queuing;
        private String type;
        public Builder() {}
        public Builder(LimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queuing = defaults.queuing;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder queuing(@Nullable QueuingConfiguration queuing) {

            this.queuing = queuing;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("LimitResponse", "type");
            }
            this.type = type;
            return this;
        }
        public LimitResponse build() {
            final var _resultValue = new LimitResponse();
            _resultValue.queuing = queuing;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
