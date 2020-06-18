[core-utils](../../index.md) / [com.sophoun.android.core.utils](../index.md) / [SingleLiveEvent](./index.md)

# SingleLiveEvent

`class SingleLiveEvent<T>`

This avoids a common problem with events: on configuration change (like rotation) an update
can be emitted if the observer is active. This LiveData only calls the observable if there's an
explicit call to `postValue()` or `setValue()`.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SingleLiveEvent()`<br>This avoids a common problem with events: on configuration change (like rotation) an update can be emitted if the observer is active. This LiveData only calls the observable if there's an explicit call to `postValue()` or `setValue()`. |

### Functions

| Name | Summary |
|---|---|
| [observe](observe.md) | `fun observe(owner: <ERROR CLASS>, observer: <ERROR CLASS><in `[`T`](index.md#T)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [postValue](post-value.md) | `fun postValue(value: `[`T`](index.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setValue](set-value.md) | `fun setValue(value: `[`T`](index.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
