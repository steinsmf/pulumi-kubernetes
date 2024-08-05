// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfigurationReference contains information that points to the &#34;request-priority&#34; being used.
 * 
 */
public final class PriorityLevelConfigurationReferencePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationReferencePatchArgs Empty = new PriorityLevelConfigurationReferencePatchArgs();

    /**
     * `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private PriorityLevelConfigurationReferencePatchArgs() {}

    private PriorityLevelConfigurationReferencePatchArgs(PriorityLevelConfigurationReferencePatchArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PriorityLevelConfigurationReferencePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PriorityLevelConfigurationReferencePatchArgs $;

        public Builder() {
            $ = new PriorityLevelConfigurationReferencePatchArgs();
        }

        public Builder(PriorityLevelConfigurationReferencePatchArgs defaults) {
            $ = new PriorityLevelConfigurationReferencePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `name` is the name of the priority level configuration being referenced Required.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
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

        public PriorityLevelConfigurationReferencePatchArgs build() {
            return $;
        }
    }

}
