// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha3
{

    /// <summary>
    /// DeviceSelector must have exactly one field set.
    /// </summary>
    [OutputType]
    public sealed class DeviceSelectorPatch
    {
        /// <summary>
        /// CEL contains a CEL expression for selecting a device.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha3.CELDeviceSelectorPatch Cel;

        [OutputConstructor]
        private DeviceSelectorPatch(Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha3.CELDeviceSelectorPatch cel)
        {
            Cel = cel;
        }
    }
}
