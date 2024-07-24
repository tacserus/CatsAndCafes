package com.example.catandcafeskotlin.map.model.database.cafetable

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CafeModelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(nameEntity: CafeModel)
    @Delete
    suspend fun deleteItem(nameEntity: CafeModel)
    @Query("SELECT * FROM CafeModel")
    fun getAllItems(): Flow<List<CafeModel>>
}