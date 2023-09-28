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

__all__ = [
    'CertificateSigningRequest',
    'CertificateSigningRequestCondition',
    'CertificateSigningRequestConditionPatch',
    'CertificateSigningRequestSpec',
    'CertificateSigningRequestSpecPatch',
    'CertificateSigningRequestStatus',
    'CertificateSigningRequestStatusPatch',
]

@pulumi.output_type
class CertificateSigningRequest(dict):
    """
    Describes a certificate signing request
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "apiVersion":
            suggest = "api_version"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CertificateSigningRequest. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CertificateSigningRequest.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CertificateSigningRequest.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 api_version: Optional[str] = None,
                 kind: Optional[str] = None,
                 metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
                 spec: Optional['outputs.CertificateSigningRequestSpec'] = None,
                 status: Optional['outputs.CertificateSigningRequestStatus'] = None):
        """
        Describes a certificate signing request
        :param str api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param str kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param 'CertificateSigningRequestSpecArgs' spec: The certificate request itself and any additional information.
        :param 'CertificateSigningRequestStatusArgs' status: Derived information about the request.
        """
        CertificateSigningRequest._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_version=api_version,
            kind=kind,
            metadata=metadata,
            spec=spec,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_version: Optional[str] = None,
             kind: Optional[str] = None,
             metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
             spec: Optional['outputs.CertificateSigningRequestSpec'] = None,
             status: Optional['outputs.CertificateSigningRequestStatus'] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if api_version is not None:
            _setter("api_version", 'certificates.k8s.io/v1beta1')
        if kind is not None:
            _setter("kind", 'CertificateSigningRequest')
        if metadata is not None:
            _setter("metadata", metadata)
        if spec is not None:
            _setter("spec", spec)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[str]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

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
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> Optional['outputs.CertificateSigningRequestSpec']:
        """
        The certificate request itself and any additional information.
        """
        return pulumi.get(self, "spec")

    @property
    @pulumi.getter
    def status(self) -> Optional['outputs.CertificateSigningRequestStatus']:
        """
        Derived information about the request.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class CertificateSigningRequestCondition(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "lastTransitionTime":
            suggest = "last_transition_time"
        elif key == "lastUpdateTime":
            suggest = "last_update_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CertificateSigningRequestCondition. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CertificateSigningRequestCondition.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CertificateSigningRequestCondition.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 type: str,
                 last_transition_time: Optional[str] = None,
                 last_update_time: Optional[str] = None,
                 message: Optional[str] = None,
                 reason: Optional[str] = None,
                 status: Optional[str] = None):
        """
        :param str type: request approval state, currently Approved or Denied.
        :param str last_transition_time: lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        :param str last_update_time: timestamp for the last update to this condition
        :param str message: human readable message with details about the request state
        :param str reason: brief reason for the request state
        :param str status: Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
        """
        CertificateSigningRequestCondition._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            type=type,
            last_transition_time=last_transition_time,
            last_update_time=last_update_time,
            message=message,
            reason=reason,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             type: str,
             last_transition_time: Optional[str] = None,
             last_update_time: Optional[str] = None,
             message: Optional[str] = None,
             reason: Optional[str] = None,
             status: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("type", type)
        if last_transition_time is not None:
            _setter("last_transition_time", last_transition_time)
        if last_update_time is not None:
            _setter("last_update_time", last_update_time)
        if message is not None:
            _setter("message", message)
        if reason is not None:
            _setter("reason", reason)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        request approval state, currently Approved or Denied.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="lastTransitionTime")
    def last_transition_time(self) -> Optional[str]:
        """
        lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        """
        return pulumi.get(self, "last_transition_time")

    @property
    @pulumi.getter(name="lastUpdateTime")
    def last_update_time(self) -> Optional[str]:
        """
        timestamp for the last update to this condition
        """
        return pulumi.get(self, "last_update_time")

    @property
    @pulumi.getter
    def message(self) -> Optional[str]:
        """
        human readable message with details about the request state
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def reason(self) -> Optional[str]:
        """
        brief reason for the request state
        """
        return pulumi.get(self, "reason")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class CertificateSigningRequestConditionPatch(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "lastTransitionTime":
            suggest = "last_transition_time"
        elif key == "lastUpdateTime":
            suggest = "last_update_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CertificateSigningRequestConditionPatch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CertificateSigningRequestConditionPatch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CertificateSigningRequestConditionPatch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 last_transition_time: Optional[str] = None,
                 last_update_time: Optional[str] = None,
                 message: Optional[str] = None,
                 reason: Optional[str] = None,
                 status: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str last_transition_time: lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        :param str last_update_time: timestamp for the last update to this condition
        :param str message: human readable message with details about the request state
        :param str reason: brief reason for the request state
        :param str status: Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
        :param str type: request approval state, currently Approved or Denied.
        """
        CertificateSigningRequestConditionPatch._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            last_transition_time=last_transition_time,
            last_update_time=last_update_time,
            message=message,
            reason=reason,
            status=status,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             last_transition_time: Optional[str] = None,
             last_update_time: Optional[str] = None,
             message: Optional[str] = None,
             reason: Optional[str] = None,
             status: Optional[str] = None,
             type: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if last_transition_time is not None:
            _setter("last_transition_time", last_transition_time)
        if last_update_time is not None:
            _setter("last_update_time", last_update_time)
        if message is not None:
            _setter("message", message)
        if reason is not None:
            _setter("reason", reason)
        if status is not None:
            _setter("status", status)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="lastTransitionTime")
    def last_transition_time(self) -> Optional[str]:
        """
        lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        """
        return pulumi.get(self, "last_transition_time")

    @property
    @pulumi.getter(name="lastUpdateTime")
    def last_update_time(self) -> Optional[str]:
        """
        timestamp for the last update to this condition
        """
        return pulumi.get(self, "last_update_time")

    @property
    @pulumi.getter
    def message(self) -> Optional[str]:
        """
        human readable message with details about the request state
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def reason(self) -> Optional[str]:
        """
        brief reason for the request state
        """
        return pulumi.get(self, "reason")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        request approval state, currently Approved or Denied.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class CertificateSigningRequestSpec(dict):
    """
    This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "signerName":
            suggest = "signer_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CertificateSigningRequestSpec. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CertificateSigningRequestSpec.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CertificateSigningRequestSpec.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 request: str,
                 extra: Optional[Mapping[str, Sequence[str]]] = None,
                 groups: Optional[Sequence[str]] = None,
                 signer_name: Optional[str] = None,
                 uid: Optional[str] = None,
                 usages: Optional[Sequence[str]] = None,
                 username: Optional[str] = None):
        """
        This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
        :param str request: Base64-encoded PKCS#10 CSR data
        :param Mapping[str, Sequence[str]] extra: Extra information about the requesting user. See user.Info interface for details.
        :param Sequence[str] groups: Group information about the requesting user. See user.Info interface for details.
        :param str signer_name: Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
                1. If it's a kubelet client certificate, it is assigned
                   "kubernetes.io/kube-apiserver-client-kubelet".
                2. If it's a kubelet serving certificate, it is assigned
                   "kubernetes.io/kubelet-serving".
                3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
               Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
        :param str uid: UID information about the requesting user. See user.Info interface for details.
        :param Sequence[str] usages: allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
                    https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        :param str username: Information about the requesting user. See user.Info interface for details.
        """
        CertificateSigningRequestSpec._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            request=request,
            extra=extra,
            groups=groups,
            signer_name=signer_name,
            uid=uid,
            usages=usages,
            username=username,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             request: str,
             extra: Optional[Mapping[str, Sequence[str]]] = None,
             groups: Optional[Sequence[str]] = None,
             signer_name: Optional[str] = None,
             uid: Optional[str] = None,
             usages: Optional[Sequence[str]] = None,
             username: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("request", request)
        if extra is not None:
            _setter("extra", extra)
        if groups is not None:
            _setter("groups", groups)
        if signer_name is not None:
            _setter("signer_name", signer_name)
        if uid is not None:
            _setter("uid", uid)
        if usages is not None:
            _setter("usages", usages)
        if username is not None:
            _setter("username", username)

    @property
    @pulumi.getter
    def request(self) -> str:
        """
        Base64-encoded PKCS#10 CSR data
        """
        return pulumi.get(self, "request")

    @property
    @pulumi.getter
    def extra(self) -> Optional[Mapping[str, Sequence[str]]]:
        """
        Extra information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "extra")

    @property
    @pulumi.getter
    def groups(self) -> Optional[Sequence[str]]:
        """
        Group information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "groups")

    @property
    @pulumi.getter(name="signerName")
    def signer_name(self) -> Optional[str]:
        """
        Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
         1. If it's a kubelet client certificate, it is assigned
            "kubernetes.io/kube-apiserver-client-kubelet".
         2. If it's a kubelet serving certificate, it is assigned
            "kubernetes.io/kubelet-serving".
         3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
        Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
        """
        return pulumi.get(self, "signer_name")

    @property
    @pulumi.getter
    def uid(self) -> Optional[str]:
        """
        UID information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "uid")

    @property
    @pulumi.getter
    def usages(self) -> Optional[Sequence[str]]:
        """
        allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
             https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        """
        return pulumi.get(self, "usages")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        """
        Information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "username")


