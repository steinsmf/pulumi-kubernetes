// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ExemptPriorityLevelConfiguration describes the configurable aspects of the handling of exempt requests. In the mandatory exempt configuration object the values in the fields here can be modified by authorized users, unlike the rest of the `spec`.
 * 
 */
public final class ExemptPriorityLevelConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExemptPriorityLevelConfigurationArgs Empty = new ExemptPriorityLevelConfigurationArgs();

    /**
     * `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    @Import(name="lendablePercent")
    private @Nullable Output<Integer> lendablePercent;

    /**
     * @return `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
     * 
     * LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )
     * 
     */
    public Optional<Output<Integer>> lendablePercent() {
        return Optional.ofNullable(this.lendablePercent);
    }

    /**
     * `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
     * 
     * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
     * 
     * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
     * 
     */
    @Import(name="nominalConcurrencyShares")
    private @Nullable Output<Integer> nominalConcurrencyShares;

    /**
     * @return `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
     * 
     * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
     * 
     * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
     * 
     */
    public Optional<Output<Integer>> nominalConcurrencyShares() {
        return Optional.ofNullable(this.nominalConcurrencyShares);
    }

    private ExemptPriorityLevelConfigurationArgs() {}

    private ExemptPriorityLevelConfigurationArgs(ExemptPriorityLevelConfigurationArgs $) {
        this.lendablePercent = $.lendablePercent;
        this.nominalConcurrencyShares = $.nominalConcurrencyShares;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExemptPriorityLevelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExemptPriorityLevelConfigurationArgs $;

        public Builder() {
            $ = new ExemptPriorityLevelConfigurationArgs();
        }

        public Builder(ExemptPriorityLevelConfigurationArgs defaults) {
            $ = new ExemptPriorityLevelConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lendablePercent `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
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
         * @param lendablePercent `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
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
         * @param nominalConcurrencyShares `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
         * 
         * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
         * 
         * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
         * 
         * @return builder
         * 
         */
        public Builder nominalConcurrencyShares(@Nullable Output<Integer> nominalConcurrencyShares) {
            $.nominalConcurrencyShares = nominalConcurrencyShares;
            return this;
        }

        /**
         * @param nominalConcurrencyShares `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
         * 
         * NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
         * 
         * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
         * 
         * @return builder
         * 
         */
        public Builder nominalConcurrencyShares(Integer nominalConcurrencyShares) {
            return nominalConcurrencyShares(Output.of(nominalConcurrencyShares));
        }

        public ExemptPriorityLevelConfigurationArgs build() {
            return $;
        }
    }

}
