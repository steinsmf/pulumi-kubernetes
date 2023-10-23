# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from ... import _utilities
from ... import batch as _batch
from ... import core as _core
from ... import meta as _meta

__all__ = [
    'CronJobSpecPatchArgs',
    'CronJobSpecArgs',
    'CronJobStatusArgs',
    'CronJobArgs',
    'JobTemplateSpecPatchArgs',
    'JobTemplateSpecArgs',
]

@pulumi.input_type
class CronJobSpecPatchArgs:
    def __init__(__self__, *,
                 concurrency_policy: Optional[pulumi.Input[str]] = None,
                 failed_jobs_history_limit: Optional[pulumi.Input[int]] = None,
                 job_template: Optional[pulumi.Input['JobTemplateSpecPatchArgs']] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 starting_deadline_seconds: Optional[pulumi.Input[int]] = None,
                 successful_jobs_history_limit: Optional[pulumi.Input[int]] = None,
                 suspend: Optional[pulumi.Input[bool]] = None):
        """
        CronJobSpec describes how the job execution will look like and when it will actually run.
        :param pulumi.Input[str] concurrency_policy: Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        :param pulumi.Input[int] failed_jobs_history_limit: The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        :param pulumi.Input['JobTemplateSpecPatchArgs'] job_template: Specifies the job that will be created when executing a CronJob.
        :param pulumi.Input[str] schedule: The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        :param pulumi.Input[int] starting_deadline_seconds: Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        :param pulumi.Input[int] successful_jobs_history_limit: The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        :param pulumi.Input[bool] suspend: This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        CronJobSpecPatchArgs._configure(
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
             concurrency_policy: Optional[pulumi.Input[str]] = None,
             failed_jobs_history_limit: Optional[pulumi.Input[int]] = None,
             job_template: Optional[pulumi.Input['JobTemplateSpecPatchArgs']] = None,
             schedule: Optional[pulumi.Input[str]] = None,
             starting_deadline_seconds: Optional[pulumi.Input[int]] = None,
             successful_jobs_history_limit: Optional[pulumi.Input[int]] = None,
             suspend: Optional[pulumi.Input[bool]] = None,
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
    def concurrency_policy(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        """
        return pulumi.get(self, "concurrency_policy")

    @concurrency_policy.setter
    def concurrency_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "concurrency_policy", value)

    @property
    @pulumi.getter(name="failedJobsHistoryLimit")
    def failed_jobs_history_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        """
        return pulumi.get(self, "failed_jobs_history_limit")

    @failed_jobs_history_limit.setter
    def failed_jobs_history_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "failed_jobs_history_limit", value)

    @property
    @pulumi.getter(name="jobTemplate")
    def job_template(self) -> Optional[pulumi.Input['JobTemplateSpecPatchArgs']]:
        """
        Specifies the job that will be created when executing a CronJob.
        """
        return pulumi.get(self, "job_template")

    @job_template.setter
    def job_template(self, value: Optional[pulumi.Input['JobTemplateSpecPatchArgs']]):
        pulumi.set(self, "job_template", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="startingDeadlineSeconds")
    def starting_deadline_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        """
        return pulumi.get(self, "starting_deadline_seconds")

    @starting_deadline_seconds.setter
    def starting_deadline_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "starting_deadline_seconds", value)

    @property
    @pulumi.getter(name="successfulJobsHistoryLimit")
    def successful_jobs_history_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        """
        return pulumi.get(self, "successful_jobs_history_limit")

    @successful_jobs_history_limit.setter
    def successful_jobs_history_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "successful_jobs_history_limit", value)

    @property
    @pulumi.getter
    def suspend(self) -> Optional[pulumi.Input[bool]]:
        """
        This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        return pulumi.get(self, "suspend")

    @suspend.setter
    def suspend(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "suspend", value)


