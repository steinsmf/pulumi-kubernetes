// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import javax.annotation.Nullable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;

/**
 * CustomResourceArgsBase is the base class for a user-defined
 * CustomResourceArgs.
 */
public abstract class CustomResourceArgsBase extends com.pulumi.resources.ResourceArgs {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    @Nullable Output<String> apiVersion;

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
    @Nullable Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Untyped map that holds any user-defined fields.
     * 
     */
    @Nullable Map<String,Output<?>> otherFields;

    /**
     * @return Untyped map that holds any user-defined fields.
     * 
     */
    public Optional<Map<String,Output<?>>> otherFields() {
        return Optional.ofNullable(this.otherFields);
    }

    protected CustomResourceArgsBase() {
    }

    public static class Builder<T extends CustomResourceArgsBase, U extends Builder<T, U>> {
        protected T $;

        protected Builder(T $) {
            this.$ = $;
        }

        protected Builder(T $, T defaults) {
            this($);
            copy(Objects.requireNonNull(defaults));
        }

        protected void copy(T args) {
            $.apiVersion = args.apiVersion;
            $.kind = args.kind;
            $.metadata = args.metadata;
            $.otherFields = args.otherFields;
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public U apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return (U) this;
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public U apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public U kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return (U) this;
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public U kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public U metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return (U) this;
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public U metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param fields Untyped map that holds any user-defined fields (which may be Output values).
         * 
         * @return builder
         * 
         */
        public U otherFields(Map<String, ?> fields) {
            var map = $.otherFields != null ? new LinkedHashMap($.otherFields) : new LinkedHashMap<String, Output>();
            for (var entry : fields.entrySet()) {
                var value = entry.getValue();
                map.put(entry.getKey(), (value instanceof Output) ? (Output) value : Output.of(value));
            }
            $.otherFields = map;
            return (U) this;
        }

        /**
         * @param field The user-defined field name.
         * @param value The field value, which may be an Output value.
         * @return builder
         * 
         */
        public U otherField(String field, Object value) {
            var map = $.otherFields != null ? new LinkedHashMap($.otherFields) : new LinkedHashMap<String, Output>();
            map.put(field, value instanceof Output ? value : Output.of(value));
            $.otherFields = map;
            return (U) this;
        }

        public T build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return (T) $;
        }
    }

}