@pulumi.output_type
class CertificateSigningRequestSpecPatch(dict):
    """
    This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "signerName":
            suggest = "signer_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CertificateSigningRequestSpecPatch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CertificateSigningRequestSpecPatch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CertificateSigningRequestSpecPatch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 extra: Optional[Mapping[str, Sequence[str]]] = None,
                 groups: Optional[Sequence[str]] = None,
                 request: Optional[str] = None,
                 signer_name: Optional[str] = None,
                 uid: Optional[str] = None,
                 usages: Optional[Sequence[str]] = None,
                 username: Optional[str] = None):
        """
        This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
        :param Mapping[str, Sequence[str]] extra: Extra information about the requesting user. See user.Info interface for details.
        :param Sequence[str] groups: Group information about the requesting user. See user.Info interface for details.
        :param str request: Base64-encoded PKCS#10 CSR data
        :param str signer_name: Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
                1. If it's a kubelet client certificate, it is assigned
                   "kubernetes.io/kube-apiserver-client-kubelet".
                2. If it's a kubelet serving certificate, it is assigned
                   "kubernetes.io/kubelet-serving".
                3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
               Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
        :param str uid: UID information about the requesting user. See user.Info interface for details.
        :param Sequence[str] usages: allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
                    https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        :param str username: Information about the requesting user. See user.Info interface for details.
        """
        CertificateSigningRequestSpecPatch._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            extra=extra,
            groups=groups,
            request=request,
            signer_name=signer_name,
            uid=uid,
            usages=usages,
            username=username,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             extra: Optional[Mapping[str, Sequence[str]]] = None,
             groups: Optional[Sequence[str]] = None,
             request: Optional[str] = None,
             signer_name: Optional[str] = None,
             uid: Optional[str] = None,
             usages: Optional[Sequence[str]] = None,
             username: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if extra is not None:
            _setter("extra", extra)
        if groups is not None:
            _setter("groups", groups)
        if request is not None:
            _setter("request", request)
        if signer_name is not None:
            _setter("signer_name", signer_name)
        if uid is not None:
            _setter("uid", uid)
        if usages is not None:
            _setter("usages", usages)
        if username is not None:
            _setter("username", username)

    @property
    @pulumi.getter
    def extra(self) -> Optional[Mapping[str, Sequence[str]]]:
        """
        Extra information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "extra")

    @property
    @pulumi.getter
    def groups(self) -> Optional[Sequence[str]]:
        """
        Group information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "groups")

    @property
    @pulumi.getter
    def request(self) -> Optional[str]:
        """
        Base64-encoded PKCS#10 CSR data
        """
        return pulumi.get(self, "request")

    @property
    @pulumi.getter(name="signerName")
    def signer_name(self) -> Optional[str]:
        """
        Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
         1. If it's a kubelet client certificate, it is assigned
            "kubernetes.io/kube-apiserver-client-kubelet".
         2. If it's a kubelet serving certificate, it is assigned
            "kubernetes.io/kubelet-serving".
         3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
        Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
        """
        return pulumi.get(self, "signer_name")

    @property
    @pulumi.getter
    def uid(self) -> Optional[str]:
        """
        UID information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "uid")

    @property
    @pulumi.getter
    def usages(self) -> Optional[Sequence[str]]:
        """
        allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
             https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        """
        return pulumi.get(self, "usages")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        """
        Information about the requesting user. See user.Info interface for details.
        """
        return pulumi.get(self, "username")


