// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * ValidatingAdmissionPolicyList is a list of ValidatingAdmissionPolicy.
 */
export class ValidatingAdmissionPolicyList extends pulumi.CustomResource {
    /**
     * Get an existing ValidatingAdmissionPolicyList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): ValidatingAdmissionPolicyList {
        return new ValidatingAdmissionPolicyList(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicyList';

    /**
     * Returns true if the given object is an instance of ValidatingAdmissionPolicyList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ValidatingAdmissionPolicyList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ValidatingAdmissionPolicyList.__pulumiType;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    public readonly apiVersion!: pulumi.Output<"admissionregistration.k8s.io/v1alpha1">;
    /**
     * List of ValidatingAdmissionPolicy.
     */
    public readonly items!: pulumi.Output<outputs.admissionregistration.v1alpha1.ValidatingAdmissionPolicy[]>;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    public readonly kind!: pulumi.Output<"ValidatingAdmissionPolicyList">;
    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    public readonly metadata!: pulumi.Output<outputs.meta.v1.ListMeta>;

    /**
     * Create a ValidatingAdmissionPolicyList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ValidatingAdmissionPolicyListArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.items === undefined) && !opts.urn) {
                throw new Error("Missing required property 'items'");
            }
            resourceInputs["apiVersion"] = "admissionregistration.k8s.io/v1alpha1";
            resourceInputs["items"] = args ? args.items : undefined;
            resourceInputs["kind"] = "ValidatingAdmissionPolicyList";
            resourceInputs["metadata"] = args ? args.metadata : undefined;
        } else {
            resourceInputs["apiVersion"] = undefined /*out*/;
            resourceInputs["items"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["metadata"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ValidatingAdmissionPolicyList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a ValidatingAdmissionPolicyList resource.
 */
export interface ValidatingAdmissionPolicyListArgs {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    apiVersion?: pulumi.Input<"admissionregistration.k8s.io/v1alpha1">;
    /**
     * List of ValidatingAdmissionPolicy.
     */
    items: pulumi.Input<pulumi.Input<inputs.admissionregistration.v1alpha1.ValidatingAdmissionPolicy>[]>;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    kind?: pulumi.Input<"ValidatingAdmissionPolicyList">;
    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    metadata?: pulumi.Input<inputs.meta.v1.ListMeta>;
}
