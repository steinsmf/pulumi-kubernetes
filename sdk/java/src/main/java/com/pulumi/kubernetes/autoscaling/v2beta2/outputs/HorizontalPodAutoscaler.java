// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerSpec;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerStatus;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscaler {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
     * 
     */
    private @Nullable HorizontalPodAutoscalerSpec spec;
    /**
     * @return status is the current information about the autoscaler.
     * 
     */
    private @Nullable HorizontalPodAutoscalerStatus status;

    private HorizontalPodAutoscaler() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
     * 
     */
    public Optional<HorizontalPodAutoscalerSpec> spec() {
        return Optional.ofNullable(this.spec);
    }
    /**
     * @return status is the current information about the autoscaler.
     * 
     */
    public Optional<HorizontalPodAutoscalerStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscaler defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable HorizontalPodAutoscalerSpec spec;
        private @Nullable HorizontalPodAutoscalerStatus status;
        public Builder() {}
        public Builder(HorizontalPodAutoscaler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
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
        public Builder spec(@Nullable HorizontalPodAutoscalerSpec spec) {

            this.spec = spec;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable HorizontalPodAutoscalerStatus status) {

            this.status = status;
            return this;
        }
        public HorizontalPodAutoscaler build() {
            final var _resultValue = new HorizontalPodAutoscaler();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.spec = spec;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
