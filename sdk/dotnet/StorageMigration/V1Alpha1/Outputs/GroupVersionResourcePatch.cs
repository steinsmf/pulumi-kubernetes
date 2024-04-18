// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.StorageMigration.V1Alpha1
{

    /// <summary>
    /// The names of the group, the version, and the resource.
    /// </summary>
    [OutputType]
    public sealed class GroupVersionResourcePatch
    {
        /// <summary>
        /// The name of the group.
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// The name of the resource.
        /// </summary>
        public readonly string Resource;
        /// <summary>
        /// The name of the version.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GroupVersionResourcePatch(
            string group,

            string resource,

            string version)
        {
            Group = group;
            Resource = resource;
            Version = version;
        }
    }
}
