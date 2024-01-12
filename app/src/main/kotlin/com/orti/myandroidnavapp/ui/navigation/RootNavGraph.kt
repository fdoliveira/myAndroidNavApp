package com.orti.myandroidnavapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

// In this app we have to navigation graphs: AuthGraph and AppGraph.
// AuthGraph is the first graph that is shown to the user. It contains the login, register and forgot screens.
// AppGraph is the main graph of the app. It contains the home, profile and settings screens.
// From app ww can create another graph for each feature of the app if needed.

@Composable
fun RootNavGraph(rootNavController: NavHostController = rememberNavController()) {
    NavHost(
        route = Graphs.RootGraph.route,
        navController = rootNavController,
        startDestination = Graphs.AuthGraph.route
    ) {
        authNavGraph(navController = rootNavController)
        appNavGraph(rootNavController = rootNavController)
    }
}