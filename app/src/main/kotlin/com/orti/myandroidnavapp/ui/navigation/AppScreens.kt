package com.orti.myandroidnavapp.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AppScreens(val route: String, val imageVector: ImageVector? = null, val label: String? = null) {
    data object AppMainScreen : AppScreens(
        route = "app_main")
    data object AppHomeScreen : AppScreens(
        route = "app_home",
        label = "Home",
        imageVector = Icons.Rounded.Home)
    data object AppProfileScreen : AppScreens(
        route = "app_profile",
        label = "Profile",
        imageVector = Icons.Rounded.Person)
    data object AppSettingsScreen : AppScreens(
        route = "app_settings",
        label = "Settings",
        imageVector = Icons.Rounded.Settings)
}