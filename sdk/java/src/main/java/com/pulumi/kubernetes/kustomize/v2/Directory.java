// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.kustomize.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.kustomize.v2.DirectoryArgs;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Directory is a component representing a collection of resources described by a kustomize directory (kustomization).
 * 
 * ## Example Usage
 * ### Local Kustomize Directory
 * <pre>
 * {@code
 * package myproject;
 * 
 * import com.pulumi.Pulumi;
 * import com.pulumi.kubernetes.kustomize.v2.Directory;
 * import com.pulumi.kubernetes.kustomize.v2.DirectoryArgs;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(ctx -> {
 *             var helloWorld = new Directory("helloWorldLocal", DirectoryArgs.builder()
 *                     .directory("./helloWorld")
 *                     .build());
 *         });
 *     }
 * }
 * }
 * </pre>
 * ### Kustomize Directory from a Git Repo
 * <pre>
 * {@code
 * package myproject;
 * 
 * import com.pulumi.Pulumi;
 * import com.pulumi.kubernetes.kustomize.v2.Directory;
 * import com.pulumi.kubernetes.kustomize.v2.DirectoryArgs;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(ctx -> {
 *             var helloWorld = new Directory("helloWorldRemote", DirectoryArgs.builder()
 *                     .directory("https://github.com/kubernetes-sigs/kustomize/tree/v3.3.1/examples/helloWorld")
 *                     .build());
 *         });
 *     }
 * }
 * }
 * </pre>
 * 
 */
@ResourceType(type="kubernetes:kustomize/v2:Directory")
public class Directory extends com.pulumi.resources.ComponentResource {
    /**
     * Resources created by the Directory resource.
     * 
     */
    @Export(name="resources", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resources;

    /**
     * @return Resources created by the Directory resource.
     * 
     */
    public Output<Optional<String>> resources() {
        return Codegen.optional(this.resources);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("kubernetes:kustomize/v2:Directory", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), true);
    }

    private static DirectoryArgs makeArgs(DirectoryArgs args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DirectoryArgs.Empty : args;
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
