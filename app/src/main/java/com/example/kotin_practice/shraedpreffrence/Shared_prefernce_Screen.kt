package com.example.kotin_practice.shraedpreffrence

import android.content.Context
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
import androidx.core.content.edit

@Composable
fun SharedPrefExample(context: Context) {

    // Compose UI state
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var showData by remember {
        mutableStateOf("")
    }

    /*
     * SharedPreferences
     *
     * "Data" = name of our local storage file
     *
     * MODE_PRIVATE = only our application can access it
     */
    val sharedPreferences = context.getSharedPreferences(
        "Data",
        Context.MODE_PRIVATE
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "SharedPreferences",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        // Email
        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = {
                Text("Email")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        // Password
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text("Password")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        // ------------------------------------------------
        // SAVE DATA
        // ------------------------------------------------
        Button(
            modifier = Modifier.fillMaxWidth(),

            enabled = email.isNotEmpty() && password.isNotEmpty(),

            onClick = {

                sharedPreferences.edit {

                    putString(
                        "email",
                        email
                    )

                    putString(
                        "password",
                        password
                    )
                }

                showData = "Data Saved Successfully"
            }
        ) {
            Text("Save Data")
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        // ------------------------------------------------
        // READ DATA
        // ------------------------------------------------
        Button(
            modifier = Modifier.fillMaxWidth(),

            onClick = {

                val savedEmail = sharedPreferences.getString(
                    "email",
                    ""
                )

                val savedPassword = sharedPreferences.getString(
                    "password",
                    ""
                )

                showData =
                    "Email: $savedEmail\nPassword: $savedPassword"
            }
        ) {
            Text("Read Data")
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        // ------------------------------------------------
        // REMOVE DATA
        // ------------------------------------------------
        Button(
            modifier = Modifier.fillMaxWidth(),

            onClick = {

                sharedPreferences.edit {

                    remove("email")
                    remove("password")
                }

                showData = "Data Removed"
            }
        ) {
            Text("Remove Data")
        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = showData
        )
    }
}

/*Learned how to store and retrieve small local data using
Android SharedPreferences.

Implemented a practical login-style example using Jetpack Compose.

Features:
- Created a SharedPreferences storage named "Data".
- Saved email using putString().
- Saved password using putString().
- Read saved email using getString().
- Read saved password using getString().
- Removed individual values using remove().
- Practiced clear() for removing all stored values.
- Used Context.MODE_PRIVATE.
- Used SharedPreferences.edit {} for writing data.
- Connected Compose UI state with persistent local storage.
- Added input validation before saving data.

Important concepts learned:
- Difference between Compose state and persistent storage.
- remember { mutableStateOf() } manages UI state.
- SharedPreferences stores data beyond the current UI/session.
- Keys identify stored values.
- Default values are returned when a key does not exist.
- SharedPreferences is suitable for small/simple preference data.

Production use cases:
- Login/session flag
- Onboarding completion
- Theme preference
- App settings
- Small user preferences

Not suitable for:
- Large databases
- Thousands of records
- Complex relational data
- Sensitive data without appropriate security

Next practice:
- Store isLoggedIn as Boolean.
- Restore saved data when the app starts.
- Create a login-session flow.
- Compare SharedPreferences with modern DataStore. */