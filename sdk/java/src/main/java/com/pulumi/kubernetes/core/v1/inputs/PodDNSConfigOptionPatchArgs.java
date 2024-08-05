// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PodDNSConfigOption defines DNS resolver options of a pod.
 * 
 */
public final class PodDNSConfigOptionPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodDNSConfigOptionPatchArgs Empty = new PodDNSConfigOptionPatchArgs();

    /**
     * Required.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private PodDNSConfigOptionPatchArgs() {}

    private PodDNSConfigOptionPatchArgs(PodDNSConfigOptionPatchArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodDNSConfigOptionPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodDNSConfigOptionPatchArgs $;

        public Builder() {
            $ = new PodDNSConfigOptionPatchArgs();
        }

        public Builder(PodDNSConfigOptionPatchArgs defaults) {
            $ = new PodDNSConfigOptionPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Required.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public PodDNSConfigOptionPatchArgs build() {
            return $;
        }
    }

}
