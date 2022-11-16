// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.ContainerResourceMetricStatus;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.ExternalMetricStatus;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.ObjectMetricStatus;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.PodsMetricStatus;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.ResourceMetricStatus;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricStatus {
    /**
     * @return container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    private @Nullable ContainerResourceMetricStatus containerResource;
    /**
     * @return external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    private @Nullable ExternalMetricStatus external;
    /**
     * @return object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    private @Nullable ObjectMetricStatus object;
    /**
     * @return pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    private @Nullable PodsMetricStatus pods;
    /**
     * @return resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    private @Nullable ResourceMetricStatus resource;
    /**
     * @return type is the type of metric source.  It will be one of &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each corresponds to a matching field in the object.
     * 
     */
    private String type;

    private MetricStatus() {}
    /**
     * @return container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    public Optional<ContainerResourceMetricStatus> containerResource() {
        return Optional.ofNullable(this.containerResource);
    }
    /**
     * @return external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    public Optional<ExternalMetricStatus> external() {
        return Optional.ofNullable(this.external);
    }
    /**
     * @return object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public Optional<ObjectMetricStatus> object() {
        return Optional.ofNullable(this.object);
    }
    /**
     * @return pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    public Optional<PodsMetricStatus> pods() {
        return Optional.ofNullable(this.pods);
    }
    /**
     * @return resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    public Optional<ResourceMetricStatus> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * @return type is the type of metric source.  It will be one of &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each corresponds to a matching field in the object.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ContainerResourceMetricStatus containerResource;
        private @Nullable ExternalMetricStatus external;
        private @Nullable ObjectMetricStatus object;
        private @Nullable PodsMetricStatus pods;
        private @Nullable ResourceMetricStatus resource;
        private String type;
        public Builder() {}
        public Builder(MetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder containerResource(@Nullable ContainerResourceMetricStatus containerResource) {
            this.containerResource = containerResource;
            return this;
        }
        @CustomType.Setter
        public Builder external(@Nullable ExternalMetricStatus external) {
            this.external = external;
            return this;
        }
        @CustomType.Setter
        public Builder object(@Nullable ObjectMetricStatus object) {
            this.object = object;
            return this;
        }
        @CustomType.Setter
        public Builder pods(@Nullable PodsMetricStatus pods) {
            this.pods = pods;
            return this;
        }
        @CustomType.Setter
        public Builder resource(@Nullable ResourceMetricStatus resource) {
            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MetricStatus build() {
            final var o = new MetricStatus();
            o.containerResource = containerResource;
            o.external = external;
            o.object = object;
            o.pods = pods;
            o.resource = resource;
            o.type = type;
            return o;
        }
    }
}
