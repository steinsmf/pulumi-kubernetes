// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Core.V1
{

    [OutputType]
    public sealed class ResourceStatus
    {
        /// <summary>
        /// Name of the resource. Must be unique within the pod and match one of the resources from the pod spec.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// List of unique Resources health. Each element in the list contains an unique resource ID and resource health. At a minimum, ResourceID must uniquely identify the Resource allocated to the Pod on the Node for the lifetime of a Pod. See ResourceID type for it's definition.
        /// </summary>
        public readonly ImmutableArray<Pulumi.Kubernetes.Types.Outputs.Core.V1.ResourceHealth> Resources;

        [OutputConstructor]
        private ResourceStatus(
            string name,

            ImmutableArray<Pulumi.Kubernetes.Types.Outputs.Core.V1.ResourceHealth> resources)
        {
            Name = name;
            Resources = resources;
        }
    }
}