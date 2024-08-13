// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeFeatures {
    /**
     * @return SupplementalGroupsPolicy is set to true if the runtime supports SupplementalGroupsPolicy and ContainerUser.
     * 
     */
    private @Nullable Boolean supplementalGroupsPolicy;

    private NodeFeatures() {}
    /**
     * @return SupplementalGroupsPolicy is set to true if the runtime supports SupplementalGroupsPolicy and ContainerUser.
     * 
     */
    public Optional<Boolean> supplementalGroupsPolicy() {
        return Optional.ofNullable(this.supplementalGroupsPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeFeatures defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean supplementalGroupsPolicy;
        public Builder() {}
        public Builder(NodeFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supplementalGroupsPolicy = defaults.supplementalGroupsPolicy;
        }

        @CustomType.Setter
        public Builder supplementalGroupsPolicy(@Nullable Boolean supplementalGroupsPolicy) {

            this.supplementalGroupsPolicy = supplementalGroupsPolicy;
            return this;
        }
        public NodeFeatures build() {
            final var _resultValue = new NodeFeatures();
            _resultValue.supplementalGroupsPolicy = supplementalGroupsPolicy;
            return _resultValue;
        }
    }
}
