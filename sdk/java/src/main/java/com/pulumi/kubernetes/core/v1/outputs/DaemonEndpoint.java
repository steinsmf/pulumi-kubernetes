// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class DaemonEndpoint {
    /**
     * @return Port number of the given endpoint.
     * 
     */
    private Integer Port;

    private DaemonEndpoint() {}
    /**
     * @return Port number of the given endpoint.
     * 
     */
    public Integer Port() {
        return this.Port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer Port;
        public Builder() {}
        public Builder(DaemonEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.Port = defaults.Port;
        }

        @CustomType.Setter
        public Builder Port(Integer Port) {
            if (Port == null) {
              throw new MissingRequiredPropertyException("DaemonEndpoint", "Port");
            }
            this.Port = Port;
            return this;
        }
        public DaemonEndpoint build() {
            final var _resultValue = new DaemonEndpoint();
            _resultValue.Port = Port;
            return _resultValue;
        }
    }
}
