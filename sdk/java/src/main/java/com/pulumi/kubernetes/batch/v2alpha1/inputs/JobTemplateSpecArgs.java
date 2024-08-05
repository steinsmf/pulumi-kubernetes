// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v2alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.batch.v1.inputs.JobSpecArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * JobTemplateSpec describes the data a Job should have when created from a template
 * 
 */
public final class JobTemplateSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateSpecArgs Empty = new JobTemplateSpecArgs();

    /**
     * Standard object&#39;s metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object&#39;s metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="spec")
    private @Nullable Output<JobSpecArgs> spec;

    /**
     * @return Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public Optional<Output<JobSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private JobTemplateSpecArgs() {}

    private JobTemplateSpecArgs(JobTemplateSpecArgs $) {
        this.metadata = $.metadata;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateSpecArgs $;

        public Builder() {
            $ = new JobTemplateSpecArgs();
        }

        public Builder(JobTemplateSpecArgs defaults) {
            $ = new JobTemplateSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata Standard object&#39;s metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object&#39;s metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param spec Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<JobSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * 
         * @return builder
         * 
         */
        public Builder spec(JobSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public JobTemplateSpecArgs build() {
            return $;
        }
    }

}
