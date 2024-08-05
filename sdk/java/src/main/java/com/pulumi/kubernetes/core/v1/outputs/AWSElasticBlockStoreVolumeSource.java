// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AWSElasticBlockStoreVolumeSource {
    /**
     * @return fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    private @Nullable String fsType;
    /**
     * @return partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as &#34;1&#34;. Similarly, the volume partition for /dev/sda is &#34;0&#34; (or you can leave the property empty).
     * 
     */
    private @Nullable Integer partition;
    /**
     * @return readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    private String volumeID;

    private AWSElasticBlockStoreVolumeSource() {}
    /**
     * @return fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as &#34;1&#34;. Similarly, the volume partition for /dev/sda is &#34;0&#34; (or you can leave the property empty).
     * 
     */
    public Optional<Integer> partition() {
        return Optional.ofNullable(this.partition);
    }
    /**
     * @return readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    public String volumeID() {
        return this.volumeID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AWSElasticBlockStoreVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Integer partition;
        private @Nullable Boolean readOnly;
        private String volumeID;
        public Builder() {}
        public Builder(AWSElasticBlockStoreVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.partition = defaults.partition;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeID = defaults.volumeID;
        }

        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {

            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder partition(@Nullable Integer partition) {

            this.partition = partition;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder volumeID(String volumeID) {
            if (volumeID == null) {
              throw new MissingRequiredPropertyException("AWSElasticBlockStoreVolumeSource", "volumeID");
            }
            this.volumeID = volumeID;
            return this;
        }
        public AWSElasticBlockStoreVolumeSource build() {
            final var _resultValue = new AWSElasticBlockStoreVolumeSource();
            _resultValue.fsType = fsType;
            _resultValue.partition = partition;
            _resultValue.readOnly = readOnly;
            _resultValue.volumeID = volumeID;
            return _resultValue;
        }
    }
}
