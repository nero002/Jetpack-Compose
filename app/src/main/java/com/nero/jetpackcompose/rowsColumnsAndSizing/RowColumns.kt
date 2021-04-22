package com.nero.jetpackcompose.rowsColumnsAndSizing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nero.jetpackcompose.rowsColumnsAndSizing.ui.theme.JetpackComposeTheme

class RowColumns : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize(0.5f)
                    .background(Color.Green)
                    .width(200.dp)
                    .fillMaxSize(0.7f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Hello")
                Text("World")

            }

//            Row(
//                modifier = Modifier
//                    .fillMaxSize(0.5f)
//                    .background(Color.Blue),
//                horizontalArrangement = Arrangement.SpaceEvenly,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(text = "Hello")
//                Text("Row")
//            }

        }
    }
}
