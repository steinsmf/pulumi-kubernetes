// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinitionPatch;
import com.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresourcesPatch;
import com.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidationPatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceDefinitionVersionPatch {
    /**
     * @return additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
     * 
     */
    private @Nullable List<CustomResourceColumnDefinitionPatch> additionalPrinterColumns;
    /**
     * @return deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
     * 
     */
    private @Nullable Boolean deprecated;
    /**
     * @return deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
     * 
     */
    private @Nullable String deprecationWarning;
    /**
     * @return name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/&lt;group&gt;/&lt;version&gt;/...` if `served` is true.
     * 
     */
    private @Nullable String name;
    /**
     * @return schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
     * 
     */
    private @Nullable CustomResourceValidationPatch schema;
    /**
     * @return served is a flag enabling/disabling this version from being served via REST APIs
     * 
     */
    private @Nullable Boolean served;
    /**
     * @return storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
     * 
     */
    private @Nullable Boolean storage;
    /**
     * @return subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
     * 
     */
    private @Nullable CustomResourceSubresourcesPatch subresources;

    private CustomResourceDefinitionVersionPatch() {}
    /**
     * @return additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
     * 
     */
    public List<CustomResourceColumnDefinitionPatch> additionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? List.of() : this.additionalPrinterColumns;
    }
    /**
     * @return deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
     * 
     */
    public Optional<Boolean> deprecated() {
        return Optional.ofNullable(this.deprecated);
    }
    /**
     * @return deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
     * 
     */
    public Optional<String> deprecationWarning() {
        return Optional.ofNullable(this.deprecationWarning);
    }
    /**
     * @return name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/&lt;group&gt;/&lt;version&gt;/...` if `served` is true.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
     * 
     */
    public Optional<CustomResourceValidationPatch> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * @return served is a flag enabling/disabling this version from being served via REST APIs
     * 
     */
    public Optional<Boolean> served() {
        return Optional.ofNullable(this.served);
    }
    /**
     * @return storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
     * 
     */
    public Optional<Boolean> storage() {
        return Optional.ofNullable(this.storage);
    }
    /**
     * @return subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
     * 
     */
    public Optional<CustomResourceSubresourcesPatch> subresources() {
        return Optional.ofNullable(this.subresources);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionVersionPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CustomResourceColumnDefinitionPatch> additionalPrinterColumns;
        private @Nullable Boolean deprecated;
        private @Nullable String deprecationWarning;
        private @Nullable String name;
        private @Nullable CustomResourceValidationPatch schema;
        private @Nullable Boolean served;
        private @Nullable Boolean storage;
        private @Nullable CustomResourceSubresourcesPatch subresources;
        public Builder() {}
        public Builder(CustomResourceDefinitionVersionPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalPrinterColumns = defaults.additionalPrinterColumns;
    	      this.deprecated = defaults.deprecated;
    	      this.deprecationWarning = defaults.deprecationWarning;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
    	      this.served = defaults.served;
    	      this.storage = defaults.storage;
    	      this.subresources = defaults.subresources;
        }

        @CustomType.Setter
        public Builder additionalPrinterColumns(@Nullable List<CustomResourceColumnDefinitionPatch> additionalPrinterColumns) {

            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }
        public Builder additionalPrinterColumns(CustomResourceColumnDefinitionPatch... additionalPrinterColumns) {
            return additionalPrinterColumns(List.of(additionalPrinterColumns));
        }
        @CustomType.Setter
        public Builder deprecated(@Nullable Boolean deprecated) {

            this.deprecated = deprecated;
            return this;
        }
        @CustomType.Setter
        public Builder deprecationWarning(@Nullable String deprecationWarning) {

            this.deprecationWarning = deprecationWarning;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable CustomResourceValidationPatch schema) {

            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder served(@Nullable Boolean served) {

            this.served = served;
            return this;
        }
        @CustomType.Setter
        public Builder storage(@Nullable Boolean storage) {

            this.storage = storage;
            return this;
        }
        @CustomType.Setter
        public Builder subresources(@Nullable CustomResourceSubresourcesPatch subresources) {

            this.subresources = subresources;
            return this;
        }
        public CustomResourceDefinitionVersionPatch build() {
            final var _resultValue = new CustomResourceDefinitionVersionPatch();
            _resultValue.additionalPrinterColumns = additionalPrinterColumns;
            _resultValue.deprecated = deprecated;
            _resultValue.deprecationWarning = deprecationWarning;
            _resultValue.name = name;
            _resultValue.schema = schema;
            _resultValue.served = served;
            _resultValue.storage = storage;
            _resultValue.subresources = subresources;
            return _resultValue;
        }
    }
}
