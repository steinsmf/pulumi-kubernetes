// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodResourceClaimStatusPatch {
    /**
     * @return Name uniquely identifies this resource claim inside the pod. This must match the name of an entry in pod.spec.resourceClaims, which implies that the string must be a DNS_LABEL.
     * 
     */
    private @Nullable String name;
    /**
     * @return ResourceClaimName is the name of the ResourceClaim that was generated for the Pod in the namespace of the Pod. If this is unset, then generating a ResourceClaim was not necessary. The pod.spec.resourceClaims entry can be ignored in this case.
     * 
     */
    private @Nullable String resourceClaimName;

    private PodResourceClaimStatusPatch() {}
    /**
     * @return Name uniquely identifies this resource claim inside the pod. This must match the name of an entry in pod.spec.resourceClaims, which implies that the string must be a DNS_LABEL.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return ResourceClaimName is the name of the ResourceClaim that was generated for the Pod in the namespace of the Pod. If this is unset, then generating a ResourceClaim was not necessary. The pod.spec.resourceClaims entry can be ignored in this case.
     * 
     */
    public Optional<String> resourceClaimName() {
        return Optional.ofNullable(this.resourceClaimName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodResourceClaimStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String resourceClaimName;
        public Builder() {}
        public Builder(PodResourceClaimStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceClaimName = defaults.resourceClaimName;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceClaimName(@Nullable String resourceClaimName) {

            this.resourceClaimName = resourceClaimName;
            return this;
        }
        public PodResourceClaimStatusPatch build() {
            final var _resultValue = new PodResourceClaimStatusPatch();
            _resultValue.name = name;
            _resultValue.resourceClaimName = resourceClaimName;
            return _resultValue;
        }
    }
}
