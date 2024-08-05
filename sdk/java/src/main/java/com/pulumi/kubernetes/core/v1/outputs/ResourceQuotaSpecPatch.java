// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ScopeSelectorPatch;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceQuotaSpecPatch {
    /**
     * @return hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
     */
    private @Nullable Map<String,String> hard;
    /**
     * @return scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
     * 
     */
    private @Nullable ScopeSelectorPatch scopeSelector;
    /**
     * @return A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
     * 
     */
    private @Nullable List<String> scopes;

    private ResourceQuotaSpecPatch() {}
    /**
     * @return hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
     */
    public Map<String,String> hard() {
        return this.hard == null ? Map.of() : this.hard;
    }
    /**
     * @return scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
     * 
     */
    public Optional<ScopeSelectorPatch> scopeSelector() {
        return Optional.ofNullable(this.scopeSelector);
    }
    /**
     * @return A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
     * 
     */
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceQuotaSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> hard;
        private @Nullable ScopeSelectorPatch scopeSelector;
        private @Nullable List<String> scopes;
        public Builder() {}
        public Builder(ResourceQuotaSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.scopeSelector = defaults.scopeSelector;
    	      this.scopes = defaults.scopes;
        }

        @CustomType.Setter
        public Builder hard(@Nullable Map<String,String> hard) {

            this.hard = hard;
            return this;
        }
        @CustomType.Setter
        public Builder scopeSelector(@Nullable ScopeSelectorPatch scopeSelector) {

            this.scopeSelector = scopeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(@Nullable List<String> scopes) {

            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public ResourceQuotaSpecPatch build() {
            final var _resultValue = new ResourceQuotaSpecPatch();
            _resultValue.hard = hard;
            _resultValue.scopeSelector = scopeSelector;
            _resultValue.scopes = scopes;
            return _resultValue;
        }
    }
}
