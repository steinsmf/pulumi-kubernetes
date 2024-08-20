// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.resource.v1alpha3.outputs.BasicDevicePatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DevicePatch {
    /**
     * @return Basic defines one device instance.
     * 
     */
    private @Nullable BasicDevicePatch basic;
    /**
     * @return Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
     * 
     */
    private @Nullable String name;

    private DevicePatch() {}
    /**
     * @return Basic defines one device instance.
     * 
     */
    public Optional<BasicDevicePatch> basic() {
        return Optional.ofNullable(this.basic);
    }
    /**
     * @return Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BasicDevicePatch basic;
        private @Nullable String name;
        public Builder() {}
        public Builder(DevicePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basic = defaults.basic;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder basic(@Nullable BasicDevicePatch basic) {

            this.basic = basic;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public DevicePatch build() {
            final var _resultValue = new DevicePatch();
            _resultValue.basic = basic;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}