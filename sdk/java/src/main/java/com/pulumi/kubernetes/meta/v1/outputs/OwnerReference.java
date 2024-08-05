// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OwnerReference {
    /**
     * @return API version of the referent.
     * 
     */
    private String apiVersion;
    /**
     * @return If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    private @Nullable Boolean blockOwnerDeletion;
    /**
     * @return If true, this reference points to the managing controller.
     * 
     */
    private @Nullable Boolean controller;
    /**
     * @return Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private String kind;
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names
     * 
     */
    private String name;
    /**
     * @return UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
     * 
     */
    private String uid;

    private OwnerReference() {}
    /**
     * @return API version of the referent.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    /**
     * @return If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    public Optional<Boolean> blockOwnerDeletion() {
        return Optional.ofNullable(this.blockOwnerDeletion);
    }
    /**
     * @return If true, this reference points to the managing controller.
     * 
     */
    public Optional<Boolean> controller() {
        return Optional.ofNullable(this.controller);
    }
    /**
     * @return Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnerReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiVersion;
        private @Nullable Boolean blockOwnerDeletion;
        private @Nullable Boolean controller;
        private String kind;
        private String name;
        private String uid;
        public Builder() {}
        public Builder(OwnerReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.blockOwnerDeletion = defaults.blockOwnerDeletion;
    	      this.controller = defaults.controller;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            if (apiVersion == null) {
              throw new MissingRequiredPropertyException("OwnerReference", "apiVersion");
            }
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder blockOwnerDeletion(@Nullable Boolean blockOwnerDeletion) {

            this.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }
        @CustomType.Setter
        public Builder controller(@Nullable Boolean controller) {

            this.controller = controller;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("OwnerReference", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("OwnerReference", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            if (uid == null) {
              throw new MissingRequiredPropertyException("OwnerReference", "uid");
            }
            this.uid = uid;
            return this;
        }
        public OwnerReference build() {
            final var _resultValue = new OwnerReference();
            _resultValue.apiVersion = apiVersion;
            _resultValue.blockOwnerDeletion = blockOwnerDeletion;
            _resultValue.controller = controller;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
