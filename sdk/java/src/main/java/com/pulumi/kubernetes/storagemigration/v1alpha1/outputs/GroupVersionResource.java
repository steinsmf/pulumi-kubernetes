// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storagemigration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupVersionResource {
    /**
     * @return The name of the group.
     * 
     */
    private @Nullable String group;
    /**
     * @return The name of the resource.
     * 
     */
    private @Nullable String resource;
    /**
     * @return The name of the version.
     * 
     */
    private @Nullable String version;

    private GroupVersionResource() {}
    /**
     * @return The name of the group.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * @return The name of the version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupVersionResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private @Nullable String resource;
        private @Nullable String version;
        public Builder() {}
        public Builder(GroupVersionResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.resource = defaults.resource;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder resource(@Nullable String resource) {

            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public GroupVersionResource build() {
            final var _resultValue = new GroupVersionResource();
            _resultValue.group = group;
            _resultValue.resource = resource;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
