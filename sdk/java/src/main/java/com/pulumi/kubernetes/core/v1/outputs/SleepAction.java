// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SleepAction {
    /**
     * @return Seconds is the number of seconds to sleep.
     * 
     */
    private Integer seconds;

    private SleepAction() {}
    /**
     * @return Seconds is the number of seconds to sleep.
     * 
     */
    public Integer seconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SleepAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer seconds;
        public Builder() {}
        public Builder(SleepAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seconds = defaults.seconds;
        }

        @CustomType.Setter
        public Builder seconds(Integer seconds) {
            if (seconds == null) {
              throw new MissingRequiredPropertyException("SleepAction", "seconds");
            }
            this.seconds = seconds;
            return this;
        }
        public SleepAction build() {
            final var _resultValue = new SleepAction();
            _resultValue.seconds = seconds;
            return _resultValue;
        }
    }
}