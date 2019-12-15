package com.ut.iot.rooms.ui.auth

import android.content.Context
import com.ut.iot.rooms.R
import com.ut.iot.rooms.ui.BaseFragment


abstract class AuthBaseFragment: BaseFragment() {

    lateinit var authActivity: AuthActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        authActivity = context as AuthActivity
    }

    protected fun showAuthError() {
        authActivity.showError(getString(R.string.auth_failed))
    }

}