// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


/**
 * ServiceAccountSubject holds detailed information for service-account-kind subject.
 * 
 */
public final class ServiceAccountSubjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAccountSubjectArgs Empty = new ServiceAccountSubjectArgs();

    /**
     * `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    private ServiceAccountSubjectArgs() {}

    private ServiceAccountSubjectArgs(ServiceAccountSubjectArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountSubjectArgs $;

        public Builder() {
            $ = new ServiceAccountSubjectArgs();
        }

        public Builder(ServiceAccountSubjectArgs defaults) {
            $ = new ServiceAccountSubjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace `namespace` is the namespace of matching ServiceAccount objects. Required.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace `namespace` is the namespace of matching ServiceAccount objects. Required.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public ServiceAccountSubjectArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceAccountSubjectArgs", "name");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("ServiceAccountSubjectArgs", "namespace");
            }
            return $;
        }
    }

}
