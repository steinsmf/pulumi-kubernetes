// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions;

/**
 * The set of arguments for constructing a CustomResource resource.
 *
 * NOTE: This type is fairly loose, since other than `apiVersion` and `kind`,
 * there are no fields required across all CRDs. Use otherFields(...) to specify
 * additional fields.
 */
public final class CustomResourceArgs extends CustomResourceArgsBase {

    public static final CustomResourceArgs Empty = new CustomResourceArgs();

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder extends CustomResourceArgsBase.Builder<CustomResourceArgs, Builder> {
        public Builder() {
            super(new CustomResourceArgs());
        }

        public Builder(CustomResourceArgs defaults) {
            super(new CustomResourceArgs(), defaults);
        }
    }
}
