// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerResourceMetricStatusPatch {
    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    private @Nullable String container;
    /**
     * @return currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
     * 
     */
    private @Nullable Integer currentAverageUtilization;
    /**
     * @return currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the &#34;pods&#34; metric source type. It will always be set, regardless of the corresponding metric specification.
     * 
     */
    private @Nullable String currentAverageValue;
    /**
     * @return name is the name of the resource in question.
     * 
     */
    private @Nullable String name;

    private ContainerResourceMetricStatusPatch() {}
    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    public Optional<String> container() {
        return Optional.ofNullable(this.container);
    }
    /**
     * @return currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
     * 
     */
    public Optional<Integer> currentAverageUtilization() {
        return Optional.ofNullable(this.currentAverageUtilization);
    }
    /**
     * @return currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the &#34;pods&#34; metric source type. It will always be set, regardless of the corresponding metric specification.
     * 
     */
    public Optional<String> currentAverageValue() {
        return Optional.ofNullable(this.currentAverageValue);
    }
    /**
     * @return name is the name of the resource in question.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String container;
        private @Nullable Integer currentAverageUtilization;
        private @Nullable String currentAverageValue;
        private @Nullable String name;
        public Builder() {}
        public Builder(ContainerResourceMetricStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.currentAverageUtilization = defaults.currentAverageUtilization;
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder container(@Nullable String container) {
            this.container = container;
            return this;
        }
        @CustomType.Setter
        public Builder currentAverageUtilization(@Nullable Integer currentAverageUtilization) {
            this.currentAverageUtilization = currentAverageUtilization;
            return this;
        }
        @CustomType.Setter
        public Builder currentAverageValue(@Nullable String currentAverageValue) {
            this.currentAverageValue = currentAverageValue;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ContainerResourceMetricStatusPatch build() {
            final var o = new ContainerResourceMetricStatusPatch();
            o.container = container;
            o.currentAverageUtilization = currentAverageUtilization;
            o.currentAverageValue = currentAverageValue;
            o.name = name;
            return o;
        }
    }
}