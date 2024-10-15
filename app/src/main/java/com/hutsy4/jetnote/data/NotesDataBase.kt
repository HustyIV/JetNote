package com.hutsy4.jetnote.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NotesDataBase: RoomDatabase() {

    abstract fun NotesDao(): NotesDao

    companion object {
        @Volatile
        private var INSTANCE: NotesDataBase? = null

        fun getDatabase(context: Context): NotesDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NotesDataBase::class.java,
                    "note_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}