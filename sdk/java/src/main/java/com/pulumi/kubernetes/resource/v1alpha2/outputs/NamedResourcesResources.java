// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.NamedResourcesInstance;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NamedResourcesResources {
    /**
     * @return The list of all individual resources instances currently available.
     * 
     */
    private List<NamedResourcesInstance> instances;

    private NamedResourcesResources() {}
    /**
     * @return The list of all individual resources instances currently available.
     * 
     */
    public List<NamedResourcesInstance> instances() {
        return this.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedResourcesResources defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<NamedResourcesInstance> instances;
        public Builder() {}
        public Builder(NamedResourcesResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
        }

        @CustomType.Setter
        public Builder instances(List<NamedResourcesInstance> instances) {
            if (instances == null) {
              throw new MissingRequiredPropertyException("NamedResourcesResources", "instances");
            }
            this.instances = instances;
            return this;
        }
        public Builder instances(NamedResourcesInstance... instances) {
            return instances(List.of(instances));
        }
        public NamedResourcesResources build() {
            final var _resultValue = new NamedResourcesResources();
            _resultValue.instances = instances;
            return _resultValue;
        }
    }
}
