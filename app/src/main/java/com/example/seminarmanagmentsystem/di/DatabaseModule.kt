package com.example.seminarmanagmentsystem.di

import android.content.Context
import androidx.room.Room
import com.example.seminarmanagmentsystem.data.local.SmsDatabase
import com.example.seminarmanagmentsystem.util.Constants.SEMINAR_MANAGEMENT_SYSTEM_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * in our application we should have only one instance of ROOM Database
 * and that instance should be used across our application
 * to achieve that we uses dependency injection
 * and we create a @module in which we specify how we want to @provide our room database builder
 * and in our project we provide it as @singleton
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        SmsDatabase::class.java,
        SEMINAR_MANAGEMENT_SYSTEM_DATABASE
    ).build()
}