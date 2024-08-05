// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.resource.v1alpha2.inputs.NamedResourcesIntSliceArgs;
import com.pulumi.kubernetes.resource.v1alpha2.inputs.NamedResourcesStringSliceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NamedResourcesAttribute is a combination of an attribute name and its value.
 * 
 */
public final class NamedResourcesAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamedResourcesAttributeArgs Empty = new NamedResourcesAttributeArgs();

    /**
     * BoolValue is a true/false value.
     * 
     */
    @Import(name="bool")
    private @Nullable Output<Boolean> bool;

    /**
     * @return BoolValue is a true/false value.
     * 
     */
    public Optional<Output<Boolean>> bool() {
        return Optional.ofNullable(this.bool);
    }

    /**
     * IntValue is a 64-bit integer.
     * 
     */
    @Import(name="int")
    private @Nullable Output<Integer> int_;

    /**
     * @return IntValue is a 64-bit integer.
     * 
     */
    public Optional<Output<Integer>> int_() {
        return Optional.ofNullable(this.int_);
    }

    /**
     * IntSliceValue is an array of 64-bit integers.
     * 
     */
    @Import(name="intSlice")
    private @Nullable Output<NamedResourcesIntSliceArgs> intSlice;

    /**
     * @return IntSliceValue is an array of 64-bit integers.
     * 
     */
    public Optional<Output<NamedResourcesIntSliceArgs>> intSlice() {
        return Optional.ofNullable(this.intSlice);
    }

    /**
     * Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * QuantityValue is a quantity.
     * 
     */
    @Import(name="quantity")
    private @Nullable Output<String> quantity;

    /**
     * @return QuantityValue is a quantity.
     * 
     */
    public Optional<Output<String>> quantity() {
        return Optional.ofNullable(this.quantity);
    }

    /**
     * StringValue is a string.
     * 
     */
    @Import(name="string")
    private @Nullable Output<String> string;

    /**
     * @return StringValue is a string.
     * 
     */
    public Optional<Output<String>> string() {
        return Optional.ofNullable(this.string);
    }

    /**
     * StringSliceValue is an array of strings.
     * 
     */
    @Import(name="stringSlice")
    private @Nullable Output<NamedResourcesStringSliceArgs> stringSlice;

    /**
     * @return StringSliceValue is an array of strings.
     * 
     */
    public Optional<Output<NamedResourcesStringSliceArgs>> stringSlice() {
        return Optional.ofNullable(this.stringSlice);
    }

    /**
     * VersionValue is a semantic version according to semver.org spec 2.0.0.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return VersionValue is a semantic version according to semver.org spec 2.0.0.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private NamedResourcesAttributeArgs() {}

    private NamedResourcesAttributeArgs(NamedResourcesAttributeArgs $) {
        this.bool = $.bool;
        this.int_ = $.int_;
        this.intSlice = $.intSlice;
        this.name = $.name;
        this.quantity = $.quantity;
        this.string = $.string;
        this.stringSlice = $.stringSlice;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedResourcesAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedResourcesAttributeArgs $;

        public Builder() {
            $ = new NamedResourcesAttributeArgs();
        }

        public Builder(NamedResourcesAttributeArgs defaults) {
            $ = new NamedResourcesAttributeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bool BoolValue is a true/false value.
         * 
         * @return builder
         * 
         */
        public Builder bool(@Nullable Output<Boolean> bool) {
            $.bool = bool;
            return this;
        }

        /**
         * @param bool BoolValue is a true/false value.
         * 
         * @return builder
         * 
         */
        public Builder bool(Boolean bool) {
            return bool(Output.of(bool));
        }

        /**
         * @param int_ IntValue is a 64-bit integer.
         * 
         * @return builder
         * 
         */
        public Builder int_(@Nullable Output<Integer> int_) {
            $.int_ = int_;
            return this;
        }

        /**
         * @param int_ IntValue is a 64-bit integer.
         * 
         * @return builder
         * 
         */
        public Builder int_(Integer int_) {
            return int_(Output.of(int_));
        }

        /**
         * @param intSlice IntSliceValue is an array of 64-bit integers.
         * 
         * @return builder
         * 
         */
        public Builder intSlice(@Nullable Output<NamedResourcesIntSliceArgs> intSlice) {
            $.intSlice = intSlice;
            return this;
        }

        /**
         * @param intSlice IntSliceValue is an array of 64-bit integers.
         * 
         * @return builder
         * 
         */
        public Builder intSlice(NamedResourcesIntSliceArgs intSlice) {
            return intSlice(Output.of(intSlice));
        }

        /**
         * @param name Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param quantity QuantityValue is a quantity.
         * 
         * @return builder
         * 
         */
        public Builder quantity(@Nullable Output<String> quantity) {
            $.quantity = quantity;
            return this;
        }

        /**
         * @param quantity QuantityValue is a quantity.
         * 
         * @return builder
         * 
         */
        public Builder quantity(String quantity) {
            return quantity(Output.of(quantity));
        }

        /**
         * @param string StringValue is a string.
         * 
         * @return builder
         * 
         */
        public Builder string(@Nullable Output<String> string) {
            $.string = string;
            return this;
        }

        /**
         * @param string StringValue is a string.
         * 
         * @return builder
         * 
         */
        public Builder string(String string) {
            return string(Output.of(string));
        }

        /**
         * @param stringSlice StringSliceValue is an array of strings.
         * 
         * @return builder
         * 
         */
        public Builder stringSlice(@Nullable Output<NamedResourcesStringSliceArgs> stringSlice) {
            $.stringSlice = stringSlice;
            return this;
        }

        /**
         * @param stringSlice StringSliceValue is an array of strings.
         * 
         * @return builder
         * 
         */
        public Builder stringSlice(NamedResourcesStringSliceArgs stringSlice) {
            return stringSlice(Output.of(stringSlice));
        }

        /**
         * @param version VersionValue is a semantic version according to semver.org spec 2.0.0.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version VersionValue is a semantic version according to semver.org spec 2.0.0.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public NamedResourcesAttributeArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("NamedResourcesAttributeArgs", "name");
            }
            return $;
        }
    }

}