@pulumi.input_type
class CronJobSpecArgs:
    def __init__(__self__, *,
                 job_template: pulumi.Input['JobTemplateSpecArgs'],
                 schedule: pulumi.Input[str],
                 concurrency_policy: Optional[pulumi.Input[str]] = None,
                 failed_jobs_history_limit: Optional[pulumi.Input[int]] = None,
                 starting_deadline_seconds: Optional[pulumi.Input[int]] = None,
                 successful_jobs_history_limit: Optional[pulumi.Input[int]] = None,
                 suspend: Optional[pulumi.Input[bool]] = None):
        """
        CronJobSpec describes how the job execution will look like and when it will actually run.
        :param pulumi.Input['JobTemplateSpecArgs'] job_template: Specifies the job that will be created when executing a CronJob.
        :param pulumi.Input[str] schedule: The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        :param pulumi.Input[str] concurrency_policy: Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        :param pulumi.Input[int] failed_jobs_history_limit: The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        :param pulumi.Input[int] starting_deadline_seconds: Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        :param pulumi.Input[int] successful_jobs_history_limit: The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        :param pulumi.Input[bool] suspend: This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        CronJobSpecArgs._configure(
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
             job_template: Optional[pulumi.Input['JobTemplateSpecArgs']] = None,
             schedule: Optional[pulumi.Input[str]] = None,
             concurrency_policy: Optional[pulumi.Input[str]] = None,
             failed_jobs_history_limit: Optional[pulumi.Input[int]] = None,
             starting_deadline_seconds: Optional[pulumi.Input[int]] = None,
             successful_jobs_history_limit: Optional[pulumi.Input[int]] = None,
             suspend: Optional[pulumi.Input[bool]] = None,
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
    def job_template(self) -> pulumi.Input['JobTemplateSpecArgs']:
        """
        Specifies the job that will be created when executing a CronJob.
        """
        return pulumi.get(self, "job_template")

    @job_template.setter
    def job_template(self, value: pulumi.Input['JobTemplateSpecArgs']):
        pulumi.set(self, "job_template", value)

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Input[str]:
        """
        The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: pulumi.Input[str]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="concurrencyPolicy")
    def concurrency_policy(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        """
        return pulumi.get(self, "concurrency_policy")

    @concurrency_policy.setter
    def concurrency_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "concurrency_policy", value)

    @property
    @pulumi.getter(name="failedJobsHistoryLimit")
    def failed_jobs_history_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        """
        return pulumi.get(self, "failed_jobs_history_limit")

    @failed_jobs_history_limit.setter
    def failed_jobs_history_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "failed_jobs_history_limit", value)

    @property
    @pulumi.getter(name="startingDeadlineSeconds")
    def starting_deadline_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        """
        return pulumi.get(self, "starting_deadline_seconds")

    @starting_deadline_seconds.setter
    def starting_deadline_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "starting_deadline_seconds", value)

    @property
    @pulumi.getter(name="successfulJobsHistoryLimit")
    def successful_jobs_history_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        """
        return pulumi.get(self, "successful_jobs_history_limit")

    @successful_jobs_history_limit.setter
    def successful_jobs_history_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "successful_jobs_history_limit", value)

    @property
    @pulumi.getter
    def suspend(self) -> Optional[pulumi.Input[bool]]:
        """
        This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        """
        return pulumi.get(self, "suspend")

    @suspend.setter
    def suspend(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "suspend", value)


