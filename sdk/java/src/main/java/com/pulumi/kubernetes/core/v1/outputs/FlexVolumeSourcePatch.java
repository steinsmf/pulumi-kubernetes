// *** WARNING: this file was generated by pulumi-java-gen. ***
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
public final class FlexVolumeSourcePatch {
    /**
     * @return driver is the name of the driver to use for this volume.
     * 
     */
    private @Nullable String driver;
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return options is Optional: this field holds extra command options if any.
     * 
     */
    private @Nullable Map<String,String> options;
    /**
     * @return readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return secretRef is Optional: secretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    private @Nullable LocalObjectReferencePatch secretRef;

    private FlexVolumeSourcePatch() {}
    /**
     * @return driver is the name of the driver to use for this volume.
     * 
     */
    public Optional<String> driver() {
        return Optional.ofNullable(this.driver);
    }
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return options is Optional: this field holds extra command options if any.
     * 
     */
    public Map<String,String> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return secretRef is Optional: secretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    public Optional<LocalObjectReferencePatch> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String driver;
        private @Nullable String fsType;
        private @Nullable Map<String,String> options;
        private @Nullable Boolean readOnly;
        private @Nullable LocalObjectReferencePatch secretRef;
        public Builder() {}
        public Builder(FlexVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.options = defaults.options;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
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
        public Builder options(@Nullable Map<String,String> options) {

            this.options = options;
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
        public FlexVolumeSourcePatch build() {
            final var _resultValue = new FlexVolumeSourcePatch();
            _resultValue.driver = driver;
            _resultValue.fsType = fsType;
            _resultValue.options = options;
            _resultValue.readOnly = readOnly;
            _resultValue.secretRef = secretRef;
            return _resultValue;
        }
    }
}
