// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.discovery.v1.inputs.EndpointArgs;
import com.pulumi.kubernetes.discovery.v1.inputs.EndpointPortArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointSliceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointSliceArgs Empty = new EndpointSliceArgs();

    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     */
    @Import(name="addressType", required=true)
    private Output<String> addressType;

    /**
     * @return addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     */
    public Output<String> addressType() {
        return this.addressType;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    @Import(name="endpoints", required=true)
    private Output<List<EndpointArgs>> endpoints;

    /**
     * @return endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    public Output<List<EndpointArgs>> endpoints() {
        return this.endpoints;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard object&#39;s metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<EndpointPortArgs>> ports;

    /**
     * @return ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
     * 
     */
    public Optional<Output<List<EndpointPortArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private EndpointSliceArgs() {}

    private EndpointSliceArgs(EndpointSliceArgs $) {
        this.addressType = $.addressType;
        this.apiVersion = $.apiVersion;
        this.endpoints = $.endpoints;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointSliceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointSliceArgs $;

        public Builder() {
            $ = new EndpointSliceArgs();
        }

        public Builder(EndpointSliceArgs defaults) {
            $ = new EndpointSliceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressType addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
         * 
         * @return builder
         * 
         */
        public Builder addressType(Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        /**
         * @param addressType addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
         * 
         * @return builder
         * 
         */
        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param endpoints endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(Output<List<EndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<EndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(EndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param metadata Standard object&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param ports ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<EndpointPortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<EndpointPortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
         * 
         * @return builder
         * 
         */
        public Builder ports(EndpointPortArgs... ports) {
            return ports(List.of(ports));
        }

        public EndpointSliceArgs build() {
            if ($.addressType == null) {
                throw new MissingRequiredPropertyException("EndpointSliceArgs", "addressType");
            }
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            if ($.endpoints == null) {
                throw new MissingRequiredPropertyException("EndpointSliceArgs", "endpoints");
            }
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
