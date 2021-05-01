package com.sophoun.navigator

import androidx.annotation.IdRes
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlin.reflect.KClass

/**
 * Use this class to manage fragment ui state and stack
 */
open class FragmentStackNavigator(
    val fragmentManager: FragmentManager,
    @IdRes private val container: Int
) {
    private lateinit var exitOnClass: KClass<*>
    private var exitOnIndex = -1
    val beginTransaction: FragmentTransaction get() { return fragmentManager.beginTransaction() }

    /**
     * Fragment transaction animation
     */
    private var enter: Int = 0
    private var exit: Int = 0
    private var popEnter: Int = 0
    private var popExit: Int = 0

    private var isHideFragment = false

    /**
     * Set custom animation to fragment transaction
     * @param enter
     * @param exit
     * @param popEnter
     * @param popExit
     */
    fun setCustomAnimation(enter: Int = 0, exit: Int = 0, popEnter: Int = 0, popExit: Int = 0) {
        this.enter = enter
        this.exit = exit
        this.popEnter = popEnter
        this.popExit = popExit
    }

    /**
     * Use show hide fragment to keep fragment ui state
     */
    fun setHideFragment(enabled: Boolean) {
        this.isHideFragment = enabled
    }

    /**
     * During on pop() method, if it meets this value it'll be
     * return false to handle exit application
     *
     * Note:
     *
     * - Set class that should return false during pop() method called.
     */
    fun setExitOn(clazz: KClass<*>) {
        this.exitOnClass = clazz
    }

    /**
     * Exit from fragment back stack
     * @see setExitOn
     */
    fun setExitOn(index: Int) {
        this.exitOnIndex = index
    }

    /**
     * Get a fragment tag
     * @return [tag] Tag is a fragment class name with full path
     */
    fun getTagName(fragment: Fragment): String {
        return fragment.javaClass.name
    }

    /**
     * Find a fragment that has been added in to fragmentManager
     * @param tag
     * @return [Fragment] or [null] if not found
     */
    fun findFragmentByTag(tag: String): Fragment? {
        return fragmentManager.findFragmentByTag(tag)
    }

    /**
     * Find a fragment that has been added in to fragmentManager
     * @param fragment
     * @return [Fragment] or [null] if not found
     */
    fun findFragmentByInstance(fragment: Fragment): Fragment? {
        fragmentManager.fragments.forEach {
            if (fragment == it) {
                return@findFragmentByInstance it
            }
        }
        return null
    }

    /**
     * Add fragment to fragmentManager
     * @param fragment
     * @param addToBackStack default [false]
     */
    fun addFragment(fragment: Fragment, addToBackStack: Boolean = false) {
        val tag = getTagName(fragment)

        // Hide all existing fragments
        if (isHideFragment) {
            hideAllFragment()
        }

        // Add new fragment to fragment manager if it doesn't add yet
        beginTransaction.let {
            it.setCustomAnimations(enter, exit, popEnter, popExit)
            if (isHideFragment) {
                it.add(container, fragment, tag)
            } else {
                it.replace(container, fragment, tag)
            }
            if (addToBackStack) {
                it.addToBackStack(tag)
            }
            it.commitAllowingStateLoss()
            fragmentManager.executePendingTransactions()
        }
    }

    /**
     * Show a fragment
     * @param fragment
     * @return [true] When a fragment is show
     */
    fun showFragment(fragment: Fragment): Boolean {
        var returnFlag = false
        beginTransaction.let {
            it.setCustomAnimations(enter, exit, popEnter, popExit)
            it.show(fragment)
            it.commitAllowingStateLoss()
            fragmentManager.executePendingTransactions()
            returnFlag = true
        }
        return returnFlag
    }

    /**
     * Hide a fragment
     * @param fragment
     * @return [true] When a fragment is hide
     */
    fun hideFragment(fragment: Fragment): Boolean {
        var returnFlag = false
        beginTransaction.let {
            it.setCustomAnimations(enter, exit, popEnter, popExit)
            it.hide(fragment)
            it.commitAllowingStateLoss()
            fragmentManager.executePendingTransactions()
            returnFlag = true
        }
        return returnFlag
    }

    /**
     * Hide all fragment that has been added to fragmentManager
     */
    fun hideAllFragment(): Boolean {
        var returnFlag = false
        fragmentManager.fragments.forEach {
            hideFragment(it)
            returnFlag = true
        }
        return returnFlag
    }

    /**
     * Show last fragment in fragmentManager stack
     */
    fun showLastFragment(): Boolean {
        var returnFlag = false
        fragmentManager.fragments.lastOrNull()?.let {
            showFragment(it)
            returnFlag = true
        }
        return returnFlag
    }

    /**
     * Return [true] if current class (Fragment) is match to
     * the exit on class the has been set
     */
    fun isMatchExit(): Boolean {
        var returnFlag = false
        if (::exitOnClass.isInitialized) {
            fragmentManager.fragments.lastOrNull()?.apply {
                if (javaClass.kotlin == exitOnClass) {
                    returnFlag = true
                }
            }
        } else {
            if (exitOnIndex != -1) {
                returnFlag = exitOnIndex == (fragmentManager.backStackEntryCount - 1)
            }
        }
        return returnFlag
    }

    /**
     * Push fragment to stack
     */
    open fun push(fragment: Fragment) {
        if(fragment is DialogFragment) {
            fragment.show(fragmentManager, fragment::class.java.name)
        } else {
            addFragment(fragment, true)
        }
    }

    /**
     * Pop fragment from stack
     * @param n number to pop
     * @return [true] is popped, return [false] is nothing popped
     */
    open fun pop(n: Int = 1): Boolean {
        // Not perform back stack
        // if current fragment class is match to the
        // exit on class that has been set
        if (isMatchExit()) {
            return false
        }
        // Perform fragment back stack
        var returnFlag = false
        for (i in 1..n) {
            returnFlag = fragmentManager.popBackStackImmediate()
            showLastFragment()
            if (!returnFlag) {
                break
            }
        }
        return returnFlag
    }
}