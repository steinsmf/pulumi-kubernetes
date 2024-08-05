// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeDriverPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CSINodeSpecPatch {
    /**
     * @return drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
     * 
     */
    private @Nullable List<CSINodeDriverPatch> drivers;

    private CSINodeSpecPatch() {}
    /**
     * @return drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
     * 
     */
    public List<CSINodeDriverPatch> drivers() {
        return this.drivers == null ? List.of() : this.drivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CSINodeDriverPatch> drivers;
        public Builder() {}
        public Builder(CSINodeSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drivers = defaults.drivers;
        }

        @CustomType.Setter
        public Builder drivers(@Nullable List<CSINodeDriverPatch> drivers) {

            this.drivers = drivers;
            return this;
        }
        public Builder drivers(CSINodeDriverPatch... drivers) {
            return drivers(List.of(drivers));
        }
        public CSINodeSpecPatch build() {
            final var _resultValue = new CSINodeSpecPatch();
            _resultValue.drivers = drivers;
            return _resultValue;
        }
    }
}
