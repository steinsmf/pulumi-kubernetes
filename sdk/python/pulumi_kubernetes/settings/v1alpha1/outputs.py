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
from ... import core as _core
from ... import meta as _meta

__all__ = [
    'PodPreset',
    'PodPresetSpec',
    'PodPresetSpecPatch',
]

@pulumi.output_type
class PodPreset(dict):
    """
    PodPreset is a policy resource that defines additional runtime requirements for a Pod.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "apiVersion":
            suggest = "api_version"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in PodPreset. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        PodPreset.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        PodPreset.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 api_version: Optional[str] = None,
                 kind: Optional[str] = None,
                 metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
                 spec: Optional['outputs.PodPresetSpec'] = None):
        """
        PodPreset is a policy resource that defines additional runtime requirements for a Pod.
        :param str api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param str kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        PodPreset._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_version=api_version,
            kind=kind,
            metadata=metadata,
            spec=spec,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_version: Optional[str] = None,
             kind: Optional[str] = None,
             metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
             spec: Optional['outputs.PodPresetSpec'] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if api_version is not None:
            _setter("api_version", 'settings.k8s.io/v1alpha1')
        if kind is not None:
            _setter("kind", 'PodPreset')
        if metadata is not None:
            _setter("metadata", metadata)
        if spec is not None:
            _setter("spec", spec)

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
    def spec(self) -> Optional['outputs.PodPresetSpec']:
        return pulumi.get(self, "spec")


