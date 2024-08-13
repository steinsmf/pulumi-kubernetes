// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Resource.V1Alpha3
{
    /// <summary>
    /// DeviceClass is a vendor- or admin-provided resource that contains device configuration and selectors. It can be referenced in the device requests of a claim to apply these presets. Cluster scoped.
    /// 
    /// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
    /// </summary>
    [KubernetesResourceType("kubernetes:resource.k8s.io/v1alpha3:DeviceClass")]
    public partial class DeviceClass : KubernetesResource
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        [Output("apiVersion")]
        public Output<string> ApiVersion { get; private set; } = null!;

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
        /// Spec defines what can be allocated and how to configure it.
        /// 
        /// This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
        /// 
        /// Changing the spec automatically increments the metadata.generation number.
        /// </summary>
        [Output("spec")]
        public Output<Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha3.DeviceClassSpec> Spec { get; private set; } = null!;


        /// <summary>
        /// Create a DeviceClass resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeviceClass(string name, Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClassArgs? args = null, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha3:DeviceClass", name, MakeArgs(args), MakeResourceOptions(options, ""))
        {
        }
        internal DeviceClass(string name, ImmutableDictionary<string, object?> dictionary, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha3:DeviceClass", name, new DictionaryResourceArgs(dictionary), MakeResourceOptions(options, ""))
        {
        }

        private DeviceClass(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha3:DeviceClass", name, null, MakeResourceOptions(options, id))
        {
        }

        private static Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClassArgs? MakeArgs(Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClassArgs? args)
        {
            args ??= new Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClassArgs();
            args.ApiVersion = "resource.k8s.io/v1alpha3";
            args.Kind = "DeviceClass";
            return args;
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DeviceClass resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeviceClass Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new DeviceClass(name, id, options);
        }
    }
}
namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3
{

    public class DeviceClassArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

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
        /// Spec defines what can be allocated and how to configure it.
        /// 
        /// This is mutable. Consumers have to be prepared for classes changing at any time, either because they get updated or replaced. Claim allocations are done once based on whatever was set in classes at the time of allocation.
        /// 
        /// Changing the spec automatically increments the metadata.generation number.
        /// </summary>
        [Input("spec", required: true)]
        public Input<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceClassSpecArgs> Spec { get; set; } = null!;

        public DeviceClassArgs()
        {
        }
        public static new DeviceClassArgs Empty => new DeviceClassArgs();
    }
}
