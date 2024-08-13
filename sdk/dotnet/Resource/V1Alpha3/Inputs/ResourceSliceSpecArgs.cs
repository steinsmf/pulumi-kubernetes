// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3
{

    /// <summary>
    /// ResourceSliceSpec contains the information published by the driver in one ResourceSlice.
    /// </summary>
    public class ResourceSliceSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AllNodes indicates that all nodes have access to the resources in the pool.
        /// 
        /// Exactly one of NodeName, NodeSelector and AllNodes must be set.
        /// </summary>
        [Input("allNodes")]
        public Input<bool>? AllNodes { get; set; }

        [Input("devices")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceArgs>? _devices;

        /// <summary>
        /// Devices lists some or all of the devices in this pool.
        /// 
        /// Must not have more than 128 entries.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceArgs> Devices
        {
            get => _devices ?? (_devices = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceArgs>());
            set => _devices = value;
        }

        /// <summary>
        /// Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        /// 
        /// Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.
        /// </summary>
        [Input("driver", required: true)]
        public Input<string> Driver { get; set; } = null!;

        /// <summary>
        /// NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.
        /// 
        /// This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.
        /// 
        /// Exactly one of NodeName, NodeSelector and AllNodes must be set. This field is immutable.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// NodeSelector defines which nodes have access to the resources in the pool, when that pool is not limited to a single node.
        /// 
        /// Must use exactly one term.
        /// 
        /// Exactly one of NodeName, NodeSelector and AllNodes must be set.
        /// </summary>
        [Input("nodeSelector")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Core.V1.NodeSelectorArgs>? NodeSelector { get; set; }

        /// <summary>
        /// Pool describes the pool that this ResourceSlice belongs to.
        /// </summary>
        [Input("pool", required: true)]
        public Input<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.ResourcePoolArgs> Pool { get; set; } = null!;

        public ResourceSliceSpecArgs()
        {
        }
        public static new ResourceSliceSpecArgs Empty => new ResourceSliceSpecArgs();
    }
}
