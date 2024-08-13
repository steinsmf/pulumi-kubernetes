// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Resource.V1Alpha2
{
    /// <summary>
    /// ResourceSlice provides information about available resources on individual nodes.
    /// </summary>
    [KubernetesResourceType("kubernetes:resource.k8s.io/v1alpha2:ResourceSlice")]
    public partial class ResourceSlice : KubernetesResource
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        [Output("apiVersion")]
        public Output<string> ApiVersion { get; private set; } = null!;

        /// <summary>
        /// DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        /// </summary>
        [Output("driverName")]
        public Output<string> DriverName { get; private set; } = null!;

        /// <summary>
        /// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// Standard object metadata
        /// </summary>
        [Output("metadata")]
        public Output<Pulumi.Kubernetes.Types.Outputs.Meta.V1.ObjectMeta> Metadata { get; private set; } = null!;

        /// <summary>
        /// NamedResources describes available resources using the named resources model.
        /// </summary>
        [Output("namedResources")]
        public Output<Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha2.NamedResourcesResources> NamedResources { get; private set; } = null!;

        /// <summary>
        /// NodeName identifies the node which provides the resources if they are local to a node.
        /// 
        /// A field selector can be used to list only ResourceSlice objects with a certain node name.
        /// </summary>
        [Output("nodeName")]
        public Output<string> NodeName { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceSlice resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceSlice(string name, Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.ResourceSliceArgs? args = null, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha2:ResourceSlice", name, MakeArgs(args), MakeResourceOptions(options, ""))
        {
        }
        internal ResourceSlice(string name, ImmutableDictionary<string, object?> dictionary, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha2:ResourceSlice", name, new DictionaryResourceArgs(dictionary), MakeResourceOptions(options, ""))
        {
        }

        private ResourceSlice(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha2:ResourceSlice", name, null, MakeResourceOptions(options, id))
        {
        }

        private static Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.ResourceSliceArgs? MakeArgs(Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.ResourceSliceArgs? args)
        {
            args ??= new Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.ResourceSliceArgs();
            args.ApiVersion = "resource.k8s.io/v1alpha2";
            args.Kind = "ResourceSlice";
            return args;
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "kubernetes:resource.k8s.io/v1alpha3:ResourceSlice" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ResourceSlice resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceSlice Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new ResourceSlice(name, id, options);
        }
    }
}
namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2
{

    public class ResourceSliceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        /// <summary>
        /// DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        /// </summary>
        [Input("driverName", required: true)]
        public Input<string> DriverName { get; set; } = null!;

        /// <summary>
        /// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Standard object metadata
        /// </summary>
        [Input("metadata")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Meta.V1.ObjectMetaArgs>? Metadata { get; set; }

        /// <summary>
        /// NamedResources describes available resources using the named resources model.
        /// </summary>
        [Input("namedResources")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.NamedResourcesResourcesArgs>? NamedResources { get; set; }

        /// <summary>
        /// NodeName identifies the node which provides the resources if they are local to a node.
        /// 
        /// A field selector can be used to list only ResourceSlice objects with a certain node name.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        public ResourceSliceArgs()
        {
        }
        public static new ResourceSliceArgs Empty => new ResourceSliceArgs();
    }
}
