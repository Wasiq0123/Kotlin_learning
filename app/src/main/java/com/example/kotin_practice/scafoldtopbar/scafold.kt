package com.example.kotin_practice.scafoldtopbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MyScaffoldExample() {

    Scaffold(

        // -------------------------
        // TOP APP BAR
        // -------------------------
        topBar = {

            TopAppBar(

                title = {
                    Text(
                        text = "My App"
                    )
                },
colors = TopAppBarDefaults.topAppBarColors(
    containerColor = Color.Blue,
    titleContentColor = Color.White,
    actionIconContentColor = Color.White
),
                actions = {

                    IconButton(
                        onClick = {
                            // Favorite clicked
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite"
                        )
                    }
                }
            )
        },

        // -------------------------
        // BOTTOM BAR
        // -------------------------
        bottomBar = {

            NavigationBar {

                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = {
                        Text("Home")
                    }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile"
                        )
                    },
                    label = {
                        Text("Profile")
                    }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Settings"
                        )
                    },
                    label = {
                        Text("Settings")
                    }
                )
            }
        },

        // -------------------------
        // FLOATING ACTION BUTTON
        // -------------------------
        floatingActionButton = {

            FloatingActionButton(
                onClick = {
                    // Add clicked
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }

    ) { innerPadding ->

        // -------------------------
        // SCREEN CONTENT
        // -------------------------

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Welcome to My App"
            )

            ElevatedButton(
                onClick = {
                    // Button clicked
                }
            ) {
                Text(
                    text = "Click Me"
                )
            }
        }
    }
}