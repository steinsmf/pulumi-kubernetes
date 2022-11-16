// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PodSchedulingGate {
    /**
     * @return Name of the scheduling gate. Each scheduling gate must have a unique name field.
     * 
     */
    private String name;

    private PodSchedulingGate() {}
    /**
     * @return Name of the scheduling gate. Each scheduling gate must have a unique name field.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSchedulingGate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(PodSchedulingGate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PodSchedulingGate build() {
            final var o = new PodSchedulingGate();
            o.name = name;
            return o;
        }
    }
}
