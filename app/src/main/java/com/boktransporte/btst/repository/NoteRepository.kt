package com.boktransporte.btst.repository

import com.boktransporte.btst.data.Note
import com.boktransporte.btst.data.NoteDao
import kotlinx.coroutines.flow.Flow

class NoteRepository(private val dao: NoteDao) {
    val notes: Flow<List<Note>> = dao.getAll()

    suspend fun add(note: Note) = dao.insert(note)
    suspend fun remove(note: Note) = dao.delete(note)
}
