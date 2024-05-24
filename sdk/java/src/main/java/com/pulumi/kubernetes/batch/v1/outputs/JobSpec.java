// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.batch.v1.outputs.PodFailurePolicy;
import com.pulumi.kubernetes.batch.v1.outputs.SuccessPolicy;
import com.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobSpec {
    /**
     * @return Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    private @Nullable Integer activeDeadlineSeconds;
    /**
     * @return Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    private @Nullable Integer backoffLimit;
    /**
     * @return Specifies the limit for the number of retries within an index before marking this index as failed. When enabled the number of failures per index is kept in the pod&#39;s batch.kubernetes.io/job-index-failure-count annotation. It can only be set when Job&#39;s completionMode=Indexed, and the Pod&#39;s restart policy is Never. The field is immutable. This field is beta-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * 
     */
    private @Nullable Integer backoffLimitPerIndex;
    /**
     * @return completionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn&#39;t recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     * 
     */
    private @Nullable String completionMode;
    /**
     * @return Specifies the desired number of successfully finished pods the job should be run with.  Setting to null means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private @Nullable Integer completions;
    /**
     * @return ManagedBy field indicates the controller that manages a Job. The k8s Job controller reconciles jobs which don&#39;t have this field at all or the field value is the reserved string `kubernetes.io/job-controller`, but skips reconciling Jobs with a custom value for this field. The value must be a valid domain-prefixed path (e.g. acme.io/foo) - all characters before the first &#34;/&#34; must be a valid subdomain as defined by RFC 1123. All characters trailing the first &#34;/&#34; must be valid HTTP Path characters as defined by RFC 3986. The value cannot exceed 64 characters.
     * 
     * This field is alpha-level. The job controller accepts setting the field when the feature gate JobManagedBy is enabled (disabled by default).
     * 
     */
    private @Nullable String managedBy;
    /**
     * @return manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    private @Nullable Boolean manualSelector;
    /**
     * @return Specifies the maximal number of failed indexes before marking the Job as failed, when backoffLimitPerIndex is set. Once the number of failed indexes exceeds this number the entire Job is marked as Failed and its execution is terminated. When left as null the job continues execution of all of its indexes and is marked with the `Complete` Job condition. It can only be specified when backoffLimitPerIndex is set. It can be null or up to completions. It is required and must be less than or equal to 10^4 when is completions greater than 10^5. This field is beta-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * 
     */
    private @Nullable Integer maxFailedIndexes;
    /**
     * @return Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private @Nullable Integer parallelism;
    /**
     * @return Specifies the policy of handling failed pods. In particular, it allows to specify the set of actions and conditions which need to be satisfied to take the associated action. If empty, the default behaviour applies - the counter of failed pods, represented by the jobs&#39;s .status.failed field, is incremented and it is checked against the backoffLimit. This field cannot be used in combination with restartPolicy=OnFailure.
     * 
     * This field is beta-level. It can be used when the `JobPodFailurePolicy` feature gate is enabled (enabled by default).
     * 
     */
    private @Nullable PodFailurePolicy podFailurePolicy;
    /**
     * @return podReplacementPolicy specifies when to create replacement Pods. Possible values are: - TerminatingOrFailed means that we recreate pods
     *   when they are terminating (has a metadata.deletionTimestamp) or failed.
     * - Failed means to wait until a previously created Pod is fully terminated (has phase
     *   Failed or Succeeded) before creating a replacement Pod.
     * 
     * When using podFailurePolicy, Failed is the the only allowed value. TerminatingOrFailed and Failed are allowed values when podFailurePolicy is not in use. This is an beta field. To use this, enable the JobPodReplacementPolicy feature toggle. This is on by default.
     * 
     */
    private @Nullable String podReplacementPolicy;
    /**
     * @return A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    private @Nullable LabelSelector selector;
    /**
     * @return successPolicy specifies the policy when the Job can be declared as succeeded. If empty, the default behavior applies - the Job is declared as succeeded only when the number of succeeded pods equals to the completions. When the field is specified, it must be immutable and works only for the Indexed Jobs. Once the Job meets the SuccessPolicy, the lingering pods are terminated.
     * 
     * This field  is alpha-level. To use this field, you must enable the `JobSuccessPolicy` feature gate (disabled by default).
     * 
     */
    private @Nullable SuccessPolicy successPolicy;
    /**
     * @return suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     */
    private @Nullable Boolean suspend;
    /**
     * @return Describes the pod that will be created when executing a job. The only allowed template.spec.restartPolicy values are &#34;Never&#34; or &#34;OnFailure&#34;. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private PodTemplateSpec template;
    /**
     * @return ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    private @Nullable Integer ttlSecondsAfterFinished;

    private JobSpec() {}
    /**
     * @return Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    public Optional<Integer> activeDeadlineSeconds() {
        return Optional.ofNullable(this.activeDeadlineSeconds);
    }
    /**
     * @return Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    public Optional<Integer> backoffLimit() {
        return Optional.ofNullable(this.backoffLimit);
    }
    /**
     * @return Specifies the limit for the number of retries within an index before marking this index as failed. When enabled the number of failures per index is kept in the pod&#39;s batch.kubernetes.io/job-index-failure-count annotation. It can only be set when Job&#39;s completionMode=Indexed, and the Pod&#39;s restart policy is Never. The field is immutable. This field is beta-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * 
     */
    public Optional<Integer> backoffLimitPerIndex() {
        return Optional.ofNullable(this.backoffLimitPerIndex);
    }
    /**
     * @return completionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn&#39;t recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     * 
     */
    public Optional<String> completionMode() {
        return Optional.ofNullable(this.completionMode);
    }
    /**
     * @return Specifies the desired number of successfully finished pods the job should be run with.  Setting to null means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public Optional<Integer> completions() {
        return Optional.ofNullable(this.completions);
    }
    /**
     * @return ManagedBy field indicates the controller that manages a Job. The k8s Job controller reconciles jobs which don&#39;t have this field at all or the field value is the reserved string `kubernetes.io/job-controller`, but skips reconciling Jobs with a custom value for this field. The value must be a valid domain-prefixed path (e.g. acme.io/foo) - all characters before the first &#34;/&#34; must be a valid subdomain as defined by RFC 1123. All characters trailing the first &#34;/&#34; must be valid HTTP Path characters as defined by RFC 3986. The value cannot exceed 64 characters.
     * 
     * This field is alpha-level. The job controller accepts setting the field when the feature gate JobManagedBy is enabled (disabled by default).
     * 
     */
    public Optional<String> managedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * @return manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    public Optional<Boolean> manualSelector() {
        return Optional.ofNullable(this.manualSelector);
    }
    /**
     * @return Specifies the maximal number of failed indexes before marking the Job as failed, when backoffLimitPerIndex is set. Once the number of failed indexes exceeds this number the entire Job is marked as Failed and its execution is terminated. When left as null the job continues execution of all of its indexes and is marked with the `Complete` Job condition. It can only be specified when backoffLimitPerIndex is set. It can be null or up to completions. It is required and must be less than or equal to 10^4 when is completions greater than 10^5. This field is beta-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * 
     */
    public Optional<Integer> maxFailedIndexes() {
        return Optional.ofNullable(this.maxFailedIndexes);
    }
    /**
     * @return Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public Optional<Integer> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }
    /**
     * @return Specifies the policy of handling failed pods. In particular, it allows to specify the set of actions and conditions which need to be satisfied to take the associated action. If empty, the default behaviour applies - the counter of failed pods, represented by the jobs&#39;s .status.failed field, is incremented and it is checked against the backoffLimit. This field cannot be used in combination with restartPolicy=OnFailure.
     * 
     * This field is beta-level. It can be used when the `JobPodFailurePolicy` feature gate is enabled (enabled by default).
     * 
     */
    public Optional<PodFailurePolicy> podFailurePolicy() {
        return Optional.ofNullable(this.podFailurePolicy);
    }
    /**
     * @return podReplacementPolicy specifies when to create replacement Pods. Possible values are: - TerminatingOrFailed means that we recreate pods
     *   when they are terminating (has a metadata.deletionTimestamp) or failed.
     * - Failed means to wait until a previously created Pod is fully terminated (has phase
     *   Failed or Succeeded) before creating a replacement Pod.
     * 
     * When using podFailurePolicy, Failed is the the only allowed value. TerminatingOrFailed and Failed are allowed values when podFailurePolicy is not in use. This is an beta field. To use this, enable the JobPodReplacementPolicy feature toggle. This is on by default.
     * 
     */
    public Optional<String> podReplacementPolicy() {
        return Optional.ofNullable(this.podReplacementPolicy);
    }
    /**
     * @return A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return successPolicy specifies the policy when the Job can be declared as succeeded. If empty, the default behavior applies - the Job is declared as succeeded only when the number of succeeded pods equals to the completions. When the field is specified, it must be immutable and works only for the Indexed Jobs. Once the Job meets the SuccessPolicy, the lingering pods are terminated.
     * 
     * This field  is alpha-level. To use this field, you must enable the `JobSuccessPolicy` feature gate (disabled by default).
     * 
     */
    public Optional<SuccessPolicy> successPolicy() {
        return Optional.ofNullable(this.successPolicy);
    }
    /**
     * @return suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     */
    public Optional<Boolean> suspend() {
        return Optional.ofNullable(this.suspend);
    }
    /**
     * @return Describes the pod that will be created when executing a job. The only allowed template.spec.restartPolicy values are &#34;Never&#34; or &#34;OnFailure&#34;. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public PodTemplateSpec template() {
        return this.template;
    }
    /**
     * @return ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    public Optional<Integer> ttlSecondsAfterFinished() {
        return Optional.ofNullable(this.ttlSecondsAfterFinished);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer activeDeadlineSeconds;
        private @Nullable Integer backoffLimit;
        private @Nullable Integer backoffLimitPerIndex;
        private @Nullable String completionMode;
        private @Nullable Integer completions;
        private @Nullable String managedBy;
        private @Nullable Boolean manualSelector;
        private @Nullable Integer maxFailedIndexes;
        private @Nullable Integer parallelism;
        private @Nullable PodFailurePolicy podFailurePolicy;
        private @Nullable String podReplacementPolicy;
        private @Nullable LabelSelector selector;
        private @Nullable SuccessPolicy successPolicy;
        private @Nullable Boolean suspend;
        private PodTemplateSpec template;
        private @Nullable Integer ttlSecondsAfterFinished;
        public Builder() {}
        public Builder(JobSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.backoffLimit = defaults.backoffLimit;
    	      this.backoffLimitPerIndex = defaults.backoffLimitPerIndex;
    	      this.completionMode = defaults.completionMode;
    	      this.completions = defaults.completions;
    	      this.managedBy = defaults.managedBy;
    	      this.manualSelector = defaults.manualSelector;
    	      this.maxFailedIndexes = defaults.maxFailedIndexes;
    	      this.parallelism = defaults.parallelism;
    	      this.podFailurePolicy = defaults.podFailurePolicy;
    	      this.podReplacementPolicy = defaults.podReplacementPolicy;
    	      this.selector = defaults.selector;
    	      this.successPolicy = defaults.successPolicy;
    	      this.suspend = defaults.suspend;
    	      this.template = defaults.template;
    	      this.ttlSecondsAfterFinished = defaults.ttlSecondsAfterFinished;
        }

        @CustomType.Setter
        public Builder activeDeadlineSeconds(@Nullable Integer activeDeadlineSeconds) {

            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder backoffLimit(@Nullable Integer backoffLimit) {

            this.backoffLimit = backoffLimit;
            return this;
        }
        @CustomType.Setter
        public Builder backoffLimitPerIndex(@Nullable Integer backoffLimitPerIndex) {

            this.backoffLimitPerIndex = backoffLimitPerIndex;
            return this;
        }
        @CustomType.Setter
        public Builder completionMode(@Nullable String completionMode) {

            this.completionMode = completionMode;
            return this;
        }
        @CustomType.Setter
        public Builder completions(@Nullable Integer completions) {

            this.completions = completions;
            return this;
        }
        @CustomType.Setter
        public Builder managedBy(@Nullable String managedBy) {

            this.managedBy = managedBy;
            return this;
        }
        @CustomType.Setter
        public Builder manualSelector(@Nullable Boolean manualSelector) {

            this.manualSelector = manualSelector;
            return this;
        }
        @CustomType.Setter
        public Builder maxFailedIndexes(@Nullable Integer maxFailedIndexes) {

            this.maxFailedIndexes = maxFailedIndexes;
            return this;
        }
        @CustomType.Setter
        public Builder parallelism(@Nullable Integer parallelism) {

            this.parallelism = parallelism;
            return this;
        }
        @CustomType.Setter
        public Builder podFailurePolicy(@Nullable PodFailurePolicy podFailurePolicy) {

            this.podFailurePolicy = podFailurePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder podReplacementPolicy(@Nullable String podReplacementPolicy) {

            this.podReplacementPolicy = podReplacementPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelector selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder successPolicy(@Nullable SuccessPolicy successPolicy) {

            this.successPolicy = successPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder suspend(@Nullable Boolean suspend) {

            this.suspend = suspend;
            return this;
        }
        @CustomType.Setter
        public Builder template(PodTemplateSpec template) {
            if (template == null) {
              throw new MissingRequiredPropertyException("JobSpec", "template");
            }
            this.template = template;
            return this;
        }
        @CustomType.Setter
        public Builder ttlSecondsAfterFinished(@Nullable Integer ttlSecondsAfterFinished) {

            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }
        public JobSpec build() {
            final var _resultValue = new JobSpec();
            _resultValue.activeDeadlineSeconds = activeDeadlineSeconds;
            _resultValue.backoffLimit = backoffLimit;
            _resultValue.backoffLimitPerIndex = backoffLimitPerIndex;
            _resultValue.completionMode = completionMode;
            _resultValue.completions = completions;
            _resultValue.managedBy = managedBy;
            _resultValue.manualSelector = manualSelector;
            _resultValue.maxFailedIndexes = maxFailedIndexes;
            _resultValue.parallelism = parallelism;
            _resultValue.podFailurePolicy = podFailurePolicy;
            _resultValue.podReplacementPolicy = podReplacementPolicy;
            _resultValue.selector = selector;
            _resultValue.successPolicy = successPolicy;
            _resultValue.suspend = suspend;
            _resultValue.template = template;
            _resultValue.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return _resultValue;
        }
    }
}
