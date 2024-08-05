// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.auditregistration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookThrottleConfigPatch {
    /**
     * @return ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
     * 
     */
    private @Nullable Integer burst;
    /**
     * @return ThrottleQPS maximum number of batches per second default 10 QPS
     * 
     */
    private @Nullable Integer qps;

    private WebhookThrottleConfigPatch() {}
    /**
     * @return ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
     * 
     */
    public Optional<Integer> burst() {
        return Optional.ofNullable(this.burst);
    }
    /**
     * @return ThrottleQPS maximum number of batches per second default 10 QPS
     * 
     */
    public Optional<Integer> qps() {
        return Optional.ofNullable(this.qps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookThrottleConfigPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer burst;
        private @Nullable Integer qps;
        public Builder() {}
        public Builder(WebhookThrottleConfigPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burst = defaults.burst;
    	      this.qps = defaults.qps;
        }

        @CustomType.Setter
        public Builder burst(@Nullable Integer burst) {

            this.burst = burst;
            return this;
        }
        @CustomType.Setter
        public Builder qps(@Nullable Integer qps) {

            this.qps = qps;
            return this;
        }
        public WebhookThrottleConfigPatch build() {
            final var _resultValue = new WebhookThrottleConfigPatch();
            _resultValue.burst = burst;
            _resultValue.qps = qps;
            return _resultValue;
        }
    }
}
