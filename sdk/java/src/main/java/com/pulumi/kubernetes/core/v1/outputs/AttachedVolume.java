// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AttachedVolume {
    /**
     * @return DevicePath represents the device path where the volume should be available
     * 
     */
    private String devicePath;
    /**
     * @return Name of the attached volume
     * 
     */
    private String name;

    private AttachedVolume() {}
    /**
     * @return DevicePath represents the device path where the volume should be available
     * 
     */
    public String devicePath() {
        return this.devicePath;
    }
    /**
     * @return Name of the attached volume
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String devicePath;
        private String name;
        public Builder() {}
        public Builder(AttachedVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePath = defaults.devicePath;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder devicePath(String devicePath) {
            if (devicePath == null) {
              throw new MissingRequiredPropertyException("AttachedVolume", "devicePath");
            }
            this.devicePath = devicePath;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AttachedVolume", "name");
            }
            this.name = name;
            return this;
        }
        public AttachedVolume build() {
            final var _resultValue = new AttachedVolume();
            _resultValue.devicePath = devicePath;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
