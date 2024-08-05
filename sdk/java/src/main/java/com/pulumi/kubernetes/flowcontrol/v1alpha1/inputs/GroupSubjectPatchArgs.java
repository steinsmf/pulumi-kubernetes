// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * GroupSubject holds detailed information for group-kind subject.
 * 
 */
public final class GroupSubjectPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupSubjectPatchArgs Empty = new GroupSubjectPatchArgs();

    /**
     * name is the user group that matches, or &#34;*&#34; to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name is the user group that matches, or &#34;*&#34; to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GroupSubjectPatchArgs() {}

    private GroupSubjectPatchArgs(GroupSubjectPatchArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupSubjectPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupSubjectPatchArgs $;

        public Builder() {
            $ = new GroupSubjectPatchArgs();
        }

        public Builder(GroupSubjectPatchArgs defaults) {
            $ = new GroupSubjectPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name name is the user group that matches, or &#34;*&#34; to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name is the user group that matches, or &#34;*&#34; to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GroupSubjectPatchArgs build() {
            return $;
        }
    }

}
