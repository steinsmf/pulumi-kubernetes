// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DEPRECATED.
 * 
 */
public final class RollbackConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RollbackConfigArgs Empty = new RollbackConfigArgs();

    /**
     * The revision to rollback to. If set to 0, rollback to the last revision.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<Integer> revision;

    /**
     * @return The revision to rollback to. If set to 0, rollback to the last revision.
     * 
     */
    public Optional<Output<Integer>> revision() {
        return Optional.ofNullable(this.revision);
    }

    private RollbackConfigArgs() {}

    private RollbackConfigArgs(RollbackConfigArgs $) {
        this.revision = $.revision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RollbackConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RollbackConfigArgs $;

        public Builder() {
            $ = new RollbackConfigArgs();
        }

        public Builder(RollbackConfigArgs defaults) {
            $ = new RollbackConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param revision The revision to rollback to. If set to 0, rollback to the last revision.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<Integer> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision The revision to rollback to. If set to 0, rollback to the last revision.
         * 
         * @return builder
         * 
         */
        public Builder revision(Integer revision) {
            return revision(Output.of(revision));
        }

        public RollbackConfigArgs build() {
            return $;
        }
    }

}
