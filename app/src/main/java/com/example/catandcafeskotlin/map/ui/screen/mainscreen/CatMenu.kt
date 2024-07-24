package com.example.catandcafeskotlin.map.ui.screen.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.catandcafeskotlin.map.ui.screen.auxiliarydetail.ListItem
import com.example.catandcafeskotlin.map.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatMenu(
    mainViewModel:  MainViewModel = viewModel(factory = MainViewModel.factory)
) {
    val itemsList = mainViewModel.catModelList.collectAsState(initial = emptyList())
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .padding(5.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                TextField(
                    value = mainViewModel.newText.value,
                    onValueChange = {
                        mainViewModel.newText.value = it
                    },
                    label = {
                        Text(text = "Name...")
                    },
                    modifier = Modifier.weight(1f))
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .border(
                            width = 1.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(8.dp)
                        )
                ) {
                    Text(
                        text = mainViewModel.cost.value.toString(),
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.wrapContentSize(Alignment.Center)
                    )
                }
                IconButton(
                    onClick = {
                        mainViewModel.insertItem()
                    }) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add")
                }
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(itemsList.value) { item ->
                ListItem(
                    item, {
                        mainViewModel.catModel = it
                        mainViewModel.newText.value = it.name
                    }, {
                        mainViewModel.deleteItem(it)
                    }
                )
            }
        }
    }
}