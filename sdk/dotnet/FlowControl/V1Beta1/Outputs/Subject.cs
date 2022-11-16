// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta1
{

    /// <summary>
    /// Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
    /// </summary>
    [OutputType]
    public sealed class Subject
    {
        public readonly Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta1.GroupSubject Group;
        /// <summary>
        /// Required
        /// </summary>
        public readonly string Kind;
        public readonly Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta1.ServiceAccountSubject ServiceAccount;
        public readonly Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta1.UserSubject User;

        [OutputConstructor]
        private Subject(
            Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta1.GroupSubject group,

            string kind,

            Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta1.ServiceAccountSubject serviceAccount,

            Pulumi.Kubernetes.Types.Outputs.FlowControl.V1Beta1.UserSubject user)
        {
            Group = group;
            Kind = kind;
            ServiceAccount = serviceAccount;
            User = user;
        }
    }
}
