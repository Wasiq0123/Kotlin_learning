package com.example.kotin_practice

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.kotin_practice.counter_app.CounterScreenExample
import com.example.kotin_practice.counter_app.CounterViewModel
import com.example.kotin_practice.intent_and_filters.SecondActivity
import com.example.kotin_practice.scafoldtopbar.MyScaffoldExample
import com.example.kotin_practice.snackbar_toast.ShowSnaclBarExample
import com.example.kotin_practice.snackbar_toast.ShowToasExample


class MainActivity : ComponentActivity() {
    private  val viewModel: CounterViewModel by  viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text("Main Activity")
                Spacer(modifier = Modifier.height(height = 10.dp))

                Button(
                    onClick = {
var  intent= Intent(
    this@MainActivity, SecondActivity ::class.java
)
                        startActivity(intent)

                    }
                ) {
                    Text(text = "Main to Second")
                }}   }
    }
}

