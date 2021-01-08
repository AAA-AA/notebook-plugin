package com.github.aaaaa.notebook.template;

import freemarker.template.Template;

import java.io.IOException;
import java.io.Writer;

public abstract class AbstractFreemarkerTplProcessor implements TplProcessor {


    protected abstract Object getModel(SrcNoteData noteData);

    protected abstract Template getTemplate() throws IOException;

    protected abstract Writer getWriter(SrcNoteData noteData) throws Exception;

    @Override
    public final void process(SrcNoteData noteData) throws Exception {
        Template template = getTemplate();
        Object model = getModel(noteData);
        template.process(model, getWriter(noteData));
    }
}
