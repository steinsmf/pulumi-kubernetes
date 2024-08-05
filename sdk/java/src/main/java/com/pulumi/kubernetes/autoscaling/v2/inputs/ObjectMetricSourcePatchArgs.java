// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling.v2.inputs.CrossVersionObjectReferencePatchArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.MetricIdentifierPatchArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.MetricTargetPatchArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectMetricSourcePatchArgs Empty = new ObjectMetricSourcePatchArgs();

    /**
     * describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    @Import(name="describedObject")
    private @Nullable Output<CrossVersionObjectReferencePatchArgs> describedObject;

    /**
     * @return describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    public Optional<Output<CrossVersionObjectReferencePatchArgs>> describedObject() {
        return Optional.ofNullable(this.describedObject);
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric")
    private @Nullable Output<MetricIdentifierPatchArgs> metric;

    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public Optional<Output<MetricIdentifierPatchArgs>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @Import(name="target")
    private @Nullable Output<MetricTargetPatchArgs> target;

    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public Optional<Output<MetricTargetPatchArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    private ObjectMetricSourcePatchArgs() {}

    private ObjectMetricSourcePatchArgs(ObjectMetricSourcePatchArgs $) {
        this.describedObject = $.describedObject;
        this.metric = $.metric;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectMetricSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectMetricSourcePatchArgs $;

        public Builder() {
            $ = new ObjectMetricSourcePatchArgs();
        }

        public Builder(ObjectMetricSourcePatchArgs defaults) {
            $ = new ObjectMetricSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param describedObject describedObject specifies the descriptions of a object,such as kind,name apiVersion
         * 
         * @return builder
         * 
         */
        public Builder describedObject(@Nullable Output<CrossVersionObjectReferencePatchArgs> describedObject) {
            $.describedObject = describedObject;
            return this;
        }

        /**
         * @param describedObject describedObject specifies the descriptions of a object,such as kind,name apiVersion
         * 
         * @return builder
         * 
         */
        public Builder describedObject(CrossVersionObjectReferencePatchArgs describedObject) {
            return describedObject(Output.of(describedObject));
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<MetricIdentifierPatchArgs> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(MetricIdentifierPatchArgs metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param target target specifies the target value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<MetricTargetPatchArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target target specifies the target value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder target(MetricTargetPatchArgs target) {
            return target(Output.of(target));
        }

        public ObjectMetricSourcePatchArgs build() {
            return $;
        }
    }

}
