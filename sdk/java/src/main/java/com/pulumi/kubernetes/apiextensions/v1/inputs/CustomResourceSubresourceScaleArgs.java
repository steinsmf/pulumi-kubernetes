// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
 * 
 */
public final class CustomResourceSubresourceScaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceSubresourceScaleArgs Empty = new CustomResourceSubresourceScaleArgs();

    /**
     * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     * 
     */
    @Import(name="labelSelectorPath")
    private @Nullable Output<String> labelSelectorPath;

    /**
     * @return labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     * 
     */
    public Optional<Output<String>> labelSelectorPath() {
        return Optional.ofNullable(this.labelSelectorPath);
    }

    /**
     * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     * 
     */
    @Import(name="specReplicasPath", required=true)
    private Output<String> specReplicasPath;

    /**
     * @return specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     * 
     */
    public Output<String> specReplicasPath() {
        return this.specReplicasPath;
    }

    /**
     * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     * 
     */
    @Import(name="statusReplicasPath", required=true)
    private Output<String> statusReplicasPath;

    /**
     * @return statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     * 
     */
    public Output<String> statusReplicasPath() {
        return this.statusReplicasPath;
    }

    private CustomResourceSubresourceScaleArgs() {}

    private CustomResourceSubresourceScaleArgs(CustomResourceSubresourceScaleArgs $) {
        this.labelSelectorPath = $.labelSelectorPath;
        this.specReplicasPath = $.specReplicasPath;
        this.statusReplicasPath = $.statusReplicasPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceSubresourceScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceSubresourceScaleArgs $;

        public Builder() {
            $ = new CustomResourceSubresourceScaleArgs();
        }

        public Builder(CustomResourceSubresourceScaleArgs defaults) {
            $ = new CustomResourceSubresourceScaleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labelSelectorPath labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
         * 
         * @return builder
         * 
         */
        public Builder labelSelectorPath(@Nullable Output<String> labelSelectorPath) {
            $.labelSelectorPath = labelSelectorPath;
            return this;
        }

        /**
         * @param labelSelectorPath labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
         * 
         * @return builder
         * 
         */
        public Builder labelSelectorPath(String labelSelectorPath) {
            return labelSelectorPath(Output.of(labelSelectorPath));
        }

        /**
         * @param specReplicasPath specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
         * 
         * @return builder
         * 
         */
        public Builder specReplicasPath(Output<String> specReplicasPath) {
            $.specReplicasPath = specReplicasPath;
            return this;
        }

        /**
         * @param specReplicasPath specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
         * 
         * @return builder
         * 
         */
        public Builder specReplicasPath(String specReplicasPath) {
            return specReplicasPath(Output.of(specReplicasPath));
        }

        /**
         * @param statusReplicasPath statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
         * 
         * @return builder
         * 
         */
        public Builder statusReplicasPath(Output<String> statusReplicasPath) {
            $.statusReplicasPath = statusReplicasPath;
            return this;
        }

        /**
         * @param statusReplicasPath statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
         * 
         * @return builder
         * 
         */
        public Builder statusReplicasPath(String statusReplicasPath) {
            return statusReplicasPath(Output.of(statusReplicasPath));
        }

        public CustomResourceSubresourceScaleArgs build() {
            if ($.specReplicasPath == null) {
                throw new MissingRequiredPropertyException("CustomResourceSubresourceScaleArgs", "specReplicasPath");
            }
            if ($.statusReplicasPath == null) {
                throw new MissingRequiredPropertyException("CustomResourceSubresourceScaleArgs", "statusReplicasPath");
            }
            return $;
        }
    }

}