@pulumi.output_type
class CertificateSigningRequestStatus(dict):
    def __init__(__self__, *,
                 certificate: Optional[str] = None,
                 conditions: Optional[Sequence['outputs.CertificateSigningRequestCondition']] = None):
        """
        :param str certificate: If request was approved, the controller will place the issued certificate here.
        :param Sequence['CertificateSigningRequestConditionArgs'] conditions: Conditions applied to the request, such as approval or denial.
        """
        CertificateSigningRequestStatus._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            certificate=certificate,
            conditions=conditions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             certificate: Optional[str] = None,
             conditions: Optional[Sequence['outputs.CertificateSigningRequestCondition']] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if certificate is not None:
            _setter("certificate", certificate)
        if conditions is not None:
            _setter("conditions", conditions)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[str]:
        """
        If request was approved, the controller will place the issued certificate here.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def conditions(self) -> Optional[Sequence['outputs.CertificateSigningRequestCondition']]:
        """
        Conditions applied to the request, such as approval or denial.
        """
        return pulumi.get(self, "conditions")


@pulumi.output_type
class CertificateSigningRequestStatusPatch(dict):
    def __init__(__self__, *,
                 certificate: Optional[str] = None,
                 conditions: Optional[Sequence['outputs.CertificateSigningRequestConditionPatch']] = None):
        """
        :param str certificate: If request was approved, the controller will place the issued certificate here.
        :param Sequence['CertificateSigningRequestConditionPatchArgs'] conditions: Conditions applied to the request, such as approval or denial.
        """
        CertificateSigningRequestStatusPatch._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            certificate=certificate,
            conditions=conditions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             certificate: Optional[str] = None,
             conditions: Optional[Sequence['outputs.CertificateSigningRequestConditionPatch']] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if certificate is not None:
            _setter("certificate", certificate)
        if conditions is not None:
            _setter("conditions", conditions)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[str]:
        """
        If request was approved, the controller will place the issued certificate here.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def conditions(self) -> Optional[Sequence['outputs.CertificateSigningRequestConditionPatch']]:
        """
        Conditions applied to the request, such as approval or denial.
        """
        return pulumi.get(self, "conditions")


