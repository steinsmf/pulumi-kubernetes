// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeSelector;
import com.pulumi.kubernetes.resource.v1alpha3.outputs.DeviceClassConfiguration;
import com.pulumi.kubernetes.resource.v1alpha3.outputs.DeviceSelector;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceClassSpec {
    /**
     * @return Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.
     * 
     * They are passed to the driver, but are not considered while allocating the claim.
     * 
     */
    private @Nullable List<DeviceClassConfiguration> config;
    /**
     * @return Each selector must be satisfied by a device which is claimed via this class.
     * 
     */
    private @Nullable List<DeviceSelector> selectors;
    /**
     * @return Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a claim that has not been allocated yet *and* that claim gets allocated through a control plane controller. It is ignored when the claim does not use a control plane controller for allocation.
     * 
     * Setting this field is optional. If unset, all Nodes are candidates.
     * 
     * This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
     * 
     */
    private @Nullable NodeSelector suitableNodes;

    private DeviceClassSpec() {}
    /**
     * @return Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.
     * 
     * They are passed to the driver, but are not considered while allocating the claim.
     * 
     */
    public List<DeviceClassConfiguration> config() {
        return this.config == null ? List.of() : this.config;
    }
    /**
     * @return Each selector must be satisfied by a device which is claimed via this class.
     * 
     */
    public List<DeviceSelector> selectors() {
        return this.selectors == null ? List.of() : this.selectors;
    }
    /**
     * @return Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a claim that has not been allocated yet *and* that claim gets allocated through a control plane controller. It is ignored when the claim does not use a control plane controller for allocation.
     * 
     * Setting this field is optional. If unset, all Nodes are candidates.
     * 
     * This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
     * 
     */
    public Optional<NodeSelector> suitableNodes() {
        return Optional.ofNullable(this.suitableNodes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceClassSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DeviceClassConfiguration> config;
        private @Nullable List<DeviceSelector> selectors;
        private @Nullable NodeSelector suitableNodes;
        public Builder() {}
        public Builder(DeviceClassSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.selectors = defaults.selectors;
    	      this.suitableNodes = defaults.suitableNodes;
        }

        @CustomType.Setter
        public Builder config(@Nullable List<DeviceClassConfiguration> config) {

            this.config = config;
            return this;
        }
        public Builder config(DeviceClassConfiguration... config) {
            return config(List.of(config));
        }
        @CustomType.Setter
        public Builder selectors(@Nullable List<DeviceSelector> selectors) {

            this.selectors = selectors;
            return this;
        }
        public Builder selectors(DeviceSelector... selectors) {
            return selectors(List.of(selectors));
        }
        @CustomType.Setter
        public Builder suitableNodes(@Nullable NodeSelector suitableNodes) {

            this.suitableNodes = suitableNodes;
            return this;
        }
        public DeviceClassSpec build() {
            final var _resultValue = new DeviceClassSpec();
            _resultValue.config = config;
            _resultValue.selectors = selectors;
            _resultValue.suitableNodes = suitableNodes;
            return _resultValue;
        }
    }
}