package com.orti.myandroidnavapp.ui.screen.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.orti.myandroidnavapp.ui.navigation.AppGraphs

@Composable
fun HomeScreen(rootNavController: NavController, appNavController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {rootNavController.navigate(AppGraphs.AuthGraph.route) {
                popUpTo(AppGraphs.AppGraph.route) {
                    inclusive = true
                }
            }}) {
            Text(text = "Logout", fontSize = 20.sp)
        }
    }
}