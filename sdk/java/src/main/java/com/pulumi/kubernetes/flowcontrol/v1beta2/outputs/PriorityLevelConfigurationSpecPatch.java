// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1beta2.outputs.ExemptPriorityLevelConfigurationPatch;
import com.pulumi.kubernetes.flowcontrol.v1beta2.outputs.LimitedPriorityLevelConfigurationPatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PriorityLevelConfigurationSpecPatch {
    /**
     * @return `exempt` specifies how requests are handled for an exempt priority level. This field MUST be empty if `type` is `&#34;Limited&#34;`. This field MAY be non-empty if `type` is `&#34;Exempt&#34;`. If empty and `type` is `&#34;Exempt&#34;` then the default values for `ExemptPriorityLevelConfiguration` apply.
     * 
     */
    private @Nullable ExemptPriorityLevelConfigurationPatch exempt;
    /**
     * @return `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `&#34;Limited&#34;`.
     * 
     */
    private @Nullable LimitedPriorityLevelConfigurationPatch limited;
    /**
     * @return `type` indicates whether this priority level is subject to limitation on request execution.  A value of `&#34;Exempt&#34;` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `&#34;Limited&#34;` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server&#39;s limited capacity is made available exclusively to this priority level. Required.
     * 
     */
    private @Nullable String type;

    private PriorityLevelConfigurationSpecPatch() {}
    /**
     * @return `exempt` specifies how requests are handled for an exempt priority level. This field MUST be empty if `type` is `&#34;Limited&#34;`. This field MAY be non-empty if `type` is `&#34;Exempt&#34;`. If empty and `type` is `&#34;Exempt&#34;` then the default values for `ExemptPriorityLevelConfiguration` apply.
     * 
     */
    public Optional<ExemptPriorityLevelConfigurationPatch> exempt() {
        return Optional.ofNullable(this.exempt);
    }
    /**
     * @return `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `&#34;Limited&#34;`.
     * 
     */
    public Optional<LimitedPriorityLevelConfigurationPatch> limited() {
        return Optional.ofNullable(this.limited);
    }
    /**
     * @return `type` indicates whether this priority level is subject to limitation on request execution.  A value of `&#34;Exempt&#34;` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `&#34;Limited&#34;` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server&#39;s limited capacity is made available exclusively to this priority level. Required.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ExemptPriorityLevelConfigurationPatch exempt;
        private @Nullable LimitedPriorityLevelConfigurationPatch limited;
        private @Nullable String type;
        public Builder() {}
        public Builder(PriorityLevelConfigurationSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exempt = defaults.exempt;
    	      this.limited = defaults.limited;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder exempt(@Nullable ExemptPriorityLevelConfigurationPatch exempt) {

            this.exempt = exempt;
            return this;
        }
        @CustomType.Setter
        public Builder limited(@Nullable LimitedPriorityLevelConfigurationPatch limited) {

            this.limited = limited;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public PriorityLevelConfigurationSpecPatch build() {
            final var _resultValue = new PriorityLevelConfigurationSpecPatch();
            _resultValue.exempt = exempt;
            _resultValue.limited = limited;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
