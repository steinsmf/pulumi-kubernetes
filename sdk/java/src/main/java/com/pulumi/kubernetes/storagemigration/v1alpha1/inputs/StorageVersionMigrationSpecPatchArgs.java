// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storagemigration.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.storagemigration.v1alpha1.inputs.GroupVersionResourcePatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Spec of the storage version migration.
 * 
 */
public final class StorageVersionMigrationSpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageVersionMigrationSpecPatchArgs Empty = new StorageVersionMigrationSpecPatchArgs();

    /**
     * The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is &#34;Running&#34;, users can use this token to check the progress of the migration.
     * 
     */
    @Import(name="continueToken")
    private @Nullable Output<String> continueToken;

    /**
     * @return The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is &#34;Running&#34;, users can use this token to check the progress of the migration.
     * 
     */
    public Optional<Output<String>> continueToken() {
        return Optional.ofNullable(this.continueToken);
    }

    /**
     * The resource that is being migrated. The migrator sends requests to the endpoint serving the resource. Immutable.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<GroupVersionResourcePatchArgs> resource;

    /**
     * @return The resource that is being migrated. The migrator sends requests to the endpoint serving the resource. Immutable.
     * 
     */
    public Optional<Output<GroupVersionResourcePatchArgs>> resource() {
        return Optional.ofNullable(this.resource);
    }

    private StorageVersionMigrationSpecPatchArgs() {}

    private StorageVersionMigrationSpecPatchArgs(StorageVersionMigrationSpecPatchArgs $) {
        this.continueToken = $.continueToken;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageVersionMigrationSpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageVersionMigrationSpecPatchArgs $;

        public Builder() {
            $ = new StorageVersionMigrationSpecPatchArgs();
        }

        public Builder(StorageVersionMigrationSpecPatchArgs defaults) {
            $ = new StorageVersionMigrationSpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param continueToken The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is &#34;Running&#34;, users can use this token to check the progress of the migration.
         * 
         * @return builder
         * 
         */
        public Builder continueToken(@Nullable Output<String> continueToken) {
            $.continueToken = continueToken;
            return this;
        }

        /**
         * @param continueToken The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is &#34;Running&#34;, users can use this token to check the progress of the migration.
         * 
         * @return builder
         * 
         */
        public Builder continueToken(String continueToken) {
            return continueToken(Output.of(continueToken));
        }

        /**
         * @param resource The resource that is being migrated. The migrator sends requests to the endpoint serving the resource. Immutable.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<GroupVersionResourcePatchArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The resource that is being migrated. The migrator sends requests to the endpoint serving the resource. Immutable.
         * 
         * @return builder
         * 
         */
        public Builder resource(GroupVersionResourcePatchArgs resource) {
            return resource(Output.of(resource));
        }

        public StorageVersionMigrationSpecPatchArgs build() {
            return $;
        }
    }

}