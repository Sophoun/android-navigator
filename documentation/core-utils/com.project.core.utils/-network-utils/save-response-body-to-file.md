[core-utils](../../index.md) / [com.sophoun.android.core.utils](../index.md) / [NetworkUtils](index.md) / [saveResponseBodyToFile](./save-response-body-to-file.md)

# saveResponseBodyToFile

`fun saveResponseBodyToFile(filePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, responseBody: <ERROR CLASS>, progress: (percent: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Save response body to specific file with progressing callback

### Parameters

`filePath` - Path of file that store the response body

`responseBody` - Response body from network call

`progress` - Progressing percent callback