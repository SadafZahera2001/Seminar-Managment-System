package com.example.seminarmanagmentsystem.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.seminarmanagmentsystem.util.Constants.BOOK_DATABASE_TABLE

@Entity(tableName = BOOK_DATABASE_TABLE)
data class Book(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val availabilityStatus: Boolean,
    val details: Int
)
