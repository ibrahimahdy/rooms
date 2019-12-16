package com.ut.iot.rooms.ui.auth.signin

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ut.iot.rooms.R

class SignInFragmentDirections private constructor() {
    companion object {
        fun actionSignInFragmentToSignUpFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_signInFragment_to_signUpFragment)
    }
}
