package com.example.kotin_practice.snackbar_toast

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
 fun ShowToasExample() {
     //first we define the contxt
     var context= LocalContext.current

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                Toast.makeText(
                    context,
                   "This is the toast ",
                    Toast.LENGTH_SHORT
                ).show()
            }
        ) {
            Text(text = "Show Toast")
        }
    }
}

@Composable
 fun ShowSnaclBarExample() {
     //control Snackbarr
     val  snackbarHostState= remember{ SnackbarHostState()}
    //Corortins Show the Snacbar
    var scope= rememberCoroutineScope()

    Scaffold(
        snackbarHost = {
            SnackbarHost(
                hostState =snackbarHostState
            )
        }
    ) {innerpadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp).padding(innerpadding)

        ) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
scope.launch {
    snackbarHostState.showSnackbar(
        message = "This is the Snackbar ",
        duration = SnackbarDuration.Long,
        actionLabel = "UNDO"
    )
}
                }
            ) {
                Text(text = "Show Snackbar")
            }
        }
    }

}