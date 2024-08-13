// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HostIP {
    /**
     * @return IP is the IP address assigned to the host
     * 
     */
    private String ip;

    private HostIP() {}
    /**
     * @return IP is the IP address assigned to the host
     * 
     */
    public String ip() {
        return this.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostIP defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ip;
        public Builder() {}
        public Builder(HostIP defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
        }

        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("HostIP", "ip");
            }
            this.ip = ip;
            return this;
        }
        public HostIP build() {
            final var _resultValue = new HostIP();
            _resultValue.ip = ip;
            return _resultValue;
        }
    }
}
