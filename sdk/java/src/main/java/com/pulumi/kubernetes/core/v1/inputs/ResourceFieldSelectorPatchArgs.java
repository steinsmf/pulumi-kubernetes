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
 * ResourceFieldSelector represents container resources (cpu, memory) and their output format
 * 
 */
public final class ResourceFieldSelectorPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceFieldSelectorPatchArgs Empty = new ResourceFieldSelectorPatchArgs();

    /**
     * Container name: required for volumes, optional for env vars
     * 
     */
    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    /**
     * @return Container name: required for volumes, optional for env vars
     * 
     */
    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * Specifies the output format of the exposed resources, defaults to &#34;1&#34;
     * 
     */
    @Import(name="divisor")
    private @Nullable Output<String> divisor;

    /**
     * @return Specifies the output format of the exposed resources, defaults to &#34;1&#34;
     * 
     */
    public Optional<Output<String>> divisor() {
        return Optional.ofNullable(this.divisor);
    }

    /**
     * Required: resource to select
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return Required: resource to select
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    private ResourceFieldSelectorPatchArgs() {}

    private ResourceFieldSelectorPatchArgs(ResourceFieldSelectorPatchArgs $) {
        this.containerName = $.containerName;
        this.divisor = $.divisor;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceFieldSelectorPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceFieldSelectorPatchArgs $;

        public Builder() {
            $ = new ResourceFieldSelectorPatchArgs();
        }

        public Builder(ResourceFieldSelectorPatchArgs defaults) {
            $ = new ResourceFieldSelectorPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName Container name: required for volumes, optional for env vars
         * 
         * @return builder
         * 
         */
        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Container name: required for volumes, optional for env vars
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param divisor Specifies the output format of the exposed resources, defaults to &#34;1&#34;
         * 
         * @return builder
         * 
         */
        public Builder divisor(@Nullable Output<String> divisor) {
            $.divisor = divisor;
            return this;
        }

        /**
         * @param divisor Specifies the output format of the exposed resources, defaults to &#34;1&#34;
         * 
         * @return builder
         * 
         */
        public Builder divisor(String divisor) {
            return divisor(Output.of(divisor));
        }

        /**
         * @param resource Required: resource to select
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Required: resource to select
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public ResourceFieldSelectorPatchArgs build() {
            return $;
        }
    }

}
