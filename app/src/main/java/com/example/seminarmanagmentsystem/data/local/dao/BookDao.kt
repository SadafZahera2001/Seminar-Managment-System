package com.example.seminarmanagmentsystem.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.seminarmanagmentsystem.domain.model.Book

/**
 * Data Access Objects are the main classes where you define your database interactions.
 * They can include a variety of query methods.
 * The class marked with @Dao should either be an interface or an abstract class.
 * At compile time, Room will generate an implementation
 * of this class when it is referenced by a Database .
 * PagingSource: is the base class for asynchronous loading snapshot of data
 */
@Dao
interface BookDao {
    @Query("SELECT * FROM Books ORDER BY id ASC")
    fun getAllBooks(): PagingSource<Int, Book>

    @Query("SELECT * FROM Books WHERE id =:bookId")
    fun getSelectedBooks(bookId: Int): Book

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addBook(book: List<Book>)

    @Query("DELETE FROM books")
    suspend fun deleteBook()
}