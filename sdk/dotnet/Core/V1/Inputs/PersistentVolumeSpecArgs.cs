// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Core.V1
{

    /// <summary>
    /// PersistentVolumeSpec is the specification of a persistent volume.
    /// </summary>
    public class PersistentVolumeSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessModes")]
        private InputList<string>? _accessModes;

        /// <summary>
        /// accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
        /// </summary>
        public InputList<string> AccessModes
        {
            get => _accessModes ?? (_accessModes = new InputList<string>());
            set => _accessModes = value;
        }

        /// <summary>
        /// awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
        /// </summary>
        [Input("awsElasticBlockStore")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.AWSElasticBlockStoreVolumeSourceArgs>? AwsElasticBlockStore { get; set; }

        /// <summary>
        /// azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
        /// </summary>
        [Input("azureDisk")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.AzureDiskVolumeSourceArgs>? AzureDisk { get; set; }

        /// <summary>
        /// azureFile represents an Azure File Service mount on the host and bind mount to the pod.
        /// </summary>
        [Input("azureFile")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.AzureFilePersistentVolumeSourceArgs>? AzureFile { get; set; }

        [Input("capacity")]
        private InputMap<string>? _capacity;

        /// <summary>
        /// capacity is the description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
        /// </summary>
        public InputMap<string> Capacity
        {
            get => _capacity ?? (_capacity = new InputMap<string>());
            set => _capacity = value;
        }

        /// <summary>
        /// cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
        /// </summary>
        [Input("cephfs")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.CephFSPersistentVolumeSourceArgs>? Cephfs { get; set; }

        /// <summary>
        /// cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
        /// </summary>
        [Input("cinder")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.CinderPersistentVolumeSourceArgs>? Cinder { get; set; }

        /// <summary>
        /// claimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
        /// </summary>
        [Input("claimRef")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.ObjectReferenceArgs>? ClaimRef { get; set; }

        /// <summary>
        /// csi represents storage that is handled by an external CSI driver (Beta feature).
        /// </summary>
        [Input("csi")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.CSIPersistentVolumeSourceArgs>? Csi { get; set; }

        /// <summary>
        /// fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
        /// </summary>
        [Input("fc")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.FCVolumeSourceArgs>? Fc { get; set; }

        /// <summary>
        /// flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
        /// </summary>
        [Input("flexVolume")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.FlexPersistentVolumeSourceArgs>? FlexVolume { get; set; }

        /// <summary>
        /// flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
        /// </summary>
        [Input("flocker")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.FlockerVolumeSourceArgs>? Flocker { get; set; }

        /// <summary>
        /// gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
        /// </summary>
        [Input("gcePersistentDisk")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.GCEPersistentDiskVolumeSourceArgs>? GcePersistentDisk { get; set; }

        /// <summary>
        /// glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
        /// </summary>
        [Input("glusterfs")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.GlusterfsPersistentVolumeSourceArgs>? Glusterfs { get; set; }

        /// <summary>
        /// hostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
        /// </summary>
        [Input("hostPath")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.HostPathVolumeSourceArgs>? HostPath { get; set; }

        /// <summary>
        /// iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
        /// </summary>
        [Input("iscsi")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.ISCSIPersistentVolumeSourceArgs>? Iscsi { get; set; }

        /// <summary>
        /// local represents directly-attached storage with node affinity
        /// </summary>
        [Input("local")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.LocalVolumeSourceArgs>? Local { get; set; }

        [Input("mountOptions")]
        private InputList<string>? _mountOptions;

        /// <summary>
        /// mountOptions is the list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
        /// </summary>
        public InputList<string> MountOptions
        {
            get => _mountOptions ?? (_mountOptions = new InputList<string>());
            set => _mountOptions = value;
        }

        /// <summary>
        /// nfs represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
        /// </summary>
        [Input("nfs")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.NFSVolumeSourceArgs>? Nfs { get; set; }

        /// <summary>
        /// nodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
        /// </summary>
        [Input("nodeAffinity")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.VolumeNodeAffinityArgs>? NodeAffinity { get; set; }

        /// <summary>
        /// persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
        /// </summary>
        [Input("persistentVolumeReclaimPolicy")]
        public Input<string>? PersistentVolumeReclaimPolicy { get; set; }

        /// <summary>
        /// photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
        /// </summary>
        [Input("photonPersistentDisk")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.PhotonPersistentDiskVolumeSourceArgs>? PhotonPersistentDisk { get; set; }

        /// <summary>
        /// portworxVolume represents a portworx volume attached and mounted on kubelets host machine
        /// </summary>
        [Input("portworxVolume")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.PortworxVolumeSourceArgs>? PortworxVolume { get; set; }

        /// <summary>
        /// quobyte represents a Quobyte mount on the host that shares a pod's lifetime
        /// </summary>
        [Input("quobyte")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.QuobyteVolumeSourceArgs>? Quobyte { get; set; }

        /// <summary>
        /// rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
        /// </summary>
        [Input("rbd")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.RBDPersistentVolumeSourceArgs>? Rbd { get; set; }

        /// <summary>
        /// scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
        /// </summary>
        [Input("scaleIO")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.ScaleIOPersistentVolumeSourceArgs>? ScaleIO { get; set; }

        /// <summary>
        /// storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
        /// </summary>
        [Input("storageClassName")]
        public Input<string>? StorageClassName { get; set; }

        /// <summary>
        /// storageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
        /// </summary>
        [Input("storageos")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.StorageOSPersistentVolumeSourceArgs>? Storageos { get; set; }

        /// <summary>
        /// Name of VolumeAttributesClass to which this persistent volume belongs. Empty value is not allowed. When this field is not set, it indicates that this volume does not belong to any VolumeAttributesClass. This field is mutable and can be changed by the CSI driver after a volume has been updated successfully to a new class. For an unbound PersistentVolume, the volumeAttributesClassName will be matched with unbound PersistentVolumeClaims during the binding process. This is a beta field and requires enabling VolumeAttributesClass feature (off by default).
        /// </summary>
        [Input("volumeAttributesClassName")]
        public Input<string>? VolumeAttributesClassName { get; set; }

        /// <summary>
        /// volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
        /// </summary>
        [Input("volumeMode")]
        public Input<string>? VolumeMode { get; set; }

        /// <summary>
        /// vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
        /// </summary>
        [Input("vsphereVolume")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.VsphereVirtualDiskVolumeSourceArgs>? VsphereVolume { get; set; }

        public PersistentVolumeSpecArgs()
        {
        }
        public static new PersistentVolumeSpecArgs Empty => new PersistentVolumeSpecArgs();
    }
}
