// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.v1beta3.inputs.GroupSubjectPatchArgs;
import com.pulumi.kubernetes.flowcontrol.v1beta3.inputs.ServiceAccountSubjectPatchArgs;
import com.pulumi.kubernetes.flowcontrol.v1beta3.inputs.UserSubjectPatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
 * 
 */
public final class SubjectPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubjectPatchArgs Empty = new SubjectPatchArgs();

    /**
     * `group` matches based on user group name.
     * 
     */
    @Import(name="group")
    private @Nullable Output<GroupSubjectPatchArgs> group;

    /**
     * @return `group` matches based on user group name.
     * 
     */
    public Optional<Output<GroupSubjectPatchArgs>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * `serviceAccount` matches ServiceAccounts.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<ServiceAccountSubjectPatchArgs> serviceAccount;

    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    public Optional<Output<ServiceAccountSubjectPatchArgs>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * `user` matches based on username.
     * 
     */
    @Import(name="user")
    private @Nullable Output<UserSubjectPatchArgs> user;

    /**
     * @return `user` matches based on username.
     * 
     */
    public Optional<Output<UserSubjectPatchArgs>> user() {
        return Optional.ofNullable(this.user);
    }

    private SubjectPatchArgs() {}

    private SubjectPatchArgs(SubjectPatchArgs $) {
        this.group = $.group;
        this.kind = $.kind;
        this.serviceAccount = $.serviceAccount;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubjectPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectPatchArgs $;

        public Builder() {
            $ = new SubjectPatchArgs();
        }

        public Builder(SubjectPatchArgs defaults) {
            $ = new SubjectPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group `group` matches based on user group name.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<GroupSubjectPatchArgs> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group `group` matches based on user group name.
         * 
         * @return builder
         * 
         */
        public Builder group(GroupSubjectPatchArgs group) {
            return group(Output.of(group));
        }

        /**
         * @param kind `kind` indicates which one of the other fields is non-empty. Required
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind `kind` indicates which one of the other fields is non-empty. Required
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param serviceAccount `serviceAccount` matches ServiceAccounts.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<ServiceAccountSubjectPatchArgs> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount `serviceAccount` matches ServiceAccounts.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(ServiceAccountSubjectPatchArgs serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param user `user` matches based on username.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<UserSubjectPatchArgs> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user `user` matches based on username.
         * 
         * @return builder
         * 
         */
        public Builder user(UserSubjectPatchArgs user) {
            return user(Output.of(user));
        }

        public SubjectPatchArgs build() {
            return $;
        }
    }

}
