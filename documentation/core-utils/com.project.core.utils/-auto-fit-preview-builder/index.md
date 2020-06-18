[core-utils](../../index.md) / [com.sophoun.android.core.utils](../index.md) / [AutoFitPreviewBuilder](./index.md)

# AutoFitPreviewBuilder

`class AutoFitPreviewBuilder`

Builder for [Preview](#) that takes in a [WeakReference](https://docs.oracle.com/javase/6/docs/api/java/lang/ref/WeakReference.html) of the view finder and
[PreviewConfig](#), then instantiates a [Preview](#) which automatically
resizes and rotates reacting to config changes.

### Properties

| Name | Summary |
|---|---|
| [useCase](use-case.md) | `val useCase: <ERROR CLASS>`<br>Public instance of preview use-case which can be used by consumers of this adapter |

### Companion Object Functions

| Name | Summary |
|---|---|
| [build](build.md) | `fun build(config: <ERROR CLASS>, viewFinder: <ERROR CLASS>): <ERROR CLASS>`<br>Main entrypoint for users of this class: instantiates the adapter and returns an instance of [Preview](#) which automatically adjusts in size and rotation to compensate for config changes. |
| [getDisplaySurfaceRotation](get-display-surface-rotation.md) | `fun getDisplaySurfaceRotation(display: <ERROR CLASS>?): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>Helper function that gets the rotation of a [Display](#) in degrees |
