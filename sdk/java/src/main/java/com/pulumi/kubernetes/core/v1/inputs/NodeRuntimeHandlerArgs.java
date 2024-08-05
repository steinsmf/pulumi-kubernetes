// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.NodeRuntimeHandlerFeaturesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NodeRuntimeHandler is a set of runtime handler information.
 * 
 */
public final class NodeRuntimeHandlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeRuntimeHandlerArgs Empty = new NodeRuntimeHandlerArgs();

    /**
     * Supported features.
     * 
     */
    @Import(name="features")
    private @Nullable Output<NodeRuntimeHandlerFeaturesArgs> features;

    /**
     * @return Supported features.
     * 
     */
    public Optional<Output<NodeRuntimeHandlerFeaturesArgs>> features() {
        return Optional.ofNullable(this.features);
    }

    /**
     * Runtime handler name. Empty for the default runtime handler.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Runtime handler name. Empty for the default runtime handler.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private NodeRuntimeHandlerArgs() {}

    private NodeRuntimeHandlerArgs(NodeRuntimeHandlerArgs $) {
        this.features = $.features;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeRuntimeHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeRuntimeHandlerArgs $;

        public Builder() {
            $ = new NodeRuntimeHandlerArgs();
        }

        public Builder(NodeRuntimeHandlerArgs defaults) {
            $ = new NodeRuntimeHandlerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param features Supported features.
         * 
         * @return builder
         * 
         */
        public Builder features(@Nullable Output<NodeRuntimeHandlerFeaturesArgs> features) {
            $.features = features;
            return this;
        }

        /**
         * @param features Supported features.
         * 
         * @return builder
         * 
         */
        public Builder features(NodeRuntimeHandlerFeaturesArgs features) {
            return features(Output.of(features));
        }

        /**
         * @param name Runtime handler name. Empty for the default runtime handler.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Runtime handler name. Empty for the default runtime handler.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NodeRuntimeHandlerArgs build() {
            return $;
        }
    }

}
