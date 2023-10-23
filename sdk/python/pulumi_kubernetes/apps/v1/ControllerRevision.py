# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from ... import _utilities
from ... import meta as _meta

__all__ = ['ControllerRevisionInitArgs', 'ControllerRevision']

@pulumi.input_type
class ControllerRevisionInitArgs:
    def __init__(__self__, *,
                 revision: pulumi.Input[int],
                 api_version: Optional[pulumi.Input[str]] = None,
                 data: Optional[Any] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None):
        """
        The set of arguments for constructing a ControllerRevision resource.
        :param pulumi.Input[int] revision: Revision indicates the revision of the state represented by Data.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param Any data: Data is the serialized representation of the state.
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaArgs'] metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        ControllerRevisionInitArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            revision=revision,
            api_version=api_version,
            data=data,
            kind=kind,
            metadata=metadata,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             revision: Optional[pulumi.Input[int]] = None,
             api_version: Optional[pulumi.Input[str]] = None,
             data: Optional[Any] = None,
             kind: Optional[pulumi.Input[str]] = None,
             metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if revision is None:
            raise TypeError("Missing 'revision' argument")
        if api_version is None and 'apiVersion' in kwargs:
            api_version = kwargs['apiVersion']

        _setter("revision", revision)
        if api_version is not None:
            _setter("api_version", 'apps/v1')
        if data is not None:
            _setter("data", data)
        if kind is not None:
            _setter("kind", 'ControllerRevision')
        if metadata is not None:
            _setter("metadata", metadata)

    @property
    @pulumi.getter
    def revision(self) -> pulumi.Input[int]:
        """
        Revision indicates the revision of the state represented by Data.
        """
        return pulumi.get(self, "revision")

    @revision.setter
    def revision(self, value: pulumi.Input[int]):
        pulumi.set(self, "revision", value)

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
    def data(self) -> Optional[Any]:
        """
        Data is the serialized representation of the state.
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[Any]):
        pulumi.set(self, "data", value)

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


class ControllerRevision(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 data: Optional[Any] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaArgs']]] = None,
                 revision: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param Any data: Data is the serialized representation of the state.
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaArgs']] metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input[int] revision: Revision indicates the revision of the state represented by Data.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ControllerRevisionInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.

        :param str resource_name: The name of the resource.
        :param ControllerRevisionInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ControllerRevisionInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ControllerRevisionInitArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 data: Optional[Any] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaArgs']]] = None,
                 revision: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ControllerRevisionInitArgs.__new__(ControllerRevisionInitArgs)

            __props__.__dict__["api_version"] = 'apps/v1'
            __props__.__dict__["data"] = data
            __props__.__dict__["kind"] = 'ControllerRevision'
            if metadata is not None and not isinstance(metadata, _meta.v1.ObjectMetaArgs):
                metadata = metadata or {}
                def _setter(key, value):
                    metadata[key] = value
                _meta.v1.ObjectMetaArgs._configure(_setter, **metadata)
            __props__.__dict__["metadata"] = metadata
            if revision is None and not opts.urn:
                raise TypeError("Missing required property 'revision'")
            __props__.__dict__["revision"] = revision
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="kubernetes:apps/v1beta1:ControllerRevision"), pulumi.Alias(type_="kubernetes:apps/v1beta2:ControllerRevision")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ControllerRevision, __self__).__init__(
            'kubernetes:apps/v1:ControllerRevision',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'ControllerRevision':
        """
        Get an existing ControllerRevision resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = ControllerRevisionInitArgs.__new__(ControllerRevisionInitArgs)

        __props__.__dict__["api_version"] = None
        __props__.__dict__["data"] = None
        __props__.__dict__["kind"] = None
        __props__.__dict__["metadata"] = None
        __props__.__dict__["revision"] = None
        return ControllerRevision(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[str]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def data(self) -> pulumi.Output[Any]:
        """
        Data is the serialized representation of the state.
        """
        return pulumi.get(self, "data")

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
    def revision(self) -> pulumi.Output[int]:
        """
        Revision indicates the revision of the state represented by Data.
        """
        return pulumi.get(self, "revision")

