package com.example.catandcafeskotlin.map.ui.screen.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catandcafeskotlin.map.ui.screen.auxiliarydetail.ListItem

@Composable
fun CafeEditMenu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(240, 230, 140))
    ){
        Row(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .padding(20.dp)
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
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(top = 30.dp, start = 10.dp, end = 10.dp)
                    .background(Color.Yellow, shape = CircleShape)
                    .border(1.dp, Color.DarkGray, CircleShape)
            ) {
                Spacer(modifier = Modifier.size(50.dp))
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .border(1.dp, Color.DarkGray, RoundedCornerShape(5.dp))
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
                .padding(top = 10.dp)
                .width(250.dp)
                .height(50.dp)
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
                .height(50.dp)
                .border(2.dp, Color.DarkGray, RoundedCornerShape(5.dp))
                .align(Alignment.CenterHorizontally))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.height(50.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .width(40.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.DarkGray, CircleShape)
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            tint = Color(139, 69, 19)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Приютить",
                    fontSize = 20.sp
                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .padding(bottom = 20.dp, top = 20.dp, start = 20.dp, end = 20.dp)
                .fillMaxSize()
                .border(2.dp, Color.DarkGray, RoundedCornerShape(10.dp))
        ) {
            items(0) {

            }
        }
    }
}