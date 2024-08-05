// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.networking.v1beta1.outputs.HTTPIngressPathPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class HTTPIngressRuleValuePatch {
    /**
     * @return A collection of paths that map requests to backends.
     * 
     */
    private @Nullable List<HTTPIngressPathPatch> paths;

    private HTTPIngressRuleValuePatch() {}
    /**
     * @return A collection of paths that map requests to backends.
     * 
     */
    public List<HTTPIngressPathPatch> paths() {
        return this.paths == null ? List.of() : this.paths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressRuleValuePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<HTTPIngressPathPatch> paths;
        public Builder() {}
        public Builder(HTTPIngressRuleValuePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        @CustomType.Setter
        public Builder paths(@Nullable List<HTTPIngressPathPatch> paths) {

            this.paths = paths;
            return this;
        }
        public Builder paths(HTTPIngressPathPatch... paths) {
            return paths(List.of(paths));
        }
        public HTTPIngressRuleValuePatch build() {
            final var _resultValue = new HTTPIngressRuleValuePatch();
            _resultValue.paths = paths;
            return _resultValue;
        }
    }
}
