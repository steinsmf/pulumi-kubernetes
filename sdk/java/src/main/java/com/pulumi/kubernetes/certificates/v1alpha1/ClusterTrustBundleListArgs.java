// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.certificates.v1alpha1.inputs.ClusterTrustBundleArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ListMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTrustBundleListArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTrustBundleListArgs Empty = new ClusterTrustBundleListArgs();

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
     * items is a collection of ClusterTrustBundle objects
     * 
     */
    @Import(name="items", required=true)
    private Output<List<ClusterTrustBundleArgs>> items;

    /**
     * @return items is a collection of ClusterTrustBundle objects
     * 
     */
    public Output<List<ClusterTrustBundleArgs>> items() {
        return this.items;
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
     * metadata contains the list metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ListMetaArgs> metadata;

    /**
     * @return metadata contains the list metadata.
     * 
     */
    public Optional<Output<ListMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    private ClusterTrustBundleListArgs() {}

    private ClusterTrustBundleListArgs(ClusterTrustBundleListArgs $) {
        this.apiVersion = $.apiVersion;
        this.items = $.items;
        this.kind = $.kind;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTrustBundleListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTrustBundleListArgs $;

        public Builder() {
            $ = new ClusterTrustBundleListArgs();
        }

        public Builder(ClusterTrustBundleListArgs defaults) {
            $ = new ClusterTrustBundleListArgs(Objects.requireNonNull(defaults));
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
         * @param items items is a collection of ClusterTrustBundle objects
         * 
         * @return builder
         * 
         */
        public Builder items(Output<List<ClusterTrustBundleArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items items is a collection of ClusterTrustBundle objects
         * 
         * @return builder
         * 
         */
        public Builder items(List<ClusterTrustBundleArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items items is a collection of ClusterTrustBundle objects
         * 
         * @return builder
         * 
         */
        public Builder items(ClusterTrustBundleArgs... items) {
            return items(List.of(items));
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
         * @param metadata metadata contains the list metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ListMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata metadata contains the list metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(ListMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        public ClusterTrustBundleListArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            if ($.items == null) {
                throw new MissingRequiredPropertyException("ClusterTrustBundleListArgs", "items");
            }
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
