// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PriorityLevelConfigurationReferencePatch {
    /**
     * @return `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    private @Nullable String name;

    private PriorityLevelConfigurationReferencePatch() {}
    /**
     * @return `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationReferencePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        public Builder() {}
        public Builder(PriorityLevelConfigurationReferencePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public PriorityLevelConfigurationReferencePatch build() {
            final var _resultValue = new PriorityLevelConfigurationReferencePatch();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
