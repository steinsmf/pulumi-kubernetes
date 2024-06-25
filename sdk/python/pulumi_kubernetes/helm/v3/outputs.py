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

__all__ = [
    'ReleaseStatus',
    'RepositoryOpts',
]

@pulumi.output_type
class ReleaseStatus(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "appVersion":
            suggest = "app_version"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ReleaseStatus. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ReleaseStatus.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ReleaseStatus.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 status: str,
                 app_version: Optional[str] = None,
                 chart: Optional[str] = None,
                 name: Optional[str] = None,
                 namespace: Optional[str] = None,
                 revision: Optional[int] = None,
                 version: Optional[str] = None):
        """
        :param str status: Status of the release.
        :param str app_version: The version number of the application being deployed.
        :param str chart: The name of the chart.
        :param str name: Name is the name of the release.
        :param str namespace: Namespace is the kubernetes namespace of the release.
        :param int revision: Version is an int32 which represents the version of the release.
        :param str version: A SemVer 2 conformant version string of the chart.
        """
        pulumi.set(__self__, "status", status)
        if app_version is not None:
            pulumi.set(__self__, "app_version", app_version)
        if chart is not None:
            pulumi.set(__self__, "chart", chart)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if revision is not None:
            pulumi.set(__self__, "revision", revision)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the release.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="appVersion")
    def app_version(self) -> Optional[str]:
        """
        The version number of the application being deployed.
        """
        return pulumi.get(self, "app_version")

    @property
    @pulumi.getter
    def chart(self) -> Optional[str]:
        """
        The name of the chart.
        """
        return pulumi.get(self, "chart")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name is the name of the release.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        """
        Namespace is the kubernetes namespace of the release.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def revision(self) -> Optional[int]:
        """
        Version is an int32 which represents the version of the release.
        """
        return pulumi.get(self, "revision")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        """
        A SemVer 2 conformant version string of the chart.
        """
        return pulumi.get(self, "version")


@pulumi.output_type
class RepositoryOpts(dict):
    """
    Specification defining the Helm chart repository to use.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "caFile":
            suggest = "ca_file"
        elif key == "certFile":
            suggest = "cert_file"
        elif key == "keyFile":
            suggest = "key_file"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryOpts. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryOpts.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryOpts.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ca_file: Optional[str] = None,
                 cert_file: Optional[str] = None,
                 key_file: Optional[str] = None,
                 password: Optional[str] = None,
                 repo: Optional[str] = None,
                 username: Optional[str] = None):
        """
        Specification defining the Helm chart repository to use.
        :param str ca_file: The Repository's CA File
        :param str cert_file: The repository's cert file
        :param str key_file: The repository's cert key file
        :param str password: Password for HTTP basic authentication
        :param str repo: Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
        :param str username: Username for HTTP basic authentication
        """
        if ca_file is not None:
            pulumi.set(__self__, "ca_file", ca_file)
        if cert_file is not None:
            pulumi.set(__self__, "cert_file", cert_file)
        if key_file is not None:
            pulumi.set(__self__, "key_file", key_file)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if repo is not None:
            pulumi.set(__self__, "repo", repo)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="caFile")
    def ca_file(self) -> Optional[str]:
        """
        The Repository's CA File
        """
        return pulumi.get(self, "ca_file")

    @property
    @pulumi.getter(name="certFile")
    def cert_file(self) -> Optional[str]:
        """
        The repository's cert file
        """
        return pulumi.get(self, "cert_file")

    @property
    @pulumi.getter(name="keyFile")
    def key_file(self) -> Optional[str]:
        """
        The repository's cert key file
        """
        return pulumi.get(self, "key_file")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        """
        Password for HTTP basic authentication
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def repo(self) -> Optional[str]:
        """
        Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
        """
        return pulumi.get(self, "repo")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        """
        Username for HTTP basic authentication
        """
        return pulumi.get(self, "username")


