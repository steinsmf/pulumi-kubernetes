// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Yaml.V2
{
    /// <summary>
    /// ConfigFile creates a set of Kubernetes resources from a remote or on-disk Kubernetes YAML file.
    /// (If you have in-memory YAML a ConfigGroup may be more appropriate.)
    /// 
    /// ## Dependency ordering
    /// Sometimes resources must be applied in a specific order. For example, a namespace resource must be
    /// created before any namespaced resources, or a Custom Resource Definition (CRD) must be pre-installed.
    /// 
    /// Pulumi uses heuristics to determine which order to apply and delete objects within the ConfigFile.  Pulumi also
    /// waits for each object to be fully reconciled, unless `skipAwait` is enabled.
    /// 
    /// ### Explicit Dependency Ordering
    /// Pulumi supports the `config.kubernetes.io/depends-on` annotation to declare an explicit dependency on a given resource.
    /// The annotation accepts a list of resource references, delimited by commas.
    /// 
    /// Note that references to resources outside the ConfigFile aren't supported.
    /// 
    /// **Resource reference**
    /// 
    /// A resource reference is a string that uniquely identifies a resource.
    /// 
    /// It consists of the group, kind, name, and optionally the namespace, delimited by forward slashes.
    /// 
    /// | Resource Scope   | Format                                         |
    /// | :--------------- | :--------------------------------------------- |
    /// | namespace-scoped | `&lt;group&gt;/namespaces/&lt;namespace&gt;/&lt;kind&gt;/&lt;name&gt;` |
    /// | cluster-scoped   | `&lt;group&gt;/&lt;kind&gt;/&lt;name&gt;`                        |
    /// 
    /// For resources in the “core” group, the empty string is used instead (for example: `/namespaces/test/Pod/pod-a`).
    /// 
    /// ### Ordering across ConfigFiles
    /// The `dependsOn` resource option creates a list of explicit dependencies between Pulumi resources.
    /// Use it on another resource to make it dependent on the ConfigFile and to wait for the resources within
    /// the group to be deployed.
    /// 
    /// A best practice is to deploy each application using its own ConfigFile, especially when that application
    /// installs custom resource definitions.
    /// 
    /// ## Example Usage
    /// ### Local File
    /// ```csharp
    /// using Pulumi;
    /// using Pulumi.Kubernetes.Types.Inputs.Yaml.V2;
    /// using Pulumi.Kubernetes.Yaml.V2;
    /// using System.Collections.Generic;
    /// 
    /// return await Deployment.RunAsync(() =&gt;
    /// {
    ///     var example = new ConfigFile("example", new ConfigFileArgs
    ///     {
    ///         File = "./manifest.yaml"
    ///     });
    /// });
    /// ```
    /// {% /examples %}}
    /// </summary>
    [KubernetesResourceType("kubernetes:yaml/v2:ConfigFile")]
    public partial class ConfigFile : global::Pulumi.ComponentResource
    {
        /// <summary>
        /// Resources created by the ConfigFile.
        /// </summary>
        [Output("resources")]
        public Output<ImmutableArray<object>> Resources { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigFile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigFile(string name, Pulumi.Kubernetes.Types.Inputs.Yaml.V2.ConfigFileArgs? args = null, ComponentResourceOptions? options = null)
            : base("kubernetes:yaml/v2:ConfigFile", name, args ?? new Pulumi.Kubernetes.Types.Inputs.Yaml.V2.ConfigFileArgs(), MakeResourceOptions(options, ""), remote: true)
        {
        }

        private static ComponentResourceOptions MakeResourceOptions(ComponentResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new ComponentResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = ComponentResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }
}
namespace Pulumi.Kubernetes.Types.Inputs.Yaml.V2
{

    public class ConfigFileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path or URL to a Kubernetes manifest file. File must exist.
        /// </summary>
        [Input("file", required: true)]
        public Input<string> File { get; set; } = null!;

        /// <summary>
        /// A prefix for the auto-generated resource names. Defaults to the name of the ConfigFile. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
        /// </summary>
        [Input("resourcePrefix")]
        public Input<string>? ResourcePrefix { get; set; }

        /// <summary>
        /// Indicates that child resources should skip the await logic.
        /// </summary>
        [Input("skipAwait")]
        public Input<bool>? SkipAwait { get; set; }

        public ConfigFileArgs()
        {
        }
        public static new ConfigFileArgs Empty => new ConfigFileArgs();
    }
}
