// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.batch.v1.outputs.JobConditionPatch;
import com.pulumi.kubernetes.batch.v1.outputs.UncountedTerminatedPodsPatch;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobStatusPatch {
    /**
     * @return The number of pending and running pods which are not terminating (without a deletionTimestamp). The value is zero for finished jobs.
     * 
     */
    private @Nullable Integer active;
    /**
     * @return completedIndexes holds the completed indexes when .spec.completionMode = &#34;Indexed&#34; in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;.
     * 
     */
    private @Nullable String completedIndexes;
    /**
     * @return Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is set when the job finishes successfully, and only then. The value cannot be updated or removed. The value indicates the same or later point in time as the startTime field.
     * 
     */
    private @Nullable String completionTime;
    /**
     * @return The latest available observations of an object&#39;s current state. When a Job fails, one of the conditions will have type &#34;Failed&#34; and status true. When a Job is suspended, one of the conditions will have type &#34;Suspended&#34; and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type &#34;Complete&#34; and status true.
     * 
     * A job is considered finished when it is in a terminal condition, either &#34;Complete&#34; or &#34;Failed&#34;. A Job cannot have both the &#34;Complete&#34; and &#34;Failed&#34; conditions. Additionally, it cannot be in the &#34;Complete&#34; and &#34;FailureTarget&#34; conditions. The &#34;Complete&#34;, &#34;Failed&#34; and &#34;FailureTarget&#34; conditions cannot be disabled.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private @Nullable List<JobConditionPatch> conditions;
    /**
     * @return The number of pods which reached phase Failed. The value increases monotonically.
     * 
     */
    private @Nullable Integer failed;
    /**
     * @return FailedIndexes holds the failed indexes when spec.backoffLimitPerIndex is set. The indexes are represented in the text format analogous as for the `completedIndexes` field, ie. they are kept as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the failed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;. The set of failed indexes cannot overlap with the set of completed indexes.
     * 
     * This field is beta-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * 
     */
    private @Nullable String failedIndexes;
    /**
     * @return The number of pods which have a Ready condition.
     * 
     */
    private @Nullable Integer ready;
    /**
     * @return Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
     * 
     * Once set, the field can only be removed when the job is suspended. The field cannot be modified while the job is unsuspended or finished.
     * 
     */
    private @Nullable String startTime;
    /**
     * @return The number of pods which reached phase Succeeded. The value increases monotonically for a given spec. However, it may decrease in reaction to scale down of elastic indexed jobs.
     * 
     */
    private @Nullable Integer succeeded;
    /**
     * @return The number of pods which are terminating (in phase Pending or Running and have a deletionTimestamp).
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobPodReplacementPolicy is enabled (enabled by default).
     * 
     */
    private @Nullable Integer terminating;
    /**
     * @return uncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn&#39;t yet accounted for in the status counters.
     * 
     * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status:
     * 
     * 1. Add the pod UID to the arrays in this field. 2. Remove the pod finalizer. 3. Remove the pod UID from the arrays while increasing the corresponding
     *     counter.
     * 
     * Old jobs might not be tracked using this field, in which case the field remains null. The structure is empty for finished jobs.
     * 
     */
    private @Nullable UncountedTerminatedPodsPatch uncountedTerminatedPods;

    private JobStatusPatch() {}
    /**
     * @return The number of pending and running pods which are not terminating (without a deletionTimestamp). The value is zero for finished jobs.
     * 
     */
    public Optional<Integer> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * @return completedIndexes holds the completed indexes when .spec.completionMode = &#34;Indexed&#34; in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;.
     * 
     */
    public Optional<String> completedIndexes() {
        return Optional.ofNullable(this.completedIndexes);
    }
    /**
     * @return Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is set when the job finishes successfully, and only then. The value cannot be updated or removed. The value indicates the same or later point in time as the startTime field.
     * 
     */
    public Optional<String> completionTime() {
        return Optional.ofNullable(this.completionTime);
    }
    /**
     * @return The latest available observations of an object&#39;s current state. When a Job fails, one of the conditions will have type &#34;Failed&#34; and status true. When a Job is suspended, one of the conditions will have type &#34;Suspended&#34; and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type &#34;Complete&#34; and status true.
     * 
     * A job is considered finished when it is in a terminal condition, either &#34;Complete&#34; or &#34;Failed&#34;. A Job cannot have both the &#34;Complete&#34; and &#34;Failed&#34; conditions. Additionally, it cannot be in the &#34;Complete&#34; and &#34;FailureTarget&#34; conditions. The &#34;Complete&#34;, &#34;Failed&#34; and &#34;FailureTarget&#34; conditions cannot be disabled.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public List<JobConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return The number of pods which reached phase Failed. The value increases monotonically.
     * 
     */
    public Optional<Integer> failed() {
        return Optional.ofNullable(this.failed);
    }
    /**
     * @return FailedIndexes holds the failed indexes when spec.backoffLimitPerIndex is set. The indexes are represented in the text format analogous as for the `completedIndexes` field, ie. they are kept as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the failed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;. The set of failed indexes cannot overlap with the set of completed indexes.
     * 
     * This field is beta-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (enabled by default).
     * 
     */
    public Optional<String> failedIndexes() {
        return Optional.ofNullable(this.failedIndexes);
    }
    /**
     * @return The number of pods which have a Ready condition.
     * 
     */
    public Optional<Integer> ready() {
        return Optional.ofNullable(this.ready);
    }
    /**
     * @return Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
     * 
     * Once set, the field can only be removed when the job is suspended. The field cannot be modified while the job is unsuspended or finished.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return The number of pods which reached phase Succeeded. The value increases monotonically for a given spec. However, it may decrease in reaction to scale down of elastic indexed jobs.
     * 
     */
    public Optional<Integer> succeeded() {
        return Optional.ofNullable(this.succeeded);
    }
    /**
     * @return The number of pods which are terminating (in phase Pending or Running and have a deletionTimestamp).
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobPodReplacementPolicy is enabled (enabled by default).
     * 
     */
    public Optional<Integer> terminating() {
        return Optional.ofNullable(this.terminating);
    }
    /**
     * @return uncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn&#39;t yet accounted for in the status counters.
     * 
     * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status:
     * 
     * 1. Add the pod UID to the arrays in this field. 2. Remove the pod finalizer. 3. Remove the pod UID from the arrays while increasing the corresponding
     *     counter.
     * 
     * Old jobs might not be tracked using this field, in which case the field remains null. The structure is empty for finished jobs.
     * 
     */
    public Optional<UncountedTerminatedPodsPatch> uncountedTerminatedPods() {
        return Optional.ofNullable(this.uncountedTerminatedPods);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer active;
        private @Nullable String completedIndexes;
        private @Nullable String completionTime;
        private @Nullable List<JobConditionPatch> conditions;
        private @Nullable Integer failed;
        private @Nullable String failedIndexes;
        private @Nullable Integer ready;
        private @Nullable String startTime;
        private @Nullable Integer succeeded;
        private @Nullable Integer terminating;
        private @Nullable UncountedTerminatedPodsPatch uncountedTerminatedPods;
        public Builder() {}
        public Builder(JobStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.completedIndexes = defaults.completedIndexes;
    	      this.completionTime = defaults.completionTime;
    	      this.conditions = defaults.conditions;
    	      this.failed = defaults.failed;
    	      this.failedIndexes = defaults.failedIndexes;
    	      this.ready = defaults.ready;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
    	      this.terminating = defaults.terminating;
    	      this.uncountedTerminatedPods = defaults.uncountedTerminatedPods;
        }

        @CustomType.Setter
        public Builder active(@Nullable Integer active) {

            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder completedIndexes(@Nullable String completedIndexes) {

            this.completedIndexes = completedIndexes;
            return this;
        }
        @CustomType.Setter
        public Builder completionTime(@Nullable String completionTime) {

            this.completionTime = completionTime;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<JobConditionPatch> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(JobConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder failed(@Nullable Integer failed) {

            this.failed = failed;
            return this;
        }
        @CustomType.Setter
        public Builder failedIndexes(@Nullable String failedIndexes) {

            this.failedIndexes = failedIndexes;
            return this;
        }
        @CustomType.Setter
        public Builder ready(@Nullable Integer ready) {

            this.ready = ready;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {

            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder succeeded(@Nullable Integer succeeded) {

            this.succeeded = succeeded;
            return this;
        }
        @CustomType.Setter
        public Builder terminating(@Nullable Integer terminating) {

            this.terminating = terminating;
            return this;
        }
        @CustomType.Setter
        public Builder uncountedTerminatedPods(@Nullable UncountedTerminatedPodsPatch uncountedTerminatedPods) {

            this.uncountedTerminatedPods = uncountedTerminatedPods;
            return this;
        }
        public JobStatusPatch build() {
            final var _resultValue = new JobStatusPatch();
            _resultValue.active = active;
            _resultValue.completedIndexes = completedIndexes;
            _resultValue.completionTime = completionTime;
            _resultValue.conditions = conditions;
            _resultValue.failed = failed;
            _resultValue.failedIndexes = failedIndexes;
            _resultValue.ready = ready;
            _resultValue.startTime = startTime;
            _resultValue.succeeded = succeeded;
            _resultValue.terminating = terminating;
            _resultValue.uncountedTerminatedPods = uncountedTerminatedPods;
            return _resultValue;
        }
    }
}
