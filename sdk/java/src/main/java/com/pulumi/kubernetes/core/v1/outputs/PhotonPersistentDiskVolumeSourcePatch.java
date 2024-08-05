// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PhotonPersistentDiskVolumeSourcePatch {
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return pdID is the ID that identifies Photon Controller persistent disk
     * 
     */
    private @Nullable String pdID;

    private PhotonPersistentDiskVolumeSourcePatch() {}
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return pdID is the ID that identifies Photon Controller persistent disk
     * 
     */
    public Optional<String> pdID() {
        return Optional.ofNullable(this.pdID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhotonPersistentDiskVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable String pdID;
        public Builder() {}
        public Builder(PhotonPersistentDiskVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.pdID = defaults.pdID;
        }

        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {

            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder pdID(@Nullable String pdID) {

            this.pdID = pdID;
            return this;
        }
        public PhotonPersistentDiskVolumeSourcePatch build() {
            final var _resultValue = new PhotonPersistentDiskVolumeSourcePatch();
            _resultValue.fsType = fsType;
            _resultValue.pdID = pdID;
            return _resultValue;
        }
    }
}
