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
    /// DeviceRequestAllocationResult contains the allocation result for one request.
    /// </summary>
    public class DeviceRequestAllocationResultArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Device references one device instance via its name in the driver's resource pool. It must be a DNS label.
        /// </summary>
        [Input("device", required: true)]
        public Input<string> Device { get; set; } = null!;

        /// <summary>
        /// Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.
        /// 
        /// Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
        /// </summary>
        [Input("driver", required: true)]
        public Input<string> Driver { get; set; } = null!;

        /// <summary>
        /// This name together with the driver name and the device name field identify which device was allocated (`&lt;driver name&gt;/&lt;pool name&gt;/&lt;device name&gt;`).
        /// 
        /// Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.
        /// </summary>
        [Input("pool", required: true)]
        public Input<string> Pool { get; set; } = null!;

        /// <summary>
        /// Request is the name of the request in the claim which caused this device to be allocated. Multiple devices may have been allocated per request.
        /// </summary>
        [Input("request", required: true)]
        public Input<string> Request { get; set; } = null!;

        public DeviceRequestAllocationResultArgs()
        {
        }
        public static new DeviceRequestAllocationResultArgs Empty => new DeviceRequestAllocationResultArgs();
    }
}
