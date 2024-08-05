// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.LocalObjectReference;
import com.pulumi.kubernetes.core.v1.outputs.ObjectReference;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceAccount {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
     * 
     */
    private @Nullable Boolean automountServiceAccountToken;
    /**
     * @return ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     * 
     */
    private @Nullable List<LocalObjectReference> imagePullSecrets;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return Secrets is a list of the secrets in the same namespace that pods running using this ServiceAccount are allowed to use. Pods are only limited to this list if this service account has a &#34;kubernetes.io/enforce-mountable-secrets&#34; annotation set to &#34;true&#34;. This field should not be used to find auto-generated service account token secrets for use outside of pods. Instead, tokens can be requested directly using the TokenRequest API, or service account token secrets can be manually created. More info: https://kubernetes.io/docs/concepts/configuration/secret
     * 
     */
    private @Nullable List<ObjectReference> secrets;

    private ServiceAccount() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
     * 
     */
    public Optional<Boolean> automountServiceAccountToken() {
        return Optional.ofNullable(this.automountServiceAccountToken);
    }
    /**
     * @return ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     * 
     */
    public List<LocalObjectReference> imagePullSecrets() {
        return this.imagePullSecrets == null ? List.of() : this.imagePullSecrets;
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Secrets is a list of the secrets in the same namespace that pods running using this ServiceAccount are allowed to use. Pods are only limited to this list if this service account has a &#34;kubernetes.io/enforce-mountable-secrets&#34; annotation set to &#34;true&#34;. This field should not be used to find auto-generated service account token secrets for use outside of pods. Instead, tokens can be requested directly using the TokenRequest API, or service account token secrets can be manually created. More info: https://kubernetes.io/docs/concepts/configuration/secret
     * 
     */
    public List<ObjectReference> secrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable Boolean automountServiceAccountToken;
        private @Nullable List<LocalObjectReference> imagePullSecrets;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<ObjectReference> secrets;
        public Builder() {}
        public Builder(ServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.automountServiceAccountToken = defaults.automountServiceAccountToken;
    	      this.imagePullSecrets = defaults.imagePullSecrets;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.secrets = defaults.secrets;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder automountServiceAccountToken(@Nullable Boolean automountServiceAccountToken) {

            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }
        @CustomType.Setter
        public Builder imagePullSecrets(@Nullable List<LocalObjectReference> imagePullSecrets) {

            this.imagePullSecrets = imagePullSecrets;
            return this;
        }
        public Builder imagePullSecrets(LocalObjectReference... imagePullSecrets) {
            return imagePullSecrets(List.of(imagePullSecrets));
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ObjectMeta metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder secrets(@Nullable List<ObjectReference> secrets) {

            this.secrets = secrets;
            return this;
        }
        public Builder secrets(ObjectReference... secrets) {
            return secrets(List.of(secrets));
        }
        public ServiceAccount build() {
            final var _resultValue = new ServiceAccount();
            _resultValue.apiVersion = apiVersion;
            _resultValue.automountServiceAccountToken = automountServiceAccountToken;
            _resultValue.imagePullSecrets = imagePullSecrets;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.secrets = secrets;
            return _resultValue;
        }
    }
}
