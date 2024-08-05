// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta.v1.inputs.ListMetaArgs;
import com.pulumi.kubernetes.meta.v1.inputs.StatusDetailsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatusArgs Empty = new StatusArgs();

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
     * Suggested HTTP return code for this status, 0 if not set.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Integer> code;

    /**
     * @return Suggested HTTP return code for this status, 0 if not set.
     * 
     */
    public Optional<Output<Integer>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
     * 
     */
    @Import(name="details")
    private @Nullable Output<StatusDetailsArgs> details;

    /**
     * @return Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
     * 
     */
    public Optional<Output<StatusDetailsArgs>> details() {
        return Optional.ofNullable(this.details);
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
     * A human-readable description of the status of this operation.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A human-readable description of the status of this operation.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ListMetaArgs> metadata;

    /**
     * @return Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<ListMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * A machine-readable description of why this operation is in the &#34;Failure&#34; status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return A machine-readable description of why this operation is in the &#34;Failure&#34; status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    private StatusArgs() {}

    private StatusArgs(StatusArgs $) {
        this.apiVersion = $.apiVersion;
        this.code = $.code;
        this.details = $.details;
        this.kind = $.kind;
        this.message = $.message;
        this.metadata = $.metadata;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusArgs $;

        public Builder() {
            $ = new StatusArgs();
        }

        public Builder(StatusArgs defaults) {
            $ = new StatusArgs(Objects.requireNonNull(defaults));
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
         * @param code Suggested HTTP return code for this status, 0 if not set.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<Integer> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Suggested HTTP return code for this status, 0 if not set.
         * 
         * @return builder
         * 
         */
        public Builder code(Integer code) {
            return code(Output.of(code));
        }

        /**
         * @param details Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<StatusDetailsArgs> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
         * 
         * @return builder
         * 
         */
        public Builder details(StatusDetailsArgs details) {
            return details(Output.of(details));
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
         * @param message A human-readable description of the status of this operation.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A human-readable description of the status of this operation.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param metadata Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ListMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder metadata(ListMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param reason A machine-readable description of why this operation is in the &#34;Failure&#34; status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason A machine-readable description of why this operation is in the &#34;Failure&#34; status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public StatusArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
