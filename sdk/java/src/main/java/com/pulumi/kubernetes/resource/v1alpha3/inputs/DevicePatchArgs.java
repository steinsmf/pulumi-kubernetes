// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.resource.v1alpha3.inputs.BasicDevicePatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Device represents one individual hardware instance that can be selected based on its attributes. Besides the name, exactly one field must be set.
 * 
 */
public final class DevicePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePatchArgs Empty = new DevicePatchArgs();

    /**
     * Basic defines one device instance.
     * 
     */
    @Import(name="basic")
    private @Nullable Output<BasicDevicePatchArgs> basic;

    /**
     * @return Basic defines one device instance.
     * 
     */
    public Optional<Output<BasicDevicePatchArgs>> basic() {
        return Optional.ofNullable(this.basic);
    }

    /**
     * Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DevicePatchArgs() {}

    private DevicePatchArgs(DevicePatchArgs $) {
        this.basic = $.basic;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePatchArgs $;

        public Builder() {
            $ = new DevicePatchArgs();
        }

        public Builder(DevicePatchArgs defaults) {
            $ = new DevicePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basic Basic defines one device instance.
         * 
         * @return builder
         * 
         */
        public Builder basic(@Nullable Output<BasicDevicePatchArgs> basic) {
            $.basic = basic;
            return this;
        }

        /**
         * @param basic Basic defines one device instance.
         * 
         * @return builder
         * 
         */
        public Builder basic(BasicDevicePatchArgs basic) {
            return basic(Output.of(basic));
        }

        /**
         * @param name Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DevicePatchArgs build() {
            return $;
        }
    }

}
