// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2
{

    /// <summary>
    /// NamedResourcesInstance represents one individual hardware instance that can be selected based on its attributes.
    /// </summary>
    public class NamedResourcesInstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.NamedResourcesAttributeArgs>? _attributes;

        /// <summary>
        /// Attributes defines the attributes of this resource instance. The name of each attribute must be unique.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.NamedResourcesAttributeArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2.NamedResourcesAttributeArgs>());
            set => _attributes = value;
        }

        /// <summary>
        /// Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public NamedResourcesInstanceArgs()
        {
        }
        public static new NamedResourcesInstanceArgs Empty => new NamedResourcesInstanceArgs();
    }
}
