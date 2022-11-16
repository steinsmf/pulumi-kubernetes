// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha1
{

    /// <summary>
    /// ResourceClaimParametersReference contains enough information to let you locate the parameters for a ResourceClaim. The object must be in the same namespace as the ResourceClaim.
    /// </summary>
    [OutputType]
    public sealed class ResourceClaimParametersReference
    {
        /// <summary>
        /// APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
        /// </summary>
        public readonly string ApiGroup;
        /// <summary>
        /// Kind is the type of resource being referenced. This is the same value as in the parameter object's metadata, for example "ConfigMap".
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// Name is the name of resource being referenced.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ResourceClaimParametersReference(
            string apiGroup,

            string kind,

            string name)
        {
            ApiGroup = apiGroup;
            Kind = kind;
            Name = name;
        }
    }
}
