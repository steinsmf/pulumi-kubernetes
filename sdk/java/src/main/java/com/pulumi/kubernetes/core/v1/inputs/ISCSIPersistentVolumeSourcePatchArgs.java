// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.SecretReferencePatchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 * 
 */
public final class ISCSIPersistentVolumeSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ISCSIPersistentVolumeSourcePatchArgs Empty = new ISCSIPersistentVolumeSourcePatchArgs();

    /**
     * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
     * 
     */
    @Import(name="chapAuthDiscovery")
    private @Nullable Output<Boolean> chapAuthDiscovery;

    /**
     * @return chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
     * 
     */
    public Optional<Output<Boolean>> chapAuthDiscovery() {
        return Optional.ofNullable(this.chapAuthDiscovery);
    }

    /**
     * chapAuthSession defines whether support iSCSI Session CHAP authentication
     * 
     */
    @Import(name="chapAuthSession")
    private @Nullable Output<Boolean> chapAuthSession;

    /**
     * @return chapAuthSession defines whether support iSCSI Session CHAP authentication
     * 
     */
    public Optional<Output<Boolean>> chapAuthSession() {
        return Optional.ofNullable(this.chapAuthSession);
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
     * 
     */
    @Import(name="initiatorName")
    private @Nullable Output<String> initiatorName;

    /**
     * @return initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
     * 
     */
    public Optional<Output<String>> initiatorName() {
        return Optional.ofNullable(this.initiatorName);
    }

    /**
     * iqn is Target iSCSI Qualified Name.
     * 
     */
    @Import(name="iqn")
    private @Nullable Output<String> iqn;

    /**
     * @return iqn is Target iSCSI Qualified Name.
     * 
     */
    public Optional<Output<String>> iqn() {
        return Optional.ofNullable(this.iqn);
    }

    /**
     * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
     * 
     */
    @Import(name="iscsiInterface")
    private @Nullable Output<String> iscsiInterface;

    /**
     * @return iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
     * 
     */
    public Optional<Output<String>> iscsiInterface() {
        return Optional.ofNullable(this.iscsiInterface);
    }

    /**
     * lun is iSCSI Target Lun number.
     * 
     */
    @Import(name="lun")
    private @Nullable Output<Integer> lun;

    /**
     * @return lun is iSCSI Target Lun number.
     * 
     */
    public Optional<Output<Integer>> lun() {
        return Optional.ofNullable(this.lun);
    }

    /**
     * portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    @Import(name="portals")
    private @Nullable Output<List<String>> portals;

    /**
     * @return portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    public Optional<Output<List<String>>> portals() {
        return Optional.ofNullable(this.portals);
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * secretRef is the CHAP Secret for iSCSI target and initiator authentication
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<SecretReferencePatchArgs> secretRef;

    /**
     * @return secretRef is the CHAP Secret for iSCSI target and initiator authentication
     * 
     */
    public Optional<Output<SecretReferencePatchArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    @Import(name="targetPortal")
    private @Nullable Output<String> targetPortal;

    /**
     * @return targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    public Optional<Output<String>> targetPortal() {
        return Optional.ofNullable(this.targetPortal);
    }

    private ISCSIPersistentVolumeSourcePatchArgs() {}

    private ISCSIPersistentVolumeSourcePatchArgs(ISCSIPersistentVolumeSourcePatchArgs $) {
        this.chapAuthDiscovery = $.chapAuthDiscovery;
        this.chapAuthSession = $.chapAuthSession;
        this.fsType = $.fsType;
        this.initiatorName = $.initiatorName;
        this.iqn = $.iqn;
        this.iscsiInterface = $.iscsiInterface;
        this.lun = $.lun;
        this.portals = $.portals;
        this.readOnly = $.readOnly;
        this.secretRef = $.secretRef;
        this.targetPortal = $.targetPortal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ISCSIPersistentVolumeSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ISCSIPersistentVolumeSourcePatchArgs $;

        public Builder() {
            $ = new ISCSIPersistentVolumeSourcePatchArgs();
        }

        public Builder(ISCSIPersistentVolumeSourcePatchArgs defaults) {
            $ = new ISCSIPersistentVolumeSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chapAuthDiscovery chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
         * 
         * @return builder
         * 
         */
        public Builder chapAuthDiscovery(@Nullable Output<Boolean> chapAuthDiscovery) {
            $.chapAuthDiscovery = chapAuthDiscovery;
            return this;
        }

        /**
         * @param chapAuthDiscovery chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
         * 
         * @return builder
         * 
         */
        public Builder chapAuthDiscovery(Boolean chapAuthDiscovery) {
            return chapAuthDiscovery(Output.of(chapAuthDiscovery));
        }

        /**
         * @param chapAuthSession chapAuthSession defines whether support iSCSI Session CHAP authentication
         * 
         * @return builder
         * 
         */
        public Builder chapAuthSession(@Nullable Output<Boolean> chapAuthSession) {
            $.chapAuthSession = chapAuthSession;
            return this;
        }

        /**
         * @param chapAuthSession chapAuthSession defines whether support iSCSI Session CHAP authentication
         * 
         * @return builder
         * 
         */
        public Builder chapAuthSession(Boolean chapAuthSession) {
            return chapAuthSession(Output.of(chapAuthSession));
        }

        /**
         * @param fsType fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param initiatorName initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
         * 
         * @return builder
         * 
         */
        public Builder initiatorName(@Nullable Output<String> initiatorName) {
            $.initiatorName = initiatorName;
            return this;
        }

        /**
         * @param initiatorName initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
         * 
         * @return builder
         * 
         */
        public Builder initiatorName(String initiatorName) {
            return initiatorName(Output.of(initiatorName));
        }

        /**
         * @param iqn iqn is Target iSCSI Qualified Name.
         * 
         * @return builder
         * 
         */
        public Builder iqn(@Nullable Output<String> iqn) {
            $.iqn = iqn;
            return this;
        }

        /**
         * @param iqn iqn is Target iSCSI Qualified Name.
         * 
         * @return builder
         * 
         */
        public Builder iqn(String iqn) {
            return iqn(Output.of(iqn));
        }

        /**
         * @param iscsiInterface iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
         * 
         * @return builder
         * 
         */
        public Builder iscsiInterface(@Nullable Output<String> iscsiInterface) {
            $.iscsiInterface = iscsiInterface;
            return this;
        }

        /**
         * @param iscsiInterface iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
         * 
         * @return builder
         * 
         */
        public Builder iscsiInterface(String iscsiInterface) {
            return iscsiInterface(Output.of(iscsiInterface));
        }

        /**
         * @param lun lun is iSCSI Target Lun number.
         * 
         * @return builder
         * 
         */
        public Builder lun(@Nullable Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param lun lun is iSCSI Target Lun number.
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        /**
         * @param portals portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         * 
         * @return builder
         * 
         */
        public Builder portals(@Nullable Output<List<String>> portals) {
            $.portals = portals;
            return this;
        }

        /**
         * @param portals portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         * 
         * @return builder
         * 
         */
        public Builder portals(List<String> portals) {
            return portals(Output.of(portals));
        }

        /**
         * @param portals portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         * 
         * @return builder
         * 
         */
        public Builder portals(String... portals) {
            return portals(List.of(portals));
        }

        /**
         * @param readOnly readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secretRef secretRef is the CHAP Secret for iSCSI target and initiator authentication
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<SecretReferencePatchArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef secretRef is the CHAP Secret for iSCSI target and initiator authentication
         * 
         * @return builder
         * 
         */
        public Builder secretRef(SecretReferencePatchArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        /**
         * @param targetPortal targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         * 
         * @return builder
         * 
         */
        public Builder targetPortal(@Nullable Output<String> targetPortal) {
            $.targetPortal = targetPortal;
            return this;
        }

        /**
         * @param targetPortal targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         * 
         * @return builder
         * 
         */
        public Builder targetPortal(String targetPortal) {
            return targetPortal(Output.of(targetPortal));
        }

        public ISCSIPersistentVolumeSourcePatchArgs build() {
            return $;
        }
    }

}
