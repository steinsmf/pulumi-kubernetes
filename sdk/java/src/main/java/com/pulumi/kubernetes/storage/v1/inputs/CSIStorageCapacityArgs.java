// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CSIStorageCapacity stores the result of one CSI GetCapacity call. For a given StorageClass, this describes the available capacity in a particular topology segment.  This can be used when considering where to instantiate new PersistentVolumes.
 * 
 * For example this can express things like: - StorageClass &#34;standard&#34; has &#34;1234 GiB&#34; available in &#34;topology.kubernetes.io/zone=us-east1&#34; - StorageClass &#34;localssd&#34; has &#34;10 GiB&#34; available in &#34;kubernetes.io/hostname=knode-abc123&#34;
 * 
 * The following three cases all imply that no capacity is available for a certain combination: - no object exists with suitable topology and storage class name - such an object exists, but the capacity is unset - such an object exists, but the capacity is zero
 * 
 * The producer of these objects can decide which approach is more suitable.
 * 
 * They are consumed by the kube-scheduler when a CSI driver opts into capacity-aware scheduling with CSIDriverSpec.StorageCapacity. The scheduler compares the MaximumVolumeSize against the requested size of pending volumes to filter out unsuitable nodes. If MaximumVolumeSize is unset, it falls back to a comparison against the less precise Capacity. If that is also unset, the scheduler assumes that capacity is insufficient and tries some other node.
 * 
 */
public final class CSIStorageCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CSIStorageCapacityArgs Empty = new CSIStorageCapacityArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<String> capacity;

    /**
     * @return capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable.
     * 
     */
    public Optional<Output<String>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * maximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
     * 
     */
    @Import(name="maximumVolumeSize")
    private @Nullable Output<String> maximumVolumeSize;

    /**
     * @return maximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
     * 
     */
    public Optional<Output<String>> maximumVolumeSize() {
        return Optional.ofNullable(this.maximumVolumeSize);
    }

    /**
     * Standard object&#39;s metadata. The name has no particular meaning. It must be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-&lt;uuid&gt;, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
     * 
     * Objects are namespaced.
     * 
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object&#39;s metadata. The name has no particular meaning. It must be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-&lt;uuid&gt;, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
     * 
     * Objects are namespaced.
     * 
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * nodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
     * 
     */
    @Import(name="nodeTopology")
    private @Nullable Output<LabelSelectorArgs> nodeTopology;

    /**
     * @return nodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
     * 
     */
    public Optional<Output<LabelSelectorArgs>> nodeTopology() {
        return Optional.ofNullable(this.nodeTopology);
    }

    /**
     * storageClassName represents the name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
     * 
     */
    @Import(name="storageClassName", required=true)
    private Output<String> storageClassName;

    /**
     * @return storageClassName represents the name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
     * 
     */
    public Output<String> storageClassName() {
        return this.storageClassName;
    }

    private CSIStorageCapacityArgs() {}

    private CSIStorageCapacityArgs(CSIStorageCapacityArgs $) {
        this.apiVersion = $.apiVersion;
        this.capacity = $.capacity;
        this.kind = $.kind;
        this.maximumVolumeSize = $.maximumVolumeSize;
        this.metadata = $.metadata;
        this.nodeTopology = $.nodeTopology;
        this.storageClassName = $.storageClassName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CSIStorageCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CSIStorageCapacityArgs $;

        public Builder() {
            $ = new CSIStorageCapacityArgs();
        }

        public Builder(CSIStorageCapacityArgs defaults) {
            $ = new CSIStorageCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param capacity capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         * 
         * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<String> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         * 
         * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable.
         * 
         * @return builder
         * 
         */
        public Builder capacity(String capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param maximumVolumeSize maximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         * 
         * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
         * 
         * @return builder
         * 
         */
        public Builder maximumVolumeSize(@Nullable Output<String> maximumVolumeSize) {
            $.maximumVolumeSize = maximumVolumeSize;
            return this;
        }

        /**
         * @param maximumVolumeSize maximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         * 
         * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
         * 
         * @return builder
         * 
         */
        public Builder maximumVolumeSize(String maximumVolumeSize) {
            return maximumVolumeSize(Output.of(maximumVolumeSize));
        }

        /**
         * @param metadata Standard object&#39;s metadata. The name has no particular meaning. It must be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-&lt;uuid&gt;, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
         * 
         * Objects are namespaced.
         * 
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object&#39;s metadata. The name has no particular meaning. It must be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-&lt;uuid&gt;, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
         * 
         * Objects are namespaced.
         * 
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param nodeTopology nodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder nodeTopology(@Nullable Output<LabelSelectorArgs> nodeTopology) {
            $.nodeTopology = nodeTopology;
            return this;
        }

        /**
         * @param nodeTopology nodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder nodeTopology(LabelSelectorArgs nodeTopology) {
            return nodeTopology(Output.of(nodeTopology));
        }

        /**
         * @param storageClassName storageClassName represents the name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder storageClassName(Output<String> storageClassName) {
            $.storageClassName = storageClassName;
            return this;
        }

        /**
         * @param storageClassName storageClassName represents the name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder storageClassName(String storageClassName) {
            return storageClassName(Output.of(storageClassName));
        }

        public CSIStorageCapacityArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            if ($.storageClassName == null) {
                throw new MissingRequiredPropertyException("CSIStorageCapacityArgs", "storageClassName");
            }
            return $;
        }
    }

}
