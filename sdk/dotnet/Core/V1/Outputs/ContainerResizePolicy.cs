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
    /// ContainerResizePolicy represents resource resize policy for the container.
    /// </summary>
    [OutputType]
    public sealed class ContainerResizePolicy
    {
        /// <summary>
        /// Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.
        /// </summary>
        public readonly string ResourceName;
        /// <summary>
        /// Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.
        /// </summary>
        public readonly string RestartPolicy;

        [OutputConstructor]
        private ContainerResizePolicy(
            string resourceName,

            string restartPolicy)
        {
            ResourceName = resourceName;
            RestartPolicy = restartPolicy;
        }
    }
}