// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServiceAccountSubject holds detailed information for service-account-kind subject.
 * 
 */
public final class ServiceAccountSubjectPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAccountSubjectPatchArgs Empty = new ServiceAccountSubjectPatchArgs();

    /**
     * `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private ServiceAccountSubjectPatchArgs() {}

    private ServiceAccountSubjectPatchArgs(ServiceAccountSubjectPatchArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountSubjectPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountSubjectPatchArgs $;

        public Builder() {
            $ = new ServiceAccountSubjectPatchArgs();
        }

        public Builder(ServiceAccountSubjectPatchArgs defaults) {
            $ = new ServiceAccountSubjectPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
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
        public Builder namespace(@Nullable Output<String> namespace) {
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

        public ServiceAccountSubjectPatchArgs build() {
            return $;
        }
    }

}
