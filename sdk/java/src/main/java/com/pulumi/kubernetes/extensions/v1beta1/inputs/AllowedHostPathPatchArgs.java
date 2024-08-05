// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined. Deprecated: use AllowedHostPath from policy API Group instead.
 * 
 */
public final class AllowedHostPathPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AllowedHostPathPatchArgs Empty = new AllowedHostPathPatchArgs();

    /**
     * pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
     * 
     * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
     * 
     */
    @Import(name="pathPrefix")
    private @Nullable Output<String> pathPrefix;

    /**
     * @return pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
     * 
     * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
     * 
     */
    public Optional<Output<String>> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }

    /**
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private AllowedHostPathPatchArgs() {}

    private AllowedHostPathPatchArgs(AllowedHostPathPatchArgs $) {
        this.pathPrefix = $.pathPrefix;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllowedHostPathPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllowedHostPathPatchArgs $;

        public Builder() {
            $ = new AllowedHostPathPatchArgs();
        }

        public Builder(AllowedHostPathPatchArgs defaults) {
            $ = new AllowedHostPathPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pathPrefix pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
         * 
         * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(@Nullable Output<String> pathPrefix) {
            $.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * @param pathPrefix pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
         * 
         * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(String pathPrefix) {
            return pathPrefix(Output.of(pathPrefix));
        }

        /**
         * @param readOnly when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public AllowedHostPathPatchArgs build() {
            return $;
        }
    }

}
