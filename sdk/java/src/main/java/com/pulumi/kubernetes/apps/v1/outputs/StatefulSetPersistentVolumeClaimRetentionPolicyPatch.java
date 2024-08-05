// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulSetPersistentVolumeClaimRetentionPolicyPatch {
    /**
     * @return WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
     * 
     */
    private @Nullable String whenDeleted;
    /**
     * @return WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     * 
     */
    private @Nullable String whenScaled;

    private StatefulSetPersistentVolumeClaimRetentionPolicyPatch() {}
    /**
     * @return WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
     * 
     */
    public Optional<String> whenDeleted() {
        return Optional.ofNullable(this.whenDeleted);
    }
    /**
     * @return WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     * 
     */
    public Optional<String> whenScaled() {
        return Optional.ofNullable(this.whenScaled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetPersistentVolumeClaimRetentionPolicyPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String whenDeleted;
        private @Nullable String whenScaled;
        public Builder() {}
        public Builder(StatefulSetPersistentVolumeClaimRetentionPolicyPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.whenDeleted = defaults.whenDeleted;
    	      this.whenScaled = defaults.whenScaled;
        }

        @CustomType.Setter
        public Builder whenDeleted(@Nullable String whenDeleted) {

            this.whenDeleted = whenDeleted;
            return this;
        }
        @CustomType.Setter
        public Builder whenScaled(@Nullable String whenScaled) {

            this.whenScaled = whenScaled;
            return this;
        }
        public StatefulSetPersistentVolumeClaimRetentionPolicyPatch build() {
            final var _resultValue = new StatefulSetPersistentVolumeClaimRetentionPolicyPatch();
            _resultValue.whenDeleted = whenDeleted;
            _resultValue.whenScaled = whenScaled;
            return _resultValue;
        }
    }
}
