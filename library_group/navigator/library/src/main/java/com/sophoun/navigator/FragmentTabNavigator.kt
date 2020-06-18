package com.sophoun.navigator
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import java.lang.Exception
import java.util.concurrent.atomic.AtomicInteger

/**
 * Use​this class to remember all fragment state
 * that has been set as root fragments.
 *
 * use this class to manage fragment inside of
 * bottom navigation bar or tab fragment
 */
class FragmentTabNavigator (
    fragmentManager: FragmentManager,
    @IdRes private val container: Int
): FragmentStackNavigator(fragmentManager, container) {

    private val activeIndex = AtomicInteger(-1)
    private val rootIndex = AtomicInteger(-1)
    private val rootFragments = arrayListOf<Fragment>()
    private val childNavigatorStacks = arrayListOf<FragmentStackNavigator?>()
    private var isExitOnHomeTab = false

    private var onTabChanged: (index: Int) -> Unit = {}

    init {
        /**
         * Use hide fragment by default
         */
        setHideFragment(true)
    }

    /**
     * Listener to the tab changed event
     * @param onTabChanged
     */
    fun addOnTabChangedListener(onTabChanged: (index: Int) -> Unit) {
        this.onTabChanged = onTabChanged
    }

    /**
     * Initialize root fragment and the root fragment index
     * @param fragments all root fragment
     * @param rootIndex the index of the root fragment [home fragment]
     */
    fun setRootFragment(fragments: List<Fragment>, rootIndex: Int) {
        if (this.rootFragments.isNotEmpty()) {
            throw Exception("Root Fragments are already set.")
        }
        if ((rootIndex > fragments.size - 1) || (rootIndex < 0)) {
            throw Exception("homeIndex is not in range of Root Fragments")
        }
        this.rootFragments.addAll(fragments)
        this.rootFragments.forEach {
            push(it)
            hideFragment(it)
        }
        this.rootIndex.set(rootIndex)
        this.activeIndex.set(rootIndex)
        val homeFragment = this.rootFragments[rootIndex]
        showFragment(homeFragment)
    }

    /**
     * Enable exit on home tab.
     *
     * we'll move to the rootIndex before exit
     * from the fragment stack
     * @param enabled
     */
    fun setExitOnHomeTab(enabled: Boolean) {
        this.isExitOnHomeTab = enabled
    }

    /**
     * Set child fragment stack navigator for each root fragment
     * pass [null] if the root fragment doesn't have child stack
     * @param childNavigators
     */
    fun setChildNavigatorStack(childNavigators: List<FragmentStackNavigator?>) {
        if (this.childNavigatorStacks.isNotEmpty()) {
            throw Exception("Child FragmentStackNavigators are already set.")
        }
        this.childNavigatorStacks.addAll(childNavigators)
    }

    /**
     * Switch root fragment by index
     * @param index
     */
    fun switchTo(index: Int) {
        if (this.rootFragments.isEmpty()) {
            throw Exception("Root Fragments are not yet set.")
        }
        activeIndex.set(index)
        val rootFragment = rootFragments[activeIndex.get()]
        hideAllFragment()
        showFragment(rootFragment)
    }

    override fun push(fragment: Fragment) {
        addFragment(fragment, true)
    }

    override fun pop(n: Int): Boolean {
        var returnFlag = if (hasChildStack()) {
            popChildStack(n)
        } else {
            false
        }
        // Check exit on home page when no child fragment has pop
        if (!returnFlag) {
            returnFlag = checkExitOnHomeTab()
        }
        // Update fragment tab change
        updateTabChanged()
        return returnFlag
    }

    /**
     * Pop child fragment from fragment manager stack
     */
    private fun popChildStack(n: Int = 1): Boolean {
        var returnFlag = false
        try {
            val fragmentStackNavigator = childNavigatorStacks[activeIndex.get()]
            if (fragmentStackNavigator != null) {
                returnFlag = fragmentStackNavigator.pop(n)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return returnFlag
    }

    /**
     * Check it has child fragment stack or not
     * @return [true] it has
     */
    private fun hasChildStack(): Boolean {
        var returnFlag = false
        try {
            val fragmentStackNavigator = childNavigatorStacks[activeIndex.get()]
            if (fragmentStackNavigator != null) {
                val count = fragmentStackNavigator.fragmentManager.backStackEntryCount
                returnFlag = count >= 0
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return returnFlag
    }

    /**
     * Check exit on home tab, if exit on home tab is enable
     * this method will switch to the home tab and then
     * return true otherwise return false and do nothing.
     * @return return [true] otherwise return [false] and do nothing.
     */
    private fun checkExitOnHomeTab(): Boolean {
        var returnFlag = false
        if (isExitOnHomeTab) {
            if (activeIndex.get() != rootIndex.get()) {
                switchTo(rootIndex.get())
                returnFlag = true
            }
        }
        return returnFlag
    }

    /**
     * Update root fragment tab​index has changed
     */
    private fun updateTabChanged() {
        onTabChanged.invoke(activeIndex.get())
    }
}