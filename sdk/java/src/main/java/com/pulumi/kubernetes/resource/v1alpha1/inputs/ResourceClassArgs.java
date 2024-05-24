// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import com.pulumi.kubernetes.resource.v1alpha1.inputs.ResourceClassParametersReferenceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourceClass is used by administrators to influence how resources are allocated.
 * 
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 * 
 */
public final class ResourceClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceClassArgs Empty = new ResourceClassArgs();

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
     * DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
     * 
     * Resource drivers have a unique name in forward domain order (acme.example.com).
     * 
     */
    @Import(name="driverName", required=true)
    private Output<String> driverName;

    /**
     * @return DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
     * 
     * Resource drivers have a unique name in forward domain order (acme.example.com).
     * 
     */
    public Output<String> driverName() {
        return this.driverName;
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
     * Standard object metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object metadata
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
     * 
     */
    @Import(name="parametersRef")
    private @Nullable Output<ResourceClassParametersReferenceArgs> parametersRef;

    /**
     * @return ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
     * 
     */
    public Optional<Output<ResourceClassParametersReferenceArgs>> parametersRef() {
        return Optional.ofNullable(this.parametersRef);
    }

    /**
     * Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
     * 
     * Setting this field is optional. If null, all nodes are candidates.
     * 
     */
    @Import(name="suitableNodes")
    private @Nullable Output<NodeSelectorArgs> suitableNodes;

    /**
     * @return Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
     * 
     * Setting this field is optional. If null, all nodes are candidates.
     * 
     */
    public Optional<Output<NodeSelectorArgs>> suitableNodes() {
        return Optional.ofNullable(this.suitableNodes);
    }

    private ResourceClassArgs() {}

    private ResourceClassArgs(ResourceClassArgs $) {
        this.apiVersion = $.apiVersion;
        this.driverName = $.driverName;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.parametersRef = $.parametersRef;
        this.suitableNodes = $.suitableNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceClassArgs $;

        public Builder() {
            $ = new ResourceClassArgs();
        }

        public Builder(ResourceClassArgs defaults) {
            $ = new ResourceClassArgs(Objects.requireNonNull(defaults));
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
         * @param driverName DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
         * 
         * Resource drivers have a unique name in forward domain order (acme.example.com).
         * 
         * @return builder
         * 
         */
        public Builder driverName(Output<String> driverName) {
            $.driverName = driverName;
            return this;
        }

        /**
         * @param driverName DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
         * 
         * Resource drivers have a unique name in forward domain order (acme.example.com).
         * 
         * @return builder
         * 
         */
        public Builder driverName(String driverName) {
            return driverName(Output.of(driverName));
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
         * @param metadata Standard object metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param parametersRef ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
         * 
         * @return builder
         * 
         */
        public Builder parametersRef(@Nullable Output<ResourceClassParametersReferenceArgs> parametersRef) {
            $.parametersRef = parametersRef;
            return this;
        }

        /**
         * @param parametersRef ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
         * 
         * @return builder
         * 
         */
        public Builder parametersRef(ResourceClassParametersReferenceArgs parametersRef) {
            return parametersRef(Output.of(parametersRef));
        }

        /**
         * @param suitableNodes Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
         * 
         * Setting this field is optional. If null, all nodes are candidates.
         * 
         * @return builder
         * 
         */
        public Builder suitableNodes(@Nullable Output<NodeSelectorArgs> suitableNodes) {
            $.suitableNodes = suitableNodes;
            return this;
        }

        /**
         * @param suitableNodes Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
         * 
         * Setting this field is optional. If null, all nodes are candidates.
         * 
         * @return builder
         * 
         */
        public Builder suitableNodes(NodeSelectorArgs suitableNodes) {
            return suitableNodes(Output.of(suitableNodes));
        }

        public ResourceClassArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            if ($.driverName == null) {
                throw new MissingRequiredPropertyException("ResourceClassArgs", "driverName");
            }
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
