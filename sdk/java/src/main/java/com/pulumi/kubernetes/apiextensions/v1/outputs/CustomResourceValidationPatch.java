// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.v1.outputs.JSONSchemaPropsPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceValidationPatch {
    /**
     * @return openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
     * 
     */
    private @Nullable JSONSchemaPropsPatch openAPIV3Schema;

    private CustomResourceValidationPatch() {}
    /**
     * @return openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
     * 
     */
    public Optional<JSONSchemaPropsPatch> openAPIV3Schema() {
        return Optional.ofNullable(this.openAPIV3Schema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceValidationPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JSONSchemaPropsPatch openAPIV3Schema;
        public Builder() {}
        public Builder(CustomResourceValidationPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openAPIV3Schema = defaults.openAPIV3Schema;
        }

        @CustomType.Setter
        public Builder openAPIV3Schema(@Nullable JSONSchemaPropsPatch openAPIV3Schema) {

            this.openAPIV3Schema = openAPIV3Schema;
            return this;
        }
        public CustomResourceValidationPatch build() {
            final var _resultValue = new CustomResourceValidationPatch();
            _resultValue.openAPIV3Schema = openAPIV3Schema;
            return _resultValue;
        }
    }
}
