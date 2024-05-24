// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.SecretReferencePatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CephFSPersistentVolumeSourcePatch {
    /**
     * @return monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private @Nullable List<String> monitors;
    /**
     * @return path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    private @Nullable String path;
    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private @Nullable String secretFile;
    /**
     * @return secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private @Nullable SecretReferencePatch secretRef;
    /**
     * @return user is Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private @Nullable String user;

    private CephFSPersistentVolumeSourcePatch() {}
    /**
     * @return monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public List<String> monitors() {
        return this.monitors == null ? List.of() : this.monitors;
    }
    /**
     * @return path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<String> secretFile() {
        return Optional.ofNullable(this.secretFile);
    }
    /**
     * @return secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<SecretReferencePatch> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * @return user is Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CephFSPersistentVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> monitors;
        private @Nullable String path;
        private @Nullable Boolean readOnly;
        private @Nullable String secretFile;
        private @Nullable SecretReferencePatch secretRef;
        private @Nullable String user;
        public Builder() {}
        public Builder(CephFSPersistentVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitors = defaults.monitors;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.secretFile = defaults.secretFile;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder monitors(@Nullable List<String> monitors) {

            this.monitors = monitors;
            return this;
        }
        public Builder monitors(String... monitors) {
            return monitors(List.of(monitors));
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder secretFile(@Nullable String secretFile) {

            this.secretFile = secretFile;
            return this;
        }
        @CustomType.Setter
        public Builder secretRef(@Nullable SecretReferencePatch secretRef) {

            this.secretRef = secretRef;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        public CephFSPersistentVolumeSourcePatch build() {
            final var _resultValue = new CephFSPersistentVolumeSourcePatch();
            _resultValue.monitors = monitors;
            _resultValue.path = path;
            _resultValue.readOnly = readOnly;
            _resultValue.secretFile = secretFile;
            _resultValue.secretRef = secretRef;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
