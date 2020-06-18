[core-utils](../../index.md) / [com.sophoun.android.billing](../index.md) / [GooglePlayBilling](index.md) / [purchase](./purchase.md)

# purchase

`fun purchase(activity: <ERROR CLASS>, skuDetails: <ERROR CLASS>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Result will callback in method connect() above and in
object `billingClientBuilder.setListener` `onBillingUpdated()`

for clearing purchase history use command:

* `./adb -s (deviceId) shell pm clear com.android.vending`

Ex:

* `./adb -s ac968101 shell pm clear com.android.vending`
