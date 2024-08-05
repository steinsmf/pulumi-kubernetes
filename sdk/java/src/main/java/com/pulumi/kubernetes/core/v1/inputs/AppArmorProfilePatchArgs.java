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
 * AppArmorProfile defines a pod or container&#39;s AppArmor settings.
 * 
 */
public final class AppArmorProfilePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppArmorProfilePatchArgs Empty = new AppArmorProfilePatchArgs();

    /**
     * localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is &#34;Localhost&#34;.
     * 
     */
    @Import(name="localhostProfile")
    private @Nullable Output<String> localhostProfile;

    /**
     * @return localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is &#34;Localhost&#34;.
     * 
     */
    public Optional<Output<String>> localhostProfile() {
        return Optional.ofNullable(this.localhostProfile);
    }

    /**
     * type indicates which kind of AppArmor profile will be applied. Valid options are:
     *   Localhost - a profile pre-loaded on the node.
     *   RuntimeDefault - the container runtime&#39;s default profile.
     *   Unconfined - no AppArmor enforcement.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return type indicates which kind of AppArmor profile will be applied. Valid options are:
     *   Localhost - a profile pre-loaded on the node.
     *   RuntimeDefault - the container runtime&#39;s default profile.
     *   Unconfined - no AppArmor enforcement.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AppArmorProfilePatchArgs() {}

    private AppArmorProfilePatchArgs(AppArmorProfilePatchArgs $) {
        this.localhostProfile = $.localhostProfile;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppArmorProfilePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppArmorProfilePatchArgs $;

        public Builder() {
            $ = new AppArmorProfilePatchArgs();
        }

        public Builder(AppArmorProfilePatchArgs defaults) {
            $ = new AppArmorProfilePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localhostProfile localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is &#34;Localhost&#34;.
         * 
         * @return builder
         * 
         */
        public Builder localhostProfile(@Nullable Output<String> localhostProfile) {
            $.localhostProfile = localhostProfile;
            return this;
        }

        /**
         * @param localhostProfile localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is &#34;Localhost&#34;.
         * 
         * @return builder
         * 
         */
        public Builder localhostProfile(String localhostProfile) {
            return localhostProfile(Output.of(localhostProfile));
        }

        /**
         * @param type type indicates which kind of AppArmor profile will be applied. Valid options are:
         *   Localhost - a profile pre-loaded on the node.
         *   RuntimeDefault - the container runtime&#39;s default profile.
         *   Unconfined - no AppArmor enforcement.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type type indicates which kind of AppArmor profile will be applied. Valid options are:
         *   Localhost - a profile pre-loaded on the node.
         *   RuntimeDefault - the container runtime&#39;s default profile.
         *   Unconfined - no AppArmor enforcement.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AppArmorProfilePatchArgs build() {
            return $;
        }
    }

}
