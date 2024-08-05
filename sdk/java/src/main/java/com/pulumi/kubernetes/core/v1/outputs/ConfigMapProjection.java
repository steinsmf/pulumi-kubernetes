// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.KeyToPath;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigMapProjection {
    /**
     * @return items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
     * 
     */
    private @Nullable List<KeyToPath> items;
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private @Nullable String name;
    /**
     * @return optional specify whether the ConfigMap or its keys must be defined
     * 
     */
    private @Nullable Boolean optional;

    private ConfigMapProjection() {}
    /**
     * @return items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
     * 
     */
    public List<KeyToPath> items() {
        return this.items == null ? List.of() : this.items;
    }
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return optional specify whether the ConfigMap or its keys must be defined
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapProjection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<KeyToPath> items;
        private @Nullable String name;
        private @Nullable Boolean optional;
        public Builder() {}
        public Builder(ConfigMapProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        @CustomType.Setter
        public Builder items(@Nullable List<KeyToPath> items) {

            this.items = items;
            return this;
        }
        public Builder items(KeyToPath... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder optional(@Nullable Boolean optional) {

            this.optional = optional;
            return this;
        }
        public ConfigMapProjection build() {
            final var _resultValue = new ConfigMapProjection();
            _resultValue.items = items;
            _resultValue.name = name;
            _resultValue.optional = optional;
            return _resultValue;
        }
    }
}
