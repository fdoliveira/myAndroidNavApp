package com.orti.myandroidnavapp.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.orti.myandroidnavapp.ui.screen.auth.ForgotScreen
import com.orti.myandroidnavapp.ui.screen.auth.LoginScreen
import com.orti.myandroidnavapp.ui.screen.auth.RegisterScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavController
) {
    navigation(
        route = AppGraphs.AuthGraph.route,
        startDestination = AuthScreens.AuthLoginScreen.route
    ) {
        composable(route = AuthScreens.AuthLoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(route = AuthScreens.AuthRegisterScreen.route) {
            RegisterScreen(navController = navController)
        }
        composable(route = AuthScreens.AuthForgotScreen.route) {
            ForgotScreen(navController = navController)
        }
    }
}