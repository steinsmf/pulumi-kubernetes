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
    /// DeviceAllocationConfiguration gets embedded in an AllocationResult.
    /// </summary>
    public class DeviceAllocationConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Opaque provides driver-specific configuration parameters.
        /// </summary>
        [Input("opaque")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.OpaqueDeviceConfigurationArgs>? Opaque { get; set; }

        [Input("requests")]
        private InputList<string>? _requests;

        /// <summary>
        /// Requests lists the names of requests where the configuration applies. If empty, its applies to all requests.
        /// </summary>
        public InputList<string> Requests
        {
            get => _requests ?? (_requests = new InputList<string>());
            set => _requests = value;
        }

        /// <summary>
        /// Source records whether the configuration comes from a class and thus is not something that a normal user would have been able to set or from a claim.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        public DeviceAllocationConfigurationArgs()
        {
        }
        public static new DeviceAllocationConfigurationArgs Empty => new DeviceAllocationConfigurationArgs();
    }
}
