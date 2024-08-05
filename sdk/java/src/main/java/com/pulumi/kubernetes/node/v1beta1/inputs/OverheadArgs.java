// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Overhead structure represents the resource overhead associated with running a pod.
 * 
 */
public final class OverheadArgs extends com.pulumi.resources.ResourceArgs {

    public static final OverheadArgs Empty = new OverheadArgs();

    /**
     * PodFixed represents the fixed resource overhead associated with running a pod.
     * 
     */
    @Import(name="podFixed")
    private @Nullable Output<Map<String,String>> podFixed;

    /**
     * @return PodFixed represents the fixed resource overhead associated with running a pod.
     * 
     */
    public Optional<Output<Map<String,String>>> podFixed() {
        return Optional.ofNullable(this.podFixed);
    }

    private OverheadArgs() {}

    private OverheadArgs(OverheadArgs $) {
        this.podFixed = $.podFixed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OverheadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OverheadArgs $;

        public Builder() {
            $ = new OverheadArgs();
        }

        public Builder(OverheadArgs defaults) {
            $ = new OverheadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param podFixed PodFixed represents the fixed resource overhead associated with running a pod.
         * 
         * @return builder
         * 
         */
        public Builder podFixed(@Nullable Output<Map<String,String>> podFixed) {
            $.podFixed = podFixed;
            return this;
        }

        /**
         * @param podFixed PodFixed represents the fixed resource overhead associated with running a pod.
         * 
         * @return builder
         * 
         */
        public Builder podFixed(Map<String,String> podFixed) {
            return podFixed(Output.of(podFixed));
        }

        public OverheadArgs build() {
            return $;
        }
    }

}
