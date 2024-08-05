// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodSchedulingContextSpecPatch {
    /**
     * @return PotentialNodes lists nodes where the Pod might be able to run.
     * 
     * The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
     * 
     */
    private @Nullable List<String> potentialNodes;
    /**
     * @return SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use &#34;WaitForFirstConsumer&#34; allocation is to be attempted.
     * 
     */
    private @Nullable String selectedNode;

    private PodSchedulingContextSpecPatch() {}
    /**
     * @return PotentialNodes lists nodes where the Pod might be able to run.
     * 
     * The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
     * 
     */
    public List<String> potentialNodes() {
        return this.potentialNodes == null ? List.of() : this.potentialNodes;
    }
    /**
     * @return SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use &#34;WaitForFirstConsumer&#34; allocation is to be attempted.
     * 
     */
    public Optional<String> selectedNode() {
        return Optional.ofNullable(this.selectedNode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSchedulingContextSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> potentialNodes;
        private @Nullable String selectedNode;
        public Builder() {}
        public Builder(PodSchedulingContextSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.potentialNodes = defaults.potentialNodes;
    	      this.selectedNode = defaults.selectedNode;
        }

        @CustomType.Setter
        public Builder potentialNodes(@Nullable List<String> potentialNodes) {

            this.potentialNodes = potentialNodes;
            return this;
        }
        public Builder potentialNodes(String... potentialNodes) {
            return potentialNodes(List.of(potentialNodes));
        }
        @CustomType.Setter
        public Builder selectedNode(@Nullable String selectedNode) {

            this.selectedNode = selectedNode;
            return this;
        }
        public PodSchedulingContextSpecPatch build() {
            final var _resultValue = new PodSchedulingContextSpecPatch();
            _resultValue.potentialNodes = potentialNodes;
            _resultValue.selectedNode = selectedNode;
            return _resultValue;
        }
    }
}
