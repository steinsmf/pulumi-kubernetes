// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.storage.v1beta1.inputs.VolumeAttachmentSourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 * 
 */
public final class VolumeAttachmentSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentSpecArgs Empty = new VolumeAttachmentSpecArgs();

    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    @Import(name="attacher", required=true)
    private Output<String> attacher;

    /**
     * @return Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    public Output<String> attacher() {
        return this.attacher;
    }

    /**
     * The node that the volume should be attached to.
     * 
     */
    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    /**
     * @return The node that the volume should be attached to.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }

    /**
     * Source represents the volume that should be attached.
     * 
     */
    @Import(name="source", required=true)
    private Output<VolumeAttachmentSourceArgs> source;

    /**
     * @return Source represents the volume that should be attached.
     * 
     */
    public Output<VolumeAttachmentSourceArgs> source() {
        return this.source;
    }

    private VolumeAttachmentSpecArgs() {}

    private VolumeAttachmentSpecArgs(VolumeAttachmentSpecArgs $) {
        this.attacher = $.attacher;
        this.nodeName = $.nodeName;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeAttachmentSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeAttachmentSpecArgs $;

        public Builder() {
            $ = new VolumeAttachmentSpecArgs();
        }

        public Builder(VolumeAttachmentSpecArgs defaults) {
            $ = new VolumeAttachmentSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attacher Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
         * 
         * @return builder
         * 
         */
        public Builder attacher(Output<String> attacher) {
            $.attacher = attacher;
            return this;
        }

        /**
         * @param attacher Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
         * 
         * @return builder
         * 
         */
        public Builder attacher(String attacher) {
            return attacher(Output.of(attacher));
        }

        /**
         * @param nodeName The node that the volume should be attached to.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The node that the volume should be attached to.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param source Source represents the volume that should be attached.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<VolumeAttachmentSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Source represents the volume that should be attached.
         * 
         * @return builder
         * 
         */
        public Builder source(VolumeAttachmentSourceArgs source) {
            return source(Output.of(source));
        }

        public VolumeAttachmentSpecArgs build() {
            if ($.attacher == null) {
                throw new MissingRequiredPropertyException("VolumeAttachmentSpecArgs", "attacher");
            }
            if ($.nodeName == null) {
                throw new MissingRequiredPropertyException("VolumeAttachmentSpecArgs", "nodeName");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("VolumeAttachmentSpecArgs", "source");
            }
            return $;
        }
    }

}
