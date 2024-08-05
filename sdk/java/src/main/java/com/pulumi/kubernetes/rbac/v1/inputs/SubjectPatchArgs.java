// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 * 
 */
public final class SubjectPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubjectPatchArgs Empty = new SubjectPatchArgs();

    /**
     * APIGroup holds the API group of the referenced subject. Defaults to &#34;&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io&#34; for User and Group subjects.
     * 
     */
    @Import(name="apiGroup")
    private @Nullable Output<String> apiGroup;

    /**
     * @return APIGroup holds the API group of the referenced subject. Defaults to &#34;&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io&#34; for User and Group subjects.
     * 
     */
    public Optional<Output<String>> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }

    /**
     * Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the object being referenced.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the object being referenced.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private SubjectPatchArgs() {}

    private SubjectPatchArgs(SubjectPatchArgs $) {
        this.apiGroup = $.apiGroup;
        this.kind = $.kind;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubjectPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectPatchArgs $;

        public Builder() {
            $ = new SubjectPatchArgs();
        }

        public Builder(SubjectPatchArgs defaults) {
            $ = new SubjectPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiGroup APIGroup holds the API group of the referenced subject. Defaults to &#34;&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io&#34; for User and Group subjects.
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            $.apiGroup = apiGroup;
            return this;
        }

        /**
         * @param apiGroup APIGroup holds the API group of the referenced subject. Defaults to &#34;&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io&#34; for User and Group subjects.
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(String apiGroup) {
            return apiGroup(Output.of(apiGroup));
        }

        /**
         * @param kind Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public SubjectPatchArgs build() {
            return $;
        }
    }

}
