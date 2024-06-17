// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v4

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/utilities"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// _See also: [New: Helm Chart v4 resource with new features and languages](/blog/kubernetes-chart-v4/)_
//
// Chart is a component representing a collection of resources described by a Helm Chart.
// Helm charts are a popular packaging format for Kubernetes applications, and published
// to registries such as [Artifact Hub](https://artifacthub.io/packages/search?kind=0&sort=relevance&page=1).
//
// Chart does not use Tiller or create a Helm Release; the semantics are equivalent to
// running `helm template --dry-run=server` and then using Pulumi to deploy the resulting YAML manifests.
// This allows you to apply [Pulumi Transformations](https://www.pulumi.com/docs/concepts/options/transformations/) and
// [Pulumi Policies](https://www.pulumi.com/docs/using-pulumi/crossguard/) to the Kubernetes resources.
//
// You may also want to consider the `Release` resource as an alternative method for managing helm charts. For more
// information about the trade-offs between these options, see: [Choosing the right Helm resource for your use case](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/choosing-the-right-helm-resource-for-your-use-case).
//
// ### Chart Resolution
//
// The Helm Chart can be fetched from any source that is accessible to the `helm` command line.
// The following variations are supported:
//
// 1. By chart reference with repo prefix: `chart: "example/mariadb"`
// 2. By path to a packaged chart: `chart: "./nginx-1.2.3.tgz"`
// 3. By path to an unpacked chart directory: `chart: "./nginx"`
// 4. By absolute URL: `chart: "https://example.com/charts/nginx-1.2.3.tgz"`
// 5. By chart reference with repo URL: `chart: "nginx", repositoryOpts: { repo: "https://example.com/charts/" }`
// 6. By OCI registry: `chart: "oci://example.com/charts/nginx", version: "1.2.3"`
//
// A chart reference is a convenient way of referencing a chart in a chart repository.
//
// When you use a chart reference with a repo prefix (`example/mariadb`), Pulumi will look in Helm's local configuration
// for a chart repository named `example`, and will then look for a chart in that repository whose name is `mariadb`.
// It will install the latest stable version of that chart, unless you specify `devel` to also include
// development versions (alpha, beta, and release candidate releases), or supply a version number with `version`.
//
// Use the `verify` and optional `keyring` inputs to enable Chart verification.
// By default, Pulumi uses the keyring at `$HOME/.gnupg/pubring.gpg`. See: [Helm Provenance and Integrity](https://helm.sh/docs/topics/provenance/).
//
// ### Chart Values
//
// [Values files](https://helm.sh/docs/chart_template_guide/values_files/#helm) (`values.yaml`) may be supplied
// with the `valueYamlFiles` input, accepting [Pulumi Assets](https://www.pulumi.com/docs/concepts/assets-archives/#assets).
//
// A map of chart values may also be supplied with the `values` input, with highest precedence. You're able to use literals,
// nested maps, [Pulumi outputs](https://www.pulumi.com/docs/concepts/inputs-outputs/), and Pulumi assets as values.
// Assets are automatically opened and converted to a string.
//
// Note that the use of expressions (e.g. `--set service.type`) is not supported.
//
// ### Chart Dependency Resolution
//
// For unpacked chart directories, Pulumi automatically rebuilds the dependencies if dependencies are missing
// and a `Chart.lock` file is present (see: [Helm Dependency Build](https://helm.sh/docs/helm/helm_dependency_build/)).
// Use the `dependencyUpdate` input to have Pulumi update the dependencies (see: [Helm Dependency Update](https://helm.sh/docs/helm/helm_dependency_update/)).
//
// ### Templating
//
// The `Chart` resource renders the templates from your chart and then manages the resources directly with the
// Pulumi Kubernetes provider. A default namespace is applied based on the `namespace` input, the provider's
// configured namespace, and the active Kubernetes context. Use the `skipCrds` option to skip installing the
// Custom Resource Definition (CRD) objects located in the chart's `crds/` special directory.
//
// Use the `postRenderer` input to pipe the rendered manifest through a [post-rendering command](https://helm.sh/docs/topics/advanced/#post-rendering).
//
// ### Resource Ordering
//
// Sometimes resources must be applied in a specific order. For example, a namespace resource must be
// created before any namespaced resources, or a Custom Resource Definition (CRD) must be pre-installed.
//
// Pulumi uses heuristics to determine which order to apply and delete objects within the Chart.  Pulumi also
// waits for each object to be fully reconciled, unless `skipAwait` is enabled.
//
// Pulumi supports the `config.kubernetes.io/depends-on` annotation to declare an explicit dependency on a given resource.
// The annotation accepts a list of resource references, delimited by commas.
//
// Note that references to resources outside the Chart aren't supported.
//
// **Resource reference**
//
// A resource reference is a string that uniquely identifies a resource.
//
// It consists of the group, kind, name, and optionally the namespace, delimited by forward slashes.
//
// | Resource Scope   | Format                                         |
// | :--------------- | :--------------------------------------------- |
// | namespace-scoped | `<group>/namespaces/<namespace>/<kind>/<name>` |
// | cluster-scoped   | `<group>/<kind>/<name>`                        |
//
// For resources in the “core” group, the empty string is used instead (for example: `/namespaces/test/Pod/pod-a`).
//
// ## Example Usage
// ### Local Chart Directory
// ```go
// package main
//
// import (
//
//	helmv4 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/helm/v4"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := helmv4.NewChart(ctx, "nginx", &helmv4.ChartArgs{
//				Chart: pulumi.String("./nginx"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Repository Chart
// ```go
// package main
//
// import (
//
//	helmv4 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/helm/v4"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := helmv4.NewChart(ctx, "nginx", &helmv4.ChartArgs{
//				Chart: pulumi.String("nginx"),
//				RepositoryOpts: &helmv4.RepositoryOptsArgs{
//					Repo: pulumi.String("https://charts.bitnami.com/bitnami"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### OCI Chart
// ```go
// package main
//
// import (
//
//	helmv4 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/helm/v4"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := helmv4.NewChart(ctx, "nginx", &helmv4.ChartArgs{
//				Chart:   pulumi.String("oci://registry-1.docker.io/bitnamicharts/nginx"),
//				Version: pulumi.String("16.0.7"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Chart Values
// ```go
// package main
//
// import (
//
//	helmv4 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/helm/v4"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := helmv4.NewChart(ctx, "nginx", &helmv4.ChartArgs{
//				Chart: pulumi.String("nginx"),
//				RepositoryOpts: &helmv4.RepositoryOptsArgs{
//					Repo: pulumi.String("https://charts.bitnami.com/bitnami"),
//				},
//				ValueYamlFiles: pulumi.AssetOrArchiveArray{
//					pulumi.NewFileAsset("./values.yaml"),
//				},
//				Values: pulumi.Map{
//					"service": pulumi.Map{
//						"type": pulumi.String("ClusterIP"),
//					},
//					"notes": pulumi.NewFileAsset("./notes.txt"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Chart Namespace
// ```go
// package main
//
// import (
//
//	corev1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/core/v1"
//	helmv4 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/helm/v4"
//	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v4/go/kubernetes/meta/v1"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ns, err := corev1.NewNamespace(ctx, "nginx", &corev1.NamespaceArgs{
//				Metadata: &metav1.ObjectMetaArgs{Name: pulumi.String("nginx")},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = helmv4.NewChart(ctx, "nginx", &helmv4.ChartArgs{
//	            Namespace: ns.Metadata.Name(),
//				Chart:     pulumi.String("nginx"),
//				RepositoryOpts: &helmv4.RepositoryOptsArgs{
//					Repo: pulumi.String("https://charts.bitnami.com/bitnami"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Chart struct {
	pulumi.ResourceState

	// Resources created by the Chart.
	Resources pulumi.ArrayOutput `pulumi:"resources"`
}

