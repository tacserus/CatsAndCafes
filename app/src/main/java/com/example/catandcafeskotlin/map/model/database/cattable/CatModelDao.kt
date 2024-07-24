package com.example.catandcafeskotlin.map.model.database.cattable

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CatModelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(nameEntity: CatModel)
    @Delete
    suspend fun deleteItem(nameEntity: CatModel)
    @Query("SELECT * " +
            "FROM CatModel " +
            "ORDER BY cost")
    fun getAllItems(): Flow<List<CatModel>>
}

