package com.github.aaaaa.notebook.template;

import com.github.aaaaa.notebook.NoteData;

import java.util.List;

public class DefaultSrcNoteData implements SrcNoteData{

    private String filename;
    private String topic;
    private List<NoteData> noteList;

    public DefaultSrcNoteData(String filename, String topic, List<NoteData> noteList) {
        this.filename = filename;
        this.topic = topic;
        this.noteList = noteList;
    }

    @Override
    public String getFileName() {
        return filename;
    }

    @Override
    public List<NoteData> getNoteList() {
        return noteList;
    }

    @Override
    public String getTopic() {
        return topic;
    }
}
