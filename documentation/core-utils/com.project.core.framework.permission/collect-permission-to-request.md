[core-utils](../index.md) / [com.sophoun.android.framework.permission](index.md) / [collectPermissionToRequest](./collect-permission-to-request.md)

# collectPermissionToRequest

`fun <ERROR CLASS>.collectPermissionToRequest(permissions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`

Collect permissions that not yet granted.
You can use this method to check permissions first
and then show the dialog or another screen before request
the actual permissions that need.

