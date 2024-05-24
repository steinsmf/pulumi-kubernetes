// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ContainerResourceMetricStatusArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ExternalMetricStatusArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ObjectMetricStatusArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.PodsMetricStatusArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ResourceMetricStatusArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MetricStatus describes the last-read state of a single metric.
 * 
 */
public final class MetricStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricStatusArgs Empty = new MetricStatusArgs();

    /**
     * container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    @Import(name="containerResource")
    private @Nullable Output<ContainerResourceMetricStatusArgs> containerResource;

    /**
     * @return container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    public Optional<Output<ContainerResourceMetricStatusArgs>> containerResource() {
        return Optional.ofNullable(this.containerResource);
    }

    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    @Import(name="external")
    private @Nullable Output<ExternalMetricStatusArgs> external;

    /**
     * @return external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    public Optional<Output<ExternalMetricStatusArgs>> external() {
        return Optional.ofNullable(this.external);
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    @Import(name="object")
    private @Nullable Output<ObjectMetricStatusArgs> object;

    /**
     * @return object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public Optional<Output<ObjectMetricStatusArgs>> object() {
        return Optional.ofNullable(this.object);
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    @Import(name="pods")
    private @Nullable Output<PodsMetricStatusArgs> pods;

    /**
     * @return pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    public Optional<Output<PodsMetricStatusArgs>> pods() {
        return Optional.ofNullable(this.pods);
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<ResourceMetricStatusArgs> resource;

    /**
     * @return resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    public Optional<Output<ResourceMetricStatusArgs>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * type is the type of metric source.  It will be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each corresponds to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return type is the type of metric source.  It will be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each corresponds to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private MetricStatusArgs() {}

    private MetricStatusArgs(MetricStatusArgs $) {
        this.containerResource = $.containerResource;
        this.external = $.external;
        this.object = $.object;
        this.pods = $.pods;
        this.resource = $.resource;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricStatusArgs $;

        public Builder() {
            $ = new MetricStatusArgs();
        }

        public Builder(MetricStatusArgs defaults) {
            $ = new MetricStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerResource container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
         * 
         * @return builder
         * 
         */
        public Builder containerResource(@Nullable Output<ContainerResourceMetricStatusArgs> containerResource) {
            $.containerResource = containerResource;
            return this;
        }

        /**
         * @param containerResource container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
         * 
         * @return builder
         * 
         */
        public Builder containerResource(ContainerResourceMetricStatusArgs containerResource) {
            return containerResource(Output.of(containerResource));
        }

        /**
         * @param external external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
         * 
         * @return builder
         * 
         */
        public Builder external(@Nullable Output<ExternalMetricStatusArgs> external) {
            $.external = external;
            return this;
        }

        /**
         * @param external external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
         * 
         * @return builder
         * 
         */
        public Builder external(ExternalMetricStatusArgs external) {
            return external(Output.of(external));
        }

        /**
         * @param object object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
         * 
         * @return builder
         * 
         */
        public Builder object(@Nullable Output<ObjectMetricStatusArgs> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
         * 
         * @return builder
         * 
         */
        public Builder object(ObjectMetricStatusArgs object) {
            return object(Output.of(object));
        }

        /**
         * @param pods pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
         * 
         * @return builder
         * 
         */
        public Builder pods(@Nullable Output<PodsMetricStatusArgs> pods) {
            $.pods = pods;
            return this;
        }

        /**
         * @param pods pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
         * 
         * @return builder
         * 
         */
        public Builder pods(PodsMetricStatusArgs pods) {
            return pods(Output.of(pods));
        }

        /**
         * @param resource resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<ResourceMetricStatusArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
         * 
         * @return builder
         * 
         */
        public Builder resource(ResourceMetricStatusArgs resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param type type is the type of metric source.  It will be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each corresponds to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type type is the type of metric source.  It will be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each corresponds to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MetricStatusArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("MetricStatusArgs", "type");
            }
            return $;
        }
    }

}
