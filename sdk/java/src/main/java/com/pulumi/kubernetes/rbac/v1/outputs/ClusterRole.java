// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.rbac.v1.outputs.AggregationRule;
import com.pulumi.kubernetes.rbac.v1.outputs.PolicyRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRole {
    /**
     * @return AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    private @Nullable AggregationRule aggregationRule;
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    private @Nullable List<PolicyRule> rules;

    private ClusterRole() {}
    /**
     * @return AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    public Optional<AggregationRule> aggregationRule() {
        return Optional.ofNullable(this.aggregationRule);
    }
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    public List<PolicyRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AggregationRule aggregationRule;
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<PolicyRule> rules;
        public Builder() {}
        public Builder(ClusterRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationRule = defaults.aggregationRule;
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder aggregationRule(@Nullable AggregationRule aggregationRule) {

            this.aggregationRule = aggregationRule;
            return this;
        }
        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
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
        public Builder rules(@Nullable List<PolicyRule> rules) {

            this.rules = rules;
            return this;
        }
        public Builder rules(PolicyRule... rules) {
            return rules(List.of(rules));
        }
        public ClusterRole build() {
            final var _resultValue = new ClusterRole();
            _resultValue.aggregationRule = aggregationRule;
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
