// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VolumeNodeResources is a set of resource limits for scheduling of volumes.
 * 
 */
public final class VolumeNodeResourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeNodeResourcesArgs Empty = new VolumeNodeResourcesArgs();

    /**
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    private VolumeNodeResourcesArgs() {}

    private VolumeNodeResourcesArgs(VolumeNodeResourcesArgs $) {
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeNodeResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeNodeResourcesArgs $;

        public Builder() {
            $ = new VolumeNodeResourcesArgs();
        }

        public Builder(VolumeNodeResourcesArgs defaults) {
            $ = new VolumeNodeResourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public VolumeNodeResourcesArgs build() {
            return $;
        }
    }

}
