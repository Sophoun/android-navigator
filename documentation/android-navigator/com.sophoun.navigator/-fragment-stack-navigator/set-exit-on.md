[android-navigator](../../index.md) / [com.sophoun.navigator](../index.md) / [FragmentStackNavigator](index.md) / [setExitOn](./set-exit-on.md)

# setExitOn

`fun setExitOn(clazz: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<*>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

During on pop() method, if it meets this value it'll be
return false to handle exit application

Note:

* Set class that should return false during pop() method called.
`fun setExitOn(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Exit from fragment back stack

**See Also**

[setExitOn](./set-exit-on.md)

