package com.example.catandcafeskotlin.map.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.catandcafeskotlin.map.model.database.cafetable.CafeModel
import com.example.catandcafeskotlin.map.model.database.cafetable.CafeModelDao
import com.example.catandcafeskotlin.map.model.database.cattable.CatModel
import com.example.catandcafeskotlin.map.model.database.cattable.CatModelDao

@Database(
    entities = [
    CatModel::class,
    CafeModel::class
    ],
    version = 1
)
abstract class MainDb : RoomDatabase() {
    abstract val catModelDao: CatModelDao
    abstract val cafeModelDao: CafeModelDao

    companion object {
        fun createDataBase(context: Context): MainDb {
            return Room.databaseBuilder(
                context,
                MainDb::class.java,
                "CatAndCafes"
            ).build()
        }
    }
}