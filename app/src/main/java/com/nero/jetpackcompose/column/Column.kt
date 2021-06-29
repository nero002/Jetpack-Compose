package com.nero.jetpackcompose.column

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
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
            //we can also use Colummn for static
            LazyColumn(Modifier.fillMaxSize()) {
                item {
                    Image(
                        painter = painterResource(id = R.drawable.happy_meal_small),
                        contentDescription = ""
                    )
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Happy Meal",
                                style = TextStyle(
                                    fontSize = 20.sp
                                )

                            )
                            Text(
                                text = "$5.99",
                                style = TextStyle(color = Color(0xFF00F821)),
                                fontSize = 17.sp,
                                modifier = Modifier.align(Alignment.CenterVertically)
                            )
                        }
                        Spacer(
                            modifier = Modifier
                                .padding(top = 10.dp)
                        )
                        Text(
                            text = "800 Calories",
                            style = TextStyle(fontSize = 20.sp)
                        )
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        ) {
                            Text(text = "order Now")
                        }
                        Spacer(modifier = Modifier.padding(top = 10.dp))


                    }

                }

                items(1) { index ->


                }


            }

        }


//COLUMN EXAMPLE
//        setContent {
//            Column {
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(200.dp)
//                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Text(text = "Item1", modifier = Modifier.align(Alignment.CenterHorizontally))
//                    Text(text = "Item2", modifier = Modifier.align(Alignment.CenterHorizontally))
//                }
//                Row(
//                    modifier = Modifier
//                        .width(200.dp)
//                        .height(200.dp)
//                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//                    horizontalArrangement = Arrangement.Center
//                ) {
//                    Text(text = "Item2", modifier = Modifier.align(Alignment.CenterVertically))
//                }
//            }
//        }




    }

}
