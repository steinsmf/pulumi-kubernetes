// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ExecActionPatch;
import com.pulumi.kubernetes.core.v1.outputs.GRPCActionPatch;
import com.pulumi.kubernetes.core.v1.outputs.HTTPGetActionPatch;
import com.pulumi.kubernetes.core.v1.outputs.TCPSocketActionPatch;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProbePatch {
    /**
     * @return Exec specifies the action to take.
     * 
     */
    private @Nullable ExecActionPatch exec;
    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    private @Nullable Integer failureThreshold;
    /**
     * @return GRPC specifies an action involving a GRPC port.
     * 
     */
    private @Nullable GRPCActionPatch grpc;
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    private @Nullable HTTPGetActionPatch httpGet;
    /**
     * @return Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private @Nullable Integer initialDelaySeconds;
    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    private @Nullable Integer periodSeconds;
    /**
     * @return Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    private @Nullable Integer successThreshold;
    /**
     * @return TCPSocket specifies an action involving a TCP port.
     * 
     */
    private @Nullable TCPSocketActionPatch tcpSocket;
    /**
     * @return Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    private @Nullable Integer terminationGracePeriodSeconds;
    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private @Nullable Integer timeoutSeconds;

    private ProbePatch() {}
    /**
     * @return Exec specifies the action to take.
     * 
     */
    public Optional<ExecActionPatch> exec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return GRPC specifies an action involving a GRPC port.
     * 
     */
    public Optional<GRPCActionPatch> grpc() {
        return Optional.ofNullable(this.grpc);
    }
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    public Optional<HTTPGetActionPatch> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    /**
     * @return Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return TCPSocket specifies an action involving a TCP port.
     * 
     */
    public Optional<TCPSocketActionPatch> tcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }
    /**
     * @return Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    public Optional<Integer> terminationGracePeriodSeconds() {
        return Optional.ofNullable(this.terminationGracePeriodSeconds);
    }
    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProbePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ExecActionPatch exec;
        private @Nullable Integer failureThreshold;
        private @Nullable GRPCActionPatch grpc;
        private @Nullable HTTPGetActionPatch httpGet;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable TCPSocketActionPatch tcpSocket;
        private @Nullable Integer terminationGracePeriodSeconds;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(ProbePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.grpc = defaults.grpc;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        @CustomType.Setter
        public Builder exec(@Nullable ExecActionPatch exec) {

            this.exec = exec;
            return this;
        }
        @CustomType.Setter
        public Builder failureThreshold(@Nullable Integer failureThreshold) {

            this.failureThreshold = failureThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder grpc(@Nullable GRPCActionPatch grpc) {

            this.grpc = grpc;
            return this;
        }
        @CustomType.Setter
        public Builder httpGet(@Nullable HTTPGetActionPatch httpGet) {

            this.httpGet = httpGet;
            return this;
        }
        @CustomType.Setter
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {

            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        @CustomType.Setter
        public Builder periodSeconds(@Nullable Integer periodSeconds) {

            this.periodSeconds = periodSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder successThreshold(@Nullable Integer successThreshold) {

            this.successThreshold = successThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder tcpSocket(@Nullable TCPSocketActionPatch tcpSocket) {

            this.tcpSocket = tcpSocket;
            return this;
        }
        @CustomType.Setter
        public Builder terminationGracePeriodSeconds(@Nullable Integer terminationGracePeriodSeconds) {

            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public ProbePatch build() {
            final var _resultValue = new ProbePatch();
            _resultValue.exec = exec;
            _resultValue.failureThreshold = failureThreshold;
            _resultValue.grpc = grpc;
            _resultValue.httpGet = httpGet;
            _resultValue.initialDelaySeconds = initialDelaySeconds;
            _resultValue.periodSeconds = periodSeconds;
            _resultValue.successThreshold = successThreshold;
            _resultValue.tcpSocket = tcpSocket;
            _resultValue.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            _resultValue.timeoutSeconds = timeoutSeconds;
            return _resultValue;
        }
    }
}
