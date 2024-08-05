// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppArmorProfilePatch {
    /**
     * @return localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is &#34;Localhost&#34;.
     * 
     */
    private @Nullable String localhostProfile;
    /**
     * @return type indicates which kind of AppArmor profile will be applied. Valid options are:
     *   Localhost - a profile pre-loaded on the node.
     *   RuntimeDefault - the container runtime&#39;s default profile.
     *   Unconfined - no AppArmor enforcement.
     * 
     */
    private @Nullable String type;

    private AppArmorProfilePatch() {}
    /**
     * @return localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is &#34;Localhost&#34;.
     * 
     */
    public Optional<String> localhostProfile() {
        return Optional.ofNullable(this.localhostProfile);
    }
    /**
     * @return type indicates which kind of AppArmor profile will be applied. Valid options are:
     *   Localhost - a profile pre-loaded on the node.
     *   RuntimeDefault - the container runtime&#39;s default profile.
     *   Unconfined - no AppArmor enforcement.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArmorProfilePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String localhostProfile;
        private @Nullable String type;
        public Builder() {}
        public Builder(AppArmorProfilePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localhostProfile = defaults.localhostProfile;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder localhostProfile(@Nullable String localhostProfile) {

            this.localhostProfile = localhostProfile;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public AppArmorProfilePatch build() {
            final var _resultValue = new AppArmorProfilePatch();
            _resultValue.localhostProfile = localhostProfile;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
