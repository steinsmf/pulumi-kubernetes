// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1beta2.outputs.LimitResponse;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LimitedPriorityLevelConfiguration {
    /**
     * @return `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    private @Nullable Integer assuredConcurrencyShares;
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
    private @Nullable LimitResponse limitResponse;

    private LimitedPriorityLevelConfiguration() {}
    /**
     * @return `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    public Optional<Integer> assuredConcurrencyShares() {
        return Optional.ofNullable(this.assuredConcurrencyShares);
    }
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
    public Optional<LimitResponse> limitResponse() {
        return Optional.ofNullable(this.limitResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitedPriorityLevelConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer assuredConcurrencyShares;
        private @Nullable Integer borrowingLimitPercent;
        private @Nullable Integer lendablePercent;
        private @Nullable LimitResponse limitResponse;
        public Builder() {}
        public Builder(LimitedPriorityLevelConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assuredConcurrencyShares = defaults.assuredConcurrencyShares;
    	      this.borrowingLimitPercent = defaults.borrowingLimitPercent;
    	      this.lendablePercent = defaults.lendablePercent;
    	      this.limitResponse = defaults.limitResponse;
        }

        @CustomType.Setter
        public Builder assuredConcurrencyShares(@Nullable Integer assuredConcurrencyShares) {

            this.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
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
        public Builder limitResponse(@Nullable LimitResponse limitResponse) {

            this.limitResponse = limitResponse;
            return this;
        }
        public LimitedPriorityLevelConfiguration build() {
            final var _resultValue = new LimitedPriorityLevelConfiguration();
            _resultValue.assuredConcurrencyShares = assuredConcurrencyShares;
            _resultValue.borrowingLimitPercent = borrowingLimitPercent;
            _resultValue.lendablePercent = lendablePercent;
            _resultValue.limitResponse = limitResponse;
            return _resultValue;
        }
    }
}
