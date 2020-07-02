// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Authorization.V1Beta1
{

    /// <summary>
    /// SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
    /// </summary>
    public class SubjectAccessReviewSpecArgs : Pulumi.ResourceArgs
    {
        [Input("extra")]
        private InputMap<ImmutableArray<string>>? _extra;

        /// <summary>
        /// Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
        /// </summary>
        public InputMap<ImmutableArray<string>> Extra
        {
            get => _extra ?? (_extra = new InputMap<ImmutableArray<string>>());
            set => _extra = value;
        }

        [Input("group")]
        private InputList<string>? _group;

        /// <summary>
        /// Groups is the groups you're testing for.
        /// </summary>
        public InputList<string> Group
        {
            get => _group ?? (_group = new InputList<string>());
            set => _group = value;
        }

        /// <summary>
        /// NonResourceAttributes describes information for a non-resource access request
        /// </summary>
        [Input("nonResourceAttributes")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Authorization.V1Beta1.NonResourceAttributesArgs>? NonResourceAttributes { get; set; }

        /// <summary>
        /// ResourceAuthorizationAttributes describes information for a resource access request
        /// </summary>
        [Input("resourceAttributes")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Authorization.V1Beta1.ResourceAttributesArgs>? ResourceAttributes { get; set; }

        /// <summary>
        /// UID information about the requesting user.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// User is the user you're testing for. If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public SubjectAccessReviewSpecArgs()
        {
        }
    }
}