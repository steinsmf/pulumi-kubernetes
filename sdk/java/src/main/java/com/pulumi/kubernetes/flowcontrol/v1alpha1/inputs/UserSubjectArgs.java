// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


/**
 * UserSubject holds detailed information for user-kind subject.
 * 
 */
public final class UserSubjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserSubjectArgs Empty = new UserSubjectArgs();

    /**
     * `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private UserSubjectArgs() {}

    private UserSubjectArgs(UserSubjectArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSubjectArgs $;

        public Builder() {
            $ = new UserSubjectArgs();
        }

        public Builder(UserSubjectArgs defaults) {
            $ = new UserSubjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public UserSubjectArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("UserSubjectArgs", "name");
            }
            return $;
        }
    }

}
