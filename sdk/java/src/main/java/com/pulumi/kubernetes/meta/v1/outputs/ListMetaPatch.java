// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListMetaPatch {
    /**
     * @return continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    private @Nullable String continue_;
    /**
     * @return remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    private @Nullable Integer remainingItemCount;
    /**
     * @return String that identifies the server&#39;s internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    private @Nullable String resourceVersion;
    /**
     * @return Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     * 
     */
    private @Nullable String selfLink;

    private ListMetaPatch() {}
    /**
     * @return continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    public Optional<String> continue_() {
        return Optional.ofNullable(this.continue_);
    }
    /**
     * @return remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    public Optional<Integer> remainingItemCount() {
        return Optional.ofNullable(this.remainingItemCount);
    }
    /**
     * @return String that identifies the server&#39;s internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    public Optional<String> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }
    /**
     * @return Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     * 
     */
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMetaPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String continue_;
        private @Nullable Integer remainingItemCount;
        private @Nullable String resourceVersion;
        private @Nullable String selfLink;
        public Builder() {}
        public Builder(ListMetaPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continue_ = defaults.continue_;
    	      this.remainingItemCount = defaults.remainingItemCount;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
        }

        @CustomType.Setter("continue")
        public Builder continue_(@Nullable String continue_) {

            this.continue_ = continue_;
            return this;
        }
        @CustomType.Setter
        public Builder remainingItemCount(@Nullable Integer remainingItemCount) {

            this.remainingItemCount = remainingItemCount;
            return this;
        }
        @CustomType.Setter
        public Builder resourceVersion(@Nullable String resourceVersion) {

            this.resourceVersion = resourceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(@Nullable String selfLink) {

            this.selfLink = selfLink;
            return this;
        }
        public ListMetaPatch build() {
            final var _resultValue = new ListMetaPatch();
            _resultValue.continue_ = continue_;
            _resultValue.remainingItemCount = remainingItemCount;
            _resultValue.resourceVersion = resourceVersion;
            _resultValue.selfLink = selfLink;
            return _resultValue;
        }
    }
}
