// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.resource.v1alpha1.outputs.PodSchedulingSpec;
import com.pulumi.kubernetes.resource.v1alpha1.outputs.PodSchedulingStatus;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodScheduling {
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
     * @return Standard object metadata
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return Spec describes where resources for the Pod are needed.
     * 
     */
    private PodSchedulingSpec spec;
    /**
     * @return Status describes where resources for the Pod can be allocated.
     * 
     */
    private @Nullable PodSchedulingStatus status;

    private PodScheduling() {}
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
     * @return Standard object metadata
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Spec describes where resources for the Pod are needed.
     * 
     */
    public PodSchedulingSpec spec() {
        return this.spec;
    }
    /**
     * @return Status describes where resources for the Pod can be allocated.
     * 
     */
    public Optional<PodSchedulingStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodScheduling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private PodSchedulingSpec spec;
        private @Nullable PodSchedulingStatus status;
        public Builder() {}
        public Builder(PodScheduling defaults) {
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
        public Builder spec(PodSchedulingSpec spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable PodSchedulingStatus status) {
            this.status = status;
            return this;
        }
        public PodScheduling build() {
            final var o = new PodScheduling();
            o.apiVersion = apiVersion;
            o.kind = kind;
            o.metadata = metadata;
            o.spec = spec;
            o.status = status;
            return o;
        }
    }
}
