// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.resource.v1alpha3.outputs.DeviceClassSpec;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceClass {
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
     * @return Spec defines what can be allocated and how to configure it.
     * 
     * This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
     * 
     * Changing the spec automatically increments the metadata.generation number.
     * 
     */
    private DeviceClassSpec spec;

    private DeviceClass() {}
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
     * @return Spec defines what can be allocated and how to configure it.
     * 
     * This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
     * 
     * Changing the spec automatically increments the metadata.generation number.
     * 
     */
    public DeviceClassSpec spec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private DeviceClassSpec spec;
        public Builder() {}
        public Builder(DeviceClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
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
        public Builder spec(DeviceClassSpec spec) {
            if (spec == null) {
              throw new MissingRequiredPropertyException("DeviceClass", "spec");
            }
            this.spec = spec;
            return this;
        }
        public DeviceClass build() {
            final var _resultValue = new DeviceClass();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.spec = spec;
            return _resultValue;
        }
    }
}
