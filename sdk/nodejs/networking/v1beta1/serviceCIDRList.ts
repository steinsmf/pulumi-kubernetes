// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * ServiceCIDRList contains a list of ServiceCIDR objects.
 */
export class ServiceCIDRList extends pulumi.CustomResource {
    /**
     * Get an existing ServiceCIDRList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): ServiceCIDRList {
        return new ServiceCIDRList(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'kubernetes:networking.k8s.io/v1beta1:ServiceCIDRList';

    /**
     * Returns true if the given object is an instance of ServiceCIDRList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceCIDRList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceCIDRList.__pulumiType;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    public readonly apiVersion!: pulumi.Output<"networking.k8s.io/v1beta1">;
    /**
     * items is the list of ServiceCIDRs.
     */
    public readonly items!: pulumi.Output<outputs.networking.v1beta1.ServiceCIDR[]>;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    public readonly kind!: pulumi.Output<"ServiceCIDRList">;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    public readonly metadata!: pulumi.Output<outputs.meta.v1.ListMeta>;

    /**
     * Create a ServiceCIDRList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServiceCIDRListArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.items === undefined) && !opts.urn) {
                throw new Error("Missing required property 'items'");
            }
            resourceInputs["apiVersion"] = "networking.k8s.io/v1beta1";
            resourceInputs["items"] = args ? args.items : undefined;
            resourceInputs["kind"] = "ServiceCIDRList";
            resourceInputs["metadata"] = args ? args.metadata : undefined;
        } else {
            resourceInputs["apiVersion"] = undefined /*out*/;
            resourceInputs["items"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["metadata"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceCIDRList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a ServiceCIDRList resource.
 */
export interface ServiceCIDRListArgs {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    apiVersion?: pulumi.Input<"networking.k8s.io/v1beta1">;
    /**
     * items is the list of ServiceCIDRs.
     */
    items: pulumi.Input<pulumi.Input<inputs.networking.v1beta1.ServiceCIDR>[]>;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    kind?: pulumi.Input<"ServiceCIDRList">;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    metadata?: pulumi.Input<inputs.meta.v1.ListMeta>;
}