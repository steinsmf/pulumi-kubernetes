// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1alpha1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingArgs;
import com.pulumi.kubernetes.admissionregistration.v1alpha1.outputs.ValidatingAdmissionPolicyBindingSpec;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ValidatingAdmissionPolicyBinding binds the ValidatingAdmissionPolicy with paramerized resources. ValidatingAdmissionPolicyBinding and parameter CRDs together define how cluster administrators configure policies for clusters.
 * 
 * For a given admission request, each binding will cause its policy to be evaluated N times, where N is 1 for policies/bindings that don&#39;t use params, otherwise N is the number of parameters selected by the binding.
 * 
 * The CEL expressions of a policy must have a computed CEL cost below the maximum CEL budget. Each evaluation of the policy is given an independent CEL cost budget. Adding/removing policies, bindings, or params can not affect whether a given (policy, binding, param) combination is within its own CEL budget.
 * 
 */
@ResourceType(type="kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicyBinding")
public class ValidatingAdmissionPolicyBinding extends com.pulumi.resources.CustomResource {
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
    /**
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    @Export(name="metadata", refs={ObjectMeta.class}, tree="[0]")
    private Output<ObjectMeta> metadata;

    /**
     * @return Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    public Output<ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Specification of the desired behavior of the ValidatingAdmissionPolicyBinding.
     * 
     */
    @Export(name="spec", refs={ValidatingAdmissionPolicyBindingSpec.class}, tree="[0]")
    private Output<ValidatingAdmissionPolicyBindingSpec> spec;

    /**
     * @return Specification of the desired behavior of the ValidatingAdmissionPolicyBinding.
     * 
     */
    public Output<ValidatingAdmissionPolicyBindingSpec> spec() {
        return this.spec;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ValidatingAdmissionPolicyBinding(String name) {
        this(name, ValidatingAdmissionPolicyBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ValidatingAdmissionPolicyBinding(String name, @Nullable ValidatingAdmissionPolicyBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ValidatingAdmissionPolicyBinding(String name, @Nullable ValidatingAdmissionPolicyBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicyBinding", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ValidatingAdmissionPolicyBinding(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicyBinding", name, null, makeResourceOptions(options, id));
    }

    private static ValidatingAdmissionPolicyBindingArgs makeArgs(@Nullable ValidatingAdmissionPolicyBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? ValidatingAdmissionPolicyBindingArgs.builder() : ValidatingAdmissionPolicyBindingArgs.builder(args);
        return builder
            .apiVersion("admissionregistration.k8s.io/v1alpha1")
            .kind("ValidatingAdmissionPolicyBinding")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:admissionregistration.k8s.io/v1:ValidatingAdmissionPolicyBinding").build()),
                Output.of(Alias.builder().type("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingAdmissionPolicyBinding").build())
            ))
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
    public static ValidatingAdmissionPolicyBinding get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ValidatingAdmissionPolicyBinding(name, id, options);
    }
}
