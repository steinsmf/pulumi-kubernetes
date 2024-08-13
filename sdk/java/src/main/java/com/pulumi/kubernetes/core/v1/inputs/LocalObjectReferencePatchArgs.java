// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
 * 
 */
public final class LocalObjectReferencePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalObjectReferencePatchArgs Empty = new LocalObjectReferencePatchArgs();

    /**
     * Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LocalObjectReferencePatchArgs() {}

    private LocalObjectReferencePatchArgs(LocalObjectReferencePatchArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalObjectReferencePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalObjectReferencePatchArgs $;

        public Builder() {
            $ = new LocalObjectReferencePatchArgs();
        }

        public Builder(LocalObjectReferencePatchArgs defaults) {
            $ = new LocalObjectReferencePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LocalObjectReferencePatchArgs build() {
            return $;
        }
    }

}
