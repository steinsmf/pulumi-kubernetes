// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * ResourceClaimTemplate is used to produce ResourceClaim objects.
 *
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
export class ResourceClaimTemplate extends pulumi.CustomResource {
    /**
     * Get an existing ResourceClaimTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): ResourceClaimTemplate {
        return new ResourceClaimTemplate(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'kubernetes:resource.k8s.io/v1alpha3:ResourceClaimTemplate';

    /**
     * Returns true if the given object is an instance of ResourceClaimTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceClaimTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceClaimTemplate.__pulumiType;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    public readonly apiVersion!: pulumi.Output<"resource.k8s.io/v1alpha3">;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    public readonly kind!: pulumi.Output<"ResourceClaimTemplate">;
    /**
     * Standard object metadata
     */
    public readonly metadata!: pulumi.Output<outputs.meta.v1.ObjectMeta>;
    /**
     * Describes the ResourceClaim that is to be generated.
     *
     * This field is immutable. A ResourceClaim will get created by the control plane for a Pod when needed and then not get updated anymore.
     */
    public readonly spec!: pulumi.Output<outputs.resource.v1alpha3.ResourceClaimTemplateSpec>;

    /**
     * Create a ResourceClaimTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ResourceClaimTemplateArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.spec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spec'");
            }
            resourceInputs["apiVersion"] = "resource.k8s.io/v1alpha3";
            resourceInputs["kind"] = "ResourceClaimTemplate";
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["spec"] = args ? args.spec : undefined;
        } else {
            resourceInputs["apiVersion"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["metadata"] = undefined /*out*/;
            resourceInputs["spec"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "kubernetes:resource.k8s.io/v1alpha1:ResourceClaimTemplate" }, { type: "kubernetes:resource.k8s.io/v1alpha2:ResourceClaimTemplate" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(ResourceClaimTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a ResourceClaimTemplate resource.
 */
export interface ResourceClaimTemplateArgs {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    apiVersion?: pulumi.Input<"resource.k8s.io/v1alpha3">;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    kind?: pulumi.Input<"ResourceClaimTemplate">;
    /**
     * Standard object metadata
     */
    metadata?: pulumi.Input<inputs.meta.v1.ObjectMeta>;
    /**
     * Describes the ResourceClaim that is to be generated.
     *
     * This field is immutable. A ResourceClaim will get created by the control plane for a Pod when needed and then not get updated anymore.
     */
    spec: pulumi.Input<inputs.resource.v1alpha3.ResourceClaimTemplateSpec>;
}
