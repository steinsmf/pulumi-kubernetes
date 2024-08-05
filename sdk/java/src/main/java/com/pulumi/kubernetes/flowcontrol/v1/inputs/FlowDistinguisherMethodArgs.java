// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


/**
 * FlowDistinguisherMethod specifies the method of a flow distinguisher.
 * 
 */
public final class FlowDistinguisherMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowDistinguisherMethodArgs Empty = new FlowDistinguisherMethodArgs();

    /**
     * `type` is the type of flow distinguisher method The supported types are &#34;ByUser&#34; and &#34;ByNamespace&#34;. Required.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return `type` is the type of flow distinguisher method The supported types are &#34;ByUser&#34; and &#34;ByNamespace&#34;. Required.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FlowDistinguisherMethodArgs() {}

    private FlowDistinguisherMethodArgs(FlowDistinguisherMethodArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDistinguisherMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDistinguisherMethodArgs $;

        public Builder() {
            $ = new FlowDistinguisherMethodArgs();
        }

        public Builder(FlowDistinguisherMethodArgs defaults) {
            $ = new FlowDistinguisherMethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type `type` is the type of flow distinguisher method The supported types are &#34;ByUser&#34; and &#34;ByNamespace&#34;. Required.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type `type` is the type of flow distinguisher method The supported types are &#34;ByUser&#34; and &#34;ByNamespace&#34;. Required.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FlowDistinguisherMethodArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("FlowDistinguisherMethodArgs", "type");
            }
            return $;
        }
    }

}
