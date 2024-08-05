// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.SecretReferencePatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CinderPersistentVolumeSourcePatch {
    /**
     * @return fsType Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    private @Nullable String fsType;
    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return secretRef is Optional: points to a secret object containing parameters used to connect to OpenStack.
     * 
     */
    private @Nullable SecretReferencePatch secretRef;
    /**
     * @return volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    private @Nullable String volumeID;

    private CinderPersistentVolumeSourcePatch() {}
    /**
     * @return fsType Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return secretRef is Optional: points to a secret object containing parameters used to connect to OpenStack.
     * 
     */
    public Optional<SecretReferencePatch> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * @return volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    public Optional<String> volumeID() {
        return Optional.ofNullable(this.volumeID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CinderPersistentVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Boolean readOnly;
        private @Nullable SecretReferencePatch secretRef;
        private @Nullable String volumeID;
        public Builder() {}
        public Builder(CinderPersistentVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeID = defaults.volumeID;
        }

        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {

            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder secretRef(@Nullable SecretReferencePatch secretRef) {

            this.secretRef = secretRef;
            return this;
        }
        @CustomType.Setter
        public Builder volumeID(@Nullable String volumeID) {

            this.volumeID = volumeID;
            return this;
        }
        public CinderPersistentVolumeSourcePatch build() {
            final var _resultValue = new CinderPersistentVolumeSourcePatch();
            _resultValue.fsType = fsType;
            _resultValue.readOnly = readOnly;
            _resultValue.secretRef = secretRef;
            _resultValue.volumeID = volumeID;
            return _resultValue;
        }
    }
}
