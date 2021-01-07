package com.github.aaaaa.notebook;

public class DataConvert {
    public static String[] convert(NoteData noteData) {
        String[] row = new String[4];
        row[0] = noteData.getTitle();
        row[1] = noteData.getComment();
        row[2] = noteData.getFilename();
        row[3] = noteData.getContent();
        return row;
    }
}
