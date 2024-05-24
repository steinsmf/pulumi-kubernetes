// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class GlusterfsPersistentVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlusterfsPersistentVolumeSourceArgs Empty = new GlusterfsPersistentVolumeSourceArgs();

    /**
     * endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @Import(name="endpoints", required=true)
    private Output<String> endpoints;

    /**
     * @return endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Output<String> endpoints() {
        return this.endpoints;
    }

    /**
     * endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @Import(name="endpointsNamespace")
    private @Nullable Output<String> endpointsNamespace;

    /**
     * @return endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Optional<Output<String>> endpointsNamespace() {
        return Optional.ofNullable(this.endpointsNamespace);
    }

    /**
     * path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private GlusterfsPersistentVolumeSourceArgs() {}

    private GlusterfsPersistentVolumeSourceArgs(GlusterfsPersistentVolumeSourceArgs $) {
        this.endpoints = $.endpoints;
        this.endpointsNamespace = $.endpointsNamespace;
        this.path = $.path;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlusterfsPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlusterfsPersistentVolumeSourceArgs $;

        public Builder() {
            $ = new GlusterfsPersistentVolumeSourceArgs();
        }

        public Builder(GlusterfsPersistentVolumeSourceArgs defaults) {
            $ = new GlusterfsPersistentVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoints endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder endpoints(Output<String> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder endpoints(String endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpointsNamespace endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder endpointsNamespace(@Nullable Output<String> endpointsNamespace) {
            $.endpointsNamespace = endpointsNamespace;
            return this;
        }

        /**
         * @param endpointsNamespace endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder endpointsNamespace(String endpointsNamespace) {
            return endpointsNamespace(Output.of(endpointsNamespace));
        }

        /**
         * @param path path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param readOnly readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public GlusterfsPersistentVolumeSourceArgs build() {
            if ($.endpoints == null) {
                throw new MissingRequiredPropertyException("GlusterfsPersistentVolumeSourceArgs", "endpoints");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GlusterfsPersistentVolumeSourceArgs", "path");
            }
            return $;
        }
    }

}
