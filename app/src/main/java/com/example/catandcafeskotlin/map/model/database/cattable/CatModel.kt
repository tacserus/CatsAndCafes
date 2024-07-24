package com.example.catandcafeskotlin.map.model.database.cattable

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CatModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val cafeId: Int? = null,
    val name: String,
    val cost: Int,
    val image: String
)