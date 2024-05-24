// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 * 
 */
public final class RBDPersistentVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RBDPersistentVolumeSourceArgs Empty = new RBDPersistentVolumeSourceArgs();

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    /**
     * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="keyring")
    private @Nullable Output<String> keyring;

    /**
     * @return keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Optional<Output<String>> keyring() {
        return Optional.ofNullable(this.keyring);
    }

    /**
     * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="monitors", required=true)
    private Output<List<String>> monitors;

    /**
     * @return monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Output<List<String>> monitors() {
        return this.monitors;
    }

    /**
     * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="pool")
    private @Nullable Output<String> pool;

    /**
     * @return pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Optional<Output<String>> pool() {
        return Optional.ofNullable(this.pool);
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * secretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<SecretReferenceArgs> secretRef;

    /**
     * @return secretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Optional<Output<SecretReferenceArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private RBDPersistentVolumeSourceArgs() {}

    private RBDPersistentVolumeSourceArgs(RBDPersistentVolumeSourceArgs $) {
        this.fsType = $.fsType;
        this.image = $.image;
        this.keyring = $.keyring;
        this.monitors = $.monitors;
        this.pool = $.pool;
        this.readOnly = $.readOnly;
        this.secretRef = $.secretRef;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RBDPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RBDPersistentVolumeSourceArgs $;

        public Builder() {
            $ = new RBDPersistentVolumeSourceArgs();
        }

        public Builder(RBDPersistentVolumeSourceArgs defaults) {
            $ = new RBDPersistentVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fsType fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param image image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param keyring keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder keyring(@Nullable Output<String> keyring) {
            $.keyring = keyring;
            return this;
        }

        /**
         * @param keyring keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder keyring(String keyring) {
            return keyring(Output.of(keyring));
        }

        /**
         * @param monitors monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder monitors(Output<List<String>> monitors) {
            $.monitors = monitors;
            return this;
        }

        /**
         * @param monitors monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder monitors(List<String> monitors) {
            return monitors(Output.of(monitors));
        }

        /**
         * @param monitors monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder monitors(String... monitors) {
            return monitors(List.of(monitors));
        }

        /**
         * @param pool pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder pool(@Nullable Output<String> pool) {
            $.pool = pool;
            return this;
        }

        /**
         * @param pool pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder pool(String pool) {
            return pool(Output.of(pool));
        }

        /**
         * @param readOnly readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secretRef secretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<SecretReferenceArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef secretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder secretRef(SecretReferenceArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        /**
         * @param user user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public RBDPersistentVolumeSourceArgs build() {
            if ($.image == null) {
                throw new MissingRequiredPropertyException("RBDPersistentVolumeSourceArgs", "image");
            }
            if ($.monitors == null) {
                throw new MissingRequiredPropertyException("RBDPersistentVolumeSourceArgs", "monitors");
            }
            return $;
        }
    }

}
