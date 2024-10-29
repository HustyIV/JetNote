package com.hutsy4.jetnote.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "notes")
data class Note(
    val title: String,
    val content: String,
    val createdDate: Long = System.currentTimeMillis(), //the timestamp
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
)
