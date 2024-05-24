// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
 * 
 */
public final class CustomResourceDefinitionNamesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionNamesArgs Empty = new CustomResourceDefinitionNamesArgs();

    /**
     * categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
     * 
     */
    @Import(name="categories")
    private @Nullable Output<List<String>> categories;

    /**
     * @return categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
     * 
     */
    public Optional<Output<List<String>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * listKind is the serialized kind of the list for this resource. Defaults to &#34;`kind`List&#34;.
     * 
     */
    @Import(name="listKind")
    private @Nullable Output<String> listKind;

    /**
     * @return listKind is the serialized kind of the list for this resource. Defaults to &#34;`kind`List&#34;.
     * 
     */
    public Optional<Output<String>> listKind() {
        return Optional.ofNullable(this.listKind);
    }

    /**
     * plural is the plural name of the resource to serve. The custom resources are served under `/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;`. Must match the name of the CustomResourceDefinition (in the form `&lt;names.plural&gt;.&lt;group&gt;`). Must be all lowercase.
     * 
     */
    @Import(name="plural", required=true)
    private Output<String> plural;

    /**
     * @return plural is the plural name of the resource to serve. The custom resources are served under `/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;`. Must match the name of the CustomResourceDefinition (in the form `&lt;names.plural&gt;.&lt;group&gt;`). Must be all lowercase.
     * 
     */
    public Output<String> plural() {
        return this.plural;
    }

    /**
     * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get &lt;shortname&gt;`. It must be all lowercase.
     * 
     */
    @Import(name="shortNames")
    private @Nullable Output<List<String>> shortNames;

    /**
     * @return shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get &lt;shortname&gt;`. It must be all lowercase.
     * 
     */
    public Optional<Output<List<String>>> shortNames() {
        return Optional.ofNullable(this.shortNames);
    }

    /**
     * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
     * 
     */
    @Import(name="singular")
    private @Nullable Output<String> singular;

    /**
     * @return singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
     * 
     */
    public Optional<Output<String>> singular() {
        return Optional.ofNullable(this.singular);
    }

    private CustomResourceDefinitionNamesArgs() {}

    private CustomResourceDefinitionNamesArgs(CustomResourceDefinitionNamesArgs $) {
        this.categories = $.categories;
        this.kind = $.kind;
        this.listKind = $.listKind;
        this.plural = $.plural;
        this.shortNames = $.shortNames;
        this.singular = $.singular;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceDefinitionNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceDefinitionNamesArgs $;

        public Builder() {
            $ = new CustomResourceDefinitionNamesArgs();
        }

        public Builder(CustomResourceDefinitionNamesArgs defaults) {
            $ = new CustomResourceDefinitionNamesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
         * 
         * @return builder
         * 
         */
        public Builder categories(@Nullable Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param kind kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param listKind listKind is the serialized kind of the list for this resource. Defaults to &#34;`kind`List&#34;.
         * 
         * @return builder
         * 
         */
        public Builder listKind(@Nullable Output<String> listKind) {
            $.listKind = listKind;
            return this;
        }

        /**
         * @param listKind listKind is the serialized kind of the list for this resource. Defaults to &#34;`kind`List&#34;.
         * 
         * @return builder
         * 
         */
        public Builder listKind(String listKind) {
            return listKind(Output.of(listKind));
        }

        /**
         * @param plural plural is the plural name of the resource to serve. The custom resources are served under `/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;`. Must match the name of the CustomResourceDefinition (in the form `&lt;names.plural&gt;.&lt;group&gt;`). Must be all lowercase.
         * 
         * @return builder
         * 
         */
        public Builder plural(Output<String> plural) {
            $.plural = plural;
            return this;
        }

        /**
         * @param plural plural is the plural name of the resource to serve. The custom resources are served under `/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;`. Must match the name of the CustomResourceDefinition (in the form `&lt;names.plural&gt;.&lt;group&gt;`). Must be all lowercase.
         * 
         * @return builder
         * 
         */
        public Builder plural(String plural) {
            return plural(Output.of(plural));
        }

        /**
         * @param shortNames shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get &lt;shortname&gt;`. It must be all lowercase.
         * 
         * @return builder
         * 
         */
        public Builder shortNames(@Nullable Output<List<String>> shortNames) {
            $.shortNames = shortNames;
            return this;
        }

        /**
         * @param shortNames shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get &lt;shortname&gt;`. It must be all lowercase.
         * 
         * @return builder
         * 
         */
        public Builder shortNames(List<String> shortNames) {
            return shortNames(Output.of(shortNames));
        }

        /**
         * @param shortNames shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get &lt;shortname&gt;`. It must be all lowercase.
         * 
         * @return builder
         * 
         */
        public Builder shortNames(String... shortNames) {
            return shortNames(List.of(shortNames));
        }

        /**
         * @param singular singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
         * 
         * @return builder
         * 
         */
        public Builder singular(@Nullable Output<String> singular) {
            $.singular = singular;
            return this;
        }

        /**
         * @param singular singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
         * 
         * @return builder
         * 
         */
        public Builder singular(String singular) {
            return singular(Output.of(singular));
        }

        public CustomResourceDefinitionNamesArgs build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("CustomResourceDefinitionNamesArgs", "kind");
            }
            if ($.plural == null) {
                throw new MissingRequiredPropertyException("CustomResourceDefinitionNamesArgs", "plural");
            }
            return $;
        }
    }

}
