// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
 * 
 */
public final class SecretReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretReferenceArgs Empty = new SecretReferenceArgs();

    /**
     * name is unique within a namespace to reference a secret resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name is unique within a namespace to reference a secret resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * namespace defines the space within which the secret name must be unique.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return namespace defines the space within which the secret name must be unique.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private SecretReferenceArgs() {}

    private SecretReferenceArgs(SecretReferenceArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretReferenceArgs $;

        public Builder() {
            $ = new SecretReferenceArgs();
        }

        public Builder(SecretReferenceArgs defaults) {
            $ = new SecretReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name name is unique within a namespace to reference a secret resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name is unique within a namespace to reference a secret resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace namespace defines the space within which the secret name must be unique.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace namespace defines the space within which the secret name must be unique.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public SecretReferenceArgs build() {
            return $;
        }
    }

}
