package com.example.kotin_practice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.collections.mutableListOf

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AlertDialogueExample() {

    var showDialog by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                showDialog = true
            }
        ) {
            Text("Open Dialog")
        }

        if (showDialog) {

            AlertDialog(

                onDismissRequest = {
                    showDialog = false
                },

                title = {
                    Text("Delete Item")
                },

                text = {
                    Text("Are you sure you want to delete this item?")
                },

                confirmButton = {
                    Button(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text("Yes")
                    }
                },

                dismissButton = {
                    Button(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text("Cancel")
                    }
                }
            )
        }
    }
}