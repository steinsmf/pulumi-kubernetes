// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CrossVersionObjectReference contains enough information to let you identify the referred resource.
 * 
 */
public final class CrossVersionObjectReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CrossVersionObjectReferenceArgs Empty = new CrossVersionObjectReferenceArgs();

    /**
     * API version of the referent
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return API version of the referent
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private CrossVersionObjectReferenceArgs() {}

    private CrossVersionObjectReferenceArgs(CrossVersionObjectReferenceArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CrossVersionObjectReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrossVersionObjectReferenceArgs $;

        public Builder() {
            $ = new CrossVersionObjectReferenceArgs();
        }

        public Builder(CrossVersionObjectReferenceArgs defaults) {
            $ = new CrossVersionObjectReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion API version of the referent
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion API version of the referent
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param kind Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CrossVersionObjectReferenceArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
