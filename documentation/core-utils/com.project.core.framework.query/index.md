[core-utils](../index.md) / [com.sophoun.android.framework.query](./index.md)

## Package com.sophoun.android.framework.query

### Types

| Name | Summary |
|---|---|
| [DeleteQueryBuilder](-delete-query-builder/index.md) | `class DeleteQueryBuilder : `[`QueryBuilder`](-query-builder/index.md)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>This class can use for delete data from android using ContentProvider |
| [InsertQueryBuilder](-insert-query-builder/index.md) | `class InsertQueryBuilder : `[`QueryBuilder`](-query-builder/index.md)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<<ERROR CLASS>>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>This class can use for insert a list of data to android database using ContentProvider |
| [QueryBuilder](-query-builder/index.md) | `abstract class QueryBuilder<I, O, T>`<br>This is a super class that provide functionality to sub class to make it easy use contentResolver to query android database |
| [SelectQueryBuilder](-select-query-builder/index.md) | `class SelectQueryBuilder<T> : `[`QueryBuilder`](-query-builder/index.md)`<<ERROR CLASS>, `[`T`](-select-query-builder/index.md#T)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](-select-query-builder/index.md#T)`>>`<br>This class use for query data from android database using ContentProvider |
| [UpdateQueryBuilder](-update-query-builder/index.md) | `class UpdateQueryBuilder : `[`QueryBuilder`](-query-builder/index.md)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, <ERROR CLASS>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>This class can use for update data on android database using ContentProvider |
