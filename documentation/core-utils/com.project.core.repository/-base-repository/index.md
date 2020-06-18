[core-utils](../../index.md) / [com.sophoun.android.repository](../index.md) / [BaseRepository](./index.md)

# BaseRepository

`open class BaseRepository`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseRepository()` |

### Functions

| Name | Summary |
|---|---|
| [fetchDataFromApi](fetch-data-from-api.md) | `suspend fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> fetchDataFromApi(call: () -> <ERROR CLASS><<ERROR CLASS><`[`T`](fetch-data-from-api.md#T)`>>): `[`BaseResponse`](../../com.sophoun.android.network/-base-response/index.md)`<`[`T`](fetch-data-from-api.md#T)`>`<br>Use this method for fetch data from network. |
| [getResponseStatus](get-response-status.md) | `fun getResponseStatus(responseCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`BaseResponse.ResponseStatus`](../../com.sophoun.android.network/-base-response/-response-status/index.md) |
| [readResponse](read-response.md) | `suspend fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> readResponse(call: <ERROR CLASS><<ERROR CLASS><`[`T`](read-response.md#T)`>>): `[`BaseResponse`](../../com.sophoun.android.network/-base-response/index.md)`<`[`T`](read-response.md#T)`>` |