@pulumi.output_type
class PodPresetSpec(dict):
    """
    PodPresetSpec is a description of a pod preset.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "envFrom":
            suggest = "env_from"
        elif key == "volumeMounts":
            suggest = "volume_mounts"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in PodPresetSpec. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        PodPresetSpec.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        PodPresetSpec.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 env: Optional[Sequence['_core.v1.outputs.EnvVar']] = None,
                 env_from: Optional[Sequence['_core.v1.outputs.EnvFromSource']] = None,
                 selector: Optional['_meta.v1.outputs.LabelSelector'] = None,
                 volume_mounts: Optional[Sequence['_core.v1.outputs.VolumeMount']] = None,
                 volumes: Optional[Sequence['_core.v1.outputs.Volume']] = None):
        """
        PodPresetSpec is a description of a pod preset.
        :param Sequence['_core.v1.EnvVarArgs'] env: Env defines the collection of EnvVar to inject into containers.
        :param Sequence['_core.v1.EnvFromSourceArgs'] env_from: EnvFrom defines the collection of EnvFromSource to inject into containers.
        :param '_meta.v1.LabelSelectorArgs' selector: Selector is a label query over a set of resources, in this case pods. Required.
        :param Sequence['_core.v1.VolumeMountArgs'] volume_mounts: VolumeMounts defines the collection of VolumeMount to inject into containers.
        :param Sequence['_core.v1.VolumeArgs'] volumes: Volumes defines the collection of Volume to inject into the pod.
        """
        PodPresetSpec._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            env=env,
            env_from=env_from,
            selector=selector,
            volume_mounts=volume_mounts,
            volumes=volumes,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             env: Optional[Sequence['_core.v1.outputs.EnvVar']] = None,
             env_from: Optional[Sequence['_core.v1.outputs.EnvFromSource']] = None,
             selector: Optional['_meta.v1.outputs.LabelSelector'] = None,
             volume_mounts: Optional[Sequence['_core.v1.outputs.VolumeMount']] = None,
             volumes: Optional[Sequence['_core.v1.outputs.Volume']] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if env is not None:
            _setter("env", env)
        if env_from is not None:
            _setter("env_from", env_from)
        if selector is not None:
            _setter("selector", selector)
        if volume_mounts is not None:
            _setter("volume_mounts", volume_mounts)
        if volumes is not None:
            _setter("volumes", volumes)

    @property
    @pulumi.getter
    def env(self) -> Optional[Sequence['_core.v1.outputs.EnvVar']]:
        """
        Env defines the collection of EnvVar to inject into containers.
        """
        return pulumi.get(self, "env")

    @property
    @pulumi.getter(name="envFrom")
    def env_from(self) -> Optional[Sequence['_core.v1.outputs.EnvFromSource']]:
        """
        EnvFrom defines the collection of EnvFromSource to inject into containers.
        """
        return pulumi.get(self, "env_from")

    @property
    @pulumi.getter
    def selector(self) -> Optional['_meta.v1.outputs.LabelSelector']:
        """
        Selector is a label query over a set of resources, in this case pods. Required.
        """
        return pulumi.get(self, "selector")

    @property
    @pulumi.getter(name="volumeMounts")
    def volume_mounts(self) -> Optional[Sequence['_core.v1.outputs.VolumeMount']]:
        """
        VolumeMounts defines the collection of VolumeMount to inject into containers.
        """
        return pulumi.get(self, "volume_mounts")

    @property
    @pulumi.getter
    def volumes(self) -> Optional[Sequence['_core.v1.outputs.Volume']]:
        """
        Volumes defines the collection of Volume to inject into the pod.
        """
        return pulumi.get(self, "volumes")


@pulumi.output_type
class PodPresetSpecPatch(dict):
    """
    PodPresetSpec is a description of a pod preset.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "envFrom":
            suggest = "env_from"
        elif key == "volumeMounts":
            suggest = "volume_mounts"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in PodPresetSpecPatch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        PodPresetSpecPatch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        PodPresetSpecPatch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 env: Optional[Sequence['_core.v1.outputs.EnvVarPatch']] = None,
                 env_from: Optional[Sequence['_core.v1.outputs.EnvFromSourcePatch']] = None,
                 selector: Optional['_meta.v1.outputs.LabelSelectorPatch'] = None,
                 volume_mounts: Optional[Sequence['_core.v1.outputs.VolumeMountPatch']] = None,
                 volumes: Optional[Sequence['_core.v1.outputs.VolumePatch']] = None):
        """
        PodPresetSpec is a description of a pod preset.
        :param Sequence['_core.v1.EnvVarPatchArgs'] env: Env defines the collection of EnvVar to inject into containers.
        :param Sequence['_core.v1.EnvFromSourcePatchArgs'] env_from: EnvFrom defines the collection of EnvFromSource to inject into containers.
        :param '_meta.v1.LabelSelectorPatchArgs' selector: Selector is a label query over a set of resources, in this case pods. Required.
        :param Sequence['_core.v1.VolumeMountPatchArgs'] volume_mounts: VolumeMounts defines the collection of VolumeMount to inject into containers.
        :param Sequence['_core.v1.VolumePatchArgs'] volumes: Volumes defines the collection of Volume to inject into the pod.
        """
        PodPresetSpecPatch._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            env=env,
            env_from=env_from,
            selector=selector,
            volume_mounts=volume_mounts,
            volumes=volumes,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             env: Optional[Sequence['_core.v1.outputs.EnvVarPatch']] = None,
             env_from: Optional[Sequence['_core.v1.outputs.EnvFromSourcePatch']] = None,
             selector: Optional['_meta.v1.outputs.LabelSelectorPatch'] = None,
             volume_mounts: Optional[Sequence['_core.v1.outputs.VolumeMountPatch']] = None,
             volumes: Optional[Sequence['_core.v1.outputs.VolumePatch']] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if env is not None:
            _setter("env", env)
        if env_from is not None:
            _setter("env_from", env_from)
        if selector is not None:
            _setter("selector", selector)
        if volume_mounts is not None:
            _setter("volume_mounts", volume_mounts)
        if volumes is not None:
            _setter("volumes", volumes)

    @property
    @pulumi.getter
    def env(self) -> Optional[Sequence['_core.v1.outputs.EnvVarPatch']]:
        """
        Env defines the collection of EnvVar to inject into containers.
        """
        return pulumi.get(self, "env")

    @property
    @pulumi.getter(name="envFrom")
    def env_from(self) -> Optional[Sequence['_core.v1.outputs.EnvFromSourcePatch']]:
        """
        EnvFrom defines the collection of EnvFromSource to inject into containers.
        """
        return pulumi.get(self, "env_from")

    @property
    @pulumi.getter
    def selector(self) -> Optional['_meta.v1.outputs.LabelSelectorPatch']:
        """
        Selector is a label query over a set of resources, in this case pods. Required.
        """
        return pulumi.get(self, "selector")

    @property
    @pulumi.getter(name="volumeMounts")
    def volume_mounts(self) -> Optional[Sequence['_core.v1.outputs.VolumeMountPatch']]:
        """
        VolumeMounts defines the collection of VolumeMount to inject into containers.
        """
        return pulumi.get(self, "volume_mounts")

    @property
    @pulumi.getter
    def volumes(self) -> Optional[Sequence['_core.v1.outputs.VolumePatch']]:
        """
        Volumes defines the collection of Volume to inject into the pod.
        """
        return pulumi.get(self, "volumes")


