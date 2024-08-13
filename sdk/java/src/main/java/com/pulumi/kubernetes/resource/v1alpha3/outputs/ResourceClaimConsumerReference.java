// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClaimConsumerReference {
    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    private @Nullable String apiGroup;
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    private String name;
    /**
     * @return Resource is the type of resource being referenced, for example &#34;pods&#34;.
     * 
     */
    private String resource;
    /**
     * @return UID identifies exactly one incarnation of the resource.
     * 
     */
    private String uid;

    private ResourceClaimConsumerReference() {}
    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    public Optional<String> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource is the type of resource being referenced, for example &#34;pods&#34;.
     * 
     */
    public String resource() {
        return this.resource;
    }
    /**
     * @return UID identifies exactly one incarnation of the resource.
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClaimConsumerReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiGroup;
        private String name;
        private String resource;
        private String uid;
        public Builder() {}
        public Builder(ResourceClaimConsumerReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.name = defaults.name;
    	      this.resource = defaults.resource;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder apiGroup(@Nullable String apiGroup) {

            this.apiGroup = apiGroup;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ResourceClaimConsumerReference", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resource(String resource) {
            if (resource == null) {
              throw new MissingRequiredPropertyException("ResourceClaimConsumerReference", "resource");
            }
            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            if (uid == null) {
              throw new MissingRequiredPropertyException("ResourceClaimConsumerReference", "uid");
            }
            this.uid = uid;
            return this;
        }
        public ResourceClaimConsumerReference build() {
            final var _resultValue = new ResourceClaimConsumerReference();
            _resultValue.apiGroup = apiGroup;
            _resultValue.name = name;
            _resultValue.resource = resource;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
