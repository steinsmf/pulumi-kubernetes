// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.resource.v1alpha1.inputs.AllocationResultArgs;
import com.pulumi.kubernetes.resource.v1alpha1.inputs.ResourceClaimConsumerReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
 * 
 */
public final class ResourceClaimStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceClaimStatusArgs Empty = new ResourceClaimStatusArgs();

    /**
     * Allocation is set by the resource driver once a resource has been allocated successfully. If this is not specified, the resource is not yet allocated.
     * 
     */
    @Import(name="allocation")
    private @Nullable Output<AllocationResultArgs> allocation;

    /**
     * @return Allocation is set by the resource driver once a resource has been allocated successfully. If this is not specified, the resource is not yet allocated.
     * 
     */
    public Optional<Output<AllocationResultArgs>> allocation() {
        return Optional.ofNullable(this.allocation);
    }

    /**
     * DeallocationRequested indicates that a ResourceClaim is to be deallocated.
     * 
     * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
     * 
     * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
     * 
     */
    @Import(name="deallocationRequested")
    private @Nullable Output<Boolean> deallocationRequested;

    /**
     * @return DeallocationRequested indicates that a ResourceClaim is to be deallocated.
     * 
     * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
     * 
     * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
     * 
     */
    public Optional<Output<Boolean>> deallocationRequested() {
        return Optional.ofNullable(this.deallocationRequested);
    }

    /**
     * DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
     * 
     */
    @Import(name="driverName")
    private @Nullable Output<String> driverName;

    /**
     * @return DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
     * 
     */
    public Optional<Output<String>> driverName() {
        return Optional.ofNullable(this.driverName);
    }

    /**
     * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
     * 
     * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
     * 
     */
    @Import(name="reservedFor")
    private @Nullable Output<List<ResourceClaimConsumerReferenceArgs>> reservedFor;

    /**
     * @return ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
     * 
     * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
     * 
     */
    public Optional<Output<List<ResourceClaimConsumerReferenceArgs>>> reservedFor() {
        return Optional.ofNullable(this.reservedFor);
    }

    private ResourceClaimStatusArgs() {}

    private ResourceClaimStatusArgs(ResourceClaimStatusArgs $) {
        this.allocation = $.allocation;
        this.deallocationRequested = $.deallocationRequested;
        this.driverName = $.driverName;
        this.reservedFor = $.reservedFor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceClaimStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceClaimStatusArgs $;

        public Builder() {
            $ = new ResourceClaimStatusArgs();
        }

        public Builder(ResourceClaimStatusArgs defaults) {
            $ = new ResourceClaimStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocation Allocation is set by the resource driver once a resource has been allocated successfully. If this is not specified, the resource is not yet allocated.
         * 
         * @return builder
         * 
         */
        public Builder allocation(@Nullable Output<AllocationResultArgs> allocation) {
            $.allocation = allocation;
            return this;
        }

        /**
         * @param allocation Allocation is set by the resource driver once a resource has been allocated successfully. If this is not specified, the resource is not yet allocated.
         * 
         * @return builder
         * 
         */
        public Builder allocation(AllocationResultArgs allocation) {
            return allocation(Output.of(allocation));
        }

        /**
         * @param deallocationRequested DeallocationRequested indicates that a ResourceClaim is to be deallocated.
         * 
         * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
         * 
         * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
         * 
         * @return builder
         * 
         */
        public Builder deallocationRequested(@Nullable Output<Boolean> deallocationRequested) {
            $.deallocationRequested = deallocationRequested;
            return this;
        }

        /**
         * @param deallocationRequested DeallocationRequested indicates that a ResourceClaim is to be deallocated.
         * 
         * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
         * 
         * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
         * 
         * @return builder
         * 
         */
        public Builder deallocationRequested(Boolean deallocationRequested) {
            return deallocationRequested(Output.of(deallocationRequested));
        }

        /**
         * @param driverName DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
         * 
         * @return builder
         * 
         */
        public Builder driverName(@Nullable Output<String> driverName) {
            $.driverName = driverName;
            return this;
        }

        /**
         * @param driverName DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
         * 
         * @return builder
         * 
         */
        public Builder driverName(String driverName) {
            return driverName(Output.of(driverName));
        }

        /**
         * @param reservedFor ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
         * 
         * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
         * 
         * @return builder
         * 
         */
        public Builder reservedFor(@Nullable Output<List<ResourceClaimConsumerReferenceArgs>> reservedFor) {
            $.reservedFor = reservedFor;
            return this;
        }

        /**
         * @param reservedFor ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
         * 
         * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
         * 
         * @return builder
         * 
         */
        public Builder reservedFor(List<ResourceClaimConsumerReferenceArgs> reservedFor) {
            return reservedFor(Output.of(reservedFor));
        }

        /**
         * @param reservedFor ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
         * 
         * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
         * 
         * @return builder
         * 
         */
        public Builder reservedFor(ResourceClaimConsumerReferenceArgs... reservedFor) {
            return reservedFor(List.of(reservedFor));
        }

        public ResourceClaimStatusArgs build() {
            return $;
        }
    }

}
