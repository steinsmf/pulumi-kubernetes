// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class CephFSVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CephFSVolumeSourceArgs Empty = new CephFSVolumeSourceArgs();

    /**
     * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="monitors", required=true)
    private Output<List<String>> monitors;

    /**
     * @return monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Output<List<String>> monitors() {
        return this.monitors;
    }

    /**
     * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="secretFile")
    private @Nullable Output<String> secretFile;

    /**
     * @return secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<Output<String>> secretFile() {
        return Optional.ofNullable(this.secretFile);
    }

    /**
     * secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<LocalObjectReferenceArgs> secretRef;

    /**
     * @return secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<Output<LocalObjectReferenceArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private CephFSVolumeSourceArgs() {}

    private CephFSVolumeSourceArgs(CephFSVolumeSourceArgs $) {
        this.monitors = $.monitors;
        this.path = $.path;
        this.readOnly = $.readOnly;
        this.secretFile = $.secretFile;
        this.secretRef = $.secretRef;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CephFSVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CephFSVolumeSourceArgs $;

        public Builder() {
            $ = new CephFSVolumeSourceArgs();
        }

        public Builder(CephFSVolumeSourceArgs defaults) {
            $ = new CephFSVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitors monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder monitors(Output<List<String>> monitors) {
            $.monitors = monitors;
            return this;
        }

        /**
         * @param monitors monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder monitors(List<String> monitors) {
            return monitors(Output.of(monitors));
        }

        /**
         * @param monitors monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder monitors(String... monitors) {
            return monitors(List.of(monitors));
        }

        /**
         * @param path path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param readOnly readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secretFile secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder secretFile(@Nullable Output<String> secretFile) {
            $.secretFile = secretFile;
            return this;
        }

        /**
         * @param secretFile secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder secretFile(String secretFile) {
            return secretFile(Output.of(secretFile));
        }

        /**
         * @param secretRef secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<LocalObjectReferenceArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder secretRef(LocalObjectReferenceArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        /**
         * @param user user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public CephFSVolumeSourceArgs build() {
            if ($.monitors == null) {
                throw new MissingRequiredPropertyException("CephFSVolumeSourceArgs", "monitors");
            }
            return $;
        }
    }

}
