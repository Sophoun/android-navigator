package com.project.app.view.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import com.project.app.view.activity.AppBaseActivity
import com.project.app.view.activity.MainActivity

open class AppBaseFragment : Fragment() {

    val fragmentFactory by lazy { (activity as AppBaseActivity).fragmentFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

}