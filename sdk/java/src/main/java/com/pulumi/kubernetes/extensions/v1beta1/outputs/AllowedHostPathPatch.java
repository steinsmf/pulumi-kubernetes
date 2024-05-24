// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AllowedHostPathPatch {
    /**
     * @return pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
     * 
     * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
     * 
     */
    private @Nullable String pathPrefix;
    /**
     * @return when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * 
     */
    private @Nullable Boolean readOnly;

    private AllowedHostPathPatch() {}
    /**
     * @return pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
     * 
     * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
     * 
     */
    public Optional<String> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }
    /**
     * @return when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedHostPathPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pathPrefix;
        private @Nullable Boolean readOnly;
        public Builder() {}
        public Builder(AllowedHostPathPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathPrefix = defaults.pathPrefix;
    	      this.readOnly = defaults.readOnly;
        }

        @CustomType.Setter
        public Builder pathPrefix(@Nullable String pathPrefix) {

            this.pathPrefix = pathPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        public AllowedHostPathPatch build() {
            final var _resultValue = new AllowedHostPathPatch();
            _resultValue.pathPrefix = pathPrefix;
            _resultValue.readOnly = readOnly;
            return _resultValue;
        }
    }
}
