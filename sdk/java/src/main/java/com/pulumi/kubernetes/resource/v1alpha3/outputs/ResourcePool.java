// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePool {
    /**
     * @return Generation tracks the change in a pool over time. Whenever a driver changes something about one or more of the resources in a pool, it must change the generation in all ResourceSlices which are part of that pool. Consumers of ResourceSlices should only consider resources from the pool with the highest generation number. The generation may be reset by drivers, which should be fine for consumers, assuming that all ResourceSlices in a pool are updated to match or deleted.
     * 
     * Combined with ResourceSliceCount, this mechanism enables consumers to detect pools which are comprised of multiple ResourceSlices and are in an incomplete state.
     * 
     */
    private Integer generation;
    /**
     * @return Name is used to identify the pool. For node-local devices, this is often the node name, but this is not required.
     * 
     * It must not be longer than 253 characters and must consist of one or more DNS sub-domains separated by slashes. This field is immutable.
     * 
     */
    private String name;
    /**
     * @return ResourceSliceCount is the total number of ResourceSlices in the pool at this generation number. Must be greater than zero.
     * 
     * Consumers can use this to check whether they have seen all ResourceSlices belonging to the same pool.
     * 
     */
    private Integer resourceSliceCount;

    private ResourcePool() {}
    /**
     * @return Generation tracks the change in a pool over time. Whenever a driver changes something about one or more of the resources in a pool, it must change the generation in all ResourceSlices which are part of that pool. Consumers of ResourceSlices should only consider resources from the pool with the highest generation number. The generation may be reset by drivers, which should be fine for consumers, assuming that all ResourceSlices in a pool are updated to match or deleted.
     * 
     * Combined with ResourceSliceCount, this mechanism enables consumers to detect pools which are comprised of multiple ResourceSlices and are in an incomplete state.
     * 
     */
    public Integer generation() {
        return this.generation;
    }
    /**
     * @return Name is used to identify the pool. For node-local devices, this is often the node name, but this is not required.
     * 
     * It must not be longer than 253 characters and must consist of one or more DNS sub-domains separated by slashes. This field is immutable.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ResourceSliceCount is the total number of ResourceSlices in the pool at this generation number. Must be greater than zero.
     * 
     * Consumers can use this to check whether they have seen all ResourceSlices belonging to the same pool.
     * 
     */
    public Integer resourceSliceCount() {
        return this.resourceSliceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer generation;
        private String name;
        private Integer resourceSliceCount;
        public Builder() {}
        public Builder(ResourcePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generation = defaults.generation;
    	      this.name = defaults.name;
    	      this.resourceSliceCount = defaults.resourceSliceCount;
        }

        @CustomType.Setter
        public Builder generation(Integer generation) {
            if (generation == null) {
              throw new MissingRequiredPropertyException("ResourcePool", "generation");
            }
            this.generation = generation;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ResourcePool", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceSliceCount(Integer resourceSliceCount) {
            if (resourceSliceCount == null) {
              throw new MissingRequiredPropertyException("ResourcePool", "resourceSliceCount");
            }
            this.resourceSliceCount = resourceSliceCount;
            return this;
        }
        public ResourcePool build() {
            final var _resultValue = new ResourcePool();
            _resultValue.generation = generation;
            _resultValue.name = name;
            _resultValue.resourceSliceCount = resourceSliceCount;
            return _resultValue;
        }
    }
}
