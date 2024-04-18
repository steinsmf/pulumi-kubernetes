// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import com.pulumi.kubernetes.resource.v1alpha2.inputs.NamedResourcesResourcesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceSliceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSliceArgs Empty = new ResourceSliceArgs();

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
     * DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
     * 
     */
    @Import(name="driverName", required=true)
    private Output<String> driverName;

    /**
     * @return DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
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
     * NamedResources describes available resources using the named resources model.
     * 
     */
    @Import(name="namedResources")
    private @Nullable Output<NamedResourcesResourcesArgs> namedResources;

    /**
     * @return NamedResources describes available resources using the named resources model.
     * 
     */
    public Optional<Output<NamedResourcesResourcesArgs>> namedResources() {
        return Optional.ofNullable(this.namedResources);
    }

    /**
     * NodeName identifies the node which provides the resources if they are local to a node.
     * 
     * A field selector can be used to list only ResourceSlice objects with a certain node name.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return NodeName identifies the node which provides the resources if they are local to a node.
     * 
     * A field selector can be used to list only ResourceSlice objects with a certain node name.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    private ResourceSliceArgs() {}

    private ResourceSliceArgs(ResourceSliceArgs $) {
        this.apiVersion = $.apiVersion;
        this.driverName = $.driverName;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.namedResources = $.namedResources;
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSliceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSliceArgs $;

        public Builder() {
            $ = new ResourceSliceArgs();
        }

        public Builder(ResourceSliceArgs defaults) {
            $ = new ResourceSliceArgs(Objects.requireNonNull(defaults));
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
         * @param driverName DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
         * 
         * @return builder
         * 
         */
        public Builder driverName(Output<String> driverName) {
            $.driverName = driverName;
            return this;
        }

        /**
         * @param driverName DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
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
         * @param namedResources NamedResources describes available resources using the named resources model.
         * 
         * @return builder
         * 
         */
        public Builder namedResources(@Nullable Output<NamedResourcesResourcesArgs> namedResources) {
            $.namedResources = namedResources;
            return this;
        }

        /**
         * @param namedResources NamedResources describes available resources using the named resources model.
         * 
         * @return builder
         * 
         */
        public Builder namedResources(NamedResourcesResourcesArgs namedResources) {
            return namedResources(Output.of(namedResources));
        }

        /**
         * @param nodeName NodeName identifies the node which provides the resources if they are local to a node.
         * 
         * A field selector can be used to list only ResourceSlice objects with a certain node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName NodeName identifies the node which provides the resources if they are local to a node.
         * 
         * A field selector can be used to list only ResourceSlice objects with a certain node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public ResourceSliceArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.driverName = Objects.requireNonNull($.driverName, "expected parameter 'driverName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
