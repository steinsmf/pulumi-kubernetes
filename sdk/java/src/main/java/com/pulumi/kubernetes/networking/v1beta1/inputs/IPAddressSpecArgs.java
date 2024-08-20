// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.networking.v1beta1.inputs.ParentReferenceArgs;
import java.util.Objects;


/**
 * IPAddressSpec describe the attributes in an IP Address.
 * 
 */
public final class IPAddressSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPAddressSpecArgs Empty = new IPAddressSpecArgs();

    /**
     * ParentRef references the resource that an IPAddress is attached to. An IPAddress must reference a parent object.
     * 
     */
    @Import(name="parentRef", required=true)
    private Output<ParentReferenceArgs> parentRef;

    /**
     * @return ParentRef references the resource that an IPAddress is attached to. An IPAddress must reference a parent object.
     * 
     */
    public Output<ParentReferenceArgs> parentRef() {
        return this.parentRef;
    }

    private IPAddressSpecArgs() {}

    private IPAddressSpecArgs(IPAddressSpecArgs $) {
        this.parentRef = $.parentRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPAddressSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPAddressSpecArgs $;

        public Builder() {
            $ = new IPAddressSpecArgs();
        }

        public Builder(IPAddressSpecArgs defaults) {
            $ = new IPAddressSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parentRef ParentRef references the resource that an IPAddress is attached to. An IPAddress must reference a parent object.
         * 
         * @return builder
         * 
         */
        public Builder parentRef(Output<ParentReferenceArgs> parentRef) {
            $.parentRef = parentRef;
            return this;
        }

        /**
         * @param parentRef ParentRef references the resource that an IPAddress is attached to. An IPAddress must reference a parent object.
         * 
         * @return builder
         * 
         */
        public Builder parentRef(ParentReferenceArgs parentRef) {
            return parentRef(Output.of(parentRef));
        }

        public IPAddressSpecArgs build() {
            if ($.parentRef == null) {
                throw new MissingRequiredPropertyException("IPAddressSpecArgs", "parentRef");
            }
            return $;
        }
    }

}