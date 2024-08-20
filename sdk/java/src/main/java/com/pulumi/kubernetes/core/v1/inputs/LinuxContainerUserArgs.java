// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LinuxContainerUser represents user identity information in Linux containers
 * 
 */
public final class LinuxContainerUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxContainerUserArgs Empty = new LinuxContainerUserArgs();

    /**
     * GID is the primary gid initially attached to the first process in the container
     * 
     */
    @Import(name="gid", required=true)
    private Output<Integer> gid;

    /**
     * @return GID is the primary gid initially attached to the first process in the container
     * 
     */
    public Output<Integer> gid() {
        return this.gid;
    }

    /**
     * SupplementalGroups are the supplemental groups initially attached to the first process in the container
     * 
     */
    @Import(name="supplementalGroups")
    private @Nullable Output<List<Integer>> supplementalGroups;

    /**
     * @return SupplementalGroups are the supplemental groups initially attached to the first process in the container
     * 
     */
    public Optional<Output<List<Integer>>> supplementalGroups() {
        return Optional.ofNullable(this.supplementalGroups);
    }

    /**
     * UID is the primary uid initially attached to the first process in the container
     * 
     */
    @Import(name="uid", required=true)
    private Output<Integer> uid;

    /**
     * @return UID is the primary uid initially attached to the first process in the container
     * 
     */
    public Output<Integer> uid() {
        return this.uid;
    }

    private LinuxContainerUserArgs() {}

    private LinuxContainerUserArgs(LinuxContainerUserArgs $) {
        this.gid = $.gid;
        this.supplementalGroups = $.supplementalGroups;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxContainerUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxContainerUserArgs $;

        public Builder() {
            $ = new LinuxContainerUserArgs();
        }

        public Builder(LinuxContainerUserArgs defaults) {
            $ = new LinuxContainerUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gid GID is the primary gid initially attached to the first process in the container
         * 
         * @return builder
         * 
         */
        public Builder gid(Output<Integer> gid) {
            $.gid = gid;
            return this;
        }

        /**
         * @param gid GID is the primary gid initially attached to the first process in the container
         * 
         * @return builder
         * 
         */
        public Builder gid(Integer gid) {
            return gid(Output.of(gid));
        }

        /**
         * @param supplementalGroups SupplementalGroups are the supplemental groups initially attached to the first process in the container
         * 
         * @return builder
         * 
         */
        public Builder supplementalGroups(@Nullable Output<List<Integer>> supplementalGroups) {
            $.supplementalGroups = supplementalGroups;
            return this;
        }

        /**
         * @param supplementalGroups SupplementalGroups are the supplemental groups initially attached to the first process in the container
         * 
         * @return builder
         * 
         */
        public Builder supplementalGroups(List<Integer> supplementalGroups) {
            return supplementalGroups(Output.of(supplementalGroups));
        }

        /**
         * @param supplementalGroups SupplementalGroups are the supplemental groups initially attached to the first process in the container
         * 
         * @return builder
         * 
         */
        public Builder supplementalGroups(Integer... supplementalGroups) {
            return supplementalGroups(List.of(supplementalGroups));
        }

        /**
         * @param uid UID is the primary uid initially attached to the first process in the container
         * 
         * @return builder
         * 
         */
        public Builder uid(Output<Integer> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid UID is the primary uid initially attached to the first process in the container
         * 
         * @return builder
         * 
         */
        public Builder uid(Integer uid) {
            return uid(Output.of(uid));
        }

        public LinuxContainerUserArgs build() {
            if ($.gid == null) {
                throw new MissingRequiredPropertyException("LinuxContainerUserArgs", "gid");
            }
            if ($.uid == null) {
                throw new MissingRequiredPropertyException("LinuxContainerUserArgs", "uid");
            }
            return $;
        }
    }

}