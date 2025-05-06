package com.rwazi.libraries.note.domain.repository

import androidx.paging.PagingData
import com.rwazi.libraries.note.domain.model.Note
import com.rwazi.libraries.note.domain.usecase.GetNoteUseCase.SortOption
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun createNote(note: Note)
    suspend fun deleteNote(note: Note)
    suspend fun updateNote(note: Note)
    fun getFilteredNotes(
        query: String,
        sortOption: SortOption
    ): Flow<PagingData<Note>>
}
