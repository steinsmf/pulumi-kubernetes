// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.events.v1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.core.v1.outputs.EventSourcePatch;
import com.pulumi.kubernetes.core.v1.outputs.ObjectReferencePatch;
import com.pulumi.kubernetes.events.v1.EventPatchArgs;
import com.pulumi.kubernetes.events.v1.outputs.EventSeriesPatch;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMetaPatch;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Patch resources are used to modify existing Kubernetes resources by using
 * Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
 * one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
 * Conflicts will result in an error by default, but can be forced using the &#34;pulumi.com/patchForce&#34; annotation. See the
 * [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/how-to-guides/managing-resources-with-server-side-apply/) for
 * additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
 * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 * 
 */
@ResourceType(type="kubernetes:events.k8s.io/v1:EventPatch")
public class EventPatch extends com.pulumi.resources.CustomResource {
    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> action;

    /**
     * @return action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public Output<Optional<String>> action() {
        return Codegen.optional(this.action);
    }
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
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Export(name="deprecatedCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deprecatedCount;

    /**
     * @return deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Output<Optional<Integer>> deprecatedCount() {
        return Codegen.optional(this.deprecatedCount);
    }
    /**
     * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Export(name="deprecatedFirstTimestamp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deprecatedFirstTimestamp;

    /**
     * @return deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Output<Optional<String>> deprecatedFirstTimestamp() {
        return Codegen.optional(this.deprecatedFirstTimestamp);
    }
    /**
     * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Export(name="deprecatedLastTimestamp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deprecatedLastTimestamp;

    /**
     * @return deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Output<Optional<String>> deprecatedLastTimestamp() {
        return Codegen.optional(this.deprecatedLastTimestamp);
    }
    /**
     * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    @Export(name="deprecatedSource", refs={EventSourcePatch.class}, tree="[0]")
    private Output</* @Nullable */ EventSourcePatch> deprecatedSource;

    /**
     * @return deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Output<Optional<EventSourcePatch>> deprecatedSource() {
        return Codegen.optional(this.deprecatedSource);
    }
    /**
     * eventTime is the time when this Event was first observed. It is required.
     * 
     */
    @Export(name="eventTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventTime;

    /**
     * @return eventTime is the time when this Event was first observed. It is required.
     * 
     */
    public Output<Optional<String>> eventTime() {
        return Codegen.optional(this.eventTime);
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
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    @Export(name="note", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> note;

    /**
     * @return note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    public Output<Optional<String>> note() {
        return Codegen.optional(this.note);
    }
    /**
     * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @Export(name="reason", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reason;

    /**
     * @return reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public Output<Optional<String>> reason() {
        return Codegen.optional(this.reason);
    }
    /**
     * regarding contains the object this Event is about. In most cases it&#39;s an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    @Export(name="regarding", refs={ObjectReferencePatch.class}, tree="[0]")
    private Output</* @Nullable */ ObjectReferencePatch> regarding;

    /**
     * @return regarding contains the object this Event is about. In most cases it&#39;s an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    public Output<Optional<ObjectReferencePatch>> regarding() {
        return Codegen.optional(this.regarding);
    }
    /**
     * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    @Export(name="related", refs={ObjectReferencePatch.class}, tree="[0]")
    private Output</* @Nullable */ ObjectReferencePatch> related;

    /**
     * @return related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    public Output<Optional<ObjectReferencePatch>> related() {
        return Codegen.optional(this.related);
    }
    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    @Export(name="reportingController", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reportingController;

    /**
     * @return reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    public Output<Optional<String>> reportingController() {
        return Codegen.optional(this.reportingController);
    }
    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    @Export(name="reportingInstance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reportingInstance;

    /**
     * @return reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public Output<Optional<String>> reportingInstance() {
        return Codegen.optional(this.reportingInstance);
    }
    /**
     * series is data about the Event series this event represents or nil if it&#39;s a singleton Event.
     * 
     */
    @Export(name="series", refs={EventSeriesPatch.class}, tree="[0]")
    private Output</* @Nullable */ EventSeriesPatch> series;

    /**
     * @return series is data about the Event series this event represents or nil if it&#39;s a singleton Event.
     * 
     */
    public Output<Optional<EventSeriesPatch>> series() {
        return Codegen.optional(this.series);
    }
    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventPatch(String name) {
        this(name, EventPatchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventPatch(String name, @Nullable EventPatchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventPatch(String name, @Nullable EventPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:events.k8s.io/v1:EventPatch", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private EventPatch(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:events.k8s.io/v1:EventPatch", name, null, makeResourceOptions(options, id));
    }

    private static EventPatchArgs makeArgs(@Nullable EventPatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? EventPatchArgs.builder() : EventPatchArgs.builder(args);
        return builder
            .apiVersion("events.k8s.io/v1")
            .kind("Event")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:core/v1:EventPatch").build()),
                Output.of(Alias.builder().type("kubernetes:events.k8s.io/v1beta1:EventPatch").build())
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
    public static EventPatch get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventPatch(name, id, options);
    }
}
