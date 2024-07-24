package com.example.catandcafeskotlin.map.model.database.cafetable

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CafeModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val lat: Float,
    val lon: Float,
    val image: String
)