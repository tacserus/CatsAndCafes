package com.example.catandcafeskotlin.map.ui.screen.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewCafeMenu(
    cafeCost: Int = 10
) {
    Column(
        modifier = Modifier
            .background(Color(240, 230, 140))
    ){
        Row(
            modifier = Modifier
                .height(360.dp)
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .border(2.dp, Color.DarkGray, RoundedCornerShape(5.dp))
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                    tint = Color.Red
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(start = 5.dp, end = 5.dp, top = 90.dp)
                    .background(Color.Yellow, shape = CircleShape)
                    .border(2.dp, Color.DarkGray, CircleShape)
            ) {
                Spacer(modifier = Modifier.size(50.dp))
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .border(2.dp, Color.DarkGray, RoundedCornerShape(5.dp))
            ) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Check",
                    tint = Color(0, 170, 0)
                )
            }
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 30.dp)
                .width(250.dp)
                .height(100.dp)
                .border(2.dp, Color.DarkGray, RoundedCornerShape(5.dp))
                .align(Alignment.CenterHorizontally)

        ) {
            Spacer(modifier = Modifier.size(50.dp))
        }
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            placeholder = {
                Text(text = "Name...")
            },
            modifier = Modifier
                .padding(20.dp)
                .width(250.dp)
                .height(100.dp)
                .border(2.dp, Color.DarkGray, RoundedCornerShape(5.dp))
                .align(Alignment.CenterHorizontally))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(bottom = 30.dp)
                .width(250.dp)
                .fillMaxHeight()
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Cost: ${ cafeCost }$",
                fontSize = 35.sp
        )}

    }
}