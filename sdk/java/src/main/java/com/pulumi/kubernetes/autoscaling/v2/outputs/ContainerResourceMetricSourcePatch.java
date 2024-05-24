// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricTargetPatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerResourceMetricSourcePatch {
    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    private @Nullable String container;
    /**
     * @return name is the name of the resource in question.
     * 
     */
    private @Nullable String name;
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    private @Nullable MetricTargetPatch target;

    private ContainerResourceMetricSourcePatch() {}
    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    public Optional<String> container() {
        return Optional.ofNullable(this.container);
    }
    /**
     * @return name is the name of the resource in question.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public Optional<MetricTargetPatch> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String container;
        private @Nullable String name;
        private @Nullable MetricTargetPatch target;
        public Builder() {}
        public Builder(ContainerResourceMetricSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder container(@Nullable String container) {

            this.container = container;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable MetricTargetPatch target) {

            this.target = target;
            return this;
        }
        public ContainerResourceMetricSourcePatch build() {
            final var _resultValue = new ContainerResourceMetricSourcePatch();
            _resultValue.container = container;
            _resultValue.name = name;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
