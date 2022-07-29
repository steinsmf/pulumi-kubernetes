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
    /// A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
    /// </summary>
    public class TopologySelectorLabelRequirementPatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The label key that the selector applies to.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public TopologySelectorLabelRequirementPatchArgs()
        {
        }
        public static new TopologySelectorLabelRequirementPatchArgs Empty => new TopologySelectorLabelRequirementPatchArgs();
    }
}