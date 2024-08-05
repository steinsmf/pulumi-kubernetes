// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigMapNodeConfigSource {
    /**
     * @return KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
     * 
     */
    private String kubeletConfigKey;
    /**
     * @return Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
     * 
     */
    private String name;
    /**
     * @return Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
     * 
     */
    private String namespace;
    /**
     * @return ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     * 
     */
    private @Nullable String resourceVersion;
    /**
     * @return UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     * 
     */
    private @Nullable String uid;

    private ConfigMapNodeConfigSource() {}
    /**
     * @return KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
     * 
     */
    public String kubeletConfigKey() {
        return this.kubeletConfigKey;
    }
    /**
     * @return Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     * 
     */
    public Optional<String> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }
    /**
     * @return UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapNodeConfigSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kubeletConfigKey;
        private String name;
        private String namespace;
        private @Nullable String resourceVersion;
        private @Nullable String uid;
        public Builder() {}
        public Builder(ConfigMapNodeConfigSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubeletConfigKey = defaults.kubeletConfigKey;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder kubeletConfigKey(String kubeletConfigKey) {
            if (kubeletConfigKey == null) {
              throw new MissingRequiredPropertyException("ConfigMapNodeConfigSource", "kubeletConfigKey");
            }
            this.kubeletConfigKey = kubeletConfigKey;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ConfigMapNodeConfigSource", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            if (namespace == null) {
              throw new MissingRequiredPropertyException("ConfigMapNodeConfigSource", "namespace");
            }
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder resourceVersion(@Nullable String resourceVersion) {

            this.resourceVersion = resourceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {

            this.uid = uid;
            return this;
        }
        public ConfigMapNodeConfigSource build() {
            final var _resultValue = new ConfigMapNodeConfigSource();
            _resultValue.kubeletConfigKey = kubeletConfigKey;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.resourceVersion = resourceVersion;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
