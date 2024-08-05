// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
            if (name == null) {
              throw new MissingRequiredPropertyException("UserSubject", "name");
            }
            this.name = name;
            return this;
        }
        public UserSubject build() {
            final var _resultValue = new UserSubject();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
