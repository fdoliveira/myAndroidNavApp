package com.orti.myandroidnavapp.ui.screen.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(navController: NavController) {
    TopAppBar(
        title = {
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                Text(text = "Top App Bar", fontWeight = FontWeight.Bold)
            }

        },
        modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp)),
        navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu icon" )
            }

        },
        actions = {
            IconButton(onClick = {  }) {
                BadgedBox(badge = { Badge(
                    modifier = Modifier.size(10.dp)
                ) {
                }
                }) {
                    Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = "Fav icon" )
                }

            }
            IconButton(onClick = {  }) {
                Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = "ShoppingCart icon" )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color(0xFFE0A9A5)
        )
    )
}