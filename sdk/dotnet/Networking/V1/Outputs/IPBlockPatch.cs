// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Networking.V1
{

    /// <summary>
    /// IPBlock describes a particular CIDR (Ex. "192.168.1.0/24","2001:db8::/64") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
    /// </summary>
    [OutputType]
    public sealed class IPBlockPatch
    {
        /// <summary>
        /// CIDR is a string representing the IP Block Valid examples are "192.168.1.0/24" or "2001:db8::/64"
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.0/24" or "2001:db8::/64" Except values will be rejected if they are outside the CIDR range
        /// </summary>
        public readonly ImmutableArray<string> Except;

        [OutputConstructor]
        private IPBlockPatch(
            string cidr,

            ImmutableArray<string> except)
        {
            Cidr = cidr;
            Except = except;
        }
    }
}
