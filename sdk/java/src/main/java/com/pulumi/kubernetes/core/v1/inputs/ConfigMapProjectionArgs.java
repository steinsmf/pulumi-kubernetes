// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.KeyToPathArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Adapts a ConfigMap into a projected volume.
 * 
 * The contents of the target ConfigMap&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
 * 
 */
public final class ConfigMapProjectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigMapProjectionArgs Empty = new ConfigMapProjectionArgs();

    /**
     * items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<KeyToPathArgs>> items;

    /**
     * @return items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
     * 
     */
    public Optional<Output<List<KeyToPathArgs>>> items() {
        return Optional.ofNullable(this.items);
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
     * optional specify whether the ConfigMap or its keys must be defined
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return optional specify whether the ConfigMap or its keys must be defined
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    private ConfigMapProjectionArgs() {}

    private ConfigMapProjectionArgs(ConfigMapProjectionArgs $) {
        this.items = $.items;
        this.name = $.name;
        this.optional = $.optional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigMapProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapProjectionArgs $;

        public Builder() {
            $ = new ConfigMapProjectionArgs();
        }

        public Builder(ConfigMapProjectionArgs defaults) {
            $ = new ConfigMapProjectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<KeyToPathArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
         * 
         * @return builder
         * 
         */
        public Builder items(List<KeyToPathArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
         * 
         * @return builder
         * 
         */
        public Builder items(KeyToPathArgs... items) {
            return items(List.of(items));
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
         * @param optional optional specify whether the ConfigMap or its keys must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional optional specify whether the ConfigMap or its keys must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        public ConfigMapProjectionArgs build() {
            return $;
        }
    }

}
