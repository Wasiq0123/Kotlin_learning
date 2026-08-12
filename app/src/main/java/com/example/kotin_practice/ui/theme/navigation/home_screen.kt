package com.example.kotin_practice.ui.theme.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
 fun HomeClassExample(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Home Scren", fontSize = 32.sp)
        Button(
            onClick = {
                navController.navigate(MyNavRoutes.LoginScreen)
                // Login logic will come here
            },
            modifier = Modifier.fillMaxWidth(),
            //enabled = email.isNotEmpty() && pasword.isNotEmpty()
        ) {
            Text("Back to Login")
        }
    }
}