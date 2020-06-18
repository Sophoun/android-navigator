[core-utils](../../index.md) / [com.sophoun.android.framework.query](../index.md) / [SelectQueryBuilder](./index.md)

# SelectQueryBuilder

`class SelectQueryBuilder<T> : `[`QueryBuilder`](../-query-builder/index.md)`<<ERROR CLASS>, `[`T`](index.md#T)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>>`

This class use for query data from android database
using ContentProvider

Sample usage:

```
SelectQueryBuilder<Album>(context?.contentResolver!!)
      .projection(
         MediaStore.Audio.Playlists._ID,
         MediaStore.Audio.Playlists.NAME
      ).orderBy("${MediaStore.Audio.Playlists.NAME} ASC")
      .uri(MediaStore.Audio.Playlists.Members.getContentUri("external", 2818))
      .mapper {
         Album(
             it.getInt(it.getColumnIndex(MediaStore.Audio.Playlists._ID)),
             it.getString(it.getColumnIndex(MediaStore.Audio.Playlists.NAME))
         )
      }.onResult {
         DLog.i("Result", it.distinct().toString())
      }.onError {
         DLog.i("Result", it.message.toString())
      }.execute()
```

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SelectQueryBuilder(contentResolver: <ERROR CLASS>)`<br>This class use for query data from android database using ContentProvider |

### Inherited Properties

| Name | Summary |
|---|---|
| [contentResolver](../-query-builder/content-resolver.md) | `val contentResolver: <ERROR CLASS>` |
| [selection](../-query-builder/selection.md) | `var selection: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [selectionArgs](../-query-builder/selection-args.md) | `var selectionArgs: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<out `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [uri](../-query-builder/uri.md) | `var uri: <ERROR CLASS>?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | `fun execute(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute the query builder. Result wills callback: |
| [orderBy](order-by.md) | `fun orderBy(orderBy: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SelectQueryBuilder`](./index.md)`<`[`T`](index.md#T)`>`<br>order by condition |
| [projection](projection.md) | `fun projection(vararg projection: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SelectQueryBuilder`](./index.md)`<`[`T`](index.md#T)`>`<br>selection fields |

### Inherited Functions

| Name | Summary |
|---|---|
| [mapper](../-query-builder/mapper.md) | `fun mapper(mapper: (`[`I`](../-query-builder/index.md#I)`) -> `[`O`](../-query-builder/index.md#O)`): `[`QueryBuilder`](../-query-builder/index.md)`<`[`I`](../-query-builder/index.md#I)`, `[`O`](../-query-builder/index.md#O)`, `[`T`](../-query-builder/index.md#T)`>`<br>Map each object from cursor to T |
| [onCompleted](../-query-builder/on-completed.md) | `fun onCompleted(onCompleted: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`QueryBuilder`](../-query-builder/index.md)`<`[`I`](../-query-builder/index.md#I)`, `[`O`](../-query-builder/index.md#O)`, `[`T`](../-query-builder/index.md#T)`>`<br>After all process completed |
| [onError](../-query-builder/on-error.md) | `fun onError(onError: (`[`Exception`](https://docs.oracle.com/javase/6/docs/api/java/lang/Exception.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`QueryBuilder`](../-query-builder/index.md)`<`[`I`](../-query-builder/index.md#I)`, `[`O`](../-query-builder/index.md#O)`, `[`T`](../-query-builder/index.md#T)`>`<br>When something happen during process |
| [onResult](../-query-builder/on-result.md) | `fun onResult(onResult: (`[`T`](../-query-builder/index.md#T)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`QueryBuilder`](../-query-builder/index.md)`<`[`I`](../-query-builder/index.md#I)`, `[`O`](../-query-builder/index.md#O)`, `[`T`](../-query-builder/index.md#T)`>`<br>After collected result |
| [selection](../-query-builder/selection.md) | `fun selection(selection: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`QueryBuilder`](../-query-builder/index.md)`<`[`I`](../-query-builder/index.md#I)`, `[`O`](../-query-builder/index.md#O)`, `[`T`](../-query-builder/index.md#T)`>`<br>Selection condition |
| [selectionArgs](../-query-builder/selection-args.md) | `fun selectionArgs(vararg selectionArgs: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`QueryBuilder`](../-query-builder/index.md)`<`[`I`](../-query-builder/index.md#I)`, `[`O`](../-query-builder/index.md#O)`, `[`T`](../-query-builder/index.md#T)`>`<br>Selection arguments |
| [uri](../-query-builder/uri.md) | `fun uri(uri: <ERROR CLASS>): `[`QueryBuilder`](../-query-builder/index.md)`<`[`I`](../-query-builder/index.md#I)`, `[`O`](../-query-builder/index.md#O)`, `[`T`](../-query-builder/index.md#T)`>`<br>Uri to query |
