// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.rbac.v1beta1.outputs.RoleRef;
import com.pulumi.kubernetes.rbac.v1beta1.outputs.Subject;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRoleBinding {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    private RoleRef roleRef;
    /**
     * @return Subjects holds references to the objects the role applies to.
     * 
     */
    private @Nullable List<Subject> subjects;

    private ClusterRoleBinding() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    public RoleRef roleRef() {
        return this.roleRef;
    }
    /**
     * @return Subjects holds references to the objects the role applies to.
     * 
     */
    public List<Subject> subjects() {
        return this.subjects == null ? List.of() : this.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRoleBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private RoleRef roleRef;
        private @Nullable List<Subject> subjects;
        public Builder() {}
        public Builder(ClusterRoleBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.roleRef = defaults.roleRef;
    	      this.subjects = defaults.subjects;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ObjectMeta metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder roleRef(RoleRef roleRef) {
            if (roleRef == null) {
              throw new MissingRequiredPropertyException("ClusterRoleBinding", "roleRef");
            }
            this.roleRef = roleRef;
            return this;
        }
        @CustomType.Setter
        public Builder subjects(@Nullable List<Subject> subjects) {

            this.subjects = subjects;
            return this;
        }
        public Builder subjects(Subject... subjects) {
            return subjects(List.of(subjects));
        }
        public ClusterRoleBinding build() {
            final var _resultValue = new ClusterRoleBinding();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.roleRef = roleRef;
            _resultValue.subjects = subjects;
            return _resultValue;
        }
    }
}
