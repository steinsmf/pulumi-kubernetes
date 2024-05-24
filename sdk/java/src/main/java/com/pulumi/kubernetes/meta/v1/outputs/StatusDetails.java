// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.StatusCause;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatusDetails {
    /**
     * @return The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
     * 
     */
    private @Nullable List<StatusCause> causes;
    /**
     * @return The group attribute of the resource associated with the status StatusReason.
     * 
     */
    private @Nullable String group;
    /**
     * @return The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     * 
     */
    private @Nullable String name;
    /**
     * @return If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     * 
     */
    private @Nullable Integer retryAfterSeconds;
    /**
     * @return UID of the resource. (when there is a single resource which can be described). More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
     * 
     */
    private @Nullable String uid;

    private StatusDetails() {}
    /**
     * @return The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
     * 
     */
    public List<StatusCause> causes() {
        return this.causes == null ? List.of() : this.causes;
    }
    /**
     * @return The group attribute of the resource associated with the status StatusReason.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     * 
     */
    public Optional<Integer> retryAfterSeconds() {
        return Optional.ofNullable(this.retryAfterSeconds);
    }
    /**
     * @return UID of the resource. (when there is a single resource which can be described). More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<StatusCause> causes;
        private @Nullable String group;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable Integer retryAfterSeconds;
        private @Nullable String uid;
        public Builder() {}
        public Builder(StatusDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.causes = defaults.causes;
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.retryAfterSeconds = defaults.retryAfterSeconds;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder causes(@Nullable List<StatusCause> causes) {

            this.causes = causes;
            return this;
        }
        public Builder causes(StatusCause... causes) {
            return causes(List.of(causes));
        }
        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder retryAfterSeconds(@Nullable Integer retryAfterSeconds) {

            this.retryAfterSeconds = retryAfterSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {

            this.uid = uid;
            return this;
        }
        public StatusDetails build() {
            final var _resultValue = new StatusDetails();
            _resultValue.causes = causes;
            _resultValue.group = group;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.retryAfterSeconds = retryAfterSeconds;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
