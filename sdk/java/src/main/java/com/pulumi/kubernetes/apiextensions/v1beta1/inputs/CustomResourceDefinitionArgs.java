// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.apiextensions.v1beta1.inputs.CustomResourceDefinitionSpecArgs;
import com.pulumi.kubernetes.apiextensions.v1beta1.inputs.CustomResourceDefinitionStatusArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format &lt;.spec.name&gt;.&lt;.spec.group&gt;. Deprecated in v1.16, planned for removal in v1.19. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
 * 
 */
public final class CustomResourceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionArgs Empty = new CustomResourceDefinitionArgs();

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

    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * spec describes how the user wants the resources to appear
     * 
     */
    @Import(name="spec", required=true)
    private Output<CustomResourceDefinitionSpecArgs> spec;

    /**
     * @return spec describes how the user wants the resources to appear
     * 
     */
    public Output<CustomResourceDefinitionSpecArgs> spec() {
        return this.spec;
    }

    /**
     * status indicates the actual state of the CustomResourceDefinition
     * 
     */
    @Import(name="status")
    private @Nullable Output<CustomResourceDefinitionStatusArgs> status;

    /**
     * @return status indicates the actual state of the CustomResourceDefinition
     * 
     */
    public Optional<Output<CustomResourceDefinitionStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private CustomResourceDefinitionArgs() {}

    private CustomResourceDefinitionArgs(CustomResourceDefinitionArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceDefinitionArgs $;

        public Builder() {
            $ = new CustomResourceDefinitionArgs();
        }

        public Builder(CustomResourceDefinitionArgs defaults) {
            $ = new CustomResourceDefinitionArgs(Objects.requireNonNull(defaults));
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

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param spec spec describes how the user wants the resources to appear
         * 
         * @return builder
         * 
         */
        public Builder spec(Output<CustomResourceDefinitionSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec spec describes how the user wants the resources to appear
         * 
         * @return builder
         * 
         */
        public Builder spec(CustomResourceDefinitionSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status status indicates the actual state of the CustomResourceDefinition
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<CustomResourceDefinitionStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status status indicates the actual state of the CustomResourceDefinition
         * 
         * @return builder
         * 
         */
        public Builder status(CustomResourceDefinitionStatusArgs status) {
            return status(Output.of(status));
        }

        public CustomResourceDefinitionArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            if ($.spec == null) {
                throw new MissingRequiredPropertyException("CustomResourceDefinitionArgs", "spec");
            }
            return $;
        }
    }

}
