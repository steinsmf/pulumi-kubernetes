// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubjectPatch {
    /**
     * @return APIVersion holds the API group and version of the referenced subject. Defaults to &#34;v1&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io/v1alpha1&#34; for User and Group subjects.
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Name of the object being referenced.
     * 
     */
    private @Nullable String name;
    /**
     * @return Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
     * 
     */
    private @Nullable String namespace;

    private SubjectPatch() {}
    /**
     * @return APIVersion holds the API group and version of the referenced subject. Defaults to &#34;v1&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io/v1alpha1&#34; for User and Group subjects.
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Name of the object being referenced.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(SubjectPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
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
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        public SubjectPatch build() {
            final var _resultValue = new SubjectPatch();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
