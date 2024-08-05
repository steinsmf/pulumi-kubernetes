// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.GroupSubject;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.ServiceAccountSubject;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.UserSubject;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Subject {
    /**
     * @return `group` matches based on user group name.
     * 
     */
    private @Nullable GroupSubject group;
    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    private String kind;
    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    private @Nullable ServiceAccountSubject serviceAccount;
    /**
     * @return `user` matches based on username.
     * 
     */
    private @Nullable UserSubject user;

    private Subject() {}
    /**
     * @return `group` matches based on user group name.
     * 
     */
    public Optional<GroupSubject> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    public Optional<ServiceAccountSubject> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * @return `user` matches based on username.
     * 
     */
    public Optional<UserSubject> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Subject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GroupSubject group;
        private String kind;
        private @Nullable ServiceAccountSubject serviceAccount;
        private @Nullable UserSubject user;
        public Builder() {}
        public Builder(Subject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder group(@Nullable GroupSubject group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("Subject", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(@Nullable ServiceAccountSubject serviceAccount) {

            this.serviceAccount = serviceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable UserSubject user) {

            this.user = user;
            return this;
        }
        public Subject build() {
            final var _resultValue = new Subject();
            _resultValue.group = group;
            _resultValue.kind = kind;
            _resultValue.serviceAccount = serviceAccount;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
