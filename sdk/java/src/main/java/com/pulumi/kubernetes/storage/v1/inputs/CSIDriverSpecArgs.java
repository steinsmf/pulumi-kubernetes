// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.storage.v1.inputs.TokenRequestArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CSIDriverSpec is the specification of a CSIDriver.
 * 
 */
public final class CSIDriverSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final CSIDriverSpecArgs Empty = new CSIDriverSpecArgs();

    /**
     * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     * 
     * This field is immutable.
     * 
     */
    @Import(name="attachRequired")
    private @Nullable Output<Boolean> attachRequired;

    /**
     * @return attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     * 
     * This field is immutable.
     * 
     */
    public Optional<Output<Boolean>> attachRequired() {
        return Optional.ofNullable(this.attachRequired);
    }

    /**
     * fsGroupPolicy defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details.
     * 
     * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
     * 
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume&#39;s access mode contains ReadWriteOnce.
     * 
     */
    @Import(name="fsGroupPolicy")
    private @Nullable Output<String> fsGroupPolicy;

    /**
     * @return fsGroupPolicy defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details.
     * 
     * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
     * 
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume&#39;s access mode contains ReadWriteOnce.
     * 
     */
    public Optional<Output<String>> fsGroupPolicy() {
        return Optional.ofNullable(this.fsGroupPolicy);
    }

    /**
     * podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations, if set to true. If set to false, pod information will not be passed on mount. Default is false.
     * 
     * The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext.
     * 
     * The following VolumeContext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. &#34;csi.storage.k8s.io/pod.name&#34;: pod.Name &#34;csi.storage.k8s.io/pod.namespace&#34;: pod.Namespace &#34;csi.storage.k8s.io/pod.uid&#34;: string(pod.UID) &#34;csi.storage.k8s.io/ephemeral&#34;: &#34;true&#34; if the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise &#34;false&#34;
     * 
     * &#34;csi.storage.k8s.io/ephemeral&#34; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the &#34;Persistent&#34; and &#34;Ephemeral&#34; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * 
     * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
     * 
     */
    @Import(name="podInfoOnMount")
    private @Nullable Output<Boolean> podInfoOnMount;

    /**
     * @return podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations, if set to true. If set to false, pod information will not be passed on mount. Default is false.
     * 
     * The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext.
     * 
     * The following VolumeContext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. &#34;csi.storage.k8s.io/pod.name&#34;: pod.Name &#34;csi.storage.k8s.io/pod.namespace&#34;: pod.Namespace &#34;csi.storage.k8s.io/pod.uid&#34;: string(pod.UID) &#34;csi.storage.k8s.io/ephemeral&#34;: &#34;true&#34; if the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise &#34;false&#34;
     * 
     * &#34;csi.storage.k8s.io/ephemeral&#34; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the &#34;Persistent&#34; and &#34;Ephemeral&#34; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * 
     * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
     * 
     */
    public Optional<Output<Boolean>> podInfoOnMount() {
        return Optional.ofNullable(this.podInfoOnMount);
    }

    /**
     * requiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
     * 
     * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
     * 
     */
    @Import(name="requiresRepublish")
    private @Nullable Output<Boolean> requiresRepublish;

    /**
     * @return requiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
     * 
     * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
     * 
     */
    public Optional<Output<Boolean>> requiresRepublish() {
        return Optional.ofNullable(this.requiresRepublish);
    }

    /**
     * seLinuxMount specifies if the CSI driver supports &#34;-o context&#34; mount option.
     * 
     * When &#34;true&#34;, the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different `-o context` options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with &#34;-o context=xyz&#34; mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.
     * 
     * When &#34;false&#34;, Kubernetes won&#39;t pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.
     * 
     * Default is &#34;false&#34;.
     * 
     */
    @Import(name="seLinuxMount")
    private @Nullable Output<Boolean> seLinuxMount;

    /**
     * @return seLinuxMount specifies if the CSI driver supports &#34;-o context&#34; mount option.
     * 
     * When &#34;true&#34;, the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different `-o context` options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with &#34;-o context=xyz&#34; mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.
     * 
     * When &#34;false&#34;, Kubernetes won&#39;t pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.
     * 
     * Default is &#34;false&#34;.
     * 
     */
    public Optional<Output<Boolean>> seLinuxMount() {
        return Optional.ofNullable(this.seLinuxMount);
    }

    /**
     * storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information, if set to true.
     * 
     * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
     * 
     * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
     * 
     * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
     * 
     */
    @Import(name="storageCapacity")
    private @Nullable Output<Boolean> storageCapacity;

    /**
     * @return storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information, if set to true.
     * 
     * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
     * 
     * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
     * 
     * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
     * 
     */
    public Optional<Output<Boolean>> storageCapacity() {
        return Optional.ofNullable(this.storageCapacity);
    }

    /**
     * tokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
     *   &#34;&lt;audience&gt;&#34;: {
     *     &#34;token&#34;: &lt;token&gt;,
     *     &#34;expirationTimestamp&#34;: &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * 
     * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * 
     */
    @Import(name="tokenRequests")
    private @Nullable Output<List<TokenRequestArgs>> tokenRequests;

    /**
     * @return tokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
     *   &#34;&lt;audience&gt;&#34;: {
     *     &#34;token&#34;: &lt;token&gt;,
     *     &#34;expirationTimestamp&#34;: &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * 
     * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * 
     */
    public Optional<Output<List<TokenRequestArgs>>> tokenRequests() {
        return Optional.ofNullable(this.tokenRequests);
    }

    /**
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism.
     * 
     * The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume.
     * 
     * For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
     * 
     * This field is beta. This field is immutable.
     * 
     */
    @Import(name="volumeLifecycleModes")
    private @Nullable Output<List<String>> volumeLifecycleModes;

    /**
     * @return volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism.
     * 
     * The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume.
     * 
     * For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
     * 
     * This field is beta. This field is immutable.
     * 
     */
    public Optional<Output<List<String>>> volumeLifecycleModes() {
        return Optional.ofNullable(this.volumeLifecycleModes);
    }

    private CSIDriverSpecArgs() {}

    private CSIDriverSpecArgs(CSIDriverSpecArgs $) {
        this.attachRequired = $.attachRequired;
        this.fsGroupPolicy = $.fsGroupPolicy;
        this.podInfoOnMount = $.podInfoOnMount;
        this.requiresRepublish = $.requiresRepublish;
        this.seLinuxMount = $.seLinuxMount;
        this.storageCapacity = $.storageCapacity;
        this.tokenRequests = $.tokenRequests;
        this.volumeLifecycleModes = $.volumeLifecycleModes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CSIDriverSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CSIDriverSpecArgs $;

        public Builder() {
            $ = new CSIDriverSpecArgs();
        }

        public Builder(CSIDriverSpecArgs defaults) {
            $ = new CSIDriverSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachRequired attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
         * 
         * This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder attachRequired(@Nullable Output<Boolean> attachRequired) {
            $.attachRequired = attachRequired;
            return this;
        }

        /**
         * @param attachRequired attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
         * 
         * This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder attachRequired(Boolean attachRequired) {
            return attachRequired(Output.of(attachRequired));
        }

        /**
         * @param fsGroupPolicy fsGroupPolicy defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details.
         * 
         * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
         * 
         * Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume&#39;s access mode contains ReadWriteOnce.
         * 
         * @return builder
         * 
         */
        public Builder fsGroupPolicy(@Nullable Output<String> fsGroupPolicy) {
            $.fsGroupPolicy = fsGroupPolicy;
            return this;
        }

        /**
         * @param fsGroupPolicy fsGroupPolicy defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details.
         * 
         * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
         * 
         * Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume&#39;s access mode contains ReadWriteOnce.
         * 
         * @return builder
         * 
         */
        public Builder fsGroupPolicy(String fsGroupPolicy) {
            return fsGroupPolicy(Output.of(fsGroupPolicy));
        }

        /**
         * @param podInfoOnMount podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations, if set to true. If set to false, pod information will not be passed on mount. Default is false.
         * 
         * The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext.
         * 
         * The following VolumeContext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. &#34;csi.storage.k8s.io/pod.name&#34;: pod.Name &#34;csi.storage.k8s.io/pod.namespace&#34;: pod.Namespace &#34;csi.storage.k8s.io/pod.uid&#34;: string(pod.UID) &#34;csi.storage.k8s.io/ephemeral&#34;: &#34;true&#34; if the volume is an ephemeral inline volume
         *                                 defined by a CSIVolumeSource, otherwise &#34;false&#34;
         * 
         * &#34;csi.storage.k8s.io/ephemeral&#34; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the &#34;Persistent&#34; and &#34;Ephemeral&#34; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
         * 
         * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
         * 
         * @return builder
         * 
         */
        public Builder podInfoOnMount(@Nullable Output<Boolean> podInfoOnMount) {
            $.podInfoOnMount = podInfoOnMount;
            return this;
        }

        /**
         * @param podInfoOnMount podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations, if set to true. If set to false, pod information will not be passed on mount. Default is false.
         * 
         * The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext.
         * 
         * The following VolumeContext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. &#34;csi.storage.k8s.io/pod.name&#34;: pod.Name &#34;csi.storage.k8s.io/pod.namespace&#34;: pod.Namespace &#34;csi.storage.k8s.io/pod.uid&#34;: string(pod.UID) &#34;csi.storage.k8s.io/ephemeral&#34;: &#34;true&#34; if the volume is an ephemeral inline volume
         *                                 defined by a CSIVolumeSource, otherwise &#34;false&#34;
         * 
         * &#34;csi.storage.k8s.io/ephemeral&#34; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the &#34;Persistent&#34; and &#34;Ephemeral&#34; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
         * 
         * This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
         * 
         * @return builder
         * 
         */
        public Builder podInfoOnMount(Boolean podInfoOnMount) {
            return podInfoOnMount(Output.of(podInfoOnMount));
        }

        /**
         * @param requiresRepublish requiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
         * 
         * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
         * 
         * @return builder
         * 
         */
        public Builder requiresRepublish(@Nullable Output<Boolean> requiresRepublish) {
            $.requiresRepublish = requiresRepublish;
            return this;
        }

        /**
         * @param requiresRepublish requiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
         * 
         * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
         * 
         * @return builder
         * 
         */
        public Builder requiresRepublish(Boolean requiresRepublish) {
            return requiresRepublish(Output.of(requiresRepublish));
        }

        /**
         * @param seLinuxMount seLinuxMount specifies if the CSI driver supports &#34;-o context&#34; mount option.
         * 
         * When &#34;true&#34;, the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different `-o context` options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with &#34;-o context=xyz&#34; mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.
         * 
         * When &#34;false&#34;, Kubernetes won&#39;t pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.
         * 
         * Default is &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder seLinuxMount(@Nullable Output<Boolean> seLinuxMount) {
            $.seLinuxMount = seLinuxMount;
            return this;
        }

        /**
         * @param seLinuxMount seLinuxMount specifies if the CSI driver supports &#34;-o context&#34; mount option.
         * 
         * When &#34;true&#34;, the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different `-o context` options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with &#34;-o context=xyz&#34; mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.
         * 
         * When &#34;false&#34;, Kubernetes won&#39;t pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.
         * 
         * Default is &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder seLinuxMount(Boolean seLinuxMount) {
            return seLinuxMount(Output.of(seLinuxMount));
        }

        /**
         * @param storageCapacity storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information, if set to true.
         * 
         * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
         * 
         * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
         * 
         * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacity(@Nullable Output<Boolean> storageCapacity) {
            $.storageCapacity = storageCapacity;
            return this;
        }

        /**
         * @param storageCapacity storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information, if set to true.
         * 
         * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
         * 
         * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
         * 
         * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacity(Boolean storageCapacity) {
            return storageCapacity(Output.of(storageCapacity));
        }

        /**
         * @param tokenRequests tokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
         *   &#34;&lt;audience&gt;&#34;: {
         *     &#34;token&#34;: &lt;token&gt;,
         *     &#34;expirationTimestamp&#34;: &lt;expiration timestamp in RFC3339&gt;,
         *   },
         *   ...
         * }
         * 
         * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
         * 
         * @return builder
         * 
         */
        public Builder tokenRequests(@Nullable Output<List<TokenRequestArgs>> tokenRequests) {
            $.tokenRequests = tokenRequests;
            return this;
        }

        /**
         * @param tokenRequests tokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
         *   &#34;&lt;audience&gt;&#34;: {
         *     &#34;token&#34;: &lt;token&gt;,
         *     &#34;expirationTimestamp&#34;: &lt;expiration timestamp in RFC3339&gt;,
         *   },
         *   ...
         * }
         * 
         * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
         * 
         * @return builder
         * 
         */
        public Builder tokenRequests(List<TokenRequestArgs> tokenRequests) {
            return tokenRequests(Output.of(tokenRequests));
        }

        /**
         * @param tokenRequests tokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
         *   &#34;&lt;audience&gt;&#34;: {
         *     &#34;token&#34;: &lt;token&gt;,
         *     &#34;expirationTimestamp&#34;: &lt;expiration timestamp in RFC3339&gt;,
         *   },
         *   ...
         * }
         * 
         * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
         * 
         * @return builder
         * 
         */
        public Builder tokenRequests(TokenRequestArgs... tokenRequests) {
            return tokenRequests(List.of(tokenRequests));
        }

        /**
         * @param volumeLifecycleModes volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism.
         * 
         * The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume.
         * 
         * For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
         * 
         * This field is beta. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder volumeLifecycleModes(@Nullable Output<List<String>> volumeLifecycleModes) {
            $.volumeLifecycleModes = volumeLifecycleModes;
            return this;
        }

        /**
         * @param volumeLifecycleModes volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism.
         * 
         * The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume.
         * 
         * For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
         * 
         * This field is beta. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder volumeLifecycleModes(List<String> volumeLifecycleModes) {
            return volumeLifecycleModes(Output.of(volumeLifecycleModes));
        }

        /**
         * @param volumeLifecycleModes volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism.
         * 
         * The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume.
         * 
         * For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
         * 
         * This field is beta. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder volumeLifecycleModes(String... volumeLifecycleModes) {
            return volumeLifecycleModes(List.of(volumeLifecycleModes));
        }

        public CSIDriverSpecArgs build() {
            return $;
        }
    }

}
