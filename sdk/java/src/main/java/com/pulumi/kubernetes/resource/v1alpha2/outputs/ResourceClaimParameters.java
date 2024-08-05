// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.DriverRequests;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.ResourceClaimParametersReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClaimParameters {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.
     * 
     * May be empty, in which case the claim can always be allocated.
     * 
     */
    private @Nullable List<DriverRequests> driverRequests;
    /**
     * @return If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the claim parameters when the parameter reference of the claim refers to some unknown type.
     * 
     */
    private @Nullable ResourceClaimParametersReference generatedFrom;
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
     * @return Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.
     * 
     */
    private @Nullable Boolean shareable;

    private ResourceClaimParameters() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.
     * 
     * May be empty, in which case the claim can always be allocated.
     * 
     */
    public List<DriverRequests> driverRequests() {
        return this.driverRequests == null ? List.of() : this.driverRequests;
    }
    /**
     * @return If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the claim parameters when the parameter reference of the claim refers to some unknown type.
     * 
     */
    public Optional<ResourceClaimParametersReference> generatedFrom() {
        return Optional.ofNullable(this.generatedFrom);
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
     * @return Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.
     * 
     */
    public Optional<Boolean> shareable() {
        return Optional.ofNullable(this.shareable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClaimParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable List<DriverRequests> driverRequests;
        private @Nullable ResourceClaimParametersReference generatedFrom;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable Boolean shareable;
        public Builder() {}
        public Builder(ResourceClaimParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.driverRequests = defaults.driverRequests;
    	      this.generatedFrom = defaults.generatedFrom;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.shareable = defaults.shareable;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder driverRequests(@Nullable List<DriverRequests> driverRequests) {

            this.driverRequests = driverRequests;
            return this;
        }
        public Builder driverRequests(DriverRequests... driverRequests) {
            return driverRequests(List.of(driverRequests));
        }
        @CustomType.Setter
        public Builder generatedFrom(@Nullable ResourceClaimParametersReference generatedFrom) {

            this.generatedFrom = generatedFrom;
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
        public Builder shareable(@Nullable Boolean shareable) {

            this.shareable = shareable;
            return this;
        }
        public ResourceClaimParameters build() {
            final var _resultValue = new ResourceClaimParameters();
            _resultValue.apiVersion = apiVersion;
            _resultValue.driverRequests = driverRequests;
            _resultValue.generatedFrom = generatedFrom;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.shareable = shareable;
            return _resultValue;
        }
    }
}
