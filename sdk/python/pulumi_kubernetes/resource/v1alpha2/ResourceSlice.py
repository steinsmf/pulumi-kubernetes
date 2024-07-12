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
from ... import meta as _meta
from ._inputs import *

__all__ = ['ResourceSliceInitArgs', 'ResourceSlice']

@pulumi.input_type
class ResourceSliceInitArgs:
    def __init__(__self__, *,
                 driver_name: pulumi.Input[str],
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
                 named_resources: Optional[pulumi.Input['NamedResourcesResourcesArgs']] = None,
                 node_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ResourceSlice resource.
        :param pulumi.Input[str] driver_name: DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaArgs'] metadata: Standard object metadata
        :param pulumi.Input['NamedResourcesResourcesArgs'] named_resources: NamedResources describes available resources using the named resources model.
        :param pulumi.Input[str] node_name: NodeName identifies the node which provides the resources if they are local to a node.
               
               A field selector can be used to list only ResourceSlice objects with a certain node name.
        """
        pulumi.set(__self__, "driver_name", driver_name)
        if api_version is not None:
            pulumi.set(__self__, "api_version", 'resource.k8s.io/v1alpha2')
        if kind is not None:
            pulumi.set(__self__, "kind", 'ResourceSlice')
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if named_resources is not None:
            pulumi.set(__self__, "named_resources", named_resources)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)

    @property
    @pulumi.getter(name="driverName")
    def driver_name(self) -> pulumi.Input[str]:
        """
        DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        """
        return pulumi.get(self, "driver_name")

    @driver_name.setter
    def driver_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "driver_name", value)

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
        Standard object metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter(name="namedResources")
    def named_resources(self) -> Optional[pulumi.Input['NamedResourcesResourcesArgs']]:
        """
        NamedResources describes available resources using the named resources model.
        """
        return pulumi.get(self, "named_resources")

    @named_resources.setter
    def named_resources(self, value: Optional[pulumi.Input['NamedResourcesResourcesArgs']]):
        pulumi.set(self, "named_resources", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        NodeName identifies the node which provides the resources if they are local to a node.

        A field selector can be used to list only ResourceSlice objects with a certain node name.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)


class ResourceSlice(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 driver_name: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaArgs', '_meta.v1.ObjectMetaArgsDict']]] = None,
                 named_resources: Optional[pulumi.Input[Union['NamedResourcesResourcesArgs', 'NamedResourcesResourcesArgsDict']]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ResourceSlice provides information about available resources on individual nodes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] driver_name: DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input[Union['_meta.v1.ObjectMetaArgs', '_meta.v1.ObjectMetaArgsDict']] metadata: Standard object metadata
        :param pulumi.Input[Union['NamedResourcesResourcesArgs', 'NamedResourcesResourcesArgsDict']] named_resources: NamedResources describes available resources using the named resources model.
        :param pulumi.Input[str] node_name: NodeName identifies the node which provides the resources if they are local to a node.
               
               A field selector can be used to list only ResourceSlice objects with a certain node name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceSliceInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ResourceSlice provides information about available resources on individual nodes.

        :param str resource_name: The name of the resource.
        :param ResourceSliceInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceSliceInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 driver_name: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaArgs', '_meta.v1.ObjectMetaArgsDict']]] = None,
                 named_resources: Optional[pulumi.Input[Union['NamedResourcesResourcesArgs', 'NamedResourcesResourcesArgsDict']]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceSliceInitArgs.__new__(ResourceSliceInitArgs)

            __props__.__dict__["api_version"] = 'resource.k8s.io/v1alpha2'
            if driver_name is None and not opts.urn:
                raise TypeError("Missing required property 'driver_name'")
            __props__.__dict__["driver_name"] = driver_name
            __props__.__dict__["kind"] = 'ResourceSlice'
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["named_resources"] = named_resources
            __props__.__dict__["node_name"] = node_name
        super(ResourceSlice, __self__).__init__(
            'kubernetes:resource.k8s.io/v1alpha2:ResourceSlice',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'ResourceSlice':
        """
        Get an existing ResourceSlice resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = ResourceSliceInitArgs.__new__(ResourceSliceInitArgs)

        __props__.__dict__["api_version"] = None
        __props__.__dict__["driver_name"] = None
        __props__.__dict__["kind"] = None
        __props__.__dict__["metadata"] = None
        __props__.__dict__["named_resources"] = None
        __props__.__dict__["node_name"] = None
        return ResourceSlice(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[str]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter(name="driverName")
    def driver_name(self) -> pulumi.Output[str]:
        """
        DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
        """
        return pulumi.get(self, "driver_name")

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
        Standard object metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter(name="namedResources")
    def named_resources(self) -> pulumi.Output['outputs.NamedResourcesResources']:
        """
        NamedResources describes available resources using the named resources model.
        """
        return pulumi.get(self, "named_resources")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Output[str]:
        """
        NodeName identifies the node which provides the resources if they are local to a node.

        A field selector can be used to list only ResourceSlice objects with a certain node name.
        """
        return pulumi.get(self, "node_name")
