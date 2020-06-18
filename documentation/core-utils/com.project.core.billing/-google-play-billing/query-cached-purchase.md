[core-utils](../../index.md) / [com.sophoun.android.billing](../index.md) / [GooglePlayBilling](index.md) / [queryCachedPurchase](./query-cached-purchase.md)

# queryCachedPurchase

`fun queryCachedPurchase(loadFromCache: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, skuType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = SkuType.INAPP): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

To query update purchased cache on Google Play.

You should call queryPurchases() at least twice in your code:

* Call every time your app launches so that you can restore any
purchases that a user has made since the app last stopped.
* Call in your onResume() method, because a user can make a purchase
when your app is in the background (for example, redeeming
a promo code in the Google Play Store app).

### Parameters

`loadFromCache` - (true) means not make a network request [default false](#)

`skuType` - SkuType.INAPP or SkuType.SUBS