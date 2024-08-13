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
    /// CELDeviceSelector contains a CEL expression for selecting a device.
    /// </summary>
    public class CELDeviceSelectorPatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expression is a CEL expression which evaluates a single device. It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.
        /// 
        /// The expression's input is an object named "device", which carries the following properties:
        ///  - driver (string): the name of the driver which defines this device.
        ///  - attributes (map[string]object): the device's attributes, grouped by prefix
        ///    (e.g. device.attributes["dra.example.com"] evaluates to an object with all
        ///    of the attributes which were prefixed by "dra.example.com".
        ///  - capacity (map[string]object): the device's capacities, grouped by prefix.
        /// 
        /// Example: Consider a device with driver="dra.example.com", which exposes two attributes named "model" and "ext.example.com/family" and which exposes one capacity named "modules". This input to this expression would have the following fields:
        /// 
        ///     device.driver
        ///     device.attributes["dra.example.com"].model
        ///     device.attributes["ext.example.com"].family
        ///     device.capacity["dra.example.com"].modules
        /// 
        /// The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.
        /// 
        /// The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.
        /// 
        /// If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.
        /// 
        /// A robust expression should check for the existence of attributes before referencing them.
        /// 
        /// For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:
        /// 
        ///     cel.bind(dra, device.attributes["dra.example.com"], dra.someBool &amp;&amp; dra.anotherBool)
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        public CELDeviceSelectorPatchArgs()
        {
        }
        public static new CELDeviceSelectorPatchArgs Empty => new CELDeviceSelectorPatchArgs();
    }
}
