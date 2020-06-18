package com.project.app.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.project.app.view.fragment.FirstFragment
import com.project.app.view.fragment.RootHomeFragment
import com.project.app.view.fragment.SecondFragment
import kotlin.collections.HashMap

abstract class AppBaseActivity : AppCompatActivity() {

    var fragmentFactory = object : FragmentFactory() {

        val fragments = HashMap<String, Fragment>().apply {
            put(RootHomeFragment::class.java.name, RootHomeFragment())
            put(FirstFragment::class.java.name, FirstFragment())
            put(SecondFragment::class.java.name, SecondFragment())
        }

        override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
            return fragments[className] ?: super.instantiate(classLoader, className)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}