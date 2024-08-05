// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetSpecArgs;
import com.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetStatusArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
 *  - Network: A single stable DNS and hostname.
 *  - Storage: As many VolumeClaims as requested.
 *    The StatefulSet guarantees that a given network identity will always map to the same storage identity.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The value of &#39;spec.replicas&#39; matches &#39;.status.replicas&#39;, &#39;.status.currentReplicas&#39;,
 *    and &#39;.status.readyReplicas&#39;.
 * 2. The value of &#39;.status.updateRevision&#39; matches &#39;.status.currentRevision&#39;.
 * 
 * If the StatefulSet has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the &#39;customTimeouts&#39; option on the resource.
 * 
 */
public final class StatefulSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetArgs Empty = new StatefulSetArgs();

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
     * Spec defines the desired identities of pods in this set.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<StatefulSetSpecArgs> spec;

    /**
     * @return Spec defines the desired identities of pods in this set.
     * 
     */
    public Optional<Output<StatefulSetSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
     */
    @Import(name="status")
    private @Nullable Output<StatefulSetStatusArgs> status;

    /**
     * @return Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
     */
    public Optional<Output<StatefulSetStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private StatefulSetArgs() {}

    private StatefulSetArgs(StatefulSetArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetArgs $;

        public Builder() {
            $ = new StatefulSetArgs();
        }

        public Builder(StatefulSetArgs defaults) {
            $ = new StatefulSetArgs(Objects.requireNonNull(defaults));
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
         * @param spec Spec defines the desired identities of pods in this set.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<StatefulSetSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Spec defines the desired identities of pods in this set.
         * 
         * @return builder
         * 
         */
        public Builder spec(StatefulSetSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<StatefulSetStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
         * 
         * @return builder
         * 
         */
        public Builder status(StatefulSetStatusArgs status) {
            return status(Output.of(status));
        }

        public StatefulSetArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
