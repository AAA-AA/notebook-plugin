package com.github.aaaaa.notebook;

public class NoteData {
    private String title;
    private String comment;
    private String content;
    private String filename;
    private String fileType;

    public NoteData() {
    }

    public NoteData(String title, String comment, String content, String filename, String fileType) {
        this.title = title;
        this.comment = comment;
        this.content = content;
        this.filename = filename;
        this.fileType = fileType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "NoteData{" +
                "title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                ", content='" + content + '\'' +
                ", filename='" + filename + '\'' +
                ", fileType='" + fileType + '\'' +
                '}';
    }
}
