// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1beta3.outputs.LimitResponsePatch;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LimitedPriorityLevelConfigurationPatch {
    /**
     * @return `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.
     * 
     * BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )
     * 
     * The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.
     * 
     */
    private @Nullable Integer borrowingLimitPercent;
    /**
     * @return `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    private @Nullable Integer lendablePercent;
    /**
     * @return `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    private @Nullable LimitResponsePatch limitResponse;
    /**
     * @return `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats available at this priority level. This is used both for requests dispatched from this priority level as well as requests dispatched from other priority levels borrowing seats from this level. The server&#39;s concurrency limit (ServerCL) is divided among the Limited priority levels in proportion to their NCS values:
     * 
     * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[limited priority level k] NCS(k)
     * 
     * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other Limited priority level. This field has a default value of 30.
     * 
     */
    private @Nullable Integer nominalConcurrencyShares;

    private LimitedPriorityLevelConfigurationPatch() {}
    /**
     * @return `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.
     * 
     * BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )
     * 
     * The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.
     * 
     */
    public Optional<Integer> borrowingLimitPercent() {
        return Optional.ofNullable(this.borrowingLimitPercent);
    }
    /**
     * @return `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    public Optional<Integer> lendablePercent() {
        return Optional.ofNullable(this.lendablePercent);
    }
    /**
     * @return `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    public Optional<LimitResponsePatch> limitResponse() {
        return Optional.ofNullable(this.limitResponse);
    }
    /**
     * @return `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats available at this priority level. This is used both for requests dispatched from this priority level as well as requests dispatched from other priority levels borrowing seats from this level. The server&#39;s concurrency limit (ServerCL) is divided among the Limited priority levels in proportion to their NCS values:
     * 
     * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[limited priority level k] NCS(k)
     * 
     * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other Limited priority level. This field has a default value of 30.
     * 
     */
    public Optional<Integer> nominalConcurrencyShares() {
        return Optional.ofNullable(this.nominalConcurrencyShares);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitedPriorityLevelConfigurationPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer borrowingLimitPercent;
        private @Nullable Integer lendablePercent;
        private @Nullable LimitResponsePatch limitResponse;
        private @Nullable Integer nominalConcurrencyShares;
        public Builder() {}
        public Builder(LimitedPriorityLevelConfigurationPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.borrowingLimitPercent = defaults.borrowingLimitPercent;
    	      this.lendablePercent = defaults.lendablePercent;
    	      this.limitResponse = defaults.limitResponse;
    	      this.nominalConcurrencyShares = defaults.nominalConcurrencyShares;
        }

        @CustomType.Setter
        public Builder borrowingLimitPercent(@Nullable Integer borrowingLimitPercent) {
            this.borrowingLimitPercent = borrowingLimitPercent;
            return this;
        }
        @CustomType.Setter
        public Builder lendablePercent(@Nullable Integer lendablePercent) {
            this.lendablePercent = lendablePercent;
            return this;
        }
        @CustomType.Setter
        public Builder limitResponse(@Nullable LimitResponsePatch limitResponse) {
            this.limitResponse = limitResponse;
            return this;
        }
        @CustomType.Setter
        public Builder nominalConcurrencyShares(@Nullable Integer nominalConcurrencyShares) {
            this.nominalConcurrencyShares = nominalConcurrencyShares;
            return this;
        }
        public LimitedPriorityLevelConfigurationPatch build() {
            final var o = new LimitedPriorityLevelConfigurationPatch();
            o.borrowingLimitPercent = borrowingLimitPercent;
            o.lendablePercent = lendablePercent;
            o.limitResponse = limitResponse;
            o.nominalConcurrencyShares = nominalConcurrencyShares;
            return o;
        }
    }
}
