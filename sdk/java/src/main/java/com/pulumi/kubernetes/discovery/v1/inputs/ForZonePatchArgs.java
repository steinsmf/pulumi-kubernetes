// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ForZone provides information about which zones should consume this endpoint.
 * 
 */
public final class ForZonePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForZonePatchArgs Empty = new ForZonePatchArgs();

    /**
     * name represents the name of the zone.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name represents the name of the zone.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ForZonePatchArgs() {}

    private ForZonePatchArgs(ForZonePatchArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForZonePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForZonePatchArgs $;

        public Builder() {
            $ = new ForZonePatchArgs();
        }

        public Builder(ForZonePatchArgs defaults) {
            $ = new ForZonePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name name represents the name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name represents the name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ForZonePatchArgs build() {
            return $;
        }
    }

}
