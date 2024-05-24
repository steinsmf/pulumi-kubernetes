// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyToPath {
    /**
     * @return key is the key to project.
     * 
     */
    private String key;
    /**
     * @return mode is Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private @Nullable Integer mode;
    /**
     * @return path is the relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
     * 
     */
    private String path;

    private KeyToPath() {}
    /**
     * @return key is the key to project.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return mode is Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Integer> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return path is the relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyToPath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private @Nullable Integer mode;
        private String path;
        public Builder() {}
        public Builder(KeyToPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("KeyToPath", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable Integer mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("KeyToPath", "path");
            }
            this.path = path;
            return this;
        }
        public KeyToPath build() {
            final var _resultValue = new KeyToPath();
            _resultValue.key = key;
            _resultValue.mode = mode;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
