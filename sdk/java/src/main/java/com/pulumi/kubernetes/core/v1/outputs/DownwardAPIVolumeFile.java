// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.outputs.ObjectFieldSelector;
import com.pulumi.kubernetes.core.v1.outputs.ResourceFieldSelector;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DownwardAPIVolumeFile {
    /**
     * @return Required: Selects a field of the pod: only annotations, labels, name, namespace and uid are supported.
     * 
     */
    private @Nullable ObjectFieldSelector fieldRef;
    /**
     * @return Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private @Nullable Integer mode;
    /**
     * @return Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
     * 
     */
    private String path;
    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    private @Nullable ResourceFieldSelector resourceFieldRef;

    private DownwardAPIVolumeFile() {}
    /**
     * @return Required: Selects a field of the pod: only annotations, labels, name, namespace and uid are supported.
     * 
     */
    public Optional<ObjectFieldSelector> fieldRef() {
        return Optional.ofNullable(this.fieldRef);
    }
    /**
     * @return Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Integer> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    public Optional<ResourceFieldSelector> resourceFieldRef() {
        return Optional.ofNullable(this.resourceFieldRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIVolumeFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ObjectFieldSelector fieldRef;
        private @Nullable Integer mode;
        private String path;
        private @Nullable ResourceFieldSelector resourceFieldRef;
        public Builder() {}
        public Builder(DownwardAPIVolumeFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldRef = defaults.fieldRef;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
    	      this.resourceFieldRef = defaults.resourceFieldRef;
        }

        @CustomType.Setter
        public Builder fieldRef(@Nullable ObjectFieldSelector fieldRef) {

            this.fieldRef = fieldRef;
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
              throw new MissingRequiredPropertyException("DownwardAPIVolumeFile", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder resourceFieldRef(@Nullable ResourceFieldSelector resourceFieldRef) {

            this.resourceFieldRef = resourceFieldRef;
            return this;
        }
        public DownwardAPIVolumeFile build() {
            final var _resultValue = new DownwardAPIVolumeFile();
            _resultValue.fieldRef = fieldRef;
            _resultValue.mode = mode;
            _resultValue.path = path;
            _resultValue.resourceFieldRef = resourceFieldRef;
            return _resultValue;
        }
    }
}
