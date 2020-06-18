[core-utils](../../index.md) / [com.sophoun.android.framework.query](../index.md) / [QueryBuilder](./index.md)

# QueryBuilder

`abstract class QueryBuilder<I, O, T>`

This is a super class that provide functionality to sub class
to make it easy use contentResolver to query android database

### Parameters

`I` - -&gt; type of value that mapper function receive

`O` - -&gt; type of value that mapper function return

`T` - -&gt; type of value that pass to onResult(T) function

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `QueryBuilder(contentResolver: <ERROR CLASS>)`<br>This is a super class that provide functionality to sub class to make it easy use contentResolver to query android database |

### Properties

| Name | Summary |
|---|---|
| [contentResolver](content-resolver.md) | `val contentResolver: <ERROR CLASS>` |
| [selection](selection.md) | `var selection: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [selectionArgs](selection-args.md) | `var selectionArgs: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<out `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [uri](uri.md) | `var uri: <ERROR CLASS>?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | `abstract fun execute(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute the query builder. Result wills callback: |
| [mapper](mapper.md) | `fun mapper(mapper: (`[`I`](index.md#I)`) -> `[`O`](index.md#O)`): `[`QueryBuilder`](./index.md)`<`[`I`](index.md#I)`, `[`O`](index.md#O)`, `[`T`](index.md#T)`>`<br>Map each object from cursor to T |
| [onCompleted](on-completed.md) | `fun onCompleted(onCompleted: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`QueryBuilder`](./index.md)`<`[`I`](index.md#I)`, `[`O`](index.md#O)`, `[`T`](index.md#T)`>`<br>After all process completed |
| [onError](on-error.md) | `fun onError(onError: (`[`Exception`](https://docs.oracle.com/javase/6/docs/api/java/lang/Exception.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`QueryBuilder`](./index.md)`<`[`I`](index.md#I)`, `[`O`](index.md#O)`, `[`T`](index.md#T)`>`<br>When something happen during process |
| [onResult](on-result.md) | `fun onResult(onResult: (`[`T`](index.md#T)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`QueryBuilder`](./index.md)`<`[`I`](index.md#I)`, `[`O`](index.md#O)`, `[`T`](index.md#T)`>`<br>After collected result |
| [selection](selection.md) | `fun selection(selection: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`QueryBuilder`](./index.md)`<`[`I`](index.md#I)`, `[`O`](index.md#O)`, `[`T`](index.md#T)`>`<br>Selection condition |
| [selectionArgs](selection-args.md) | `fun selectionArgs(vararg selectionArgs: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`QueryBuilder`](./index.md)`<`[`I`](index.md#I)`, `[`O`](index.md#O)`, `[`T`](index.md#T)`>`<br>Selection arguments |
| [uri](uri.md) | `fun uri(uri: <ERROR CLASS>): `[`QueryBuilder`](./index.md)`<`[`I`](index.md#I)`, `[`O`](index.md#O)`, `[`T`](index.md#T)`>`<br>Uri to query |

### Inheritors

| Name | Summary |
|---|---|
| [DeleteQueryBuilder](../-delete-query-builder/index.md) | `class DeleteQueryBuilder : `[`QueryBuilder`](./index.md)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>This class can use for delete data from android using ContentProvider |
| [InsertQueryBuilder](../-insert-query-builder/index.md) | `class InsertQueryBuilder : `[`QueryBuilder`](./index.md)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<<ERROR CLASS>>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>This class can use for insert a list of data to android database using ContentProvider |
| [SelectQueryBuilder](../-select-query-builder/index.md) | `class SelectQueryBuilder<T> : `[`QueryBuilder`](./index.md)`<<ERROR CLASS>, `[`T`](../-select-query-builder/index.md#T)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](../-select-query-builder/index.md#T)`>>`<br>This class use for query data from android database using ContentProvider |
| [UpdateQueryBuilder](../-update-query-builder/index.md) | `class UpdateQueryBuilder : `[`QueryBuilder`](./index.md)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, <ERROR CLASS>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>This class can use for update data on android database using ContentProvider |
