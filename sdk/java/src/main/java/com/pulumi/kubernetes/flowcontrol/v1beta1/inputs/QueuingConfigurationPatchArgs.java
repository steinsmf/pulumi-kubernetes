// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * QueuingConfiguration holds the configuration parameters for queuing
 * 
 */
public final class QueuingConfigurationPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueuingConfigurationPatchArgs Empty = new QueuingConfigurationPatchArgs();

    /**
     * `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     * 
     */
    @Import(name="handSize")
    private @Nullable Output<Integer> handSize;

    /**
     * @return `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     * 
     */
    public Optional<Output<Integer>> handSize() {
        return Optional.ofNullable(this.handSize);
    }

    /**
     * `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     * 
     */
    @Import(name="queueLengthLimit")
    private @Nullable Output<Integer> queueLengthLimit;

    /**
     * @return `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     * 
     */
    public Optional<Output<Integer>> queueLengthLimit() {
        return Optional.ofNullable(this.queueLengthLimit);
    }

    /**
     * `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     * 
     */
    @Import(name="queues")
    private @Nullable Output<Integer> queues;

    /**
     * @return `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     * 
     */
    public Optional<Output<Integer>> queues() {
        return Optional.ofNullable(this.queues);
    }

    private QueuingConfigurationPatchArgs() {}

    private QueuingConfigurationPatchArgs(QueuingConfigurationPatchArgs $) {
        this.handSize = $.handSize;
        this.queueLengthLimit = $.queueLengthLimit;
        this.queues = $.queues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueuingConfigurationPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueuingConfigurationPatchArgs $;

        public Builder() {
            $ = new QueuingConfigurationPatchArgs();
        }

        public Builder(QueuingConfigurationPatchArgs defaults) {
            $ = new QueuingConfigurationPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param handSize `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
         * 
         * @return builder
         * 
         */
        public Builder handSize(@Nullable Output<Integer> handSize) {
            $.handSize = handSize;
            return this;
        }

        /**
         * @param handSize `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
         * 
         * @return builder
         * 
         */
        public Builder handSize(Integer handSize) {
            return handSize(Output.of(handSize));
        }

        /**
         * @param queueLengthLimit `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
         * 
         * @return builder
         * 
         */
        public Builder queueLengthLimit(@Nullable Output<Integer> queueLengthLimit) {
            $.queueLengthLimit = queueLengthLimit;
            return this;
        }

        /**
         * @param queueLengthLimit `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
         * 
         * @return builder
         * 
         */
        public Builder queueLengthLimit(Integer queueLengthLimit) {
            return queueLengthLimit(Output.of(queueLengthLimit));
        }

        /**
         * @param queues `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
         * 
         * @return builder
         * 
         */
        public Builder queues(@Nullable Output<Integer> queues) {
            $.queues = queues;
            return this;
        }

        /**
         * @param queues `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
         * 
         * @return builder
         * 
         */
        public Builder queues(Integer queues) {
            return queues(Output.of(queues));
        }

        public QueuingConfigurationPatchArgs build() {
            return $;
        }
    }

}
