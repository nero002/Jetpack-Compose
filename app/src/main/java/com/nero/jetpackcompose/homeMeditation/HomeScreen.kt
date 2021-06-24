package com.nero.jetpackcompose.homeMeditation

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.android.material.chip.Chip
import com.nero.jetpackcompose.R
import com.nero.jetpackcompose.homeMeditation.theme.*


@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depression"))
        }
    }
}

@Composable
fun GreetingSection(name: String = "Dheeraj") {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {

            Text(text = "Good Morning, $name", style = MaterialTheme.typography.h2)
            Text(text = "We you have a good day!", style = MaterialTheme.typography.body1)

        }
    }
    Icon(
        painter = painterResource(id = R.drawable.ic_search),
        contentDescription = "Search",
        tint = Color.White,
        modifier = Modifier.size(24.dp)
    )
}

@Composable
fun ChipSection(chips: List<String>) {
    var selectedChipsIndex by remember {
        mutableStateOf(0)
    }

    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable { selectedChipsIndex = it }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipsIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)

            ) {
                Text(text = chips[it], color = TextWhite)
            }

        }
    }
}


@Composable
fun CurrentMeditation(
    color: Color = LightRed
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Daily Thought",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "Meditation * 3-10 min",
                style = MaterialTheme.typography.body1, color = TextWhite
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                .clickable { selectedChipsIndex = it }
                .clip(RoundedCornerShape(10.dp))
                .background(
                    if (selectedChipsIndex == it) ButtonBlue
                    else DarkerButtonBlue
                )
                .padding(15.dp)

        )

    }
}