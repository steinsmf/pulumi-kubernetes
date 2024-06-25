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
from . import outputs
from ... import core as _core
from ... import meta as _meta
from ._inputs import *

__all__ = ['StatefulSetInitArgs', 'StatefulSet']

@pulumi.input_type
class StatefulSetInitArgs:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
                 spec: Optional[pulumi.Input['StatefulSetSpecArgs']] = None):
        """
        The set of arguments for constructing a StatefulSet resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaArgs'] metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input['StatefulSetSpecArgs'] spec: Spec defines the desired identities of pods in this set.
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", 'apps/v1')
        if kind is not None:
            pulumi.set(__self__, "kind", 'StatefulSet')
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[pulumi.Input[str]]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @api_version.setter
    def api_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_version", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]:
        """
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['StatefulSetSpecArgs']]:
        """
        Spec defines the desired identities of pods in this set.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['StatefulSetSpecArgs']]):
        pulumi.set(self, "spec", value)


class StatefulSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaArgs', '_meta.v1.ObjectMetaArgsDict']]] = None,
                 spec: Optional[pulumi.Input[Union['StatefulSetSpecArgs', 'StatefulSetSpecArgsDict']]] = None,
                 __props__=None):
        """
        StatefulSet represents a set of pods with consistent identities. Identities are defined as:
          - Network: A single stable DNS and hostname.
          - Storage: As many VolumeClaims as requested.

        The StatefulSet guarantees that a given network identity will always map to the same storage identity.

        This resource waits until its status is ready before registering success
        for create/update, and populating output properties from the current state of the resource.
        The following conditions are used to determine whether the resource creation has
        succeeded or failed:

        1. The value of 'spec.replicas' matches '.status.replicas', '.status.currentReplicas',
           and '.status.readyReplicas'.
        2. The value of '.status.updateRevision' matches '.status.currentRevision'.

        If the StatefulSet has not reached a Ready state after 10 minutes, it will
        time out and mark the resource update as Failed. You can override the default timeout value
        by setting the 'customTimeouts' option on the resource.

        ## Example Usage
        ### Create a StatefulSet with auto-naming
        ```python
        import pulumi
        import pulumi_kubernetes as kubernetes

        service = kubernetes.core.v1.Service("service",
            metadata=kubernetes.meta.v1.ObjectMetaArgs(
                labels={
                    "app": "nginx",
                },
            ),
            spec=kubernetes.core.v1.ServiceSpecArgs(
                cluster_ip="None",
                ports=[kubernetes.core.v1.ServicePortArgs(
                    name="web",
                    port=80,
                )],
                selector={
                    "app": "nginx",
                },
            ))
        statefulset = kubernetes.apps.v1.StatefulSet("statefulset", spec=kubernetes.apps.v1.StatefulSetSpecArgs(
            replicas=3,
            selector=kubernetes.meta.v1.LabelSelectorArgs(
                match_labels={
                    "app": "nginx",
                },
            ),
            service_name=service.metadata.name,
            template=kubernetes.core.v1.PodTemplateSpecArgs(
                metadata=kubernetes.meta.v1.ObjectMetaArgs(
                    labels={
                        "app": "nginx",
                    },
                ),
                spec=kubernetes.core.v1.PodSpecArgs(
                    containers=[kubernetes.core.v1.ContainerArgs(
                        image="nginx:stable-alpine3.17-slim",
                        name="nginx",
                        ports=[kubernetes.core.v1.ContainerPortArgs(
                            container_port=80,
                            name="web",
                        )],
                        volume_mounts=[kubernetes.core.v1.VolumeMountArgs(
                            mount_path="/usr/share/nginx/html",
                            name="www",
                        )],
                    )],
                    termination_grace_period_seconds=10,
                ),
            ),
            volume_claim_templates=[kubernetes.core.v1.PersistentVolumeClaimArgs(
                metadata=kubernetes.meta.v1.ObjectMetaArgs(
                    name="www",
                ),
                spec=kubernetes.core.v1.PersistentVolumeClaimSpecArgs(
                    access_modes=["ReadWriteOnce"],
                    resources=kubernetes.core.v1.ResourceRequirementsArgs(
                        requests={
                            "storage": "1Gi",
                        },
                    ),
                ),
            )],
        ))
        ```
        ### Create a StatefulSet with a user-specified name
        ```python
        import pulumi
        import pulumi_kubernetes as kubernetes

        service = kubernetes.core.v1.Service("service",
            metadata=kubernetes.meta.v1.ObjectMetaArgs(
                labels={
                    "app": "nginx",
                },
                name="nginx",
            ),
            spec=kubernetes.core.v1.ServiceSpecArgs(
                cluster_ip="None",
                ports=[kubernetes.core.v1.ServicePortArgs(
                    name="web",
                    port=80,
                )],
                selector={
                    "app": "nginx",
                },
            ))
        statefulset = kubernetes.apps.v1.StatefulSet("statefulset",
            metadata=kubernetes.meta.v1.ObjectMetaArgs(
                name="web",
            ),
            spec=kubernetes.apps.v1.StatefulSetSpecArgs(
                replicas=3,
                selector=kubernetes.meta.v1.LabelSelectorArgs(
                    match_labels={
                        "app": "nginx",
                    },
                ),
                service_name=service.metadata.name,
                template=kubernetes.core.v1.PodTemplateSpecArgs(
                    metadata=kubernetes.meta.v1.ObjectMetaArgs(
                        labels={
                            "app": "nginx",
                        },
                    ),
                    spec=kubernetes.core.v1.PodSpecArgs(
                        containers=[kubernetes.core.v1.ContainerArgs(
                            image="nginx:stable-alpine3.17-slim",
                            name="nginx",
                            ports=[kubernetes.core.v1.ContainerPortArgs(
                                container_port=80,
                                name="web",
                            )],
                            volume_mounts=[kubernetes.core.v1.VolumeMountArgs(
                                mount_path="/usr/share/nginx/html",
                                name="www",
                            )],
                        )],
                        termination_grace_period_seconds=10,
                    ),
                ),
                volume_claim_templates=[kubernetes.core.v1.PersistentVolumeClaimArgs(
                    metadata=kubernetes.meta.v1.ObjectMetaArgs(
                        name="www",
                    ),
                    spec=kubernetes.core.v1.PersistentVolumeClaimSpecArgs(
                        access_modes=["ReadWriteOnce"],
                        resources=kubernetes.core.v1.ResourceRequirementsArgs(
                            requests={
                                "storage": "1Gi",
                            },
                        ),
                    ),
                )],
            ))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input[Union['_meta.v1.ObjectMetaArgs', '_meta.v1.ObjectMetaArgsDict']] metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input[Union['StatefulSetSpecArgs', 'StatefulSetSpecArgsDict']] spec: Spec defines the desired identities of pods in this set.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[StatefulSetInitArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        StatefulSet represents a set of pods with consistent identities. Identities are defined as:
          - Network: A single stable DNS and hostname.
          - Storage: As many VolumeClaims as requested.

        The StatefulSet guarantees that a given network identity will always map to the same storage identity.

        This resource waits until its status is ready before registering success
        for create/update, and populating output properties from the current state of the resource.
        The following conditions are used to determine whether the resource creation has
        succeeded or failed:

        1. The value of 'spec.replicas' matches '.status.replicas', '.status.currentReplicas',
           and '.status.readyReplicas'.
        2. The value of '.status.updateRevision' matches '.status.currentRevision'.

        If the StatefulSet has not reached a Ready state after 10 minutes, it will
        time out and mark the resource update as Failed. You can override the default timeout value
        by setting the 'customTimeouts' option on the resource.

        ## Example Usage
        ### Create a StatefulSet with auto-naming
        ```python
        import pulumi
        import pulumi_kubernetes as kubernetes

        service = kubernetes.core.v1.Service("service",
            metadata=kubernetes.meta.v1.ObjectMetaArgs(
                labels={
                    "app": "nginx",
                },
            ),
            spec=kubernetes.core.v1.ServiceSpecArgs(
                cluster_ip="None",
                ports=[kubernetes.core.v1.ServicePortArgs(
                    name="web",
                    port=80,
                )],
                selector={
                    "app": "nginx",
                },
            ))
        statefulset = kubernetes.apps.v1.StatefulSet("statefulset", spec=kubernetes.apps.v1.StatefulSetSpecArgs(
            replicas=3,
            selector=kubernetes.meta.v1.LabelSelectorArgs(
                match_labels={
                    "app": "nginx",
                },
            ),
            service_name=service.metadata.name,
            template=kubernetes.core.v1.PodTemplateSpecArgs(
                metadata=kubernetes.meta.v1.ObjectMetaArgs(
                    labels={
                        "app": "nginx",
                    },
                ),
                spec=kubernetes.core.v1.PodSpecArgs(
                    containers=[kubernetes.core.v1.ContainerArgs(
                        image="nginx:stable-alpine3.17-slim",
                        name="nginx",
                        ports=[kubernetes.core.v1.ContainerPortArgs(
                            container_port=80,
                            name="web",
                        )],
                        volume_mounts=[kubernetes.core.v1.VolumeMountArgs(
                            mount_path="/usr/share/nginx/html",
                            name="www",
                        )],
                    )],
                    termination_grace_period_seconds=10,
                ),
            ),
            volume_claim_templates=[kubernetes.core.v1.PersistentVolumeClaimArgs(
                metadata=kubernetes.meta.v1.ObjectMetaArgs(
                    name="www",
                ),
                spec=kubernetes.core.v1.PersistentVolumeClaimSpecArgs(
                    access_modes=["ReadWriteOnce"],
                    resources=kubernetes.core.v1.ResourceRequirementsArgs(
                        requests={
                            "storage": "1Gi",
                        },
                    ),
                ),
            )],
        ))
        ```
        ### Create a StatefulSet with a user-specified name
        ```python
        import pulumi
        import pulumi_kubernetes as kubernetes

        service = kubernetes.core.v1.Service("service",
            metadata=kubernetes.meta.v1.ObjectMetaArgs(
                labels={
                    "app": "nginx",
                },
                name="nginx",
            ),
            spec=kubernetes.core.v1.ServiceSpecArgs(
                cluster_ip="None",
                ports=[kubernetes.core.v1.ServicePortArgs(
                    name="web",
                    port=80,
                )],
                selector={
                    "app": "nginx",
                },
            ))
        statefulset = kubernetes.apps.v1.StatefulSet("statefulset",
            metadata=kubernetes.meta.v1.ObjectMetaArgs(
                name="web",
            ),
            spec=kubernetes.apps.v1.StatefulSetSpecArgs(
                replicas=3,
                selector=kubernetes.meta.v1.LabelSelectorArgs(
                    match_labels={
                        "app": "nginx",
                    },
                ),
                service_name=service.metadata.name,
                template=kubernetes.core.v1.PodTemplateSpecArgs(
                    metadata=kubernetes.meta.v1.ObjectMetaArgs(
                        labels={
                            "app": "nginx",
                        },
                    ),
                    spec=kubernetes.core.v1.PodSpecArgs(
                        containers=[kubernetes.core.v1.ContainerArgs(
                            image="nginx:stable-alpine3.17-slim",
                            name="nginx",
                            ports=[kubernetes.core.v1.ContainerPortArgs(
                                container_port=80,
                                name="web",
                            )],
                            volume_mounts=[kubernetes.core.v1.VolumeMountArgs(
                                mount_path="/usr/share/nginx/html",
                                name="www",
                            )],
                        )],
                        termination_grace_period_seconds=10,
                    ),
                ),
                volume_claim_templates=[kubernetes.core.v1.PersistentVolumeClaimArgs(
                    metadata=kubernetes.meta.v1.ObjectMetaArgs(
                        name="www",
                    ),
                    spec=kubernetes.core.v1.PersistentVolumeClaimSpecArgs(
                        access_modes=["ReadWriteOnce"],
                        resources=kubernetes.core.v1.ResourceRequirementsArgs(
                            requests={
                                "storage": "1Gi",
                            },
                        ),
                    ),
                )],
            ))
        ```

        :param str resource_name: The name of the resource.
        :param StatefulSetInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StatefulSetInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaArgs', '_meta.v1.ObjectMetaArgsDict']]] = None,
                 spec: Optional[pulumi.Input[Union['StatefulSetSpecArgs', 'StatefulSetSpecArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StatefulSetInitArgs.__new__(StatefulSetInitArgs)

            __props__.__dict__["api_version"] = 'apps/v1'
            __props__.__dict__["kind"] = 'StatefulSet'
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["spec"] = spec
            __props__.__dict__["status"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="kubernetes:apps/v1beta1:StatefulSet"), pulumi.Alias(type_="kubernetes:apps/v1beta2:StatefulSet")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(StatefulSet, __self__).__init__(
            'kubernetes:apps/v1:StatefulSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'StatefulSet':
        """
        Get an existing StatefulSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = StatefulSetInitArgs.__new__(StatefulSetInitArgs)

        __props__.__dict__["api_version"] = None
        __props__.__dict__["kind"] = None
        __props__.__dict__["metadata"] = None
        __props__.__dict__["spec"] = None
        __props__.__dict__["status"] = None
        return StatefulSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[str]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def metadata(self) -> pulumi.Output['_meta.v1.outputs.ObjectMeta']:
        """
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Output['outputs.StatefulSetSpec']:
        """
        Spec defines the desired identities of pods in this set.
        """
        return pulumi.get(self, "spec")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional['outputs.StatefulSetStatus']]:
        """
        Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
        """
        return pulumi.get(self, "status")

