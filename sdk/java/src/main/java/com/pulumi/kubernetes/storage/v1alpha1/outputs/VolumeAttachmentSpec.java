// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.storage.v1alpha1.outputs.VolumeAttachmentSource;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeAttachmentSpec {
    /**
     * @return Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    private String attacher;
    /**
     * @return The node that the volume should be attached to.
     * 
     */
    private String nodeName;
    /**
     * @return Source represents the volume that should be attached.
     * 
     */
    private VolumeAttachmentSource source;

    private VolumeAttachmentSpec() {}
    /**
     * @return Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    public String attacher() {
        return this.attacher;
    }
    /**
     * @return The node that the volume should be attached to.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }
    /**
     * @return Source represents the volume that should be attached.
     * 
     */
    public VolumeAttachmentSource source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attacher;
        private String nodeName;
        private VolumeAttachmentSource source;
        public Builder() {}
        public Builder(VolumeAttachmentSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attacher = defaults.attacher;
    	      this.nodeName = defaults.nodeName;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder attacher(String attacher) {
            if (attacher == null) {
              throw new MissingRequiredPropertyException("VolumeAttachmentSpec", "attacher");
            }
            this.attacher = attacher;
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            if (nodeName == null) {
              throw new MissingRequiredPropertyException("VolumeAttachmentSpec", "nodeName");
            }
            this.nodeName = nodeName;
            return this;
        }
        @CustomType.Setter
        public Builder source(VolumeAttachmentSource source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("VolumeAttachmentSpec", "source");
            }
            this.source = source;
            return this;
        }
        public VolumeAttachmentSpec build() {
            final var _resultValue = new VolumeAttachmentSpec();
            _resultValue.attacher = attacher;
            _resultValue.nodeName = nodeName;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
