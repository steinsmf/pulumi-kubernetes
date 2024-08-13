// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.inputs;

import com.google.gson.JsonElement;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OpaqueDeviceConfiguration contains configuration parameters for a driver in a format defined by the driver vendor.
 * 
 */
public final class OpaqueDeviceConfigurationPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpaqueDeviceConfigurationPatchArgs Empty = new OpaqueDeviceConfigurationPatchArgs();

    /**
     * Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.
     * 
     * An admission policy provided by the driver developer could use this to decide whether it needs to validate them.
     * 
     * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
     * 
     */
    @Import(name="driver")
    private @Nullable Output<String> driver;

    /**
     * @return Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.
     * 
     * An admission policy provided by the driver developer could use this to decide whether it needs to validate them.
     * 
     * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
     * 
     */
    public Optional<Output<String>> driver() {
        return Optional.ofNullable(this.driver);
    }

    /**
     * Parameters can contain arbitrary data. It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version (&#34;kind&#34; + &#34;apiVersion&#34; for Kubernetes types), with conversion between different versions.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<JsonElement> parameters;

    /**
     * @return Parameters can contain arbitrary data. It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version (&#34;kind&#34; + &#34;apiVersion&#34; for Kubernetes types), with conversion between different versions.
     * 
     */
    public Optional<Output<JsonElement>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private OpaqueDeviceConfigurationPatchArgs() {}

    private OpaqueDeviceConfigurationPatchArgs(OpaqueDeviceConfigurationPatchArgs $) {
        this.driver = $.driver;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpaqueDeviceConfigurationPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpaqueDeviceConfigurationPatchArgs $;

        public Builder() {
            $ = new OpaqueDeviceConfigurationPatchArgs();
        }

        public Builder(OpaqueDeviceConfigurationPatchArgs defaults) {
            $ = new OpaqueDeviceConfigurationPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param driver Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.
         * 
         * An admission policy provided by the driver developer could use this to decide whether it needs to validate them.
         * 
         * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
         * 
         * @return builder
         * 
         */
        public Builder driver(@Nullable Output<String> driver) {
            $.driver = driver;
            return this;
        }

        /**
         * @param driver Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.
         * 
         * An admission policy provided by the driver developer could use this to decide whether it needs to validate them.
         * 
         * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
         * 
         * @return builder
         * 
         */
        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        /**
         * @param parameters Parameters can contain arbitrary data. It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version (&#34;kind&#34; + &#34;apiVersion&#34; for Kubernetes types), with conversion between different versions.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<JsonElement> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters can contain arbitrary data. It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version (&#34;kind&#34; + &#34;apiVersion&#34; for Kubernetes types), with conversion between different versions.
         * 
         * @return builder
         * 
         */
        public Builder parameters(JsonElement parameters) {
            return parameters(Output.of(parameters));
        }

        public OpaqueDeviceConfigurationPatchArgs build() {
            return $;
        }
    }

}
