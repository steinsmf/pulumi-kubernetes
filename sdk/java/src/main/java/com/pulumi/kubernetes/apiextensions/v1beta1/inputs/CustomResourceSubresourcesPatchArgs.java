// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.inputs;

import com.google.gson.JsonElement;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apiextensions.v1beta1.inputs.CustomResourceSubresourceScalePatchArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 * 
 */
public final class CustomResourceSubresourcesPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceSubresourcesPatchArgs Empty = new CustomResourceSubresourcesPatchArgs();

    /**
     * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<CustomResourceSubresourceScalePatchArgs> scale;

    /**
     * @return scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
     */
    public Optional<Output<CustomResourceSubresourceScalePatchArgs>> scale() {
        return Optional.ofNullable(this.scale);
    }

    /**
     * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
     */
    @Import(name="status")
    private @Nullable Output<JsonElement> status;

    /**
     * @return status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
     */
    public Optional<Output<JsonElement>> status() {
        return Optional.ofNullable(this.status);
    }

    private CustomResourceSubresourcesPatchArgs() {}

    private CustomResourceSubresourcesPatchArgs(CustomResourceSubresourcesPatchArgs $) {
        this.scale = $.scale;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceSubresourcesPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceSubresourcesPatchArgs $;

        public Builder() {
            $ = new CustomResourceSubresourcesPatchArgs();
        }

        public Builder(CustomResourceSubresourcesPatchArgs defaults) {
            $ = new CustomResourceSubresourcesPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scale scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<CustomResourceSubresourceScalePatchArgs> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
         * 
         * @return builder
         * 
         */
        public Builder scale(CustomResourceSubresourceScalePatchArgs scale) {
            return scale(Output.of(scale));
        }

        /**
         * @param status status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<JsonElement> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
         * 
         * @return builder
         * 
         */
        public Builder status(JsonElement status) {
            return status(Output.of(status));
        }

        public CustomResourceSubresourcesPatchArgs build() {
            return $;
        }
    }

}
