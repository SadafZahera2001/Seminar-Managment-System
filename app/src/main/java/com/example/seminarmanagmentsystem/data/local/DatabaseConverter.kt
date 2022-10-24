package com.example.seminarmanagmentsystem.data.local

import androidx.room.TypeConverter

/**
 * this class will convert list of string fetched from api to convert it into
 * database understandable string
 * and convert it back to normal list of strings
 */
class DatabaseConverter {
    private val separator = ","
    @TypeConverter
    fun convertListToString(list: List<String>): String{
        val stringBuilder = java.lang.StringBuilder()
        for (item in list){
            stringBuilder.append(item).append(separator)
        }
        stringBuilder.setLength(stringBuilder.length-separator.length)
        return stringBuilder.toString()
    }
    @TypeConverter
    fun convertStringToList(string: String): List<String>{
        return string.split(separator)
    }
}