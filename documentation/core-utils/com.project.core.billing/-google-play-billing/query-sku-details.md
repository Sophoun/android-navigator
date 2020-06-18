[core-utils](../../index.md) / [com.sophoun.android.billing](../index.md) / [GooglePlayBilling](index.md) / [querySkuDetails](./query-sku-details.md)

# querySkuDetails

`fun querySkuDetails(vararg sku: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, skuType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = SkuType.INAPP, onQueryFinished: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<<ERROR CLASS>>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = {}): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Testing product id
`"android.test.purchased"`, `"android.test.canceled"`, `"android.test.item_unavailable"`

### Parameters

`sku` - is a list of IN APP product id

`skuType` - SkuType.INAPP or SkuType.SUBS