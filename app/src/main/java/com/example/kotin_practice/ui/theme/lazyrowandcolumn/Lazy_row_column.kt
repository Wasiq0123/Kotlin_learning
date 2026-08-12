package com.example.kotin_practice.ui.theme.lazyrowandcolumn

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun LazyCoulmnExamle () {

    LazyColumn {
        items(10) {
            Text("Customer $it")
        }
    }
}
//Show the customer 1 to 10

@Composable
fun CustomerlistExample(){

    LazyColumn() {
        items(10) { index ->
            Text(text = "Customer:${index +1}")
        }
    }
}
//Show the data in and ftech in list 

@Composable
 fun FetchListExample() {
    val customers = listOf(
        "Ali",
        "Ahmed",
        "Usman",
        "Bilal",
        "Wasiq",
        "Ali",
        "Ahmed",
        "Usman",
        "Bilal",
        "Wasiq","Ali",
        "Ahmed",
        "Usman",
        "Bilal",
        "Wasiq"
    )
    LazyColumn() {
items(customers){customers->
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ) {

        Text(
            text = customers,
            modifier = Modifier.padding(16.dp)
        )

    }

}
    }
}

//In this Example we learn the Lazy row
@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun LazyRowexample() {
    LazyRow() {
        items(listOf("Mobiles",
            "Laptops",
            "Shoes",
            "Watches")){items->
            Card(
                modifier = Modifier.padding(8.dp)
            ) {

                Text(
                    text = items,
                    modifier = Modifier.padding(16.dp)
                )

            }

        LazyColumn {

            items(20) { index ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {

                    Text(
                        text = "Product $index",
                        modifier = Modifier.padding(16.dp)
                    )

                }}}}}}
