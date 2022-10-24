package com.example.seminarmanagmentsystem.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.seminarmanagmentsystem.data.local.dao.BookDao
import com.example.seminarmanagmentsystem.domain.model.Book

@Database(entities = [Book::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class SmsDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}