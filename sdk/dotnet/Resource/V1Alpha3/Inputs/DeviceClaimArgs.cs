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
    /// DeviceClaim defines how to request devices with a ResourceClaim.
    /// </summary>
    public class DeviceClaimArgs : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClaimConfigurationArgs>? _config;

        /// <summary>
        /// This field holds configuration for multiple potential drivers which could satisfy requests in this claim. It is ignored while allocating the claim.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClaimConfigurationArgs> Config
        {
            get => _config ?? (_config = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClaimConfigurationArgs>());
            set => _config = value;
        }

        [Input("constraints")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceConstraintArgs>? _constraints;

        /// <summary>
        /// These constraints must be satisfied by the set of devices that get allocated for the claim.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceConstraintArgs> Constraints
        {
            get => _constraints ?? (_constraints = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceConstraintArgs>());
            set => _constraints = value;
        }

        [Input("requests")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceRequestArgs>? _requests;

        /// <summary>
        /// Requests represent individual requests for distinct devices which must all be satisfied. If empty, nothing needs to be allocated.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceRequestArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceRequestArgs>());
            set => _requests = value;
        }

        public DeviceClaimArgs()
        {
        }
        public static new DeviceClaimArgs Empty => new DeviceClaimArgs();
    }
}
