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
    /// Patch resources are used to modify existing Kubernetes resources by using
    /// Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
    /// one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
    /// Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
    /// [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
    /// additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
    /// PodSchedulingContext objects hold information that is needed to schedule a Pod with ResourceClaims that use "WaitForFirstConsumer" allocation mode.
    /// 
    /// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
    /// </summary>
    [KubernetesResourceType("kubernetes:resource.k8s.io/v1alpha2:PodSchedulingContextPatch")]
    public partial class PodSchedulingContextPatch : KubernetesResource
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
        public Output<Pulumi.Kubernetes.Types.Outputs.Meta.V1.ObjectMetaPatch> Metadata { get; private set; } = null!;

        /// <summary>
        /// Spec describes where resources for the Pod are needed.
        /// </summary>
        [Output("spec")]
        public Output<Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha2.PodSchedulingContextSpecPatch> Spec { get; private set; } = null!;

        /// <summary>
        /// Status describes where resources for the Pod can be allocated.
        /// </summary>
        [Output("status")]
        public Output<Pulumi.Kubernetes.Types.Outputs.Resource.V1Alpha2.PodSchedulingContextStatusPatch> Status { get; private set; } = null!;


        /// <summary>
        /// Create a PodSchedulingContextPatch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PodSchedulingContextPatch(string name, Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.PodSchedulingContextPatchArgs? args = null, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha2:PodSchedulingContextPatch", name, MakeArgs(args), MakeResourceOptions(options, ""))
        {
        }
        internal PodSchedulingContextPatch(string name, ImmutableDictionary<string, object?> dictionary, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha2:PodSchedulingContextPatch", name, new DictionaryResourceArgs(dictionary), MakeResourceOptions(options, ""))
        {
        }

        private PodSchedulingContextPatch(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("kubernetes:resource.k8s.io/v1alpha2:PodSchedulingContextPatch", name, null, MakeResourceOptions(options, id))
        {
        }

        private static Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.PodSchedulingContextPatchArgs? MakeArgs(Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.PodSchedulingContextPatchArgs? args)
        {
            args ??= new Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.PodSchedulingContextPatchArgs();
            args.ApiVersion = "resource.k8s.io/v1alpha2";
            args.Kind = "PodSchedulingContext";
            return args;
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "kubernetes:resource.k8s.io/v1alpha3:PodSchedulingContextPatch" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PodSchedulingContextPatch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PodSchedulingContextPatch Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new PodSchedulingContextPatch(name, id, options);
        }
    }
}
namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2
{

    public class PodSchedulingContextPatchArgs : global::Pulumi.ResourceArgs
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
        public Input<Pulumi.Kubernetes.Types.Inputs.Meta.V1.ObjectMetaPatchArgs>? Metadata { get; set; }

        /// <summary>
        /// Spec describes where resources for the Pod are needed.
        /// </summary>
        [Input("spec")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.PodSchedulingContextSpecPatchArgs>? Spec { get; set; }

        public PodSchedulingContextPatchArgs()
        {
        }
        public static new PodSchedulingContextPatchArgs Empty => new PodSchedulingContextPatchArgs();
    }
}
