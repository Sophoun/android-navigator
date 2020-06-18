[core-utils](../../index.md) / [com.sophoun.android.framework](../index.md) / [BaseApplication](./index.md)

# BaseApplication

`abstract class BaseApplication`

A base application class.

This class is initialized with some library like:

* Koin (Dependency injection)
* LeakCanary (Leak detector)
* Logger (Pretty logger)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseApplication()`<br>A base application class. |

### Properties

| Name | Summary |
|---|---|
| [activityDispatchingAndroidInjector](activity-dispatching-android-injector.md) | `abstract var activityDispatchingAndroidInjector: <ERROR CLASS><<ERROR CLASS>>` |
| [fragmentDispatchingAndroidInjector](fragment-dispatching-android-injector.md) | `abstract var fragmentDispatchingAndroidInjector: <ERROR CLASS><<ERROR CLASS>>` |
| [serviceDispatchingAndroidInjector](service-dispatching-android-injector.md) | `abstract var serviceDispatchingAndroidInjector: <ERROR CLASS><<ERROR CLASS>>` |

### Functions

| Name | Summary |
|---|---|
| [activityInjector](activity-injector.md) | `open fun activityInjector(): <ERROR CLASS><<ERROR CLASS>>` |
| [onCreate](on-create.md) | `open fun onCreate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [serviceInjector](service-injector.md) | `open fun serviceInjector(): <ERROR CLASS><<ERROR CLASS>>` |
| [supportFragmentInjector](support-fragment-injector.md) | `open fun supportFragmentInjector(): <ERROR CLASS><<ERROR CLASS>>` |
