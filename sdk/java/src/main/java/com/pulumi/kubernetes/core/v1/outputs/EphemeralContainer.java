// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.outputs.ContainerPort;
import com.pulumi.kubernetes.core.v1.outputs.ContainerResizePolicy;
import com.pulumi.kubernetes.core.v1.outputs.EnvFromSource;
import com.pulumi.kubernetes.core.v1.outputs.EnvVar;
import com.pulumi.kubernetes.core.v1.outputs.Lifecycle;
import com.pulumi.kubernetes.core.v1.outputs.Probe;
import com.pulumi.kubernetes.core.v1.outputs.ResourceRequirements;
import com.pulumi.kubernetes.core.v1.outputs.SecurityContext;
import com.pulumi.kubernetes.core.v1.outputs.VolumeDevice;
import com.pulumi.kubernetes.core.v1.outputs.VolumeMount;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EphemeralContainer {
    /**
     * @return Arguments to the entrypoint. The image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private @Nullable List<String> args;
    /**
     * @return Entrypoint array. Not executed within a shell. The image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private @Nullable List<String> command;
    /**
     * @return List of environment variables to set in the container. Cannot be updated.
     * 
     */
    private @Nullable List<EnvVar> env;
    /**
     * @return List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    private @Nullable List<EnvFromSource> envFrom;
    /**
     * @return Container image name. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    private @Nullable String image;
    /**
     * @return Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    private @Nullable String imagePullPolicy;
    /**
     * @return Lifecycle is not allowed for ephemeral containers.
     * 
     */
    private @Nullable Lifecycle lifecycle;
    /**
     * @return Probes are not allowed for ephemeral containers.
     * 
     */
    private @Nullable Probe livenessProbe;
    /**
     * @return Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
     * 
     */
    private String name;
    /**
     * @return Ports are not allowed for ephemeral containers.
     * 
     */
    private @Nullable List<ContainerPort> ports;
    /**
     * @return Probes are not allowed for ephemeral containers.
     * 
     */
    private @Nullable Probe readinessProbe;
    /**
     * @return Resources resize policy for the container.
     * 
     */
    private @Nullable List<ContainerResizePolicy> resizePolicy;
    /**
     * @return Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
     * 
     */
    private @Nullable ResourceRequirements resources;
    /**
     * @return Restart policy for the container to manage the restart behavior of each container within a pod. This may only be set for init containers. You cannot set this field on ephemeral containers.
     * 
     */
    private @Nullable String restartPolicy;
    /**
     * @return Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * 
     */
    private @Nullable SecurityContext securityContext;
    /**
     * @return Probes are not allowed for ephemeral containers.
     * 
     */
    private @Nullable Probe startupProbe;
    /**
     * @return Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    private @Nullable Boolean stdin;
    /**
     * @return Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    private @Nullable Boolean stdinOnce;
    /**
     * @return If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
     * 
     * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
     * 
     */
    private @Nullable String targetContainerName;
    /**
     * @return Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    private @Nullable String terminationMessagePath;
    /**
     * @return Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    private @Nullable String terminationMessagePolicy;
    /**
     * @return Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
     * 
     */
    private @Nullable Boolean tty;
    /**
     * @return volumeDevices is the list of block devices to be used by the container.
     * 
     */
    private @Nullable List<VolumeDevice> volumeDevices;
    /**
     * @return Pod volumes to mount into the container&#39;s filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
     * 
     */
    private @Nullable List<VolumeMount> volumeMounts;
    /**
     * @return Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    private @Nullable String workingDir;

    private EphemeralContainer() {}
    /**
     * @return Arguments to the entrypoint. The image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return Entrypoint array. Not executed within a shell. The image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public List<String> command() {
        return this.command == null ? List.of() : this.command;
    }
    /**
     * @return List of environment variables to set in the container. Cannot be updated.
     * 
     */
    public List<EnvVar> env() {
        return this.env == null ? List.of() : this.env;
    }
    /**
     * @return List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    public List<EnvFromSource> envFrom() {
        return this.envFrom == null ? List.of() : this.envFrom;
    }
    /**
     * @return Container image name. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    public Optional<String> imagePullPolicy() {
        return Optional.ofNullable(this.imagePullPolicy);
    }
    /**
     * @return Lifecycle is not allowed for ephemeral containers.
     * 
     */
    public Optional<Lifecycle> lifecycle() {
        return Optional.ofNullable(this.lifecycle);
    }
    /**
     * @return Probes are not allowed for ephemeral containers.
     * 
     */
    public Optional<Probe> livenessProbe() {
        return Optional.ofNullable(this.livenessProbe);
    }
    /**
     * @return Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Ports are not allowed for ephemeral containers.
     * 
     */
    public List<ContainerPort> ports() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * @return Probes are not allowed for ephemeral containers.
     * 
     */
    public Optional<Probe> readinessProbe() {
        return Optional.ofNullable(this.readinessProbe);
    }
    /**
     * @return Resources resize policy for the container.
     * 
     */
    public List<ContainerResizePolicy> resizePolicy() {
        return this.resizePolicy == null ? List.of() : this.resizePolicy;
    }
    /**
     * @return Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
     * 
     */
    public Optional<ResourceRequirements> resources() {
        return Optional.ofNullable(this.resources);
    }
    /**
     * @return Restart policy for the container to manage the restart behavior of each container within a pod. This may only be set for init containers. You cannot set this field on ephemeral containers.
     * 
     */
    public Optional<String> restartPolicy() {
        return Optional.ofNullable(this.restartPolicy);
    }
    /**
     * @return Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * 
     */
    public Optional<SecurityContext> securityContext() {
        return Optional.ofNullable(this.securityContext);
    }
    /**
     * @return Probes are not allowed for ephemeral containers.
     * 
     */
    public Optional<Probe> startupProbe() {
        return Optional.ofNullable(this.startupProbe);
    }
    /**
     * @return Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    public Optional<Boolean> stdin() {
        return Optional.ofNullable(this.stdin);
    }
    /**
     * @return Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    public Optional<Boolean> stdinOnce() {
        return Optional.ofNullable(this.stdinOnce);
    }
    /**
     * @return If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
     * 
     * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
     * 
     */
    public Optional<String> targetContainerName() {
        return Optional.ofNullable(this.targetContainerName);
    }
    /**
     * @return Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    public Optional<String> terminationMessagePath() {
        return Optional.ofNullable(this.terminationMessagePath);
    }
    /**
     * @return Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    public Optional<String> terminationMessagePolicy() {
        return Optional.ofNullable(this.terminationMessagePolicy);
    }
    /**
     * @return Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
     * 
     */
    public Optional<Boolean> tty() {
        return Optional.ofNullable(this.tty);
    }
    /**
     * @return volumeDevices is the list of block devices to be used by the container.
     * 
     */
    public List<VolumeDevice> volumeDevices() {
        return this.volumeDevices == null ? List.of() : this.volumeDevices;
    }
    /**
     * @return Pod volumes to mount into the container&#39;s filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
     * 
     */
    public List<VolumeMount> volumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }
    /**
     * @return Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    public Optional<String> workingDir() {
        return Optional.ofNullable(this.workingDir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EphemeralContainer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> command;
        private @Nullable List<EnvVar> env;
        private @Nullable List<EnvFromSource> envFrom;
        private @Nullable String image;
        private @Nullable String imagePullPolicy;
        private @Nullable Lifecycle lifecycle;
        private @Nullable Probe livenessProbe;
        private String name;
        private @Nullable List<ContainerPort> ports;
        private @Nullable Probe readinessProbe;
        private @Nullable List<ContainerResizePolicy> resizePolicy;
        private @Nullable ResourceRequirements resources;
        private @Nullable String restartPolicy;
        private @Nullable SecurityContext securityContext;
        private @Nullable Probe startupProbe;
        private @Nullable Boolean stdin;
        private @Nullable Boolean stdinOnce;
        private @Nullable String targetContainerName;
        private @Nullable String terminationMessagePath;
        private @Nullable String terminationMessagePolicy;
        private @Nullable Boolean tty;
        private @Nullable List<VolumeDevice> volumeDevices;
        private @Nullable List<VolumeMount> volumeMounts;
        private @Nullable String workingDir;
        public Builder() {}
        public Builder(EphemeralContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.lifecycle = defaults.lifecycle;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resizePolicy = defaults.resizePolicy;
    	      this.resources = defaults.resources;
    	      this.restartPolicy = defaults.restartPolicy;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.stdin = defaults.stdin;
    	      this.stdinOnce = defaults.stdinOnce;
    	      this.targetContainerName = defaults.targetContainerName;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.tty = defaults.tty;
    	      this.volumeDevices = defaults.volumeDevices;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {

            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder command(@Nullable List<String> command) {

            this.command = command;
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        @CustomType.Setter
        public Builder env(@Nullable List<EnvVar> env) {

            this.env = env;
            return this;
        }
        public Builder env(EnvVar... env) {
            return env(List.of(env));
        }
        @CustomType.Setter
        public Builder envFrom(@Nullable List<EnvFromSource> envFrom) {

            this.envFrom = envFrom;
            return this;
        }
        public Builder envFrom(EnvFromSource... envFrom) {
            return envFrom(List.of(envFrom));
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder imagePullPolicy(@Nullable String imagePullPolicy) {

            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder lifecycle(@Nullable Lifecycle lifecycle) {

            this.lifecycle = lifecycle;
            return this;
        }
        @CustomType.Setter
        public Builder livenessProbe(@Nullable Probe livenessProbe) {

            this.livenessProbe = livenessProbe;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("EphemeralContainer", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<ContainerPort> ports) {

            this.ports = ports;
            return this;
        }
        public Builder ports(ContainerPort... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder readinessProbe(@Nullable Probe readinessProbe) {

            this.readinessProbe = readinessProbe;
            return this;
        }
        @CustomType.Setter
        public Builder resizePolicy(@Nullable List<ContainerResizePolicy> resizePolicy) {

            this.resizePolicy = resizePolicy;
            return this;
        }
        public Builder resizePolicy(ContainerResizePolicy... resizePolicy) {
            return resizePolicy(List.of(resizePolicy));
        }
        @CustomType.Setter
        public Builder resources(@Nullable ResourceRequirements resources) {

            this.resources = resources;
            return this;
        }
        @CustomType.Setter
        public Builder restartPolicy(@Nullable String restartPolicy) {

            this.restartPolicy = restartPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder securityContext(@Nullable SecurityContext securityContext) {

            this.securityContext = securityContext;
            return this;
        }
        @CustomType.Setter
        public Builder startupProbe(@Nullable Probe startupProbe) {

            this.startupProbe = startupProbe;
            return this;
        }
        @CustomType.Setter
        public Builder stdin(@Nullable Boolean stdin) {

            this.stdin = stdin;
            return this;
        }
        @CustomType.Setter
        public Builder stdinOnce(@Nullable Boolean stdinOnce) {

            this.stdinOnce = stdinOnce;
            return this;
        }
        @CustomType.Setter
        public Builder targetContainerName(@Nullable String targetContainerName) {

            this.targetContainerName = targetContainerName;
            return this;
        }
        @CustomType.Setter
        public Builder terminationMessagePath(@Nullable String terminationMessagePath) {

            this.terminationMessagePath = terminationMessagePath;
            return this;
        }
        @CustomType.Setter
        public Builder terminationMessagePolicy(@Nullable String terminationMessagePolicy) {

            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder tty(@Nullable Boolean tty) {

            this.tty = tty;
            return this;
        }
        @CustomType.Setter
        public Builder volumeDevices(@Nullable List<VolumeDevice> volumeDevices) {

            this.volumeDevices = volumeDevices;
            return this;
        }
        public Builder volumeDevices(VolumeDevice... volumeDevices) {
            return volumeDevices(List.of(volumeDevices));
        }
        @CustomType.Setter
        public Builder volumeMounts(@Nullable List<VolumeMount> volumeMounts) {

            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(VolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        @CustomType.Setter
        public Builder workingDir(@Nullable String workingDir) {

            this.workingDir = workingDir;
            return this;
        }
        public EphemeralContainer build() {
            final var _resultValue = new EphemeralContainer();
            _resultValue.args = args;
            _resultValue.command = command;
            _resultValue.env = env;
            _resultValue.envFrom = envFrom;
            _resultValue.image = image;
            _resultValue.imagePullPolicy = imagePullPolicy;
            _resultValue.lifecycle = lifecycle;
            _resultValue.livenessProbe = livenessProbe;
            _resultValue.name = name;
            _resultValue.ports = ports;
            _resultValue.readinessProbe = readinessProbe;
            _resultValue.resizePolicy = resizePolicy;
            _resultValue.resources = resources;
            _resultValue.restartPolicy = restartPolicy;
            _resultValue.securityContext = securityContext;
            _resultValue.startupProbe = startupProbe;
            _resultValue.stdin = stdin;
            _resultValue.stdinOnce = stdinOnce;
            _resultValue.targetContainerName = targetContainerName;
            _resultValue.terminationMessagePath = terminationMessagePath;
            _resultValue.terminationMessagePolicy = terminationMessagePolicy;
            _resultValue.tty = tty;
            _resultValue.volumeDevices = volumeDevices;
            _resultValue.volumeMounts = volumeMounts;
            _resultValue.workingDir = workingDir;
            return _resultValue;
        }
    }
}
