// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaPatchArgs;
import com.pulumi.kubernetes.resource.v1alpha2.inputs.ResourceClassParametersReferencePatchArgs;
import com.pulumi.kubernetes.resource.v1alpha2.inputs.ResourceFilterPatchArgs;
import com.pulumi.kubernetes.resource.v1alpha2.inputs.VendorParametersPatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceClassParametersPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceClassParametersPatchArgs Empty = new ResourceClassParametersPatchArgs();

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
     * Filters describes additional contraints that must be met when using the class.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<ResourceFilterPatchArgs>> filters;

    /**
     * @return Filters describes additional contraints that must be met when using the class.
     * 
     */
    public Optional<Output<List<ResourceFilterPatchArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
     * 
     */
    @Import(name="generatedFrom")
    private @Nullable Output<ResourceClassParametersReferencePatchArgs> generatedFrom;

    /**
     * @return If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
     * 
     */
    public Optional<Output<ResourceClassParametersReferencePatchArgs>> generatedFrom() {
        return Optional.ofNullable(this.generatedFrom);
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
    private @Nullable Output<ObjectMetaPatchArgs> metadata;

    /**
     * @return Standard object metadata
     * 
     */
    public Optional<Output<ObjectMetaPatchArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
     * 
     */
    @Import(name="vendorParameters")
    private @Nullable Output<List<VendorParametersPatchArgs>> vendorParameters;

    /**
     * @return VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
     * 
     */
    public Optional<Output<List<VendorParametersPatchArgs>>> vendorParameters() {
        return Optional.ofNullable(this.vendorParameters);
    }

    private ResourceClassParametersPatchArgs() {}

    private ResourceClassParametersPatchArgs(ResourceClassParametersPatchArgs $) {
        this.apiVersion = $.apiVersion;
        this.filters = $.filters;
        this.generatedFrom = $.generatedFrom;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.vendorParameters = $.vendorParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceClassParametersPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceClassParametersPatchArgs $;

        public Builder() {
            $ = new ResourceClassParametersPatchArgs();
        }

        public Builder(ResourceClassParametersPatchArgs defaults) {
            $ = new ResourceClassParametersPatchArgs(Objects.requireNonNull(defaults));
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
         * @param filters Filters describes additional contraints that must be met when using the class.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<ResourceFilterPatchArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filters describes additional contraints that must be met when using the class.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<ResourceFilterPatchArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Filters describes additional contraints that must be met when using the class.
         * 
         * @return builder
         * 
         */
        public Builder filters(ResourceFilterPatchArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param generatedFrom If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
         * 
         * @return builder
         * 
         */
        public Builder generatedFrom(@Nullable Output<ResourceClassParametersReferencePatchArgs> generatedFrom) {
            $.generatedFrom = generatedFrom;
            return this;
        }

        /**
         * @param generatedFrom If this object was created from some other resource, then this links back to that resource. This field is used to find the in-tree representation of the class parameters when the parameter reference of the class refers to some unknown type.
         * 
         * @return builder
         * 
         */
        public Builder generatedFrom(ResourceClassParametersReferencePatchArgs generatedFrom) {
            return generatedFrom(Output.of(generatedFrom));
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
        public Builder metadata(@Nullable Output<ObjectMetaPatchArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaPatchArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param vendorParameters VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
         * 
         * @return builder
         * 
         */
        public Builder vendorParameters(@Nullable Output<List<VendorParametersPatchArgs>> vendorParameters) {
            $.vendorParameters = vendorParameters;
            return this;
        }

        /**
         * @param vendorParameters VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
         * 
         * @return builder
         * 
         */
        public Builder vendorParameters(List<VendorParametersPatchArgs> vendorParameters) {
            return vendorParameters(Output.of(vendorParameters));
        }

        /**
         * @param vendorParameters VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
         * 
         * @return builder
         * 
         */
        public Builder vendorParameters(VendorParametersPatchArgs... vendorParameters) {
            return vendorParameters(List.of(vendorParameters));
        }

        public ResourceClassParametersPatchArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}