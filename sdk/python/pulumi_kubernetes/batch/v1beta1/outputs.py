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
from ... import batch as _batch
from ... import core as _core
from ... import meta as _meta

__all__ = [
    'CronJob',
    'CronJobSpec',
    'CronJobSpecPatch',
    'CronJobStatus',
    'CronJobStatusPatch',
    'JobTemplateSpec',
    'JobTemplateSpecPatch',
]

@pulumi.output_type
class CronJob(dict):
    """
    CronJob represents the configuration of a single cron job.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "apiVersion":
            suggest = "api_version"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CronJob. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CronJob.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CronJob.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 api_version: Optional[str] = None,
                 kind: Optional[str] = None,
                 metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
                 spec: Optional['outputs.CronJobSpec'] = None,
                 status: Optional['outputs.CronJobStatus'] = None):
        """
        CronJob represents the configuration of a single cron job.
        :param str api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param str kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param '_meta.v1.ObjectMetaArgs' metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param 'CronJobSpecArgs' spec: Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        :param 'CronJobStatusArgs' status: Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        CronJob._configure(
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
             spec: Optional['outputs.CronJobSpec'] = None,
             status: Optional['outputs.CronJobStatus'] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if api_version is None and 'apiVersion' in kwargs:
            api_version = kwargs['apiVersion']

        if api_version is not None:
            _setter("api_version", 'batch/v1beta1')
        if kind is not None:
            _setter("kind", 'CronJob')
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
        """
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> Optional['outputs.CronJobSpec']:
        """
        Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")

    @property
    @pulumi.getter
    def status(self) -> Optional['outputs.CronJobStatus']:
        """
        Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class CronJobSpec(dict):
    """
    CronJobSpec describes how the job execution will look like and when it will actually run.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "jobTemplate":
            suggest = "job_template"
        elif key == "concurrencyPolicy":
            suggest = "concurrency_policy"
        elif key == "failedJobsHistoryLimit":
            suggest = "failed_jobs_history_limit"
        elif key == "startingDeadlineSeconds":
            suggest = "starting_deadline_seconds"
        elif key == "successfulJobsHistoryLimit":
            suggest = "successful_jobs_history_limit"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CronJobSpec. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CronJobSpec.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CronJobSpec.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 job_template: 'outputs.JobTemplateSpec',
                 schedule: str,
                 concurrency_policy: Optional[str] = None,
                 failed_jobs_history_limit: Optional[int] = None,
                 starting_deadline_seconds: Optional[int] = None,
                 successful_jobs_history_limit: Optional[int] = None,
                 suspend: Optional[bool] = None):
        """
        CronJobSpec describes how the job execution will look like and when it will actually run.
        :param 'JobTemplateSpecArgs' job_template: Specifies the job that will be created when executing a CronJob.
        :param str schedule: The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        :param str concurrency_policy: Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        :param int failed_jobs_history_limit: The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
        :param int starting_deadline_seconds: Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        :param int successful_jobs_history_limit: The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
        :param bool suspend: This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        CronJobSpec._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            job_template=job_template,
            schedule=schedule,
            concurrency_policy=concurrency_policy,
            failed_jobs_history_limit=failed_jobs_history_limit,
            starting_deadline_seconds=starting_deadline_seconds,
            successful_jobs_history_limit=successful_jobs_history_limit,
            suspend=suspend,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             job_template: Optional['outputs.JobTemplateSpec'] = None,
             schedule: Optional[str] = None,
             concurrency_policy: Optional[str] = None,
             failed_jobs_history_limit: Optional[int] = None,
             starting_deadline_seconds: Optional[int] = None,
             successful_jobs_history_limit: Optional[int] = None,
             suspend: Optional[bool] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if job_template is None and 'jobTemplate' in kwargs:
            job_template = kwargs['jobTemplate']
        if job_template is None:
            raise TypeError("Missing 'job_template' argument")
        if schedule is None:
            raise TypeError("Missing 'schedule' argument")
        if concurrency_policy is None and 'concurrencyPolicy' in kwargs:
            concurrency_policy = kwargs['concurrencyPolicy']
        if failed_jobs_history_limit is None and 'failedJobsHistoryLimit' in kwargs:
            failed_jobs_history_limit = kwargs['failedJobsHistoryLimit']
        if starting_deadline_seconds is None and 'startingDeadlineSeconds' in kwargs:
            starting_deadline_seconds = kwargs['startingDeadlineSeconds']
        if successful_jobs_history_limit is None and 'successfulJobsHistoryLimit' in kwargs:
            successful_jobs_history_limit = kwargs['successfulJobsHistoryLimit']

        _setter("job_template", job_template)
        _setter("schedule", schedule)
        if concurrency_policy is not None:
            _setter("concurrency_policy", concurrency_policy)
        if failed_jobs_history_limit is not None:
            _setter("failed_jobs_history_limit", failed_jobs_history_limit)
        if starting_deadline_seconds is not None:
            _setter("starting_deadline_seconds", starting_deadline_seconds)
        if successful_jobs_history_limit is not None:
            _setter("successful_jobs_history_limit", successful_jobs_history_limit)
        if suspend is not None:
            _setter("suspend", suspend)

    @property
    @pulumi.getter(name="jobTemplate")
    def job_template(self) -> 'outputs.JobTemplateSpec':
        """
        Specifies the job that will be created when executing a CronJob.
        """
        return pulumi.get(self, "job_template")

    @property
    @pulumi.getter
    def schedule(self) -> str:
        """
        The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter(name="concurrencyPolicy")
    def concurrency_policy(self) -> Optional[str]:
        """
        Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        """
        return pulumi.get(self, "concurrency_policy")

    @property
    @pulumi.getter(name="failedJobsHistoryLimit")
    def failed_jobs_history_limit(self) -> Optional[int]:
        """
        The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
        """
        return pulumi.get(self, "failed_jobs_history_limit")

    @property
    @pulumi.getter(name="startingDeadlineSeconds")
    def starting_deadline_seconds(self) -> Optional[int]:
        """
        Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        """
        return pulumi.get(self, "starting_deadline_seconds")

    @property
    @pulumi.getter(name="successfulJobsHistoryLimit")
    def successful_jobs_history_limit(self) -> Optional[int]:
        """
        The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
        """
        return pulumi.get(self, "successful_jobs_history_limit")

    @property
    @pulumi.getter
    def suspend(self) -> Optional[bool]:
        """
        This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        return pulumi.get(self, "suspend")


@pulumi.output_type
class CronJobSpecPatch(dict):
    """
    CronJobSpec describes how the job execution will look like and when it will actually run.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "concurrencyPolicy":
            suggest = "concurrency_policy"
        elif key == "failedJobsHistoryLimit":
            suggest = "failed_jobs_history_limit"
        elif key == "jobTemplate":
            suggest = "job_template"
        elif key == "startingDeadlineSeconds":
            suggest = "starting_deadline_seconds"
        elif key == "successfulJobsHistoryLimit":
            suggest = "successful_jobs_history_limit"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CronJobSpecPatch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CronJobSpecPatch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CronJobSpecPatch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 concurrency_policy: Optional[str] = None,
                 failed_jobs_history_limit: Optional[int] = None,
                 job_template: Optional['outputs.JobTemplateSpecPatch'] = None,
                 schedule: Optional[str] = None,
                 starting_deadline_seconds: Optional[int] = None,
                 successful_jobs_history_limit: Optional[int] = None,
                 suspend: Optional[bool] = None):
        """
        CronJobSpec describes how the job execution will look like and when it will actually run.
        :param str concurrency_policy: Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        :param int failed_jobs_history_limit: The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
        :param 'JobTemplateSpecPatchArgs' job_template: Specifies the job that will be created when executing a CronJob.
        :param str schedule: The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        :param int starting_deadline_seconds: Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        :param int successful_jobs_history_limit: The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
        :param bool suspend: This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        CronJobSpecPatch._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            concurrency_policy=concurrency_policy,
            failed_jobs_history_limit=failed_jobs_history_limit,
            job_template=job_template,
            schedule=schedule,
            starting_deadline_seconds=starting_deadline_seconds,
            successful_jobs_history_limit=successful_jobs_history_limit,
            suspend=suspend,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             concurrency_policy: Optional[str] = None,
             failed_jobs_history_limit: Optional[int] = None,
             job_template: Optional['outputs.JobTemplateSpecPatch'] = None,
             schedule: Optional[str] = None,
             starting_deadline_seconds: Optional[int] = None,
             successful_jobs_history_limit: Optional[int] = None,
             suspend: Optional[bool] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if concurrency_policy is None and 'concurrencyPolicy' in kwargs:
            concurrency_policy = kwargs['concurrencyPolicy']
        if failed_jobs_history_limit is None and 'failedJobsHistoryLimit' in kwargs:
            failed_jobs_history_limit = kwargs['failedJobsHistoryLimit']
        if job_template is None and 'jobTemplate' in kwargs:
            job_template = kwargs['jobTemplate']
        if starting_deadline_seconds is None and 'startingDeadlineSeconds' in kwargs:
            starting_deadline_seconds = kwargs['startingDeadlineSeconds']
        if successful_jobs_history_limit is None and 'successfulJobsHistoryLimit' in kwargs:
            successful_jobs_history_limit = kwargs['successfulJobsHistoryLimit']

        if concurrency_policy is not None:
            _setter("concurrency_policy", concurrency_policy)
        if failed_jobs_history_limit is not None:
            _setter("failed_jobs_history_limit", failed_jobs_history_limit)
        if job_template is not None:
            _setter("job_template", job_template)
        if schedule is not None:
            _setter("schedule", schedule)
        if starting_deadline_seconds is not None:
            _setter("starting_deadline_seconds", starting_deadline_seconds)
        if successful_jobs_history_limit is not None:
            _setter("successful_jobs_history_limit", successful_jobs_history_limit)
        if suspend is not None:
            _setter("suspend", suspend)

    @property
    @pulumi.getter(name="concurrencyPolicy")
    def concurrency_policy(self) -> Optional[str]:
        """
        Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        """
        return pulumi.get(self, "concurrency_policy")

    @property
    @pulumi.getter(name="failedJobsHistoryLimit")
    def failed_jobs_history_limit(self) -> Optional[int]:
        """
        The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
        """
        return pulumi.get(self, "failed_jobs_history_limit")

    @property
    @pulumi.getter(name="jobTemplate")
    def job_template(self) -> Optional['outputs.JobTemplateSpecPatch']:
        """
        Specifies the job that will be created when executing a CronJob.
        """
        return pulumi.get(self, "job_template")

    @property
    @pulumi.getter
    def schedule(self) -> Optional[str]:
        """
        The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter(name="startingDeadlineSeconds")
    def starting_deadline_seconds(self) -> Optional[int]:
        """
        Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        """
        return pulumi.get(self, "starting_deadline_seconds")

    @property
    @pulumi.getter(name="successfulJobsHistoryLimit")
    def successful_jobs_history_limit(self) -> Optional[int]:
        """
        The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
        """
        return pulumi.get(self, "successful_jobs_history_limit")

    @property
    @pulumi.getter
    def suspend(self) -> Optional[bool]:
        """
        This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        return pulumi.get(self, "suspend")


@pulumi.output_type
class CronJobStatus(dict):
    """
    CronJobStatus represents the current state of a cron job.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "lastScheduleTime":
            suggest = "last_schedule_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CronJobStatus. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CronJobStatus.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CronJobStatus.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 active: Optional[Sequence['_core.v1.outputs.ObjectReference']] = None,
                 last_schedule_time: Optional[str] = None):
        """
        CronJobStatus represents the current state of a cron job.
        :param Sequence['_core.v1.ObjectReferenceArgs'] active: A list of pointers to currently running jobs.
        :param str last_schedule_time: Information when was the last time the job was successfully scheduled.
        """
        CronJobStatus._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            active=active,
            last_schedule_time=last_schedule_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             active: Optional[Sequence['_core.v1.outputs.ObjectReference']] = None,
             last_schedule_time: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if last_schedule_time is None and 'lastScheduleTime' in kwargs:
            last_schedule_time = kwargs['lastScheduleTime']

        if active is not None:
            _setter("active", active)
        if last_schedule_time is not None:
            _setter("last_schedule_time", last_schedule_time)

    @property
    @pulumi.getter
    def active(self) -> Optional[Sequence['_core.v1.outputs.ObjectReference']]:
        """
        A list of pointers to currently running jobs.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="lastScheduleTime")
    def last_schedule_time(self) -> Optional[str]:
        """
        Information when was the last time the job was successfully scheduled.
        """
        return pulumi.get(self, "last_schedule_time")


@pulumi.output_type
class CronJobStatusPatch(dict):
    """
    CronJobStatus represents the current state of a cron job.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "lastScheduleTime":
            suggest = "last_schedule_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CronJobStatusPatch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CronJobStatusPatch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CronJobStatusPatch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 active: Optional[Sequence['_core.v1.outputs.ObjectReferencePatch']] = None,
                 last_schedule_time: Optional[str] = None):
        """
        CronJobStatus represents the current state of a cron job.
        :param Sequence['_core.v1.ObjectReferencePatchArgs'] active: A list of pointers to currently running jobs.
        :param str last_schedule_time: Information when was the last time the job was successfully scheduled.
        """
        CronJobStatusPatch._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            active=active,
            last_schedule_time=last_schedule_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             active: Optional[Sequence['_core.v1.outputs.ObjectReferencePatch']] = None,
             last_schedule_time: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if last_schedule_time is None and 'lastScheduleTime' in kwargs:
            last_schedule_time = kwargs['lastScheduleTime']

        if active is not None:
            _setter("active", active)
        if last_schedule_time is not None:
            _setter("last_schedule_time", last_schedule_time)

    @property
    @pulumi.getter
    def active(self) -> Optional[Sequence['_core.v1.outputs.ObjectReferencePatch']]:
        """
        A list of pointers to currently running jobs.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="lastScheduleTime")
    def last_schedule_time(self) -> Optional[str]:
        """
        Information when was the last time the job was successfully scheduled.
        """
        return pulumi.get(self, "last_schedule_time")


@pulumi.output_type
class JobTemplateSpec(dict):
    """
    JobTemplateSpec describes the data a Job should have when created from a template
    """
    def __init__(__self__, *,
                 metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
                 spec: Optional['_batch.v1.outputs.JobSpec'] = None):
        """
        JobTemplateSpec describes the data a Job should have when created from a template
        :param '_meta.v1.ObjectMetaArgs' metadata: Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param '_batch.v1.JobSpecArgs' spec: Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        JobTemplateSpec._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            metadata=metadata,
            spec=spec,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
             spec: Optional['_batch.v1.outputs.JobSpec'] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        if metadata is not None:
            _setter("metadata", metadata)
        if spec is not None:
            _setter("spec", spec)

    @property
    @pulumi.getter
    def metadata(self) -> Optional['_meta.v1.outputs.ObjectMeta']:
        """
        Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> Optional['_batch.v1.outputs.JobSpec']:
        """
        Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")


@pulumi.output_type
class JobTemplateSpecPatch(dict):
    """
    JobTemplateSpec describes the data a Job should have when created from a template
    """
    def __init__(__self__, *,
                 metadata: Optional['_meta.v1.outputs.ObjectMetaPatch'] = None,
                 spec: Optional['_batch.v1.outputs.JobSpecPatch'] = None):
        """
        JobTemplateSpec describes the data a Job should have when created from a template
        :param '_meta.v1.ObjectMetaPatchArgs' metadata: Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param '_batch.v1.JobSpecPatchArgs' spec: Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        JobTemplateSpecPatch._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            metadata=metadata,
            spec=spec,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             metadata: Optional['_meta.v1.outputs.ObjectMetaPatch'] = None,
             spec: Optional['_batch.v1.outputs.JobSpecPatch'] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        if metadata is not None:
            _setter("metadata", metadata)
        if spec is not None:
            _setter("spec", spec)

    @property
    @pulumi.getter
    def metadata(self) -> Optional['_meta.v1.outputs.ObjectMetaPatch']:
        """
        Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> Optional['_batch.v1.outputs.JobSpecPatch']:
        """
        Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")


