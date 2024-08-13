// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.resource.v1alpha3.outputs.DeviceAllocationConfiguration;
import com.pulumi.kubernetes.resource.v1alpha3.outputs.DeviceRequestAllocationResult;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeviceAllocationResult {
    /**
     * @return This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.
     * 
     * This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters.
     * 
     */
    private @Nullable List<DeviceAllocationConfiguration> config;
    /**
     * @return Results lists all allocated devices.
     * 
     */
    private @Nullable List<DeviceRequestAllocationResult> results;

    private DeviceAllocationResult() {}
    /**
     * @return This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.
     * 
     * This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters.
     * 
     */
    public List<DeviceAllocationConfiguration> config() {
        return this.config == null ? List.of() : this.config;
    }
    /**
     * @return Results lists all allocated devices.
     * 
     */
    public List<DeviceRequestAllocationResult> results() {
        return this.results == null ? List.of() : this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceAllocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DeviceAllocationConfiguration> config;
        private @Nullable List<DeviceRequestAllocationResult> results;
        public Builder() {}
        public Builder(DeviceAllocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder config(@Nullable List<DeviceAllocationConfiguration> config) {

            this.config = config;
            return this;
        }
        public Builder config(DeviceAllocationConfiguration... config) {
            return config(List.of(config));
        }
        @CustomType.Setter
        public Builder results(@Nullable List<DeviceRequestAllocationResult> results) {

            this.results = results;
            return this;
        }
        public Builder results(DeviceRequestAllocationResult... results) {
            return results(List.of(results));
        }
        public DeviceAllocationResult build() {
            final var _resultValue = new DeviceAllocationResult();
            _resultValue.config = config;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
