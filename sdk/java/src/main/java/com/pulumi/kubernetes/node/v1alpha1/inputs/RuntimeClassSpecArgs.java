// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.node.v1alpha1.inputs.OverheadArgs;
import com.pulumi.kubernetes.node.v1alpha1.inputs.SchedulingArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 * 
 */
public final class RuntimeClassSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeClassSpecArgs Empty = new RuntimeClassSpecArgs();

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    @Import(name="overhead")
    private @Nullable Output<OverheadArgs> overhead;

    /**
     * @return Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    public Optional<Output<OverheadArgs>> overhead() {
        return Optional.ofNullable(this.overhead);
    }

    /**
     * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
     * 
     */
    @Import(name="runtimeHandler", required=true)
    private Output<String> runtimeHandler;

    /**
     * @return RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
     * 
     */
    public Output<String> runtimeHandler() {
        return this.runtimeHandler;
    }

    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    @Import(name="scheduling")
    private @Nullable Output<SchedulingArgs> scheduling;

    /**
     * @return Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    public Optional<Output<SchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    private RuntimeClassSpecArgs() {}

    private RuntimeClassSpecArgs(RuntimeClassSpecArgs $) {
        this.overhead = $.overhead;
        this.runtimeHandler = $.runtimeHandler;
        this.scheduling = $.scheduling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeClassSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeClassSpecArgs $;

        public Builder() {
            $ = new RuntimeClassSpecArgs();
        }

        public Builder(RuntimeClassSpecArgs defaults) {
            $ = new RuntimeClassSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
         * 
         * @return builder
         * 
         */
        public Builder overhead(@Nullable Output<OverheadArgs> overhead) {
            $.overhead = overhead;
            return this;
        }

        /**
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
         * 
         * @return builder
         * 
         */
        public Builder overhead(OverheadArgs overhead) {
            return overhead(Output.of(overhead));
        }

        /**
         * @param runtimeHandler RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
         * 
         * @return builder
         * 
         */
        public Builder runtimeHandler(Output<String> runtimeHandler) {
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
        public Builder scheduling(@Nullable Output<SchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        /**
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * 
         * @return builder
         * 
         */
        public Builder scheduling(SchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        public RuntimeClassSpecArgs build() {
            if ($.runtimeHandler == null) {
                throw new MissingRequiredPropertyException("RuntimeClassSpecArgs", "runtimeHandler");
            }
            return $;
        }
    }

}
