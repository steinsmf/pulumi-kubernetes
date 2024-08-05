// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClaimParametersReferencePatch {
    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    private @Nullable String apiGroup;
    /**
     * @return Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata, for example &#34;ConfigMap&#34;.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    private @Nullable String name;

    private ResourceClaimParametersReferencePatch() {}
    /**
     * @return APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    public Optional<String> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    /**
     * @return Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata, for example &#34;ConfigMap&#34;.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClaimParametersReferencePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiGroup;
        private @Nullable String kind;
        private @Nullable String name;
        public Builder() {}
        public Builder(ResourceClaimParametersReferencePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder apiGroup(@Nullable String apiGroup) {

            this.apiGroup = apiGroup;
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
        public ResourceClaimParametersReferencePatch build() {
            final var _resultValue = new ResourceClaimParametersReferencePatch();
            _resultValue.apiGroup = apiGroup;
            _resultValue.kind = kind;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
