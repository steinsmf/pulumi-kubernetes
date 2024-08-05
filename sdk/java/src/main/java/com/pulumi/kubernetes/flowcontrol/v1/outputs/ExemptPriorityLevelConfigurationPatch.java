// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExemptPriorityLevelConfigurationPatch {
    /**
     * @return `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    private @Nullable Integer lendablePercent;
    /**
     * @return `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
     * 
     * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
     * 
     * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
     * 
     */
    private @Nullable Integer nominalConcurrencyShares;

    private ExemptPriorityLevelConfigurationPatch() {}
    /**
     * @return `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    public Optional<Integer> lendablePercent() {
        return Optional.ofNullable(this.lendablePercent);
    }
    /**
     * @return `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
     * 
     * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
     * 
     * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
     * 
     */
    public Optional<Integer> nominalConcurrencyShares() {
        return Optional.ofNullable(this.nominalConcurrencyShares);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExemptPriorityLevelConfigurationPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer lendablePercent;
        private @Nullable Integer nominalConcurrencyShares;
        public Builder() {}
        public Builder(ExemptPriorityLevelConfigurationPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lendablePercent = defaults.lendablePercent;
    	      this.nominalConcurrencyShares = defaults.nominalConcurrencyShares;
        }

        @CustomType.Setter
        public Builder lendablePercent(@Nullable Integer lendablePercent) {

            this.lendablePercent = lendablePercent;
            return this;
        }
        @CustomType.Setter
        public Builder nominalConcurrencyShares(@Nullable Integer nominalConcurrencyShares) {

            this.nominalConcurrencyShares = nominalConcurrencyShares;
            return this;
        }
        public ExemptPriorityLevelConfigurationPatch build() {
            final var _resultValue = new ExemptPriorityLevelConfigurationPatch();
            _resultValue.lendablePercent = lendablePercent;
            _resultValue.nominalConcurrencyShares = nominalConcurrencyShares;
            return _resultValue;
        }
    }
}
