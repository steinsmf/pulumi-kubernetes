// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.AuditRegistraion.V1Alpha1
{

    /// <summary>
    /// AuditSinkSpec holds the spec for the audit sink
    /// </summary>
    public class AuditSinkSpecPatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Policy defines the policy for selecting which events should be sent to the webhook required
        /// </summary>
        [Input("policy")]
        public Input<Pulumi.Kubernetes.Types.Inputs.AuditRegistraion.V1Alpha1.PolicyPatchArgs>? Policy { get; set; }

        /// <summary>
        /// Webhook to send events required
        /// </summary>
        [Input("webhook")]
        public Input<Pulumi.Kubernetes.Types.Inputs.AuditRegistraion.V1Alpha1.WebhookPatchArgs>? Webhook { get; set; }

        public AuditSinkSpecPatchArgs()
        {
        }
        public static new AuditSinkSpecPatchArgs Empty => new AuditSinkSpecPatchArgs();
    }
}