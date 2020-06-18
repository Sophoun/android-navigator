[core-utils](../../index.md) / [com.sophoun.android.framework](../index.md) / [BaseActivity](./index.md)

# BaseActivity

`abstract class BaseActivity`

Note:

* Do not override onBackPressed() method on each subclass
do this to prevent unexpected error of Navigation Component

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseActivity()`<br>Note: |

### Properties

| Name | Summary |
|---|---|
| [coroutineContext](coroutine-context.md) | `open val coroutineContext: <ERROR CLASS>` |
| [fragmentFactory](fragment-factory.md) | `lateinit var fragmentFactory: <ERROR CLASS>` |

### Functions

| Name | Summary |
|---|---|
| [layout](layout.md) | `abstract fun layout(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Sub class musts provide layout resource by override this method |
| [onBackPress](on-back-press.md) | `open fun onBackPress(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Use this for on backpress. |
| [onCreate](on-create.md) | `open fun onCreate(savedInstanceState: <ERROR CLASS>?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onDestroy](on-destroy.md) | `open fun onDestroy(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Cancel coroutine job |
| [onStateChanged](on-state-changed.md) | `open fun onStateChanged(state: `[`UiState`](../../com.sophoun.android.framework.state/-ui-state/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Client need to override this method to update their ui state |
| [setupWithViewModel](setup-with-view-model.md) | `fun setupWithViewModel(vararg viewModel: `[`BaseViewModel`](../-base-view-model/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Attach ViewModel with UiState changed |
