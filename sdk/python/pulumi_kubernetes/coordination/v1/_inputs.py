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
from ... import meta as _meta

__all__ = [
    'LeaseSpecPatchArgs',
    'LeaseSpecPatchArgsDict',
    'LeaseSpecArgs',
    'LeaseSpecArgsDict',
    'LeaseArgs',
    'LeaseArgsDict',
]

MYPY = False

if not MYPY:
    class LeaseSpecPatchArgsDict(TypedDict):
        """
        LeaseSpec is a specification of a Lease.
        """
        acquire_time: NotRequired[pulumi.Input[str]]
        """
        acquireTime is a time when the current lease was acquired.
        """
        holder_identity: NotRequired[pulumi.Input[str]]
        """
        holderIdentity contains the identity of the holder of a current lease.
        """
        lease_duration_seconds: NotRequired[pulumi.Input[int]]
        """
        leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
        """
        lease_transitions: NotRequired[pulumi.Input[int]]
        """
        leaseTransitions is the number of transitions of a lease between holders.
        """
        renew_time: NotRequired[pulumi.Input[str]]
        """
        renewTime is a time when the current holder of a lease has last updated the lease.
        """
elif False:
    LeaseSpecPatchArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class LeaseSpecPatchArgs:
    def __init__(__self__, *,
                 acquire_time: Optional[pulumi.Input[str]] = None,
                 holder_identity: Optional[pulumi.Input[str]] = None,
                 lease_duration_seconds: Optional[pulumi.Input[int]] = None,
                 lease_transitions: Optional[pulumi.Input[int]] = None,
                 renew_time: Optional[pulumi.Input[str]] = None):
        """
        LeaseSpec is a specification of a Lease.
        :param pulumi.Input[str] acquire_time: acquireTime is a time when the current lease was acquired.
        :param pulumi.Input[str] holder_identity: holderIdentity contains the identity of the holder of a current lease.
        :param pulumi.Input[int] lease_duration_seconds: leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
        :param pulumi.Input[int] lease_transitions: leaseTransitions is the number of transitions of a lease between holders.
        :param pulumi.Input[str] renew_time: renewTime is a time when the current holder of a lease has last updated the lease.
        """
        if acquire_time is not None:
            pulumi.set(__self__, "acquire_time", acquire_time)
        if holder_identity is not None:
            pulumi.set(__self__, "holder_identity", holder_identity)
        if lease_duration_seconds is not None:
            pulumi.set(__self__, "lease_duration_seconds", lease_duration_seconds)
        if lease_transitions is not None:
            pulumi.set(__self__, "lease_transitions", lease_transitions)
        if renew_time is not None:
            pulumi.set(__self__, "renew_time", renew_time)

    @property
    @pulumi.getter(name="acquireTime")
    def acquire_time(self) -> Optional[pulumi.Input[str]]:
        """
        acquireTime is a time when the current lease was acquired.
        """
        return pulumi.get(self, "acquire_time")

    @acquire_time.setter
    def acquire_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acquire_time", value)

    @property
    @pulumi.getter(name="holderIdentity")
    def holder_identity(self) -> Optional[pulumi.Input[str]]:
        """
        holderIdentity contains the identity of the holder of a current lease.
        """
        return pulumi.get(self, "holder_identity")

    @holder_identity.setter
    def holder_identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "holder_identity", value)

    @property
    @pulumi.getter(name="leaseDurationSeconds")
    def lease_duration_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
        """
        return pulumi.get(self, "lease_duration_seconds")

    @lease_duration_seconds.setter
    def lease_duration_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lease_duration_seconds", value)

    @property
    @pulumi.getter(name="leaseTransitions")
    def lease_transitions(self) -> Optional[pulumi.Input[int]]:
        """
        leaseTransitions is the number of transitions of a lease between holders.
        """
        return pulumi.get(self, "lease_transitions")

    @lease_transitions.setter
    def lease_transitions(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lease_transitions", value)

    @property
    @pulumi.getter(name="renewTime")
    def renew_time(self) -> Optional[pulumi.Input[str]]:
        """
        renewTime is a time when the current holder of a lease has last updated the lease.
        """
        return pulumi.get(self, "renew_time")

    @renew_time.setter
    def renew_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renew_time", value)


if not MYPY:
    class LeaseSpecArgsDict(TypedDict):
        """
        LeaseSpec is a specification of a Lease.
        """
        acquire_time: NotRequired[pulumi.Input[str]]
        """
        acquireTime is a time when the current lease was acquired.
        """
        holder_identity: NotRequired[pulumi.Input[str]]
        """
        holderIdentity contains the identity of the holder of a current lease.
        """
        lease_duration_seconds: NotRequired[pulumi.Input[int]]
        """
        leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
        """
        lease_transitions: NotRequired[pulumi.Input[int]]
        """
        leaseTransitions is the number of transitions of a lease between holders.
        """
        renew_time: NotRequired[pulumi.Input[str]]
        """
        renewTime is a time when the current holder of a lease has last updated the lease.
        """
elif False:
    LeaseSpecArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class LeaseSpecArgs:
    def __init__(__self__, *,
                 acquire_time: Optional[pulumi.Input[str]] = None,
                 holder_identity: Optional[pulumi.Input[str]] = None,
                 lease_duration_seconds: Optional[pulumi.Input[int]] = None,
                 lease_transitions: Optional[pulumi.Input[int]] = None,
                 renew_time: Optional[pulumi.Input[str]] = None):
        """
        LeaseSpec is a specification of a Lease.
        :param pulumi.Input[str] acquire_time: acquireTime is a time when the current lease was acquired.
        :param pulumi.Input[str] holder_identity: holderIdentity contains the identity of the holder of a current lease.
        :param pulumi.Input[int] lease_duration_seconds: leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
        :param pulumi.Input[int] lease_transitions: leaseTransitions is the number of transitions of a lease between holders.
        :param pulumi.Input[str] renew_time: renewTime is a time when the current holder of a lease has last updated the lease.
        """
        if acquire_time is not None:
            pulumi.set(__self__, "acquire_time", acquire_time)
        if holder_identity is not None:
            pulumi.set(__self__, "holder_identity", holder_identity)
        if lease_duration_seconds is not None:
            pulumi.set(__self__, "lease_duration_seconds", lease_duration_seconds)
        if lease_transitions is not None:
            pulumi.set(__self__, "lease_transitions", lease_transitions)
        if renew_time is not None:
            pulumi.set(__self__, "renew_time", renew_time)

    @property
    @pulumi.getter(name="acquireTime")
    def acquire_time(self) -> Optional[pulumi.Input[str]]:
        """
        acquireTime is a time when the current lease was acquired.
        """
        return pulumi.get(self, "acquire_time")

    @acquire_time.setter
    def acquire_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acquire_time", value)

    @property
    @pulumi.getter(name="holderIdentity")
    def holder_identity(self) -> Optional[pulumi.Input[str]]:
        """
        holderIdentity contains the identity of the holder of a current lease.
        """
        return pulumi.get(self, "holder_identity")

    @holder_identity.setter
    def holder_identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "holder_identity", value)

    @property
    @pulumi.getter(name="leaseDurationSeconds")
    def lease_duration_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
        """
        return pulumi.get(self, "lease_duration_seconds")

    @lease_duration_seconds.setter
    def lease_duration_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lease_duration_seconds", value)

    @property
    @pulumi.getter(name="leaseTransitions")
    def lease_transitions(self) -> Optional[pulumi.Input[int]]:
        """
        leaseTransitions is the number of transitions of a lease between holders.
        """
        return pulumi.get(self, "lease_transitions")

    @lease_transitions.setter
    def lease_transitions(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lease_transitions", value)

    @property
    @pulumi.getter(name="renewTime")
    def renew_time(self) -> Optional[pulumi.Input[str]]:
        """
        renewTime is a time when the current holder of a lease has last updated the lease.
        """
        return pulumi.get(self, "renew_time")

    @renew_time.setter
    def renew_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renew_time", value)


if not MYPY:
    class LeaseArgsDict(TypedDict):
        """
        Lease defines a lease concept.
        """
        api_version: NotRequired[pulumi.Input[str]]
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        kind: NotRequired[pulumi.Input[str]]
        """
        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        metadata: NotRequired[pulumi.Input['_meta.v1.ObjectMetaArgsDict']]
        """
        More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        spec: NotRequired[pulumi.Input['LeaseSpecArgsDict']]
        """
        spec contains the specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
elif False:
    LeaseArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class LeaseArgs:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
                 spec: Optional[pulumi.Input['LeaseSpecArgs']] = None):
        """
        Lease defines a lease concept.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaArgs'] metadata: More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input['LeaseSpecArgs'] spec: spec contains the specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", 'coordination.k8s.io/v1')
        if kind is not None:
            pulumi.set(__self__, "kind", 'Lease')
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
        More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['LeaseSpecArgs']]:
        """
        spec contains the specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['LeaseSpecArgs']]):
        pulumi.set(self, "spec", value)


