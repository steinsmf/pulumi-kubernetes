// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.AuditRegistraion.V1Alpha1
{

    /// <summary>
    /// Policy defines the configuration of how audit events are logged
    /// </summary>
    [OutputType]
    public sealed class PolicyPatch
    {
        /// <summary>
        /// The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
        /// </summary>
        public readonly string Level;
        /// <summary>
        /// Stages is a list of stages for which events are created.
        /// </summary>
        public readonly ImmutableArray<string> Stages;

        [OutputConstructor]
        private PolicyPatch(
            string level,

            ImmutableArray<string> stages)
        {
            Level = level;
            Stages = stages;
        }
    }
}