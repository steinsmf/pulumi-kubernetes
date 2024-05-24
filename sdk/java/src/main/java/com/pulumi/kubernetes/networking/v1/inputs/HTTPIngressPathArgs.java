// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.networking.v1.inputs.IngressBackendArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
 * 
 */
public final class HTTPIngressPathArgs extends com.pulumi.resources.ResourceArgs {

    public static final HTTPIngressPathArgs Empty = new HTTPIngressPathArgs();

    /**
     * backend defines the referenced service endpoint to which the traffic will be forwarded to.
     * 
     */
    @Import(name="backend", required=true)
    private Output<IngressBackendArgs> backend;

    /**
     * @return backend defines the referenced service endpoint to which the traffic will be forwarded to.
     * 
     */
    public Output<IngressBackendArgs> backend() {
        return this.backend;
    }

    /**
     * path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional &#34;path&#34; part of a URL as defined by RFC 3986. Paths must begin with a &#39;/&#39; and must be present when using PathType with value &#34;Exact&#34; or &#34;Prefix&#34;.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional &#34;path&#34; part of a URL as defined by RFC 3986. Paths must begin with a &#39;/&#39; and must be present when using PathType with value &#34;Exact&#34; or &#34;Prefix&#34;.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * pathType determines the interpretation of the path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by &#39;/&#39;. Matching is
     *   done on a path element by element basis. A path element refers is the
     *   list of labels in the path split by the &#39;/&#39; separator. A request is a
     *   match for path p if every p is an element-wise prefix of p of the
     *   request path. Note that if the last element of the path is a substring
     *   of the last element in request path, it is not a match (e.g. /foo/bar
     *   matches /foo/bar/baz, but does not match /foo/barbaz).
     * * ImplementationSpecific: Interpretation of the Path matching is up to
     *   the IngressClass. Implementations can treat this as a separate PathType
     *   or treat it identically to Prefix or Exact path types.
     *   Implementations are required to support all path types.
     * 
     */
    @Import(name="pathType", required=true)
    private Output<String> pathType;

    /**
     * @return pathType determines the interpretation of the path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by &#39;/&#39;. Matching is
     *   done on a path element by element basis. A path element refers is the
     *   list of labels in the path split by the &#39;/&#39; separator. A request is a
     *   match for path p if every p is an element-wise prefix of p of the
     *   request path. Note that if the last element of the path is a substring
     *   of the last element in request path, it is not a match (e.g. /foo/bar
     *   matches /foo/bar/baz, but does not match /foo/barbaz).
     * * ImplementationSpecific: Interpretation of the Path matching is up to
     *   the IngressClass. Implementations can treat this as a separate PathType
     *   or treat it identically to Prefix or Exact path types.
     *   Implementations are required to support all path types.
     * 
     */
    public Output<String> pathType() {
        return this.pathType;
    }

    private HTTPIngressPathArgs() {}

    private HTTPIngressPathArgs(HTTPIngressPathArgs $) {
        this.backend = $.backend;
        this.path = $.path;
        this.pathType = $.pathType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HTTPIngressPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HTTPIngressPathArgs $;

        public Builder() {
            $ = new HTTPIngressPathArgs();
        }

        public Builder(HTTPIngressPathArgs defaults) {
            $ = new HTTPIngressPathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend backend defines the referenced service endpoint to which the traffic will be forwarded to.
         * 
         * @return builder
         * 
         */
        public Builder backend(Output<IngressBackendArgs> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend backend defines the referenced service endpoint to which the traffic will be forwarded to.
         * 
         * @return builder
         * 
         */
        public Builder backend(IngressBackendArgs backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param path path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional &#34;path&#34; part of a URL as defined by RFC 3986. Paths must begin with a &#39;/&#39; and must be present when using PathType with value &#34;Exact&#34; or &#34;Prefix&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional &#34;path&#34; part of a URL as defined by RFC 3986. Paths must begin with a &#39;/&#39; and must be present when using PathType with value &#34;Exact&#34; or &#34;Prefix&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param pathType pathType determines the interpretation of the path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by &#39;/&#39;. Matching is
         *   done on a path element by element basis. A path element refers is the
         *   list of labels in the path split by the &#39;/&#39; separator. A request is a
         *   match for path p if every p is an element-wise prefix of p of the
         *   request path. Note that if the last element of the path is a substring
         *   of the last element in request path, it is not a match (e.g. /foo/bar
         *   matches /foo/bar/baz, but does not match /foo/barbaz).
         * * ImplementationSpecific: Interpretation of the Path matching is up to
         *   the IngressClass. Implementations can treat this as a separate PathType
         *   or treat it identically to Prefix or Exact path types.
         *   Implementations are required to support all path types.
         * 
         * @return builder
         * 
         */
        public Builder pathType(Output<String> pathType) {
            $.pathType = pathType;
            return this;
        }

        /**
         * @param pathType pathType determines the interpretation of the path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by &#39;/&#39;. Matching is
         *   done on a path element by element basis. A path element refers is the
         *   list of labels in the path split by the &#39;/&#39; separator. A request is a
         *   match for path p if every p is an element-wise prefix of p of the
         *   request path. Note that if the last element of the path is a substring
         *   of the last element in request path, it is not a match (e.g. /foo/bar
         *   matches /foo/bar/baz, but does not match /foo/barbaz).
         * * ImplementationSpecific: Interpretation of the Path matching is up to
         *   the IngressClass. Implementations can treat this as a separate PathType
         *   or treat it identically to Prefix or Exact path types.
         *   Implementations are required to support all path types.
         * 
         * @return builder
         * 
         */
        public Builder pathType(String pathType) {
            return pathType(Output.of(pathType));
        }

        public HTTPIngressPathArgs build() {
            if ($.backend == null) {
                throw new MissingRequiredPropertyException("HTTPIngressPathArgs", "backend");
            }
            if ($.pathType == null) {
                throw new MissingRequiredPropertyException("HTTPIngressPathArgs", "pathType");
            }
            return $;
        }
    }

}
