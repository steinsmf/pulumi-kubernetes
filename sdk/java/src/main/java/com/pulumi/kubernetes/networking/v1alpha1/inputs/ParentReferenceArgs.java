// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ParentReference describes a reference to a parent object.
 * 
 */
public final class ParentReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParentReferenceArgs Empty = new ParentReferenceArgs();

    /**
     * Group is the group of the object being referenced.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Group is the group of the object being referenced.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * Name is the name of the object being referenced.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name is the name of the object being referenced.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Namespace is the namespace of the object being referenced.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace is the namespace of the object being referenced.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Resource is the resource of the object being referenced.
     * 
     */
    @Import(name="resource", required=true)
    private Output<String> resource;

    /**
     * @return Resource is the resource of the object being referenced.
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }

    /**
     * UID is the uid of the object being referenced.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return UID is the uid of the object being referenced.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private ParentReferenceArgs() {}

    private ParentReferenceArgs(ParentReferenceArgs $) {
        this.group = $.group;
        this.name = $.name;
        this.namespace = $.namespace;
        this.resource = $.resource;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParentReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParentReferenceArgs $;

        public Builder() {
            $ = new ParentReferenceArgs();
        }

        public Builder(ParentReferenceArgs defaults) {
            $ = new ParentReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group Group is the group of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Group is the group of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param name Name is the name of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is the name of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Namespace is the namespace of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace is the namespace of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param resource Resource is the resource of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Resource is the resource of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param uid UID is the uid of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid UID is the uid of the object being referenced.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public ParentReferenceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ParentReferenceArgs", "name");
            }
            if ($.resource == null) {
                throw new MissingRequiredPropertyException("ParentReferenceArgs", "resource");
            }
            return $;
        }
    }

}
