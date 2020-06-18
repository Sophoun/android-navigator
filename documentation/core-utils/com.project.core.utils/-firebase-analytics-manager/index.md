[core-utils](../../index.md) / [com.sophoun.android.core.utils](../index.md) / [FirebaseAnalyticsManager](./index.md)

# FirebaseAnalyticsManager

`class FirebaseAnalyticsManager`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FirebaseAnalyticsManager(context: <ERROR CLASS>)` |

### Functions

| Name | Summary |
|---|---|
| [logEvent](log-event.md) | `fun logEvent(event: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, properties: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Send an event |
| [setCurrentScreen](set-current-screen.md) | `fun setCurrentScreen(activity: <ERROR CLASS>?, screenName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, clazz: `[`Class`](https://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<*>? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Send current screen view |
| [setUserId](set-user-id.md) | `fun setUserId(userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set `user id` for firebase analytic |
| [setUserProperty](set-user-property.md) | `fun setUserProperty(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Send user property |
