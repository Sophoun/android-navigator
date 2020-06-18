[core-utils](../../index.md) / [com.sophoun.android.framework.service](../index.md) / [ServiceManager](index.md) / [startService](./start-service.md)

# startService

`fun <T : `[`BaseService`](../-base-service/index.md)`> startService(clazz: `[`Class`](https://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](start-service.md#T)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Start a service.

Note:

* must call startService before call bindService

### Parameters

`clazz` - subclass of BaseService