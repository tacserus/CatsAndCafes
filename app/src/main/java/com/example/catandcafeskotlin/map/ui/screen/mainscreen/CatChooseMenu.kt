package com.example.catandcafeskotlin.map.ui.screen.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catandcafeskotlin.map.ui.screen.auxiliarydetail.CatItem

@Composable
fun CatChooseMenu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(240, 230, 140))
    ) {
        Row(
            modifier = Modifier
                .padding(20.dp)
                .height(50.dp)
                .fillMaxWidth()
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .border(1.dp, Color.DarkGray, RoundedCornerShape(5.dp))
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                    tint = Color.Red
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(end = 50.dp)
                    .fillMaxSize()
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(150.dp)
                        .border(1.dp, Color.DarkGray, RoundedCornerShape(3.dp))
                ) {
                    Text(
                        text = "Кошатник",
                        fontSize = 20.sp
                    )
                }
            }
        }
        LazyColumn(

            contentPadding = PaddingValues(10.dp),
            modifier = Modifier
                .padding(start = 20.dp, bottom = 25.dp, top = 10.dp, end = 20.dp)
                .fillMaxSize()
                .border(2.dp, Color.DarkGray, RoundedCornerShape(10.dp))
        ) {
            items(1) { index ->
                CatItem(isLastItem = index == 30 - 1)
            }
        }

    }
}