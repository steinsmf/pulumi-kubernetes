// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.TypedLocalObjectReferenceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressClassSpec provides information about the class of an Ingress.
 * 
 */
public final class IngressClassSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressClassSpecArgs Empty = new IngressClassSpecArgs();

    /**
     * Controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
     * 
     */
    @Import(name="controller")
    private @Nullable Output<String> controller;

    /**
     * @return Controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
     * 
     */
    public Optional<Output<String>> controller() {
        return Optional.ofNullable(this.controller);
    }

    /**
     * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<TypedLocalObjectReferenceArgs> parameters;

    /**
     * @return Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
     */
    public Optional<Output<TypedLocalObjectReferenceArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private IngressClassSpecArgs() {}

    private IngressClassSpecArgs(IngressClassSpecArgs $) {
        this.controller = $.controller;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressClassSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressClassSpecArgs $;

        public Builder() {
            $ = new IngressClassSpecArgs();
        }

        public Builder(IngressClassSpecArgs defaults) {
            $ = new IngressClassSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param controller Controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder controller(@Nullable Output<String> controller) {
            $.controller = controller;
            return this;
        }

        /**
         * @param controller Controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder controller(String controller) {
            return controller(Output.of(controller));
        }

        /**
         * @param parameters Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<TypedLocalObjectReferenceArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(TypedLocalObjectReferenceArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public IngressClassSpecArgs build() {
            return $;
        }
    }

}
