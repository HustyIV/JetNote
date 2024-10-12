package com.hutsy4.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Note::class],
    version = 1,
)
abstract class NotesDataBase: RoomDatabase() {

    abstract val dao: NotesDao
}
