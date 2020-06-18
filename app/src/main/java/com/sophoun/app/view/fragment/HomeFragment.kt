package com.sophoun.app.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.app.R
import com.sophoun.app.view.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.count
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : AppBaseFragment() {

    private val homeNav by lazy { (activity as MainActivity).homeNav }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Thread {
            var c = 0;
            while (true) {
                c = c+1
                count?.text = c.toString()
                Thread.sleep(1000)
            }
        }.start()

        clickme.setOnClickListener {
            homeNav.push(HomeFragment())
        }
    }
}