// NewChart registers a new resource with the given unique name, arguments, and options.
func NewChart(ctx *pulumi.Context,
	name string, args *ChartArgs, opts ...pulumi.ResourceOption) (*Chart, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Chart == nil {
		return nil, errors.New("invalid value for required argument 'Chart'")
	}
	opts = utilities.PkgResourceDefaultOpts(opts)
	var resource Chart
	err := ctx.RegisterRemoteComponentResource("kubernetes:helm.sh/v4:Chart", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type chartArgs struct {
	// Chart name to be installed. A path may be used.
	Chart string `pulumi:"chart"`
	// Run helm dependency update before installing the chart.
	DependencyUpdate *bool `pulumi:"dependencyUpdate"`
	// Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
	Devel *bool `pulumi:"devel"`
	// Location of public keys used for verification. Used only if `verify` is true
	Keyring pulumi.AssetOrArchive `pulumi:"keyring"`
	// Release name.
	Name *string `pulumi:"name"`
	// Namespace for the release.
	Namespace *string `pulumi:"namespace"`
	// Specification defining the post-renderer to use.
	PostRenderer *PostRenderer `pulumi:"postRenderer"`
	// Specification defining the Helm chart repository to use.
	RepositoryOpts *RepositoryOpts `pulumi:"repositoryOpts"`
	// An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo:resourceName".
	ResourcePrefix *string `pulumi:"resourcePrefix"`
	// By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
	SkipAwait *bool `pulumi:"skipAwait"`
	// If set, no CRDs will be installed. By default, CRDs are installed if not already present.
	SkipCrds *bool `pulumi:"skipCrds"`
	// List of assets (raw yaml files). Content is read and merged with values.
	ValueYamlFiles []pulumi.AssetOrArchive `pulumi:"valueYamlFiles"`
	// Custom values set for the release.
	Values map[string]interface{} `pulumi:"values"`
	// Verify the chart's integrity.
	Verify *bool `pulumi:"verify"`
	// Specify the chart version to install. If this is not specified, the latest version is installed.
	Version *string `pulumi:"version"`
}

// The set of arguments for constructing a Chart resource.
type ChartArgs struct {
	// Chart name to be installed. A path may be used.
	Chart pulumi.StringInput
	// Run helm dependency update before installing the chart.
	DependencyUpdate pulumi.BoolPtrInput
	// Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
	Devel pulumi.BoolPtrInput
	// Location of public keys used for verification. Used only if `verify` is true
	Keyring pulumi.AssetOrArchiveInput
	// Release name.
	Name pulumi.StringPtrInput
	// Namespace for the release.
	Namespace pulumi.StringPtrInput
	// Specification defining the post-renderer to use.
	PostRenderer PostRendererPtrInput
	// Specification defining the Helm chart repository to use.
	RepositoryOpts RepositoryOptsPtrInput
	// An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo:resourceName".
	ResourcePrefix pulumi.StringPtrInput
	// By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
	SkipAwait pulumi.BoolPtrInput
	// If set, no CRDs will be installed. By default, CRDs are installed if not already present.
	SkipCrds pulumi.BoolPtrInput
	// List of assets (raw yaml files). Content is read and merged with values.
	ValueYamlFiles pulumi.AssetOrArchiveArrayInput
	// Custom values set for the release.
	Values pulumi.MapInput
	// Verify the chart's integrity.
	Verify pulumi.BoolPtrInput
	// Specify the chart version to install. If this is not specified, the latest version is installed.
	Version pulumi.StringPtrInput
}

func (ChartArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*chartArgs)(nil)).Elem()
}

