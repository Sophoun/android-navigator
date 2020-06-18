package com.sophoun.navigator.app.view.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.app.view.activity.MainActivity
import com.sophoun.navigator.app.R
import com.sophoun.navigator.app.view.fragment.AppBaseFragment
import com.sophoun.navigator.app.view.fragment.HomeFragment

class RootHomeFragment : AppBaseFragment() {

    private val homeNav by lazy { (activity as MainActivity).homeNav }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_root_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler().postDelayed({
            homeNav.push(HomeFragment())
        }, 1000)
    }
}