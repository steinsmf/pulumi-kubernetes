// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
 * 
 */
public final class FlexPersistentVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexPersistentVolumeSourceArgs Empty = new FlexPersistentVolumeSourceArgs();

    /**
     * driver is the name of the driver to use for this volume.
     * 
     */
    @Import(name="driver", required=true)
    private Output<String> driver;

    /**
     * @return driver is the name of the driver to use for this volume.
     * 
     */
    public Output<String> driver() {
        return this.driver;
    }

    /**
     * fsType is the Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType is the Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * options is Optional: this field holds extra command options if any.
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    /**
     * @return options is Optional: this field holds extra command options if any.
     * 
     */
    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<SecretReferenceArgs> secretRef;

    /**
     * @return secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    public Optional<Output<SecretReferenceArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    private FlexPersistentVolumeSourceArgs() {}

    private FlexPersistentVolumeSourceArgs(FlexPersistentVolumeSourceArgs $) {
        this.driver = $.driver;
        this.fsType = $.fsType;
        this.options = $.options;
        this.readOnly = $.readOnly;
        this.secretRef = $.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexPersistentVolumeSourceArgs $;

        public Builder() {
            $ = new FlexPersistentVolumeSourceArgs();
        }

        public Builder(FlexPersistentVolumeSourceArgs defaults) {
            $ = new FlexPersistentVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param driver driver is the name of the driver to use for this volume.
         * 
         * @return builder
         * 
         */
        public Builder driver(Output<String> driver) {
            $.driver = driver;
            return this;
        }

        /**
         * @param driver driver is the name of the driver to use for this volume.
         * 
         * @return builder
         * 
         */
        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        /**
         * @param fsType fsType is the Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType is the Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param options options is Optional: this field holds extra command options if any.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options options is Optional: this field holds extra command options if any.
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        /**
         * @param readOnly readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secretRef secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<SecretReferenceArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(SecretReferenceArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        public FlexPersistentVolumeSourceArgs build() {
            if ($.driver == null) {
                throw new MissingRequiredPropertyException("FlexPersistentVolumeSourceArgs", "driver");
            }
            return $;
        }
    }

}
