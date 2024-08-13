// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeRuntimeHandlerFeaturesPatch {
    /**
     * @return RecursiveReadOnlyMounts is set to true if the runtime handler supports RecursiveReadOnlyMounts.
     * 
     */
    private @Nullable Boolean recursiveReadOnlyMounts;
    /**
     * @return UserNamespaces is set to true if the runtime handler supports UserNamespaces, including for volumes.
     * 
     */
    private @Nullable Boolean userNamespaces;

    private NodeRuntimeHandlerFeaturesPatch() {}
    /**
     * @return RecursiveReadOnlyMounts is set to true if the runtime handler supports RecursiveReadOnlyMounts.
     * 
     */
    public Optional<Boolean> recursiveReadOnlyMounts() {
        return Optional.ofNullable(this.recursiveReadOnlyMounts);
    }
    /**
     * @return UserNamespaces is set to true if the runtime handler supports UserNamespaces, including for volumes.
     * 
     */
    public Optional<Boolean> userNamespaces() {
        return Optional.ofNullable(this.userNamespaces);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeRuntimeHandlerFeaturesPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean recursiveReadOnlyMounts;
        private @Nullable Boolean userNamespaces;
        public Builder() {}
        public Builder(NodeRuntimeHandlerFeaturesPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveReadOnlyMounts = defaults.recursiveReadOnlyMounts;
    	      this.userNamespaces = defaults.userNamespaces;
        }

        @CustomType.Setter
        public Builder recursiveReadOnlyMounts(@Nullable Boolean recursiveReadOnlyMounts) {

            this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
            return this;
        }
        @CustomType.Setter
        public Builder userNamespaces(@Nullable Boolean userNamespaces) {

            this.userNamespaces = userNamespaces;
            return this;
        }
        public NodeRuntimeHandlerFeaturesPatch build() {
            final var _resultValue = new NodeRuntimeHandlerFeaturesPatch();
            _resultValue.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
            _resultValue.userNamespaces = userNamespaces;
            return _resultValue;
        }
    }
}
