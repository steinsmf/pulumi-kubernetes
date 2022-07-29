// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Autoscaling.V2Beta2
{

    /// <summary>
    /// ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
    /// </summary>
    public class ObjectMetricStatusPatchArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// current contains the current value for the given metric
        /// </summary>
        [Input("current")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Autoscaling.V2Beta2.MetricValueStatusPatchArgs>? Current { get; set; }

        [Input("describedObject")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Autoscaling.V2Beta2.CrossVersionObjectReferencePatchArgs>? DescribedObject { get; set; }

        /// <summary>
        /// metric identifies the target metric by name and selector
        /// </summary>
        [Input("metric")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Autoscaling.V2Beta2.MetricIdentifierPatchArgs>? Metric { get; set; }

        public ObjectMetricStatusPatchArgs()
        {
        }
    }
}