[core-utils](../../index.md) / [com.sophoun.android.framework.adapter](../index.md) / [BaseRecyclerAdapter](./index.md)

# BaseRecyclerAdapter

`abstract class BaseRecyclerAdapter<T>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseRecyclerAdapter()` |

### Functions

| Name | Summary |
|---|---|
| [addOnBottomReachedListener](add-on-bottom-reached-listener.md) | `fun addOnBottomReachedListener(onBottomReachedListener: (position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Listen when adapter bind the latest item to view. It means it was reached the bottom of recycler view. |
| [addOnItemClickListener](add-on-item-click-listener.md) | `fun addOnItemClickListener(onItemClickListener: (<ERROR CLASS>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, item: `[`T`](index.md#T)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Add callback for item click |
| [addOnItemLongClickListener](add-on-item-long-click-listener.md) | `fun addOnItemLongClickListener(onItemLongClickListener: (<ERROR CLASS>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, item: `[`T`](index.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Add callback for item long click |
| [addOnItemTouchListener](add-on-item-touch-listener.md) | `fun addOnItemTouchListener(onItemTouchListener: (<ERROR CLASS>, <ERROR CLASS>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, item: `[`T`](index.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Add callback for item touch. |
| [appendItems](append-items.md) | `fun appendItems(items: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [attachViewHolder](attach-view-holder.md) | `abstract fun attachViewHolder(parent: <ERROR CLASS>, viewType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`BaseRecyclerViewHolder`](../-base-recycler-view-holder/index.md)`<`[`T`](index.md#T)`>`<br>Attach ViewHolder to adapter |
| [clearItems](clear-items.md) | `fun clearItems(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getItemCount](get-item-count.md) | `open fun getItemCount(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [onBindViewHolder](on-bind-view-holder.md) | `open fun onBindViewHolder(holder: `[`BaseRecyclerViewHolder`](../-base-recycler-view-holder/index.md)`<`[`T`](index.md#T)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onCreateViewHolder](on-create-view-holder.md) | `open fun onCreateViewHolder(parent: <ERROR CLASS>, viewType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`BaseRecyclerViewHolder`](../-base-recycler-view-holder/index.md)`<`[`T`](index.md#T)`>` |
| [setItems](set-items.md) | `fun setItems(items: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
