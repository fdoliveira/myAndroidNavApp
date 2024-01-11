package com.orti.myandroidnavapp.ui.navigation

sealed class AuthScreens(val route: String) {

    data object AuthLoginScreen : AuthScreens("auth_login")
    data object AuthRegisterScreen : AuthScreens("auth_register")
    data object AuthForgotScreen : AuthScreens("auth_forgot")

}