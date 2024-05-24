// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PersistentVolumeClaimVolumeSource {
    /**
     * @return claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    private String claimName;
    /**
     * @return readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    private @Nullable Boolean readOnly;

    private PersistentVolumeClaimVolumeSource() {}
    /**
     * @return claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    public String claimName() {
        return this.claimName;
    }
    /**
     * @return readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String claimName;
        private @Nullable Boolean readOnly;
        public Builder() {}
        public Builder(PersistentVolumeClaimVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimName = defaults.claimName;
    	      this.readOnly = defaults.readOnly;
        }

        @CustomType.Setter
        public Builder claimName(String claimName) {
            if (claimName == null) {
              throw new MissingRequiredPropertyException("PersistentVolumeClaimVolumeSource", "claimName");
            }
            this.claimName = claimName;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        public PersistentVolumeClaimVolumeSource build() {
            final var _resultValue = new PersistentVolumeClaimVolumeSource();
            _resultValue.claimName = claimName;
            _resultValue.readOnly = readOnly;
            return _resultValue;
        }
    }
}
