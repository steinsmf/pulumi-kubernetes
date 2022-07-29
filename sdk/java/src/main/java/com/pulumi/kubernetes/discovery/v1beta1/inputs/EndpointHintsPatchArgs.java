// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.discovery.v1beta1.inputs.ForZonePatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 * 
 */
public final class EndpointHintsPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointHintsPatchArgs Empty = new EndpointHintsPatchArgs();

    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. May contain a maximum of 8 entries.
     * 
     */
    @Import(name="forZones")
    private @Nullable Output<List<ForZonePatchArgs>> forZones;

    /**
     * @return forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. May contain a maximum of 8 entries.
     * 
     */
    public Optional<Output<List<ForZonePatchArgs>>> forZones() {
        return Optional.ofNullable(this.forZones);
    }

    private EndpointHintsPatchArgs() {}

    private EndpointHintsPatchArgs(EndpointHintsPatchArgs $) {
        this.forZones = $.forZones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointHintsPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointHintsPatchArgs $;

        public Builder() {
            $ = new EndpointHintsPatchArgs();
        }

        public Builder(EndpointHintsPatchArgs defaults) {
            $ = new EndpointHintsPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forZones forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. May contain a maximum of 8 entries.
         * 
         * @return builder
         * 
         */
        public Builder forZones(@Nullable Output<List<ForZonePatchArgs>> forZones) {
            $.forZones = forZones;
            return this;
        }

        /**
         * @param forZones forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. May contain a maximum of 8 entries.
         * 
         * @return builder
         * 
         */
        public Builder forZones(List<ForZonePatchArgs> forZones) {
            return forZones(Output.of(forZones));
        }

        /**
         * @param forZones forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. May contain a maximum of 8 entries.
         * 
         * @return builder
         * 
         */
        public Builder forZones(ForZonePatchArgs... forZones) {
            return forZones(List.of(forZones));
        }

        public EndpointHintsPatchArgs build() {
            return $;
        }
    }

}