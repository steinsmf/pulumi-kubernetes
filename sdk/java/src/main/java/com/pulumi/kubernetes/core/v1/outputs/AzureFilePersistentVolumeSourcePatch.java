// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFilePersistentVolumeSourcePatch {
    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return secretName is the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    private @Nullable String secretName;
    /**
     * @return secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
     * 
     */
    private @Nullable String secretNamespace;
    /**
     * @return shareName is the azure Share Name
     * 
     */
    private @Nullable String shareName;

    private AzureFilePersistentVolumeSourcePatch() {}
    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return secretName is the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    public Optional<String> secretName() {
        return Optional.ofNullable(this.secretName);
    }
    /**
     * @return secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
     * 
     */
    public Optional<String> secretNamespace() {
        return Optional.ofNullable(this.secretNamespace);
    }
    /**
     * @return shareName is the azure Share Name
     * 
     */
    public Optional<String> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFilePersistentVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean readOnly;
        private @Nullable String secretName;
        private @Nullable String secretNamespace;
        private @Nullable String shareName;
        public Builder() {}
        public Builder(AzureFilePersistentVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.secretName = defaults.secretName;
    	      this.secretNamespace = defaults.secretNamespace;
    	      this.shareName = defaults.shareName;
        }

        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder secretName(@Nullable String secretName) {

            this.secretName = secretName;
            return this;
        }
        @CustomType.Setter
        public Builder secretNamespace(@Nullable String secretNamespace) {

            this.secretNamespace = secretNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder shareName(@Nullable String shareName) {

            this.shareName = shareName;
            return this;
        }
        public AzureFilePersistentVolumeSourcePatch build() {
            final var _resultValue = new AzureFilePersistentVolumeSourcePatch();
            _resultValue.readOnly = readOnly;
            _resultValue.secretName = secretName;
            _resultValue.secretNamespace = secretNamespace;
            _resultValue.shareName = shareName;
            return _resultValue;
        }
    }
}
