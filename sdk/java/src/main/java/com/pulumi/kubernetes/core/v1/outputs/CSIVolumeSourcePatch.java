// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.LocalObjectReferencePatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CSIVolumeSourcePatch {
    /**
     * @return driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * 
     */
    private @Nullable String driver;
    /**
     * @return fsType to mount. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
     * 
     */
    private @Nullable LocalObjectReferencePatch nodePublishSecretRef;
    /**
     * @return readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
     * 
     */
    private @Nullable Map<String,String> volumeAttributes;

    private CSIVolumeSourcePatch() {}
    /**
     * @return driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * 
     */
    public Optional<String> driver() {
        return Optional.ofNullable(this.driver);
    }
    /**
     * @return fsType to mount. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
     * 
     */
    public Optional<LocalObjectReferencePatch> nodePublishSecretRef() {
        return Optional.ofNullable(this.nodePublishSecretRef);
    }
    /**
     * @return readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
     * 
     */
    public Map<String,String> volumeAttributes() {
        return this.volumeAttributes == null ? Map.of() : this.volumeAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String driver;
        private @Nullable String fsType;
        private @Nullable LocalObjectReferencePatch nodePublishSecretRef;
        private @Nullable Boolean readOnly;
        private @Nullable Map<String,String> volumeAttributes;
        public Builder() {}
        public Builder(CSIVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.nodePublishSecretRef = defaults.nodePublishSecretRef;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeAttributes = defaults.volumeAttributes;
        }

        @CustomType.Setter
        public Builder driver(@Nullable String driver) {

            this.driver = driver;
            return this;
        }
        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {

            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder nodePublishSecretRef(@Nullable LocalObjectReferencePatch nodePublishSecretRef) {

            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder volumeAttributes(@Nullable Map<String,String> volumeAttributes) {

            this.volumeAttributes = volumeAttributes;
            return this;
        }
        public CSIVolumeSourcePatch build() {
            final var _resultValue = new CSIVolumeSourcePatch();
            _resultValue.driver = driver;
            _resultValue.fsType = fsType;
            _resultValue.nodePublishSecretRef = nodePublishSecretRef;
            _resultValue.readOnly = readOnly;
            _resultValue.volumeAttributes = volumeAttributes;
            return _resultValue;
        }
    }
}
