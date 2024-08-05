// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ResourceClaim;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResourceRequirements {
    /**
     * @return Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable. It can only be set for containers.
     * 
     */
    private @Nullable List<ResourceClaim> claims;
    /**
     * @return Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    private @Nullable Map<String,String> limits;
    /**
     * @return Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    private @Nullable Map<String,String> requests;

    private ResourceRequirements() {}
    /**
     * @return Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable. It can only be set for containers.
     * 
     */
    public List<ResourceClaim> claims() {
        return this.claims == null ? List.of() : this.claims;
    }
    /**
     * @return Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    public Map<String,String> limits() {
        return this.limits == null ? Map.of() : this.limits;
    }
    /**
     * @return Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    public Map<String,String> requests() {
        return this.requests == null ? Map.of() : this.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirements defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ResourceClaim> claims;
        private @Nullable Map<String,String> limits;
        private @Nullable Map<String,String> requests;
        public Builder() {}
        public Builder(ResourceRequirements defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claims = defaults.claims;
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        @CustomType.Setter
        public Builder claims(@Nullable List<ResourceClaim> claims) {

            this.claims = claims;
            return this;
        }
        public Builder claims(ResourceClaim... claims) {
            return claims(List.of(claims));
        }
        @CustomType.Setter
        public Builder limits(@Nullable Map<String,String> limits) {

            this.limits = limits;
            return this;
        }
        @CustomType.Setter
        public Builder requests(@Nullable Map<String,String> requests) {

            this.requests = requests;
            return this;
        }
        public ResourceRequirements build() {
            final var _resultValue = new ResourceRequirements();
            _resultValue.claims = claims;
            _resultValue.limits = limits;
            _resultValue.requests = requests;
            return _resultValue;
        }
    }
}
