// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostAlias {
    /**
     * @return Hostnames for the above IP address.
     * 
     */
    private @Nullable List<String> hostnames;
    /**
     * @return IP address of the host file entry.
     * 
     */
    private @Nullable String ip;

    private HostAlias() {}
    /**
     * @return Hostnames for the above IP address.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames == null ? List.of() : this.hostnames;
    }
    /**
     * @return IP address of the host file entry.
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAlias defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> hostnames;
        private @Nullable String ip;
        public Builder() {}
        public Builder(HostAlias defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.ip = defaults.ip;
        }

        @CustomType.Setter
        public Builder hostnames(@Nullable List<String> hostnames) {

            this.hostnames = hostnames;
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        public HostAlias build() {
            final var _resultValue = new HostAlias();
            _resultValue.hostnames = hostnames;
            _resultValue.ip = ip;
            return _resultValue;
        }
    }
}
