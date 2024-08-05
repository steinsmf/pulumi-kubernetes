// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlockerVolumeSource {
    /**
     * @return datasetName is Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
     * 
     */
    private @Nullable String datasetName;
    /**
     * @return datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    private @Nullable String datasetUUID;

    private FlockerVolumeSource() {}
    /**
     * @return datasetName is Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
     * 
     */
    public Optional<String> datasetName() {
        return Optional.ofNullable(this.datasetName);
    }
    /**
     * @return datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    public Optional<String> datasetUUID() {
        return Optional.ofNullable(this.datasetUUID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlockerVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datasetName;
        private @Nullable String datasetUUID;
        public Builder() {}
        public Builder(FlockerVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
    	      this.datasetUUID = defaults.datasetUUID;
        }

        @CustomType.Setter
        public Builder datasetName(@Nullable String datasetName) {

            this.datasetName = datasetName;
            return this;
        }
        @CustomType.Setter
        public Builder datasetUUID(@Nullable String datasetUUID) {

            this.datasetUUID = datasetUUID;
            return this;
        }
        public FlockerVolumeSource build() {
            final var _resultValue = new FlockerVolumeSource();
            _resultValue.datasetName = datasetName;
            _resultValue.datasetUUID = datasetUUID;
            return _resultValue;
        }
    }
}
