// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class Capabilities {
    /**
     * @return Added capabilities
     * 
     */
    private @Nullable List<String> add;
    /**
     * @return Removed capabilities
     * 
     */
    private @Nullable List<String> drop;

    private Capabilities() {}
    /**
     * @return Added capabilities
     * 
     */
    public List<String> add() {
        return this.add == null ? List.of() : this.add;
    }
    /**
     * @return Removed capabilities
     * 
     */
    public List<String> drop() {
        return this.drop == null ? List.of() : this.drop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Capabilities defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> add;
        private @Nullable List<String> drop;
        public Builder() {}
        public Builder(Capabilities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.add = defaults.add;
    	      this.drop = defaults.drop;
        }

        @CustomType.Setter
        public Builder add(@Nullable List<String> add) {

            this.add = add;
            return this;
        }
        public Builder add(String... add) {
            return add(List.of(add));
        }
        @CustomType.Setter
        public Builder drop(@Nullable List<String> drop) {

            this.drop = drop;
            return this;
        }
        public Builder drop(String... drop) {
            return drop(List.of(drop));
        }
        public Capabilities build() {
            final var _resultValue = new Capabilities();
            _resultValue.add = add;
            _resultValue.drop = drop;
            return _resultValue;
        }
    }
}
