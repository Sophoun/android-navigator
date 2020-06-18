[core-utils](../../index.md) / [com.sophoun.android.framework.adapter](../index.md) / [BaseRecyclerAdapter](index.md) / [addOnItemTouchListener](./add-on-item-touch-listener.md)

# addOnItemTouchListener

`fun addOnItemTouchListener(onItemTouchListener: (<ERROR CLASS>, <ERROR CLASS>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, item: `[`T`](index.md#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Add callback for item touch.

Note:

* Add listener and always return [false](#)
to the listener if you want adapter to invoke
[onItemClickListener](#) or [onItemLongClickListener](#)
