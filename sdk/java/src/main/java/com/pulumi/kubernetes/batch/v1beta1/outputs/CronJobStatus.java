// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ObjectReference;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CronJobStatus {
    /**
     * @return A list of pointers to currently running jobs.
     * 
     */
    private @Nullable List<ObjectReference> active;
    /**
     * @return Information when was the last time the job was successfully scheduled.
     * 
     */
    private @Nullable String lastScheduleTime;

    private CronJobStatus() {}
    /**
     * @return A list of pointers to currently running jobs.
     * 
     */
    public List<ObjectReference> active() {
        return this.active == null ? List.of() : this.active;
    }
    /**
     * @return Information when was the last time the job was successfully scheduled.
     * 
     */
    public Optional<String> lastScheduleTime() {
        return Optional.ofNullable(this.lastScheduleTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ObjectReference> active;
        private @Nullable String lastScheduleTime;
        public Builder() {}
        public Builder(CronJobStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.lastScheduleTime = defaults.lastScheduleTime;
        }

        @CustomType.Setter
        public Builder active(@Nullable List<ObjectReference> active) {

            this.active = active;
            return this;
        }
        public Builder active(ObjectReference... active) {
            return active(List.of(active));
        }
        @CustomType.Setter
        public Builder lastScheduleTime(@Nullable String lastScheduleTime) {

            this.lastScheduleTime = lastScheduleTime;
            return this;
        }
        public CronJobStatus build() {
            final var _resultValue = new CronJobStatus();
            _resultValue.active = active;
            _resultValue.lastScheduleTime = lastScheduleTime;
            return _resultValue;
        }
    }
}
