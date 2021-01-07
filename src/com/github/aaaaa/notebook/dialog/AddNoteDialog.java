package com.github.aaaaa.notebook.dialog;

import com.github.aaaaa.notebook.DataConvert;
import com.github.aaaaa.notebook.Global;
import com.github.aaaaa.notebook.NoteData;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.EditorTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class AddNoteDialog extends DialogWrapper {
    EditorTextField title;
    EditorTextField remark;

    public AddNoteDialog() {
        super(true);
        setTitle("添加笔记注释");
        init();
    }

    @Override
    protected @Nullable
    JComponent createCenterPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        title = new EditorTextField("笔记标题");
        remark = new EditorTextField("笔记内容");
        remark.setPreferredSize(new Dimension(200, 100));

        panel.add(title, BorderLayout.NORTH);
        panel.add(remark, BorderLayout.CENTER);
        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("添加笔记至列表");
        button.addActionListener(e -> {
            String t = this.title.getText();
            String m = this.remark.getText();
            String fileType = Global.FILE_NAME.substring(Global.FILE_NAME.lastIndexOf(".") + 1);
            NoteData noteData = new NoteData(t, m, Global.SELECTED_TEXT, Global.FILE_NAME, fileType);
            Global.NOTE_LIST.add(noteData);
            Global.DEFAULT_TABLE.addRow(DataConvert.convert(noteData));
        });
        panel.add(button);
        return panel;
    }
}
