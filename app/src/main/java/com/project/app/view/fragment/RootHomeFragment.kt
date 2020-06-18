package com.project.app.view.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.app.R
import com.project.app.view.activity.MainActivity

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