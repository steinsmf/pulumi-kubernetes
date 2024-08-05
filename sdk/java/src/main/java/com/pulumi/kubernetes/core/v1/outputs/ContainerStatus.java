// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.outputs.ContainerState;
import com.pulumi.kubernetes.core.v1.outputs.ResourceRequirements;
import com.pulumi.kubernetes.core.v1.outputs.VolumeMountStatus;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerStatus {
    /**
     * @return AllocatedResources represents the compute resources allocated for this container by the node. Kubelet sets this value to Container.Resources.Requests upon successful pod admission and after successfully admitting desired pod resize.
     * 
     */
    private @Nullable Map<String,String> allocatedResources;
    /**
     * @return ContainerID is the ID of the container in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;. Where type is a container runtime identifier, returned from Version call of CRI API (for example &#34;containerd&#34;).
     * 
     */
    private @Nullable String containerID;
    /**
     * @return Image is the name of container image that the container is running. The container image may not match the image used in the PodSpec, as it may have been resolved by the runtime. More info: https://kubernetes.io/docs/concepts/containers/images.
     * 
     */
    private String image;
    /**
     * @return ImageID is the image ID of the container&#39;s image. The image ID may not match the image ID of the image used in the PodSpec, as it may have been resolved by the runtime.
     * 
     */
    private String imageID;
    /**
     * @return LastTerminationState holds the last termination state of the container to help debug container crashes and restarts. This field is not populated if the container is still running and RestartCount is 0.
     * 
     */
    private @Nullable ContainerState lastState;
    /**
     * @return Name is a DNS_LABEL representing the unique name of the container. Each container in a pod must have a unique name across all container types. Cannot be updated.
     * 
     */
    private String name;
    /**
     * @return Ready specifies whether the container is currently passing its readiness check. The value will change as readiness probes keep executing. If no readiness probes are specified, this field defaults to true once the container is fully started (see Started field).
     * 
     * The value is typically used to determine whether a container is ready to accept traffic.
     * 
     */
    private Boolean ready;
    /**
     * @return Resources represents the compute resource requests and limits that have been successfully enacted on the running container after it has been started or has been successfully resized.
     * 
     */
    private @Nullable ResourceRequirements resources;
    /**
     * @return RestartCount holds the number of times the container has been restarted. Kubelet makes an effort to always increment the value, but there are cases when the state may be lost due to node restarts and then the value may be reset to 0. The value is never negative.
     * 
     */
    private Integer restartCount;
    /**
     * @return Started indicates whether the container has finished its postStart lifecycle hook and passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. In both cases, startup probes will run again. Is always true when no startupProbe is defined and container is running and has passed the postStart lifecycle hook. The null value must be treated the same as false.
     * 
     */
    private @Nullable Boolean started;
    /**
     * @return State holds details about the container&#39;s current condition.
     * 
     */
    private @Nullable ContainerState state;
    /**
     * @return Status of volume mounts.
     * 
     */
    private @Nullable List<VolumeMountStatus> volumeMounts;

    private ContainerStatus() {}
    /**
     * @return AllocatedResources represents the compute resources allocated for this container by the node. Kubelet sets this value to Container.Resources.Requests upon successful pod admission and after successfully admitting desired pod resize.
     * 
     */
    public Map<String,String> allocatedResources() {
        return this.allocatedResources == null ? Map.of() : this.allocatedResources;
    }
    /**
     * @return ContainerID is the ID of the container in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;. Where type is a container runtime identifier, returned from Version call of CRI API (for example &#34;containerd&#34;).
     * 
     */
    public Optional<String> containerID() {
        return Optional.ofNullable(this.containerID);
    }
    /**
     * @return Image is the name of container image that the container is running. The container image may not match the image used in the PodSpec, as it may have been resolved by the runtime. More info: https://kubernetes.io/docs/concepts/containers/images.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return ImageID is the image ID of the container&#39;s image. The image ID may not match the image ID of the image used in the PodSpec, as it may have been resolved by the runtime.
     * 
     */
    public String imageID() {
        return this.imageID;
    }
    /**
     * @return LastTerminationState holds the last termination state of the container to help debug container crashes and restarts. This field is not populated if the container is still running and RestartCount is 0.
     * 
     */
    public Optional<ContainerState> lastState() {
        return Optional.ofNullable(this.lastState);
    }
    /**
     * @return Name is a DNS_LABEL representing the unique name of the container. Each container in a pod must have a unique name across all container types. Cannot be updated.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Ready specifies whether the container is currently passing its readiness check. The value will change as readiness probes keep executing. If no readiness probes are specified, this field defaults to true once the container is fully started (see Started field).
     * 
     * The value is typically used to determine whether a container is ready to accept traffic.
     * 
     */
    public Boolean ready() {
        return this.ready;
    }
    /**
     * @return Resources represents the compute resource requests and limits that have been successfully enacted on the running container after it has been started or has been successfully resized.
     * 
     */
    public Optional<ResourceRequirements> resources() {
        return Optional.ofNullable(this.resources);
    }
    /**
     * @return RestartCount holds the number of times the container has been restarted. Kubelet makes an effort to always increment the value, but there are cases when the state may be lost due to node restarts and then the value may be reset to 0. The value is never negative.
     * 
     */
    public Integer restartCount() {
        return this.restartCount;
    }
    /**
     * @return Started indicates whether the container has finished its postStart lifecycle hook and passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. In both cases, startup probes will run again. Is always true when no startupProbe is defined and container is running and has passed the postStart lifecycle hook. The null value must be treated the same as false.
     * 
     */
    public Optional<Boolean> started() {
        return Optional.ofNullable(this.started);
    }
    /**
     * @return State holds details about the container&#39;s current condition.
     * 
     */
    public Optional<ContainerState> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Status of volume mounts.
     * 
     */
    public List<VolumeMountStatus> volumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> allocatedResources;
        private @Nullable String containerID;
        private String image;
        private String imageID;
        private @Nullable ContainerState lastState;
        private String name;
        private Boolean ready;
        private @Nullable ResourceRequirements resources;
        private Integer restartCount;
        private @Nullable Boolean started;
        private @Nullable ContainerState state;
        private @Nullable List<VolumeMountStatus> volumeMounts;
        public Builder() {}
        public Builder(ContainerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedResources = defaults.allocatedResources;
    	      this.containerID = defaults.containerID;
    	      this.image = defaults.image;
    	      this.imageID = defaults.imageID;
    	      this.lastState = defaults.lastState;
    	      this.name = defaults.name;
    	      this.ready = defaults.ready;
    	      this.resources = defaults.resources;
    	      this.restartCount = defaults.restartCount;
    	      this.started = defaults.started;
    	      this.state = defaults.state;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        @CustomType.Setter
        public Builder allocatedResources(@Nullable Map<String,String> allocatedResources) {

            this.allocatedResources = allocatedResources;
            return this;
        }
        @CustomType.Setter
        public Builder containerID(@Nullable String containerID) {

            this.containerID = containerID;
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("ContainerStatus", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder imageID(String imageID) {
            if (imageID == null) {
              throw new MissingRequiredPropertyException("ContainerStatus", "imageID");
            }
            this.imageID = imageID;
            return this;
        }
        @CustomType.Setter
        public Builder lastState(@Nullable ContainerState lastState) {

            this.lastState = lastState;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ContainerStatus", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ready(Boolean ready) {
            if (ready == null) {
              throw new MissingRequiredPropertyException("ContainerStatus", "ready");
            }
            this.ready = ready;
            return this;
        }
        @CustomType.Setter
        public Builder resources(@Nullable ResourceRequirements resources) {

            this.resources = resources;
            return this;
        }
        @CustomType.Setter
        public Builder restartCount(Integer restartCount) {
            if (restartCount == null) {
              throw new MissingRequiredPropertyException("ContainerStatus", "restartCount");
            }
            this.restartCount = restartCount;
            return this;
        }
        @CustomType.Setter
        public Builder started(@Nullable Boolean started) {

            this.started = started;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable ContainerState state) {

            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder volumeMounts(@Nullable List<VolumeMountStatus> volumeMounts) {

            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(VolumeMountStatus... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public ContainerStatus build() {
            final var _resultValue = new ContainerStatus();
            _resultValue.allocatedResources = allocatedResources;
            _resultValue.containerID = containerID;
            _resultValue.image = image;
            _resultValue.imageID = imageID;
            _resultValue.lastState = lastState;
            _resultValue.name = name;
            _resultValue.ready = ready;
            _resultValue.resources = resources;
            _resultValue.restartCount = restartCount;
            _resultValue.started = started;
            _resultValue.state = state;
            _resultValue.volumeMounts = volumeMounts;
            return _resultValue;
        }
    }
}
