// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.kubernetes.core.v1.inputs.EventSeriesArgs;
import com.pulumi.kubernetes.core.v1.inputs.EventSourceArgs;
import com.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventArgs Empty = new EventArgs();

    /**
     * What action was taken/failed regarding to the Regarding object.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return What action was taken/failed regarding to the Regarding object.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * The number of times this event has occurred.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The number of times this event has occurred.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Time when this Event was first observed.
     * 
     */
    @Import(name="eventTime")
    private @Nullable Output<String> eventTime;

    /**
     * @return Time when this Event was first observed.
     * 
     */
    public Optional<Output<String>> eventTime() {
        return Optional.ofNullable(this.eventTime);
    }

    /**
     * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
     * 
     */
    @Import(name="firstTimestamp")
    private @Nullable Output<String> firstTimestamp;

    /**
     * @return The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
     * 
     */
    public Optional<Output<String>> firstTimestamp() {
        return Optional.ofNullable(this.firstTimestamp);
    }

    /**
     * The object that this event is about.
     * 
     */
    @Import(name="involvedObject", required=true)
    private Output<ObjectReferenceArgs> involvedObject;

    /**
     * @return The object that this event is about.
     * 
     */
    public Output<ObjectReferenceArgs> involvedObject() {
        return this.involvedObject;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The time at which the most recent occurrence of this event was recorded.
     * 
     */
    @Import(name="lastTimestamp")
    private @Nullable Output<String> lastTimestamp;

    /**
     * @return The time at which the most recent occurrence of this event was recorded.
     * 
     */
    public Optional<Output<String>> lastTimestamp() {
        return Optional.ofNullable(this.lastTimestamp);
    }

    /**
     * A human-readable description of the status of this operation.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A human-readable description of the status of this operation.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata", required=true)
    private Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output<ObjectMetaArgs> metadata() {
        return this.metadata;
    }

    /**
     * This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * Optional secondary object for more complex actions.
     * 
     */
    @Import(name="related")
    private @Nullable Output<ObjectReferenceArgs> related;

    /**
     * @return Optional secondary object for more complex actions.
     * 
     */
    public Optional<Output<ObjectReferenceArgs>> related() {
        return Optional.ofNullable(this.related);
    }

    /**
     * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
     * 
     */
    @Import(name="reportingComponent")
    private @Nullable Output<String> reportingComponent;

    /**
     * @return Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
     * 
     */
    public Optional<Output<String>> reportingComponent() {
        return Optional.ofNullable(this.reportingComponent);
    }

    /**
     * ID of the controller instance, e.g. `kubelet-xyzf`.
     * 
     */
    @Import(name="reportingInstance")
    private @Nullable Output<String> reportingInstance;

    /**
     * @return ID of the controller instance, e.g. `kubelet-xyzf`.
     * 
     */
    public Optional<Output<String>> reportingInstance() {
        return Optional.ofNullable(this.reportingInstance);
    }

    /**
     * Data about the Event series this event represents or nil if it&#39;s a singleton Event.
     * 
     */
    @Import(name="series")
    private @Nullable Output<EventSeriesArgs> series;

    /**
     * @return Data about the Event series this event represents or nil if it&#39;s a singleton Event.
     * 
     */
    public Optional<Output<EventSeriesArgs>> series() {
        return Optional.ofNullable(this.series);
    }

    /**
     * The component reporting this event. Should be a short machine understandable string.
     * 
     */
    @Import(name="source")
    private @Nullable Output<EventSourceArgs> source;

    /**
     * @return The component reporting this event. Should be a short machine understandable string.
     * 
     */
    public Optional<Output<EventSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Type of this event (Normal, Warning), new types could be added in the future
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of this event (Normal, Warning), new types could be added in the future
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private EventArgs() {}

    private EventArgs(EventArgs $) {
        this.action = $.action;
        this.apiVersion = $.apiVersion;
        this.count = $.count;
        this.eventTime = $.eventTime;
        this.firstTimestamp = $.firstTimestamp;
        this.involvedObject = $.involvedObject;
        this.kind = $.kind;
        this.lastTimestamp = $.lastTimestamp;
        this.message = $.message;
        this.metadata = $.metadata;
        this.reason = $.reason;
        this.related = $.related;
        this.reportingComponent = $.reportingComponent;
        this.reportingInstance = $.reportingInstance;
        this.series = $.series;
        this.source = $.source;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventArgs $;

        public Builder() {
            $ = new EventArgs();
        }

        public Builder(EventArgs defaults) {
            $ = new EventArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action What action was taken/failed regarding to the Regarding object.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action What action was taken/failed regarding to the Regarding object.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param count The number of times this event has occurred.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of times this event has occurred.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param eventTime Time when this Event was first observed.
         * 
         * @return builder
         * 
         */
        public Builder eventTime(@Nullable Output<String> eventTime) {
            $.eventTime = eventTime;
            return this;
        }

        /**
         * @param eventTime Time when this Event was first observed.
         * 
         * @return builder
         * 
         */
        public Builder eventTime(String eventTime) {
            return eventTime(Output.of(eventTime));
        }

        /**
         * @param firstTimestamp The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
         * 
         * @return builder
         * 
         */
        public Builder firstTimestamp(@Nullable Output<String> firstTimestamp) {
            $.firstTimestamp = firstTimestamp;
            return this;
        }

        /**
         * @param firstTimestamp The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
         * 
         * @return builder
         * 
         */
        public Builder firstTimestamp(String firstTimestamp) {
            return firstTimestamp(Output.of(firstTimestamp));
        }

        /**
         * @param involvedObject The object that this event is about.
         * 
         * @return builder
         * 
         */
        public Builder involvedObject(Output<ObjectReferenceArgs> involvedObject) {
            $.involvedObject = involvedObject;
            return this;
        }

        /**
         * @param involvedObject The object that this event is about.
         * 
         * @return builder
         * 
         */
        public Builder involvedObject(ObjectReferenceArgs involvedObject) {
            return involvedObject(Output.of(involvedObject));
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param lastTimestamp The time at which the most recent occurrence of this event was recorded.
         * 
         * @return builder
         * 
         */
        public Builder lastTimestamp(@Nullable Output<String> lastTimestamp) {
            $.lastTimestamp = lastTimestamp;
            return this;
        }

        /**
         * @param lastTimestamp The time at which the most recent occurrence of this event was recorded.
         * 
         * @return builder
         * 
         */
        public Builder lastTimestamp(String lastTimestamp) {
            return lastTimestamp(Output.of(lastTimestamp));
        }

        /**
         * @param message A human-readable description of the status of this operation.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A human-readable description of the status of this operation.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param reason This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param related Optional secondary object for more complex actions.
         * 
         * @return builder
         * 
         */
        public Builder related(@Nullable Output<ObjectReferenceArgs> related) {
            $.related = related;
            return this;
        }

        /**
         * @param related Optional secondary object for more complex actions.
         * 
         * @return builder
         * 
         */
        public Builder related(ObjectReferenceArgs related) {
            return related(Output.of(related));
        }

        /**
         * @param reportingComponent Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
         * 
         * @return builder
         * 
         */
        public Builder reportingComponent(@Nullable Output<String> reportingComponent) {
            $.reportingComponent = reportingComponent;
            return this;
        }

        /**
         * @param reportingComponent Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
         * 
         * @return builder
         * 
         */
        public Builder reportingComponent(String reportingComponent) {
            return reportingComponent(Output.of(reportingComponent));
        }

        /**
         * @param reportingInstance ID of the controller instance, e.g. `kubelet-xyzf`.
         * 
         * @return builder
         * 
         */
        public Builder reportingInstance(@Nullable Output<String> reportingInstance) {
            $.reportingInstance = reportingInstance;
            return this;
        }

        /**
         * @param reportingInstance ID of the controller instance, e.g. `kubelet-xyzf`.
         * 
         * @return builder
         * 
         */
        public Builder reportingInstance(String reportingInstance) {
            return reportingInstance(Output.of(reportingInstance));
        }

        /**
         * @param series Data about the Event series this event represents or nil if it&#39;s a singleton Event.
         * 
         * @return builder
         * 
         */
        public Builder series(@Nullable Output<EventSeriesArgs> series) {
            $.series = series;
            return this;
        }

        /**
         * @param series Data about the Event series this event represents or nil if it&#39;s a singleton Event.
         * 
         * @return builder
         * 
         */
        public Builder series(EventSeriesArgs series) {
            return series(Output.of(series));
        }

        /**
         * @param source The component reporting this event. Should be a short machine understandable string.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<EventSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The component reporting this event. Should be a short machine understandable string.
         * 
         * @return builder
         * 
         */
        public Builder source(EventSourceArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param type Type of this event (Normal, Warning), new types could be added in the future
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of this event (Normal, Warning), new types could be added in the future
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public EventArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            if ($.involvedObject == null) {
                throw new MissingRequiredPropertyException("EventArgs", "involvedObject");
            }
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            if ($.metadata == null) {
                throw new MissingRequiredPropertyException("EventArgs", "metadata");
            }
            return $;
        }
    }

}
