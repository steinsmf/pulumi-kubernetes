// Copyright 2016-2019, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package metadata

import (
	"context"
	"strings"

	"github.com/pulumi/pulumi-kubernetes/provider/v4/pkg/await/condition"
	"github.com/pulumi/pulumi-kubernetes/provider/v4/pkg/logging"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"k8s.io/apimachinery/pkg/apis/meta/v1/unstructured"
	"k8s.io/client-go/dynamic"

	appsv1 "k8s.io/api/apps/v1"
	appsv1beta1 "k8s.io/api/apps/v1beta1"
	appsv1beta2 "k8s.io/api/apps/v1beta2"
	batchv1 "k8s.io/api/batch/v1"
	corev1 "k8s.io/api/core/v1"
)

const (
	AnnotationTrue  = "true"
	AnnotationFalse = "false"

	AnnotationPrefix = "pulumi.com/"

	AnnotationAutonamed      = AnnotationPrefix + "autonamed"
	AnnotationSkipAwait      = AnnotationPrefix + "skipAwait"
	AnnotationTimeoutSeconds = AnnotationPrefix + "timeoutSeconds"
	AnnotationReplaceUnready = AnnotationPrefix + "replaceUnready"

	AnnotationPatchForce        = AnnotationPrefix + "patchForce"
	AnnotationPatchFieldManager = AnnotationPrefix + "patchFieldManager"

	AnnotationDeletionPropagation = AnnotationPrefix + "deletionPropagationPolicy"

	AnnotationHelmHook = "helm.sh/hook"
)

// Annotations for internal Pulumi use only.
var internalAnnotationPrefixes = []string{AnnotationAutonamed}

// IsInternalAnnotation returns true if the specified annotation has the `pulumi.com/` prefix, false otherwise.
func IsInternalAnnotation(key string) bool {
	for _, annotationPrefix := range internalAnnotationPrefixes {
		if strings.HasPrefix(key, annotationPrefix) {
			return true
		}
	}

	return false
}

// IsHelmHookAnnotation returns true if the specified annotation has the `helm.sh/hook` prefix, false otherwise.
func IsHelmHookAnnotation(key string) bool {
	return strings.HasPrefix(key, AnnotationHelmHook)
}

// SetAnnotation sets the specified key, value annotation on the provided Unstructured object.
// TODO(levi): This won't work for Pulumi-computed values. https://github.com/pulumi/pulumi-kubernetes/issues/826
func SetAnnotation(obj *unstructured.Unstructured, key, value string) {
	// Note: Cannot use obj.GetAnnotations() here because it doesn't properly handle computed values from preview.
	// During preview, don't set annotations if the metadata or annotation contains a computed value since there's
	// no way to insert data into the computed object.
	metadataRaw := obj.Object["metadata"]
	if isComputedValue(metadataRaw) {
		return
	}
	metadata := metadataRaw.(map[string]any)
	annotationsRaw, ok := metadata["annotations"]
	if isComputedValue(annotationsRaw) {
		return
	}
	var annotations map[string]any
	if !ok {
		annotations = make(map[string]any)
	} else {
		annotations = annotationsRaw.(map[string]any)
	}
	annotations[key] = value

	metadata["annotations"] = annotations
}

// SetAnnotationTrue sets the specified annotation key to "true" on the provided Unstructured object.
func SetAnnotationTrue(obj *unstructured.Unstructured, key string) {
	SetAnnotation(obj, key, AnnotationTrue)
}

// IsAnnotationTrue returns true if the specified annotation has the value "true", false otherwise.
func IsAnnotationTrue(obj *unstructured.Unstructured, key string) bool {
	annotations := obj.GetAnnotations()
	value := annotations[key]
	return value == AnnotationTrue
}

// GetAnnotationValue returns the value of the specified annotation on the provided Unstructured object.
func GetAnnotationValue(obj *unstructured.Unstructured, key string) string {
	annotations := obj.GetAnnotations()
	return annotations[key]
}

// GetDeletedCondition inspects the object's annotations and returns a
// condition.Satisfier appropriate for using when awaiting deletion.
//
// The "inputs" parameter is the source of truth for user-provided annotations,
// but it is not guaranteed to be named. The "obj" parameter should be used for
// conditions.
func GetDeletedCondition(
	ctx context.Context,
	source condition.Source,
	clientset clientGetter,
	logger *logging.DedupLogger,
	inputs *unstructured.Unstructured,
	obj *unstructured.Unstructured,
) (condition.Satisfier, error) {
	if IsAnnotationTrue(inputs, AnnotationSkipAwait) && allowsSkipAwaitWithDelete(inputs) {
		return condition.NewImmediate(logger, obj), nil
	}
	getter, err := clientset.ResourceClientForObject(obj)
	if err != nil {
		return nil, err
	}
	return condition.NewDeleted(ctx, source, getter, logger, obj)
}

// allowsSkipDelete returns true for legacy types which support buggy skipAwait behavior during delete.
// See also:
// https://github.com/pulumi/pulumi-kubernetes/issues/1232
// https://github.com/pulumi/pulumi-kubernetes/issues/3154
func allowsSkipAwaitWithDelete(inputs *unstructured.Unstructured) bool {

}

// allowsSkipDelete returns true for legacy types which support buggy skipAwait
// behavior during delete.
// See also:
// https://github.com/pulumi/pulumi-kubernetes/issues/1232
// https://github.com/pulumi/pulumi-kubernetes/issues/3154
func allowsSkipAwaitWithDelete(inputs *unstructured.Unstructured) bool {
	switch inputs.GroupVersionKind() {
	case corev1.SchemeGroupVersion.WithKind("Namespace"),
		corev1.SchemeGroupVersion.WithKind("Pod"),
		corev1.SchemeGroupVersion.WithKind("ReplicationController"),
		appsv1.SchemeGroupVersion.WithKind("DaemonSet"),
		appsv1beta1.SchemeGroupVersion.WithKind("DaemonSet"),
		appsv1beta2.SchemeGroupVersion.WithKind("DaemonSet"),
		appsv1.SchemeGroupVersion.WithKind("Deployment"),
		appsv1beta1.SchemeGroupVersion.WithKind("Deployment"),
		appsv1beta2.SchemeGroupVersion.WithKind("Deployment"),
		appsv1.SchemeGroupVersion.WithKind("StatefulSet"),
		appsv1beta1.SchemeGroupVersion.WithKind("StatefulSet"),
		appsv1beta2.SchemeGroupVersion.WithKind("StatefulSet"),
		batchv1.SchemeGroupVersion.WithKind("Job"):
		return true
	}
	return false
}

func isComputedValue(v any) bool {
	_, isComputed := v.(resource.Computed)
	return isComputed
}

type clientGetter interface {
	ResourceClientForObject(*unstructured.Unstructured) (dynamic.ResourceInterface, error)
}
