package com.sophoun.app.view.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import com.sophoun.app.view.activity.AppBaseActivity
import com.sophoun.app.view.activity.MainActivity

open class AppBaseFragment : Fragment() {

    val fragmentFactory by lazy { (activity as AppBaseActivity).fragmentFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

}