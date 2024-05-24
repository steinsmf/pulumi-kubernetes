// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2.outputs.CrossVersionObjectReferencePatch;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricIdentifierPatch;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricTargetPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectMetricSourcePatch {
    /**
     * @return describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    private @Nullable CrossVersionObjectReferencePatch describedObject;
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    private @Nullable MetricIdentifierPatch metric;
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    private @Nullable MetricTargetPatch target;

    private ObjectMetricSourcePatch() {}
    /**
     * @return describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    public Optional<CrossVersionObjectReferencePatch> describedObject() {
        return Optional.ofNullable(this.describedObject);
    }
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public Optional<MetricIdentifierPatch> metric() {
        return Optional.ofNullable(this.metric);
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

    public static Builder builder(ObjectMetricSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CrossVersionObjectReferencePatch describedObject;
        private @Nullable MetricIdentifierPatch metric;
        private @Nullable MetricTargetPatch target;
        public Builder() {}
        public Builder(ObjectMetricSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.describedObject = defaults.describedObject;
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder describedObject(@Nullable CrossVersionObjectReferencePatch describedObject) {

            this.describedObject = describedObject;
            return this;
        }
        @CustomType.Setter
        public Builder metric(@Nullable MetricIdentifierPatch metric) {

            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable MetricTargetPatch target) {

            this.target = target;
            return this;
        }
        public ObjectMetricSourcePatch build() {
            final var _resultValue = new ObjectMetricSourcePatch();
            _resultValue.describedObject = describedObject;
            _resultValue.metric = metric;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
