[core-utils](../../index.md) / [com.sophoun.android.billing](../index.md) / [GooglePlayBillingSecurity](index.md) / [verifyPurchase](./verify-purchase.md)

# verifyPurchase

`fun verifyPurchase(base64PublicKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, signedData: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, signature: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Verifies that the data was signed with the given signature, and returns
the verified purchase. The data is in JSON format and signed
with a private key. The data also contains the [PurchaseState](#)
and product ID of the purchase.

### Parameters

`base64PublicKey` - The base64-encoded public key to use for verifying.

`signedData` - The signed JSON string (signed, not encrypted)

`signature` - The signature for the data, signed with the private key