// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyPeerPatchArgs;
import com.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyPortPatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only if the traffic matches both ports AND from.
 * 
 */
public final class NetworkPolicyIngressRulePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyIngressRulePatchArgs Empty = new NetworkPolicyIngressRulePatchArgs();

    /**
     * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    @Import(name="from")
    private @Nullable Output<List<NetworkPolicyPeerPatchArgs>> from;

    /**
     * @return List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    public Optional<Output<List<NetworkPolicyPeerPatchArgs>>> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<NetworkPolicyPortPatchArgs>> ports;

    /**
     * @return List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    public Optional<Output<List<NetworkPolicyPortPatchArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private NetworkPolicyIngressRulePatchArgs() {}

    private NetworkPolicyIngressRulePatchArgs(NetworkPolicyIngressRulePatchArgs $) {
        this.from = $.from;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyIngressRulePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyIngressRulePatchArgs $;

        public Builder() {
            $ = new NetworkPolicyIngressRulePatchArgs();
        }

        public Builder(NetworkPolicyIngressRulePatchArgs defaults) {
            $ = new NetworkPolicyIngressRulePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param from List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable Output<List<NetworkPolicyPeerPatchArgs>> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * 
         * @return builder
         * 
         */
        public Builder from(List<NetworkPolicyPeerPatchArgs> from) {
            return from(Output.of(from));
        }

        /**
         * @param from List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * 
         * @return builder
         * 
         */
        public Builder from(NetworkPolicyPeerPatchArgs... from) {
            return from(List.of(from));
        }

        /**
         * @param ports List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<NetworkPolicyPortPatchArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<NetworkPolicyPortPatchArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * 
         * @return builder
         * 
         */
        public Builder ports(NetworkPolicyPortPatchArgs... ports) {
            return ports(List.of(ports));
        }

        public NetworkPolicyIngressRulePatchArgs build() {
            return $;
        }
    }

}
