package com.github.aaaaa.notebook.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class NotebookWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        NotebookWindow window = new NotebookWindow(project, toolWindow);
        ContentFactory factory = ContentFactory.SERVICE.getInstance();
        Content content = factory.createContent(window.getContentPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
