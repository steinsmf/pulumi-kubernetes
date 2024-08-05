// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParamRef {
    /**
     * @return name is the name of the resource being referenced.
     * 
     * One of `name` or `selector` must be set, but `name` and `selector` are mutually exclusive properties. If one is set, the other must be unset.
     * 
     * A single parameter used for all admission requests can be configured by setting the `name` field, leaving `selector` blank, and setting namespace if `paramKind` is namespace-scoped.
     * 
     */
    private @Nullable String name;
    /**
     * @return namespace is the namespace of the referenced resource. Allows limiting the search for params to a specific namespace. Applies to both `name` and `selector` fields.
     * 
     * A per-namespace parameter may be used by specifying a namespace-scoped `paramKind` in the policy and leaving this field empty.
     * 
     * - If `paramKind` is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.
     * 
     * - If `paramKind` is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return `parameterNotFoundAction` controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding. If the value is set to `Allow`, then no matched parameters will be treated as successful validation by the binding. If set to `Deny`, then no matched parameters will be subject to the `failurePolicy` of the policy.
     * 
     * Allowed values are `Allow` or `Deny`
     * 
     * Required
     * 
     */
    private @Nullable String parameterNotFoundAction;
    /**
     * @return selector can be used to match multiple param objects based on their labels. Supply selector: {} to match all resources of the ParamKind.
     * 
     * If multiple params are found, they are all evaluated with the policy expressions and the results are ANDed together.
     * 
     * One of `name` or `selector` must be set, but `name` and `selector` are mutually exclusive properties. If one is set, the other must be unset.
     * 
     */
    private @Nullable LabelSelector selector;

    private ParamRef() {}
    /**
     * @return name is the name of the resource being referenced.
     * 
     * One of `name` or `selector` must be set, but `name` and `selector` are mutually exclusive properties. If one is set, the other must be unset.
     * 
     * A single parameter used for all admission requests can be configured by setting the `name` field, leaving `selector` blank, and setting namespace if `paramKind` is namespace-scoped.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return namespace is the namespace of the referenced resource. Allows limiting the search for params to a specific namespace. Applies to both `name` and `selector` fields.
     * 
     * A per-namespace parameter may be used by specifying a namespace-scoped `paramKind` in the policy and leaving this field empty.
     * 
     * - If `paramKind` is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.
     * 
     * - If `paramKind` is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return `parameterNotFoundAction` controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding. If the value is set to `Allow`, then no matched parameters will be treated as successful validation by the binding. If set to `Deny`, then no matched parameters will be subject to the `failurePolicy` of the policy.
     * 
     * Allowed values are `Allow` or `Deny`
     * 
     * Required
     * 
     */
    public Optional<String> parameterNotFoundAction() {
        return Optional.ofNullable(this.parameterNotFoundAction);
    }
    /**
     * @return selector can be used to match multiple param objects based on their labels. Supply selector: {} to match all resources of the ParamKind.
     * 
     * If multiple params are found, they are all evaluated with the policy expressions and the results are ANDed together.
     * 
     * One of `name` or `selector` must be set, but `name` and `selector` are mutually exclusive properties. If one is set, the other must be unset.
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParamRef defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable String parameterNotFoundAction;
        private @Nullable LabelSelector selector;
        public Builder() {}
        public Builder(ParamRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.parameterNotFoundAction = defaults.parameterNotFoundAction;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder parameterNotFoundAction(@Nullable String parameterNotFoundAction) {

            this.parameterNotFoundAction = parameterNotFoundAction;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelector selector) {

            this.selector = selector;
            return this;
        }
        public ParamRef build() {
            final var _resultValue = new ParamRef();
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.parameterNotFoundAction = parameterNotFoundAction;
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
