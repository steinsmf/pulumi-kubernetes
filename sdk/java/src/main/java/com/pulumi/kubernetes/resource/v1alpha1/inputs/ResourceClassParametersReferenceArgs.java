// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourceClassParametersReference contains enough information to let you locate the parameters for a ResourceClass.
 * 
 */
public final class ResourceClassParametersReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceClassParametersReferenceArgs Empty = new ResourceClassParametersReferenceArgs();

    /**
     * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    @Import(name="apiGroup")
    private @Nullable Output<String> apiGroup;

    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    public Optional<Output<String>> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }

    /**
     * Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private ResourceClassParametersReferenceArgs() {}

    private ResourceClassParametersReferenceArgs(ResourceClassParametersReferenceArgs $) {
        this.apiGroup = $.apiGroup;
        this.kind = $.kind;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceClassParametersReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceClassParametersReferenceArgs $;

        public Builder() {
            $ = new ResourceClassParametersReferenceArgs();
        }

        public Builder(ResourceClassParametersReferenceArgs defaults) {
            $ = new ResourceClassParametersReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiGroup APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            $.apiGroup = apiGroup;
            return this;
        }

        /**
         * @param apiGroup APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(String apiGroup) {
            return apiGroup(Output.of(apiGroup));
        }

        /**
         * @param kind Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name is the name of resource being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is the name of resource being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public ResourceClassParametersReferenceArgs build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("ResourceClassParametersReferenceArgs", "kind");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ResourceClassParametersReferenceArgs", "name");
            }
            return $;
        }
    }

}
