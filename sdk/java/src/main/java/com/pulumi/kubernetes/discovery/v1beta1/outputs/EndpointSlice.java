// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.discovery.v1beta1.outputs.Endpoint;
import com.pulumi.kubernetes.discovery.v1beta1.outputs.EndpointPort;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointSlice {
    /**
     * @return addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     */
    private String addressType;
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    private List<Endpoint> endpoints;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
     * 
     */
    private @Nullable List<EndpointPort> ports;

    private EndpointSlice() {}
    /**
     * @return addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     */
    public String addressType() {
        return this.addressType;
    }
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    public List<Endpoint> endpoints() {
        return this.endpoints;
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
     * 
     */
    public List<EndpointPort> ports() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSlice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressType;
        private @Nullable String apiVersion;
        private List<Endpoint> endpoints;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<EndpointPort> ports;
        public Builder() {}
        public Builder(EndpointSlice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.endpoints = defaults.endpoints;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.ports = defaults.ports;
        }

        @CustomType.Setter
        public Builder addressType(String addressType) {
            if (addressType == null) {
              throw new MissingRequiredPropertyException("EndpointSlice", "addressType");
            }
            this.addressType = addressType;
            return this;
        }
        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(List<Endpoint> endpoints) {
            if (endpoints == null) {
              throw new MissingRequiredPropertyException("EndpointSlice", "endpoints");
            }
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(Endpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ObjectMeta metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<EndpointPort> ports) {

            this.ports = ports;
            return this;
        }
        public Builder ports(EndpointPort... ports) {
            return ports(List.of(ports));
        }
        public EndpointSlice build() {
            final var _resultValue = new EndpointSlice();
            _resultValue.addressType = addressType;
            _resultValue.apiVersion = apiVersion;
            _resultValue.endpoints = endpoints;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.ports = ports;
            return _resultValue;
        }
    }
}
