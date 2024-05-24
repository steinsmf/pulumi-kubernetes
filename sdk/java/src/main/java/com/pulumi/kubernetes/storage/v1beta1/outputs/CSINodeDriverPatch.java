// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.storage.v1beta1.outputs.VolumeNodeResourcesPatch;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CSINodeDriverPatch {
    /**
     * @return allocatable represents the volume resources of a node that are available for scheduling.
     * 
     */
    private @Nullable VolumeNodeResourcesPatch allocatable;
    /**
     * @return This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
     * 
     */
    private @Nullable String name;
    /**
     * @return nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as &#34;node1&#34;, but the storage system may refer to the same node as &#34;nodeA&#34;. When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. &#34;nodeA&#34; instead of &#34;node1&#34;. This field is required.
     * 
     */
    private @Nullable String nodeID;
    /**
     * @return topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. &#34;company.com/zone&#34;, &#34;company.com/region&#34;). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
     * 
     */
    private @Nullable List<String> topologyKeys;

    private CSINodeDriverPatch() {}
    /**
     * @return allocatable represents the volume resources of a node that are available for scheduling.
     * 
     */
    public Optional<VolumeNodeResourcesPatch> allocatable() {
        return Optional.ofNullable(this.allocatable);
    }
    /**
     * @return This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as &#34;node1&#34;, but the storage system may refer to the same node as &#34;nodeA&#34;. When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. &#34;nodeA&#34; instead of &#34;node1&#34;. This field is required.
     * 
     */
    public Optional<String> nodeID() {
        return Optional.ofNullable(this.nodeID);
    }
    /**
     * @return topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. &#34;company.com/zone&#34;, &#34;company.com/region&#34;). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
     * 
     */
    public List<String> topologyKeys() {
        return this.topologyKeys == null ? List.of() : this.topologyKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeDriverPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VolumeNodeResourcesPatch allocatable;
        private @Nullable String name;
        private @Nullable String nodeID;
        private @Nullable List<String> topologyKeys;
        public Builder() {}
        public Builder(CSINodeDriverPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatable = defaults.allocatable;
    	      this.name = defaults.name;
    	      this.nodeID = defaults.nodeID;
    	      this.topologyKeys = defaults.topologyKeys;
        }

        @CustomType.Setter
        public Builder allocatable(@Nullable VolumeNodeResourcesPatch allocatable) {

            this.allocatable = allocatable;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodeID(@Nullable String nodeID) {

            this.nodeID = nodeID;
            return this;
        }
        @CustomType.Setter
        public Builder topologyKeys(@Nullable List<String> topologyKeys) {

            this.topologyKeys = topologyKeys;
            return this;
        }
        public Builder topologyKeys(String... topologyKeys) {
            return topologyKeys(List.of(topologyKeys));
        }
        public CSINodeDriverPatch build() {
            final var _resultValue = new CSINodeDriverPatch();
            _resultValue.allocatable = allocatable;
            _resultValue.name = name;
            _resultValue.nodeID = nodeID;
            _resultValue.topologyKeys = topologyKeys;
            return _resultValue;
        }
    }
}
