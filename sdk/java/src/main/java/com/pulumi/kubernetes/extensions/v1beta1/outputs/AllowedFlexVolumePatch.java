// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AllowedFlexVolumePatch {
    /**
     * @return driver is the name of the Flexvolume driver.
     * 
     */
    private @Nullable String driver;

    private AllowedFlexVolumePatch() {}
    /**
     * @return driver is the name of the Flexvolume driver.
     * 
     */
    public Optional<String> driver() {
        return Optional.ofNullable(this.driver);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedFlexVolumePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String driver;
        public Builder() {}
        public Builder(AllowedFlexVolumePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
        }

        @CustomType.Setter
        public Builder driver(@Nullable String driver) {

            this.driver = driver;
            return this;
        }
        public AllowedFlexVolumePatch build() {
            final var _resultValue = new AllowedFlexVolumePatch();
            _resultValue.driver = driver;
            return _resultValue;
        }
    }
}
