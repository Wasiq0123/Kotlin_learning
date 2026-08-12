package com.example.kotin_practice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


// --------------------------------------------------
// Example 1: State directly inside the screen
// --------------------------------------------------

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateManagementExample() {

    var count by rememberSaveable {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = count.toString(),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Row {

            Button(
                onClick = {
                    count++
                }
            ) {
                Text("Increment")
            }

            Button(
                enabled = count > 0,
                onClick = {
                    count--
                }
            ) {
                Text("Decrement")
            }
        }
    }
}


// --------------------------------------------------
// Example 2: State Hoisting
// Parent owns the state
// --------------------------------------------------

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ParentHostingState() {

    var score by remember {
        mutableStateOf(0)
    }

    ChildHostingState(
        score = score,

        increment = {
            score++
        },

        decrement = {
            score--
        }
    )
}


// --------------------------------------------------
// Child receives state and events
// --------------------------------------------------

@Composable
fun ChildHostingState(
    score: Int,
    increment: () -> Unit,
    decrement: () -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = score.toString(),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Row {

            Button(
                onClick = {
                    increment()
                }
            ) {
                Text("Increment")
            }

            Button(
                enabled = score > 0,
                onClick = {
                    decrement()
                }
            ) {
                Text("Decrement")
            }
        }
    }
}