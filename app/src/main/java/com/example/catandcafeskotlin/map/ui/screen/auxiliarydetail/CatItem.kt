package com.example.catandcafeskotlin.map.ui.screen.auxiliarydetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CatItem(
    isLastItem: Boolean
) {
    Card(
        colors = CardDefaults.cardColors(Color(210, 180, 140)),
        modifier = Modifier.padding(bottom = if (isLastItem) 0.dp else 10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp, end = 10.dp)
                    .weight(1f)
                    .fillMaxHeight()
                    .border(1.dp, Color.DarkGray, RoundedCornerShape(3.dp))
            ) {
                Text(
                    text = "Милая кошечка",
                    fontSize = 20.sp
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, end = 10.dp)
                    .width(40.dp)
                    .fillMaxHeight()
                    .border(1.dp, Color.DarkGray, RoundedCornerShape(3.dp))
            ) {
                Icon(
                    imageVector = Icons.Default.AccountBox,
                    contentDescription = "Cat"
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, end = 20.dp)
                    .width(40.dp)
                    .fillMaxHeight()
                    .border(1.dp, Color.DarkGray, RoundedCornerShape(3.dp))
            ) {
                Text(
                    text = "Cost",
                    fontSize = 15.sp
                )
            }
        }
    }
}