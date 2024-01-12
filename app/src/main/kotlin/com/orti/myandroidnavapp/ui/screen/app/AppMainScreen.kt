package com.orti.myandroidnavapp.ui.screen.app

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.orti.myandroidnavapp.ui.navigation.AppNavHost

// This AppMainScreen composable is the main screen of the app graph.
// It is the parent of all the screens in the app graph.
// It has a top bar, bottom bar and a content with new navhost wich uses two navcontrollers.
// One to go back to the root graph and the other to navigate between the screens in the app graph.

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppMainScreen(rootNavController: NavHostController, appNavController: NavHostController) {
    Scaffold(
        topBar = { AppTopBar(navController = appNavController) },
        bottomBar = { AppBottomBar(navController = appNavController) },
        content = { AppNavHost(rootNavController = rootNavController, appNavController = appNavController) }
    )
}
