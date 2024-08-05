// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 * 
 */
public final class NonResourcePolicyRulePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final NonResourcePolicyRulePatchArgs Empty = new NonResourcePolicyRulePatchArgs();

    /**
     * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
     *   - &#34;/healthz&#34; is legal
     *   - &#34;/hea*&#34; is illegal
     *   - &#34;/hea&#34; is legal but matches nothing
     *   - &#34;/hea/*&#34; also matches nothing
     *   - &#34;/healthz/*&#34; matches all per-component health checks.
     *     &#34;*&#34; matches all non-resource urls. if it is present, it must be the only entry. Required.
     * 
     */
    @Import(name="nonResourceURLs")
    private @Nullable Output<List<String>> nonResourceURLs;

    /**
     * @return `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
     *   - &#34;/healthz&#34; is legal
     *   - &#34;/hea*&#34; is illegal
     *   - &#34;/hea&#34; is legal but matches nothing
     *   - &#34;/hea/*&#34; also matches nothing
     *   - &#34;/healthz/*&#34; matches all per-component health checks.
     *     &#34;*&#34; matches all non-resource urls. if it is present, it must be the only entry. Required.
     * 
     */
    public Optional<Output<List<String>>> nonResourceURLs() {
        return Optional.ofNullable(this.nonResourceURLs);
    }

    /**
     * `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
     * 
     */
    @Import(name="verbs")
    private @Nullable Output<List<String>> verbs;

    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
     * 
     */
    public Optional<Output<List<String>>> verbs() {
        return Optional.ofNullable(this.verbs);
    }

    private NonResourcePolicyRulePatchArgs() {}

    private NonResourcePolicyRulePatchArgs(NonResourcePolicyRulePatchArgs $) {
        this.nonResourceURLs = $.nonResourceURLs;
        this.verbs = $.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NonResourcePolicyRulePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NonResourcePolicyRulePatchArgs $;

        public Builder() {
            $ = new NonResourcePolicyRulePatchArgs();
        }

        public Builder(NonResourcePolicyRulePatchArgs defaults) {
            $ = new NonResourcePolicyRulePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nonResourceURLs `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
         *   - &#34;/healthz&#34; is legal
         *   - &#34;/hea*&#34; is illegal
         *   - &#34;/hea&#34; is legal but matches nothing
         *   - &#34;/hea/*&#34; also matches nothing
         *   - &#34;/healthz/*&#34; matches all per-component health checks.
         *     &#34;*&#34; matches all non-resource urls. if it is present, it must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceURLs(@Nullable Output<List<String>> nonResourceURLs) {
            $.nonResourceURLs = nonResourceURLs;
            return this;
        }

        /**
         * @param nonResourceURLs `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
         *   - &#34;/healthz&#34; is legal
         *   - &#34;/hea*&#34; is illegal
         *   - &#34;/hea&#34; is legal but matches nothing
         *   - &#34;/hea/*&#34; also matches nothing
         *   - &#34;/healthz/*&#34; matches all per-component health checks.
         *     &#34;*&#34; matches all non-resource urls. if it is present, it must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceURLs(List<String> nonResourceURLs) {
            return nonResourceURLs(Output.of(nonResourceURLs));
        }

        /**
         * @param nonResourceURLs `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
         *   - &#34;/healthz&#34; is legal
         *   - &#34;/hea*&#34; is illegal
         *   - &#34;/hea&#34; is legal but matches nothing
         *   - &#34;/hea/*&#34; also matches nothing
         *   - &#34;/healthz/*&#34; matches all per-component health checks.
         *     &#34;*&#34; matches all non-resource urls. if it is present, it must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceURLs(String... nonResourceURLs) {
            return nonResourceURLs(List.of(nonResourceURLs));
        }

        /**
         * @param verbs `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder verbs(@Nullable Output<List<String>> verbs) {
            $.verbs = verbs;
            return this;
        }

        /**
         * @param verbs `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder verbs(List<String> verbs) {
            return verbs(Output.of(verbs));
        }

        /**
         * @param verbs `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }

        public NonResourcePolicyRulePatchArgs build() {
            return $;
        }
    }

}
