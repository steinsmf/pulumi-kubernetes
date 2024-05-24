// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFileVolumeSource {
    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return secretName is the  name of secret that contains Azure Storage Account Name and Key
     * 
     */
    private String secretName;
    /**
     * @return shareName is the azure share Name
     * 
     */
    private String shareName;

    private AzureFileVolumeSource() {}
    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return secretName is the  name of secret that contains Azure Storage Account Name and Key
     * 
     */
    public String secretName() {
        return this.secretName;
    }
    /**
     * @return shareName is the azure share Name
     * 
     */
    public String shareName() {
        return this.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean readOnly;
        private String secretName;
        private String shareName;
        public Builder() {}
        public Builder(AzureFileVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.secretName = defaults.secretName;
    	      this.shareName = defaults.shareName;
        }

        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder secretName(String secretName) {
            if (secretName == null) {
              throw new MissingRequiredPropertyException("AzureFileVolumeSource", "secretName");
            }
            this.secretName = secretName;
            return this;
        }
        @CustomType.Setter
        public Builder shareName(String shareName) {
            if (shareName == null) {
              throw new MissingRequiredPropertyException("AzureFileVolumeSource", "shareName");
            }
            this.shareName = shareName;
            return this;
        }
        public AzureFileVolumeSource build() {
            final var _resultValue = new AzureFileVolumeSource();
            _resultValue.readOnly = readOnly;
            _resultValue.secretName = secretName;
            _resultValue.shareName = shareName;
            return _resultValue;
        }
    }
}
