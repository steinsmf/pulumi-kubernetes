// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeConfigSourcePatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeConfigStatusPatch {
    /**
     * @return Active reports the checkpointed config the node is actively using. Active will represent either the current version of the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config results in an error.
     * 
     */
    private @Nullable NodeConfigSourcePatch active;
    /**
     * @return Assigned reports the checkpointed config the node will try to use. When Node.Spec.ConfigSource is updated, the node checkpoints the associated config payload to local disk, along with a record indicating intended config. The node refers to this record to choose its config checkpoint, and reports this record in Assigned. Assigned only updates in the status after the record has been checkpointed to disk. When the Kubelet is restarted, it tries to make the Assigned config the Active config by loading and validating the checkpointed payload identified by Assigned.
     * 
     */
    private @Nullable NodeConfigSourcePatch assigned;
    /**
     * @return Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.
     * 
     */
    private @Nullable String error;
    /**
     * @return LastKnownGood reports the checkpointed config the node will fall back to when it encounters an error attempting to use the Assigned config. The Assigned config becomes the LastKnownGood config when the node determines that the Assigned config is stable and correct. This is currently implemented as a 10-minute soak period starting when the local record of Assigned config is updated. If the Assigned config is Active at the end of this period, it becomes the LastKnownGood. Note that if Spec.ConfigSource is reset to nil (use local defaults), the LastKnownGood is also immediately reset to nil, because the local default config is always assumed good. You should not make assumptions about the node&#39;s method of determining config stability and correctness, as this may change or become configurable in the future.
     * 
     */
    private @Nullable NodeConfigSourcePatch lastKnownGood;

    private NodeConfigStatusPatch() {}
    /**
     * @return Active reports the checkpointed config the node is actively using. Active will represent either the current version of the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config results in an error.
     * 
     */
    public Optional<NodeConfigSourcePatch> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * @return Assigned reports the checkpointed config the node will try to use. When Node.Spec.ConfigSource is updated, the node checkpoints the associated config payload to local disk, along with a record indicating intended config. The node refers to this record to choose its config checkpoint, and reports this record in Assigned. Assigned only updates in the status after the record has been checkpointed to disk. When the Kubelet is restarted, it tries to make the Assigned config the Active config by loading and validating the checkpointed payload identified by Assigned.
     * 
     */
    public Optional<NodeConfigSourcePatch> assigned() {
        return Optional.ofNullable(this.assigned);
    }
    /**
     * @return Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.
     * 
     */
    public Optional<String> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return LastKnownGood reports the checkpointed config the node will fall back to when it encounters an error attempting to use the Assigned config. The Assigned config becomes the LastKnownGood config when the node determines that the Assigned config is stable and correct. This is currently implemented as a 10-minute soak period starting when the local record of Assigned config is updated. If the Assigned config is Active at the end of this period, it becomes the LastKnownGood. Note that if Spec.ConfigSource is reset to nil (use local defaults), the LastKnownGood is also immediately reset to nil, because the local default config is always assumed good. You should not make assumptions about the node&#39;s method of determining config stability and correctness, as this may change or become configurable in the future.
     * 
     */
    public Optional<NodeConfigSourcePatch> lastKnownGood() {
        return Optional.ofNullable(this.lastKnownGood);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NodeConfigSourcePatch active;
        private @Nullable NodeConfigSourcePatch assigned;
        private @Nullable String error;
        private @Nullable NodeConfigSourcePatch lastKnownGood;
        public Builder() {}
        public Builder(NodeConfigStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.assigned = defaults.assigned;
    	      this.error = defaults.error;
    	      this.lastKnownGood = defaults.lastKnownGood;
        }

        @CustomType.Setter
        public Builder active(@Nullable NodeConfigSourcePatch active) {

            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder assigned(@Nullable NodeConfigSourcePatch assigned) {

            this.assigned = assigned;
            return this;
        }
        @CustomType.Setter
        public Builder error(@Nullable String error) {

            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder lastKnownGood(@Nullable NodeConfigSourcePatch lastKnownGood) {

            this.lastKnownGood = lastKnownGood;
            return this;
        }
        public NodeConfigStatusPatch build() {
            final var _resultValue = new NodeConfigStatusPatch();
            _resultValue.active = active;
            _resultValue.assigned = assigned;
            _resultValue.error = error;
            _resultValue.lastKnownGood = lastKnownGood;
            return _resultValue;
        }
    }
}
