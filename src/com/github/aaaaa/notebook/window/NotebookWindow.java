package com.github.aaaaa.notebook.window;

import com.github.aaaaa.notebook.Global;
import com.github.aaaaa.notebook.template.DefaultSrcNoteData;
import com.github.aaaaa.notebook.template.MdFreemarkerProcessor;
import com.github.aaaaa.notebook.template.TplProcessor;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageDialogBuilder;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
        btnCreateDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(noteTitle.getText());
                String topic = noteTitle.getText();
                String filename = topic+".md";
                if (topic == null || topic.trim().length() == 0) {
                    MessageDialogBuilder.yesNo("操作结束", "文档标题不存在");
                }
                VirtualFile virtualFile = FileChooser.chooseFile(FileChooserDescriptorFactory.createSingleFolderDescriptor(), project, project.getBaseDir());
                if (virtualFile != null) {
                    String path = virtualFile.getPath();
                    String fullPath = path + File.pathSeparator + filename;
                    TplProcessor processor = new MdFreemarkerProcessor();
                    try {
                        processor.process(new DefaultSrcNoteData(fullPath, topic, Global.NOTE_LIST));
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
