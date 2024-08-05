// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.networking.v1.outputs.IngressClassParametersReferencePatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressClassSpecPatch {
    /**
     * @return controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
     * 
     */
    private @Nullable String controller;
    /**
     * @return parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
     */
    private @Nullable IngressClassParametersReferencePatch parameters;

    private IngressClassSpecPatch() {}
    /**
     * @return controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
     * 
     */
    public Optional<String> controller() {
        return Optional.ofNullable(this.controller);
    }
    /**
     * @return parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
     */
    public Optional<IngressClassParametersReferencePatch> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressClassSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String controller;
        private @Nullable IngressClassParametersReferencePatch parameters;
        public Builder() {}
        public Builder(IngressClassSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controller = defaults.controller;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder controller(@Nullable String controller) {

            this.controller = controller;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable IngressClassParametersReferencePatch parameters) {

            this.parameters = parameters;
            return this;
        }
        public IngressClassSpecPatch build() {
            final var _resultValue = new IngressClassSpecPatch();
            _resultValue.controller = controller;
            _resultValue.parameters = parameters;
            return _resultValue;
        }
    }
}
