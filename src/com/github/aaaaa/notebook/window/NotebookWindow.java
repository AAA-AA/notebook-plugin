package com.github.aaaaa.notebook.window;

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

    public NotebookWindow(Project project, ToolWindow toolWindow) {
        btnCreateDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
