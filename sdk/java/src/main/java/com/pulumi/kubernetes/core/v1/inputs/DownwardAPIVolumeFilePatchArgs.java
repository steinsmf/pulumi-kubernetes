// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.ObjectFieldSelectorPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.ResourceFieldSelectorPatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 * 
 */
public final class DownwardAPIVolumeFilePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final DownwardAPIVolumeFilePatchArgs Empty = new DownwardAPIVolumeFilePatchArgs();

    /**
     * Required: Selects a field of the pod: only annotations, labels, name, namespace and uid are supported.
     * 
     */
    @Import(name="fieldRef")
    private @Nullable Output<ObjectFieldSelectorPatchArgs> fieldRef;

    /**
     * @return Required: Selects a field of the pod: only annotations, labels, name, namespace and uid are supported.
     * 
     */
    public Optional<Output<ObjectFieldSelectorPatchArgs>> fieldRef() {
        return Optional.ofNullable(this.fieldRef);
    }

    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Integer> mode;

    /**
     * @return Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Output<Integer>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    @Import(name="resourceFieldRef")
    private @Nullable Output<ResourceFieldSelectorPatchArgs> resourceFieldRef;

    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    public Optional<Output<ResourceFieldSelectorPatchArgs>> resourceFieldRef() {
        return Optional.ofNullable(this.resourceFieldRef);
    }

    private DownwardAPIVolumeFilePatchArgs() {}

    private DownwardAPIVolumeFilePatchArgs(DownwardAPIVolumeFilePatchArgs $) {
        this.fieldRef = $.fieldRef;
        this.mode = $.mode;
        this.path = $.path;
        this.resourceFieldRef = $.resourceFieldRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DownwardAPIVolumeFilePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DownwardAPIVolumeFilePatchArgs $;

        public Builder() {
            $ = new DownwardAPIVolumeFilePatchArgs();
        }

        public Builder(DownwardAPIVolumeFilePatchArgs defaults) {
            $ = new DownwardAPIVolumeFilePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldRef Required: Selects a field of the pod: only annotations, labels, name, namespace and uid are supported.
         * 
         * @return builder
         * 
         */
        public Builder fieldRef(@Nullable Output<ObjectFieldSelectorPatchArgs> fieldRef) {
            $.fieldRef = fieldRef;
            return this;
        }

        /**
         * @param fieldRef Required: Selects a field of the pod: only annotations, labels, name, namespace and uid are supported.
         * 
         * @return builder
         * 
         */
        public Builder fieldRef(ObjectFieldSelectorPatchArgs fieldRef) {
            return fieldRef(Output.of(fieldRef));
        }

        /**
         * @param mode Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Integer> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder mode(Integer mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param path Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
         * 
         * @return builder
         * 
         */
        public Builder resourceFieldRef(@Nullable Output<ResourceFieldSelectorPatchArgs> resourceFieldRef) {
            $.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
         * 
         * @return builder
         * 
         */
        public Builder resourceFieldRef(ResourceFieldSelectorPatchArgs resourceFieldRef) {
            return resourceFieldRef(Output.of(resourceFieldRef));
        }

        public DownwardAPIVolumeFilePatchArgs build() {
            return $;
        }
    }

}
