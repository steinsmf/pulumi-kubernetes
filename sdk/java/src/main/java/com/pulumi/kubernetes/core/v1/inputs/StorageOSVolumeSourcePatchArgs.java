// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.LocalObjectReferencePatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a StorageOS persistent volume resource.
 * 
 */
public final class StorageOSVolumeSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageOSVolumeSourcePatchArgs Empty = new StorageOSVolumeSourcePatchArgs();

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
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * secretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<LocalObjectReferencePatchArgs> secretRef;

    /**
     * @return secretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    public Optional<Output<LocalObjectReferencePatchArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @Import(name="volumeName")
    private @Nullable Output<String> volumeName;

    /**
     * @return volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    public Optional<Output<String>> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    /**
     * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @Import(name="volumeNamespace")
    private @Nullable Output<String> volumeNamespace;

    /**
     * @return volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    public Optional<Output<String>> volumeNamespace() {
        return Optional.ofNullable(this.volumeNamespace);
    }

    private StorageOSVolumeSourcePatchArgs() {}

    private StorageOSVolumeSourcePatchArgs(StorageOSVolumeSourcePatchArgs $) {
        this.fsType = $.fsType;
        this.readOnly = $.readOnly;
        this.secretRef = $.secretRef;
        this.volumeName = $.volumeName;
        this.volumeNamespace = $.volumeNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageOSVolumeSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageOSVolumeSourcePatchArgs $;

        public Builder() {
            $ = new StorageOSVolumeSourcePatchArgs();
        }

        public Builder(StorageOSVolumeSourcePatchArgs defaults) {
            $ = new StorageOSVolumeSourcePatchArgs(Objects.requireNonNull(defaults));
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
         * @param readOnly readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secretRef secretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<LocalObjectReferencePatchArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef secretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(LocalObjectReferencePatchArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        /**
         * @param volumeName volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(@Nullable Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        /**
         * @param volumeName volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        /**
         * @param volumeNamespace volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
         * 
         * @return builder
         * 
         */
        public Builder volumeNamespace(@Nullable Output<String> volumeNamespace) {
            $.volumeNamespace = volumeNamespace;
            return this;
        }

        /**
         * @param volumeNamespace volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
         * 
         * @return builder
         * 
         */
        public Builder volumeNamespace(String volumeNamespace) {
            return volumeNamespace(Output.of(volumeNamespace));
        }

        public StorageOSVolumeSourcePatchArgs build() {
            return $;
        }
    }

}
