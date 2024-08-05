// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ObjectReferencePatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageOSPersistentVolumeSourcePatch {
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return secretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    private @Nullable ObjectReferencePatch secretRef;
    /**
     * @return volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    private @Nullable String volumeName;
    /**
     * @return volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    private @Nullable String volumeNamespace;

    private StorageOSPersistentVolumeSourcePatch() {}
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return secretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    public Optional<ObjectReferencePatch> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * @return volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    public Optional<String> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }
    /**
     * @return volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    public Optional<String> volumeNamespace() {
        return Optional.ofNullable(this.volumeNamespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageOSPersistentVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Boolean readOnly;
        private @Nullable ObjectReferencePatch secretRef;
        private @Nullable String volumeName;
        private @Nullable String volumeNamespace;
        public Builder() {}
        public Builder(StorageOSPersistentVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeName = defaults.volumeName;
    	      this.volumeNamespace = defaults.volumeNamespace;
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
        public Builder secretRef(@Nullable ObjectReferencePatch secretRef) {

            this.secretRef = secretRef;
            return this;
        }
        @CustomType.Setter
        public Builder volumeName(@Nullable String volumeName) {

            this.volumeName = volumeName;
            return this;
        }
        @CustomType.Setter
        public Builder volumeNamespace(@Nullable String volumeNamespace) {

            this.volumeNamespace = volumeNamespace;
            return this;
        }
        public StorageOSPersistentVolumeSourcePatch build() {
            final var _resultValue = new StorageOSPersistentVolumeSourcePatch();
            _resultValue.fsType = fsType;
            _resultValue.readOnly = readOnly;
            _resultValue.secretRef = secretRef;
            _resultValue.volumeName = volumeName;
            _resultValue.volumeNamespace = volumeNamespace;
            return _resultValue;
        }
    }
}
