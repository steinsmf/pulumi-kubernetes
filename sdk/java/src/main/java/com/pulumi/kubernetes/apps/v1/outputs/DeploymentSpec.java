// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.apps.v1.outputs.DeploymentStrategy;
import com.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentSpec {
    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    private @Nullable Integer minReadySeconds;
    /**
     * @return Indicates that the deployment is paused.
     * 
     */
    private @Nullable Boolean paused;
    /**
     * @return The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    private @Nullable Integer progressDeadlineSeconds;
    /**
     * @return Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    private @Nullable Integer replicas;
    /**
     * @return The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    private @Nullable Integer revisionHistoryLimit;
    /**
     * @return Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
     * 
     */
    private LabelSelector selector;
    /**
     * @return The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    private @Nullable DeploymentStrategy strategy;
    /**
     * @return Template describes the pods that will be created. The only allowed template.spec.restartPolicy value is &#34;Always&#34;.
     * 
     */
    private PodTemplateSpec template;

    private DeploymentSpec() {}
    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Optional<Integer> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    /**
     * @return Indicates that the deployment is paused.
     * 
     */
    public Optional<Boolean> paused() {
        return Optional.ofNullable(this.paused);
    }
    /**
     * @return The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    public Optional<Integer> progressDeadlineSeconds() {
        return Optional.ofNullable(this.progressDeadlineSeconds);
    }
    /**
     * @return Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * @return The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    public Optional<Integer> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    /**
     * @return Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
     * 
     */
    public LabelSelector selector() {
        return this.selector;
    }
    /**
     * @return The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    public Optional<DeploymentStrategy> strategy() {
        return Optional.ofNullable(this.strategy);
    }
    /**
     * @return Template describes the pods that will be created. The only allowed template.spec.restartPolicy value is &#34;Always&#34;.
     * 
     */
    public PodTemplateSpec template() {
        return this.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Boolean paused;
        private @Nullable Integer progressDeadlineSeconds;
        private @Nullable Integer replicas;
        private @Nullable Integer revisionHistoryLimit;
        private LabelSelector selector;
        private @Nullable DeploymentStrategy strategy;
        private PodTemplateSpec template;
        public Builder() {}
        public Builder(DeploymentSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.paused = defaults.paused;
    	      this.progressDeadlineSeconds = defaults.progressDeadlineSeconds;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.strategy = defaults.strategy;
    	      this.template = defaults.template;
        }

        @CustomType.Setter
        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {

            this.minReadySeconds = minReadySeconds;
            return this;
        }
        @CustomType.Setter
        public Builder paused(@Nullable Boolean paused) {

            this.paused = paused;
            return this;
        }
        @CustomType.Setter
        public Builder progressDeadlineSeconds(@Nullable Integer progressDeadlineSeconds) {

            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder replicas(@Nullable Integer replicas) {

            this.replicas = replicas;
            return this;
        }
        @CustomType.Setter
        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {

            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }
        @CustomType.Setter
        public Builder selector(LabelSelector selector) {
            if (selector == null) {
              throw new MissingRequiredPropertyException("DeploymentSpec", "selector");
            }
            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder strategy(@Nullable DeploymentStrategy strategy) {

            this.strategy = strategy;
            return this;
        }
        @CustomType.Setter
        public Builder template(PodTemplateSpec template) {
            if (template == null) {
              throw new MissingRequiredPropertyException("DeploymentSpec", "template");
            }
            this.template = template;
            return this;
        }
        public DeploymentSpec build() {
            final var _resultValue = new DeploymentSpec();
            _resultValue.minReadySeconds = minReadySeconds;
            _resultValue.paused = paused;
            _resultValue.progressDeadlineSeconds = progressDeadlineSeconds;
            _resultValue.replicas = replicas;
            _resultValue.revisionHistoryLimit = revisionHistoryLimit;
            _resultValue.selector = selector;
            _resultValue.strategy = strategy;
            _resultValue.template = template;
            return _resultValue;
        }
    }
}
