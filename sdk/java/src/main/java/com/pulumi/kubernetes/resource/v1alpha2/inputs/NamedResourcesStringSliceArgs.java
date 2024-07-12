// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * NamedResourcesStringSlice contains a slice of strings.
 * 
 */
public final class NamedResourcesStringSliceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamedResourcesStringSliceArgs Empty = new NamedResourcesStringSliceArgs();

    /**
     * Strings is the slice of strings.
     * 
     */
    @Import(name="strings", required=true)
    private Output<List<String>> strings;

    /**
     * @return Strings is the slice of strings.
     * 
     */
    public Output<List<String>> strings() {
        return this.strings;
    }

    private NamedResourcesStringSliceArgs() {}

    private NamedResourcesStringSliceArgs(NamedResourcesStringSliceArgs $) {
        this.strings = $.strings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedResourcesStringSliceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedResourcesStringSliceArgs $;

        public Builder() {
            $ = new NamedResourcesStringSliceArgs();
        }

        public Builder(NamedResourcesStringSliceArgs defaults) {
            $ = new NamedResourcesStringSliceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param strings Strings is the slice of strings.
         * 
         * @return builder
         * 
         */
        public Builder strings(Output<List<String>> strings) {
            $.strings = strings;
            return this;
        }

        /**
         * @param strings Strings is the slice of strings.
         * 
         * @return builder
         * 
         */
        public Builder strings(List<String> strings) {
            return strings(Output.of(strings));
        }

        /**
         * @param strings Strings is the slice of strings.
         * 
         * @return builder
         * 
         */
        public Builder strings(String... strings) {
            return strings(List.of(strings));
        }

        public NamedResourcesStringSliceArgs build() {
            if ($.strings == null) {
                throw new MissingRequiredPropertyException("NamedResourcesStringSliceArgs", "strings");
            }
            return $;
        }
    }

}