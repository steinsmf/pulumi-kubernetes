// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceSubresourceScale {
    /**
     * @return labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     * 
     */
    private @Nullable String labelSelectorPath;
    /**
     * @return specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     * 
     */
    private String specReplicasPath;
    /**
     * @return statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     * 
     */
    private String statusReplicasPath;

    private CustomResourceSubresourceScale() {}
    /**
     * @return labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     * 
     */
    public Optional<String> labelSelectorPath() {
        return Optional.ofNullable(this.labelSelectorPath);
    }
    /**
     * @return specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     * 
     */
    public String specReplicasPath() {
        return this.specReplicasPath;
    }
    /**
     * @return statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     * 
     */
    public String statusReplicasPath() {
        return this.statusReplicasPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresourceScale defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String labelSelectorPath;
        private String specReplicasPath;
        private String statusReplicasPath;
        public Builder() {}
        public Builder(CustomResourceSubresourceScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelectorPath = defaults.labelSelectorPath;
    	      this.specReplicasPath = defaults.specReplicasPath;
    	      this.statusReplicasPath = defaults.statusReplicasPath;
        }

        @CustomType.Setter
        public Builder labelSelectorPath(@Nullable String labelSelectorPath) {

            this.labelSelectorPath = labelSelectorPath;
            return this;
        }
        @CustomType.Setter
        public Builder specReplicasPath(String specReplicasPath) {
            if (specReplicasPath == null) {
              throw new MissingRequiredPropertyException("CustomResourceSubresourceScale", "specReplicasPath");
            }
            this.specReplicasPath = specReplicasPath;
            return this;
        }
        @CustomType.Setter
        public Builder statusReplicasPath(String statusReplicasPath) {
            if (statusReplicasPath == null) {
              throw new MissingRequiredPropertyException("CustomResourceSubresourceScale", "statusReplicasPath");
            }
            this.statusReplicasPath = statusReplicasPath;
            return this;
        }
        public CustomResourceSubresourceScale build() {
            final var _resultValue = new CustomResourceSubresourceScale();
            _resultValue.labelSelectorPath = labelSelectorPath;
            _resultValue.specReplicasPath = specReplicasPath;
            _resultValue.statusReplicasPath = statusReplicasPath;
            return _resultValue;
        }
    }
}
