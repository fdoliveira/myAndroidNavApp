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

fun NavGraphBuilder.appNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graphs.AppGraph.route,
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