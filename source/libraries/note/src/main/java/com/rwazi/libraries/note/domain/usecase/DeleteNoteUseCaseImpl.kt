package com.rwazi.libraries.note.domain.usecase

import com.rwazi.libraries.note.domain.model.Note
import com.rwazi.libraries.note.domain.repository.NoteRepository

import javax.inject.Inject

interface DeleteNoteUseCase {
    suspend operator fun invoke(note: Note)
}

internal class DeleteNoteUseCaseImpl @Inject constructor(
    private val repository: NoteRepository,
) : DeleteNoteUseCase {
    override suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
