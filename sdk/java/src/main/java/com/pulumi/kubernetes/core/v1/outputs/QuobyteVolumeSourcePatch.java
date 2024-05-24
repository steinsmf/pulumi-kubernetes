// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QuobyteVolumeSourcePatch {
    /**
     * @return group to map volume access to Default is no group
     * 
     */
    private @Nullable String group;
    /**
     * @return readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * 
     */
    private @Nullable String registry;
    /**
     * @return tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    private @Nullable String tenant;
    /**
     * @return user to map volume access to Defaults to serivceaccount user
     * 
     */
    private @Nullable String user;
    /**
     * @return volume is a string that references an already created Quobyte volume by name.
     * 
     */
    private @Nullable String volume;

    private QuobyteVolumeSourcePatch() {}
    /**
     * @return group to map volume access to Default is no group
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * 
     */
    public Optional<String> registry() {
        return Optional.ofNullable(this.registry);
    }
    /**
     * @return tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    public Optional<String> tenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * @return user to map volume access to Defaults to serivceaccount user
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }
    /**
     * @return volume is a string that references an already created Quobyte volume by name.
     * 
     */
    public Optional<String> volume() {
        return Optional.ofNullable(this.volume);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuobyteVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private @Nullable Boolean readOnly;
        private @Nullable String registry;
        private @Nullable String tenant;
        private @Nullable String user;
        private @Nullable String volume;
        public Builder() {}
        public Builder(QuobyteVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.readOnly = defaults.readOnly;
    	      this.registry = defaults.registry;
    	      this.tenant = defaults.tenant;
    	      this.user = defaults.user;
    	      this.volume = defaults.volume;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder registry(@Nullable String registry) {

            this.registry = registry;
            return this;
        }
        @CustomType.Setter
        public Builder tenant(@Nullable String tenant) {

            this.tenant = tenant;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder volume(@Nullable String volume) {

            this.volume = volume;
            return this;
        }
        public QuobyteVolumeSourcePatch build() {
            final var _resultValue = new QuobyteVolumeSourcePatch();
            _resultValue.group = group;
            _resultValue.readOnly = readOnly;
            _resultValue.registry = registry;
            _resultValue.tenant = tenant;
            _resultValue.user = user;
            _resultValue.volume = volume;
            return _resultValue;
        }
    }
}
