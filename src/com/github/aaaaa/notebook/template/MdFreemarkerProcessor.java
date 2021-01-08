package com.github.aaaaa.notebook.template;

import com.intellij.ide.fileTemplates.impl.UrlUtil;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MdFreemarkerProcessor extends AbstractFreemarkerTplProcessor {
    @Override
    protected Object getModel(SrcNoteData noteData) {
        Map model = new HashMap();
        model.put("topic", noteData.getTopic());
        model.put("noteList", noteData.getNoteList());
        return model;
    }

    @Override
    protected Template getTemplate() throws IOException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);

        String tplContent = UrlUtil.loadText(MdFreemarkerProcessor.class.getResource("/tpl/md.ftl"));
        StringTemplateLoader strTpl = new StringTemplateLoader();
        strTpl.putTemplate("mdTemplate", tplContent);
        configuration.setTemplateLoader(strTpl);
        return configuration.getTemplate("mdTemplate");
    }

    @Override
    protected Writer getWriter(SrcNoteData noteData) throws Exception {

        File file = new File(noteData.getFileName());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));

        return writer;
    }
}
