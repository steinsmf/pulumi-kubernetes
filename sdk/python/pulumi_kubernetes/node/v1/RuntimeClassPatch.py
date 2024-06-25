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

__all__ = ['RuntimeClassPatchArgs', 'RuntimeClassPatch']

@pulumi.input_type
class RuntimeClassPatchArgs:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 handler: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']] = None,
                 overhead: Optional[pulumi.Input['OverheadPatchArgs']] = None,
                 scheduling: Optional[pulumi.Input['SchedulingPatchArgs']] = None):
        """
        The set of arguments for constructing a RuntimeClassPatch resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] handler: handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaPatchArgs'] metadata: More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input['OverheadPatchArgs'] overhead: overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
                https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
        :param pulumi.Input['SchedulingPatchArgs'] scheduling: scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", 'node.k8s.io/v1')
        if handler is not None:
            pulumi.set(__self__, "handler", handler)
        if kind is not None:
            pulumi.set(__self__, "kind", 'RuntimeClass')
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if overhead is not None:
            pulumi.set(__self__, "overhead", overhead)
        if scheduling is not None:
            pulumi.set(__self__, "scheduling", scheduling)

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
    def handler(self) -> Optional[pulumi.Input[str]]:
        """
        handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
        """
        return pulumi.get(self, "handler")

    @handler.setter
    def handler(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "handler", value)

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
    def metadata(self) -> Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']]:
        """
        More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def overhead(self) -> Optional[pulumi.Input['OverheadPatchArgs']]:
        """
        overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
         https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
        """
        return pulumi.get(self, "overhead")

    @overhead.setter
    def overhead(self, value: Optional[pulumi.Input['OverheadPatchArgs']]):
        pulumi.set(self, "overhead", value)

    @property
    @pulumi.getter
    def scheduling(self) -> Optional[pulumi.Input['SchedulingPatchArgs']]:
        """
        scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        """
        return pulumi.get(self, "scheduling")

    @scheduling.setter
    def scheduling(self, value: Optional[pulumi.Input['SchedulingPatchArgs']]):
        pulumi.set(self, "scheduling", value)


class RuntimeClassPatch(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 handler: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaPatchArgs', '_meta.v1.ObjectMetaPatchArgsDict']]] = None,
                 overhead: Optional[pulumi.Input[Union['OverheadPatchArgs', 'OverheadPatchArgsDict']]] = None,
                 scheduling: Optional[pulumi.Input[Union['SchedulingPatchArgs', 'SchedulingPatchArgsDict']]] = None,
                 __props__=None):
        """
        Patch resources are used to modify existing Kubernetes resources by using
        Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
        one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
        Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
        [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
        additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
        RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] handler: handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input[Union['_meta.v1.ObjectMetaPatchArgs', '_meta.v1.ObjectMetaPatchArgsDict']] metadata: More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input[Union['OverheadPatchArgs', 'OverheadPatchArgsDict']] overhead: overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
                https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
        :param pulumi.Input[Union['SchedulingPatchArgs', 'SchedulingPatchArgsDict']] scheduling: scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RuntimeClassPatchArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Patch resources are used to modify existing Kubernetes resources by using
        Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
        one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
        Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
        [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
        additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
        RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/

        :param str resource_name: The name of the resource.
        :param RuntimeClassPatchArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RuntimeClassPatchArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 handler: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaPatchArgs', '_meta.v1.ObjectMetaPatchArgsDict']]] = None,
                 overhead: Optional[pulumi.Input[Union['OverheadPatchArgs', 'OverheadPatchArgsDict']]] = None,
                 scheduling: Optional[pulumi.Input[Union['SchedulingPatchArgs', 'SchedulingPatchArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RuntimeClassPatchArgs.__new__(RuntimeClassPatchArgs)

            __props__.__dict__["api_version"] = 'node.k8s.io/v1'
            __props__.__dict__["handler"] = handler
            __props__.__dict__["kind"] = 'RuntimeClass'
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["overhead"] = overhead
            __props__.__dict__["scheduling"] = scheduling
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="kubernetes:node.k8s.io/v1alpha1:RuntimeClassPatch"), pulumi.Alias(type_="kubernetes:node.k8s.io/v1beta1:RuntimeClassPatch")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(RuntimeClassPatch, __self__).__init__(
            'kubernetes:node.k8s.io/v1:RuntimeClassPatch',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'RuntimeClassPatch':
        """
        Get an existing RuntimeClassPatch resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = RuntimeClassPatchArgs.__new__(RuntimeClassPatchArgs)

        __props__.__dict__["api_version"] = None
        __props__.__dict__["handler"] = None
        __props__.__dict__["kind"] = None
        __props__.__dict__["metadata"] = None
        __props__.__dict__["overhead"] = None
        __props__.__dict__["scheduling"] = None
        return RuntimeClassPatch(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[Optional[str]]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def handler(self) -> pulumi.Output[Optional[str]]:
        """
        handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
        """
        return pulumi.get(self, "handler")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[Optional[str]]:
        """
        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional['_meta.v1.outputs.ObjectMetaPatch']]:
        """
        More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def overhead(self) -> pulumi.Output[Optional['outputs.OverheadPatch']]:
        """
        overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
         https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
        """
        return pulumi.get(self, "overhead")

    @property
    @pulumi.getter
    def scheduling(self) -> pulumi.Output[Optional['outputs.SchedulingPatch']]:
        """
        scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        """
        return pulumi.get(self, "scheduling")

