[android-navigator](../../index.md) / [com.sophoun.navigator](../index.md) / [FragmentStackNavigator](./index.md)

# FragmentStackNavigator

`open class FragmentStackNavigator`

Use this class to manage fragment ui state and stack

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FragmentStackNavigator(fragmentManager: <ERROR CLASS>, container: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Use this class to manage fragment ui state and stack |

### Properties

| Name | Summary |
|---|---|
| [beginTransaction](begin-transaction.md) | `val beginTransaction: <ERROR CLASS>` |
| [fragmentManager](fragment-manager.md) | `val fragmentManager: <ERROR CLASS>` |

### Functions

| Name | Summary |
|---|---|
| [addFragment](add-fragment.md) | `fun addFragment(fragment: <ERROR CLASS>, addToBackStack: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Add fragment to fragmentManager |
| [findFragmentByInstance](find-fragment-by-instance.md) | `fun findFragmentByInstance(fragment: <ERROR CLASS>): <ERROR CLASS>?`<br>Find a fragment that has been added in to fragmentManager |
| [findFragmentByTag](find-fragment-by-tag.md) | `fun findFragmentByTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): <ERROR CLASS>?`<br>Find a fragment that has been added in to fragmentManager |
| [getTagName](get-tag-name.md) | `fun getTagName(fragment: <ERROR CLASS>): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Get a fragment tag |
| [hideAllFragment](hide-all-fragment.md) | `fun hideAllFragment(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Hide all fragment that has been added to fragmentManager |
| [hideFragment](hide-fragment.md) | `fun hideFragment(fragment: <ERROR CLASS>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Hide a fragment |
| [isMatchExit](is-match-exit.md) | `fun isMatchExit(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Return [true](#) if current class (Fragment) is match to the exit on class the has been set |
| [pop](pop.md) | `open fun pop(n: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Pop fragment from stack |
| [push](push.md) | `open fun push(fragment: <ERROR CLASS>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Push fragment to stack |
| [setCustomAnimation](set-custom-animation.md) | `fun setCustomAnimation(enter: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, exit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, popEnter: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, popExit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set custom animation to fragment transaction |
| [setExitOn](set-exit-on.md) | `fun setExitOn(clazz: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<*>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>During on pop() method, if it meets this value it'll be return false to handle exit application`fun setExitOn(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Exit from fragment back stack |
| [setHideFragment](set-hide-fragment.md) | `fun setHideFragment(enabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Use show hide fragment to keep fragment ui state |
| [showFragment](show-fragment.md) | `fun showFragment(fragment: <ERROR CLASS>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Show a fragment |
| [showLastFragment](show-last-fragment.md) | `fun showLastFragment(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Show last fragment in fragmentManager stack |

### Inheritors

| Name | Summary |
|---|---|
| [FragmentTabNavigator](../-fragment-tab-navigator/index.md) | `class FragmentTabNavigator : `[`FragmentStackNavigator`](./index.md)<br>Use​this class to remember all fragment state that has been set as root fragments. |
