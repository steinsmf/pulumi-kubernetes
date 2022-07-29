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
    /// PodDNSConfigOption defines DNS resolver options of a pod.
    /// </summary>
    [OutputType]
    public sealed class PodDNSConfigOptionPatch
    {
        /// <summary>
        /// Required.
        /// </summary>
        public readonly string Name;
        public readonly string Value;

        [OutputConstructor]
        private PodDNSConfigOptionPatch(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}