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

__all__ = ['ClusterRoleBindingPatchArgs', 'ClusterRoleBindingPatch']

@pulumi.input_type
class ClusterRoleBindingPatchArgs:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']] = None,
                 role_ref: Optional[pulumi.Input['RoleRefPatchArgs']] = None,
                 subjects: Optional[pulumi.Input[Sequence[pulumi.Input['SubjectPatchArgs']]]] = None):
        """
        The set of arguments for constructing a ClusterRoleBindingPatch resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaPatchArgs'] metadata: Standard object's metadata.
        :param pulumi.Input['RoleRefPatchArgs'] role_ref: RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        :param pulumi.Input[Sequence[pulumi.Input['SubjectPatchArgs']]] subjects: Subjects holds references to the objects the role applies to.
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", 'rbac.authorization.k8s.io/v1beta1')
        if kind is not None:
            pulumi.set(__self__, "kind", 'ClusterRoleBinding')
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if role_ref is not None:
            pulumi.set(__self__, "role_ref", role_ref)
        if subjects is not None:
            pulumi.set(__self__, "subjects", subjects)

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
    def metadata(self) -> Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']]:
        """
        Standard object's metadata.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter(name="roleRef")
    def role_ref(self) -> Optional[pulumi.Input['RoleRefPatchArgs']]:
        """
        RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        """
        return pulumi.get(self, "role_ref")

    @role_ref.setter
    def role_ref(self, value: Optional[pulumi.Input['RoleRefPatchArgs']]):
        pulumi.set(self, "role_ref", value)

    @property
    @pulumi.getter
    def subjects(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SubjectPatchArgs']]]]:
        """
        Subjects holds references to the objects the role applies to.
        """
        return pulumi.get(self, "subjects")

    @subjects.setter
    def subjects(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SubjectPatchArgs']]]]):
        pulumi.set(self, "subjects", value)


class ClusterRoleBindingPatch(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaPatchArgs', '_meta.v1.ObjectMetaPatchArgsDict']]] = None,
                 role_ref: Optional[pulumi.Input[Union['RoleRefPatchArgs', 'RoleRefPatchArgsDict']]] = None,
                 subjects: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SubjectPatchArgs', 'SubjectPatchArgsDict']]]]] = None,
                 __props__=None):
        """
        Patch resources are used to modify existing Kubernetes resources by using
        Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
        one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
        Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
        [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
        additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
        ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBinding, and will no longer be served in v1.20.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input[Union['_meta.v1.ObjectMetaPatchArgs', '_meta.v1.ObjectMetaPatchArgsDict']] metadata: Standard object's metadata.
        :param pulumi.Input[Union['RoleRefPatchArgs', 'RoleRefPatchArgsDict']] role_ref: RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SubjectPatchArgs', 'SubjectPatchArgsDict']]]] subjects: Subjects holds references to the objects the role applies to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ClusterRoleBindingPatchArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Patch resources are used to modify existing Kubernetes resources by using
        Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
        one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
        Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
        [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
        additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
        ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBinding, and will no longer be served in v1.20.

        :param str resource_name: The name of the resource.
        :param ClusterRoleBindingPatchArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterRoleBindingPatchArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Union['_meta.v1.ObjectMetaPatchArgs', '_meta.v1.ObjectMetaPatchArgsDict']]] = None,
                 role_ref: Optional[pulumi.Input[Union['RoleRefPatchArgs', 'RoleRefPatchArgsDict']]] = None,
                 subjects: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SubjectPatchArgs', 'SubjectPatchArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterRoleBindingPatchArgs.__new__(ClusterRoleBindingPatchArgs)

            __props__.__dict__["api_version"] = 'rbac.authorization.k8s.io/v1beta1'
            __props__.__dict__["kind"] = 'ClusterRoleBinding'
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["role_ref"] = role_ref
            __props__.__dict__["subjects"] = subjects
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleBindingPatch"), pulumi.Alias(type_="kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRoleBindingPatch")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ClusterRoleBindingPatch, __self__).__init__(
            'kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRoleBindingPatch',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'ClusterRoleBindingPatch':
        """
        Get an existing ClusterRoleBindingPatch resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = ClusterRoleBindingPatchArgs.__new__(ClusterRoleBindingPatchArgs)

        __props__.__dict__["api_version"] = None
        __props__.__dict__["kind"] = None
        __props__.__dict__["metadata"] = None
        __props__.__dict__["role_ref"] = None
        __props__.__dict__["subjects"] = None
        return ClusterRoleBindingPatch(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[Optional[str]]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

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
        Standard object's metadata.
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter(name="roleRef")
    def role_ref(self) -> pulumi.Output[Optional['outputs.RoleRefPatch']]:
        """
        RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        """
        return pulumi.get(self, "role_ref")

    @property
    @pulumi.getter
    def subjects(self) -> pulumi.Output[Optional[Sequence['outputs.SubjectPatch']]]:
        """
        Subjects holds references to the objects the role applies to.
        """
        return pulumi.get(self, "subjects")

