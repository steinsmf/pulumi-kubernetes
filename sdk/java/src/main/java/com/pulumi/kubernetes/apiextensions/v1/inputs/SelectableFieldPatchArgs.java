// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SelectableField specifies the JSON path of a field that may be used with field selectors.
 * 
 */
public final class SelectableFieldPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SelectableFieldPatchArgs Empty = new SelectableFieldPatchArgs();

    /**
     * jsonPath is a simple JSON path which is evaluated against each custom resource to produce a field selector value. Only JSON paths without the array notation are allowed. Must point to a field of type string, boolean or integer. Types with enum values and strings with formats are allowed. If jsonPath refers to absent field in a resource, the jsonPath evaluates to an empty string. Must not point to metdata fields. Required.
     * 
     */
    @Import(name="jsonPath")
    private @Nullable Output<String> jsonPath;

    /**
     * @return jsonPath is a simple JSON path which is evaluated against each custom resource to produce a field selector value. Only JSON paths without the array notation are allowed. Must point to a field of type string, boolean or integer. Types with enum values and strings with formats are allowed. If jsonPath refers to absent field in a resource, the jsonPath evaluates to an empty string. Must not point to metdata fields. Required.
     * 
     */
    public Optional<Output<String>> jsonPath() {
        return Optional.ofNullable(this.jsonPath);
    }

    private SelectableFieldPatchArgs() {}

    private SelectableFieldPatchArgs(SelectableFieldPatchArgs $) {
        this.jsonPath = $.jsonPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SelectableFieldPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SelectableFieldPatchArgs $;

        public Builder() {
            $ = new SelectableFieldPatchArgs();
        }

        public Builder(SelectableFieldPatchArgs defaults) {
            $ = new SelectableFieldPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jsonPath jsonPath is a simple JSON path which is evaluated against each custom resource to produce a field selector value. Only JSON paths without the array notation are allowed. Must point to a field of type string, boolean or integer. Types with enum values and strings with formats are allowed. If jsonPath refers to absent field in a resource, the jsonPath evaluates to an empty string. Must not point to metdata fields. Required.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(@Nullable Output<String> jsonPath) {
            $.jsonPath = jsonPath;
            return this;
        }

        /**
         * @param jsonPath jsonPath is a simple JSON path which is evaluated against each custom resource to produce a field selector value. Only JSON paths without the array notation are allowed. Must point to a field of type string, boolean or integer. Types with enum values and strings with formats are allowed. If jsonPath refers to absent field in a resource, the jsonPath evaluates to an empty string. Must not point to metdata fields. Required.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(String jsonPath) {
            return jsonPath(Output.of(jsonPath));
        }

        public SelectableFieldPatchArgs build() {
            return $;
        }
    }

}
