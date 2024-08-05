// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeSelectorRequirementPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NodeSelectorTermPatch {
    /**
     * @return A list of node selector requirements by node&#39;s labels.
     * 
     */
    private @Nullable List<NodeSelectorRequirementPatch> matchExpressions;
    /**
     * @return A list of node selector requirements by node&#39;s fields.
     * 
     */
    private @Nullable List<NodeSelectorRequirementPatch> matchFields;

    private NodeSelectorTermPatch() {}
    /**
     * @return A list of node selector requirements by node&#39;s labels.
     * 
     */
    public List<NodeSelectorRequirementPatch> matchExpressions() {
        return this.matchExpressions == null ? List.of() : this.matchExpressions;
    }
    /**
     * @return A list of node selector requirements by node&#39;s fields.
     * 
     */
    public List<NodeSelectorRequirementPatch> matchFields() {
        return this.matchFields == null ? List.of() : this.matchFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSelectorTermPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NodeSelectorRequirementPatch> matchExpressions;
        private @Nullable List<NodeSelectorRequirementPatch> matchFields;
        public Builder() {}
        public Builder(NodeSelectorTermPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchExpressions = defaults.matchExpressions;
    	      this.matchFields = defaults.matchFields;
        }

        @CustomType.Setter
        public Builder matchExpressions(@Nullable List<NodeSelectorRequirementPatch> matchExpressions) {

            this.matchExpressions = matchExpressions;
            return this;
        }
        public Builder matchExpressions(NodeSelectorRequirementPatch... matchExpressions) {
            return matchExpressions(List.of(matchExpressions));
        }
        @CustomType.Setter
        public Builder matchFields(@Nullable List<NodeSelectorRequirementPatch> matchFields) {

            this.matchFields = matchFields;
            return this;
        }
        public Builder matchFields(NodeSelectorRequirementPatch... matchFields) {
            return matchFields(List.of(matchFields));
        }
        public NodeSelectorTermPatch build() {
            final var _resultValue = new NodeSelectorTermPatch();
            _resultValue.matchExpressions = matchExpressions;
            _resultValue.matchFields = matchFields;
            return _resultValue;
        }
    }
}
