// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiregistration.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apiregistration.v1.inputs.ServiceReferencePatchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
 * 
 */
public final class APIServiceSpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final APIServiceSpecPatchArgs Empty = new APIServiceSpecPatchArgs();

    /**
     * CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    @Import(name="caBundle")
    private @Nullable Output<String> caBundle;

    /**
     * @return CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    public Optional<Output<String>> caBundle() {
        return Optional.ofNullable(this.caBundle);
    }

    /**
     * Group is the API group name this server hosts
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Group is the API group name this server hosts
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * GroupPriorityMinimum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMinimum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
     * 
     */
    @Import(name="groupPriorityMinimum")
    private @Nullable Output<Integer> groupPriorityMinimum;

    /**
     * @return GroupPriorityMinimum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMinimum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
     * 
     */
    public Optional<Output<Integer>> groupPriorityMinimum() {
        return Optional.ofNullable(this.groupPriorityMinimum);
    }

    /**
     * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
     * 
     */
    @Import(name="insecureSkipTLSVerify")
    private @Nullable Output<Boolean> insecureSkipTLSVerify;

    /**
     * @return InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
     * 
     */
    public Optional<Output<Boolean>> insecureSkipTLSVerify() {
        return Optional.ofNullable(this.insecureSkipTLSVerify);
    }

    /**
     * Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
     * 
     */
    @Import(name="service")
    private @Nullable Output<ServiceReferencePatchArgs> service;

    /**
     * @return Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
     * 
     */
    public Optional<Output<ServiceReferencePatchArgs>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Version is the API version this server hosts.  For example, &#34;v1&#34;
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version is the API version this server hosts.  For example, &#34;v1&#34;
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is &#34;kube-like&#34;, it will sort above non &#34;kube-like&#34; version strings, which are ordered lexicographically. &#34;Kube-like&#34; versions start with a &#34;v&#34;, then are followed by a number (the major version), then optionally the string &#34;alpha&#34; or &#34;beta&#34; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    @Import(name="versionPriority")
    private @Nullable Output<Integer> versionPriority;

    /**
     * @return VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is &#34;kube-like&#34;, it will sort above non &#34;kube-like&#34; version strings, which are ordered lexicographically. &#34;Kube-like&#34; versions start with a &#34;v&#34;, then are followed by a number (the major version), then optionally the string &#34;alpha&#34; or &#34;beta&#34; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    public Optional<Output<Integer>> versionPriority() {
        return Optional.ofNullable(this.versionPriority);
    }

    private APIServiceSpecPatchArgs() {}

    private APIServiceSpecPatchArgs(APIServiceSpecPatchArgs $) {
        this.caBundle = $.caBundle;
        this.group = $.group;
        this.groupPriorityMinimum = $.groupPriorityMinimum;
        this.insecureSkipTLSVerify = $.insecureSkipTLSVerify;
        this.service = $.service;
        this.version = $.version;
        this.versionPriority = $.versionPriority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(APIServiceSpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private APIServiceSpecPatchArgs $;

        public Builder() {
            $ = new APIServiceSpecPatchArgs();
        }

        public Builder(APIServiceSpecPatchArgs defaults) {
            $ = new APIServiceSpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caBundle CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
         * 
         * @return builder
         * 
         */
        public Builder caBundle(@Nullable Output<String> caBundle) {
            $.caBundle = caBundle;
            return this;
        }

        /**
         * @param caBundle CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
         * 
         * @return builder
         * 
         */
        public Builder caBundle(String caBundle) {
            return caBundle(Output.of(caBundle));
        }

        /**
         * @param group Group is the API group name this server hosts
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Group is the API group name this server hosts
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param groupPriorityMinimum GroupPriorityMinimum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMinimum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
         * 
         * @return builder
         * 
         */
        public Builder groupPriorityMinimum(@Nullable Output<Integer> groupPriorityMinimum) {
            $.groupPriorityMinimum = groupPriorityMinimum;
            return this;
        }

        /**
         * @param groupPriorityMinimum GroupPriorityMinimum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMinimum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
         * 
         * @return builder
         * 
         */
        public Builder groupPriorityMinimum(Integer groupPriorityMinimum) {
            return groupPriorityMinimum(Output.of(groupPriorityMinimum));
        }

        /**
         * @param insecureSkipTLSVerify InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
         * 
         * @return builder
         * 
         */
        public Builder insecureSkipTLSVerify(@Nullable Output<Boolean> insecureSkipTLSVerify) {
            $.insecureSkipTLSVerify = insecureSkipTLSVerify;
            return this;
        }

        /**
         * @param insecureSkipTLSVerify InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
         * 
         * @return builder
         * 
         */
        public Builder insecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {
            return insecureSkipTLSVerify(Output.of(insecureSkipTLSVerify));
        }

        /**
         * @param service Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<ServiceReferencePatchArgs> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
         * 
         * @return builder
         * 
         */
        public Builder service(ServiceReferencePatchArgs service) {
            return service(Output.of(service));
        }

        /**
         * @param version Version is the API version this server hosts.  For example, &#34;v1&#34;
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version is the API version this server hosts.  For example, &#34;v1&#34;
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param versionPriority VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is &#34;kube-like&#34;, it will sort above non &#34;kube-like&#34; version strings, which are ordered lexicographically. &#34;Kube-like&#34; versions start with a &#34;v&#34;, then are followed by a number (the major version), then optionally the string &#34;alpha&#34; or &#34;beta&#34; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
         * 
         * @return builder
         * 
         */
        public Builder versionPriority(@Nullable Output<Integer> versionPriority) {
            $.versionPriority = versionPriority;
            return this;
        }

        /**
         * @param versionPriority VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is &#34;kube-like&#34;, it will sort above non &#34;kube-like&#34; version strings, which are ordered lexicographically. &#34;Kube-like&#34; versions start with a &#34;v&#34;, then are followed by a number (the major version), then optionally the string &#34;alpha&#34; or &#34;beta&#34; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
         * 
         * @return builder
         * 
         */
        public Builder versionPriority(Integer versionPriority) {
            return versionPriority(Output.of(versionPriority));
        }

        public APIServiceSpecPatchArgs build() {
            return $;
        }
    }

}
