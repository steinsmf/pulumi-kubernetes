// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs;
import com.pulumi.kubernetes.networking.v1.inputs.IPBlockArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed
 * 
 */
public final class NetworkPolicyPeerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPeerArgs Empty = new NetworkPolicyPeerArgs();

    /**
     * ipBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
     */
    @Import(name="ipBlock")
    private @Nullable Output<IPBlockArgs> ipBlock;

    /**
     * @return ipBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
     */
    public Optional<Output<IPBlockArgs>> ipBlock() {
        return Optional.ofNullable(this.ipBlock);
    }

    /**
     * namespaceSelector selects namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If podSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the namespaces selected by namespaceSelector. Otherwise it selects all pods in the namespaces selected by namespaceSelector.
     * 
     */
    @Import(name="namespaceSelector")
    private @Nullable Output<LabelSelectorArgs> namespaceSelector;

    /**
     * @return namespaceSelector selects namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If podSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the namespaces selected by namespaceSelector. Otherwise it selects all pods in the namespaces selected by namespaceSelector.
     * 
     */
    public Optional<Output<LabelSelectorArgs>> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }

    /**
     * podSelector is a label selector which selects pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If namespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the pods matching podSelector in the policy&#39;s own namespace.
     * 
     */
    @Import(name="podSelector")
    private @Nullable Output<LabelSelectorArgs> podSelector;

    /**
     * @return podSelector is a label selector which selects pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If namespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the pods matching podSelector in the policy&#39;s own namespace.
     * 
     */
    public Optional<Output<LabelSelectorArgs>> podSelector() {
        return Optional.ofNullable(this.podSelector);
    }

    private NetworkPolicyPeerArgs() {}

    private NetworkPolicyPeerArgs(NetworkPolicyPeerArgs $) {
        this.ipBlock = $.ipBlock;
        this.namespaceSelector = $.namespaceSelector;
        this.podSelector = $.podSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyPeerArgs $;

        public Builder() {
            $ = new NetworkPolicyPeerArgs();
        }

        public Builder(NetworkPolicyPeerArgs defaults) {
            $ = new NetworkPolicyPeerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipBlock ipBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
         * 
         * @return builder
         * 
         */
        public Builder ipBlock(@Nullable Output<IPBlockArgs> ipBlock) {
            $.ipBlock = ipBlock;
            return this;
        }

        /**
         * @param ipBlock ipBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
         * 
         * @return builder
         * 
         */
        public Builder ipBlock(IPBlockArgs ipBlock) {
            return ipBlock(Output.of(ipBlock));
        }

        /**
         * @param namespaceSelector namespaceSelector selects namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
         * 
         * If podSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the namespaces selected by namespaceSelector. Otherwise it selects all pods in the namespaces selected by namespaceSelector.
         * 
         * @return builder
         * 
         */
        public Builder namespaceSelector(@Nullable Output<LabelSelectorArgs> namespaceSelector) {
            $.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * @param namespaceSelector namespaceSelector selects namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
         * 
         * If podSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the namespaces selected by namespaceSelector. Otherwise it selects all pods in the namespaces selected by namespaceSelector.
         * 
         * @return builder
         * 
         */
        public Builder namespaceSelector(LabelSelectorArgs namespaceSelector) {
            return namespaceSelector(Output.of(namespaceSelector));
        }

        /**
         * @param podSelector podSelector is a label selector which selects pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
         * 
         * If namespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the pods matching podSelector in the policy&#39;s own namespace.
         * 
         * @return builder
         * 
         */
        public Builder podSelector(@Nullable Output<LabelSelectorArgs> podSelector) {
            $.podSelector = podSelector;
            return this;
        }

        /**
         * @param podSelector podSelector is a label selector which selects pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
         * 
         * If namespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the pods matching podSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the pods matching podSelector in the policy&#39;s own namespace.
         * 
         * @return builder
         * 
         */
        public Builder podSelector(LabelSelectorArgs podSelector) {
            return podSelector(Output.of(podSelector));
        }

        public NetworkPolicyPeerArgs build() {
            return $;
        }
    }

}
