package com.orti.myandroidnavapp.ui.navigation

sealed class AppGraphs(val route: String) {
    data object RootGraph: AppGraphs("root_graph")
    data object AuthGraph: AppGraphs("auth_graph")
    data object AppGraph: AppGraphs("app_graph")
}