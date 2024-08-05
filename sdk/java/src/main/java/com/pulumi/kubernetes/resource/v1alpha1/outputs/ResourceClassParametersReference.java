// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClassParametersReference {
    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    private @Nullable String apiGroup;
    /**
     * @return Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
     * 
     */
    private String kind;
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    private String name;
    /**
     * @return Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
     * 
     */
    private @Nullable String namespace;

    private ResourceClassParametersReference() {}
    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    public Optional<String> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    /**
     * @return Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClassParametersReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiGroup;
        private String kind;
        private String name;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(ResourceClassParametersReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder apiGroup(@Nullable String apiGroup) {

            this.apiGroup = apiGroup;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("ResourceClassParametersReference", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ResourceClassParametersReference", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        public ResourceClassParametersReference build() {
            final var _resultValue = new ResourceClassParametersReference();
            _resultValue.apiGroup = apiGroup;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
