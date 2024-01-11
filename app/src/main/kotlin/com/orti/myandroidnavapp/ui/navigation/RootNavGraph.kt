package com.orti.myandroidnavapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

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