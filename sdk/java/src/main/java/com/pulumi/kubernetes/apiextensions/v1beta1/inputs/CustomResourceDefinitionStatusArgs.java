// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.apiextensions.v1beta1.inputs.CustomResourceDefinitionConditionArgs;
import com.pulumi.kubernetes.apiextensions.v1beta1.inputs.CustomResourceDefinitionNamesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
 * 
 */
public final class CustomResourceDefinitionStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionStatusArgs Empty = new CustomResourceDefinitionStatusArgs();

    /**
     * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
     * 
     */
    @Import(name="acceptedNames", required=true)
    private Output<CustomResourceDefinitionNamesArgs> acceptedNames;

    /**
     * @return acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
     * 
     */
    public Output<CustomResourceDefinitionNamesArgs> acceptedNames() {
        return this.acceptedNames;
    }

    /**
     * conditions indicate state for particular aspects of a CustomResourceDefinition
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<CustomResourceDefinitionConditionArgs>> conditions;

    /**
     * @return conditions indicate state for particular aspects of a CustomResourceDefinition
     * 
     */
    public Optional<Output<List<CustomResourceDefinitionConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
     * 
     */
    @Import(name="storedVersions", required=true)
    private Output<List<String>> storedVersions;

    /**
     * @return storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
     * 
     */
    public Output<List<String>> storedVersions() {
        return this.storedVersions;
    }

    private CustomResourceDefinitionStatusArgs() {}

    private CustomResourceDefinitionStatusArgs(CustomResourceDefinitionStatusArgs $) {
        this.acceptedNames = $.acceptedNames;
        this.conditions = $.conditions;
        this.storedVersions = $.storedVersions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceDefinitionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceDefinitionStatusArgs $;

        public Builder() {
            $ = new CustomResourceDefinitionStatusArgs();
        }

        public Builder(CustomResourceDefinitionStatusArgs defaults) {
            $ = new CustomResourceDefinitionStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptedNames acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
         * 
         * @return builder
         * 
         */
        public Builder acceptedNames(Output<CustomResourceDefinitionNamesArgs> acceptedNames) {
            $.acceptedNames = acceptedNames;
            return this;
        }

        /**
         * @param acceptedNames acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
         * 
         * @return builder
         * 
         */
        public Builder acceptedNames(CustomResourceDefinitionNamesArgs acceptedNames) {
            return acceptedNames(Output.of(acceptedNames));
        }

        /**
         * @param conditions conditions indicate state for particular aspects of a CustomResourceDefinition
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<CustomResourceDefinitionConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions conditions indicate state for particular aspects of a CustomResourceDefinition
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<CustomResourceDefinitionConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions conditions indicate state for particular aspects of a CustomResourceDefinition
         * 
         * @return builder
         * 
         */
        public Builder conditions(CustomResourceDefinitionConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param storedVersions storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
         * 
         * @return builder
         * 
         */
        public Builder storedVersions(Output<List<String>> storedVersions) {
            $.storedVersions = storedVersions;
            return this;
        }

        /**
         * @param storedVersions storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
         * 
         * @return builder
         * 
         */
        public Builder storedVersions(List<String> storedVersions) {
            return storedVersions(Output.of(storedVersions));
        }

        /**
         * @param storedVersions storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
         * 
         * @return builder
         * 
         */
        public Builder storedVersions(String... storedVersions) {
            return storedVersions(List.of(storedVersions));
        }

        public CustomResourceDefinitionStatusArgs build() {
            if ($.acceptedNames == null) {
                throw new MissingRequiredPropertyException("CustomResourceDefinitionStatusArgs", "acceptedNames");
            }
            if ($.storedVersions == null) {
                throw new MissingRequiredPropertyException("CustomResourceDefinitionStatusArgs", "storedVersions");
            }
            return $;
        }
    }

}
