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

__all__ = ['PriorityClassPatchArgs', 'PriorityClassPatch']

@pulumi.input_type
class PriorityClassPatchArgs:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 global_default: Optional[pulumi.Input[bool]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']] = None,
                 preemption_policy: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a PriorityClassPatch resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] description: description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        :param pulumi.Input[bool] global_default: globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaPatchArgs'] metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input[str] preemption_policy: PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        :param pulumi.Input[int] value: The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        """
        PriorityClassPatchArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_version=api_version,
            description=description,
            global_default=global_default,
            kind=kind,
            metadata=metadata,
            preemption_policy=preemption_policy,
            value=value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_version: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             global_default: Optional[pulumi.Input[bool]] = None,
             kind: Optional[pulumi.Input[str]] = None,
             metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']] = None,
             preemption_policy: Optional[pulumi.Input[str]] = None,
             value: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if api_version is None and 'apiVersion' in kwargs:
            api_version = kwargs['apiVersion']
        if global_default is None and 'globalDefault' in kwargs:
            global_default = kwargs['globalDefault']
        if preemption_policy is None and 'preemptionPolicy' in kwargs:
            preemption_policy = kwargs['preemptionPolicy']

        if api_version is not None:
            _setter("api_version", 'scheduling.k8s.io/v1alpha1')
        if description is not None:
            _setter("description", description)
        if global_default is not None:
            _setter("global_default", global_default)
        if kind is not None:
            _setter("kind", 'PriorityClass')
        if metadata is not None:
            _setter("metadata", metadata)
        if preemption_policy is not None:
            _setter("preemption_policy", preemption_policy)
        if value is not None:
            _setter("value", value)

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
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="globalDefault")
    def global_default(self) -> Optional[pulumi.Input[bool]]:
        """
        globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        """
        return pulumi.get(self, "global_default")

    @global_default.setter
    def global_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "global_default", value)

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
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter(name="preemptionPolicy")
    def preemption_policy(self) -> Optional[pulumi.Input[str]]:
        """
        PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        """
        return pulumi.get(self, "preemption_policy")

    @preemption_policy.setter
    def preemption_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "preemption_policy", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[int]]:
        """
        The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "value", value)


class PriorityClassPatch(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 global_default: Optional[pulumi.Input[bool]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaPatchArgs']]] = None,
                 preemption_policy: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Patch resources are used to modify existing Kubernetes resources by using
        Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
        one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
        Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
        [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
        additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
        DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] description: description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        :param pulumi.Input[bool] global_default: globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaPatchArgs']] metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input[str] preemption_policy: PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        :param pulumi.Input[int] value: The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PriorityClassPatchArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Patch resources are used to modify existing Kubernetes resources by using
        Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
        one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
        Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
        [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
        additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
        DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.

        :param str resource_name: The name of the resource.
        :param PriorityClassPatchArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PriorityClassPatchArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PriorityClassPatchArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 global_default: Optional[pulumi.Input[bool]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['_meta.v1.ObjectMetaPatchArgs']]] = None,
                 preemption_policy: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PriorityClassPatchArgs.__new__(PriorityClassPatchArgs)

            __props__.__dict__["api_version"] = 'scheduling.k8s.io/v1alpha1'
            __props__.__dict__["description"] = description
            __props__.__dict__["global_default"] = global_default
            __props__.__dict__["kind"] = 'PriorityClass'
            if metadata is not None and not isinstance(metadata, _meta.v1.ObjectMetaPatchArgs):
                metadata = metadata or {}
                def _setter(key, value):
                    metadata[key] = value
                _meta.v1.ObjectMetaPatchArgs._configure(_setter, **metadata)
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["preemption_policy"] = preemption_policy
            __props__.__dict__["value"] = value
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="kubernetes:scheduling.k8s.io/v1:PriorityClassPatch"), pulumi.Alias(type_="kubernetes:scheduling.k8s.io/v1beta1:PriorityClassPatch")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(PriorityClassPatch, __self__).__init__(
            'kubernetes:scheduling.k8s.io/v1alpha1:PriorityClassPatch',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'PriorityClassPatch':
        """
        Get an existing PriorityClassPatch resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = PriorityClassPatchArgs.__new__(PriorityClassPatchArgs)

        __props__.__dict__["api_version"] = None
        __props__.__dict__["description"] = None
        __props__.__dict__["global_default"] = None
        __props__.__dict__["kind"] = None
        __props__.__dict__["metadata"] = None
        __props__.__dict__["preemption_policy"] = None
        __props__.__dict__["value"] = None
        return PriorityClassPatch(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[Optional[str]]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="globalDefault")
    def global_default(self) -> pulumi.Output[Optional[bool]]:
        """
        globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        """
        return pulumi.get(self, "global_default")

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
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter(name="preemptionPolicy")
    def preemption_policy(self) -> pulumi.Output[Optional[str]]:
        """
        PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        """
        return pulumi.get(self, "preemption_policy")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[Optional[int]]:
        """
        The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        """
        return pulumi.get(self, "value")

