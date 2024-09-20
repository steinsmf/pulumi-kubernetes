// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Helm.V4
{

    /// <summary>
    /// Specification defining the Helm chart repository to use.
    /// </summary>
    public class RepositoryOptsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Repository's CA File
        /// </summary>
        [Input("caFile")]
        public Input<AssetOrArchive>? CaFile { get; set; }

        /// <summary>
        /// The repository's cert file
        /// </summary>
        [Input("certFile")]
        public Input<AssetOrArchive>? CertFile { get; set; }

        /// <summary>
        /// The repository's cert key file
        /// </summary>
        [Input("keyFile")]
        public Input<AssetOrArchive>? KeyFile { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for HTTP basic authentication
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Repository where to locate the requested chart. If it's a URL the chart is installed without installing the repository.
        /// </summary>
        [Input("repo")]
        public Input<string>? Repo { get; set; }

        /// <summary>
        /// Username for HTTP basic authentication
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public RepositoryOptsArgs()
        {
        }
        public static new RepositoryOptsArgs Empty => new RepositoryOptsArgs();
    }
}
