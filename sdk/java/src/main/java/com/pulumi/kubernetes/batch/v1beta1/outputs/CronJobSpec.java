// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.batch.v1beta1.outputs.JobTemplateSpec;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CronJobSpec {
    /**
     * @return Specifies how to treat concurrent executions of a Job. Valid values are: - &#34;Allow&#34; (default): allows CronJobs to run concurrently; - &#34;Forbid&#34;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - &#34;Replace&#34;: cancels currently running job and replaces it with a new one
     * 
     */
    private @Nullable String concurrencyPolicy;
    /**
     * @return The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    private @Nullable Integer failedJobsHistoryLimit;
    /**
     * @return Specifies the job that will be created when executing a CronJob.
     * 
     */
    private JobTemplateSpec jobTemplate;
    /**
     * @return The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * 
     */
    private String schedule;
    /**
     * @return Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     * 
     */
    private @Nullable Integer startingDeadlineSeconds;
    /**
     * @return The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
     * 
     */
    private @Nullable Integer successfulJobsHistoryLimit;
    /**
     * @return This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
     * 
     */
    private @Nullable Boolean suspend;

    private CronJobSpec() {}
    /**
     * @return Specifies how to treat concurrent executions of a Job. Valid values are: - &#34;Allow&#34; (default): allows CronJobs to run concurrently; - &#34;Forbid&#34;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - &#34;Replace&#34;: cancels currently running job and replaces it with a new one
     * 
     */
    public Optional<String> concurrencyPolicy() {
        return Optional.ofNullable(this.concurrencyPolicy);
    }
    /**
     * @return The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    public Optional<Integer> failedJobsHistoryLimit() {
        return Optional.ofNullable(this.failedJobsHistoryLimit);
    }
    /**
     * @return Specifies the job that will be created when executing a CronJob.
     * 
     */
    public JobTemplateSpec jobTemplate() {
        return this.jobTemplate;
    }
    /**
     * @return The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     * 
     */
    public Optional<Integer> startingDeadlineSeconds() {
        return Optional.ofNullable(this.startingDeadlineSeconds);
    }
    /**
     * @return The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
     * 
     */
    public Optional<Integer> successfulJobsHistoryLimit() {
        return Optional.ofNullable(this.successfulJobsHistoryLimit);
    }
    /**
     * @return This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
     * 
     */
    public Optional<Boolean> suspend() {
        return Optional.ofNullable(this.suspend);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String concurrencyPolicy;
        private @Nullable Integer failedJobsHistoryLimit;
        private JobTemplateSpec jobTemplate;
        private String schedule;
        private @Nullable Integer startingDeadlineSeconds;
        private @Nullable Integer successfulJobsHistoryLimit;
        private @Nullable Boolean suspend;
        public Builder() {}
        public Builder(CronJobSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyPolicy = defaults.concurrencyPolicy;
    	      this.failedJobsHistoryLimit = defaults.failedJobsHistoryLimit;
    	      this.jobTemplate = defaults.jobTemplate;
    	      this.schedule = defaults.schedule;
    	      this.startingDeadlineSeconds = defaults.startingDeadlineSeconds;
    	      this.successfulJobsHistoryLimit = defaults.successfulJobsHistoryLimit;
    	      this.suspend = defaults.suspend;
        }

        @CustomType.Setter
        public Builder concurrencyPolicy(@Nullable String concurrencyPolicy) {

            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder failedJobsHistoryLimit(@Nullable Integer failedJobsHistoryLimit) {

            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }
        @CustomType.Setter
        public Builder jobTemplate(JobTemplateSpec jobTemplate) {
            if (jobTemplate == null) {
              throw new MissingRequiredPropertyException("CronJobSpec", "jobTemplate");
            }
            this.jobTemplate = jobTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            if (schedule == null) {
              throw new MissingRequiredPropertyException("CronJobSpec", "schedule");
            }
            this.schedule = schedule;
            return this;
        }
        @CustomType.Setter
        public Builder startingDeadlineSeconds(@Nullable Integer startingDeadlineSeconds) {

            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder successfulJobsHistoryLimit(@Nullable Integer successfulJobsHistoryLimit) {

            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }
        @CustomType.Setter
        public Builder suspend(@Nullable Boolean suspend) {

            this.suspend = suspend;
            return this;
        }
        public CronJobSpec build() {
            final var _resultValue = new CronJobSpec();
            _resultValue.concurrencyPolicy = concurrencyPolicy;
            _resultValue.failedJobsHistoryLimit = failedJobsHistoryLimit;
            _resultValue.jobTemplate = jobTemplate;
            _resultValue.schedule = schedule;
            _resultValue.startingDeadlineSeconds = startingDeadlineSeconds;
            _resultValue.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            _resultValue.suspend = suspend;
            return _resultValue;
        }
    }
}
