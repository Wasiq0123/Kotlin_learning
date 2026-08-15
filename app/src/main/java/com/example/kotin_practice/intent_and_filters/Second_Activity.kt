package com.example.kotin_practice.intent_and_filters

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import com.example.kotin_practice.MainActivity

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text("Intent Examples")

                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                // 1. Explicit Intent
                Button(
                    onClick = {

                        val intent = Intent(
                            this@SecondActivity,
                            MainActivity::class.java
                        )

                        startActivity(intent)
                    }
                ) {
                    Text("Open Main Activity")
                }


                // 2. Open Website
                Button(
                    onClick = {

                        val intent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://github.com/Wasiq0123")
                        )

                        startActivity(intent)
                    }
                ) {
                    Text("Open Website")
                }


                // 3. Share Text
                Button(
                    onClick = {

                        val intent = Intent(Intent.ACTION_SEND)

                        intent.type = "text/plain"

                        intent.putExtra(
                            Intent.EXTRA_TEXT,
                            "Hello, this is Kotlin Intent!"
                        )

                        startActivity(
                            Intent.createChooser(
                                intent,
                                "Share using"
                            )
                        )
                    }
                ) {
                    Text("Share Text")
                }


                // 4. Open Google Maps
                Button(
                    onClick = {

                        val intent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("geo:22.3193,114.1694?q=Hong+Kong")
                        )

                        startActivity(intent)
                    }
                ) {
                    Text("Open Google Maps")
                }


                // 5. Open Phone Dialer
                Button(
                    onClick = {

                        val intent = Intent(
                            Intent.ACTION_DIAL,
                            Uri.parse("tel:03001234567")
                        )

                        startActivity(intent)
                    }
                ) {
                    Text("Open Dialer")
                }
            }
        }
    }
}