// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.outputs.ObjectReference;
import com.pulumi.kubernetes.discovery.v1.outputs.EndpointConditions;
import com.pulumi.kubernetes.discovery.v1.outputs.EndpointHints;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Endpoint {
    /**
     * @return addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
     * 
     */
    private List<String> addresses;
    /**
     * @return conditions contains information about the current status of the endpoint.
     * 
     */
    private @Nullable EndpointConditions conditions;
    /**
     * @return deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    private @Nullable Map<String,String> deprecatedTopology;
    /**
     * @return hints contains information associated with how an endpoint should be consumed.
     * 
     */
    private @Nullable EndpointHints hints;
    /**
     * @return hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    private @Nullable String hostname;
    /**
     * @return nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
     * 
     */
    private @Nullable String nodeName;
    /**
     * @return targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    private @Nullable ObjectReference targetRef;
    /**
     * @return zone is the name of the Zone this endpoint exists in.
     * 
     */
    private @Nullable String zone;

    private Endpoint() {}
    /**
     * @return addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
     * 
     */
    public List<String> addresses() {
        return this.addresses;
    }
    /**
     * @return conditions contains information about the current status of the endpoint.
     * 
     */
    public Optional<EndpointConditions> conditions() {
        return Optional.ofNullable(this.conditions);
    }
    /**
     * @return deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    public Map<String,String> deprecatedTopology() {
        return this.deprecatedTopology == null ? Map.of() : this.deprecatedTopology;
    }
    /**
     * @return hints contains information associated with how an endpoint should be consumed.
     * 
     */
    public Optional<EndpointHints> hints() {
        return Optional.ofNullable(this.hints);
    }
    /**
     * @return hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
     * 
     */
    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    /**
     * @return targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    public Optional<ObjectReference> targetRef() {
        return Optional.ofNullable(this.targetRef);
    }
    /**
     * @return zone is the name of the Zone this endpoint exists in.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Endpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addresses;
        private @Nullable EndpointConditions conditions;
        private @Nullable Map<String,String> deprecatedTopology;
        private @Nullable EndpointHints hints;
        private @Nullable String hostname;
        private @Nullable String nodeName;
        private @Nullable ObjectReference targetRef;
        private @Nullable String zone;
        public Builder() {}
        public Builder(Endpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.conditions = defaults.conditions;
    	      this.deprecatedTopology = defaults.deprecatedTopology;
    	      this.hints = defaults.hints;
    	      this.hostname = defaults.hostname;
    	      this.nodeName = defaults.nodeName;
    	      this.targetRef = defaults.targetRef;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder addresses(List<String> addresses) {
            if (addresses == null) {
              throw new MissingRequiredPropertyException("Endpoint", "addresses");
            }
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder conditions(@Nullable EndpointConditions conditions) {

            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder deprecatedTopology(@Nullable Map<String,String> deprecatedTopology) {

            this.deprecatedTopology = deprecatedTopology;
            return this;
        }
        @CustomType.Setter
        public Builder hints(@Nullable EndpointHints hints) {

            this.hints = hints;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {

            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(@Nullable String nodeName) {

            this.nodeName = nodeName;
            return this;
        }
        @CustomType.Setter
        public Builder targetRef(@Nullable ObjectReference targetRef) {

            this.targetRef = targetRef;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public Endpoint build() {
            final var _resultValue = new Endpoint();
            _resultValue.addresses = addresses;
            _resultValue.conditions = conditions;
            _resultValue.deprecatedTopology = deprecatedTopology;
            _resultValue.hints = hints;
            _resultValue.hostname = hostname;
            _resultValue.nodeName = nodeName;
            _resultValue.targetRef = targetRef;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
