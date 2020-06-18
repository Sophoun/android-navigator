[core-utils](../../index.md) / [com.sophoun.android.framework](../index.md) / [BaseDialogFragment](./index.md)

# BaseDialogFragment

`abstract class BaseDialogFragment`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseDialogFragment()` |

### Properties

| Name | Summary |
|---|---|
| [baseActivity](base-activity.md) | `val baseActivity: `[`BaseActivity`](../-base-activity/index.md) |
| [coroutineContext](coroutine-context.md) | `open val coroutineContext: <ERROR CLASS>` |
| [viewModelFactory](view-model-factory.md) | `lateinit var viewModelFactory: <ERROR CLASS>` |

### Functions

| Name | Summary |
|---|---|
| [layout](layout.md) | `abstract fun layout(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Sub class musts provide layout resource by override this method |
| [onCreateView](on-create-view.md) | `open fun onCreateView(inflater: <ERROR CLASS>, container: <ERROR CLASS>?, savedInstanceState: <ERROR CLASS>?): <ERROR CLASS>?` |
| [onDestroy](on-destroy.md) | `open fun onDestroy(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Cancel coroutine job |
| [onStateChanged](on-state-changed.md) | `open fun onStateChanged(state: `[`UiState`](../../com.sophoun.android.framework.state/-ui-state/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>UI must override this method to update their UI State |
| [setupWithViewModel](setup-with-view-model.md) | `fun setupWithViewModel(vararg viewModel: `[`BaseViewModel`](../-base-view-model/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
