// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServiceReference holds a reference to Service.legacy.k8s.io
 * 
 */
public final class ServiceReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceReferenceArgs Empty = new ServiceReferenceArgs();

    /**
     * `name` is the name of the service. Required
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return `name` is the name of the service. Required
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * `namespace` is the namespace of the service. Required
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return `namespace` is the namespace of the service. Required
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * `path` is an optional URL path which will be sent in any request to this service.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return `path` is an optional URL path which will be sent in any request to this service.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private ServiceReferenceArgs() {}

    private ServiceReferenceArgs(ServiceReferenceArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
        this.path = $.path;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceReferenceArgs $;

        public Builder() {
            $ = new ServiceReferenceArgs();
        }

        public Builder(ServiceReferenceArgs defaults) {
            $ = new ServiceReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `name` is the name of the service. Required
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `name` is the name of the service. Required
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace `namespace` is the namespace of the service. Required
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace `namespace` is the namespace of the service. Required
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param path `path` is an optional URL path which will be sent in any request to this service.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path `path` is an optional URL path which will be sent in any request to this service.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ServiceReferenceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceReferenceArgs", "name");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("ServiceReferenceArgs", "namespace");
            }
            return $;
        }
    }

}
