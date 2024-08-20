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
    /// PodSchedulingContextSpec describes where resources for the Pod are needed.
    /// </summary>
    public class PodSchedulingContextSpecPatchArgs : global::Pulumi.ResourceArgs
    {
        [Input("potentialNodes")]
        private InputList<string>? _potentialNodes;

        /// <summary>
        /// PotentialNodes lists nodes where the Pod might be able to run.
        /// 
        /// The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
        /// </summary>
        public InputList<string> PotentialNodes
        {
            get => _potentialNodes ?? (_potentialNodes = new InputList<string>());
            set => _potentialNodes = value;
        }

        /// <summary>
        /// SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use "WaitForFirstConsumer" allocation is to be attempted.
        /// </summary>
        [Input("selectedNode")]
        public Input<string>? SelectedNode { get; set; }

        public PodSchedulingContextSpecPatchArgs()
        {
        }
        public static new PodSchedulingContextSpecPatchArgs Empty => new PodSchedulingContextSpecPatchArgs();
    }
}