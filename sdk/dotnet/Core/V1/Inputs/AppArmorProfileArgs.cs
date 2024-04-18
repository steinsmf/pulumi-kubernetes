// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Core.V1
{

    /// <summary>
    /// AppArmorProfile defines a pod or container's AppArmor settings.
    /// </summary>
    public class AppArmorProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is "Localhost".
        /// </summary>
        [Input("localhostProfile")]
        public Input<string>? LocalhostProfile { get; set; }

        /// <summary>
        /// type indicates which kind of AppArmor profile will be applied. Valid options are:
        ///   Localhost - a profile pre-loaded on the node.
        ///   RuntimeDefault - the container runtime's default profile.
        ///   Unconfined - no AppArmor enforcement.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AppArmorProfileArgs()
        {
        }
        public static new AppArmorProfileArgs Empty => new AppArmorProfileArgs();
    }
}
