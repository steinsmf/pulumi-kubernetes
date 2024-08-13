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
    /// DeviceClaimConfiguration is used for configuration parameters in DeviceClaim.
    /// </summary>
    public class DeviceClaimConfigurationPatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Opaque provides driver-specific configuration parameters.
        /// </summary>
        [Input("opaque")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.OpaqueDeviceConfigurationPatchArgs>? Opaque { get; set; }

        [Input("requests")]
        private InputList<string>? _requests;

        /// <summary>
        /// Requests lists the names of requests where the configuration applies. If empty, it applies to all requests.
        /// </summary>
        public InputList<string> Requests
        {
            get => _requests ?? (_requests = new InputList<string>());
            set => _requests = value;
        }

        public DeviceClaimConfigurationPatchArgs()
        {
        }
        public static new DeviceClaimConfigurationPatchArgs Empty => new DeviceClaimConfigurationPatchArgs();
    }
}
