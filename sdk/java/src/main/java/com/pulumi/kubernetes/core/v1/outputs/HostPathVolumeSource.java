// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostPathVolumeSource {
    /**
     * @return path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    private String path;
    /**
     * @return type for HostPath Volume Defaults to &#34;&#34; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    private @Nullable String type;

    private HostPathVolumeSource() {}
    /**
     * @return path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return type for HostPath Volume Defaults to &#34;&#34; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostPathVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private @Nullable String type;
        public Builder() {}
        public Builder(HostPathVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("HostPathVolumeSource", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public HostPathVolumeSource build() {
            final var _resultValue = new HostPathVolumeSource();
            _resultValue.path = path;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
