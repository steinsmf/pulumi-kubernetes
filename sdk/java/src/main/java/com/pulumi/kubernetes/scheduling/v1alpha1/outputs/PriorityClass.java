// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.scheduling.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PriorityClass {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
     */
    private @Nullable String description;
    /**
     * @return globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
     */
    private @Nullable Boolean globalDefault;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
     * 
     */
    private @Nullable String preemptionPolicy;
    /**
     * @return The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * 
     */
    private Integer value;

    private PriorityClass() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
     */
    public Optional<Boolean> globalDefault() {
        return Optional.ofNullable(this.globalDefault);
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
     * 
     */
    public Optional<String> preemptionPolicy() {
        return Optional.ofNullable(this.preemptionPolicy);
    }
    /**
     * @return The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * 
     */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String description;
        private @Nullable Boolean globalDefault;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable String preemptionPolicy;
        private Integer value;
        public Builder() {}
        public Builder(PriorityClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.description = defaults.description;
    	      this.globalDefault = defaults.globalDefault;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.preemptionPolicy = defaults.preemptionPolicy;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder globalDefault(@Nullable Boolean globalDefault) {

            this.globalDefault = globalDefault;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ObjectMeta metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder preemptionPolicy(@Nullable String preemptionPolicy) {

            this.preemptionPolicy = preemptionPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("PriorityClass", "value");
            }
            this.value = value;
            return this;
        }
        public PriorityClass build() {
            final var _resultValue = new PriorityClass();
            _resultValue.apiVersion = apiVersion;
            _resultValue.description = description;
            _resultValue.globalDefault = globalDefault;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.preemptionPolicy = preemptionPolicy;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
