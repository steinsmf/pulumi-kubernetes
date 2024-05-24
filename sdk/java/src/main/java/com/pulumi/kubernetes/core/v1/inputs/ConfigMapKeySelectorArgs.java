// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Selects a key from a ConfigMap.
 * 
 */
public final class ConfigMapKeySelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigMapKeySelectorArgs Empty = new ConfigMapKeySelectorArgs();

    /**
     * The key to select.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key to select.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify whether the ConfigMap or its key must be defined
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return Specify whether the ConfigMap or its key must be defined
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    private ConfigMapKeySelectorArgs() {}

    private ConfigMapKeySelectorArgs(ConfigMapKeySelectorArgs $) {
        this.key = $.key;
        this.name = $.name;
        this.optional = $.optional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigMapKeySelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapKeySelectorArgs $;

        public Builder() {
            $ = new ConfigMapKeySelectorArgs();
        }

        public Builder(ConfigMapKeySelectorArgs defaults) {
            $ = new ConfigMapKeySelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key to select.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key to select.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param optional Specify whether the ConfigMap or its key must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional Specify whether the ConfigMap or its key must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        public ConfigMapKeySelectorArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ConfigMapKeySelectorArgs", "key");
            }
            return $;
        }
    }

}
