// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


/**
 * PriorityLevelConfigurationReference contains information that points to the &#34;request-priority&#34; being used.
 * 
 */
public final class PriorityLevelConfigurationReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationReferenceArgs Empty = new PriorityLevelConfigurationReferenceArgs();

    /**
     * `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private PriorityLevelConfigurationReferenceArgs() {}

    private PriorityLevelConfigurationReferenceArgs(PriorityLevelConfigurationReferenceArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PriorityLevelConfigurationReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PriorityLevelConfigurationReferenceArgs $;

        public Builder() {
            $ = new PriorityLevelConfigurationReferenceArgs();
        }

        public Builder(PriorityLevelConfigurationReferenceArgs defaults) {
            $ = new PriorityLevelConfigurationReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `name` is the name of the priority level configuration being referenced Required.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `name` is the name of the priority level configuration being referenced Required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PriorityLevelConfigurationReferenceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("PriorityLevelConfigurationReferenceArgs", "name");
            }
            return $;
        }
    }

}
