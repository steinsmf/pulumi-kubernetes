// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserSubject {
    /**
     * @return `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
     * 
     */
    private String name;

    private UserSubject() {}
    /**
     * @return `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSubject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(UserSubject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public UserSubject build() {
            final var o = new UserSubject();
            o.name = name;
            return o;
        }
    }
}
