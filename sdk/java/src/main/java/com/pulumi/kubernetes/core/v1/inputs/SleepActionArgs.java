// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


/**
 * SleepAction describes a &#34;sleep&#34; action.
 * 
 */
public final class SleepActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SleepActionArgs Empty = new SleepActionArgs();

    /**
     * Seconds is the number of seconds to sleep.
     * 
     */
    @Import(name="seconds", required=true)
    private Output<Integer> seconds;

    /**
     * @return Seconds is the number of seconds to sleep.
     * 
     */
    public Output<Integer> seconds() {
        return this.seconds;
    }

    private SleepActionArgs() {}

    private SleepActionArgs(SleepActionArgs $) {
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SleepActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SleepActionArgs $;

        public Builder() {
            $ = new SleepActionArgs();
        }

        public Builder(SleepActionArgs defaults) {
            $ = new SleepActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param seconds Seconds is the number of seconds to sleep.
         * 
         * @return builder
         * 
         */
        public Builder seconds(Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        /**
         * @param seconds Seconds is the number of seconds to sleep.
         * 
         * @return builder
         * 
         */
        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public SleepActionArgs build() {
            if ($.seconds == null) {
                throw new MissingRequiredPropertyException("SleepActionArgs", "seconds");
            }
            return $;
        }
    }

}
