// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Subject {
    /**
     * @return APIVersion holds the API group and version of the referenced subject. Defaults to &#34;v1&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io/v1alpha1&#34; for User and Group subjects.
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    private String kind;
    /**
     * @return Name of the object being referenced.
     * 
     */
    private String name;
    /**
     * @return Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
     * 
     */
    private @Nullable String namespace;

    private Subject() {}
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
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the object being referenced.
     * 
     */
    public String name() {
        return this.name;
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

    public static Builder builder(Subject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private String kind;
        private String name;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(Subject defaults) {
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
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("Subject", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("Subject", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        public Subject build() {
            final var _resultValue = new Subject();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
