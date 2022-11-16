// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Core.V1
{

    /// <summary>
    /// PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
    /// </summary>
    [OutputType]
    public sealed class PersistentVolumeClaimSpec
    {
        /// <summary>
        /// accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
        /// </summary>
        public readonly ImmutableArray<string> AccessModes;
        /// <summary>
        /// dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. When the AnyVolumeDataSource feature gate is enabled, dataSource contents will be copied to dataSourceRef, and dataSourceRef contents will be copied to dataSource when dataSourceRef.namespace is not specified. If the namespace is specified, then dataSourceRef will not be copied to dataSource.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Core.V1.TypedLocalObjectReference DataSource;
        /// <summary>
        /// dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the dataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, when namespace isn't specified in dataSourceRef, both fields (dataSource and dataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. When namespace is specified in dataSourceRef, dataSource isn't set to the same value and must be empty. There are three important differences between dataSource and dataSourceRef: * While dataSource only allows two specific types of objects, dataSourceRef
        ///   allows any non-core object, as well as PersistentVolumeClaim objects.
        /// * While dataSource ignores disallowed values (dropping them), dataSourceRef
        ///   preserves all values, and generates an error if a disallowed value is
        ///   specified.
        /// * While dataSource only allows local objects, dataSourceRef allows objects
        ///   in any namespaces.
        /// (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled. (Alpha) Using the namespace field of dataSourceRef requires the CrossNamespaceVolumeDataSource feature gate to be enabled.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Core.V1.TypedObjectReference DataSourceRef;
        /// <summary>
        /// resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Core.V1.ResourceRequirements Resources;
        /// <summary>
        /// selector is a label query over volumes to consider for binding.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Meta.V1.LabelSelector Selector;
        /// <summary>
        /// storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
        /// </summary>
        public readonly string StorageClassName;
        /// <summary>
        /// volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
        /// </summary>
        public readonly string VolumeMode;
        /// <summary>
        /// volumeName is the binding reference to the PersistentVolume backing this claim.
        /// </summary>
        public readonly string VolumeName;

        [OutputConstructor]
        private PersistentVolumeClaimSpec(
            ImmutableArray<string> accessModes,

            Pulumi.Kubernetes.Types.Outputs.Core.V1.TypedLocalObjectReference dataSource,

            Pulumi.Kubernetes.Types.Outputs.Core.V1.TypedObjectReference dataSourceRef,

            Pulumi.Kubernetes.Types.Outputs.Core.V1.ResourceRequirements resources,

            Pulumi.Kubernetes.Types.Outputs.Meta.V1.LabelSelector selector,

            string storageClassName,

            string volumeMode,

            string volumeName)
        {
            AccessModes = accessModes;
            DataSource = dataSource;
            DataSourceRef = dataSourceRef;
            Resources = resources;
            Selector = selector;
            StorageClassName = storageClassName;
            VolumeMode = volumeMode;
            VolumeName = volumeName;
        }
    }
}
