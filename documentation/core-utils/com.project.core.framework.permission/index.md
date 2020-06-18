[core-utils](../index.md) / [com.sophoun.android.framework.permission](./index.md)

## Package com.sophoun.android.framework.permission

### Functions

| Name | Summary |
|---|---|
| [collectPermissionToRequest](collect-permission-to-request.md) | `fun <ERROR CLASS>.collectPermissionToRequest(permissions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>Collect permissions that not yet granted. You can use this method to check permissions first and then show the dialog or another screen before request the actual permissions that need. |
| [isNeedPermission](is-need-permission.md) | `fun <ERROR CLASS>.isNeedPermission(permissions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>All permissions not yet granted |
| [needPermissions](need-permissions.md) | `fun <ERROR CLASS>.needPermissions(permissions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, requestCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Provide activity extension function to easy check permission |
