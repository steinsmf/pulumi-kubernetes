// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.AttachedVolume;
import com.pulumi.kubernetes.core.v1.outputs.ContainerImage;
import com.pulumi.kubernetes.core.v1.outputs.NodeAddress;
import com.pulumi.kubernetes.core.v1.outputs.NodeCondition;
import com.pulumi.kubernetes.core.v1.outputs.NodeConfigStatus;
import com.pulumi.kubernetes.core.v1.outputs.NodeDaemonEndpoints;
import com.pulumi.kubernetes.core.v1.outputs.NodeFeatures;
import com.pulumi.kubernetes.core.v1.outputs.NodeRuntimeHandler;
import com.pulumi.kubernetes.core.v1.outputs.NodeSystemInfo;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeStatus {
    /**
     * @return List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
     * 
     */
    private @Nullable List<NodeAddress> addresses;
    /**
     * @return Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
     * 
     */
    private @Nullable Map<String,String> allocatable;
    /**
     * @return Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/reference/node/node-status/#capacity
     * 
     */
    private @Nullable Map<String,String> capacity;
    /**
     * @return Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
     * 
     */
    private @Nullable List<NodeCondition> conditions;
    /**
     * @return Status of the config assigned to the node via the dynamic Kubelet config feature.
     * 
     */
    private @Nullable NodeConfigStatus config;
    /**
     * @return Endpoints of daemons running on the Node.
     * 
     */
    private @Nullable NodeDaemonEndpoints daemonEndpoints;
    /**
     * @return Features describes the set of features implemented by the CRI implementation.
     * 
     */
    private @Nullable NodeFeatures features;
    /**
     * @return List of container images on this node
     * 
     */
    private @Nullable List<ContainerImage> images;
    /**
     * @return Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
     * 
     */
    private @Nullable NodeSystemInfo nodeInfo;
    /**
     * @return NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     */
    private @Nullable String phase;
    /**
     * @return The available runtime handlers.
     * 
     */
    private @Nullable List<NodeRuntimeHandler> runtimeHandlers;
    /**
     * @return List of volumes that are attached to the node.
     * 
     */
    private @Nullable List<AttachedVolume> volumesAttached;
    /**
     * @return List of attachable volumes in use (mounted) by the node.
     * 
     */
    private @Nullable List<String> volumesInUse;

    private NodeStatus() {}
    /**
     * @return List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
     * 
     */
    public List<NodeAddress> addresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }
    /**
     * @return Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
     * 
     */
    public Map<String,String> allocatable() {
        return this.allocatable == null ? Map.of() : this.allocatable;
    }
    /**
     * @return Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/reference/node/node-status/#capacity
     * 
     */
    public Map<String,String> capacity() {
        return this.capacity == null ? Map.of() : this.capacity;
    }
    /**
     * @return Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
     * 
     */
    public List<NodeCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return Status of the config assigned to the node via the dynamic Kubelet config feature.
     * 
     */
    public Optional<NodeConfigStatus> config() {
        return Optional.ofNullable(this.config);
    }
    /**
     * @return Endpoints of daemons running on the Node.
     * 
     */
    public Optional<NodeDaemonEndpoints> daemonEndpoints() {
        return Optional.ofNullable(this.daemonEndpoints);
    }
    /**
     * @return Features describes the set of features implemented by the CRI implementation.
     * 
     */
    public Optional<NodeFeatures> features() {
        return Optional.ofNullable(this.features);
    }
    /**
     * @return List of container images on this node
     * 
     */
    public List<ContainerImage> images() {
        return this.images == null ? List.of() : this.images;
    }
    /**
     * @return Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
     * 
     */
    public Optional<NodeSystemInfo> nodeInfo() {
        return Optional.ofNullable(this.nodeInfo);
    }
    /**
     * @return NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     */
    public Optional<String> phase() {
        return Optional.ofNullable(this.phase);
    }
    /**
     * @return The available runtime handlers.
     * 
     */
    public List<NodeRuntimeHandler> runtimeHandlers() {
        return this.runtimeHandlers == null ? List.of() : this.runtimeHandlers;
    }
    /**
     * @return List of volumes that are attached to the node.
     * 
     */
    public List<AttachedVolume> volumesAttached() {
        return this.volumesAttached == null ? List.of() : this.volumesAttached;
    }
    /**
     * @return List of attachable volumes in use (mounted) by the node.
     * 
     */
    public List<String> volumesInUse() {
        return this.volumesInUse == null ? List.of() : this.volumesInUse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NodeAddress> addresses;
        private @Nullable Map<String,String> allocatable;
        private @Nullable Map<String,String> capacity;
        private @Nullable List<NodeCondition> conditions;
        private @Nullable NodeConfigStatus config;
        private @Nullable NodeDaemonEndpoints daemonEndpoints;
        private @Nullable NodeFeatures features;
        private @Nullable List<ContainerImage> images;
        private @Nullable NodeSystemInfo nodeInfo;
        private @Nullable String phase;
        private @Nullable List<NodeRuntimeHandler> runtimeHandlers;
        private @Nullable List<AttachedVolume> volumesAttached;
        private @Nullable List<String> volumesInUse;
        public Builder() {}
        public Builder(NodeStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.allocatable = defaults.allocatable;
    	      this.capacity = defaults.capacity;
    	      this.conditions = defaults.conditions;
    	      this.config = defaults.config;
    	      this.daemonEndpoints = defaults.daemonEndpoints;
    	      this.features = defaults.features;
    	      this.images = defaults.images;
    	      this.nodeInfo = defaults.nodeInfo;
    	      this.phase = defaults.phase;
    	      this.runtimeHandlers = defaults.runtimeHandlers;
    	      this.volumesAttached = defaults.volumesAttached;
    	      this.volumesInUse = defaults.volumesInUse;
        }

        @CustomType.Setter
        public Builder addresses(@Nullable List<NodeAddress> addresses) {

            this.addresses = addresses;
            return this;
        }
        public Builder addresses(NodeAddress... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder allocatable(@Nullable Map<String,String> allocatable) {

            this.allocatable = allocatable;
            return this;
        }
        @CustomType.Setter
        public Builder capacity(@Nullable Map<String,String> capacity) {

            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<NodeCondition> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(NodeCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder config(@Nullable NodeConfigStatus config) {

            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder daemonEndpoints(@Nullable NodeDaemonEndpoints daemonEndpoints) {

            this.daemonEndpoints = daemonEndpoints;
            return this;
        }
        @CustomType.Setter
        public Builder features(@Nullable NodeFeatures features) {

            this.features = features;
            return this;
        }
        @CustomType.Setter
        public Builder images(@Nullable List<ContainerImage> images) {

            this.images = images;
            return this;
        }
        public Builder images(ContainerImage... images) {
            return images(List.of(images));
        }
        @CustomType.Setter
        public Builder nodeInfo(@Nullable NodeSystemInfo nodeInfo) {

            this.nodeInfo = nodeInfo;
            return this;
        }
        @CustomType.Setter
        public Builder phase(@Nullable String phase) {

            this.phase = phase;
            return this;
        }
        @CustomType.Setter
        public Builder runtimeHandlers(@Nullable List<NodeRuntimeHandler> runtimeHandlers) {

            this.runtimeHandlers = runtimeHandlers;
            return this;
        }
        public Builder runtimeHandlers(NodeRuntimeHandler... runtimeHandlers) {
            return runtimeHandlers(List.of(runtimeHandlers));
        }
        @CustomType.Setter
        public Builder volumesAttached(@Nullable List<AttachedVolume> volumesAttached) {

            this.volumesAttached = volumesAttached;
            return this;
        }
        public Builder volumesAttached(AttachedVolume... volumesAttached) {
            return volumesAttached(List.of(volumesAttached));
        }
        @CustomType.Setter
        public Builder volumesInUse(@Nullable List<String> volumesInUse) {

            this.volumesInUse = volumesInUse;
            return this;
        }
        public Builder volumesInUse(String... volumesInUse) {
            return volumesInUse(List.of(volumesInUse));
        }
        public NodeStatus build() {
            final var _resultValue = new NodeStatus();
            _resultValue.addresses = addresses;
            _resultValue.allocatable = allocatable;
            _resultValue.capacity = capacity;
            _resultValue.conditions = conditions;
            _resultValue.config = config;
            _resultValue.daemonEndpoints = daemonEndpoints;
            _resultValue.features = features;
            _resultValue.images = images;
            _resultValue.nodeInfo = nodeInfo;
            _resultValue.phase = phase;
            _resultValue.runtimeHandlers = runtimeHandlers;
            _resultValue.volumesAttached = volumesAttached;
            _resultValue.volumesInUse = volumesInUse;
            return _resultValue;
        }
    }
}
