// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.NodeAffinityArgs;
import com.pulumi.kubernetes.core.v1.inputs.PodAffinityArgs;
import com.pulumi.kubernetes.core.v1.inputs.PodAntiAffinityArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Affinity is a group of affinity scheduling rules.
 * 
 */
public final class AffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AffinityArgs Empty = new AffinityArgs();

    /**
     * Describes node affinity scheduling rules for the pod.
     * 
     */
    @Import(name="nodeAffinity")
    private @Nullable Output<NodeAffinityArgs> nodeAffinity;

    /**
     * @return Describes node affinity scheduling rules for the pod.
     * 
     */
    public Optional<Output<NodeAffinityArgs>> nodeAffinity() {
        return Optional.ofNullable(this.nodeAffinity);
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    @Import(name="podAffinity")
    private @Nullable Output<PodAffinityArgs> podAffinity;

    /**
     * @return Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    public Optional<Output<PodAffinityArgs>> podAffinity() {
        return Optional.ofNullable(this.podAffinity);
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    @Import(name="podAntiAffinity")
    private @Nullable Output<PodAntiAffinityArgs> podAntiAffinity;

    /**
     * @return Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    public Optional<Output<PodAntiAffinityArgs>> podAntiAffinity() {
        return Optional.ofNullable(this.podAntiAffinity);
    }

    private AffinityArgs() {}

    private AffinityArgs(AffinityArgs $) {
        this.nodeAffinity = $.nodeAffinity;
        this.podAffinity = $.podAffinity;
        this.podAntiAffinity = $.podAntiAffinity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AffinityArgs $;

        public Builder() {
            $ = new AffinityArgs();
        }

        public Builder(AffinityArgs defaults) {
            $ = new AffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeAffinity Describes node affinity scheduling rules for the pod.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinity(@Nullable Output<NodeAffinityArgs> nodeAffinity) {
            $.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * @param nodeAffinity Describes node affinity scheduling rules for the pod.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinity(NodeAffinityArgs nodeAffinity) {
            return nodeAffinity(Output.of(nodeAffinity));
        }

        /**
         * @param podAffinity Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAffinity(@Nullable Output<PodAffinityArgs> podAffinity) {
            $.podAffinity = podAffinity;
            return this;
        }

        /**
         * @param podAffinity Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAffinity(PodAffinityArgs podAffinity) {
            return podAffinity(Output.of(podAffinity));
        }

        /**
         * @param podAntiAffinity Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAntiAffinity(@Nullable Output<PodAntiAffinityArgs> podAntiAffinity) {
            $.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * @param podAntiAffinity Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAntiAffinity(PodAntiAffinityArgs podAntiAffinity) {
            return podAntiAffinity(Output.of(podAntiAffinity));
        }

        public AffinityArgs build() {
            return $;
        }
    }

}
