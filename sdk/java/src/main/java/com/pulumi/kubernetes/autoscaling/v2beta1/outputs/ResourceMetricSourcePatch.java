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
public final class ResourceMetricSourcePatch {
    /**
     * @return name is the name of the resource in question.
     * 
     */
    private @Nullable String name;
    /**
     * @return targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    private @Nullable Integer targetAverageUtilization;
    /**
     * @return targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the &#34;pods&#34; metric source type.
     * 
     */
    private @Nullable String targetAverageValue;

    private ResourceMetricSourcePatch() {}
    /**
     * @return name is the name of the resource in question.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    public Optional<Integer> targetAverageUtilization() {
        return Optional.ofNullable(this.targetAverageUtilization);
    }
    /**
     * @return targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the &#34;pods&#34; metric source type.
     * 
     */
    public Optional<String> targetAverageValue() {
        return Optional.ofNullable(this.targetAverageValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable Integer targetAverageUtilization;
        private @Nullable String targetAverageValue;
        public Builder() {}
        public Builder(ResourceMetricSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.targetAverageUtilization = defaults.targetAverageUtilization;
    	      this.targetAverageValue = defaults.targetAverageValue;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder targetAverageUtilization(@Nullable Integer targetAverageUtilization) {
            this.targetAverageUtilization = targetAverageUtilization;
            return this;
        }
        @CustomType.Setter
        public Builder targetAverageValue(@Nullable String targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }
        public ResourceMetricSourcePatch build() {
            final var o = new ResourceMetricSourcePatch();
            o.name = name;
            o.targetAverageUtilization = targetAverageUtilization;
            o.targetAverageValue = targetAverageValue;
            return o;
        }
    }
}