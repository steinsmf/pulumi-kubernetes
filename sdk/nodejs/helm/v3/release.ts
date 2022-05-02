// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../../types";
import * as utilities from "../../utilities";

/**
 * A `Release` is an instance of a chart running in a Kubernetes cluster. A `Chart` is a Helm package. It contains all the
 * resource definitions necessary to run an application, tool, or service inside a Kubernetes cluster.
 *
 * This resource models a Helm Release as if it were created by the Helm CLI. The underlying implementation embeds Helm as
 * a library to perform the orchestration of the resources. As a result, the full spectrum of Helm features are supported
 * natively.
 *
 * ## Example Usage
 * ### Local Chart Directory
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v3.Release("nginx-ingress", {
 *     chart: "./nginx-ingress",
 * });
 * ```
 * ### Remote Chart
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v3.Release("nginx-ingress", {
 *     chart: "nginx-ingress",
 *     version: "1.24.4",
 *     repositoryOpts: {
 *         repo: "https://charts.helm.sh/stable",
 *     },
 * });
 * ```
 * ### Set Chart Values
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v3.Release("nginx-ingress", {
 *     chart: "nginx-ingress",
 *     version: "1.24.4",
 *     repositoryOpts: {
 *         repo: "https://charts.helm.sh/stable",
 *     },
 *     values: {
 *         controller: {
 *             metrics: {
 *                 enabled: true,
 *             }
 *         }
 *     },
 * });
 * ```
 * ### Deploy Chart into Namespace
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v3.Release("nginx-ingress", {
 *     chart: "nginx-ingress",
 *     version: "1.24.4",
 *     namespace: "test-namespace",
 *     repositoryOpts: {
 *         repo: "https://charts.helm.sh/stable",
 *     },
 * });
 * ```
 *
 * ### Depend on a Chart resource
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v3.Release("nginx-ingress", {
 *     chart: "nginx-ingress",
 *     version: "1.24.4",
 *     namespace: "test-namespace",
 *     repositoryOpts: {
 *         repo: "https://charts.helm.sh/stable",
 *     },
 *     skipAwait: false,
 * });
 *
 * // Create a ConfigMap depending on the Chart. The ConfigMap will not be created until after all of the Chart
 * // resources are ready. Notice skipAwait is set to false above. This is the default and will cause Helm
 * // to await the underlying resources to be available. Setting it to true will make the ConfigMap available right away.
 * new k8s.core.v1.ConfigMap("foo", {
 *     metadata: {namespace: namespaceName},
 *     data: {foo: "bar"}
 * }, {dependsOn: nginxIngress})
 * ```
 * ### Specify Helm Chart Values in File and Code
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as k8s from "@pulumi/kubernetes";
 * import {FileAsset} from "@pulumi/pulumi/asset";
 *
 * const release = new k8s.helm.v3.Release("redis", {
 *     chart: "redis",
 *     repositoryOpts: {
 *         repo: "https://charts.bitnami.com/bitnami",
 *     },
 *     valueYamlFiles: [new FileAsset("./metrics.yml")],
 *     values: {
 *         cluster: {
 *             enabled: true,
 *         },
 *         rbac: {
 *             create: true,
 *         }
 *     },
 * });
 *
 * // -- Contents of metrics.yml --
 * // metrics:
 * //     enabled: true
 * ```
 * ### Query Kubernetes Resource Installed By Helm Chart
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as k8s from "@pulumi/kubernetes";
 * import {FileAsset} from "@pulumi/pulumi/asset";
 *
 * const redis = new k8s.helm.v3.Release("redis", {
 *     chart: "redis",
 *     repositoryOpts: {
 *         repo: "https://charts.bitnami.com/bitnami",
 *     },
 *     values: {
 *         cluster: {
 *             enabled: true,
 *         },
 *         rbac: {
 *             create: true,
 *         }
 *     },
 * });
 *
 * // srv will only resolve after the redis chart is installed.
 * const srv = k8s.core.v1.Service.get("redis-master-svc", pulumi.interpolate`${redis.status.namespace}/${redis.status.name}-master`);
 * export const redisMasterClusterIP = srv.spec.clusterIP;
 * ```
 *
 * ## Import
 *
 * An existing Helm Release resource can be imported using its `type token`, `name` and identifier, e.g.
 *
 * ```sh
 * $ pulumi import kubernetes:helm.sh/v3:Release myRelease <namespace>/<releaseName>
 * ```
 */
