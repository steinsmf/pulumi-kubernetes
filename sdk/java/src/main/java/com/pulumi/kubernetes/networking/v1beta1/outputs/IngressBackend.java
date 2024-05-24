// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.outputs;

import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.outputs.TypedLocalObjectReference;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressBackend {
    /**
     * @return Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
     * 
     */
    private @Nullable TypedLocalObjectReference resource;
    /**
     * @return Specifies the name of the referenced service.
     * 
     */
    private String serviceName;
    /**
     * @return Specifies the port of the referenced service.
     * 
     */
    private Either<Integer,String> servicePort;

    private IngressBackend() {}
    /**
     * @return Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
     * 
     */
    public Optional<TypedLocalObjectReference> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * @return Specifies the name of the referenced service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return Specifies the port of the referenced service.
     * 
     */
    public Either<Integer,String> servicePort() {
        return this.servicePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressBackend defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TypedLocalObjectReference resource;
        private String serviceName;
        private Either<Integer,String> servicePort;
        public Builder() {}
        public Builder(IngressBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.serviceName = defaults.serviceName;
    	      this.servicePort = defaults.servicePort;
        }

        @CustomType.Setter
        public Builder resource(@Nullable TypedLocalObjectReference resource) {

            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            if (serviceName == null) {
              throw new MissingRequiredPropertyException("IngressBackend", "serviceName");
            }
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder servicePort(Either<Integer,String> servicePort) {
            if (servicePort == null) {
              throw new MissingRequiredPropertyException("IngressBackend", "servicePort");
            }
            this.servicePort = servicePort;
            return this;
        }
        public IngressBackend build() {
            final var _resultValue = new IngressBackend();
            _resultValue.resource = resource;
            _resultValue.serviceName = serviceName;
            _resultValue.servicePort = servicePort;
            return _resultValue;
        }
    }
}
