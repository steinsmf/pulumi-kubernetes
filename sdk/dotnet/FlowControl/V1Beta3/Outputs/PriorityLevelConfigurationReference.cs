// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta3
{

    /// <summary>
    /// PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
    /// </summary>
    [OutputType]
    public sealed class PriorityLevelConfigurationReference
    {
        /// <summary>
        /// `name` is the name of the priority level configuration being referenced Required.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private PriorityLevelConfigurationReference(string name)
        {
            Name = name;
        }
    }
}
