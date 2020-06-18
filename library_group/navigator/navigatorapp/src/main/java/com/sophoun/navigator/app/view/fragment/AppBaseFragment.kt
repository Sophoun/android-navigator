package com.sophoun.navigator.app.view.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import com.sophoun.navigator.app.view.activity.AppBaseActivity

open class AppBaseFragment : Fragment() {

    val fragmentFactory by lazy { (activity as AppBaseActivity).fragmentFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

}