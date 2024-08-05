// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class QuobyteVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final QuobyteVolumeSourceArgs Empty = new QuobyteVolumeSourceArgs();

    /**
     * group to map volume access to Default is no group
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return group to map volume access to Default is no group
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * 
     */
    @Import(name="registry", required=true)
    private Output<String> registry;

    /**
     * @return registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * 
     */
    public Output<String> registry() {
        return this.registry;
    }

    /**
     * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<String> tenant;

    /**
     * @return tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    public Optional<Output<String>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * user to map volume access to Defaults to serivceaccount user
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return user to map volume access to Defaults to serivceaccount user
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    /**
     * volume is a string that references an already created Quobyte volume by name.
     * 
     */
    @Import(name="volume", required=true)
    private Output<String> volume;

    /**
     * @return volume is a string that references an already created Quobyte volume by name.
     * 
     */
    public Output<String> volume() {
        return this.volume;
    }

    private QuobyteVolumeSourceArgs() {}

    private QuobyteVolumeSourceArgs(QuobyteVolumeSourceArgs $) {
        this.group = $.group;
        this.readOnly = $.readOnly;
        this.registry = $.registry;
        this.tenant = $.tenant;
        this.user = $.user;
        this.volume = $.volume;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QuobyteVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QuobyteVolumeSourceArgs $;

        public Builder() {
            $ = new QuobyteVolumeSourceArgs();
        }

        public Builder(QuobyteVolumeSourceArgs defaults) {
            $ = new QuobyteVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group group to map volume access to Default is no group
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group group to map volume access to Default is no group
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param readOnly readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param registry registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
         * 
         * @return builder
         * 
         */
        public Builder registry(Output<String> registry) {
            $.registry = registry;
            return this;
        }

        /**
         * @param registry registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
         * 
         * @return builder
         * 
         */
        public Builder registry(String registry) {
            return registry(Output.of(registry));
        }

        /**
         * @param tenant tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Output<String> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
         * 
         * @return builder
         * 
         */
        public Builder tenant(String tenant) {
            return tenant(Output.of(tenant));
        }

        /**
         * @param user user to map volume access to Defaults to serivceaccount user
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user user to map volume access to Defaults to serivceaccount user
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        /**
         * @param volume volume is a string that references an already created Quobyte volume by name.
         * 
         * @return builder
         * 
         */
        public Builder volume(Output<String> volume) {
            $.volume = volume;
            return this;
        }

        /**
         * @param volume volume is a string that references an already created Quobyte volume by name.
         * 
         * @return builder
         * 
         */
        public Builder volume(String volume) {
            return volume(Output.of(volume));
        }

        public QuobyteVolumeSourceArgs build() {
            if ($.registry == null) {
                throw new MissingRequiredPropertyException("QuobyteVolumeSourceArgs", "registry");
            }
            if ($.volume == null) {
                throw new MissingRequiredPropertyException("QuobyteVolumeSourceArgs", "volume");
            }
            return $;
        }
    }

}
