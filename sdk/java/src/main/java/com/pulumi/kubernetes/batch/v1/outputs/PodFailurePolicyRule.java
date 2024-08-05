// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.batch.v1.outputs.PodFailurePolicyOnExitCodesRequirement;
import com.pulumi.kubernetes.batch.v1.outputs.PodFailurePolicyOnPodConditionsPattern;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodFailurePolicyRule {
    /**
     * @return Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:
     * 
     * - FailJob: indicates that the pod&#39;s job is marked as Failed and all
     *   running pods are terminated.
     * - FailIndex: indicates that the pod&#39;s index is marked as Failed and will
     *   not be restarted.
     *   This value is beta-level. It can be used when the
     *   `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * - Ignore: indicates that the counter towards the .backoffLimit is not
     *   incremented and a replacement pod is created.
     * - Count: indicates that the pod is handled in the default way - the
     *   counter towards the .backoffLimit is incremented.
     *   Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
     * 
     */
    private String action;
    /**
     * @return Represents the requirement on the container exit codes.
     * 
     */
    private @Nullable PodFailurePolicyOnExitCodesRequirement onExitCodes;
    /**
     * @return Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
     * 
     */
    private @Nullable List<PodFailurePolicyOnPodConditionsPattern> onPodConditions;

    private PodFailurePolicyRule() {}
    /**
     * @return Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:
     * 
     * - FailJob: indicates that the pod&#39;s job is marked as Failed and all
     *   running pods are terminated.
     * - FailIndex: indicates that the pod&#39;s index is marked as Failed and will
     *   not be restarted.
     *   This value is beta-level. It can be used when the
     *   `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * - Ignore: indicates that the counter towards the .backoffLimit is not
     *   incremented and a replacement pod is created.
     * - Count: indicates that the pod is handled in the default way - the
     *   counter towards the .backoffLimit is incremented.
     *   Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Represents the requirement on the container exit codes.
     * 
     */
    public Optional<PodFailurePolicyOnExitCodesRequirement> onExitCodes() {
        return Optional.ofNullable(this.onExitCodes);
    }
    /**
     * @return Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
     * 
     */
    public List<PodFailurePolicyOnPodConditionsPattern> onPodConditions() {
        return this.onPodConditions == null ? List.of() : this.onPodConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodFailurePolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable PodFailurePolicyOnExitCodesRequirement onExitCodes;
        private @Nullable List<PodFailurePolicyOnPodConditionsPattern> onPodConditions;
        public Builder() {}
        public Builder(PodFailurePolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.onExitCodes = defaults.onExitCodes;
    	      this.onPodConditions = defaults.onPodConditions;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("PodFailurePolicyRule", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder onExitCodes(@Nullable PodFailurePolicyOnExitCodesRequirement onExitCodes) {

            this.onExitCodes = onExitCodes;
            return this;
        }
        @CustomType.Setter
        public Builder onPodConditions(@Nullable List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {

            this.onPodConditions = onPodConditions;
            return this;
        }
        public Builder onPodConditions(PodFailurePolicyOnPodConditionsPattern... onPodConditions) {
            return onPodConditions(List.of(onPodConditions));
        }
        public PodFailurePolicyRule build() {
            final var _resultValue = new PodFailurePolicyRule();
            _resultValue.action = action;
            _resultValue.onExitCodes = onExitCodes;
            _resultValue.onPodConditions = onPodConditions;
            return _resultValue;
        }
    }
}
