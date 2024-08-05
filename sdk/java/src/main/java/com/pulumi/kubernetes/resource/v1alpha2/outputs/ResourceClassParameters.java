// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.ResourceClassParametersReference;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.ResourceFilter;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.VendorParameters;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClassParameters {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Filters describes additional contraints that must be met when using the class.
     * 
     */
    private @Nullable List<ResourceFilter> filters;
    /**
     * @return If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
     * 
     */
    private @Nullable ResourceClassParametersReference generatedFrom;
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
     * @return VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
     * 
     */
    private @Nullable List<VendorParameters> vendorParameters;

    private ResourceClassParameters() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Filters describes additional contraints that must be met when using the class.
     * 
     */
    public List<ResourceFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
     * 
     */
    public Optional<ResourceClassParametersReference> generatedFrom() {
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
     * @return VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
     * 
     */
    public List<VendorParameters> vendorParameters() {
        return this.vendorParameters == null ? List.of() : this.vendorParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClassParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable List<ResourceFilter> filters;
        private @Nullable ResourceClassParametersReference generatedFrom;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<VendorParameters> vendorParameters;
        public Builder() {}
        public Builder(ResourceClassParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.filters = defaults.filters;
    	      this.generatedFrom = defaults.generatedFrom;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.vendorParameters = defaults.vendorParameters;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<ResourceFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(ResourceFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder generatedFrom(@Nullable ResourceClassParametersReference generatedFrom) {

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
        public Builder vendorParameters(@Nullable List<VendorParameters> vendorParameters) {

            this.vendorParameters = vendorParameters;
            return this;
        }
        public Builder vendorParameters(VendorParameters... vendorParameters) {
            return vendorParameters(List.of(vendorParameters));
        }
        public ResourceClassParameters build() {
            final var _resultValue = new ResourceClassParameters();
            _resultValue.apiVersion = apiVersion;
            _resultValue.filters = filters;
            _resultValue.generatedFrom = generatedFrom;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.vendorParameters = vendorParameters;
            return _resultValue;
        }
    }
}
