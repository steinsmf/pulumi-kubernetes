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
    /// DeviceAllocationResult is the result of allocating devices.
    /// </summary>
    public class DeviceAllocationResultArgs : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceAllocationConfigurationArgs>? _config;

        /// <summary>
        /// This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.
        /// 
        /// This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceAllocationConfigurationArgs> Config
        {
            get => _config ?? (_config = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceAllocationConfigurationArgs>());
            set => _config = value;
        }

        [Input("results")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceRequestAllocationResultArgs>? _results;

        /// <summary>
        /// Results lists all allocated devices.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceRequestAllocationResultArgs> Results
        {
            get => _results ?? (_results = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceRequestAllocationResultArgs>());
            set => _results = value;
        }

        public DeviceAllocationResultArgs()
        {
        }
        public static new DeviceAllocationResultArgs Empty => new DeviceAllocationResultArgs();
    }
}
