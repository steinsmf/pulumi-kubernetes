// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.outputs;

import com.google.gson.JsonElement;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.v1.outputs.CustomResourceSubresourceScalePatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceSubresourcesPatch {
    /**
     * @return scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
     */
    private @Nullable CustomResourceSubresourceScalePatch scale;
    /**
     * @return status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
     */
    private @Nullable JsonElement status;

    private CustomResourceSubresourcesPatch() {}
    /**
     * @return scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
     */
    public Optional<CustomResourceSubresourceScalePatch> scale() {
        return Optional.ofNullable(this.scale);
    }
    /**
     * @return status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
     */
    public Optional<JsonElement> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresourcesPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CustomResourceSubresourceScalePatch scale;
        private @Nullable JsonElement status;
        public Builder() {}
        public Builder(CustomResourceSubresourcesPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scale = defaults.scale;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder scale(@Nullable CustomResourceSubresourceScalePatch scale) {

            this.scale = scale;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable JsonElement status) {

            this.status = status;
            return this;
        }
        public CustomResourceSubresourcesPatch build() {
            final var _resultValue = new CustomResourceSubresourcesPatch();
            _resultValue.scale = scale;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
