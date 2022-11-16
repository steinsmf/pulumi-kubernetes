// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeConfigSourcePatch;
import com.pulumi.kubernetes.core.v1.outputs.TaintPatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeSpecPatch {
    /**
     * @return Deprecated: Previously used to specify the source of the node&#39;s configuration for the DynamicKubeletConfig feature. This feature is removed.
     * 
     */
    private @Nullable NodeConfigSourcePatch configSource;
    /**
     * @return Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     * 
     */
    private @Nullable String externalID;
    /**
     * @return PodCIDR represents the pod IP range assigned to the node.
     * 
     */
    private @Nullable String podCIDR;
    /**
     * @return podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     * 
     */
    private @Nullable List<String> podCIDRs;
    /**
     * @return ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
     * 
     */
    private @Nullable String providerID;
    /**
     * @return If specified, the node&#39;s taints.
     * 
     */
    private @Nullable List<TaintPatch> taints;
    /**
     * @return Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     * 
     */
    private @Nullable Boolean unschedulable;

    private NodeSpecPatch() {}
    /**
     * @return Deprecated: Previously used to specify the source of the node&#39;s configuration for the DynamicKubeletConfig feature. This feature is removed.
     * 
     */
    public Optional<NodeConfigSourcePatch> configSource() {
        return Optional.ofNullable(this.configSource);
    }
    /**
     * @return Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     * 
     */
    public Optional<String> externalID() {
        return Optional.ofNullable(this.externalID);
    }
    /**
     * @return PodCIDR represents the pod IP range assigned to the node.
     * 
     */
    public Optional<String> podCIDR() {
        return Optional.ofNullable(this.podCIDR);
    }
    /**
     * @return podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     * 
     */
    public List<String> podCIDRs() {
        return this.podCIDRs == null ? List.of() : this.podCIDRs;
    }
    /**
     * @return ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
     * 
     */
    public Optional<String> providerID() {
        return Optional.ofNullable(this.providerID);
    }
    /**
     * @return If specified, the node&#39;s taints.
     * 
     */
    public List<TaintPatch> taints() {
        return this.taints == null ? List.of() : this.taints;
    }
    /**
     * @return Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     * 
     */
    public Optional<Boolean> unschedulable() {
        return Optional.ofNullable(this.unschedulable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NodeConfigSourcePatch configSource;
        private @Nullable String externalID;
        private @Nullable String podCIDR;
        private @Nullable List<String> podCIDRs;
        private @Nullable String providerID;
        private @Nullable List<TaintPatch> taints;
        private @Nullable Boolean unschedulable;
        public Builder() {}
        public Builder(NodeSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configSource = defaults.configSource;
    	      this.externalID = defaults.externalID;
    	      this.podCIDR = defaults.podCIDR;
    	      this.podCIDRs = defaults.podCIDRs;
    	      this.providerID = defaults.providerID;
    	      this.taints = defaults.taints;
    	      this.unschedulable = defaults.unschedulable;
        }

        @CustomType.Setter
        public Builder configSource(@Nullable NodeConfigSourcePatch configSource) {
            this.configSource = configSource;
            return this;
        }
        @CustomType.Setter
        public Builder externalID(@Nullable String externalID) {
            this.externalID = externalID;
            return this;
        }
        @CustomType.Setter
        public Builder podCIDR(@Nullable String podCIDR) {
            this.podCIDR = podCIDR;
            return this;
        }
        @CustomType.Setter
        public Builder podCIDRs(@Nullable List<String> podCIDRs) {
            this.podCIDRs = podCIDRs;
            return this;
        }
        public Builder podCIDRs(String... podCIDRs) {
            return podCIDRs(List.of(podCIDRs));
        }
        @CustomType.Setter
        public Builder providerID(@Nullable String providerID) {
            this.providerID = providerID;
            return this;
        }
        @CustomType.Setter
        public Builder taints(@Nullable List<TaintPatch> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(TaintPatch... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder unschedulable(@Nullable Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public NodeSpecPatch build() {
            final var o = new NodeSpecPatch();
            o.configSource = configSource;
            o.externalID = externalID;
            o.podCIDR = podCIDR;
            o.podCIDRs = podCIDRs;
            o.providerID = providerID;
            o.taints = taints;
            o.unschedulable = unschedulable;
            return o;
        }
    }
}
