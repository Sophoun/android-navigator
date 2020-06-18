[core-utils](../../index.md) / [com.sophoun.android.framework.navigation](../index.md) / [FragmentTabNavigator](./index.md)

# FragmentTabNavigator

`class FragmentTabNavigator : `[`FragmentStackNavigator`](../-fragment-stack-navigator/index.md)

Use​this class to remember all fragment state
that has been set as root fragments.

use this class to manage fragment inside of
bottom navigation bar or tab fragment

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FragmentTabNavigator(fragmentManager: <ERROR CLASS>, container: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Use​this class to remember all fragment state that has been set as root fragments. |

### Inherited Properties

| Name | Summary |
|---|---|
| [beginTransaction](../-fragment-stack-navigator/begin-transaction.md) | `val beginTransaction: <ERROR CLASS>` |
| [fragmentManager](../-fragment-stack-navigator/fragment-manager.md) | `val fragmentManager: <ERROR CLASS>` |

### Functions

| Name | Summary |
|---|---|
| [addOnTabChangedListener](add-on-tab-changed-listener.md) | `fun addOnTabChangedListener(onTabChanged: (index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Listener to the tab changed event |
| [pop](pop.md) | `fun pop(n: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Pop fragment from stack |
| [push](push.md) | `fun push(fragment: <ERROR CLASS>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Push fragment to stack |
| [setChildNavigatorStack](set-child-navigator-stack.md) | `fun setChildNavigatorStack(childNavigators: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FragmentStackNavigator`](../-fragment-stack-navigator/index.md)`?>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set child fragment stack navigator for each root fragment pass [null](#) if the root fragment doesn't have child stack |
| [setExitOnHomeTab](set-exit-on-home-tab.md) | `fun setExitOnHomeTab(enabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Enable exit on home tab. |
| [setRootFragment](set-root-fragment.md) | `fun setRootFragment(fragments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<<ERROR CLASS>>, rootIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Initialize root fragment and the root fragment index |
| [switchTo](switch-to.md) | `fun switchTo(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Switch root fragment by index |

### Inherited Functions

| Name | Summary |
|---|---|
| [addFragment](../-fragment-stack-navigator/add-fragment.md) | `fun addFragment(fragment: <ERROR CLASS>, addToBackStack: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Add fragment to fragmentManager |
| [findFragmentByInstance](../-fragment-stack-navigator/find-fragment-by-instance.md) | `fun findFragmentByInstance(fragment: <ERROR CLASS>): <ERROR CLASS>?`<br>Find a fragment that has been added in to fragmentManager |
| [findFragmentByTag](../-fragment-stack-navigator/find-fragment-by-tag.md) | `fun findFragmentByTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): <ERROR CLASS>?`<br>Find a fragment that has been added in to fragmentManager |
| [getTagName](../-fragment-stack-navigator/get-tag-name.md) | `fun getTagName(fragment: <ERROR CLASS>): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Get a fragment tag |
| [hideAllFragment](../-fragment-stack-navigator/hide-all-fragment.md) | `fun hideAllFragment(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Hide all fragment that has been added to fragmentManager |
| [hideFragment](../-fragment-stack-navigator/hide-fragment.md) | `fun hideFragment(fragment: <ERROR CLASS>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Hide a fragment |
| [isMatchExit](../-fragment-stack-navigator/is-match-exit.md) | `fun isMatchExit(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Return [true](#) if current class (Fragment) is match to the exit on class the has been set |
| [setCustomAnimation](../-fragment-stack-navigator/set-custom-animation.md) | `fun setCustomAnimation(enter: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, exit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, popEnter: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, popExit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set custom animation to fragment transaction |
| [setExitOn](../-fragment-stack-navigator/set-exit-on.md) | `fun setExitOn(clazz: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<*>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>During on pop() method, if it meets this value it'll be return false to handle exit application`fun setExitOn(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Exit from fragment back stack |
| [setHideFragment](../-fragment-stack-navigator/set-hide-fragment.md) | `fun setHideFragment(enabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Use show hide fragment to keep fragment ui state |
| [showFragment](../-fragment-stack-navigator/show-fragment.md) | `fun showFragment(fragment: <ERROR CLASS>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Show a fragment |
| [showLastFragment](../-fragment-stack-navigator/show-last-fragment.md) | `fun showLastFragment(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Show last fragment in fragmentManager stack |
