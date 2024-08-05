// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.core.v1.SecretPatchArgs;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMetaPatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Patch resources are used to modify existing Kubernetes resources by using
 * Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
 * one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
 * Conflicts will result in an error by default, but can be forced using the &#34;pulumi.com/patchForce&#34; annotation. See the
 * [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
 * additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
 * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 * 
 * Note: While Pulumi automatically encrypts the &#39;data&#39; and &#39;stringData&#39;
 * fields, this encryption only applies to Pulumi&#39;s context, including the state file,
 * the Service, the CLI, etc. Kubernetes does not encrypt Secret resources by default,
 * and the contents are visible to users with access to the Secret in Kubernetes using
 * tools like &#39;kubectl&#39;.
 * 
 * For more information on securing Kubernetes Secrets, see the following links:
 * https://kubernetes.io/docs/concepts/configuration/secret/#security-properties
 * https://kubernetes.io/docs/concepts/configuration/secret/#risks
 * 
 */
@ResourceType(type="kubernetes:core/v1:SecretPatch")
public class SecretPatch extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<Optional<String>> apiVersion() {
        return Codegen.optional(this.apiVersion);
    }
    /**
     * Data contains the secret data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    @Export(name="data", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> data;

    /**
     * @return Data contains the secret data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    public Output<Optional<Map<String,String>>> data() {
        return Codegen.optional(this.data);
    }
    /**
     * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    @Export(name="immutable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> immutable;

    /**
     * @return Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    public Output<Optional<Boolean>> immutable() {
        return Codegen.optional(this.immutable);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", refs={ObjectMetaPatch.class}, tree="[0]")
    private Output</* @Nullable */ ObjectMetaPatch> metadata;

    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output<Optional<ObjectMetaPatch>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    @Export(name="stringData", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> stringData;

    /**
     * @return stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    public Output<Optional<Map<String,String>>> stringData() {
        return Codegen.optional(this.stringData);
    }
    /**
     * Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretPatch(String name) {
        this(name, SecretPatchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretPatch(String name, @Nullable SecretPatchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretPatch(String name, @Nullable SecretPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:SecretPatch", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private SecretPatch(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:SecretPatch", name, null, makeResourceOptions(options, id));
    }

    private static SecretPatchArgs makeArgs(@Nullable SecretPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? SecretPatchArgs.builder() : SecretPatchArgs.builder(args);
        return builder
            .apiVersion("v1")
            .kind("Secret")
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
    public static SecretPatch get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretPatch(name, id, options);
    }
}
