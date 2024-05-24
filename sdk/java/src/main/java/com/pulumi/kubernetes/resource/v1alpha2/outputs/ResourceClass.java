// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.outputs.NodeSelector;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.ResourceClassParametersReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceClass {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
     * 
     * Resource drivers have a unique name in forward domain order (acme.example.com).
     * 
     */
    private String driverName;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return Standard object metadata
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
     * 
     */
    private @Nullable ResourceClassParametersReference parametersRef;
    /**
     * @return If and only if allocation of claims using this class is handled via structured parameters, then StructuredParameters must be set to true.
     * 
     */
    private @Nullable Boolean structuredParameters;
    /**
     * @return Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
     * 
     * Setting this field is optional. If null, all nodes are candidates.
     * 
     */
    private @Nullable NodeSelector suitableNodes;

    private ResourceClass() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
     * 
     * Resource drivers have a unique name in forward domain order (acme.example.com).
     * 
     */
    public String driverName() {
        return this.driverName;
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object metadata
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
     * 
     */
    public Optional<ResourceClassParametersReference> parametersRef() {
        return Optional.ofNullable(this.parametersRef);
    }
    /**
     * @return If and only if allocation of claims using this class is handled via structured parameters, then StructuredParameters must be set to true.
     * 
     */
    public Optional<Boolean> structuredParameters() {
        return Optional.ofNullable(this.structuredParameters);
    }
    /**
     * @return Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
     * 
     * Setting this field is optional. If null, all nodes are candidates.
     * 
     */
    public Optional<NodeSelector> suitableNodes() {
        return Optional.ofNullable(this.suitableNodes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private String driverName;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable ResourceClassParametersReference parametersRef;
        private @Nullable Boolean structuredParameters;
        private @Nullable NodeSelector suitableNodes;
        public Builder() {}
        public Builder(ResourceClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.driverName = defaults.driverName;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.parametersRef = defaults.parametersRef;
    	      this.structuredParameters = defaults.structuredParameters;
    	      this.suitableNodes = defaults.suitableNodes;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder driverName(String driverName) {
            if (driverName == null) {
              throw new MissingRequiredPropertyException("ResourceClass", "driverName");
            }
            this.driverName = driverName;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ObjectMeta metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder parametersRef(@Nullable ResourceClassParametersReference parametersRef) {

            this.parametersRef = parametersRef;
            return this;
        }
        @CustomType.Setter
        public Builder structuredParameters(@Nullable Boolean structuredParameters) {

            this.structuredParameters = structuredParameters;
            return this;
        }
        @CustomType.Setter
        public Builder suitableNodes(@Nullable NodeSelector suitableNodes) {

            this.suitableNodes = suitableNodes;
            return this;
        }
        public ResourceClass build() {
            final var _resultValue = new ResourceClass();
            _resultValue.apiVersion = apiVersion;
            _resultValue.driverName = driverName;
            _resultValue.kind = kind;
            _resultValue.metadata = metadata;
            _resultValue.parametersRef = parametersRef;
            _resultValue.structuredParameters = structuredParameters;
            _resultValue.suitableNodes = suitableNodes;
            return _resultValue;
        }
    }
}
