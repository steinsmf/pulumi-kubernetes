// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.AppArmorProfilePatch;
import com.pulumi.kubernetes.core.v1.outputs.CapabilitiesPatch;
import com.pulumi.kubernetes.core.v1.outputs.SELinuxOptionsPatch;
import com.pulumi.kubernetes.core.v1.outputs.SeccompProfilePatch;
import com.pulumi.kubernetes.core.v1.outputs.WindowsSecurityContextOptionsPatch;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityContextPatch {
    /**
     * @return AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable Boolean allowPrivilegeEscalation;
    /**
     * @return appArmorProfile is the AppArmor options to use by this container. If set, this profile overrides the pod&#39;s appArmorProfile. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable AppArmorProfilePatch appArmorProfile;
    /**
     * @return The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable CapabilitiesPatch capabilities;
    /**
     * @return Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable Boolean privileged;
    /**
     * @return procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable String procMount;
    /**
     * @return Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable Boolean readOnlyRootFilesystem;
    /**
     * @return The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable Integer runAsGroup;
    /**
     * @return Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    private @Nullable Boolean runAsNonRoot;
    /**
     * @return The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable Integer runAsUser;
    /**
     * @return The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable SELinuxOptionsPatch seLinuxOptions;
    /**
     * @return The seccomp options to use by this container. If seccomp options are provided at both the pod &amp; container level, the container options override the pod options. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private @Nullable SeccompProfilePatch seccompProfile;
    /**
     * @return The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    private @Nullable WindowsSecurityContextOptionsPatch windowsOptions;

    private SecurityContextPatch() {}
    /**
     * @return AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Boolean> allowPrivilegeEscalation() {
        return Optional.ofNullable(this.allowPrivilegeEscalation);
    }
    /**
     * @return appArmorProfile is the AppArmor options to use by this container. If set, this profile overrides the pod&#39;s appArmorProfile. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<AppArmorProfilePatch> appArmorProfile() {
        return Optional.ofNullable(this.appArmorProfile);
    }
    /**
     * @return The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<CapabilitiesPatch> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }
    /**
     * @return Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Boolean> privileged() {
        return Optional.ofNullable(this.privileged);
    }
    /**
     * @return procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<String> procMount() {
        return Optional.ofNullable(this.procMount);
    }
    /**
     * @return Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Boolean> readOnlyRootFilesystem() {
        return Optional.ofNullable(this.readOnlyRootFilesystem);
    }
    /**
     * @return The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Integer> runAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }
    /**
     * @return Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    public Optional<Boolean> runAsNonRoot() {
        return Optional.ofNullable(this.runAsNonRoot);
    }
    /**
     * @return The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Integer> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }
    /**
     * @return The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<SELinuxOptionsPatch> seLinuxOptions() {
        return Optional.ofNullable(this.seLinuxOptions);
    }
    /**
     * @return The seccomp options to use by this container. If seccomp options are provided at both the pod &amp; container level, the container options override the pod options. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<SeccompProfilePatch> seccompProfile() {
        return Optional.ofNullable(this.seccompProfile);
    }
    /**
     * @return The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    public Optional<WindowsSecurityContextOptionsPatch> windowsOptions() {
        return Optional.ofNullable(this.windowsOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContextPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowPrivilegeEscalation;
        private @Nullable AppArmorProfilePatch appArmorProfile;
        private @Nullable CapabilitiesPatch capabilities;
        private @Nullable Boolean privileged;
        private @Nullable String procMount;
        private @Nullable Boolean readOnlyRootFilesystem;
        private @Nullable Integer runAsGroup;
        private @Nullable Boolean runAsNonRoot;
        private @Nullable Integer runAsUser;
        private @Nullable SELinuxOptionsPatch seLinuxOptions;
        private @Nullable SeccompProfilePatch seccompProfile;
        private @Nullable WindowsSecurityContextOptionsPatch windowsOptions;
        public Builder() {}
        public Builder(SecurityContextPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPrivilegeEscalation = defaults.allowPrivilegeEscalation;
    	      this.appArmorProfile = defaults.appArmorProfile;
    	      this.capabilities = defaults.capabilities;
    	      this.privileged = defaults.privileged;
    	      this.procMount = defaults.procMount;
    	      this.readOnlyRootFilesystem = defaults.readOnlyRootFilesystem;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsNonRoot = defaults.runAsNonRoot;
    	      this.runAsUser = defaults.runAsUser;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
    	      this.seccompProfile = defaults.seccompProfile;
    	      this.windowsOptions = defaults.windowsOptions;
        }

        @CustomType.Setter
        public Builder allowPrivilegeEscalation(@Nullable Boolean allowPrivilegeEscalation) {

            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }
        @CustomType.Setter
        public Builder appArmorProfile(@Nullable AppArmorProfilePatch appArmorProfile) {

            this.appArmorProfile = appArmorProfile;
            return this;
        }
        @CustomType.Setter
        public Builder capabilities(@Nullable CapabilitiesPatch capabilities) {

            this.capabilities = capabilities;
            return this;
        }
        @CustomType.Setter
        public Builder privileged(@Nullable Boolean privileged) {

            this.privileged = privileged;
            return this;
        }
        @CustomType.Setter
        public Builder procMount(@Nullable String procMount) {

            this.procMount = procMount;
            return this;
        }
        @CustomType.Setter
        public Builder readOnlyRootFilesystem(@Nullable Boolean readOnlyRootFilesystem) {

            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        @CustomType.Setter
        public Builder runAsGroup(@Nullable Integer runAsGroup) {

            this.runAsGroup = runAsGroup;
            return this;
        }
        @CustomType.Setter
        public Builder runAsNonRoot(@Nullable Boolean runAsNonRoot) {

            this.runAsNonRoot = runAsNonRoot;
            return this;
        }
        @CustomType.Setter
        public Builder runAsUser(@Nullable Integer runAsUser) {

            this.runAsUser = runAsUser;
            return this;
        }
        @CustomType.Setter
        public Builder seLinuxOptions(@Nullable SELinuxOptionsPatch seLinuxOptions) {

            this.seLinuxOptions = seLinuxOptions;
            return this;
        }
        @CustomType.Setter
        public Builder seccompProfile(@Nullable SeccompProfilePatch seccompProfile) {

            this.seccompProfile = seccompProfile;
            return this;
        }
        @CustomType.Setter
        public Builder windowsOptions(@Nullable WindowsSecurityContextOptionsPatch windowsOptions) {

            this.windowsOptions = windowsOptions;
            return this;
        }
        public SecurityContextPatch build() {
            final var _resultValue = new SecurityContextPatch();
            _resultValue.allowPrivilegeEscalation = allowPrivilegeEscalation;
            _resultValue.appArmorProfile = appArmorProfile;
            _resultValue.capabilities = capabilities;
            _resultValue.privileged = privileged;
            _resultValue.procMount = procMount;
            _resultValue.readOnlyRootFilesystem = readOnlyRootFilesystem;
            _resultValue.runAsGroup = runAsGroup;
            _resultValue.runAsNonRoot = runAsNonRoot;
            _resultValue.runAsUser = runAsUser;
            _resultValue.seLinuxOptions = seLinuxOptions;
            _resultValue.seccompProfile = seccompProfile;
            _resultValue.windowsOptions = windowsOptions;
            return _resultValue;
        }
    }
}
