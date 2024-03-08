// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.yaml.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.yaml.v2.ConfigFileArgs;
import java.lang.Object;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ConfigFile creates a set of Kubernetes resources from a Kubernetes YAML file.
 * 
 * ## Example Usage
 * {% /examples %}}
 * 
 */
@ResourceType(type="kubernetes:yaml/v2:ConfigFile")
public class ConfigFile extends com.pulumi.resources.ComponentResource {
    /**
     * Resources created by the ConfigFile.
     * 
     */
    @Export(name="resources", refs={List.class,Object.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Object>> resources;

    /**
     * @return Resources created by the ConfigFile.
     * 
     */
    public Output<Optional<List<Object>>> resources() {
        return Codegen.optional(this.resources);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigFile(String name) {
        this(name, ConfigFileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigFile(String name, ConfigFileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigFile(String name, ConfigFileArgs args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("kubernetes:yaml/v2:ConfigFile", name, args == null ? ConfigFileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
