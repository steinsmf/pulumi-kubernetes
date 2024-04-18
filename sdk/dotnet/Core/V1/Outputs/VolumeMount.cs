// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Core.V1
{

    /// <summary>
    /// VolumeMount describes a mounting of a Volume within a container.
    /// </summary>
    [OutputType]
    public sealed class VolumeMount
    {
        /// <summary>
        /// Path within the container at which the volume should be mounted.  Must not contain ':'.
        /// </summary>
        public readonly string MountPath;
        /// <summary>
        /// mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10. When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified (which defaults to None).
        /// </summary>
        public readonly string MountPropagation;
        /// <summary>
        /// This must match the Name of a Volume.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
        /// </summary>
        public readonly bool ReadOnly;
        /// <summary>
        /// RecursiveReadOnly specifies whether read-only mounts should be handled recursively.
        /// 
        /// If ReadOnly is false, this field has no meaning and must be unspecified.
        /// 
        /// If ReadOnly is true, and this field is set to Disabled, the mount is not made recursively read-only.  If this field is set to IfPossible, the mount is made recursively read-only, if it is supported by the container runtime.  If this field is set to Enabled, the mount is made recursively read-only if it is supported by the container runtime, otherwise the pod will not be started and an error will be generated to indicate the reason.
        /// 
        /// If this field is set to IfPossible or Enabled, MountPropagation must be set to None (or be unspecified, which defaults to None).
        /// 
        /// If this field is not specified, it is treated as an equivalent of Disabled.
        /// </summary>
        public readonly string RecursiveReadOnly;
        /// <summary>
        /// Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
        /// </summary>
        public readonly string SubPath;
        /// <summary>
        /// Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
        /// </summary>
        public readonly string SubPathExpr;

        [OutputConstructor]
        private VolumeMount(
            string mountPath,

            string mountPropagation,

            string name,

            bool readOnly,

            string recursiveReadOnly,

            string subPath,

            string subPathExpr)
        {
            MountPath = mountPath;
            MountPropagation = mountPropagation;
            Name = name;
            ReadOnly = readOnly;
            RecursiveReadOnly = recursiveReadOnly;
            SubPath = subPath;
            SubPathExpr = subPathExpr;
        }
    }
}
