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
    /// PersistentVolumeClaimCondition contains details about state of pvc
    /// </summary>
    [OutputType]
    public sealed class PersistentVolumeClaimConditionPatch
    {
        /// <summary>
        /// lastProbeTime is the time we probed the condition.
        /// </summary>
        public readonly string LastProbeTime;
        /// <summary>
        /// lastTransitionTime is the time the condition transitioned from one status to another.
        /// </summary>
        public readonly string LastTransitionTime;
        /// <summary>
        /// message is the human-readable message indicating details about last transition.
        /// </summary>
        public readonly string Message;
        /// <summary>
        /// reason is a unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports "Resizing" that means the underlying persistent volume is being resized.
        /// </summary>
        public readonly string Reason;
        public readonly string Status;
        public readonly string Type;

        [OutputConstructor]
        private PersistentVolumeClaimConditionPatch(
            string lastProbeTime,

            string lastTransitionTime,

            string message,

            string reason,

            string status,

            string type)
        {
            LastProbeTime = lastProbeTime;
            LastTransitionTime = lastTransitionTime;
            Message = message;
            Reason = reason;
            Status = status;
            Type = type;
        }
    }
}
