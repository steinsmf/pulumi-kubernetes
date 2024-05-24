// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SuccessPolicyRule {
    /**
     * @return succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job. When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is &#34;1-4&#34;, succeededCount is &#34;3&#34;, and completed indexes are &#34;1&#34;, &#34;3&#34;, and &#34;5&#34;, the Job isn&#39;t declared as succeeded because only &#34;1&#34; and &#34;3&#34; indexes are considered in that rules. When this field is null, this doesn&#39;t default to any value and is never evaluated at any time. When specified it needs to be a positive integer.
     * 
     */
    private @Nullable Integer succeededCount;
    /**
     * @return succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job. The list of indexes must be within 0 to &#34;.spec.completions-1&#34; and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;. When this field is null, this field doesn&#39;t default to any value and is never evaluated at any time.
     * 
     */
    private @Nullable String succeededIndexes;

    private SuccessPolicyRule() {}
    /**
     * @return succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job. When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is &#34;1-4&#34;, succeededCount is &#34;3&#34;, and completed indexes are &#34;1&#34;, &#34;3&#34;, and &#34;5&#34;, the Job isn&#39;t declared as succeeded because only &#34;1&#34; and &#34;3&#34; indexes are considered in that rules. When this field is null, this doesn&#39;t default to any value and is never evaluated at any time. When specified it needs to be a positive integer.
     * 
     */
    public Optional<Integer> succeededCount() {
        return Optional.ofNullable(this.succeededCount);
    }
    /**
     * @return succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job. The list of indexes must be within 0 to &#34;.spec.completions-1&#34; and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;. When this field is null, this field doesn&#39;t default to any value and is never evaluated at any time.
     * 
     */
    public Optional<String> succeededIndexes() {
        return Optional.ofNullable(this.succeededIndexes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuccessPolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer succeededCount;
        private @Nullable String succeededIndexes;
        public Builder() {}
        public Builder(SuccessPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.succeededCount = defaults.succeededCount;
    	      this.succeededIndexes = defaults.succeededIndexes;
        }

        @CustomType.Setter
        public Builder succeededCount(@Nullable Integer succeededCount) {

            this.succeededCount = succeededCount;
            return this;
        }
        @CustomType.Setter
        public Builder succeededIndexes(@Nullable String succeededIndexes) {

            this.succeededIndexes = succeededIndexes;
            return this;
        }
        public SuccessPolicyRule build() {
            final var _resultValue = new SuccessPolicyRule();
            _resultValue.succeededCount = succeededCount;
            _resultValue.succeededIndexes = succeededIndexes;
            return _resultValue;
        }
    }
}