export class Release extends pulumi.CustomResource {
    /**
     * Get an existing Release resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): Release {
        return new Release(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'kubernetes:helm.sh/v3:Release';

    /**
     * Returns true if the given object is an instance of Release.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Release {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Release.__pulumiType;
    }

    /**
     * If set, installation process purges chart on fail. `skipAwait` will be disabled automatically if atomic is used.
     */
    public readonly atomic!: pulumi.Output<boolean>;
    /**
     * Chart name to be installed. A path may be used.
     */
    public readonly chart!: pulumi.Output<string>;
    /**
     * Allow deletion of new resources created in this upgrade when upgrade fails.
     */
    public readonly cleanupOnFail!: pulumi.Output<boolean>;
    /**
     * Create the namespace if it does not exist.
     */
    public readonly createNamespace!: pulumi.Output<boolean>;
    /**
     * Run helm dependency update before installing the chart.
     */
    public readonly dependencyUpdate!: pulumi.Output<boolean>;
    /**
     * Add a custom description
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
     */
    public readonly devel!: pulumi.Output<boolean>;
    /**
     * Prevent CRD hooks from running, but run other hooks.  See helm install --no-crd-hook
     */
    public readonly disableCRDHooks!: pulumi.Output<boolean>;
    /**
     * If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema
     */
    public readonly disableOpenapiValidation!: pulumi.Output<boolean>;
    /**
     * Prevent hooks from running.
     */
    public readonly disableWebhooks!: pulumi.Output<boolean>;
    /**
     * Force resource update through delete/recreate if needed.
     */
    public readonly forceUpdate!: pulumi.Output<boolean>;
    /**
     * Location of public keys used for verification. Used only if `verify` is true
     */
    public readonly keyring!: pulumi.Output<string>;
    /**
     * Run helm lint when planning.
     */
    public readonly lint!: pulumi.Output<boolean>;
    /**
     * The rendered manifests as JSON. Not yet supported.
     */
    public readonly manifest!: pulumi.Output<{[key: string]: any}>;
    /**
     * Limit the maximum number of revisions saved per release. Use 0 for no limit.
     */
    public readonly maxHistory!: pulumi.Output<number>;
    /**
     * Release name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Namespace to install the release into.
     */
    public readonly namespace!: pulumi.Output<string>;
    /**
     * Postrender command to run.
     */
    public readonly postrender!: pulumi.Output<string>;
    /**
     * Perform pods restart during upgrade/rollback.
     */
    public readonly recreatePods!: pulumi.Output<boolean>;
    /**
     * If set, render subchart notes along with the parent.
     */
    public readonly renderSubchartNotes!: pulumi.Output<boolean>;
    /**
     * Re-use the given name, even if that name is already used. This is unsafe in production
     */
    public readonly replace!: pulumi.Output<boolean>;
    /**
     * Specification defining the Helm chart repository to use.
     */
    public readonly repositoryOpts!: pulumi.Output<outputs.helm.v3.RepositoryOpts>;
    /**
     * When upgrading, reset the values to the ones built into the chart.
     */
    public readonly resetValues!: pulumi.Output<boolean>;
    /**
     * Names of resources created by the release grouped by "kind/version".
     */
    public readonly resourceNames!: pulumi.Output<{[key: string]: string[]}>;
    /**
     * When upgrading, reuse the last release's values and merge in any overrides. If 'resetValues' is specified, this is ignored
     */
    public readonly reuseValues!: pulumi.Output<boolean>;
    /**
     * By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
     */
    public readonly skipAwait!: pulumi.Output<boolean>;
    /**
     * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
     */
    public readonly skipCrds!: pulumi.Output<boolean>;
    /**
     * Status of the deployed release.
     */
    public /*out*/ readonly status!: pulumi.Output<outputs.helm.v3.ReleaseStatus>;
    /**
     * Time in seconds to wait for any individual kubernetes operation.
     */
    public readonly timeout!: pulumi.Output<number>;
    /**
     * List of assets (raw yaml files). Content is read and merged with values (with values taking precedence).
     */
    public readonly valueYamlFiles!: pulumi.Output<(pulumi.asset.Asset | pulumi.asset.Archive)[]>;
    /**
     * Custom values set for the release.
     */
    public readonly values!: pulumi.Output<{[key: string]: any}>;
    /**
     * Verify the package before installing it.
     */
    public readonly verify!: pulumi.Output<boolean>;
    /**
     * Specify the exact chart version to install. If this is not specified, the latest version is installed.
     */
    public readonly version!: pulumi.Output<string>;
    /**
     * Will wait until all Jobs have been completed before marking the release as successful. This is ignored if `skipAwait` is enabled.
     */
    public readonly waitForJobs!: pulumi.Output<boolean>;

