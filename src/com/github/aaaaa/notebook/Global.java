package com.github.aaaaa.notebook;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.List;

public class Global {
    public static String SELECTED_TEXT;

    public static String FILE_NAME;

    public static List<NoteData> NOTE_LIST = new LinkedList<>();

    public static String[] HEADERS = {"标题", "备注",  "代码段", "文件名"};

    public static DefaultTableModel DEFAULT_TABLE = new DefaultTableModel(null, HEADERS);

    public static void reset() {
        NOTE_LIST.clear();
        DEFAULT_TABLE.setDataVector(null, HEADERS);
    }
}
