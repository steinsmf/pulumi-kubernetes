// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { DirectoryArgs } from "./directory";
export type Directory = import("./directory").Directory;
export const Directory: typeof import("./directory").Directory = null as any;
utilities.lazyLoad(exports, ["Directory"], () => require("./directory"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:kustomize/v2:Directory":
                return new Directory(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "kustomize/v2", _module)
