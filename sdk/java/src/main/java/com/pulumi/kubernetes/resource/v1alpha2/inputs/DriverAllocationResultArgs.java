// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.inputs;

import com.google.gson.JsonElement;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.resource.v1alpha2.inputs.NamedResourcesAllocationResultArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DriverAllocationResult contains vendor parameters and the allocation result for one request.
 * 
 */
public final class DriverAllocationResultArgs extends com.pulumi.resources.ResourceArgs {

    public static final DriverAllocationResultArgs Empty = new DriverAllocationResultArgs();

    /**
     * NamedResources describes the allocation result when using the named resources model.
     * 
     */
    @Import(name="namedResources")
    private @Nullable Output<NamedResourcesAllocationResultArgs> namedResources;

    /**
     * @return NamedResources describes the allocation result when using the named resources model.
     * 
     */
    public Optional<Output<NamedResourcesAllocationResultArgs>> namedResources() {
        return Optional.ofNullable(this.namedResources);
    }

    /**
     * VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.
     * 
     */
    @Import(name="vendorRequestParameters")
    private @Nullable Output<JsonElement> vendorRequestParameters;

    /**
     * @return VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.
     * 
     */
    public Optional<Output<JsonElement>> vendorRequestParameters() {
        return Optional.ofNullable(this.vendorRequestParameters);
    }

    private DriverAllocationResultArgs() {}

    private DriverAllocationResultArgs(DriverAllocationResultArgs $) {
        this.namedResources = $.namedResources;
        this.vendorRequestParameters = $.vendorRequestParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DriverAllocationResultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DriverAllocationResultArgs $;

        public Builder() {
            $ = new DriverAllocationResultArgs();
        }

        public Builder(DriverAllocationResultArgs defaults) {
            $ = new DriverAllocationResultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namedResources NamedResources describes the allocation result when using the named resources model.
         * 
         * @return builder
         * 
         */
        public Builder namedResources(@Nullable Output<NamedResourcesAllocationResultArgs> namedResources) {
            $.namedResources = namedResources;
            return this;
        }

        /**
         * @param namedResources NamedResources describes the allocation result when using the named resources model.
         * 
         * @return builder
         * 
         */
        public Builder namedResources(NamedResourcesAllocationResultArgs namedResources) {
            return namedResources(Output.of(namedResources));
        }

        /**
         * @param vendorRequestParameters VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.
         * 
         * @return builder
         * 
         */
        public Builder vendorRequestParameters(@Nullable Output<JsonElement> vendorRequestParameters) {
            $.vendorRequestParameters = vendorRequestParameters;
            return this;
        }

        /**
         * @param vendorRequestParameters VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.
         * 
         * @return builder
         * 
         */
        public Builder vendorRequestParameters(JsonElement vendorRequestParameters) {
            return vendorRequestParameters(Output.of(vendorRequestParameters));
        }

        public DriverAllocationResultArgs build() {
            return $;
        }
    }

}