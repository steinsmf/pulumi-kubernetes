# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from ... import _utilities
from . import outputs
from ... import meta as _meta
from ._inputs import *

__all__ = ['ValidatingAdmissionPolicyInitArgs', 'ValidatingAdmissionPolicy']

@pulumi.input_type
class ValidatingAdmissionPolicyInitArgs:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
                 spec: Optional[pulumi.Input['ValidatingAdmissionPolicySpecArgs']] = None):
        """
        The set of arguments for constructing a ValidatingAdmissionPolicy resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaArgs'] metadata: Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        :param pulumi.Input['ValidatingAdmissionPolicySpecArgs'] spec: Specification of the desired behavior of the ValidatingAdmissionPolicy.
        """
        ValidatingAdmissionPolicyInitArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_version=api_version,
            kind=kind,
            metadata=metadata,
            spec=spec,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_version: Optional[pulumi.Input[str]] = None,
             kind: Optional[pulumi.Input[str]] = None,
             metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
             spec: Optional[pulumi.Input['ValidatingAdmissionPolicySpecArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if api_version is None and 'apiVersion' in kwargs:
            api_version = kwargs['apiVersion']

        if api_version is not None:
            _setter("api_version", 'admissionregistration.k8s.io/v1beta1')
        if kind is not None:
            _setter("kind", 'ValidatingAdmissionPolicy')
        if metadata is not None:
            _setter("metadata", metadata)
        if spec is not None:
            _setter("spec", spec)

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
        Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['ValidatingAdmissionPolicySpecArgs']]:
        """
        Specification of the desired behavior of the ValidatingAdmissionPolicy.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['ValidatingAdmissionPolicySpecArgs']]):
        pulumi.set(self, "spec", value)


class ValidatingAdmissionPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaArgs']]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['ValidatingAdmissionPolicySpecArgs']]] = None,
                 __props__=None):
        """
        ValidatingAdmissionPolicy describes the definition of an admission validation policy that accepts or rejects an object without changing it.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaArgs']] metadata: Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        :param pulumi.Input[pulumi.InputType['ValidatingAdmissionPolicySpecArgs']] spec: Specification of the desired behavior of the ValidatingAdmissionPolicy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ValidatingAdmissionPolicyInitArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ValidatingAdmissionPolicy describes the definition of an admission validation policy that accepts or rejects an object without changing it.

        :param str resource_name: The name of the resource.
        :param ValidatingAdmissionPolicyInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ValidatingAdmissionPolicyInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ValidatingAdmissionPolicyInitArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaArgs']]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['ValidatingAdmissionPolicySpecArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ValidatingAdmissionPolicyInitArgs.__new__(ValidatingAdmissionPolicyInitArgs)

            __props__.__dict__["api_version"] = 'admissionregistration.k8s.io/v1beta1'
            __props__.__dict__["kind"] = 'ValidatingAdmissionPolicy'
            if metadata is not None and not isinstance(metadata, _meta.v1.ObjectMetaArgs):
                metadata = metadata or {}
                def _setter(key, value):
                    metadata[key] = value
                _meta.v1.ObjectMetaArgs._configure(_setter, **metadata)
            __props__.__dict__["metadata"] = metadata
            if spec is not None and not isinstance(spec, ValidatingAdmissionPolicySpecArgs):
                spec = spec or {}
                def _setter(key, value):
                    spec[key] = value
                ValidatingAdmissionPolicySpecArgs._configure(_setter, **spec)
            __props__.__dict__["spec"] = spec
            __props__.__dict__["status"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicy")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ValidatingAdmissionPolicy, __self__).__init__(
            'kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingAdmissionPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'ValidatingAdmissionPolicy':
        """
        Get an existing ValidatingAdmissionPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = ValidatingAdmissionPolicyInitArgs.__new__(ValidatingAdmissionPolicyInitArgs)

        __props__.__dict__["api_version"] = None
        __props__.__dict__["kind"] = None
        __props__.__dict__["metadata"] = None
        __props__.__dict__["spec"] = None
        __props__.__dict__["status"] = None
        return ValidatingAdmissionPolicy(resource_name, opts=opts, __props__=__props__)

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
        Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Output['outputs.ValidatingAdmissionPolicySpec']:
        """
        Specification of the desired behavior of the ValidatingAdmissionPolicy.
        """
        return pulumi.get(self, "spec")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional['outputs.ValidatingAdmissionPolicyStatus']]:
        """
        The status of the ValidatingAdmissionPolicy, including warnings that are useful to determine if the policy behaves in the expected way. Populated by the system. Read-only.
        """
        return pulumi.get(self, "status")