    /**
     * Create a Release resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ReleaseArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.chart === undefined) && !opts.urn) {
                throw new Error("Missing required property 'chart'");
            }
            resourceInputs["atomic"] = args ? args.atomic : undefined;
            resourceInputs["chart"] = args ? args.chart : undefined;
            resourceInputs["cleanupOnFail"] = args ? args.cleanupOnFail : undefined;
            resourceInputs["compat"] = "true";
            resourceInputs["createNamespace"] = args ? args.createNamespace : undefined;
            resourceInputs["dependencyUpdate"] = args ? args.dependencyUpdate : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["devel"] = args ? args.devel : undefined;
            resourceInputs["disableCRDHooks"] = args ? args.disableCRDHooks : undefined;
            resourceInputs["disableOpenapiValidation"] = args ? args.disableOpenapiValidation : undefined;
            resourceInputs["disableWebhooks"] = args ? args.disableWebhooks : undefined;
            resourceInputs["forceUpdate"] = args ? args.forceUpdate : undefined;
            resourceInputs["keyring"] = args ? args.keyring : undefined;
            resourceInputs["lint"] = args ? args.lint : undefined;
            resourceInputs["manifest"] = args ? args.manifest : undefined;
            resourceInputs["maxHistory"] = args ? args.maxHistory : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["postrender"] = args ? args.postrender : undefined;
            resourceInputs["recreatePods"] = args ? args.recreatePods : undefined;
            resourceInputs["renderSubchartNotes"] = args ? args.renderSubchartNotes : undefined;
            resourceInputs["replace"] = args ? args.replace : undefined;
            resourceInputs["repositoryOpts"] = args ? args.repositoryOpts : undefined;
            resourceInputs["resetValues"] = args ? args.resetValues : undefined;
            resourceInputs["resourceNames"] = args ? args.resourceNames : undefined;
            resourceInputs["reuseValues"] = args ? args.reuseValues : undefined;
            resourceInputs["skipAwait"] = args ? args.skipAwait : undefined;
            resourceInputs["skipCrds"] = args ? args.skipCrds : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["valueYamlFiles"] = args ? args.valueYamlFiles : undefined;
            resourceInputs["values"] = args ? args.values : undefined;
            resourceInputs["verify"] = args ? args.verify : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["waitForJobs"] = args ? args.waitForJobs : undefined;
            resourceInputs["status"] = undefined /*out*/;
        } else {
            resourceInputs["atomic"] = undefined /*out*/;
            resourceInputs["chart"] = undefined /*out*/;
            resourceInputs["cleanupOnFail"] = undefined /*out*/;
            resourceInputs["createNamespace"] = undefined /*out*/;
            resourceInputs["dependencyUpdate"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["devel"] = undefined /*out*/;
            resourceInputs["disableCRDHooks"] = undefined /*out*/;
            resourceInputs["disableOpenapiValidation"] = undefined /*out*/;
            resourceInputs["disableWebhooks"] = undefined /*out*/;
            resourceInputs["forceUpdate"] = undefined /*out*/;
            resourceInputs["keyring"] = undefined /*out*/;
            resourceInputs["lint"] = undefined /*out*/;
            resourceInputs["manifest"] = undefined /*out*/;
            resourceInputs["maxHistory"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["namespace"] = undefined /*out*/;
            resourceInputs["postrender"] = undefined /*out*/;
            resourceInputs["recreatePods"] = undefined /*out*/;
            resourceInputs["renderSubchartNotes"] = undefined /*out*/;
            resourceInputs["replace"] = undefined /*out*/;
            resourceInputs["repositoryOpts"] = undefined /*out*/;
            resourceInputs["resetValues"] = undefined /*out*/;
            resourceInputs["resourceNames"] = undefined /*out*/;
            resourceInputs["reuseValues"] = undefined /*out*/;
            resourceInputs["skipAwait"] = undefined /*out*/;
            resourceInputs["skipCrds"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["timeout"] = undefined /*out*/;
            resourceInputs["valueYamlFiles"] = undefined /*out*/;
            resourceInputs["values"] = undefined /*out*/;
            resourceInputs["verify"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
            resourceInputs["waitForJobs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Release.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Release resource.
 */
export interface ReleaseArgs {
    /**
     * If set, installation process purges chart on fail. `skipAwait` will be disabled automatically if atomic is used.
     */
    atomic?: pulumi.Input<boolean>;
    /**
     * Chart name to be installed. A path may be used.
     */
    chart: pulumi.Input<string>;
    /**
     * Allow deletion of new resources created in this upgrade when upgrade fails.
     */
    cleanupOnFail?: pulumi.Input<boolean>;
    compat?: pulumi.Input<"true">;
    /**
     * Create the namespace if it does not exist.
     */
    createNamespace?: pulumi.Input<boolean>;
    /**
     * Run helm dependency update before installing the chart.
     */
    dependencyUpdate?: pulumi.Input<boolean>;
    /**
     * Add a custom description
     */
    description?: pulumi.Input<string>;
    /**
     * Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
     */
    devel?: pulumi.Input<boolean>;
    /**
     * Prevent CRD hooks from running, but run other hooks.  See helm install --no-crd-hook
     */
    disableCRDHooks?: pulumi.Input<boolean>;
    /**
     * If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema
     */
    disableOpenapiValidation?: pulumi.Input<boolean>;
    /**
     * Prevent hooks from running.
     */
    disableWebhooks?: pulumi.Input<boolean>;
    /**
     * Force resource update through delete/recreate if needed.
     */
    forceUpdate?: pulumi.Input<boolean>;
    /**
     * Location of public keys used for verification. Used only if `verify` is true
     */
    keyring?: pulumi.Input<string>;
    /**
     * Run helm lint when planning.
     */
    lint?: pulumi.Input<boolean>;
    /**
     * The rendered manifests as JSON. Not yet supported.
     */
    manifest?: pulumi.Input<{[key: string]: any}>;
    /**
     * Limit the maximum number of revisions saved per release. Use 0 for no limit.
     */
    maxHistory?: pulumi.Input<number>;
    /**
     * Release name.
     */
    name?: pulumi.Input<string>;
    /**
     * Namespace to install the release into.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Postrender command to run.
     */
    postrender?: pulumi.Input<string>;
    /**
     * Perform pods restart during upgrade/rollback.
     */
    recreatePods?: pulumi.Input<boolean>;
    /**
     * If set, render subchart notes along with the parent.
     */
    renderSubchartNotes?: pulumi.Input<boolean>;
    /**
     * Re-use the given name, even if that name is already used. This is unsafe in production
     */
    replace?: pulumi.Input<boolean>;
    /**
     * Specification defining the Helm chart repository to use.
     */
    repositoryOpts?: pulumi.Input<inputs.helm.v3.RepositoryOpts>;
    /**
     * When upgrading, reset the values to the ones built into the chart.
     */
    resetValues?: pulumi.Input<boolean>;
    /**
     * Names of resources created by the release grouped by "kind/version".
     */
    resourceNames?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * When upgrading, reuse the last release's values and merge in any overrides. If 'resetValues' is specified, this is ignored
     */
    reuseValues?: pulumi.Input<boolean>;
    /**
     * By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
     */
    skipAwait?: pulumi.Input<boolean>;
    /**
     * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
     */
    skipCrds?: pulumi.Input<boolean>;
    /**
     * Time in seconds to wait for any individual kubernetes operation.
     */
    timeout?: pulumi.Input<number>;
    /**
     * List of assets (raw yaml files). Content is read and merged with values.
     */
    valueYamlFiles?: pulumi.Input<pulumi.Input<pulumi.asset.Asset | pulumi.asset.Archive>[]>;
    /**
     * Custom values set for the release.
     */
    values?: pulumi.Input<{[key: string]: any}>;
    /**
     * Verify the package before installing it.
     */
    verify?: pulumi.Input<boolean>;
    /**
     * Specify the exact chart version to install. If this is not specified, the latest version is installed.
     */
    version?: pulumi.Input<string>;
    /**
     * Will wait until all Jobs have been completed before marking the release as successful. This is ignored if `skipAwait` is enabled.
     */
    waitForJobs?: pulumi.Input<boolean>;
}