type ChartInput interface {
	pulumi.Input

	ToChartOutput() ChartOutput
	ToChartOutputWithContext(ctx context.Context) ChartOutput
}

func (*Chart) ElementType() reflect.Type {
	return reflect.TypeOf((**Chart)(nil)).Elem()
}

func (i *Chart) ToChartOutput() ChartOutput {
	return i.ToChartOutputWithContext(context.Background())
}

func (i *Chart) ToChartOutputWithContext(ctx context.Context) ChartOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChartOutput)
}

// ChartArrayInput is an input type that accepts ChartArray and ChartArrayOutput values.
// You can construct a concrete instance of `ChartArrayInput` via:
//
//	ChartArray{ ChartArgs{...} }
type ChartArrayInput interface {
	pulumi.Input

	ToChartArrayOutput() ChartArrayOutput
	ToChartArrayOutputWithContext(context.Context) ChartArrayOutput
}

type ChartArray []ChartInput

func (ChartArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Chart)(nil)).Elem()
}

func (i ChartArray) ToChartArrayOutput() ChartArrayOutput {
	return i.ToChartArrayOutputWithContext(context.Background())
}

func (i ChartArray) ToChartArrayOutputWithContext(ctx context.Context) ChartArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChartArrayOutput)
}

// ChartMapInput is an input type that accepts ChartMap and ChartMapOutput values.
// You can construct a concrete instance of `ChartMapInput` via:
//
//	ChartMap{ "key": ChartArgs{...} }
type ChartMapInput interface {
	pulumi.Input

	ToChartMapOutput() ChartMapOutput
	ToChartMapOutputWithContext(context.Context) ChartMapOutput
}

