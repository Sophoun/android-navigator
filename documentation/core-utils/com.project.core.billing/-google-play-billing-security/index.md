[core-utils](../../index.md) / [com.sophoun.android.billing](../index.md) / [GooglePlayBillingSecurity](./index.md)

# GooglePlayBillingSecurity

`object GooglePlayBillingSecurity`

Security-related methods. For a secure implementation, all of this code
should be implemented on a server that communicates with the
application on the device. For the sake of simplicity and clarity of this
example, this code is included here and is executed on the device. If you
must verify the purchases on the phone, you should obfuscate this code to
make it harder for an attacker to replace the code with stubs that treat all
purchases as verified.

### Functions

| Name | Summary |
|---|---|
| [verifyPurchase](verify-purchase.md) | `fun verifyPurchase(base64PublicKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, signedData: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, signature: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Verifies that the data was signed with the given signature, and returns the verified purchase. The data is in JSON format and signed with a private key. The data also contains the [PurchaseState](#) and product ID of the purchase. |
