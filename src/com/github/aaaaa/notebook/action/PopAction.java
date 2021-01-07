package com.github.aaaaa.notebook.action;

import com.github.aaaaa.notebook.Global;
import com.github.aaaaa.notebook.dialog.AddNoteDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;

public class PopAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        SelectionModel model = editor.getSelectionModel();
        String text = model.getSelectedText();
        String filename = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getName();
        Global.SELECTED_TEXT = text;
        Global.FILE_NAME = filename;



        AddNoteDialog dialog = new AddNoteDialog();
        dialog.show();
    }
}
