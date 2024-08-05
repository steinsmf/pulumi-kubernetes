// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.node.v1alpha1.inputs.OverheadPatchArgs;
import com.pulumi.kubernetes.node.v1alpha1.inputs.SchedulingPatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 * 
 */
public final class RuntimeClassSpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeClassSpecPatchArgs Empty = new RuntimeClassSpecPatchArgs();

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    @Import(name="overhead")
    private @Nullable Output<OverheadPatchArgs> overhead;

    /**
     * @return Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    public Optional<Output<OverheadPatchArgs>> overhead() {
        return Optional.ofNullable(this.overhead);
    }

    /**
     * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
     * 
     */
    @Import(name="runtimeHandler")
    private @Nullable Output<String> runtimeHandler;

    /**
     * @return RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
     * 
     */
    public Optional<Output<String>> runtimeHandler() {
        return Optional.ofNullable(this.runtimeHandler);
    }

    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    @Import(name="scheduling")
    private @Nullable Output<SchedulingPatchArgs> scheduling;

    /**
     * @return Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    public Optional<Output<SchedulingPatchArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    private RuntimeClassSpecPatchArgs() {}

    private RuntimeClassSpecPatchArgs(RuntimeClassSpecPatchArgs $) {
        this.overhead = $.overhead;
        this.runtimeHandler = $.runtimeHandler;
        this.scheduling = $.scheduling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeClassSpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeClassSpecPatchArgs $;

        public Builder() {
            $ = new RuntimeClassSpecPatchArgs();
        }

        public Builder(RuntimeClassSpecPatchArgs defaults) {
            $ = new RuntimeClassSpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
         * 
         * @return builder
         * 
         */
        public Builder overhead(@Nullable Output<OverheadPatchArgs> overhead) {
            $.overhead = overhead;
            return this;
        }

        /**
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
         * 
         * @return builder
         * 
         */
        public Builder overhead(OverheadPatchArgs overhead) {
            return overhead(Output.of(overhead));
        }

        /**
         * @param runtimeHandler RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
         * 
         * @return builder
         * 
         */
        public Builder runtimeHandler(@Nullable Output<String> runtimeHandler) {
            $.runtimeHandler = runtimeHandler;
            return this;
        }

        /**
         * @param runtimeHandler RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
         * 
         * @return builder
         * 
         */
        public Builder runtimeHandler(String runtimeHandler) {
            return runtimeHandler(Output.of(runtimeHandler));
        }

        /**
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * 
         * @return builder
         * 
         */
        public Builder scheduling(@Nullable Output<SchedulingPatchArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        /**
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * 
         * @return builder
         * 
         */
        public Builder scheduling(SchedulingPatchArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        public RuntimeClassSpecPatchArgs build() {
            return $;
        }
    }

}
