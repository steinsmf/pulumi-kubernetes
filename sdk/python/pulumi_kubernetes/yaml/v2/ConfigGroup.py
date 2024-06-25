# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from ... import _utilities

__all__ = ['ConfigGroupArgs', 'ConfigGroup']

@pulumi.input_type
class ConfigGroupArgs:
    def __init__(__self__, *,
                 files: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 objs: Optional[pulumi.Input[Sequence[Any]]] = None,
                 resource_prefix: Optional[pulumi.Input[str]] = None,
                 skip_await: Optional[pulumi.Input[bool]] = None,
                 yaml: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ConfigGroup resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] files: Set of paths and/or URLs to Kubernetes manifest files. Supports glob patterns.
        :param pulumi.Input[Sequence[Any]] objs: Objects representing Kubernetes resource configurations.
        :param pulumi.Input[str] resource_prefix: A prefix for the auto-generated resource names. Defaults to the name of the ConfigGroup. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
        :param pulumi.Input[bool] skip_await: Indicates that child resources should skip the await logic.
        :param pulumi.Input[str] yaml: A Kubernetes YAML manifest containing Kubernetes resource configuration(s).
        """
        if files is not None:
            pulumi.set(__self__, "files", files)
        if objs is not None:
            pulumi.set(__self__, "objs", objs)
        if resource_prefix is not None:
            pulumi.set(__self__, "resource_prefix", resource_prefix)
        if skip_await is not None:
            pulumi.set(__self__, "skip_await", skip_await)
        if yaml is not None:
            pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter
    def files(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of paths and/or URLs to Kubernetes manifest files. Supports glob patterns.
        """
        return pulumi.get(self, "files")

    @files.setter
    def files(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "files", value)

    @property
    @pulumi.getter
    def objs(self) -> Optional[pulumi.Input[Sequence[Any]]]:
        """
        Objects representing Kubernetes resource configurations.
        """
        return pulumi.get(self, "objs")

    @objs.setter
    def objs(self, value: Optional[pulumi.Input[Sequence[Any]]]):
        pulumi.set(self, "objs", value)

    @property
    @pulumi.getter(name="resourcePrefix")
    def resource_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        A prefix for the auto-generated resource names. Defaults to the name of the ConfigGroup. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
        """
        return pulumi.get(self, "resource_prefix")

    @resource_prefix.setter
    def resource_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_prefix", value)

    @property
    @pulumi.getter(name="skipAwait")
    def skip_await(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates that child resources should skip the await logic.
        """
        return pulumi.get(self, "skip_await")

    @skip_await.setter
    def skip_await(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_await", value)

    @property
    @pulumi.getter
    def yaml(self) -> Optional[pulumi.Input[str]]:
        """
        A Kubernetes YAML manifest containing Kubernetes resource configuration(s).
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yaml", value)


class ConfigGroup(pulumi.ComponentResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 files: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 objs: Optional[pulumi.Input[Sequence[Any]]] = None,
                 resource_prefix: Optional[pulumi.Input[str]] = None,
                 skip_await: Optional[pulumi.Input[bool]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ConfigGroup creates a set of Kubernetes resources from Kubernetes YAML text. The YAML text
        may be supplied using any of the following methods:

        1. Using a filename or a list of filenames:
        2. Using a file pattern or a list of file patterns:
        3. Using a literal string containing YAML, or a list of such strings:
        4. Any combination of files, patterns, or YAML strings:

        ## Dependency ordering
        Sometimes resources must be applied in a specific order. For example, a namespace resource must be
        created before any namespaced resources, or a Custom Resource Definition (CRD) must be pre-installed.

        Pulumi uses heuristics to determine which order to apply and delete objects within the ConfigGroup.  Pulumi also
        waits for each object to be fully reconciled, unless `skipAwait` is enabled.

        ### Explicit Dependency Ordering
        Pulumi supports the `config.kubernetes.io/depends-on` annotation to declare an explicit dependency on a given resource.
        The annotation accepts a list of resource references, delimited by commas.

        Note that references to resources outside the ConfigGroup aren't supported.

        **Resource reference**

        A resource reference is a string that uniquely identifies a resource.

        It consists of the group, kind, name, and optionally the namespace, delimited by forward slashes.

        | Resource Scope   | Format                                         |
        | :--------------- | :--------------------------------------------- |
        | namespace-scoped | `<group>/namespaces/<namespace>/<kind>/<name>` |
        | cluster-scoped   | `<group>/<kind>/<name>`                        |

        For resources in the “core” group, the empty string is used instead (for example: `/namespaces/test/Pod/pod-a`).

        ### Ordering across ConfigGroups
        The `dependsOn` resource option creates a list of explicit dependencies between Pulumi resources.
        Use it on another resource to make it dependent on the ConfigGroup and to wait for the resources within
        the group to be deployed.

        A best practice is to deploy each application using its own ConfigGroup, especially when that application
        installs custom resource definitions.

        ## Example Usage
        ### Local File(s)
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            files=["./manifest.yaml"]
        )
        ```
        ### Local File Pattern
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            files=["./manifests/*.yaml"]
        )
        ```
        {{% /example %}}
        ### Literal YAML String
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            yaml=\"\"\"
        apiVersion: v1
        kind: ConfigMap
        metadata:
          name: my-map
        \"\"\"
        )
        ```
        ### Literal Object
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            objs=[
                {
                    "apiVersion": "v1",
                    "kind": "ConfigMap",
                    "metadata": {
                        "name": "my-map",
                    },
                }
            ]
        )
        ```
        {% /examples %}}

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] files: Set of paths and/or URLs to Kubernetes manifest files. Supports glob patterns.
        :param pulumi.Input[Sequence[Any]] objs: Objects representing Kubernetes resource configurations.
        :param pulumi.Input[str] resource_prefix: A prefix for the auto-generated resource names. Defaults to the name of the ConfigGroup. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
        :param pulumi.Input[bool] skip_await: Indicates that child resources should skip the await logic.
        :param pulumi.Input[str] yaml: A Kubernetes YAML manifest containing Kubernetes resource configuration(s).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ConfigGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ConfigGroup creates a set of Kubernetes resources from Kubernetes YAML text. The YAML text
        may be supplied using any of the following methods:

        1. Using a filename or a list of filenames:
        2. Using a file pattern or a list of file patterns:
        3. Using a literal string containing YAML, or a list of such strings:
        4. Any combination of files, patterns, or YAML strings:

        ## Dependency ordering
        Sometimes resources must be applied in a specific order. For example, a namespace resource must be
        created before any namespaced resources, or a Custom Resource Definition (CRD) must be pre-installed.

        Pulumi uses heuristics to determine which order to apply and delete objects within the ConfigGroup.  Pulumi also
        waits for each object to be fully reconciled, unless `skipAwait` is enabled.

        ### Explicit Dependency Ordering
        Pulumi supports the `config.kubernetes.io/depends-on` annotation to declare an explicit dependency on a given resource.
        The annotation accepts a list of resource references, delimited by commas.

        Note that references to resources outside the ConfigGroup aren't supported.

        **Resource reference**

        A resource reference is a string that uniquely identifies a resource.

        It consists of the group, kind, name, and optionally the namespace, delimited by forward slashes.

        | Resource Scope   | Format                                         |
        | :--------------- | :--------------------------------------------- |
        | namespace-scoped | `<group>/namespaces/<namespace>/<kind>/<name>` |
        | cluster-scoped   | `<group>/<kind>/<name>`                        |

        For resources in the “core” group, the empty string is used instead (for example: `/namespaces/test/Pod/pod-a`).

        ### Ordering across ConfigGroups
        The `dependsOn` resource option creates a list of explicit dependencies between Pulumi resources.
        Use it on another resource to make it dependent on the ConfigGroup and to wait for the resources within
        the group to be deployed.

        A best practice is to deploy each application using its own ConfigGroup, especially when that application
        installs custom resource definitions.

        ## Example Usage
        ### Local File(s)
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            files=["./manifest.yaml"]
        )
        ```
        ### Local File Pattern
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            files=["./manifests/*.yaml"]
        )
        ```
        {{% /example %}}
        ### Literal YAML String
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            yaml=\"\"\"
        apiVersion: v1
        kind: ConfigMap
        metadata:
          name: my-map
        \"\"\"
        )
        ```
        ### Literal Object
        ```python
        import pulumi
        from pulumi_kubernetes.yaml.v2 import ConfigGroup

        example = ConfigGroup(
            "example",
            objs=[
                {
                    "apiVersion": "v1",
                    "kind": "ConfigMap",
                    "metadata": {
                        "name": "my-map",
                    },
                }
            ]
        )
        ```
        {% /examples %}}

        :param str resource_name: The name of the resource.
        :param ConfigGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 files: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 objs: Optional[pulumi.Input[Sequence[Any]]] = None,
                 resource_prefix: Optional[pulumi.Input[str]] = None,
                 skip_await: Optional[pulumi.Input[bool]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is not None:
            raise ValueError('ComponentResource classes do not support opts.id')
        else:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigGroupArgs.__new__(ConfigGroupArgs)

            __props__.__dict__["files"] = files
            __props__.__dict__["objs"] = objs
            __props__.__dict__["resource_prefix"] = resource_prefix
            __props__.__dict__["skip_await"] = skip_await
            __props__.__dict__["yaml"] = yaml
            __props__.__dict__["resources"] = None
        super(ConfigGroup, __self__).__init__(
            'kubernetes:yaml/v2:ConfigGroup',
            resource_name,
            __props__,
            opts,
            remote=True)

    @property
    @pulumi.getter
    def resources(self) -> pulumi.Output[Optional[Sequence[Any]]]:
        """
        Resources created by the ConfigGroup.
        """
        return pulumi.get(self, "resources")

