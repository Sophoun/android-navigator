[core-utils](../../index.md) / [com.sophoun.android.billing](../index.md) / [GooglePlayBilling](./index.md)

# GooglePlayBilling

`class GooglePlayBilling`

GooglePlayBilling is a class that provide
rich functionality to lunch Google billing purchase flow.

Sample usage:

```
val googlePlayBilling = GooglePlayBilling.Builder(context!!, getString(R.string.app_name))
     .onConnected {
         DLog.i("Billing", "Connected")
     }.onDisconnected {
         DLog.i("Billing", "Disconnected")
     }.onError {
         DLog.i("Billing", "Error: ${it.message}")
     }.onBillingUpdated { billingResult, purchases ->
         DLog.i("Billing", "onBillingUpdated ${billingResult.debugMessage}")
     }.onPurchaseHistoryUpdated { billingResult, purchasesHistory ->
         DLog.i("Billing", "onPurchaseHistoryUpdated ${billingResult.debugMessage}")
     }.build()

     googlePlayBilling.connect()

     googlePlayBilling.querySkuDetails("android.test.purchased", "android.test.canceled", "android.test.item_unavailable") {
         it.forEach { sku ->
             googlePlayBilling.purchase(activity!!, sku)
         }
    }
```

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `class Builder`<br>Builder class |

### Functions

| Name | Summary |
|---|---|
| [connect](connect.md) | `fun connect(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Connect billing service |
| [purchase](purchase.md) | `fun purchase(activity: <ERROR CLASS>, skuDetails: <ERROR CLASS>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Result will callback in method connect() above and in object `billingClientBuilder.setListener` `onBillingUpdated()` |
| [queryCachedPurchase](query-cached-purchase.md) | `fun queryCachedPurchase(loadFromCache: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, skuType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = SkuType.INAPP): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>To query update purchased cache on Google Play. |
| [querySkuDetails](query-sku-details.md) | `fun querySkuDetails(vararg sku: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, skuType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = SkuType.INAPP, onQueryFinished: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<<ERROR CLASS>>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = {}): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Testing product id `"android.test.purchased"`, `"android.test.canceled"`, `"android.test.item_unavailable"` |
