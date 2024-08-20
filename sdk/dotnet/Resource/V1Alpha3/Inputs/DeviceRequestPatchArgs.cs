// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3
{

    /// <summary>
    /// DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices.
    /// 
    /// A DeviceClassName is currently required. Clients must check that it is indeed set. It's absence indicates that something changed in a way that is not supported by the client yet, in which case it must refuse to handle the request.
    /// </summary>
    public class DeviceRequestPatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AdminAccess indicates that this is a claim for administrative access to the device(s). Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.
        /// </summary>
        [Input("adminAccess")]
        public Input<bool>? AdminAccess { get; set; }

        /// <summary>
        /// AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:
        /// 
        /// - ExactCount: This request is for a specific number of devices.
        ///   This is the default. The exact number is provided in the
        ///   count field.
        /// 
        /// - All: This request is for all of the matching devices in a pool.
        ///   Allocation will fail if some devices are already allocated,
        ///   unless adminAccess is requested.
        /// 
        /// If AlloctionMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.
        /// 
        /// More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
        /// </summary>
        [Input("allocationMode")]
        public Input<string>? AllocationMode { get; set; }

        /// <summary>
        /// Count is used only when the count mode is "ExactCount". Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.
        /// 
        /// A class is required. Which classes are available depends on the cluster.
        /// 
        /// Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
        /// </summary>
        [Input("deviceClassName")]
        public Input<string>? DeviceClassName { get; set; }

        /// <summary>
        /// Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.
        /// 
        /// Must be a DNS label.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("selectors")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceSelectorPatchArgs>? _selectors;

        /// <summary>
        /// Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request. All selectors must be satisfied for a device to be considered.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceSelectorPatchArgs> Selectors
        {
            get => _selectors ?? (_selectors = new InputList<Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha3.DeviceSelectorPatchArgs>());
            set => _selectors = value;
        }

        public DeviceRequestPatchArgs()
        {
        }
        public static new DeviceRequestPatchArgs Empty => new DeviceRequestPatchArgs();
    }
}