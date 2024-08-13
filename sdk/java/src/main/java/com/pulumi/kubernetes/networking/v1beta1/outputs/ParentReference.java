// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParentReference {
    /**
     * @return Group is the group of the object being referenced.
     * 
     */
    private @Nullable String group;
    /**
     * @return Name is the name of the object being referenced.
     * 
     */
    private String name;
    /**
     * @return Namespace is the namespace of the object being referenced.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return Resource is the resource of the object being referenced.
     * 
     */
    private String resource;

    private ParentReference() {}
    /**
     * @return Group is the group of the object being referenced.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return Name is the name of the object being referenced.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Namespace is the namespace of the object being referenced.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return Resource is the resource of the object being referenced.
     * 
     */
    public String resource() {
        return this.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParentReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private String name;
        private @Nullable String namespace;
        private String resource;
        public Builder() {}
        public Builder(ParentReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ParentReference", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder resource(String resource) {
            if (resource == null) {
              throw new MissingRequiredPropertyException("ParentReference", "resource");
            }
            this.resource = resource;
            return this;
        }
        public ParentReference build() {
            final var _resultValue = new ParentReference();
            _resultValue.group = group;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.resource = resource;
            return _resultValue;
        }
    }
}
