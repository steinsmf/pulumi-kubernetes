// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NonResourcePolicyRulePatch {
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
    private @Nullable List<String> nonResourceURLs;
    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
     * 
     */
    private @Nullable List<String> verbs;

    private NonResourcePolicyRulePatch() {}
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
    public List<String> nonResourceURLs() {
        return this.nonResourceURLs == null ? List.of() : this.nonResourceURLs;
    }
    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
     * 
     */
    public List<String> verbs() {
        return this.verbs == null ? List.of() : this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourcePolicyRulePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> nonResourceURLs;
        private @Nullable List<String> verbs;
        public Builder() {}
        public Builder(NonResourcePolicyRulePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.verbs = defaults.verbs;
        }

        @CustomType.Setter
        public Builder nonResourceURLs(@Nullable List<String> nonResourceURLs) {

            this.nonResourceURLs = nonResourceURLs;
            return this;
        }
        public Builder nonResourceURLs(String... nonResourceURLs) {
            return nonResourceURLs(List.of(nonResourceURLs));
        }
        @CustomType.Setter
        public Builder verbs(@Nullable List<String> verbs) {

            this.verbs = verbs;
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }
        public NonResourcePolicyRulePatch build() {
            final var _resultValue = new NonResourcePolicyRulePatch();
            _resultValue.nonResourceURLs = nonResourceURLs;
            _resultValue.verbs = verbs;
            return _resultValue;
        }
    }
}
