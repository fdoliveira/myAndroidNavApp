package com.orti.myandroidnavapp.ui.screen.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.orti.myandroidnavapp.ui.navigation.AuthScreens

@Composable
fun ForgotScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Forgot Password Screen", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = {
                navController.navigate(AuthScreens.AuthLoginScreen.route) {
                }}) {
            Text(text = "Back to Login", fontSize = 20.sp)
        }
    }
}