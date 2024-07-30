// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.certificates.v1.CertificateSigningRequestListArgs;
import com.pulumi.kubernetes.certificates.v1.outputs.CertificateSigningRequest;
import com.pulumi.kubernetes.meta.v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * CertificateSigningRequestList is a collection of CertificateSigningRequest objects
 * 
 */
@ResourceType(type="kubernetes:certificates.k8s.io/v1:CertificateSigningRequestList")
public class CertificateSigningRequestList extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * items is a collection of CertificateSigningRequest objects
     * 
     */
    @Export(name="items", refs={List.class,CertificateSigningRequest.class}, tree="[0,1]")
    private Output<List<CertificateSigningRequest>> items;

    /**
     * @return items is a collection of CertificateSigningRequest objects
     * 
     */
    public Output<List<CertificateSigningRequest>> items() {
        return this.items;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    @Export(name="metadata", refs={ListMeta.class}, tree="[0]")
    private Output<ListMeta> metadata;

    public Output<ListMeta> metadata() {
        return this.metadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateSigningRequestList(String name) {
        this(name, CertificateSigningRequestListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateSigningRequestList(String name, CertificateSigningRequestListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateSigningRequestList(String name, CertificateSigningRequestListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:certificates.k8s.io/v1:CertificateSigningRequestList", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateSigningRequestList(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:certificates.k8s.io/v1:CertificateSigningRequestList", name, null, makeResourceOptions(options, id));
    }

    private static CertificateSigningRequestListArgs makeArgs(CertificateSigningRequestListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? CertificateSigningRequestListArgs.builder() : CertificateSigningRequestListArgs.builder(args);
        return builder
            .apiVersion("certificates.k8s.io/v1")
            .kind("CertificateSigningRequestList")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CertificateSigningRequestList get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateSigningRequestList(name, id, options);
    }
}
