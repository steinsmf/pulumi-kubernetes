// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ConfigMapKeySelectorPatch;
import com.pulumi.kubernetes.core.v1.outputs.ObjectFieldSelectorPatch;
import com.pulumi.kubernetes.core.v1.outputs.ResourceFieldSelectorPatch;
import com.pulumi.kubernetes.core.v1.outputs.SecretKeySelectorPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvVarSourcePatch {
    /**
     * @return Selects a key of a ConfigMap.
     * 
     */
    private @Nullable ConfigMapKeySelectorPatch configMapKeyRef;
    /**
     * @return Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels[&#39;&lt;KEY&gt;&#39;]`, `metadata.annotations[&#39;&lt;KEY&gt;&#39;]`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    private @Nullable ObjectFieldSelectorPatch fieldRef;
    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    private @Nullable ResourceFieldSelectorPatch resourceFieldRef;
    /**
     * @return Selects a key of a secret in the pod&#39;s namespace
     * 
     */
    private @Nullable SecretKeySelectorPatch secretKeyRef;

    private EnvVarSourcePatch() {}
    /**
     * @return Selects a key of a ConfigMap.
     * 
     */
    public Optional<ConfigMapKeySelectorPatch> configMapKeyRef() {
        return Optional.ofNullable(this.configMapKeyRef);
    }
    /**
     * @return Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels[&#39;&lt;KEY&gt;&#39;]`, `metadata.annotations[&#39;&lt;KEY&gt;&#39;]`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    public Optional<ObjectFieldSelectorPatch> fieldRef() {
        return Optional.ofNullable(this.fieldRef);
    }
    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    public Optional<ResourceFieldSelectorPatch> resourceFieldRef() {
        return Optional.ofNullable(this.resourceFieldRef);
    }
    /**
     * @return Selects a key of a secret in the pod&#39;s namespace
     * 
     */
    public Optional<SecretKeySelectorPatch> secretKeyRef() {
        return Optional.ofNullable(this.secretKeyRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConfigMapKeySelectorPatch configMapKeyRef;
        private @Nullable ObjectFieldSelectorPatch fieldRef;
        private @Nullable ResourceFieldSelectorPatch resourceFieldRef;
        private @Nullable SecretKeySelectorPatch secretKeyRef;
        public Builder() {}
        public Builder(EnvVarSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.fieldRef = defaults.fieldRef;
    	      this.resourceFieldRef = defaults.resourceFieldRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        @CustomType.Setter
        public Builder configMapKeyRef(@Nullable ConfigMapKeySelectorPatch configMapKeyRef) {

            this.configMapKeyRef = configMapKeyRef;
            return this;
        }
        @CustomType.Setter
        public Builder fieldRef(@Nullable ObjectFieldSelectorPatch fieldRef) {

            this.fieldRef = fieldRef;
            return this;
        }
        @CustomType.Setter
        public Builder resourceFieldRef(@Nullable ResourceFieldSelectorPatch resourceFieldRef) {

            this.resourceFieldRef = resourceFieldRef;
            return this;
        }
        @CustomType.Setter
        public Builder secretKeyRef(@Nullable SecretKeySelectorPatch secretKeyRef) {

            this.secretKeyRef = secretKeyRef;
            return this;
        }
        public EnvVarSourcePatch build() {
            final var _resultValue = new EnvVarSourcePatch();
            _resultValue.configMapKeyRef = configMapKeyRef;
            _resultValue.fieldRef = fieldRef;
            _resultValue.resourceFieldRef = resourceFieldRef;
            _resultValue.secretKeyRef = secretKeyRef;
            return _resultValue;
        }
    }
}
