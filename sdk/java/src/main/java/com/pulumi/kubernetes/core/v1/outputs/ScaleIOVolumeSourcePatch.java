// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.LocalObjectReferencePatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleIOVolumeSourcePatch {
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return gateway is the host address of the ScaleIO API Gateway.
     * 
     */
    private @Nullable String gateway;
    /**
     * @return protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    private @Nullable String protectionDomain;
    /**
     * @return readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    private @Nullable LocalObjectReferencePatch secretRef;
    /**
     * @return sslEnabled Flag enable/disable SSL communication with Gateway, default false
     * 
     */
    private @Nullable Boolean sslEnabled;
    /**
     * @return storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    private @Nullable String storageMode;
    /**
     * @return storagePool is the ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    private @Nullable String storagePool;
    /**
     * @return system is the name of the storage system as configured in ScaleIO.
     * 
     */
    private @Nullable String system;
    /**
     * @return volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    private @Nullable String volumeName;

    private ScaleIOVolumeSourcePatch() {}
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return gateway is the host address of the ScaleIO API Gateway.
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    public Optional<String> protectionDomain() {
        return Optional.ofNullable(this.protectionDomain);
    }
    /**
     * @return readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    public Optional<LocalObjectReferencePatch> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * @return sslEnabled Flag enable/disable SSL communication with Gateway, default false
     * 
     */
    public Optional<Boolean> sslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }
    /**
     * @return storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    public Optional<String> storageMode() {
        return Optional.ofNullable(this.storageMode);
    }
    /**
     * @return storagePool is the ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    public Optional<String> storagePool() {
        return Optional.ofNullable(this.storagePool);
    }
    /**
     * @return system is the name of the storage system as configured in ScaleIO.
     * 
     */
    public Optional<String> system() {
        return Optional.ofNullable(this.system);
    }
    /**
     * @return volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    public Optional<String> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleIOVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable String gateway;
        private @Nullable String protectionDomain;
        private @Nullable Boolean readOnly;
        private @Nullable LocalObjectReferencePatch secretRef;
        private @Nullable Boolean sslEnabled;
        private @Nullable String storageMode;
        private @Nullable String storagePool;
        private @Nullable String system;
        private @Nullable String volumeName;
        public Builder() {}
        public Builder(ScaleIOVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.gateway = defaults.gateway;
    	      this.protectionDomain = defaults.protectionDomain;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.storageMode = defaults.storageMode;
    	      this.storagePool = defaults.storagePool;
    	      this.system = defaults.system;
    	      this.volumeName = defaults.volumeName;
        }

        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {

            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder protectionDomain(@Nullable String protectionDomain) {

            this.protectionDomain = protectionDomain;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder secretRef(@Nullable LocalObjectReferencePatch secretRef) {

            this.secretRef = secretRef;
            return this;
        }
        @CustomType.Setter
        public Builder sslEnabled(@Nullable Boolean sslEnabled) {

            this.sslEnabled = sslEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder storageMode(@Nullable String storageMode) {

            this.storageMode = storageMode;
            return this;
        }
        @CustomType.Setter
        public Builder storagePool(@Nullable String storagePool) {

            this.storagePool = storagePool;
            return this;
        }
        @CustomType.Setter
        public Builder system(@Nullable String system) {

            this.system = system;
            return this;
        }
        @CustomType.Setter
        public Builder volumeName(@Nullable String volumeName) {

            this.volumeName = volumeName;
            return this;
        }
        public ScaleIOVolumeSourcePatch build() {
            final var _resultValue = new ScaleIOVolumeSourcePatch();
            _resultValue.fsType = fsType;
            _resultValue.gateway = gateway;
            _resultValue.protectionDomain = protectionDomain;
            _resultValue.readOnly = readOnly;
            _resultValue.secretRef = secretRef;
            _resultValue.sslEnabled = sslEnabled;
            _resultValue.storageMode = storageMode;
            _resultValue.storagePool = storagePool;
            _resultValue.system = system;
            _resultValue.volumeName = volumeName;
            return _resultValue;
        }
    }
}
