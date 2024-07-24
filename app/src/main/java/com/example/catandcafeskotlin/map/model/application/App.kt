package com.example.catandcafeskotlin.map.model.application

import android.app.Application
import com.example.catandcafeskotlin.map.model.database.MainDb

class App: Application() {
    val database by lazy { MainDb.createDataBase(this) }
}