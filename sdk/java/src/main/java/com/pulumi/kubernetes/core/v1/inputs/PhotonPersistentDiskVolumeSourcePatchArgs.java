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
 * Represents a Photon Controller persistent disk resource.
 * 
 */
public final class PhotonPersistentDiskVolumeSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final PhotonPersistentDiskVolumeSourcePatchArgs Empty = new PhotonPersistentDiskVolumeSourcePatchArgs();

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * pdID is the ID that identifies Photon Controller persistent disk
     * 
     */
    @Import(name="pdID")
    private @Nullable Output<String> pdID;

    /**
     * @return pdID is the ID that identifies Photon Controller persistent disk
     * 
     */
    public Optional<Output<String>> pdID() {
        return Optional.ofNullable(this.pdID);
    }

    private PhotonPersistentDiskVolumeSourcePatchArgs() {}

    private PhotonPersistentDiskVolumeSourcePatchArgs(PhotonPersistentDiskVolumeSourcePatchArgs $) {
        this.fsType = $.fsType;
        this.pdID = $.pdID;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PhotonPersistentDiskVolumeSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PhotonPersistentDiskVolumeSourcePatchArgs $;

        public Builder() {
            $ = new PhotonPersistentDiskVolumeSourcePatchArgs();
        }

        public Builder(PhotonPersistentDiskVolumeSourcePatchArgs defaults) {
            $ = new PhotonPersistentDiskVolumeSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fsType fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param pdID pdID is the ID that identifies Photon Controller persistent disk
         * 
         * @return builder
         * 
         */
        public Builder pdID(@Nullable Output<String> pdID) {
            $.pdID = pdID;
            return this;
        }

        /**
         * @param pdID pdID is the ID that identifies Photon Controller persistent disk
         * 
         * @return builder
         * 
         */
        public Builder pdID(String pdID) {
            return pdID(Output.of(pdID));
        }

        public PhotonPersistentDiskVolumeSourcePatchArgs build() {
            return $;
        }
    }

}
