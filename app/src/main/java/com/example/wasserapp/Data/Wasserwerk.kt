package com.example.wasserapp.Data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Wasserwerk_tabel")
data class Wasserwerk(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "WasserwerkID")
    val WasserwerkID: Int = 0,

    @ColumnInfo(name = "Wasserwerk_Name")
    val WasserwerkName: String?,
)