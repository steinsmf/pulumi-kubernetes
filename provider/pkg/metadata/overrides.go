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
	"strconv"
	"strings"
	"time"

	"github.com/pulumi/pulumi-kubernetes/provider/v4/pkg/await/condition"
	"github.com/pulumi/pulumi-kubernetes/provider/v4/pkg/logging"
	appsv1 "k8s.io/api/apps/v1"
	appsv1beta1 "k8s.io/api/apps/v1beta1"
	appsv1beta2 "k8s.io/api/apps/v1beta2"
	batchv1 "k8s.io/api/batch/v1"
	corev1 "k8s.io/api/core/v1"
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	"k8s.io/apimachinery/pkg/apis/meta/v1/unstructured"
)

// SkipAwaitLogic returns true if the `pulumi.com/skipAwait` annotation is "true", false otherwise.
func SkipAwaitLogic(obj *unstructured.Unstructured) bool {
	return IsAnnotationTrue(obj, AnnotationSkipAwait)
}

// ReplaceUnready returns true if the `pulumi.com/replaceUnready` annotation is "true", false otherwise.
func ReplaceUnready(obj *unstructured.Unstructured) bool {
	return IsAnnotationTrue(obj, AnnotationReplaceUnready)
}

// TimeoutDuration returns the resource timeout duration. There are a number of things it can do here in this order:
// 1. Return the timeout as specified in the customResource options
// 2. Return the timeout as specified in `pulumi.com/timeoutSeconds` annotation,
// 3. Return nil if the annotation is unset/invalid.
func TimeoutDuration(resourceTimeoutSeconds float64, obj *unstructured.Unstructured) *time.Duration {
	if resourceTimeoutSeconds != 0 {
		timeout := time.Duration(resourceTimeoutSeconds) * time.Second
		return &timeout
	} else if s := GetAnnotationValue(obj, AnnotationTimeoutSeconds); s != "" {
		val, err := strconv.Atoi(s)
		if err == nil {
			timeout := time.Duration(val) * time.Second
			return &timeout
		}
	}

	return nil
}

// DeletionPropagation returns the delete propagation policy, Foreground by default.
func DeletionPropagation(obj *unstructured.Unstructured) metav1.DeletionPropagation {
	policy := GetAnnotationValue(obj, AnnotationDeletionPropagation)
	switch strings.ToLower(policy) {
	case "orphan":
		return metav1.DeletePropagationOrphan
	case "background":
		return metav1.DeletePropagationBackground
	default:
		return metav1.DeletePropagationForeground
	}
}

// DeletedCondition inspects the object's annotations and returns a
// condition.Satisfier appropriate for using when awaiting deletion.
//
// The "inputs" parameter is the source of truth for user-provided annotations,
// but it is not guaranteed to be named. The "obj" parameter should be used for
// conditions.
func DeletedCondition(
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
