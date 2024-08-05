// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.google.gson.JsonElement;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.NamedResourcesAllocationResult;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DriverAllocationResult {
    /**
     * @return NamedResources describes the allocation result when using the named resources model.
     * 
     */
    private @Nullable NamedResourcesAllocationResult namedResources;
    /**
     * @return VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.
     * 
     */
    private @Nullable JsonElement vendorRequestParameters;

    private DriverAllocationResult() {}
    /**
     * @return NamedResources describes the allocation result when using the named resources model.
     * 
     */
    public Optional<NamedResourcesAllocationResult> namedResources() {
        return Optional.ofNullable(this.namedResources);
    }
    /**
     * @return VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.
     * 
     */
    public Optional<JsonElement> vendorRequestParameters() {
        return Optional.ofNullable(this.vendorRequestParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DriverAllocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NamedResourcesAllocationResult namedResources;
        private @Nullable JsonElement vendorRequestParameters;
        public Builder() {}
        public Builder(DriverAllocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namedResources = defaults.namedResources;
    	      this.vendorRequestParameters = defaults.vendorRequestParameters;
        }

        @CustomType.Setter
        public Builder namedResources(@Nullable NamedResourcesAllocationResult namedResources) {

            this.namedResources = namedResources;
            return this;
        }
        @CustomType.Setter
        public Builder vendorRequestParameters(@Nullable JsonElement vendorRequestParameters) {

            this.vendorRequestParameters = vendorRequestParameters;
            return this;
        }
        public DriverAllocationResult build() {
            final var _resultValue = new DriverAllocationResult();
            _resultValue.namedResources = namedResources;
            _resultValue.vendorRequestParameters = vendorRequestParameters;
            return _resultValue;
        }
    }
}
