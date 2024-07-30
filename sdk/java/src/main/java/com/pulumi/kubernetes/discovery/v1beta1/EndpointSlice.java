// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1beta1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.discovery.v1beta1.EndpointSliceArgs;
import com.pulumi.kubernetes.discovery.v1beta1.outputs.Endpoint;
import com.pulumi.kubernetes.discovery.v1beta1.outputs.EndpointPort;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 * 
 */
@ResourceType(type="kubernetes:discovery.k8s.io/v1beta1:EndpointSlice")
public class EndpointSlice extends com.pulumi.resources.CustomResource {
    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     */
    @Export(name="addressType", refs={String.class}, tree="[0]")
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
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    @Export(name="endpoints", refs={List.class,Endpoint.class}, tree="[0,1]")
    private Output<List<Endpoint>> endpoints;

    /**
     * @return endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    public Output<List<Endpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Standard object&#39;s metadata.
     * 
     */
    @Export(name="metadata", refs={ObjectMeta.class}, tree="[0]")
    private Output<ObjectMeta> metadata;

    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Output<ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
     * 
     */
    @Export(name="ports", refs={List.class,EndpointPort.class}, tree="[0,1]")
    private Output<List<EndpointPort>> ports;

    /**
     * @return ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
     * 
     */
    public Output<List<EndpointPort>> ports() {
        return this.ports;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EndpointSlice(String name) {
        this(name, EndpointSliceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EndpointSlice(String name, EndpointSliceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EndpointSlice(String name, EndpointSliceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:discovery.k8s.io/v1beta1:EndpointSlice", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private EndpointSlice(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:discovery.k8s.io/v1beta1:EndpointSlice", name, null, makeResourceOptions(options, id));
    }

    private static EndpointSliceArgs makeArgs(EndpointSliceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? EndpointSliceArgs.builder() : EndpointSliceArgs.builder(args);
        return builder
            .apiVersion("discovery.k8s.io/v1beta1")
            .kind("EndpointSlice")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:discovery.k8s.io/v1:EndpointSlice").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EndpointSlice get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EndpointSlice(name, id, options);
    }
}
