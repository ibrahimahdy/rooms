package com.ut.iot.rooms.ui

import android.content.Context
import dagger.android.support.DaggerFragment


abstract class BaseFragment: DaggerFragment() {

    protected lateinit var baseActivity: BaseActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        baseActivity = context as BaseActivity
    }

}