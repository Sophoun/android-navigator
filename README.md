# Android Fragment Navigator

This is a library that want to help you to navigate fragments in
inside an activity. We build this library because we want to solve the
single activity strategy for our use case.

## How to use
### Import dependency
We host this library on `jcenter`. Make sure you have added `jcenter()`
repository to your root project.
```groovy
allprojects {
    repositories {
        jcenter()
    }
}
```
Then import library dependency inside your `app` module:
```groovy
implementation 'com.github.sophoun:android-navigator:0.0.1'
```
Now you have imported the library.

## Sample
Declare a public navigator property inside your `MainActivity` to easy
call it from any place that you want. (W used `FragmentTabNavigator`
because We want to handle a tab switch between `BottomNavigationView`).
```kotlin
lateinit var fragmentTabNavigator: FragmentTabNavigator
val homeNav by lazy { FragmentStackNavigator(rootHomeFragment.childFragmentManager, R.id.root_home_container) }
```
Above we have declared a `fragmentTabNavigator` and also initialized `homeNav`
fragment stack. Inside the `FragmentStackNavigator` we also pass the
child fragment manager and the id of view that responsible to navigate the
the fragments.

Then inside your `onCreate` method, it's a good place to start setup the
fragment navigation object.
```kotlin
fragmentTabNavigator =
            FragmentTabNavigator(
                supportFragmentManager,
                R.id.nav_host_fragment
            )

        fragmentTabNavigator.setRootFragment(listOf(
            rootHomeFragment,
            firstFragment,
            secondFragment
        ), 1)

        homeNav.setExitOn(0)
        homeNav.setHideFragment(true)
        fragmentTabNavigator.setExitOnHomeTab(true)
        fragmentTabNavigator.setChildNavigatorStack(listOf(homeNav, null, null))
```
Above code is what I have setup the `FragmentTableNavigator` and `FragmentNavigator`.
- For `FragmentTabNavigator` you can setup the root fragments and you can
set exit on home fragment or set the child fragment stack navigator to it.
It has a lot more feature, please see the document references.
- For `FragmentNavigator` you can setup exit on fragment index or use the
hide show fragments strategy, please see the document references.

when you want to push a fragment to stack or switch fragment just call:
- `fragmentTabNavigator.switchTo(index)` to switch fragment tab index.
- `homeNav.push(Fragment())` to push a fragment to stack.
- `fragmentTabNavigator.pop()` to pop a fragment from stack.


# Documentation
[Document references](documentation/android-navigator/index.md)