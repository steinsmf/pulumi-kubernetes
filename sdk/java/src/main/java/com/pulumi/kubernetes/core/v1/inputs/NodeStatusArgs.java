// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.AttachedVolumeArgs;
import com.pulumi.kubernetes.core.v1.inputs.ContainerImageArgs;
import com.pulumi.kubernetes.core.v1.inputs.NodeAddressArgs;
import com.pulumi.kubernetes.core.v1.inputs.NodeConditionArgs;
import com.pulumi.kubernetes.core.v1.inputs.NodeConfigStatusArgs;
import com.pulumi.kubernetes.core.v1.inputs.NodeDaemonEndpointsArgs;
import com.pulumi.kubernetes.core.v1.inputs.NodeRuntimeHandlerArgs;
import com.pulumi.kubernetes.core.v1.inputs.NodeSystemInfoArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NodeStatus is information about the current status of a node.
 * 
 */
public final class NodeStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeStatusArgs Empty = new NodeStatusArgs();

    /**
     * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
     * 
     */
    @Import(name="addresses")
    private @Nullable Output<List<NodeAddressArgs>> addresses;

    /**
     * @return List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
     * 
     */
    public Optional<Output<List<NodeAddressArgs>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    /**
     * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
     * 
     */
    @Import(name="allocatable")
    private @Nullable Output<Map<String,String>> allocatable;

    /**
     * @return Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
     * 
     */
    public Optional<Output<Map<String,String>>> allocatable() {
        return Optional.ofNullable(this.allocatable);
    }

    /**
     * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Map<String,String>> capacity;

    /**
     * @return Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     * 
     */
    public Optional<Output<Map<String,String>>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<NodeConditionArgs>> conditions;

    /**
     * @return Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
     * 
     */
    public Optional<Output<List<NodeConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Status of the config assigned to the node via the dynamic Kubelet config feature.
     * 
     */
    @Import(name="config")
    private @Nullable Output<NodeConfigStatusArgs> config;

    /**
     * @return Status of the config assigned to the node via the dynamic Kubelet config feature.
     * 
     */
    public Optional<Output<NodeConfigStatusArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Endpoints of daemons running on the Node.
     * 
     */
    @Import(name="daemonEndpoints")
    private @Nullable Output<NodeDaemonEndpointsArgs> daemonEndpoints;

    /**
     * @return Endpoints of daemons running on the Node.
     * 
     */
    public Optional<Output<NodeDaemonEndpointsArgs>> daemonEndpoints() {
        return Optional.ofNullable(this.daemonEndpoints);
    }

    /**
     * List of container images on this node
     * 
     */
    @Import(name="images")
    private @Nullable Output<List<ContainerImageArgs>> images;

    /**
     * @return List of container images on this node
     * 
     */
    public Optional<Output<List<ContainerImageArgs>>> images() {
        return Optional.ofNullable(this.images);
    }

    /**
     * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
     * 
     */
    @Import(name="nodeInfo")
    private @Nullable Output<NodeSystemInfoArgs> nodeInfo;

    /**
     * @return Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
     * 
     */
    public Optional<Output<NodeSystemInfoArgs>> nodeInfo() {
        return Optional.ofNullable(this.nodeInfo);
    }

    /**
     * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     */
    @Import(name="phase")
    private @Nullable Output<String> phase;

    /**
     * @return NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     */
    public Optional<Output<String>> phase() {
        return Optional.ofNullable(this.phase);
    }

    /**
     * The available runtime handlers.
     * 
     */
    @Import(name="runtimeHandlers")
    private @Nullable Output<List<NodeRuntimeHandlerArgs>> runtimeHandlers;

    /**
     * @return The available runtime handlers.
     * 
     */
    public Optional<Output<List<NodeRuntimeHandlerArgs>>> runtimeHandlers() {
        return Optional.ofNullable(this.runtimeHandlers);
    }

    /**
     * List of volumes that are attached to the node.
     * 
     */
    @Import(name="volumesAttached")
    private @Nullable Output<List<AttachedVolumeArgs>> volumesAttached;

    /**
     * @return List of volumes that are attached to the node.
     * 
     */
    public Optional<Output<List<AttachedVolumeArgs>>> volumesAttached() {
        return Optional.ofNullable(this.volumesAttached);
    }

    /**
     * List of attachable volumes in use (mounted) by the node.
     * 
     */
    @Import(name="volumesInUse")
    private @Nullable Output<List<String>> volumesInUse;

    /**
     * @return List of attachable volumes in use (mounted) by the node.
     * 
     */
    public Optional<Output<List<String>>> volumesInUse() {
        return Optional.ofNullable(this.volumesInUse);
    }

    private NodeStatusArgs() {}

    private NodeStatusArgs(NodeStatusArgs $) {
        this.addresses = $.addresses;
        this.allocatable = $.allocatable;
        this.capacity = $.capacity;
        this.conditions = $.conditions;
        this.config = $.config;
        this.daemonEndpoints = $.daemonEndpoints;
        this.images = $.images;
        this.nodeInfo = $.nodeInfo;
        this.phase = $.phase;
        this.runtimeHandlers = $.runtimeHandlers;
        this.volumesAttached = $.volumesAttached;
        this.volumesInUse = $.volumesInUse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeStatusArgs $;

        public Builder() {
            $ = new NodeStatusArgs();
        }

        public Builder(NodeStatusArgs defaults) {
            $ = new NodeStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable Output<List<NodeAddressArgs>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<NodeAddressArgs> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
         * 
         * @return builder
         * 
         */
        public Builder addresses(NodeAddressArgs... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param allocatable Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
         * 
         * @return builder
         * 
         */
        public Builder allocatable(@Nullable Output<Map<String,String>> allocatable) {
            $.allocatable = allocatable;
            return this;
        }

        /**
         * @param allocatable Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
         * 
         * @return builder
         * 
         */
        public Builder allocatable(Map<String,String> allocatable) {
            return allocatable(Output.of(allocatable));
        }

        /**
         * @param capacity Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Map<String,String>> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
         * 
         * @return builder
         * 
         */
        public Builder capacity(Map<String,String> capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param conditions Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<NodeConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<NodeConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
         * 
         * @return builder
         * 
         */
        public Builder conditions(NodeConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param config Status of the config assigned to the node via the dynamic Kubelet config feature.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<NodeConfigStatusArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Status of the config assigned to the node via the dynamic Kubelet config feature.
         * 
         * @return builder
         * 
         */
        public Builder config(NodeConfigStatusArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param daemonEndpoints Endpoints of daemons running on the Node.
         * 
         * @return builder
         * 
         */
        public Builder daemonEndpoints(@Nullable Output<NodeDaemonEndpointsArgs> daemonEndpoints) {
            $.daemonEndpoints = daemonEndpoints;
            return this;
        }

        /**
         * @param daemonEndpoints Endpoints of daemons running on the Node.
         * 
         * @return builder
         * 
         */
        public Builder daemonEndpoints(NodeDaemonEndpointsArgs daemonEndpoints) {
            return daemonEndpoints(Output.of(daemonEndpoints));
        }

        /**
         * @param images List of container images on this node
         * 
         * @return builder
         * 
         */
        public Builder images(@Nullable Output<List<ContainerImageArgs>> images) {
            $.images = images;
            return this;
        }

        /**
         * @param images List of container images on this node
         * 
         * @return builder
         * 
         */
        public Builder images(List<ContainerImageArgs> images) {
            return images(Output.of(images));
        }

        /**
         * @param images List of container images on this node
         * 
         * @return builder
         * 
         */
        public Builder images(ContainerImageArgs... images) {
            return images(List.of(images));
        }

        /**
         * @param nodeInfo Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
         * 
         * @return builder
         * 
         */
        public Builder nodeInfo(@Nullable Output<NodeSystemInfoArgs> nodeInfo) {
            $.nodeInfo = nodeInfo;
            return this;
        }

        /**
         * @param nodeInfo Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
         * 
         * @return builder
         * 
         */
        public Builder nodeInfo(NodeSystemInfoArgs nodeInfo) {
            return nodeInfo(Output.of(nodeInfo));
        }

        /**
         * @param phase NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
         * 
         * @return builder
         * 
         */
        public Builder phase(@Nullable Output<String> phase) {
            $.phase = phase;
            return this;
        }

        /**
         * @param phase NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
         * 
         * @return builder
         * 
         */
        public Builder phase(String phase) {
            return phase(Output.of(phase));
        }

        /**
         * @param runtimeHandlers The available runtime handlers.
         * 
         * @return builder
         * 
         */
        public Builder runtimeHandlers(@Nullable Output<List<NodeRuntimeHandlerArgs>> runtimeHandlers) {
            $.runtimeHandlers = runtimeHandlers;
            return this;
        }

        /**
         * @param runtimeHandlers The available runtime handlers.
         * 
         * @return builder
         * 
         */
        public Builder runtimeHandlers(List<NodeRuntimeHandlerArgs> runtimeHandlers) {
            return runtimeHandlers(Output.of(runtimeHandlers));
        }

        /**
         * @param runtimeHandlers The available runtime handlers.
         * 
         * @return builder
         * 
         */
        public Builder runtimeHandlers(NodeRuntimeHandlerArgs... runtimeHandlers) {
            return runtimeHandlers(List.of(runtimeHandlers));
        }

        /**
         * @param volumesAttached List of volumes that are attached to the node.
         * 
         * @return builder
         * 
         */
        public Builder volumesAttached(@Nullable Output<List<AttachedVolumeArgs>> volumesAttached) {
            $.volumesAttached = volumesAttached;
            return this;
        }

        /**
         * @param volumesAttached List of volumes that are attached to the node.
         * 
         * @return builder
         * 
         */
        public Builder volumesAttached(List<AttachedVolumeArgs> volumesAttached) {
            return volumesAttached(Output.of(volumesAttached));
        }

        /**
         * @param volumesAttached List of volumes that are attached to the node.
         * 
         * @return builder
         * 
         */
        public Builder volumesAttached(AttachedVolumeArgs... volumesAttached) {
            return volumesAttached(List.of(volumesAttached));
        }

        /**
         * @param volumesInUse List of attachable volumes in use (mounted) by the node.
         * 
         * @return builder
         * 
         */
        public Builder volumesInUse(@Nullable Output<List<String>> volumesInUse) {
            $.volumesInUse = volumesInUse;
            return this;
        }

        /**
         * @param volumesInUse List of attachable volumes in use (mounted) by the node.
         * 
         * @return builder
         * 
         */
        public Builder volumesInUse(List<String> volumesInUse) {
            return volumesInUse(Output.of(volumesInUse));
        }

        /**
         * @param volumesInUse List of attachable volumes in use (mounted) by the node.
         * 
         * @return builder
         * 
         */
        public Builder volumesInUse(String... volumesInUse) {
            return volumesInUse(List.of(volumesInUse));
        }

        public NodeStatusArgs build() {
            return $;
        }
    }

}
