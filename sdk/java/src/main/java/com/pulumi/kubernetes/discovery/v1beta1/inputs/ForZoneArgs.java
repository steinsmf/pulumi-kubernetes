// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ForZone provides information about which zones should consume this endpoint.
 * 
 */
public final class ForZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForZoneArgs Empty = new ForZoneArgs();

    /**
     * name represents the name of the zone.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return name represents the name of the zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ForZoneArgs() {}

    private ForZoneArgs(ForZoneArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForZoneArgs $;

        public Builder() {
            $ = new ForZoneArgs();
        }

        public Builder(ForZoneArgs defaults) {
            $ = new ForZoneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name name represents the name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
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

        public ForZoneArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}