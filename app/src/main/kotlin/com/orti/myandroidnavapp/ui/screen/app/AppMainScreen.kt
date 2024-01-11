package com.orti.myandroidnavapp.ui.screen.app

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.orti.myandroidnavapp.ui.navigation.AppNavHost

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppMainScreen(rootNavController: NavHostController, appNavController: NavHostController) {

    Scaffold(
        topBar = { AppTopBar(navController = appNavController) },
        bottomBar = { AppBottomBar(navController = appNavController) },
        content = { AppNavHost(rootNavController = rootNavController, appNavController = appNavController) }
    )
}