@pulumi.input_type
class CronJobStatusArgs:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[Sequence[pulumi.Input['_core.v1.ObjectReferenceArgs']]]] = None,
                 last_schedule_time: Optional[pulumi.Input[str]] = None):
        """
        CronJobStatus represents the current state of a cron job.
        :param pulumi.Input[Sequence[pulumi.Input['_core.v1.ObjectReferenceArgs']]] active: A list of pointers to currently running jobs.
        :param pulumi.Input[str] last_schedule_time: Information when was the last time the job was successfully scheduled.
        """
        CronJobStatusArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            active=active,
            last_schedule_time=last_schedule_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             active: Optional[pulumi.Input[Sequence[pulumi.Input['_core.v1.ObjectReferenceArgs']]]] = None,
             last_schedule_time: Optional[pulumi.Input[str]] = None,
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
    def active(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['_core.v1.ObjectReferenceArgs']]]]:
        """
        A list of pointers to currently running jobs.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['_core.v1.ObjectReferenceArgs']]]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="lastScheduleTime")
    def last_schedule_time(self) -> Optional[pulumi.Input[str]]:
        """
        Information when was the last time the job was successfully scheduled.
        """
        return pulumi.get(self, "last_schedule_time")

    @last_schedule_time.setter
    def last_schedule_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_schedule_time", value)


@pulumi.input_type
class CronJobArgs:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
                 spec: Optional[pulumi.Input['CronJobSpecArgs']] = None,
                 status: Optional[pulumi.Input['CronJobStatusArgs']] = None):
        """
        CronJob represents the configuration of a single cron job.
        :param pulumi.Input[str] api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param pulumi.Input[str] kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param pulumi.Input['_meta.v1.ObjectMetaArgs'] metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input['CronJobSpecArgs'] spec: Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        :param pulumi.Input['CronJobStatusArgs'] status: Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        CronJobArgs._configure(
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
             api_version: Optional[pulumi.Input[str]] = None,
             kind: Optional[pulumi.Input[str]] = None,
             metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
             spec: Optional[pulumi.Input['CronJobSpecArgs']] = None,
             status: Optional[pulumi.Input['CronJobStatusArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if api_version is None and 'apiVersion' in kwargs:
            api_version = kwargs['apiVersion']

        if api_version is not None:
            _setter("api_version", 'batch/v2alpha1')
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
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['CronJobSpecArgs']]:
        """
        Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['CronJobSpecArgs']]):
        pulumi.set(self, "spec", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input['CronJobStatusArgs']]:
        """
        Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input['CronJobStatusArgs']]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class JobTemplateSpecPatchArgs:
    def __init__(__self__, *,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']] = None,
                 spec: Optional[pulumi.Input['_batch.v1.JobSpecPatchArgs']] = None):
        """
        JobTemplateSpec describes the data a Job should have when created from a template
        :param pulumi.Input['_meta.v1.ObjectMetaPatchArgs'] metadata: Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input['_batch.v1.JobSpecPatchArgs'] spec: Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        JobTemplateSpecPatchArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            metadata=metadata,
            spec=spec,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']] = None,
             spec: Optional[pulumi.Input['_batch.v1.JobSpecPatchArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        if metadata is not None:
            _setter("metadata", metadata)
        if spec is not None:
            _setter("spec", spec)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']]:
        """
        Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaPatchArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['_batch.v1.JobSpecPatchArgs']]:
        """
        Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['_batch.v1.JobSpecPatchArgs']]):
        pulumi.set(self, "spec", value)


@pulumi.input_type
class JobTemplateSpecArgs:
    def __init__(__self__, *,
                 metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
                 spec: Optional[pulumi.Input['_batch.v1.JobSpecArgs']] = None):
        """
        JobTemplateSpec describes the data a Job should have when created from a template
        :param pulumi.Input['_meta.v1.ObjectMetaArgs'] metadata: Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input['_batch.v1.JobSpecArgs'] spec: Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        JobTemplateSpecArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            metadata=metadata,
            spec=spec,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             metadata: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']] = None,
             spec: Optional[pulumi.Input['_batch.v1.JobSpecArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        if metadata is not None:
            _setter("metadata", metadata)
        if spec is not None:
            _setter("spec", spec)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]:
        """
        Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['_meta.v1.ObjectMetaArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['_batch.v1.JobSpecArgs']]:
        """
        Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['_batch.v1.JobSpecArgs']]):
        pulumi.set(self, "spec", value)


