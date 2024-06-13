package com.orti.myandroidnavapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.orti.myandroidnavapp.ui.screen.app.AppMainScreen
import com.orti.myandroidnavapp.ui.screen.app.HomeScreen
import com.orti.myandroidnavapp.ui.screen.app.ProfileScreen
import com.orti.myandroidnavapp.ui.screen.app.SettingsScreen

// In the app graph we need to create another navcontroller for the app graph.
// This is because we need to navigate between the screens of the app graph.
// We can't use the rootNavController because it is used to navigate between the auth screens and go to app graph.
// To create a new navcontroller we use the rememberNavController() function in the AppMainScreen.

fun NavGraphBuilder.appNavGraph(rootNavController: NavHostController) {
    navigation(
        route = AppGraphs.AppGraph.route,
        startDestination = AppScreens.AppMainScreen.route
    ) {
        composable(route = AppScreens.AppMainScreen.route) {
            AppMainScreen(
                rootNavController = rootNavController,
                appNavController = rememberNavController()
            )
        }
    }
}

@Composable
fun AppNavHost(rootNavController: NavHostController, appNavController: NavHostController) {
    NavHost(
        navController = appNavController,
        startDestination = AppScreens.AppHomeScreen.route
    ) {
        composable(route = AppScreens.AppHomeScreen.route) {
            HomeScreen(rootNavController = rootNavController, appNavController = appNavController)
        }
        composable(route = AppScreens.AppProfileScreen.route) {
            ProfileScreen(navController = appNavController)
        }
        composable(route = AppScreens.AppSettingsScreen.route) {
            SettingsScreen(navController = appNavController)
        }
    }
}