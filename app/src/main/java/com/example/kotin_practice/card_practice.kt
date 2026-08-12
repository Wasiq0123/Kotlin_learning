package com.example.kotin_practice

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Composable
// fun CardExample() {
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        Card(
//            modifier = Modifier.fillMaxWidth(),
//
//            colors = CardDefaults.cardColors(
//                containerColor = Color.White
//            )
//        ) {
//
//            Row(
//                modifier = Modifier.padding(16.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//
//                // Profile Circle
//                Box(
//                    modifier = Modifier
//                        .size(50.dp)
//                        .background(
//                            color = Color.LightGray,
//                            shape = CircleShape
//                        )
//                        .border(
//                            width = 2.dp,
//                            color = Color.Blue,
//                            shape = CircleShape
//                        ),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Text(
//                        text = "W",
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//
//                Spacer(
//                    modifier = Modifier.width(16.dp)
//                )
//
//                // User Information
//                Column {
//
//                    Text(
//                        text = "Wasiq Khan",
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//
//                    Text(
//                        text = "Software Engineer",
//                        fontSize = 14.sp,
//                        color = Color.DarkGray
//                    )
//                }
//            }
//        }
//    }
//}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardExampleTwo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = CircleShape)
        )
        {

            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(color = Color.LightGray, shape = CircleShape),
                    contentAlignment = Alignment.Center


                )

                {
                    Text("W", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(
                    modifier = Modifier.width(16.dp)
                )
//
                Column(

                ) {
                    Text("Wasiq Khan", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    Text("Software Engeenier", fontSize = 16.sp, fontWeight = FontWeight.Normal)


                }
            }
        }

        //card 2
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        HorizontalDivider(
            color = Color.White,

        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = CircleShape)
        )
        {

            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(color = Color.LightGray, shape = CircleShape),
                    contentAlignment = Alignment.Center


                )

                {
                    Text("W", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(
                    modifier = Modifier.width(16.dp)
                )
//
                Column(

                ) {
                    Text("Mr jhon ", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    Text("Software Engeenier", fontSize = 16.sp, fontWeight = FontWeight.Normal)


                }
            }
        }

    }
}