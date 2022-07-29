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
    /// NamespaceStatus is information about the current status of a Namespace.
    /// </summary>
    [OutputType]
    public sealed class NamespaceStatusPatch
    {
        /// <summary>
        /// Represents the latest available observations of a namespace's current state.
        /// </summary>
        public readonly ImmutableArray<Pulumi.Kubernetes.Types.Outputs.Core.V1.NamespaceConditionPatch> Conditions;
        /// <summary>
        /// Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
        /// </summary>
        public readonly string Phase;

        [OutputConstructor]
        private NamespaceStatusPatch(
            ImmutableArray<Pulumi.Kubernetes.Types.Outputs.Core.V1.NamespaceConditionPatch> conditions,

            string phase)
        {
            Conditions = conditions;
            Phase = phase;
        }
    }
}