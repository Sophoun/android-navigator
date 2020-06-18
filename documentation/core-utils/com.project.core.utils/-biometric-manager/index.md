[core-utils](../../index.md) / [com.sophoun.android.core.utils](../index.md) / [BiometricManager](./index.md)

# BiometricManager

`class BiometricManager`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BiometricManager(fragmentActivity: <ERROR CLASS>)`<br>`BiometricManager(fragment: <ERROR CLASS>)` |

### Functions

| Name | Summary |
|---|---|
| [authenticate](authenticate.md) | `fun authenticate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [isAvailable](is-available.md) | `fun isAvailable(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [setBiometricCallback](set-biometric-callback.md) | `fun setBiometricCallback(onAuthenticationError: (errorCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, errString: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, onAuthenticationFailed: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, onAuthenticationSucceeded: (<ERROR CLASS>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setPromptInfo](set-prompt-info.md) | `fun setPromptInfo(title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, subtitle: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", credentialAllowed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, negativeButtonText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "Cancel", confirmationRequired: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
