// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeSelectorPatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AllocationResultPatch {
    /**
     * @return This field will get set by the resource driver after it has allocated the resource driver to inform the scheduler where it can schedule Pods using the ResourceClaim.
     * 
     * Setting this field is optional. If null, the resource is available everywhere.
     * 
     */
    private @Nullable NodeSelectorPatch availableOnNodes;
    /**
     * @return ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
     * 
     * The maximum size of this field is 16KiB. This may get increased in the future, but not reduced.
     * 
     */
    private @Nullable String resourceHandle;
    /**
     * @return Shareable determines whether the resource supports more than one consumer at a time.
     * 
     */
    private @Nullable Boolean shareable;

    private AllocationResultPatch() {}
    /**
     * @return This field will get set by the resource driver after it has allocated the resource driver to inform the scheduler where it can schedule Pods using the ResourceClaim.
     * 
     * Setting this field is optional. If null, the resource is available everywhere.
     * 
     */
    public Optional<NodeSelectorPatch> availableOnNodes() {
        return Optional.ofNullable(this.availableOnNodes);
    }
    /**
     * @return ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
     * 
     * The maximum size of this field is 16KiB. This may get increased in the future, but not reduced.
     * 
     */
    public Optional<String> resourceHandle() {
        return Optional.ofNullable(this.resourceHandle);
    }
    /**
     * @return Shareable determines whether the resource supports more than one consumer at a time.
     * 
     */
    public Optional<Boolean> shareable() {
        return Optional.ofNullable(this.shareable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationResultPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NodeSelectorPatch availableOnNodes;
        private @Nullable String resourceHandle;
        private @Nullable Boolean shareable;
        public Builder() {}
        public Builder(AllocationResultPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableOnNodes = defaults.availableOnNodes;
    	      this.resourceHandle = defaults.resourceHandle;
    	      this.shareable = defaults.shareable;
        }

        @CustomType.Setter
        public Builder availableOnNodes(@Nullable NodeSelectorPatch availableOnNodes) {

            this.availableOnNodes = availableOnNodes;
            return this;
        }
        @CustomType.Setter
        public Builder resourceHandle(@Nullable String resourceHandle) {

            this.resourceHandle = resourceHandle;
            return this;
        }
        @CustomType.Setter
        public Builder shareable(@Nullable Boolean shareable) {

            this.shareable = shareable;
            return this;
        }
        public AllocationResultPatch build() {
            final var _resultValue = new AllocationResultPatch();
            _resultValue.availableOnNodes = availableOnNodes;
            _resultValue.resourceHandle = resourceHandle;
            _resultValue.shareable = shareable;
            return _resultValue;
        }
    }
}
