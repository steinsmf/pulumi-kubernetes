// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClaimConsumerReferencePatch {
    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    private @Nullable String apiGroup;
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    private @Nullable String name;
    /**
     * @return Resource is the type of resource being referenced, for example &#34;pods&#34;.
     * 
     */
    private @Nullable String resource;
    /**
     * @return UID identifies exactly one incarnation of the resource.
     * 
     */
    private @Nullable String uid;

    private ResourceClaimConsumerReferencePatch() {}
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
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Resource is the type of resource being referenced, for example &#34;pods&#34;.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * @return UID identifies exactly one incarnation of the resource.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClaimConsumerReferencePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiGroup;
        private @Nullable String name;
        private @Nullable String resource;
        private @Nullable String uid;
        public Builder() {}
        public Builder(ResourceClaimConsumerReferencePatch defaults) {
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
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resource(@Nullable String resource) {

            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {

            this.uid = uid;
            return this;
        }
        public ResourceClaimConsumerReferencePatch build() {
            final var _resultValue = new ResourceClaimConsumerReferencePatch();
            _resultValue.apiGroup = apiGroup;
            _resultValue.name = name;
            _resultValue.resource = resource;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
