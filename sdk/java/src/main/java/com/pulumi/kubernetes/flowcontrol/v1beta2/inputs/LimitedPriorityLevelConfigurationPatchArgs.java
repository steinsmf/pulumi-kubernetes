// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.v1beta2.inputs.LimitResponsePatchArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
 *   - How are requests for this priority level limited?
 *   - What should be done with requests that exceed the limit?
 * 
 */
public final class LimitedPriorityLevelConfigurationPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final LimitedPriorityLevelConfigurationPatchArgs Empty = new LimitedPriorityLevelConfigurationPatchArgs();

    /**
     * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    @Import(name="assuredConcurrencyShares")
    private @Nullable Output<Integer> assuredConcurrencyShares;

    /**
     * @return `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    public Optional<Output<Integer>> assuredConcurrencyShares() {
        return Optional.ofNullable(this.assuredConcurrencyShares);
    }

    /**
     * `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.
     * 
     * BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )
     * 
     * The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.
     * 
     */
    @Import(name="borrowingLimitPercent")
    private @Nullable Output<Integer> borrowingLimitPercent;

    /**
     * @return `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.
     * 
     * BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )
     * 
     * The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.
     * 
     */
    public Optional<Output<Integer>> borrowingLimitPercent() {
        return Optional.ofNullable(this.borrowingLimitPercent);
    }

    /**
     * `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    @Import(name="lendablePercent")
    private @Nullable Output<Integer> lendablePercent;

    /**
     * @return `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    public Optional<Output<Integer>> lendablePercent() {
        return Optional.ofNullable(this.lendablePercent);
    }

    /**
     * `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    @Import(name="limitResponse")
    private @Nullable Output<LimitResponsePatchArgs> limitResponse;

    /**
     * @return `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    public Optional<Output<LimitResponsePatchArgs>> limitResponse() {
        return Optional.ofNullable(this.limitResponse);
    }

    private LimitedPriorityLevelConfigurationPatchArgs() {}

    private LimitedPriorityLevelConfigurationPatchArgs(LimitedPriorityLevelConfigurationPatchArgs $) {
        this.assuredConcurrencyShares = $.assuredConcurrencyShares;
        this.borrowingLimitPercent = $.borrowingLimitPercent;
        this.lendablePercent = $.lendablePercent;
        this.limitResponse = $.limitResponse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LimitedPriorityLevelConfigurationPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LimitedPriorityLevelConfigurationPatchArgs $;

        public Builder() {
            $ = new LimitedPriorityLevelConfigurationPatchArgs();
        }

        public Builder(LimitedPriorityLevelConfigurationPatchArgs defaults) {
            $ = new LimitedPriorityLevelConfigurationPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assuredConcurrencyShares `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
         * 
         *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
         * 
         * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
         * 
         * @return builder
         * 
         */
        public Builder assuredConcurrencyShares(@Nullable Output<Integer> assuredConcurrencyShares) {
            $.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }

        /**
         * @param assuredConcurrencyShares `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
         * 
         *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
         * 
         * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
         * 
         * @return builder
         * 
         */
        public Builder assuredConcurrencyShares(Integer assuredConcurrencyShares) {
            return assuredConcurrencyShares(Output.of(assuredConcurrencyShares));
        }

        /**
         * @param borrowingLimitPercent `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.
         * 
         * BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )
         * 
         * The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.
         * 
         * @return builder
         * 
         */
        public Builder borrowingLimitPercent(@Nullable Output<Integer> borrowingLimitPercent) {
            $.borrowingLimitPercent = borrowingLimitPercent;
            return this;
        }

        /**
         * @param borrowingLimitPercent `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.
         * 
         * BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )
         * 
         * The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.
         * 
         * @return builder
         * 
         */
        public Builder borrowingLimitPercent(Integer borrowingLimitPercent) {
            return borrowingLimitPercent(Output.of(borrowingLimitPercent));
        }

        /**
         * @param lendablePercent `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
         * 
         * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
         * 
         * @return builder
         * 
         */
        public Builder lendablePercent(@Nullable Output<Integer> lendablePercent) {
            $.lendablePercent = lendablePercent;
            return this;
        }

        /**
         * @param lendablePercent `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
         * 
         * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
         * 
         * @return builder
         * 
         */
        public Builder lendablePercent(Integer lendablePercent) {
            return lendablePercent(Output.of(lendablePercent));
        }

        /**
         * @param limitResponse `limitResponse` indicates what to do with requests that can not be executed right now
         * 
         * @return builder
         * 
         */
        public Builder limitResponse(@Nullable Output<LimitResponsePatchArgs> limitResponse) {
            $.limitResponse = limitResponse;
            return this;
        }

        /**
         * @param limitResponse `limitResponse` indicates what to do with requests that can not be executed right now
         * 
         * @return builder
         * 
         */
        public Builder limitResponse(LimitResponsePatchArgs limitResponse) {
            return limitResponse(Output.of(limitResponse));
        }

        public LimitedPriorityLevelConfigurationPatchArgs build() {
            return $;
        }
    }

}
