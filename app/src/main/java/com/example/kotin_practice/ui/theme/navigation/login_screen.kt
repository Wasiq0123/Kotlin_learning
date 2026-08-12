package com.example.kotin_practice.ui.theme.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
 fun LoginScreenExample(navController: NavHostController) {
     var email by remember { mutableStateOf("") }
    var pasword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Login Screen", fontWeight = FontWeight.Bold, fontSize = 32.sp)

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = {
                Text("email")
            },
            modifier = Modifier.fillMaxWidth(),
        )

        OutlinedTextField(
            value = pasword,
            onValueChange = {
                pasword=it
            },

            label = { Text("password") },
                    modifier = Modifier.fillMaxWidth(),

            )
        Spacer(modifier = Modifier.height(height = 10.dp))
        Button(
            onClick = {
              //  navController.navigate(MyNavRoutes.HomeScreen)
                navController.navigate(MyNavRoutes.Dashborad( email))

                // Login logic will come here
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = email.isNotEmpty() && pasword.isNotEmpty()
        ) {
            Text("Login")
        }
    }
}