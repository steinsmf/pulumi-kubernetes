// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NamedResourcesFilter {
    /**
     * @return Selector is a CEL expression which must evaluate to true if a resource instance is suitable. The language is as defined in https://kubernetes.io/docs/reference/using-api/cel/
     * 
     * In addition, for each type NamedResourcesin AttributeValue there is a map that resolves to the corresponding value of the instance under evaluation. For example:
     * 
     *    attributes.quantity[&#34;a&#34;].isGreaterThan(quantity(&#34;0&#34;)) &amp;&amp;
     *    attributes.stringslice[&#34;b&#34;].isSorted()
     * 
     */
    private String selector;

    private NamedResourcesFilter() {}
    /**
     * @return Selector is a CEL expression which must evaluate to true if a resource instance is suitable. The language is as defined in https://kubernetes.io/docs/reference/using-api/cel/
     * 
     * In addition, for each type NamedResourcesin AttributeValue there is a map that resolves to the corresponding value of the instance under evaluation. For example:
     * 
     *    attributes.quantity[&#34;a&#34;].isGreaterThan(quantity(&#34;0&#34;)) &amp;&amp;
     *    attributes.stringslice[&#34;b&#34;].isSorted()
     * 
     */
    public String selector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedResourcesFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String selector;
        public Builder() {}
        public Builder(NamedResourcesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder selector(String selector) {
            if (selector == null) {
              throw new MissingRequiredPropertyException("NamedResourcesFilter", "selector");
            }
            this.selector = selector;
            return this;
        }
        public NamedResourcesFilter build() {
            final var _resultValue = new NamedResourcesFilter();
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
