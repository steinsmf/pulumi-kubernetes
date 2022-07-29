// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.certificates.v1beta1.inputs.CertificateSigningRequestSpecArgs;
import com.pulumi.kubernetes.certificates.v1beta1.inputs.CertificateSigningRequestStatusArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a certificate signing request
 * 
 */
public final class CertificateSigningRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestArgs Empty = new CertificateSigningRequestArgs();

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
     * The certificate request itself and any additional information.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<CertificateSigningRequestSpecArgs> spec;

    /**
     * @return The certificate request itself and any additional information.
     * 
     */
    public Optional<Output<CertificateSigningRequestSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * Derived information about the request.
     * 
     */
    @Import(name="status")
    private @Nullable Output<CertificateSigningRequestStatusArgs> status;

    /**
     * @return Derived information about the request.
     * 
     */
    public Optional<Output<CertificateSigningRequestStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private CertificateSigningRequestArgs() {}

    private CertificateSigningRequestArgs(CertificateSigningRequestArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateSigningRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateSigningRequestArgs $;

        public Builder() {
            $ = new CertificateSigningRequestArgs();
        }

        public Builder(CertificateSigningRequestArgs defaults) {
            $ = new CertificateSigningRequestArgs(Objects.requireNonNull(defaults));
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
         * @param spec The certificate request itself and any additional information.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<CertificateSigningRequestSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The certificate request itself and any additional information.
         * 
         * @return builder
         * 
         */
        public Builder spec(CertificateSigningRequestSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status Derived information about the request.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<CertificateSigningRequestStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Derived information about the request.
         * 
         * @return builder
         * 
         */
        public Builder status(CertificateSigningRequestStatusArgs status) {
            return status(Output.of(status));
        }

        public CertificateSigningRequestArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}