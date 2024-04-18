// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha2
{

    /// <summary>
    /// ResourceSlice provides information about available resources on individual nodes.
    /// </summary>
    [OutputType]
    public sealed class ResourceSlice
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        public readonly string ApiVersion;
        /// <summary>
        /// DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        /// </summary>
        public readonly string DriverName;
        /// <summary>
        /// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// Standard object metadata
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Meta.V1.ObjectMeta Metadata;
        /// <summary>
        /// NamedResources describes available resources using the named resources model.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha2.NamedResourcesResources NamedResources;
        /// <summary>
        /// NodeName identifies the node which provides the resources if they are local to a node.
        /// 
        /// A field selector can be used to list only ResourceSlice objects with a certain node name.
        /// </summary>
        public readonly string NodeName;

        [OutputConstructor]
        private ResourceSlice(
            string apiVersion,

            string driverName,

            string kind,

            Pulumi.Kubernetes.Types.Outputs.Meta.V1.ObjectMeta metadata,

            Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha2.NamedResourcesResources namedResources,

            string nodeName)
        {
            ApiVersion = apiVersion;
            DriverName = driverName;
            Kind = kind;
            Metadata = metadata;
            NamedResources = namedResources;
            NodeName = nodeName;
        }
    }
}