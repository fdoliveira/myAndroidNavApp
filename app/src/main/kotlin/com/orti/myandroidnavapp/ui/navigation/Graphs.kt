package com.orti.myandroidnavapp.ui.navigation

sealed class Graphs(val route: String) {

    data object RootGraph: Graphs("root_graph")
    data object AuthGraph: Graphs("auth_graph")
    data object AppGraph: Graphs("app_graph")

}