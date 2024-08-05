// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 * 
 */
public final class WindowsSecurityContextOptionsPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsSecurityContextOptionsPatchArgs Empty = new WindowsSecurityContextOptionsPatchArgs();

    /**
     * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    @Import(name="gmsaCredentialSpec")
    private @Nullable Output<String> gmsaCredentialSpec;

    /**
     * @return GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    public Optional<Output<String>> gmsaCredentialSpec() {
        return Optional.ofNullable(this.gmsaCredentialSpec);
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    @Import(name="gmsaCredentialSpecName")
    private @Nullable Output<String> gmsaCredentialSpecName;

    /**
     * @return GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    public Optional<Output<String>> gmsaCredentialSpecName() {
        return Optional.ofNullable(this.gmsaCredentialSpecName);
    }

    /**
     * HostProcess determines if a container should be run as a &#39;Host Process&#39; container. All of a Pod&#39;s containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    @Import(name="hostProcess")
    private @Nullable Output<Boolean> hostProcess;

    /**
     * @return HostProcess determines if a container should be run as a &#39;Host Process&#39; container. All of a Pod&#39;s containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    public Optional<Output<Boolean>> hostProcess() {
        return Optional.ofNullable(this.hostProcess);
    }

    /**
     * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @Import(name="runAsUserName")
    private @Nullable Output<String> runAsUserName;

    /**
     * @return The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    public Optional<Output<String>> runAsUserName() {
        return Optional.ofNullable(this.runAsUserName);
    }

    private WindowsSecurityContextOptionsPatchArgs() {}

    private WindowsSecurityContextOptionsPatchArgs(WindowsSecurityContextOptionsPatchArgs $) {
        this.gmsaCredentialSpec = $.gmsaCredentialSpec;
        this.gmsaCredentialSpecName = $.gmsaCredentialSpecName;
        this.hostProcess = $.hostProcess;
        this.runAsUserName = $.runAsUserName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsSecurityContextOptionsPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsSecurityContextOptionsPatchArgs $;

        public Builder() {
            $ = new WindowsSecurityContextOptionsPatchArgs();
        }

        public Builder(WindowsSecurityContextOptionsPatchArgs defaults) {
            $ = new WindowsSecurityContextOptionsPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gmsaCredentialSpec GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
         * 
         * @return builder
         * 
         */
        public Builder gmsaCredentialSpec(@Nullable Output<String> gmsaCredentialSpec) {
            $.gmsaCredentialSpec = gmsaCredentialSpec;
            return this;
        }

        /**
         * @param gmsaCredentialSpec GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
         * 
         * @return builder
         * 
         */
        public Builder gmsaCredentialSpec(String gmsaCredentialSpec) {
            return gmsaCredentialSpec(Output.of(gmsaCredentialSpec));
        }

        /**
         * @param gmsaCredentialSpecName GMSACredentialSpecName is the name of the GMSA credential spec to use.
         * 
         * @return builder
         * 
         */
        public Builder gmsaCredentialSpecName(@Nullable Output<String> gmsaCredentialSpecName) {
            $.gmsaCredentialSpecName = gmsaCredentialSpecName;
            return this;
        }

        /**
         * @param gmsaCredentialSpecName GMSACredentialSpecName is the name of the GMSA credential spec to use.
         * 
         * @return builder
         * 
         */
        public Builder gmsaCredentialSpecName(String gmsaCredentialSpecName) {
            return gmsaCredentialSpecName(Output.of(gmsaCredentialSpecName));
        }

        /**
         * @param hostProcess HostProcess determines if a container should be run as a &#39;Host Process&#39; container. All of a Pod&#39;s containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.
         * 
         * @return builder
         * 
         */
        public Builder hostProcess(@Nullable Output<Boolean> hostProcess) {
            $.hostProcess = hostProcess;
            return this;
        }

        /**
         * @param hostProcess HostProcess determines if a container should be run as a &#39;Host Process&#39; container. All of a Pod&#39;s containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.
         * 
         * @return builder
         * 
         */
        public Builder hostProcess(Boolean hostProcess) {
            return hostProcess(Output.of(hostProcess));
        }

        /**
         * @param runAsUserName The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder runAsUserName(@Nullable Output<String> runAsUserName) {
            $.runAsUserName = runAsUserName;
            return this;
        }

        /**
         * @param runAsUserName The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder runAsUserName(String runAsUserName) {
            return runAsUserName(Output.of(runAsUserName));
        }

        public WindowsSecurityContextOptionsPatchArgs build() {
            return $;
        }
    }

}
