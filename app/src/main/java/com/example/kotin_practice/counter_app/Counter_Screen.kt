package com.example.kotin_practice.counter_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
 fun CounterScreenExample(viewModel: CounterViewModel) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text("Counter :${viewModel.count}", fontWeight = FontWeight.Bold, fontSize = 34.sp)
        Spacer(modifier = Modifier.height(height = 10.dp))

        Button(
            onClick = {
                viewModel.increment()
            }
        ) {
            Text(text = "Increment")
        }
        Spacer(modifier = Modifier.height(height = 10.dp))

        Button(
            onClick = {
                viewModel.decrement()
            }
        ) {
            Text(text = "Decement")
        }
    }
}