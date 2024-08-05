// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrossVersionObjectReferencePatch {
    /**
     * @return API version of the referent
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds&#34;
     * 
     */
    private @Nullable String kind;
    /**
     * @return Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    private @Nullable String name;

    private CrossVersionObjectReferencePatch() {}
    /**
     * @return API version of the referent
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds&#34;
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrossVersionObjectReferencePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable String name;
        public Builder() {}
        public Builder(CrossVersionObjectReferencePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public CrossVersionObjectReferencePatch build() {
            final var _resultValue = new CrossVersionObjectReferencePatch();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
