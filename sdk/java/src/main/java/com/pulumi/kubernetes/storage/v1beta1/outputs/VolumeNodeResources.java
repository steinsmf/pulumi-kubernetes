// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeNodeResources {
    /**
     * @return Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
     * 
     */
    private @Nullable Integer count;

    private VolumeNodeResources() {}
    /**
     * @return Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeNodeResources defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        public Builder() {}
        public Builder(VolumeNodeResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        public VolumeNodeResources build() {
            final var _resultValue = new VolumeNodeResources();
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
