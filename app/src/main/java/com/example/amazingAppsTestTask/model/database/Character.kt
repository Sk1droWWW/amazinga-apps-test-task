package com.example.amazingAppsTestTask.model.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "character_table")
data class Character(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    var name: String,
    var height: String,
    var mass: String,
    var hairColor: String = "",
    var skinColor: String = "",
    var eyeColor: String = "",
    var birthYear: String = "",
    var gender: String,
    var films: Int,

)
