package com.hutsy4.jetnote.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface NotesDao {

    // Insert a new note
    @Upsert
    suspend fun upsertNotes(note: Note): Long

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM notes ORDER BY createdDate DESC")
    suspend fun getNotes(): Flow<List<Note>>

}