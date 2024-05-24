// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apps.v1beta1.outputs.RollingUpdateDeployment;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentStrategy {
    /**
     * @return Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
     */
    private @Nullable RollingUpdateDeployment rollingUpdate;
    /**
     * @return Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
     * 
     */
    private @Nullable String type;

    private DeploymentStrategy() {}
    /**
     * @return Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
     */
    public Optional<RollingUpdateDeployment> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * @return Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RollingUpdateDeployment rollingUpdate;
        private @Nullable String type;
        public Builder() {}
        public Builder(DeploymentStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder rollingUpdate(@Nullable RollingUpdateDeployment rollingUpdate) {

            this.rollingUpdate = rollingUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public DeploymentStrategy build() {
            final var _resultValue = new DeploymentStrategy();
            _resultValue.rollingUpdate = rollingUpdate;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