type ChartMap map[string]ChartInput

func (ChartMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Chart)(nil)).Elem()
}

func (i ChartMap) ToChartMapOutput() ChartMapOutput {
	return i.ToChartMapOutputWithContext(context.Background())
}

func (i ChartMap) ToChartMapOutputWithContext(ctx context.Context) ChartMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChartMapOutput)
}

type ChartOutput struct{ *pulumi.OutputState }

func (ChartOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Chart)(nil)).Elem()
}

func (o ChartOutput) ToChartOutput() ChartOutput {
	return o
}

func (o ChartOutput) ToChartOutputWithContext(ctx context.Context) ChartOutput {
	return o
}

// Resources created by the Chart.
func (o ChartOutput) Resources() pulumi.ArrayOutput {
	return o.ApplyT(func(v *Chart) pulumi.ArrayOutput { return v.Resources }).(pulumi.ArrayOutput)
}

type ChartArrayOutput struct{ *pulumi.OutputState }

func (ChartArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Chart)(nil)).Elem()
}

func (o ChartArrayOutput) ToChartArrayOutput() ChartArrayOutput {
	return o
}

func (o ChartArrayOutput) ToChartArrayOutputWithContext(ctx context.Context) ChartArrayOutput {
	return o
}

func (o ChartArrayOutput) Index(i pulumi.IntInput) ChartOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Chart {
		return vs[0].([]*Chart)[vs[1].(int)]
	}).(ChartOutput)
}

type ChartMapOutput struct{ *pulumi.OutputState }

func (ChartMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Chart)(nil)).Elem()
}

func (o ChartMapOutput) ToChartMapOutput() ChartMapOutput {
	return o
}

func (o ChartMapOutput) ToChartMapOutputWithContext(ctx context.Context) ChartMapOutput {
	return o
}

func (o ChartMapOutput) MapIndex(k pulumi.StringInput) ChartOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Chart {
		return vs[0].(map[string]*Chart)[vs[1].(string)]
	}).(ChartOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChartInput)(nil)).Elem(), &Chart{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChartArrayInput)(nil)).Elem(), ChartArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChartMapInput)(nil)).Elem(), ChartMap{})
	pulumi.RegisterOutputType(ChartOutput{})
	pulumi.RegisterOutputType(ChartArrayOutput{})
	pulumi.RegisterOutputType(ChartMapOutput{})
}
