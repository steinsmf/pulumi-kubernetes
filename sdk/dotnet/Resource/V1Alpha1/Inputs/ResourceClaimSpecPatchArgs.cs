// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha1
{

    /// <summary>
    /// ResourceClaimSpec defines how a resource is to be allocated.
    /// </summary>
    public class ResourceClaimSpecPatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allocation can start immediately or when a Pod wants to use the resource. "WaitForFirstConsumer" is the default.
        /// </summary>
        [Input("allocationMode")]
        public Input<string>? AllocationMode { get; set; }

        /// <summary>
        /// ParametersRef references a separate object with arbitrary parameters that will be used by the driver when allocating a resource for the claim.
        /// 
        /// The object must be in the same namespace as the ResourceClaim.
        /// </summary>
        [Input("parametersRef")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha1.ResourceClaimParametersReferencePatchArgs>? ParametersRef { get; set; }

        /// <summary>
        /// ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
        /// </summary>
        [Input("resourceClassName")]
        public Input<string>? ResourceClassName { get; set; }

        public ResourceClaimSpecPatchArgs()
        {
        }
        public static new ResourceClaimSpecPatchArgs Empty => new ResourceClaimSpecPatchArgs();
    }
}
