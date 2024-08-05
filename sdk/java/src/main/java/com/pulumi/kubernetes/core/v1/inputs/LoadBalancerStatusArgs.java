// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.LoadBalancerIngressArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LoadBalancerStatus represents the status of a load-balancer.
 * 
 */
public final class LoadBalancerStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerStatusArgs Empty = new LoadBalancerStatusArgs();

    /**
     * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
     * 
     */
    @Import(name="ingress")
    private @Nullable Output<List<LoadBalancerIngressArgs>> ingress;

    /**
     * @return Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
     * 
     */
    public Optional<Output<List<LoadBalancerIngressArgs>>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    private LoadBalancerStatusArgs() {}

    private LoadBalancerStatusArgs(LoadBalancerStatusArgs $) {
        this.ingress = $.ingress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerStatusArgs $;

        public Builder() {
            $ = new LoadBalancerStatusArgs();
        }

        public Builder(LoadBalancerStatusArgs defaults) {
            $ = new LoadBalancerStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ingress Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
         * 
         * @return builder
         * 
         */
        public Builder ingress(@Nullable Output<List<LoadBalancerIngressArgs>> ingress) {
            $.ingress = ingress;
            return this;
        }

        /**
         * @param ingress Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
         * 
         * @return builder
         * 
         */
        public Builder ingress(List<LoadBalancerIngressArgs> ingress) {
            return ingress(Output.of(ingress));
        }

        /**
         * @param ingress Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
         * 
         * @return builder
         * 
         */
        public Builder ingress(LoadBalancerIngressArgs... ingress) {
            return ingress(List.of(ingress));
        }

        public LoadBalancerStatusArgs build() {
            return $;
        }
    }

}
