// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ClusterTrustBundleProjection;
import com.pulumi.kubernetes.core.v1.outputs.ConfigMapProjection;
import com.pulumi.kubernetes.core.v1.outputs.DownwardAPIProjection;
import com.pulumi.kubernetes.core.v1.outputs.SecretProjection;
import com.pulumi.kubernetes.core.v1.outputs.ServiceAccountTokenProjection;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeProjection {
    /**
     * @return ClusterTrustBundle allows a pod to access the `.spec.trustBundle` field of ClusterTrustBundle objects in an auto-updating file.
     * 
     * Alpha, gated by the ClusterTrustBundleProjection feature gate.
     * 
     * ClusterTrustBundle objects can either be selected by name, or by the combination of signer name and a label selector.
     * 
     * Kubelet performs aggressive normalization of the PEM contents written into the pod filesystem.  Esoteric PEM features such as inter-block comments and block headers are stripped.  Certificates are deduplicated. The ordering of certificates within the file is arbitrary, and Kubelet may change the order over time.
     * 
     */
    private @Nullable ClusterTrustBundleProjection clusterTrustBundle;
    /**
     * @return configMap information about the configMap data to project
     * 
     */
    private @Nullable ConfigMapProjection configMap;
    /**
     * @return downwardAPI information about the downwardAPI data to project
     * 
     */
    private @Nullable DownwardAPIProjection downwardAPI;
    /**
     * @return secret information about the secret data to project
     * 
     */
    private @Nullable SecretProjection secret;
    /**
     * @return serviceAccountToken is information about the serviceAccountToken data to project
     * 
     */
    private @Nullable ServiceAccountTokenProjection serviceAccountToken;

    private VolumeProjection() {}
    /**
     * @return ClusterTrustBundle allows a pod to access the `.spec.trustBundle` field of ClusterTrustBundle objects in an auto-updating file.
     * 
     * Alpha, gated by the ClusterTrustBundleProjection feature gate.
     * 
     * ClusterTrustBundle objects can either be selected by name, or by the combination of signer name and a label selector.
     * 
     * Kubelet performs aggressive normalization of the PEM contents written into the pod filesystem.  Esoteric PEM features such as inter-block comments and block headers are stripped.  Certificates are deduplicated. The ordering of certificates within the file is arbitrary, and Kubelet may change the order over time.
     * 
     */
    public Optional<ClusterTrustBundleProjection> clusterTrustBundle() {
        return Optional.ofNullable(this.clusterTrustBundle);
    }
    /**
     * @return configMap information about the configMap data to project
     * 
     */
    public Optional<ConfigMapProjection> configMap() {
        return Optional.ofNullable(this.configMap);
    }
    /**
     * @return downwardAPI information about the downwardAPI data to project
     * 
     */
    public Optional<DownwardAPIProjection> downwardAPI() {
        return Optional.ofNullable(this.downwardAPI);
    }
    /**
     * @return secret information about the secret data to project
     * 
     */
    public Optional<SecretProjection> secret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * @return serviceAccountToken is information about the serviceAccountToken data to project
     * 
     */
    public Optional<ServiceAccountTokenProjection> serviceAccountToken() {
        return Optional.ofNullable(this.serviceAccountToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeProjection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterTrustBundleProjection clusterTrustBundle;
        private @Nullable ConfigMapProjection configMap;
        private @Nullable DownwardAPIProjection downwardAPI;
        private @Nullable SecretProjection secret;
        private @Nullable ServiceAccountTokenProjection serviceAccountToken;
        public Builder() {}
        public Builder(VolumeProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterTrustBundle = defaults.clusterTrustBundle;
    	      this.configMap = defaults.configMap;
    	      this.downwardAPI = defaults.downwardAPI;
    	      this.secret = defaults.secret;
    	      this.serviceAccountToken = defaults.serviceAccountToken;
        }

        @CustomType.Setter
        public Builder clusterTrustBundle(@Nullable ClusterTrustBundleProjection clusterTrustBundle) {

            this.clusterTrustBundle = clusterTrustBundle;
            return this;
        }
        @CustomType.Setter
        public Builder configMap(@Nullable ConfigMapProjection configMap) {

            this.configMap = configMap;
            return this;
        }
        @CustomType.Setter
        public Builder downwardAPI(@Nullable DownwardAPIProjection downwardAPI) {

            this.downwardAPI = downwardAPI;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable SecretProjection secret) {

            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountToken(@Nullable ServiceAccountTokenProjection serviceAccountToken) {

            this.serviceAccountToken = serviceAccountToken;
            return this;
        }
        public VolumeProjection build() {
            final var _resultValue = new VolumeProjection();
            _resultValue.clusterTrustBundle = clusterTrustBundle;
            _resultValue.configMap = configMap;
            _resultValue.downwardAPI = downwardAPI;
            _resultValue.secret = secret;
            _resultValue.serviceAccountToken = serviceAccountToken;
            return _resultValue;
        }
    }
}
