// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Maps a string key to a path within a volume.
 * 
 */
public final class KeyToPathPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyToPathPatchArgs Empty = new KeyToPathPatchArgs();

    /**
     * key is the key to project.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return key is the key to project.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * mode is Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Integer> mode;

    /**
     * @return mode is Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Output<Integer>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * path is the relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return path is the relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private KeyToPathPatchArgs() {}

    private KeyToPathPatchArgs(KeyToPathPatchArgs $) {
        this.key = $.key;
        this.mode = $.mode;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyToPathPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyToPathPatchArgs $;

        public Builder() {
            $ = new KeyToPathPatchArgs();
        }

        public Builder(KeyToPathPatchArgs defaults) {
            $ = new KeyToPathPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key key is the key to project.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key key is the key to project.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param mode mode is Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Integer> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode mode is Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder mode(Integer mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param path path is the relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path path is the relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public KeyToPathPatchArgs build() {
            return $;
        }
    }

}
