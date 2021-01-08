package com.github.aaaaa.notebook.window;

import com.github.aaaaa.notebook.Global;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotebookWindow {
    private JTextField noteTitle;
    private JTable noteContentList;
    private JButton btnCreateDoc;
    private JButton btnClear;
    private JButton btnClose;
    private JPanel contentPanel;

    private void init() {
        noteContentList.setModel(Global.DEFAULT_TABLE);
        noteContentList.setEnabled(true);
    }


    public NotebookWindow(Project project, ToolWindow toolWindow) {
        init();
        btnCreateDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Global.reset();
            }
        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toolWindow.hide(null);
            }
        });
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
