// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NFSVolumeSource {
    /**
     * @return path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    private String path;
    /**
     * @return readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    private String server;

    private NFSVolumeSource() {}
    /**
     * @return path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    public String server() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NFSVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private @Nullable Boolean readOnly;
        private String server;
        public Builder() {}
        public Builder(NFSVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("NFSVolumeSource", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder server(String server) {
            if (server == null) {
              throw new MissingRequiredPropertyException("NFSVolumeSource", "server");
            }
            this.server = server;
            return this;
        }
        public NFSVolumeSource build() {
            final var _resultValue = new NFSVolumeSource();
            _resultValue.path = path;
            _resultValue.readOnly = readOnly;
            _resultValue.server = server;
            return _resultValue;
        }
    }
}
