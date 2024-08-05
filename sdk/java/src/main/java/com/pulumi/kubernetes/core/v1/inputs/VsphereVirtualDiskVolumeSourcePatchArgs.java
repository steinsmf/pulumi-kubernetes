// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a vSphere volume resource.
 * 
 */
public final class VsphereVirtualDiskVolumeSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final VsphereVirtualDiskVolumeSourcePatchArgs Empty = new VsphereVirtualDiskVolumeSourcePatchArgs();

    /**
     * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    @Import(name="storagePolicyID")
    private @Nullable Output<String> storagePolicyID;

    /**
     * @return storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    public Optional<Output<String>> storagePolicyID() {
        return Optional.ofNullable(this.storagePolicyID);
    }

    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    @Import(name="storagePolicyName")
    private @Nullable Output<String> storagePolicyName;

    /**
     * @return storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    public Optional<Output<String>> storagePolicyName() {
        return Optional.ofNullable(this.storagePolicyName);
    }

    /**
     * volumePath is the path that identifies vSphere volume vmdk
     * 
     */
    @Import(name="volumePath")
    private @Nullable Output<String> volumePath;

    /**
     * @return volumePath is the path that identifies vSphere volume vmdk
     * 
     */
    public Optional<Output<String>> volumePath() {
        return Optional.ofNullable(this.volumePath);
    }

    private VsphereVirtualDiskVolumeSourcePatchArgs() {}

    private VsphereVirtualDiskVolumeSourcePatchArgs(VsphereVirtualDiskVolumeSourcePatchArgs $) {
        this.fsType = $.fsType;
        this.storagePolicyID = $.storagePolicyID;
        this.storagePolicyName = $.storagePolicyName;
        this.volumePath = $.volumePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VsphereVirtualDiskVolumeSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VsphereVirtualDiskVolumeSourcePatchArgs $;

        public Builder() {
            $ = new VsphereVirtualDiskVolumeSourcePatchArgs();
        }

        public Builder(VsphereVirtualDiskVolumeSourcePatchArgs defaults) {
            $ = new VsphereVirtualDiskVolumeSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fsType fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param storagePolicyID storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
         * 
         * @return builder
         * 
         */
        public Builder storagePolicyID(@Nullable Output<String> storagePolicyID) {
            $.storagePolicyID = storagePolicyID;
            return this;
        }

        /**
         * @param storagePolicyID storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
         * 
         * @return builder
         * 
         */
        public Builder storagePolicyID(String storagePolicyID) {
            return storagePolicyID(Output.of(storagePolicyID));
        }

        /**
         * @param storagePolicyName storagePolicyName is the storage Policy Based Management (SPBM) profile name.
         * 
         * @return builder
         * 
         */
        public Builder storagePolicyName(@Nullable Output<String> storagePolicyName) {
            $.storagePolicyName = storagePolicyName;
            return this;
        }

        /**
         * @param storagePolicyName storagePolicyName is the storage Policy Based Management (SPBM) profile name.
         * 
         * @return builder
         * 
         */
        public Builder storagePolicyName(String storagePolicyName) {
            return storagePolicyName(Output.of(storagePolicyName));
        }

        /**
         * @param volumePath volumePath is the path that identifies vSphere volume vmdk
         * 
         * @return builder
         * 
         */
        public Builder volumePath(@Nullable Output<String> volumePath) {
            $.volumePath = volumePath;
            return this;
        }

        /**
         * @param volumePath volumePath is the path that identifies vSphere volume vmdk
         * 
         * @return builder
         * 
         */
        public Builder volumePath(String volumePath) {
            return volumePath(Output.of(volumePath));
        }

        public VsphereVirtualDiskVolumeSourcePatchArgs build() {
            return $;
        }
    }

}
