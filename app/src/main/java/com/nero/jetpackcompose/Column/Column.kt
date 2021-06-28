package com.nero.jetpackcompose.Column

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nero.jetpackcompose.R


class Column : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            LazyColumn(Modifier.fillMaxSize()) {
                item {
                    Image(
                        painter = painterResource(
                            id = R.drawable.happy_meal_small
                        ), "", modifier = Modifier.height(300.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Happy Meal",
                            style = TextStyle(
                                fontSize = 20.sp
                            )
                        )
                        Spacer(
                            modifier = Modifier
                                .padding(top = 10.dp)
                        )
                        Text(
                            text = "800 Calories",
                            style = TextStyle(fontSize = 20.sp)
                        )
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(
                            text = "$5.99",
                            style = TextStyle(color = Color(0xFF00F821)),
                            fontSize = 17.sp
                        )
                        Spacer(modifier = Modifier.padding(top = 10.dp))


                    }

                }

                items(1) { index ->


                }


            }

        }


    }

}
