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

__all__ = [
    'PriorityClass',
]

@pulumi.output_type
class PriorityClass(dict):
    """
    DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "apiVersion":
            suggest = "api_version"
        elif key == "globalDefault":
            suggest = "global_default"
        elif key == "preemptionPolicy":
            suggest = "preemption_policy"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in PriorityClass. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        PriorityClass.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        PriorityClass.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 value: int,
                 api_version: Optional[str] = None,
                 description: Optional[str] = None,
                 global_default: Optional[bool] = None,
                 kind: Optional[str] = None,
                 metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
                 preemption_policy: Optional[str] = None):
        """
        DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
        :param int value: The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        :param str api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param str description: description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        :param bool global_default: globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        :param str kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param '_meta.v1.ObjectMetaArgs' metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param str preemption_policy: PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        """
        PriorityClass._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            value=value,
            api_version=api_version,
            description=description,
            global_default=global_default,
            kind=kind,
            metadata=metadata,
            preemption_policy=preemption_policy,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             value: int,
             api_version: Optional[str] = None,
             description: Optional[str] = None,
             global_default: Optional[bool] = None,
             kind: Optional[str] = None,
             metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
             preemption_policy: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("value", value)
        if api_version is not None:
            _setter("api_version", 'scheduling.k8s.io/v1beta1')
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

    @property
    @pulumi.getter
    def value(self) -> int:
        """
        The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[str]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="globalDefault")
    def global_default(self) -> Optional[bool]:
        """
        globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        """
        return pulumi.get(self, "global_default")

    @property
    @pulumi.getter
    def kind(self) -> Optional[str]:
        """
        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def metadata(self) -> Optional['_meta.v1.outputs.ObjectMeta']:
        """
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter(name="preemptionPolicy")
    def preemption_policy(self) -> Optional[str]:
        """
        PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        """
        return pulumi.get(self, "preemption_policy")


