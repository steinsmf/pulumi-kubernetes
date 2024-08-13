// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.resource.v1alpha3.outputs.BasicDevice;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Device {
    /**
     * @return Basic defines one device instance.
     * 
     */
    private @Nullable BasicDevice basic;
    /**
     * @return Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
     * 
     */
    private String name;

    private Device() {}
    /**
     * @return Basic defines one device instance.
     * 
     */
    public Optional<BasicDevice> basic() {
        return Optional.ofNullable(this.basic);
    }
    /**
     * @return Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Device defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BasicDevice basic;
        private String name;
        public Builder() {}
        public Builder(Device defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basic = defaults.basic;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder basic(@Nullable BasicDevice basic) {

            this.basic = basic;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("Device", "name");
            }
            this.name = name;
            return this;
        }
        public Device build() {
            final var _resultValue = new Device();
            _resultValue.basic = basic;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
