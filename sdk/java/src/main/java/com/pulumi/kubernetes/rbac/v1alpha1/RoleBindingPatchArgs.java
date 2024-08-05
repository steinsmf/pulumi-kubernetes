// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaPatchArgs;
import com.pulumi.kubernetes.rbac.v1alpha1.inputs.RoleRefPatchArgs;
import com.pulumi.kubernetes.rbac.v1alpha1.inputs.SubjectPatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleBindingPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleBindingPatchArgs Empty = new RoleBindingPatchArgs();

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

    /**
     * Standard object&#39;s metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaPatchArgs> metadata;

    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Optional<Output<ObjectMetaPatchArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    @Import(name="roleRef")
    private @Nullable Output<RoleRefPatchArgs> roleRef;

    /**
     * @return RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    public Optional<Output<RoleRefPatchArgs>> roleRef() {
        return Optional.ofNullable(this.roleRef);
    }

    /**
     * Subjects holds references to the objects the role applies to.
     * 
     */
    @Import(name="subjects")
    private @Nullable Output<List<SubjectPatchArgs>> subjects;

    /**
     * @return Subjects holds references to the objects the role applies to.
     * 
     */
    public Optional<Output<List<SubjectPatchArgs>>> subjects() {
        return Optional.ofNullable(this.subjects);
    }

    private RoleBindingPatchArgs() {}

    private RoleBindingPatchArgs(RoleBindingPatchArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.roleRef = $.roleRef;
        this.subjects = $.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleBindingPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleBindingPatchArgs $;

        public Builder() {
            $ = new RoleBindingPatchArgs();
        }

        public Builder(RoleBindingPatchArgs defaults) {
            $ = new RoleBindingPatchArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param metadata Standard object&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaPatchArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaPatchArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param roleRef RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
         * 
         * @return builder
         * 
         */
        public Builder roleRef(@Nullable Output<RoleRefPatchArgs> roleRef) {
            $.roleRef = roleRef;
            return this;
        }

        /**
         * @param roleRef RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
         * 
         * @return builder
         * 
         */
        public Builder roleRef(RoleRefPatchArgs roleRef) {
            return roleRef(Output.of(roleRef));
        }

        /**
         * @param subjects Subjects holds references to the objects the role applies to.
         * 
         * @return builder
         * 
         */
        public Builder subjects(@Nullable Output<List<SubjectPatchArgs>> subjects) {
            $.subjects = subjects;
            return this;
        }

        /**
         * @param subjects Subjects holds references to the objects the role applies to.
         * 
         * @return builder
         * 
         */
        public Builder subjects(List<SubjectPatchArgs> subjects) {
            return subjects(Output.of(subjects));
        }

        /**
         * @param subjects Subjects holds references to the objects the role applies to.
         * 
         * @return builder
         * 
         */
        public Builder subjects(SubjectPatchArgs... subjects) {
            return subjects(List.of(subjects));
        }

        public RoleBindingPatchArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
