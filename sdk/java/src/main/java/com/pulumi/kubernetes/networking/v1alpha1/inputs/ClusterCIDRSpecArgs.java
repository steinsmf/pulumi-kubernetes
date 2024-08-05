// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ClusterCIDRSpec defines the desired state of ClusterCIDR.
 * 
 */
public final class ClusterCIDRSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCIDRSpecArgs Empty = new ClusterCIDRSpecArgs();

    /**
     * IPv4 defines an IPv4 IP block in CIDR notation(e.g. &#34;10.0.0.0/8&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
     * 
     */
    @Import(name="ipv4")
    private @Nullable Output<String> ipv4;

    /**
     * @return IPv4 defines an IPv4 IP block in CIDR notation(e.g. &#34;10.0.0.0/8&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
     * 
     */
    public Optional<Output<String>> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }

    /**
     * IPv6 defines an IPv6 IP block in CIDR notation(e.g. &#34;2001:db8::/64&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
     * 
     */
    @Import(name="ipv6")
    private @Nullable Output<String> ipv6;

    /**
     * @return IPv6 defines an IPv6 IP block in CIDR notation(e.g. &#34;2001:db8::/64&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
     * 
     */
    public Optional<Output<String>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
     * 
     */
    @Import(name="nodeSelector")
    private @Nullable Output<NodeSelectorArgs> nodeSelector;

    /**
     * @return NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
     * 
     */
    public Optional<Output<NodeSelectorArgs>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    /**
     * PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
     * 
     */
    @Import(name="perNodeHostBits", required=true)
    private Output<Integer> perNodeHostBits;

    /**
     * @return PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
     * 
     */
    public Output<Integer> perNodeHostBits() {
        return this.perNodeHostBits;
    }

    private ClusterCIDRSpecArgs() {}

    private ClusterCIDRSpecArgs(ClusterCIDRSpecArgs $) {
        this.ipv4 = $.ipv4;
        this.ipv6 = $.ipv6;
        this.nodeSelector = $.nodeSelector;
        this.perNodeHostBits = $.perNodeHostBits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCIDRSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCIDRSpecArgs $;

        public Builder() {
            $ = new ClusterCIDRSpecArgs();
        }

        public Builder(ClusterCIDRSpecArgs defaults) {
            $ = new ClusterCIDRSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv4 IPv4 defines an IPv4 IP block in CIDR notation(e.g. &#34;10.0.0.0/8&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(@Nullable Output<String> ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv4 IPv4 defines an IPv4 IP block in CIDR notation(e.g. &#34;10.0.0.0/8&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(String ipv4) {
            return ipv4(Output.of(ipv4));
        }

        /**
         * @param ipv6 IPv6 defines an IPv6 IP block in CIDR notation(e.g. &#34;2001:db8::/64&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable Output<String> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 IPv6 defines an IPv6 IP block in CIDR notation(e.g. &#34;2001:db8::/64&#34;). At least one of IPv4 and IPv6 must be specified. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(String ipv6) {
            return ipv6(Output.of(ipv6));
        }

        /**
         * @param nodeSelector NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(@Nullable Output<NodeSelectorArgs> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * @param nodeSelector NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(NodeSelectorArgs nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        /**
         * @param perNodeHostBits PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder perNodeHostBits(Output<Integer> perNodeHostBits) {
            $.perNodeHostBits = perNodeHostBits;
            return this;
        }

        /**
         * @param perNodeHostBits PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
         * 
         * @return builder
         * 
         */
        public Builder perNodeHostBits(Integer perNodeHostBits) {
            return perNodeHostBits(Output.of(perNodeHostBits));
        }

        public ClusterCIDRSpecArgs build() {
            if ($.perNodeHostBits == null) {
                throw new MissingRequiredPropertyException("ClusterCIDRSpecArgs", "perNodeHostBits");
            }
            return $;
        }
    }

}
