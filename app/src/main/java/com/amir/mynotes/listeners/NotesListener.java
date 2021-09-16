package com.amir.mynotes.listeners;

import com.amir.mynotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
