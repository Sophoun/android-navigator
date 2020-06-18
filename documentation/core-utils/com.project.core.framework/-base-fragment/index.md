[core-utils](../../index.md) / [com.sophoun.android.framework](../index.md) / [BaseFragment](./index.md)

# BaseFragment

`abstract class BaseFragment`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseFragment()` |

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
| [onBackPress](on-back-press.md) | `open fun onBackPress(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onCreateAnimation](on-create-animation.md) | `open fun onCreateAnimation(transit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, enter: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, nextAnim: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): <ERROR CLASS>?` |
| [onCreateView](on-create-view.md) | `open fun onCreateView(inflater: <ERROR CLASS>, container: <ERROR CLASS>?, savedInstanceState: <ERROR CLASS>?): <ERROR CLASS>?` |
| [onDestroy](on-destroy.md) | `open fun onDestroy(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Cancel coroutine job |
| [onFragmentAnimationEnd](on-fragment-animation-end.md) | `open fun onFragmentAnimationEnd(animation: <ERROR CLASS>?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Listen to fragment animation end |
| [onFragmentAnimationRepeat](on-fragment-animation-repeat.md) | `open fun onFragmentAnimationRepeat(animation: <ERROR CLASS>?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Listen to fragment animation repeat |
| [onFragmentAnimationStart](on-fragment-animation-start.md) | `open fun onFragmentAnimationStart(animation: <ERROR CLASS>?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Listen to fragment animation start |
| [onStateChanged](on-state-changed.md) | `open fun onStateChanged(state: `[`UiState`](../../com.sophoun.android.framework.state/-ui-state/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>UI must override this method to update their UI State |
| [onViewCreated](on-view-created.md) | `open fun onViewCreated(view: <ERROR CLASS>, savedInstanceState: <ERROR CLASS>?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setupWithViewModel](setup-with-view-model.md) | `fun setupWithViewModel(vararg viewModel: `[`BaseViewModel`](../-base-view-model/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Attach ViewModel with UiState changed |
