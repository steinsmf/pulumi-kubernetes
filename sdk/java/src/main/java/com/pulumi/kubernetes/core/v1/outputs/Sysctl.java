// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class Sysctl {
    /**
     * @return Name of a property to set
     * 
     */
    private String name;
    /**
     * @return Value of a property to set
     * 
     */
    private String value;

    private Sysctl() {}
    /**
     * @return Name of a property to set
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of a property to set
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Sysctl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(Sysctl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("Sysctl", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("Sysctl", "value");
            }
            this.value = value;
            return this;
        }
        public Sysctl build() {
            final var _resultValue = new Sysctl();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
