// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.TolerationPatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
 * 
 */
public final class SchedulingPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingPatchArgs Empty = new SchedulingPatchArgs();

    /**
     * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     * 
     */
    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,String>> nodeSelector;

    /**
     * @return nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     * 
     */
    public Optional<Output<Map<String,String>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    /**
     * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     * 
     */
    @Import(name="tolerations")
    private @Nullable Output<List<TolerationPatchArgs>> tolerations;

    /**
     * @return tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     * 
     */
    public Optional<Output<List<TolerationPatchArgs>>> tolerations() {
        return Optional.ofNullable(this.tolerations);
    }

    private SchedulingPatchArgs() {}

    private SchedulingPatchArgs(SchedulingPatchArgs $) {
        this.nodeSelector = $.nodeSelector;
        this.tolerations = $.tolerations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingPatchArgs $;

        public Builder() {
            $ = new SchedulingPatchArgs();
        }

        public Builder(SchedulingPatchArgs defaults) {
            $ = new SchedulingPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeSelector nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * @param nodeSelector nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(Map<String,String> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        /**
         * @param tolerations tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
         * 
         * @return builder
         * 
         */
        public Builder tolerations(@Nullable Output<List<TolerationPatchArgs>> tolerations) {
            $.tolerations = tolerations;
            return this;
        }

        /**
         * @param tolerations tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
         * 
         * @return builder
         * 
         */
        public Builder tolerations(List<TolerationPatchArgs> tolerations) {
            return tolerations(Output.of(tolerations));
        }

        /**
         * @param tolerations tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
         * 
         * @return builder
         * 
         */
        public Builder tolerations(TolerationPatchArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }

        public SchedulingPatchArgs build() {
            return $;
        }
    }

}
