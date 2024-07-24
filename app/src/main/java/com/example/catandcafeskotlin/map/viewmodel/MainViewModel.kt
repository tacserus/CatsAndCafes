package com.example.catandcafeskotlin.map.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.catandcafeskotlin.map.model.application.App
import com.example.catandcafeskotlin.map.model.database.cattable.CatModel
import com.example.catandcafeskotlin.map.model.database.MainDb
import kotlinx.coroutines.launch

class MainViewModel(val database: MainDb) : ViewModel() {
    val catModelList = database.catModelDao.getAllItems()
    val newText = mutableStateOf("")
    val cost = mutableIntStateOf(1)
    var catModel: CatModel? = null

    fun insertItem() = viewModelScope.launch {
        val nameItem = catModel?.copy(name = newText.value)
            ?: CatModel(
                name = newText.value,
                cost = cost.intValue,
                image = ""
            )

        database.catModelDao.insertItem(nameItem)
        catModel = null
        newText.value = ""
    }

    fun deleteItem(item: CatModel) = viewModelScope.launch {
        database.catModelDao.deleteItem(item)
    }
    // val cafeModelList = database.cafeModelDao.getAllItems()


    companion object {
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras): T {
                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).database
                return MainViewModel(database) as T
            }
        }
    }
}