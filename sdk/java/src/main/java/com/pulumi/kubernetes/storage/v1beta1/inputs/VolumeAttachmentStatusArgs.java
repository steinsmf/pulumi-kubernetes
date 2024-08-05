// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.storage.v1beta1.inputs.VolumeErrorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 * 
 */
public final class VolumeAttachmentStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentStatusArgs Empty = new VolumeAttachmentStatusArgs();

    /**
     * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="attachError")
    private @Nullable Output<VolumeErrorArgs> attachError;

    /**
     * @return The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    public Optional<Output<VolumeErrorArgs>> attachError() {
        return Optional.ofNullable(this.attachError);
    }

    /**
     * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="attached", required=true)
    private Output<Boolean> attached;

    /**
     * @return Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    public Output<Boolean> attached() {
        return this.attached;
    }

    /**
     * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="attachmentMetadata")
    private @Nullable Output<Map<String,String>> attachmentMetadata;

    /**
     * @return Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    public Optional<Output<Map<String,String>>> attachmentMetadata() {
        return Optional.ofNullable(this.attachmentMetadata);
    }

    /**
     * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="detachError")
    private @Nullable Output<VolumeErrorArgs> detachError;

    /**
     * @return The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
     * 
     */
    public Optional<Output<VolumeErrorArgs>> detachError() {
        return Optional.ofNullable(this.detachError);
    }

    private VolumeAttachmentStatusArgs() {}

    private VolumeAttachmentStatusArgs(VolumeAttachmentStatusArgs $) {
        this.attachError = $.attachError;
        this.attached = $.attached;
        this.attachmentMetadata = $.attachmentMetadata;
        this.detachError = $.detachError;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeAttachmentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeAttachmentStatusArgs $;

        public Builder() {
            $ = new VolumeAttachmentStatusArgs();
        }

        public Builder(VolumeAttachmentStatusArgs defaults) {
            $ = new VolumeAttachmentStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachError The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder attachError(@Nullable Output<VolumeErrorArgs> attachError) {
            $.attachError = attachError;
            return this;
        }

        /**
         * @param attachError The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder attachError(VolumeErrorArgs attachError) {
            return attachError(Output.of(attachError));
        }

        /**
         * @param attached Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder attached(Output<Boolean> attached) {
            $.attached = attached;
            return this;
        }

        /**
         * @param attached Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder attached(Boolean attached) {
            return attached(Output.of(attached));
        }

        /**
         * @param attachmentMetadata Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder attachmentMetadata(@Nullable Output<Map<String,String>> attachmentMetadata) {
            $.attachmentMetadata = attachmentMetadata;
            return this;
        }

        /**
         * @param attachmentMetadata Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder attachmentMetadata(Map<String,String> attachmentMetadata) {
            return attachmentMetadata(Output.of(attachmentMetadata));
        }

        /**
         * @param detachError The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder detachError(@Nullable Output<VolumeErrorArgs> detachError) {
            $.detachError = detachError;
            return this;
        }

        /**
         * @param detachError The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
         * 
         * @return builder
         * 
         */
        public Builder detachError(VolumeErrorArgs detachError) {
            return detachError(Output.of(detachError));
        }

        public VolumeAttachmentStatusArgs build() {
            if ($.attached == null) {
                throw new MissingRequiredPropertyException("VolumeAttachmentStatusArgs", "attached");
            }
            return $;
        }
    }

}
